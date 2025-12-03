package com.example.quickdealapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class BCLogicaRestaurantes extends AppCompatActivity {

    Button botao_inicio;

    ImageButton botao_perfil;

    ImageButton botao_home;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.bc_tela_restaurantes);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        botao_inicio = findViewById(R.id.btn_inicio);
        botao_inicio.setOnClickListener(view -> {
            Intent mudartela = new Intent(BCLogicaRestaurantes.this, BALogicaInicial.class);
            startActivity(mudartela);
        });

        botao_perfil = findViewById(R.id.imageButton8);
        botao_perfil.setOnClickListener(view -> {
            Intent mudartela = new Intent(BCLogicaRestaurantes.this, AFLogicaPerfil.class);
            startActivity(mudartela);
        });

        botao_home = findViewById(R.id.imageButton9);
        botao_home.setOnClickListener(view -> {
            Intent mudartela = new Intent(BCLogicaRestaurantes.this, BALogicaInicial.class);
            startActivity(mudartela);
        });


    }
}