package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView displayResultsTextView;

    private TextView displayHistoryTextView;

    String displayEquation = "";
    double firstNumber =0;

    double secondNumber =0;

    double operator =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayResultsTextView = findViewById(R.id.textViewResultDisplay);
        displayResultsTextView.setText("0");

        displayHistoryTextView = findViewById(R.id.textViewHistoryDisplay);
        displayHistoryTextView.setText("0");
    }

    private void TVEquation() {
        displayResultsTextView.setText(displayEquation);
    }

    public void zero(View view) {
        displayEquation +=0;
        TVEquation();
    }

    public void one(View view) {
        displayEquation +=1;
        TVEquation();

    }

    public void two(View view) {

        displayEquation +=2;
        TVEquation();
    }

    public void three(View view) {
        displayEquation +=3;
        TVEquation();
    }


    public void four(View view) {
        displayEquation +=4;
        TVEquation();
    }

    public void five(View view) {
        displayEquation +=5;
        TVEquation();
    }

    public void six(View view) {
        displayEquation +=6;
        TVEquation();
    }

    public void seven(View view) {
        displayEquation +=7;
        TVEquation();
    }

    public void eight(View view) {
        displayEquation +=8;
        TVEquation();
    }

    public void nine(View view) {
        displayEquation +=9;
        TVEquation();
    }
    public void period(View view) {
        displayEquation +=".";
        TVEquation();
    }



    public void clear(View view) {
        displayResultsTextView.setText("");
        displayEquation ="";
    }
    private void getFirstNum() {
        firstNumber = Double.parseDouble(displayEquation);
        displayEquation ="";
        TVEquation();
    }
    public void add(View view) {
        getFirstNum();
        operator = 1;
    }


    public void subtract(View view) {
        getFirstNum();
        operator = 2;
    }

    public void multiply(View view) {
        getFirstNum();
        operator = 3;
    }
    public void divide(View view) {
        getFirstNum();
        operator = 4;
    }

    private void showResult(double result) {
        String resultString = Double.toString(result);
        displayResultsTextView.setText(resultString);
        displayHistoryTextView.setText(resultString);
    }

    public void equals(View view) {


        secondNumber = Double.parseDouble(displayEquation);
        displayEquation ="";

        if (operator == 1){
            double result = firstNumber + secondNumber;
            showResult(result);
            firstNumber = result;
        }
        else if (operator == 2) {
            double result = firstNumber - secondNumber;
            showResult(result);
            firstNumber = result;
        }
        else if (operator == 3) {
            double result = firstNumber * secondNumber;
            showResult(result);
            firstNumber = result;
        }
        else if (operator == 4) {
            double result = firstNumber / secondNumber;
            showResult(result);
            firstNumber = result;
        }
        /*else if (operator == 5){
            double result = firstNumber / 100;
            showResult(result);
        }*/



    }



    public void backspace(View view) {
    }

    public void percentage(View view) {
        getFirstNum();
        operator = 5;
    }


}