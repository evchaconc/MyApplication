package com.example.root.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Respuesta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_respuesta);

        TextView respuesta = (TextView) findViewById(R.id.respuesta);

        Bundle b = this.getIntent().getExtras();
        respuesta.setText(b.getString("nombre"));
    }
}
