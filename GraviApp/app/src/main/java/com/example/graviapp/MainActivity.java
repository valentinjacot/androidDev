package com.example.graviapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Date;


public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.graviapp.MESSAGE"; //unique(-ish)key for KV pairs for the Intents

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public int getDays(Date date){
        return 0;
    }
    public int getWeeks(Date date){
        return 0;
    }
    public void startCalculation(View view){
        Intent intent = new Intent( this, MainActivity.class); //args: one context (this) and a class
        EditText editText = (EditText) findViewById(R.id.editText);
        String term = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, term); //adds the value of EditText to the intent
        //startActivity(intent); // starts an instance of the DisplayMessageActivity (spec. by the intent)
    }
    public void displayDate(View view){
        Intent intent =  getIntent();
        String term = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = findViewById(R.id.textView3);
        textView.setText(term);

    }

}
