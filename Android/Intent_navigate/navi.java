package com.example.intent_navigate;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

public class navi extends AppCompatActivity {
    Button b,next;
    EditText e;
    DatePicker d;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navi);
        b=(Button) findViewById(R.id.button);
        next=(Button)findViewById(R.id.next);
        e=(EditText)findViewById(R.id.show);
        d=(DatePicker)findViewById(R.id.date1);
//        b.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent in=new Intent(navi.this,MainActivity.class);
//                startActivity(in);
//
//            }
//        });


//        b.setOnClickListener(v -> showDatePickerDialog()
//        );

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int year = d.getYear();
                int month = d.getMonth()+1;
                int day = d.getDayOfMonth();
                String date=day + "/" + month + "/" + year;
                e.setText(date);


            }
        });


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(navi.this,navi2.class);
                startActivity(i);
            }
        });



    }

//    private void showDatePickerDialog() {
//        final Calendar calendar = Calendar.getInstance();
//        int year = calendar.get(Calendar.YEAR);
//        int month = calendar.get(Calendar.MONTH);
//        int day = calendar.get(Calendar.DAY_OF_MONTH);
//
//        DatePickerDialog datePickerDialog = new DatePickerDialog(this, (view, selectedYear, selectedMonth, selectedDay) -> {
//            // Month is 0-based, so add 1
//            String date = selectedDay + "/" + (selectedMonth + 1) + "/" + selectedYear;
//            e.setText(date);
//        }, year, month, day);
//
//        datePickerDialog.show();
//    }
}