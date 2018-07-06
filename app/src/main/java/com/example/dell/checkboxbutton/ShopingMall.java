package com.example.dell.checkboxbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class ShopingMall extends AppCompatActivity {
    CheckBox c1, c2, c3, c4;
    Button btn;
    int total = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoping_mall);
        c1 = (CheckBox)findViewById(R.id.item1);
        c2 = (CheckBox)findViewById(R.id.item2);
        c3 = (CheckBox)findViewById(R.id.item3);
        c4 = (CheckBox)findViewById(R.id.item4);

        btn = (Button)findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder sb =  new StringBuilder();
                sb.append("Selected Items:");
             if(c1.isChecked()) {
                 total += 22;
             }
             if(c2.isChecked()){
                 total += 32;
             }
             if(c3.isChecked()) {
                 total += 10;
             }
             if(c4.isChecked()) {
                 total += 5;
             }
             sb.append("total :" + total);
                Toast.makeText(getApplicationContext(), sb, Toast.LENGTH_LONG).show();
            }
        });


    }
}
