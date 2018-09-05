package com.connorng.sennova;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Adapter;
import android.widget.LinearLayout;

import com.connorng.sennova.adaptador.AdaptadorMain;
import com.connorng.sennova.adaptador.CultivosEntidad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
RecyclerView rvMenuCultivos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvMenuCultivos = (RecyclerView)findViewById(R.id.rvCultivos);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rvMenuCultivos.setLayoutManager(llm);

        List<CultivosEntidad> listaCultivo;
        listaCultivo = Arrays.asList(new CultivosEntidad(R.drawable.cacao,"Cacao","Es un cultivo de tierra caliente..."),
                new CultivosEntidad(R.drawable.espiga_arroz,"Arroz","Campoalegre capital arrozera..."),
                new CultivosEntidad(R.drawable.platano_maduro,"Platano","Cultivo dado en el CEFA..."));
        AdaptadorMain adaptadorMain = new AdaptadorMain(listaCultivo);
        rvMenuCultivos.setAdapter(adaptadorMain);


    }
}
