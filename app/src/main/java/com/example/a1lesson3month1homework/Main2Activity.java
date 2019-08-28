package com.example.a1lesson3month1homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

        TextView textViewOne, textViewTwo;
        Button button;
        int sum;

    int num1;
    int num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textViewOne  = findViewById(R.id.textNum1);
        textViewTwo  = findViewById(R.id.textNum2);
        button=findViewById(R.id.next);

        Intent intent = getIntent();

        String name1 = intent.getStringExtra("key");
        String name2 = intent.getStringExtra("key1");

        num1=Integer.parseInt(name1);
        num2 =Integer.parseInt(name2);

        textViewOne.setText(name1);
        textViewTwo.setText(name2);

    }

    public void onClick(View view) {

        switch (view.getId()){
            case R.id.plus:
                sum = num1+num2;
                Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
                intent.putExtra("key3", sum);
                startActivity(intent);
                break;
            case R.id.minus:
                sum = num1-num2;
                Intent intent2 = new Intent(Main2Activity.this, Main3Activity.class);
                intent2.putExtra("key3", sum);
                startActivity(intent2);
                break;
            case R.id.umnog:
                sum = num1*num2;
                Intent intent3 = new Intent(Main2Activity.this, Main3Activity.class);
                intent3.putExtra("key3", sum);
                startActivity(intent3);
                break;
            case R.id.delenie:
                sum = num1/num2;
                Intent intent4 = new Intent(Main2Activity.this, Main3Activity.class);
                intent4.putExtra("key3", sum);
                startActivity(intent4);
                break;
        }
    }
}

