package com.example.calculadoradeimc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button botao = findViewById(R.id.buttonCalcular);
        TextInputEditText pesoText = findViewById(R.id.editTextPeso);
        TextInputEditText alturaText = findViewById(R.id.editTextAltura);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{
                    float peso = Float.parseFloat(pesoText.getText().toString());
                    float altura = Float.parseFloat(alturaText.getText().toString());
                    float imc = peso / ((altura / 100) * (altura / 100)); // altura em cm convertida para metros
                    Intent i = new Intent(MainActivity.this, Resultado.class);
                    i.putExtra("imc", imc);
                    i.putExtra("altura", altura);
                    i.putExtra("peso", peso);
                    startActivity(i);

                } catch (Exception e) {
                    System.out.println(e);
                }



            }
        });

    }
}