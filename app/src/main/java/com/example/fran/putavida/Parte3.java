package com.example.fran.putavida;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

public class Parte3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parte3);
    }
    public void clicar (View v){
        Spinner sp = (Spinner) findViewById(R.id.spinner);
        EditText et = (EditText) findViewById(R.id.editText);
        int pos = sp.getSelectedItemPosition();
        String txt = et.getText().toString();


        Intent intent = new Intent();

        switch (pos){
            case 0:
                intent.setAction(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + txt));
                break;
            case 1:
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://" + txt));
                break;
            case 2:
                intent.setAction(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT,txt);
                break;
            case 3:
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:0,0?q=" + txt));
                break;}

        startActivity(intent);
    }
}
