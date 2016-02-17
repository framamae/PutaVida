package com.example.fran.putavida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Pulsado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pulsado);

        TextView tv = (TextView) findViewById(R.id.textView2);
        String txt = getIntent().getStringExtra("parametro");
        tv.setText(txt);
    }

}
