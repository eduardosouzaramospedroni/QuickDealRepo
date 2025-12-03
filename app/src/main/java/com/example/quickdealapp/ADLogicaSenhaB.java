package com.example.quickdealapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ADLogicaSenhaB extends AppCompatActivity {

    Button botao_voltar;

    Button botao_continuar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.ad_tela_senha_b);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        botao_voltar = findViewById(R.id.btn_cancelar);
        botao_voltar.setOnClickListener(view -> {
            Intent mudartela = new Intent(ADLogicaSenhaB.this, AALogicaLogin.class);
            startActivity(mudartela);
        });

        botao_continuar = findViewById(R.id.btn_confirm);
        botao_continuar.setOnClickListener(view -> {
            Intent mudartela = new Intent(ADLogicaSenhaB.this, AELogicaSenhaC.class);
            startActivity(mudartela);
        });

    }
}