package com.example.randomnumbers;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.EditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText num1 = findViewById(R.id.num1);
        EditText num2 = findViewById(R.id.num2);
        Button button = findViewById(R.id.button);
        TextView resultado = findViewById(R.id.resultado);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int valor1 = Integer.parseInt(num1.getText().toString());
                int valor2 = Integer.parseInt(num2.getText().toString());

                Random random = new Random();

                int aux;

                if(valor1 > valor2) {
                    aux = valor1;
                    valor1 = valor2;
                    valor2 = aux;
                }

                float numeroSorteadoDecimal = Math.round( (Math.random() * (valor2 - valor1 + 1)) + valor1 );
                int numeroSorteadoInteiro = (int) numeroSorteadoDecimal;
                resultado.setText(String.valueOf(numeroSorteadoInteiro));

            }
        });





    }


}