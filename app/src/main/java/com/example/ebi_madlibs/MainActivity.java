package com.example.ebi_madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendInfo(View v){
        //getting references for text fields
        EditText editText1 = (EditText) findViewById(R.id.nameEditText);
        EditText editText2 = (EditText) findViewById(R.id.ageEditText);
        EditText editText3 = (EditText) findViewById(R.id.nounEditText);
        EditText editText4 = (EditText) findViewById(R.id.verbEditText);
        EditText editText5 = (EditText) findViewById(R.id.numberEditText);

        String myNameStr = editText1.getText().toString();
        String myAgeStr = editText2.getText().toString();
        String myNounStr = editText3.getText().toString();
        String myVerbStr = editText4.getText().toString();
        String myNumStr = editText5.getText().toString();


        Intent intent = new Intent(this, MadlibInfo.class);

        intent.putExtra(MadlibInfo.MY_NAME, myNameStr);
        intent.putExtra(MadlibInfo.MY_AGE, myAgeStr);
        intent.putExtra(MadlibInfo.MY_NOUN, myNounStr);
        intent.putExtra(MadlibInfo.MY_VERB, myVerbStr);
        intent.putExtra(MadlibInfo.MY_NUM, myNumStr);

        startActivity(intent);
    }

    public void shareInfo(View v){
        EditText editText1 = (EditText) findViewById(R.id.nameEditText);
        EditText editText2 = (EditText) findViewById(R.id.ageEditText);
        EditText editText3 = (EditText) findViewById(R.id.nounEditText);
        EditText editText4 = (EditText) findViewById(R.id.verbEditText);
        EditText editText5 = (EditText) findViewById(R.id.numberEditText);

        String myNameStr = editText1.getText().toString();
        String myAgeStr = editText2.getText().toString();
        String myNounStr = editText3.getText().toString();
        String myVerbStr = editText4.getText().toString();
        String myNumStr = editText5.getText().toString();

        String myMessage = "@string/story1" + myNameStr + "@string/story2" + myAgeStr  + "@string/story3" + myNumStr  + "@string/story4" + myNounStr  +
                "@string/story4" + myNameStr  + "@string/story5" + myNameStr  + "@string/story6" + myVerbStr  + "@string/story7" +
                "@string/story8" + myNounStr  + "@string/story9";

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, myMessage);
        String chooserTitle = getString(R.string.chooser);
        Intent chosenIntent = Intent.createChooser(intent, chooserTitle);
        startActivity(chosenIntent);

    }
}
