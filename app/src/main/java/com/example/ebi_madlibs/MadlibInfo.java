package com.example.ebi_madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MadlibInfo extends AppCompatActivity {
    public static final String MY_NAME = "name";
    public static final String MY_AGE = "age";
    public static final String MY_NOUN = "noun";
    public static final String MY_VERB = "verb";
    public static final String MY_NUM = "num";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_madlib_info);

        Intent intent = getIntent();
                String myName = "";
                String myAge = "";
                String myNoun ="";
                String myVerb = "";
                String myNum ="";
        myName = intent.getStringExtra(MY_NAME);
        myAge = intent.getStringExtra(MY_AGE);
        myNoun = intent.getStringExtra(MY_NOUN);
        myVerb = intent.getStringExtra(MY_VERB);
        myNum = intent.getStringExtra(MY_NUM);
        String strToDisplay ="";
        if(myName.length() != 0 &&  myAge.length() != 0 &&  myNoun.length() != 0 &&  myVerb.length() != 0 &&  myNum.length() != 0){

             strToDisplay = getString(R.string.story1) + " "+  myName + " ." + myName + " "+ getString(R.string.story2) + " " +
                    myAge + " " + getString(R.string.story3) + " "+ myNum + " " +
                    getString(R.string.story4) + " " + myNoun + " "  +
                    getString(R.string.story5)+ " " + myName + " " +
                    getString(R.string.story6) + " " + myName + " "+ getString(R.string.story7) + " "+ myVerb + " " +
                    getString(R.string.story8) + " " + myNoun + " " + getString(R.string.story9);
            TextView str = (TextView) findViewById(R.id.info);
            str.setText(strToDisplay);
        }
        else
        {
            Context context = getApplicationContext();
            CharSequence text = "Please fill out all words!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }





        //Log.i("Ebi", strToDisplay);


    }
}
