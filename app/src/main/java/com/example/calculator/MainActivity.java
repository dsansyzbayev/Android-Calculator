package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText inputNumber;

    private Button buttonNumber1;
    private Button buttonNumber2;
    private Button buttonNumber3;
    private Button buttonNumber4;
    private Button buttonNumber5;
    private Button buttonNumber6;
    private Button buttonNumber7;
    private Button buttonNumber8;
    private Button buttonNumber9;
    private Button buttonNumber0;

    private Button buttonPlus;
    private Button buttonEqual;
    private Button buttonDivide;
    private Button buttonMultiply;
    private Button buttonPow;
    private Button buttonSqrt;
    private Button buttonMinus;

    private double number1;
    private double number2;
    private double result;


    enum Sign {
        RES, PLUS, MINUS, MUL, DIV, POW, SQRT
    }

    private Sign sign;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputNumber = findViewById(R.id.numberInput);

        buttonNumber1 = findViewById(R.id.buttonNumber1);
        buttonNumber2 = findViewById(R.id.buttonNumber2);
        buttonNumber3 = findViewById(R.id.buttonNumber3);
        buttonNumber4 = findViewById(R.id.buttonNumber4);
        buttonNumber5 = findViewById(R.id.buttonNumber5);
        buttonNumber6 = findViewById(R.id.buttonNumber6);
        buttonNumber7 = findViewById(R.id.buttonNumber7);
        buttonNumber8 = findViewById(R.id.buttonNumber8);
        buttonNumber9 = findViewById(R.id.buttonNumber9);
        buttonNumber0 = findViewById(R.id.buttonNumber0);

        buttonPlus = findViewById(R.id.buttonPlus);
        buttonEqual = findViewById(R.id.buttonEqual);
        buttonPow = findViewById((R.id.buttonPow));
        buttonDivide = findViewById(R.id.buttonDivide);
        buttonSqrt = findViewById(R.id.buttonSqrt);
        buttonMultiply = findViewById(R.id.buttonMultiply);
        buttonMinus = findViewById(R.id.buttonMinus);


        buttonNumber1.setOnClickListener(this);
        buttonNumber2.setOnClickListener(this);
        buttonNumber3.setOnClickListener(this);
        buttonNumber4.setOnClickListener(this);
        buttonNumber5.setOnClickListener(this);
        buttonNumber6.setOnClickListener(this);
        buttonNumber7.setOnClickListener(this);
        buttonNumber8.setOnClickListener(this);
        buttonNumber9.setOnClickListener(this);
        buttonNumber0.setOnClickListener(this);

        buttonPlus.setOnClickListener(this);
        buttonEqual.setOnClickListener(this);
        buttonMultiply.setOnClickListener(this);
        buttonSqrt.setOnClickListener(this);
        buttonDivide.setOnClickListener(this);
        buttonMinus.setOnClickListener(this);
        buttonPow.setOnClickListener(this);
    }

    public void onClick(View view){
        switch(view.getId()){
            case R.id.buttonNumber1:{
                inputNumber.append("1");
                break;
            }
            case R.id.buttonNumber2:{
                inputNumber.append("2");
                break;
            }
            case R.id.buttonNumber3:{
                inputNumber.append("3");
                break;
            }
            case R.id.buttonNumber4:{
                inputNumber.append("4");
                break;
            }
            case R.id.buttonNumber5:{
                inputNumber.append("5");
                break;
            }
            case R.id.buttonNumber6:{
                inputNumber.append("6");
                break;
            }
            case R.id.buttonNumber7:{
                inputNumber.append("7");
                break;
            }
            case R.id.buttonNumber8:{
                inputNumber.append("8");
                break;
            }
            case R.id.buttonNumber9:{
                inputNumber.append("9");
                break;
            }
            case R.id.buttonNumber0:{
                inputNumber.append("0");
                break;
            }
            case R.id.buttonPlus:{
                number1 = Integer.parseInt(inputNumber.getText().toString());
                inputNumber.setText("");
                sign = Sign.PLUS;
                break;
            }
            case R.id.buttonMinus:{
                number1 = Integer.parseInt(inputNumber.getText().toString());
                inputNumber.setText("");
                sign = Sign.MINUS;
                break;
            }
            case R.id.buttonDivide:{
                number1 = Integer.parseInt(inputNumber.getText().toString());
                inputNumber.setText("");
                sign = Sign.DIV;
                break;
            }
            case R.id.buttonMultiply:{
                number1 = Integer.parseInt(inputNumber.getText().toString());
                inputNumber.setText("");
                sign = Sign.MUL;
                break;
            }
            case R.id.buttonPow:{
                number1 = Integer.parseInt(inputNumber.getText().toString());
                inputNumber.setText("");
                sign = Sign.POW;
                break;
            }
            case R.id.buttonSqrt:{
                number1 = Integer.parseInt(inputNumber.getText().toString());
                inputNumber.setText("");
                sign = Sign.SQRT;
                break;
            }
            case R.id.buttonEqual: {
                if (sign == Sign.PLUS) {
                    number2 = Integer.parseInt(inputNumber.getText().toString());
                    result = number1 + number2;
                }
                else if(sign == Sign.MINUS){
                    number2 = Integer.parseInt(inputNumber.getText().toString());
                    result = number1 - number2;
                }
                else if(sign == Sign.MUL){
                    number2 = Integer.parseInt(inputNumber.getText().toString());
                    result = number1 * number2;
                }
                else if(sign == Sign.DIV){
                    number2 = Integer.parseInt(inputNumber.getText().toString());
                    result = number1 / number2;
                }
                else if(sign == Sign.POW){
                    result = Math.pow(number1,2);
                }
                else if(sign == Sign.SQRT){
                    result = Math.sqrt(number1);
                }

                inputNumber.setText(String.valueOf(result));
                break;
            }
        }
    }
}
