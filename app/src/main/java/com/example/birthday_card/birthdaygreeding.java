package com.example.birthday_card;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

public class birthdaygreeding extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_birthdaygreeding);


        Intent intent=getIntent();
        String mm=intent.getStringExtra(MainActivity.name);

        TextView textView=(TextView)findViewById(R.id.textView2);
        textView.setText("happy Birthday "+mm);
    }
}