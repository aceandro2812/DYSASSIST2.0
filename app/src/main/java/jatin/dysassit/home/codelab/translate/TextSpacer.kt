package jatin.dysassit.home.codelab.translate

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.mlkit.codelab.translate.R
import kotlinx.android.synthetic.main.spacer_activity.*

class TextSpacer : AppCompatActivity() {
//    var txt0: TextView? = null
//    var txt1: TextView? = null
//    var txt2: TextView? = null
//    var txt3: TextView? = null
//    var txt4: TextView? = null
//    var txt5: TextView? = null
//    var txt6: TextView? = null
//    var txt7: TextView? = null
//    var txt8: TextView? = null
//    var txt9: TextView? = null
//    var txt10: TextView? = null
//    var txt11: TextView? = null
//    var txt12: TextView? = null
//    var txt13: TextView? = null
//    var txt14: TextView? = null
//    var editText: EditText? = null
//    var buttonSubmit: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.spacer_activity)
//        editText = findViewById(R.id.ET)
//        buttonSubmit = findViewById(R.id.submitButton)
//        txt0 = findViewById(R.id.t0)
//        txt1 = findViewById(R.id.t1)
//        txt2 = findViewById(R.id.t2)
//        txt3 = findViewById(R.id.t3)
//        txt4 = findViewById(R.id.t4)
//        txt5 = findViewById(R.id.t5)
//        txt6 = findViewById(R.id.t6)
//        txt7 = findViewById(R.id.t7)
//        txt8 = findViewById(R.id.t8)
//        txt9 = findViewById(R.id.t9)
//        txt10 = findViewById(R.id.t10)
//        txt11 = findViewById(R.id.t11)
//        txt12 = findViewById(R.id.t12)
//        txt13 = findViewById(R.id.t13)
//        txt14 = findViewById(R.id.t14)
        submitButton.setOnClickListener(View.OnClickListener {
            val data = ET.text.toString()
            val spacing = data.split("").toTypedArray()
            try {
                t0.text = spacing[1]
                t1.text = spacing[2]
                t2.text = spacing[3]
                t3.text = spacing[4]
                t4.text = spacing[5]
                t5.text = spacing[6]
                t6.text = spacing[7]
                t7.text = spacing[8]
                t8.text = spacing[9]
                t9.text = spacing[10]
                t10.text = spacing[11]
                t11.text = spacing[12]
                t12.text = spacing[13]
                t13.text = spacing[14]
                t14.text = spacing[15]
            } catch (ignore: ArrayIndexOutOfBoundsException) {
            }
        })
    }
}