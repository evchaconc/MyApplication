package com.example.root.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button aceptar = (Button) findViewById(R.id.aceptar);
        aceptar.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        EditText nombre = (EditText) findViewById(R.id.nombre);
                        Intent intent = new Intent(MainActivity.this, Respuesta.class); //Para relacionar las dos clases entre ella (va a llamar a la segunda pantalla)

                        //Crear información a pasar
                        Bundle b = new Bundle();
                        b.putString("nombre", "Hola " + nombre.getText().toString());

                        intent.putExtras(b);
                        startActivity(intent);
                    }
                }

        );
    }
}
