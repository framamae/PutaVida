package com.example.fran.putavida;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pulsar(View v){
        Intent intent = new Intent(this,Pulsado.class);
        intent.putExtra("parametro", "Texto_a_mostra");
        startActivity(intent);

    }
    public void press(View v){
        Intent intent = new Intent(this,Parte3.class);
        startActivity(intent);

    }

    public void finalizar(View v){
        finish();

    }
}
