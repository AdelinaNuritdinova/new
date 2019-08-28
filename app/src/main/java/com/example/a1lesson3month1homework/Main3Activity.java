package com.example.a1lesson3month1homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    TextView textResult;
    Button button;
    int number;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        textResult =findViewById(R.id.result);
        button = findViewById(R.id.shareBtn);

        Intent intent = getIntent();

        number = intent.getIntExtra("key3",0);

        String num = String.valueOf(number);

        textResult.setText(num);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String kkl =textResult.getText().toString();
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, kkl);
                sendIntent.setType("text/plain");
                startActivity(sendIntent);
            }
        });

    }
}