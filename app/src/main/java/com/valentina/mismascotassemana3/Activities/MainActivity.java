package com.valentina.mismascotassemana3.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.valentina.mismascotassemana3.Mascotas;
import com.valentina.mismascotassemana3.MascotasAdaptador;
import com.valentina.mismascotassemana3.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascotas> mascota;
    private RecyclerView listaMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);

        inicializarListaMascotas();

        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotas);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(RecyclerView.VERTICAL);
        listaMascotas.setLayoutManager(llm);

        inicializarAdaptador();

        FloatingActionButton fab = findViewById(R.id.floatingActionButton);

        fab.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Subir una foto", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void inicializarListaMascotas(){
        mascota = new ArrayList<Mascotas>();
        mascota.add(new Mascotas(R.drawable.perro1,"Kiska", 100));
        mascota.add(new Mascotas(R.drawable.perro2,"Canela", 150));
        mascota.add(new Mascotas(R.drawable.perro3,"Idefix", 170));
        mascota.add(new Mascotas(R.drawable.perro4,"Luna", 180));
        mascota.add(new Mascotas(R.drawable.perro5,"Panda", 200));
        mascota.add(new Mascotas(R.drawable.perro6,"Nanishka", 210));
        mascota.add(new Mascotas(R.drawable.perro7,"Tambor", 280));
        mascota.add(new Mascotas(R.drawable.perro8,"Popy", 130));
        mascota.add(new Mascotas(R.drawable.perro9,"Ramón", 80));
        mascota.add(new Mascotas(R.drawable.perro10,"Oliver", 125));
    }

    private void inicializarAdaptador(){
        MascotasAdaptador adaptador = new MascotasAdaptador(mascota);
        listaMascotas.setAdapter(adaptador);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.mFavoritos:
                Intent intent = new Intent (MainActivity.this, Mascotas_Favoritas.class);
                startActivity(intent);
                break;
            case R.id.mAcercaDe:
                Intent intent1 = new Intent(MainActivity.this, AcercaDeNosotros.class);
                startActivity(intent1);
                break;
            case R.id.mContacto:
                Intent intent2 = new Intent(MainActivity.this, Contacto.class);
                startActivity(intent2);
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}