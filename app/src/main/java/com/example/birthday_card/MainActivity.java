package com.example.birthday_card;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    public static final String name="b_noy_name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void creat(View view) {
        EditText ma= (EditText)findViewById(R.id.editTextTextPersonName);
        String jj=ma.getText().toString();
        Intent intent=new Intent(this,birthdaygreeding.class);
        intent.putExtra(name,jj);
        startActivity(intent);
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");

        myRef.setValue("Hello, World!");

    }
}