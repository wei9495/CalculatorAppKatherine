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

    String EQUATION = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void divide(View V){
//        EditText num1 = findViewById(R.id.editFirstNum);
//        double firstNum = Integer.parseInt(num1.getText().toString());
//
//        EditText num2 = findViewById(R.id.editSecondNum);
//        double secondNum = Integer.parseInt(num2.getText().toString());
//
//        double quotient = firstNum/secondNum;
//
//        TextView answer= findViewById(R.id.answer);
//        answer.setText(""+quotient+"");
        if(EQUATION.length() > 0){
            if(EQUATION.indexOf("+") > -1 || EQUATION.indexOf("-") > -1 ||EQUATION.indexOf("/") > -1 ||EQUATION.indexOf("*") > -1 ){
                EQUATION += "";
            }else {
                EQUATION += "/";
            }
        }else{
            EQUATION +="";
        }

    }

    public void multiply(View V){
//        EditText num1 = findViewById(R.id.editFirstNum);
//        double firstNum = Integer.parseInt(num1.getText().toString());
//        EditText num2 = findViewById(R.id.editSecondNum);
//        double secondNum = Integer.parseInt(num2.getText().toString());
//        double product = firstNum*secondNum;
//        TextView answer= findViewById(R.id.answer);
//        answer.setText(""+product+"");
        if(EQUATION.length() > 0){
            if(EQUATION.indexOf("+") > -1 || EQUATION.indexOf("-") > -1 ||EQUATION.indexOf("/") > -1 ||EQUATION.indexOf("*") > -1 ){
                EQUATION += "";
            }else {
                EQUATION += "*";
            }
        }else{
            EQUATION +="";
        }
    }

    public void add(View V){
//        EditText num1 = findViewById(R.id.editFirstNum);
//        double firstNum = Integer.parseInt(num1.getText().toString());
//        EditText num2 = findViewById(R.id.editSecondNum);
//        double secondNum = Integer.parseInt(num2.getText().toString());
//        double sum = firstNum+secondNum;
//        TextView answer= findViewById(R.id.answer);
//        answer.setText(""+sum+"");

        if(EQUATION.length() > 0){
            if(EQUATION.indexOf("+") > -1 || EQUATION.indexOf("-") > -1 ||EQUATION.indexOf("/") > -1 ||EQUATION.indexOf("*") > -1 ){
                EQUATION += "";
            }else {
                EQUATION += "+";
            }
        }else{
            EQUATION +="";
        }
    }

    public void subtract(View V){
//        EditText num1 = findViewById(R.id.editFirstNum);
//        double firstNum = Integer.parseInt(num1.getText().toString());
//        EditText num2 = findViewById(R.id.editSecondNum);
//        double secondNum = Integer.parseInt(num2.getText().toString());
//        double difference = firstNum-secondNum;
//        TextView answer= findViewById(R.id.answer);
//        answer.setText(""+difference+"");
        if(EQUATION.length() > 0){
            if(EQUATION.indexOf("+") > -1 || EQUATION.indexOf("-") > -1 ||EQUATION.indexOf("/") > -1 ||EQUATION.indexOf("*") > -1 ){
                EQUATION += "";
            }else {
                EQUATION += "-";
            }
        }else{
            EQUATION +="";
        }
    }

//    public void exponent(View V){
//
//        EditText num1 = findViewById(R.id.editFirstNum);
//        double firstNum = Integer.parseInt(num1.getText().toString());
//        EditText num2 = findViewById(R.id.editSecondNum);
//        double secondNum = Integer.parseInt(num2.getText().toString());
//        double exponent = Math.pow(firstNum,secondNum);
//        TextView answer= findViewById(R.id.answer);
//        answer.setText(""+exponent+"");
//    }
//
//    public void modulus(View V){
//
//        EditText num1 = findViewById(R.id.editFirstNum);
//        int firstNum = Integer.parseInt(num1.getText().toString());
//        EditText num2 = findViewById(R.id.editSecondNum);
//        int secondNum = Integer.parseInt(num2.getText().toString());
//        int mod = firstNum%secondNum;
//        TextView answer= findViewById(R.id.answer);
//        answer.setText(""+mod+"");
//    }

    public void stringOn1(View V){
        EQUATION += 1 + "";
    }

    public void stringOn2(View V){
        EQUATION += 2 + "";
    }

    public void stringOn3(View V){
        EQUATION += 3 + "";
    }

    public void stringOn4(View V){
        EQUATION += 4 + "";
    }

    public void stringOn5(View V){
        EQUATION += 5 + "";
    }
    public void stringOn6(View V){
        EQUATION += 6 + "";
    }
    public void stringOn7(View V){
        EQUATION += 7 + "";
    }

    public void stringOn8(View V){
        EQUATION += 8 + "";
    }
    public void stringOn9(View V){
        EQUATION += 9 + "";
    }
    public void stringOn0(View V){
        EQUATION += 0 + "";
    }
    public void stringClear(View V){
        EQUATION = "";
    }

    public void equals(View V){
        int operation = -1;
        if(EQUATION.indexOf("+")>-1){
            operation = EQUATION.indexOf("+");
            String firstNum = EQUATION.substring(0,operation);
            String secondNum = EQUATION.substring(operation+1);
            int first = Integer.parseInt(firstNum.toString());
            int second = Integer.parseInt(secondNum.toString());
            int ans = first + second;
            TextView answer= findViewById(R.id.answer);
            answer.setText(ans);
        }
        if(EQUATION.indexOf("-")>-1){
            operation = EQUATION.indexOf("-");
            String firstNum = EQUATION.substring(0,operation);
            String secondNum = EQUATION.substring(operation+1);
        }

    }
}