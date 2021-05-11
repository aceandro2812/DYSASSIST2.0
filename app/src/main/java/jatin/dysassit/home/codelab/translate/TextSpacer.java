package jatin.dysassit.home.codelab.translate;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.mlkit.codelab.translate.R;

public class TextSpacer extends AppCompatActivity {
    TextView txt0;
    TextView txt1;
    TextView txt2;
    TextView txt3;
    TextView txt4;
    TextView txt5;
    TextView txt6;
    TextView txt7;
    TextView txt8;
    TextView txt9;
    TextView txt10;
    TextView txt11;
    TextView txt12;
    TextView txt13;
    TextView txt14;
    EditText editText;
    Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spacer_activity);
        editText= findViewById(R.id.ET);
        buttonSubmit=findViewById(R.id.submitButton);
        txt0 = findViewById(R.id.t0);
        txt1 = findViewById(R.id.t1);
        txt2 = findViewById(R.id.t2);
        txt3 = findViewById(R.id.t3);
        txt4 = findViewById(R.id.t4);
        txt5 = findViewById(R.id.t5);
        txt6 = findViewById(R.id.t6);
        txt7 = findViewById(R.id.t7);
        txt8 = findViewById(R.id.t8);
        txt9 = findViewById(R.id.t9);
        txt10 = findViewById(R.id.t10);
        txt11 = findViewById(R.id.t11);
        txt12 = findViewById(R.id.t12);
        txt13 = findViewById(R.id.t13);
        txt14 = findViewById(R.id.t14);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data=editText.getText().toString();
                String[] spacing = data.split("");
                try {


                    txt0.setText(spacing[1]);
                    txt1.setText(spacing[2]);
                    txt2.setText(spacing[3]);
                    txt3.setText(spacing[4]);
                    txt4.setText(spacing[5]);
                    txt5.setText(spacing[6]);
                    txt6.setText(spacing[7]);
                    txt7.setText(spacing[8]);
                    txt8.setText(spacing[9]);
                    txt9.setText(spacing[10]);
                    txt10.setText(spacing[11]);
                    txt11.setText(spacing[12]);
                    txt12.setText(spacing[13]);
                    txt13.setText(spacing[14]);
                    txt14.setText(spacing[15]);
                }catch (ArrayIndexOutOfBoundsException ignore){}
            }
        });
    }

}