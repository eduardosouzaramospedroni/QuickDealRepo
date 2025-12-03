package com.example.quickdealapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AFLogicaPerfil extends AppCompatActivity {

    Button botao_voltar;

    Button botao_logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.af_tela_perfil);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        botao_voltar = findViewById(R.id.btn_voltar3);
        botao_voltar.setOnClickListener(view -> {
            Intent mudartela = new Intent(AFLogicaPerfil.this, BALogicaInicial.class);
            startActivity(mudartela);
        });

        botao_logout = findViewById(R.id.button);
        botao_logout.setOnClickListener(view -> {
            Intent mudartela = new Intent(AFLogicaPerfil.this, AALogicaLogin.class);
            startActivity(mudartela);
        });

    }
}