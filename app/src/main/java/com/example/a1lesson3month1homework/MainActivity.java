package com.example.a1lesson3month1homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    EditText numberFieldOne;
    EditText numberFieldTwo;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberFieldOne = findViewById(R.id.textNumberOne);
        numberFieldTwo = findViewById(R.id.textNumberTwo);
        button = findViewById(R.id.next);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                String num = numberFieldOne.getText().toString();
                intent.putExtra("key", num);
                String num2 = numberFieldTwo.getText().toString();
                intent.putExtra("key1", num2);
                startActivity(intent);

            }
        });
    }
}



