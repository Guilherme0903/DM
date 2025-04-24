package com.ifsc.layouts;

import static android.view.Gravity.CENTER;
import static android.widget.LinearLayout.VERTICAL;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TelaProgramatica extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout linear = new LinearLayout(this);
        linear.setOrientation(VERTICAL);
        linear.setGravity(CENTER);

        linear.setLayoutParams(
                new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT
                )
        );

        TextView textView = new TextView(this);
        textView.setText("Olá Mundo");

        Button button = new Button(this);
        button.setText("click aqui");

        linear.addView(textView);
        linear.addView(button);

        setContentView(linear);


    }
}