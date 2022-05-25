package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public EditText e1,e2;
    TextView t1;
    int num1,num2;
    public boolean getNum(){
        e1=(EditText) findViewById(R.id.num1);
        e2=(EditText) findViewById(R.id.num2);
        t1= (TextView) findViewById(R.id.result);

        String s1=e1.getText().toString();
        String s2=e2.getText().toString();

        if(s1.equals(null) || s2.equals(null)){
            if(s1==null)
            {
                String result="Enter num1";
            }
            if(s2==null)
            {
                String result="Enter num2";
            }
            return false;
        }
        if(s1==null && s2==null){
            String result="Enter both numbers";
            return false;
        }
        else {
            num1 = Integer.parseInt(s1);
            num2 = Integer.parseInt(s2);
        }

        return true;
    }

    public void addition(View v) {

        // get the input numbers
        if (getNum()) {
            int sum = num1 + num2;
            t1.setText(Integer.toString(sum));
        }
        else
        {
            t1.setText("Error Please enter Required Values");
        }

    }
    public void Subtraction(View v) {

        if (getNum()) {
            int sum = num1 - num2;
            t1.setText(Integer.toString(sum));
        }
        else
        {
            t1.setText("Error Please enter Required Values");
        }
    }


    public void Multiplication(View v) {

        if (getNum()) {
            int sum = num1 * num2;
            t1.setText(Integer.toString(sum));
        }
        else
        {
            t1.setText("Error Please enter Required Values");
        }
    }


    public void Division(View v) {

        if (getNum()) {


            double sum = num1 / (num2 * 1.0);
            t1.setText(Double.toString(sum));
        }
        else
        {
            t1.setText("Error Please enter Required Values");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}