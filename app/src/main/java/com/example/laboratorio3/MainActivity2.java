package com.example.laboratorio3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.resources.TextAppearance;

public class MainActivity2 extends AppCompatActivity {

    private ImageView personaje;

    private TextView autor;

    private TextView frase;

    Button anterior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Intent intent = getIntent();
        int valor = intent.getIntExtra("pasarNumero", 0);


        personaje = findViewById(R.id.personaje);
        autor = findViewById(R.id.autor);
        frase = findViewById(R.id.frase);
        anterior=findViewById(R.id.anterior);



        if (valor == 1) {
            personaje.setImageResource(R.drawable.suuu);

            autor.setText(R.string.Autor_1);

            frase.setText(R.string.Frase_1);
        } else if (valor ==2) {
            personaje.setImageResource(R.drawable.ramon);

            autor.setText(R.string.Autor_2);

            frase.setText(R.string.Frase_2);
        } else if (valor ==3) {
            personaje.setImageResource(R.drawable.toreto);

            autor.setText(R.string.Autor_3);

            frase.setText(R.string.Frase_3);
        }

        anterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}