package jatin.dysassit.home.codelab.translate

import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.mlkit.codelab.translate.R
import kotlinx.android.synthetic.main.font_change_activity.*
import kotlinx.android.synthetic.main.landing_activity.*

class ConvertText : AppCompatActivity() {
//    private var pastet: EditText? = null
//    private var bold: Button? = null
//    private var itallic: Button? = null
//    private var regular: Button? = null
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.font_change_activity)
//        pastet = findViewById(R.id.pasteText)
//        bold = findViewById(R.id.boldbtn)
//        itallic = findViewById(R.id.itbtn)
//        regular = findViewById(R.id.regbtn)
        boldbtn.setOnClickListener(View.OnClickListener {
            val tf = Typeface.createFromAsset(applicationContext.assets, "fonts/bold.otf")
            pasteText.typeface = tf // making text bold
        })
        itbtn.setOnClickListener(View.OnClickListener {
            val tf = Typeface.createFromAsset(applicationContext.assets, "fonts/italic.otf")
            pasteText.typeface = tf // making text italic
        })
        regbtn.setOnClickListener(View.OnClickListener {
            val tf = Typeface.createFromAsset(applicationContext.assets, "fonts/regular.otf")
            pasteText.typeface = tf // making text open Dyslexic
        })
    }
}