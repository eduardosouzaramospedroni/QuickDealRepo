package com.example.quickdealapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AALogicaLogin extends AppCompatActivity {
    Button botaologar;

    EditText campoemail;

    EditText camposenha;

    Button botao_naocadastro;

    Button botao_esquecisenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.aa_tela_login);

        botaologar = findViewById(R.id.btn_continuar);

        campoemail = findViewById(R.id.edt_email);

        camposenha = findViewById(R.id.edt_senha);

        botao_naocadastro = findViewById(R.id.btn_cadastrar);

        botao_esquecisenha = findViewById(R.id.btn_esqueci_senha);

        botao_naocadastro.setOnClickListener(view -> {
            Intent mudartela = new Intent(AALogicaLogin.this, ABLogicaCadastro.class);
            startActivity(mudartela);
        });

        botao_esquecisenha.setOnClickListener(view -> {
            Intent mudartela = new Intent(AALogicaLogin.this, ACLogicaSenhaA.class);
            startActivity(mudartela);
        });

        botaologar.setOnClickListener(view -> {
            Intent mudartela = new Intent(AALogicaLogin.this, BALogicaInicial.class);
            startActivity(mudartela);
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}