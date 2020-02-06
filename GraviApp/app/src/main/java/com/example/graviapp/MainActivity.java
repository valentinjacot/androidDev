package com.example.graviapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.ParseException;
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.Calendar;


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
    public void startCalculation(View view)throws Exception{
        //Intent intent = new Intent( this, MainActivity.class); //args: one context (this) and a class
        EditText editText = (EditText) findViewById(R.id.editText);
        String termString = editText.getText().toString();
        /************************************/
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar today = Calendar.getInstance();
        Date termDate;
        try {
            termDate = sdf.parse(termString);
        } catch (ParseException e){
            throw e;
        }
        Calendar termCal = Calendar.getInstance();
        termCal.setTime(termDate);
        int res =280 - (int) dateComputing.getDifferenceDays(today, termCal);
        //startActivity(intent); // starts an instance of the DisplayMessageActivity (spec. by the intent)$
        int numWeek = (int) Math.ceil(res/7);
        int numDay = (int) res % 7;
        /************************************/

        //intent.putExtra(EXTRA_MESSAGE, res); //adds the value of EditText to the intent
        TextView textView = findViewById(R.id.textView3);

        textView.setText(Integer.toString(numWeek) + " Weeks and " + Integer.toString(numDay)+ " Days");
    }
/**    public void displayDate(View view){
        Intent intent =  getIntent();
        String term = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
    }**/

}
