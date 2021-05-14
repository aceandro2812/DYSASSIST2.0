package jatin.dysassit.home.codelab.translate

import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageButton
import android.widget.TextView
import android.os.Bundle
import com.google.mlkit.codelab.translate.R
import android.content.Intent
import android.speech.RecognizerIntent
import jatin.dysassit.home.codelab.translate.SpeechActivity
import android.widget.Toast
import android.app.Activity
import android.view.View
import android.view.Window
import android.view.WindowManager
import java.lang.Exception
import java.util.*

class SpeechActivity : AppCompatActivity() {
    //declaring views
    var voice: ImageButton? = null
    var t1: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.speech_activity)
        voice = findViewById<View>(R.id.ib1) as ImageButton
        t1 = findViewById<View>(R.id.tv1) as TextView
        voice!!.setOnClickListener { speak() }
    }

    private fun speak() {
        //intent to show the text dialog
        val intent = Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH)
        intent.putExtra(
            RecognizerIntent.EXTRA_LANGUAGE_MODEL,
            RecognizerIntent.LANGUAGE_MODEL_FREE_FORM
        )
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, Locale.getDefault())
        intent.putExtra(RecognizerIntent.EXTRA_PROMPT, "hey there speak something")


        //start the intent
        try {
            // if there was no error then show the dialog
            startActivityForResult(intent, REQUEST_CODE_SPEECH_INPUT)
        } catch (e: Exception) {
            //If there is some error then toast the exception
            Toast.makeText(this, "" + e, Toast.LENGTH_SHORT).show()
        }
    }

    //RECIEVE VOICE INPUT AND HANDLE IT
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (requestCode) {
            REQUEST_CODE_SPEECH_INPUT -> {
                if (resultCode == RESULT_OK && null != data) {
                    //get text array from voice intent
                    val result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS)
                    //set to text view
                    t1!!.text = result[0]
                }
            }
        }
    }

    companion object {
        private const val REQUEST_CODE_SPEECH_INPUT = 1000
    }
}