package com.dpazolopez.fragments;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        orientacion();
    }
    public void orientacion(){

        boolean condicion = getResources().getBoolean(R.bool.dual_panel);
        TextView text = (TextView) findViewById(R.id.text);
        if (condicion){
            text.setText(R.string.landscape);
        } else {
            text.setText(R.string.portrait);
        }

  }
}
