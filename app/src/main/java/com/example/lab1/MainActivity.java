package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void changeText(View view){
        TextView text = findViewById(R.id.textView);
        text.setText("Hello, Martas");
    }
    public void changeColor(View view){
        TextView text = findViewById(R.id.textView);
        text.setTextColor(Color.rgb(200,100,20));
    }
}