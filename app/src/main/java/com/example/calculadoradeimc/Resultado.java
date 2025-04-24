package com.example.calculadoradeimc;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Resultado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultado_imc);

        TextView mensagem = findViewById(R.id.textMensagem);
        TextView info = findViewById(R.id.textInfo);
        ImageView imagem = findViewById(R.id.imageResultado);

        float imc = getIntent().getFloatExtra("imc", 0);
        float peso = getIntent().getFloatExtra("peso", 0);
        float altura = getIntent().getFloatExtra("altura", 0);

        String infoTexto = String.format("Peso: " + peso  + "kg\n" + "Altura: " + altura + "cm\n" + "IMC: " + imc);
        info.setText(infoTexto);

        if (imc < 18.5) {
            mensagem.setText("Abaixo do peso");
            imagem.setImageResource(R.drawable.abaixopeso);
        } else if (imc >= 18.5 && imc < 24.9) {
            mensagem.setText("Peso ideal");
            imagem.setImageResource(R.drawable.normal);
        } else if (imc >= 25 && imc < 29.9) {
            mensagem.setText("Levemente acima do peso");
            imagem.setImageResource(R.drawable.sobrepeso);
        } else if (imc >= 30 && imc < 34.9) {
            mensagem.setText("Obesidade grau I");
            imagem.setImageResource(R.drawable.obesidade1);
        } else if (imc >= 35 && imc < 39.9) {
            mensagem.setText("Obesidade grau II");
            imagem.setImageResource(R.drawable.obesidade2);
        } else {
            mensagem.setText("Obesidade grau III");
            imagem.setImageResource(R.drawable.obesidade3);
        }
    }
}
