package com.example.aluraagenda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.aluraagenda.dao.AlunoDAO;
import com.example.aluraagenda.model.Aluno;

public class FormularioAlunoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_aluno);

        AlunoDAO dao = new AlunoDAO();

        final EditText campoNome = findViewById(R.id.activity_formulado_aluno_nome);
        final EditText campoEmail = findViewById(R.id.activity_formulado_aluno_email);
        final EditText campoTelefone = findViewById(R.id.activity_formulado_aluno_telefone);

        Button botaoSalvar = findViewById(R.id.activity_formulado_aluno);
        botaoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = campoNome.getText().toString();
                String email = campoEmail.getText().toString();
                String telefone = campoTelefone.getText().toString();

                Aluno alunoCriado = new Aluno(nome,email,telefone);
                dao.salva(alunoCriado);

                startActivity(new Intent(FormularioAlunoActivity.this, MainActivity.class));
            }
        });


    }
}