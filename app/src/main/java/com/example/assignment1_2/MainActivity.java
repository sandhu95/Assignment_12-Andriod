package com.example.assignment1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void vote(View view){
        Intent intent= new Intent(this, VoteScreen.class);
        startActivity(intent);
        startActivityForResult(intent,1);
    }
}
