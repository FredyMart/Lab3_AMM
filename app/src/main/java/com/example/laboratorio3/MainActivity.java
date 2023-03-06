package com.example.laboratorio3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView random;

    private int numero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        random = (TextView) findViewById(R.id.Aleatorio);
    }


    public void NumeroAleatorio(View view){
        numero = new Random().nextInt((3-1)+1)+1;
        random.setText(String.valueOf(numero));
    }

    public void Activity2(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("pasarNumero", numero);
        startActivity(intent);
    }
}