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

        TextView update= findViewById(R.id.stringEquation);
        update.setText(EQUATION);
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
        TextView update= findViewById(R.id.stringEquation);
        update.setText(EQUATION);
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
        TextView update= findViewById(R.id.stringEquation);
        update.setText(EQUATION);
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
        TextView update= findViewById(R.id.stringEquation);
        update.setText(EQUATION);
    }


    public void stringOn1(View V){
        EQUATION += 1 + "";
        TextView update= findViewById(R.id.stringEquation);
        update.setText(EQUATION);
    }

    public void stringOn2(View V){
        EQUATION += 2 + "";
        TextView update= findViewById(R.id.stringEquation);
        update.setText(EQUATION);
    }

    public void stringOn3(View V){
        EQUATION += 3 + "";
        TextView update= findViewById(R.id.stringEquation);
        update.setText(EQUATION);
    }

    public void stringOn4(View V){
        EQUATION += 4 + "";
        TextView update= findViewById(R.id.stringEquation);
        update.setText(EQUATION);
    }

    public void stringOn5(View V){
        EQUATION += 5 + "";
        TextView update= findViewById(R.id.stringEquation);
        update.setText(EQUATION);
    }
    public void stringOn6(View V){
        EQUATION += 6 + "";
        TextView update= findViewById(R.id.stringEquation);
        update.setText(EQUATION);
    }
    public void stringOn7(View V){
        EQUATION += 7 + "";
        TextView update= findViewById(R.id.stringEquation);
        update.setText(EQUATION);
    }

    public void stringOn8(View V){
        EQUATION += 8 + "";
        TextView update= findViewById(R.id.stringEquation);
        update.setText(EQUATION);
    }
    public void stringOn9(View V){
        EQUATION += 9 + "";
        TextView update= findViewById(R.id.stringEquation);
        update.setText(EQUATION);
        equals(V);
    }
    public void stringOn0(View V){
        EQUATION += 0 + "";
        TextView update= findViewById(R.id.stringEquation);
        update.setText(EQUATION);
    }
    public void stringClear(View V){
        EQUATION = "";
        TextView update= findViewById(R.id.stringEquation);
        update.setText(EQUATION);
    }

    public void equals(View V){
        int operation = -1;
        double first;
        double second;
        double ans;
        if(EQUATION.indexOf("+")>-1){
            operation = EQUATION.indexOf("+");
            String firstNum = EQUATION.substring(0,operation);
            String secondNum = EQUATION.substring(operation+1);
<<<<<<< HEAD
            first = Integer.parseInt(firstNum.toString());
            second = Integer.parseInt(secondNum.toString());
            ans = first + second;
            TextView answer= findViewById(R.id.answer);
            answer.setText("=" +ans);
=======
            int first = Integer.parseInt(firstNum);
            int second = Integer.parseInt(secondNum);
            int ans = first + second;
            TextView answer= findViewById(R.id.answer);
            answer.setText(ans + "");
>>>>>>> 029939066807067df40230b3b08a7bde4e0de1ee
        }
        if(EQUATION.indexOf("-")>-1){
            operation = EQUATION.indexOf("-");
            String firstNum = EQUATION.substring(0,operation);
            String secondNum = EQUATION.substring(operation+1);
            first = Integer.parseInt(firstNum.toString());
            second = Integer.parseInt(secondNum.toString());
            ans = first - second;
            TextView answer= findViewById(R.id.answer);
            answer.setText("=" +ans);
        }
        if(EQUATION.indexOf("*")>-1){
            operation = EQUATION.indexOf("*");
            String firstNum = EQUATION.substring(0,operation);
            String secondNum = EQUATION.substring(operation+1);
            first = Integer.parseInt(firstNum.toString());
            second = Integer.parseInt(secondNum.toString());
            ans = first * second;
            TextView answer= findViewById(R.id.answer);
            answer.setText("=" +ans);
        }
        if(EQUATION.indexOf("/")>-1){
            operation = EQUATION.indexOf("/");
            String firstNum = EQUATION.substring(0,operation);
            String secondNum = EQUATION.substring(operation+1);
            first = Integer.parseInt(firstNum.toString());
            second = Integer.parseInt(secondNum.toString());
            ans = first/second;
            TextView answer= findViewById(R.id.answer);
            answer.setText("=" +ans);
        }

    }
}