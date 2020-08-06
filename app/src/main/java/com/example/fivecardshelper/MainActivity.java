package com.example.fivecardshelper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public EditText ED1, ED2, ED3, ED4;
    public int s1, s2, s3, s4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ED1 = (EditText)findViewById(R.id.ed1);
        ED2 = (EditText) findViewById(R.id.ed2);
        ED3 = (EditText) findViewById(R.id.ed3);
        ED4 = (EditText) findViewById(R.id.ed4);


    }

    public void disper1(View view) {
        s1 += Integer.parseInt(ED1.getText().toString());
        TextView scoreView1 = (TextView) findViewById(R.id.score1);
        scoreView1.setText(String.valueOf(s1));
        ED1.setText("");
    }


    public void disper2(View view) {
        s2 += Integer.parseInt(ED2.getText().toString());
        TextView scoreView2 = (TextView) findViewById(R.id.score2);
        scoreView2.setText(String.valueOf(s2));
        ED2.setText("");

    }

    public void disper3(View view) {
        s3 += Integer.parseInt(ED3.getText().toString());
        TextView scoreView3 = (TextView) findViewById(R.id.score3);
        scoreView3.setText(String.valueOf(s3));
        ED3.setText("");

    }

    public void disper4(View view) {
        s4 += Integer.parseInt(ED4.getText().toString());
        TextView scoreView4 = (TextView) findViewById(R.id.score4);
        scoreView4.setText(String.valueOf(s4));
        ED4.setText("");

    }
}
