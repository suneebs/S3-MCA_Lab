package com.example.time;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView a;
    TimePicker t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a=(TextView)findViewById(R.id.textView);
        t=(TimePicker) findViewById(R.id.timePicker);

        t.setIs24HourView(false);
        t.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker timePicker, int i, int i1) {
                a.setText("Time:"+String.format("%02d",i)+":"+String.format("%02d",i1));
                Toast.makeText(getApplicationContext(),"Time="+String.format("%02d",i)+":"+String.format("%02d",i1),Toast.LENGTH_SHORT).show();
            }
        });


    }
}