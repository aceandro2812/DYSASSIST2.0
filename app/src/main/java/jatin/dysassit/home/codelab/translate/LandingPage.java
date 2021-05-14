package jatin.dysassit.home.codelab.translate;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.mlkit.codelab.translate.R;

public class LandingPage extends AppCompatActivity {
    Button speechbtn1;
    Button imagebtn1;
    Button txtbtn1;
    Button spcbtn1;
    Typeface tf;





    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.landing_activity);
        tf = Typeface.createFromAsset(getApplicationContext().getAssets(), "fonts/regular.otf");
        speechbtn1= findViewById(R.id.speechbtn);
        imagebtn1 = findViewById(R.id.imagebtn);
        txtbtn1 = findViewById(R.id.convertbtn);
        spcbtn1 = findViewById(R.id.spacerbtn);
        speechbtn1.setOnClickListener(v -> {
            Intent intent = new Intent(LandingPage.this,SpeechActivity.class);
            // start the activity connect to the specified class
            startActivity(intent);
        });
        imagebtn1.setOnClickListener(v -> {
            Intent intent = new Intent(LandingPage.this,MainActivity.class);
            // start the activity connect to the specified class
            startActivity(intent);
        });
        txtbtn1.setOnClickListener(v -> {
            Intent intent = new Intent(LandingPage.this,ConvertText.class);
            // start the activity connect to the specified class
            startActivity(intent);
        });
        spcbtn1.setOnClickListener(v -> {
            Intent intent = new Intent(LandingPage.this,TextSpacer.class);
            // start the activity connect to the specified class
            startActivity(intent);
        });
    }
}