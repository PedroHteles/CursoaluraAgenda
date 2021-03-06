package com.example.aluraagenda;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;

import com.example.aluraagenda.dao.AlunoDAO;
import com.example.aluraagenda.model.Aluno;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AlunoDAO dao = new AlunoDAO();

        List<String> alunos = new ArrayList<>(Arrays.asList("Alex","pedro","fran","teste"));
        ListView listaDeAlunos =  findViewById(R.id.activity_main_lista_de_alunos);
        listaDeAlunos.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,dao.todos()));
    }
}
