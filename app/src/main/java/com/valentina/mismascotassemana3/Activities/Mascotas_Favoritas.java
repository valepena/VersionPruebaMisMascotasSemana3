package com.valentina.mismascotassemana3.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.valentina.mismascotassemana3.Mascotas;
import com.valentina.mismascotassemana3.MascotasAdaptador;
import com.valentina.mismascotassemana3.R;

import java.util.ArrayList;

public class Mascotas_Favoritas extends AppCompatActivity {

    private ArrayList<Mascotas> mascota;
    private RecyclerView rvMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas__favoritas);

        Toolbar miActionBar = findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        inicializarListaMascotas();

        rvMascotas = findViewById(R.id.rvMascotasFavoritas);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(RecyclerView.VERTICAL);
        rvMascotas.setLayoutManager(llm);

        inicializaAdaptatador();

    }

    public void inicializarListaMascotas(){
        mascota = new ArrayList<Mascotas>();
        mascota.add(new Mascotas(R.drawable.perro2,"Canela",125));
        mascota.add(new Mascotas(R.drawable.perro3,"Idefix",236));
        mascota.add(new Mascotas(R.drawable.perro4,"Luna",198));
        mascota.add(new Mascotas(R.drawable.perro5,"Panda",325));
        mascota.add(new Mascotas(R.drawable.perro6,"Nanishka",112));
    }

    public void inicializaAdaptatador(){
        MascotasAdaptador adaptador = new MascotasAdaptador(mascota);
        rvMascotas.setAdapter(adaptador);
    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if (keyCode == KeyEvent.KEYCODE_BACK){
            Intent intent = new Intent(Mascotas_Favoritas.this, MainActivity.class);
            startActivity(intent);
        }
        return super.onKeyDown(keyCode, event);
    }
}