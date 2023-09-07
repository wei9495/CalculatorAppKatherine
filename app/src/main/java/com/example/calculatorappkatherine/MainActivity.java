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
        EditText num1 = findViewById(R.id.editFirstNum);
        double firstNum = Integer.parseInt(num1.getText().toString());

        EditText num2 = findViewById(R.id.editSecondNum);
        double secondNum = Integer.parseInt(num2.getText().toString());

        double quotient = firstNum/secondNum;

        TextView answer= findViewById(R.id.answer);
        answer.setText(""+quotient+"");
    }

    public void multiply(View V){
        EditText num1 = findViewById(R.id.editFirstNum);
        double firstNum = Integer.parseInt(num1.getText().toString());
        EditText num2 = findViewById(R.id.editSecondNum);
        double secondNum = Integer.parseInt(num2.getText().toString());
        double product = firstNum*secondNum;
        TextView answer= findViewById(R.id.answer);
        answer.setText(""+product+"");
    }

    public void add(View V){
        EditText num1 = findViewById(R.id.editFirstNum);
        double firstNum = Integer.parseInt(num1.getText().toString());
        EditText num2 = findViewById(R.id.editSecondNum);
        double secondNum = Integer.parseInt(num2.getText().toString());
        double sum = firstNum+secondNum;
        TextView answer= findViewById(R.id.answer);
        answer.setText(""+sum+"");
    }

    public void subtract(View V){
        EditText num1 = findViewById(R.id.editFirstNum);
        double firstNum = Integer.parseInt(num1.getText().toString());
        EditText num2 = findViewById(R.id.editSecondNum);
        double secondNum = Integer.parseInt(num2.getText().toString());
        double difference = firstNum-secondNum;
        TextView answer= findViewById(R.id.answer);
        answer.setText(""+difference+"");
    }

    public void exponent(View V){

        EditText num1 = findViewById(R.id.editFirstNum);
        double firstNum = Integer.parseInt(num1.getText().toString());
        EditText num2 = findViewById(R.id.editSecondNum);
        double secondNum = Integer.parseInt(num2.getText().toString());
        double exponent = Math.pow(firstNum,secondNum);
        TextView answer= findViewById(R.id.answer);
        answer.setText(""+exponent+"");
    }

    public void modulus(View V){

        EditText num1 = findViewById(R.id.editFirstNum);
        int firstNum = Integer.parseInt(num1.getText().toString());
        EditText num2 = findViewById(R.id.editSecondNum);
        int secondNum = Integer.parseInt(num2.getText().toString());
        int mod = firstNum%secondNum;
        TextView answer= findViewById(R.id.answer);
        answer.setText(""+mod+"");
    }

}