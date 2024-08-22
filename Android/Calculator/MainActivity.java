package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    Button sum,sub,mul,div,merge;
    EditText in1,in2,res;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sum =(Button) findViewById(R.id.sum);
        sub=(Button) findViewById(R.id.sub);
        mul=(Button) findViewById(R.id.mul);
        div=(Button) findViewById(R.id.div);
        merge=(Button) findViewById(R.id.merge);
        in1=(EditText) findViewById(R.id.in1);
        in2=(EditText) findViewById(R.id.in2);
        res=(EditText) findViewById(R.id.res);



        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(in1.getText().toString());
                int b=Integer.parseInt(in2.getText().toString());
               int c=a+b;
                res.setText(String.valueOf(c));

            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(in1.getText().toString());
                int b=Integer.parseInt(in2.getText().toString());
                int c=a-b;
                res.setText(String.valueOf(c));

            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(in1.getText().toString());
                int b=Integer.parseInt(in2.getText().toString());
                int c=a*b;
                res.setText(String.valueOf(c));

            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(in1.getText().toString());
                int b=Integer.parseInt(in2.getText().toString());
                int c=a/b;
                res.setText(String.valueOf(c));

            }
        });

        merge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=new String(in1.getText().toString());
                String b=new String(in2.getText().toString());
                String c=a+b;
                res.setText(String.valueOf(c));

            }
        });
    }
}