package jatin.dysassit.home.codelab.translate;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.mlkit.codelab.translate.R;

public class LandingPage extends AppCompatActivity {
    Button speechbtn1;
    Button imagebtn1;
    Button txtbtn1;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.landing_activity);
        speechbtn1=(Button)findViewById(R.id.speechbtn);
        imagebtn1 = (Button)findViewById(R.id.imagebtn);
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

    }
}