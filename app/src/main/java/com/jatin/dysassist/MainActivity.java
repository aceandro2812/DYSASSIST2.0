package com.jatin.dysassist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {
Button speechbtn1,imagebtn1,textbtn1;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        speechbtn1=(Button)findViewById(R.id.speechbtn);
        imagebtn1=(Button)findViewById(R.id.imagebtn);
        speechbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SpeechActivity.class);
                // start the activity connect to the specified class
                startActivity(intent);
            }
        });
//        imagebtn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this,ocrActivity.class );
//                // start the activity connect to the specified class
//                startActivity(intent);
//            }
//        });

    }

}
