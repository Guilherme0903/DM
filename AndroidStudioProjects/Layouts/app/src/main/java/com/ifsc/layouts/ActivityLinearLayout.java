package com.ifsc.layouts;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityLinearLayout extends AppCompatActivity {


    EditText editNome;
    EditText editEmail;
    RadioGroup radioGroup;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);
        editNome = findViewById(R.id.textNome);
        editEmail = findViewById(R.id.textEmail);
        radioGroup = findViewById(R.id.radioGroup);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nomeTexto = editNome.getText().toString();
                String emailTexto = editEmail.getText().toString();
                Toast.makeText(ActivityLinearLayout.this, "Nome: " + nomeTexto + " - " + "Email: " + emailTexto, Toast.LENGTH_LONG).show();
            }
        });



    }



}
