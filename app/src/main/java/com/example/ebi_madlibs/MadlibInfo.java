package com.example.ebi_madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

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
        String myName = intent.getStringExtra(MY_NAME);
        String myAge = intent.getStringExtra(MY_AGE);
        String myNoun = intent.getStringExtra(MY_NOUN);
        String myVerb = intent.getStringExtra(MY_VERB);
        String myNum = intent.getStringExtra(MY_NUM);


        String strToDisplay = getString(R.string.story1) + " "+  myName + " " + getString(R.string.story2) + " " +
                myAge + " " + getString(R.string.story3) + " "+ myNum + " " +
                getString(R.string.story4) + " " + myNoun + " " + getString(R.string.story4)+ " " + myName + " " +
                getString(R.string.story5)+ " " + myName + " " +
                getString(R.string.story6) + " " + myVerb + " "+ getString(R.string.story7) + " "+
                getString(R.string.story8) + " " + myNoun + " " + getString(R.string.story9);

        //Log.i("Ebi", strToDisplay);

        TextView str = (TextView) findViewById(R.id.info);
        str.setText(strToDisplay);
    }
}
