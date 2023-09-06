package com.example.calculatorappkatherine;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void divide(View V){
        // Need a reference to the EditText in our xml
        //need a String variable to hold the data that was in this EditText
        //we need toString() after getText because the text in there is still editable
        //this toString() allows us to get the current contents
        //do this for each of our variables

       // EditText nameET = findViewById(R.id.nameEditText);
        //String name = nameET.getText().toString();

        EditText num1 = findViewById(R.id.editFirstNum);
        double firstNum = Integer.parseInt(num1.getText().toString());

        EditText num2 = findViewById(R.id.editSecondNum);
        double secondNum = Integer.parseInt(num2.getText().toString());

        double quotient = firstNum/secondNum;

        //

//        TextView infoAge= findViewById(R.id.infoAge);
//        infoAge.setText(ageReceived);
//
//        EditText ageET = findViewById(R.id.ageEditText);
//        String age = ageET.getText().toString();
//
//        EditText hobbyET = findViewById(R.id.hobbyEditText);
//        String hobby = hobbyET.getText().toString();
//
//        //log statements allow us to print to the console for debugging
//        String tag;
//        Log.i( "denna", name + " " + age + " " + hobby);
//
//        String fullText = "hello my name is" + name + ", I am " + age + " years old\n\tI like" + hobby;
//
//        //create the intent and tell it where to go
//        Intent intent = new Intent(this, ShowInfoActivity.class);
//        //fill the intent
//        intent.putExtra("FULLTEXT", fullText);
//        //call startActivity to launch the intent which is mailing the package
//        //startActivity(intent);
//
//        //create the intent and tell it where to go
//
//        //fill the intent
//        intent.putExtra("NAME", name);
//        //call startActivity to launch the intent which is mailing the package

    }


}