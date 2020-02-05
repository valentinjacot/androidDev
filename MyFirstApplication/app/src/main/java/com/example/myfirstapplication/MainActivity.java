package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

// Author: Valentin Jacot-Descombes
// Email: vjd.jakoatgmaildotcom
public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"; //unique(-ish)key for KV pairs for the Intents
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when user taps the Send Button **/
    public void sendMessage(View view){
        Intent intent = new Intent( this, DisplayMessageActivity.class); //args: one context (this) and a class
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message); //adds the value of EditText to the intent
        startActivity(intent); // starts an instance of the DisplayMessageActivity (spec. by the intent)
    }
}
