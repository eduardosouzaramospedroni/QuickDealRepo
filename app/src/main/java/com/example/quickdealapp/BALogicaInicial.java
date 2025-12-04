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

public class BALogicaInicial extends AppCompatActivity {

    ImageButton botao_perfil;

    ImageButton botao_favorito;

    Button botao_restaurantes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.ba_tela_inicial);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        botao_perfil = findViewById(R.id.imageButton8);
        botao_perfil.setOnClickListener(view -> {
            Intent mudartela = new Intent(BALogicaInicial.this, AFLogicaPerfil.class);
            startActivity(mudartela);
        });

        botao_restaurantes = findViewById(R.id.btn_restaurantes);
        botao_restaurantes.setOnClickListener(view -> {
            Intent mudartela = new Intent(BALogicaInicial.this, BCLogicaRestaurantes.class);
            startActivity(mudartela);
        });

        botao_favorito = findViewById(R.id.imageButton7);
        botao_favorito.setOnClickListener(view -> {
            Intent mudartela = new Intent(BALogicaInicial.this, BDLogicaFavorito.class);
            startActivity(mudartela);
        });



    }
}