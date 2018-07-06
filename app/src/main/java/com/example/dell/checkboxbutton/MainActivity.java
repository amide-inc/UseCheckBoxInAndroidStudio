package com.example.dell.checkboxbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    CheckBox c1, c2, c3, c4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1 = (CheckBox)findViewById(R.id.ch1);
        c2 = (CheckBox)findViewById(R.id.ch2);
        c3 = (CheckBox)findViewById(R.id.ch3);
        c4 = (CheckBox)findViewById(R.id.ch4);

        c1.setOnClickListener(this);
        c2.setOnClickListener(this);
        c3.setOnClickListener(this);
        c4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int sid = view.getId();
        switch(sid){
            case R.id.ch1:
                c2.setChecked(false);
                c3.setChecked(false);
                c4.setChecked(false);
                Toast.makeText(getApplicationContext(), ""+c1.getText(), Toast.LENGTH_LONG).show();
                break;
            case R.id.ch2:
                c1.setChecked(false);
                c3.setChecked(false);
                c4.setChecked(false);
                break;
            case R.id.ch3:
                c2.setChecked(false);
                c1.setChecked(false);
                c4.setChecked(false);
                break;
            case R.id.ch4:
                c2.setChecked(false);
                c3.setChecked(false);
                c1.setChecked(false);
                break;

        }
    }
}
