package com.e.question1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText txt1, txt2;
    private TextView rslt1;
    private Button bt1;
    private float a, c, b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init() {
        txt1=findViewById(R.id.height);
        txt2=findViewById(R.id.weight);
        rslt1=findViewById(R.id.result);
        bt1=findViewById(R.id.calcubmi);
        bt1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent intent;
        switch (v.getId()) {
            case R.id.calcubmi:
                a = Float.parseFloat(txt1.getText().toString());
                b = Float.parseFloat(txt2.getText().toString());
                c = b / ((a / 100) * (a / 100));
                rslt1.setText("" + c);
                if (c <=18.5) {
                    Toast.makeText(MainActivity.this, "Under weight", Toast.LENGTH_SHORT).show();
                }else if(c>18.5 && c<=24.9){
                    Toast.makeText(MainActivity.this, "Normal weight", Toast.LENGTH_SHORT).show();
                }else if(c>24.9 && c<=29.9){
                    Toast.makeText(MainActivity.this, "Overweight", Toast.LENGTH_SHORT).show();
                }else if(c>30){
                    Toast.makeText(MainActivity.this, "Obesitys", Toast.LENGTH_SHORT).show();
                }


        }
    }
}
