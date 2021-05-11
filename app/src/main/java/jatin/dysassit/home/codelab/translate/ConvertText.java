package jatin.dysassit.home.codelab.translate;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.mlkit.codelab.translate.R;

public class ConvertText extends AppCompatActivity {
    EditText pastet ;
    Button bold;
    Button itallic;
    Button regular;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.font_change_activity);
        pastet = findViewById(R.id.pasteText);
        bold = findViewById(R.id.boldbtn);
        itallic = findViewById(R.id.itbtn);
        regular = findViewById(R.id.regbtn);
     bold.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Typeface tf = Typeface.createFromAsset(getApplicationContext().getAssets(),"fonts/bold.otf");
             pastet.setTypeface(tf);// making text bold
         }
     });


     itallic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Typeface tf = Typeface.createFromAsset(getApplicationContext().getAssets(),"fonts/italic.otf");
                pastet.setTypeface(tf);// making text italic
            }
     });
     regular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Typeface tf = Typeface.createFromAsset(getApplicationContext().getAssets(),"fonts/regular.otf");
                pastet.setTypeface(tf);// making text open Dyslexic
            }
     });

    }

}
