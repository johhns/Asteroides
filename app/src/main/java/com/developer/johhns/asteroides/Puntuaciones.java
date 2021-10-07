package com.developer.johhns.asteroides;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Puntuaciones extends AppCompatActivity {

    private RecyclerView rcvPuntos ;
    private RecyclerView.LayoutManager layoutManager ;
    private MiAdaptador adaptador ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puntuaciones);

        rcvPuntos = findViewById( R.id.rvwPuntuaciones ) ;
        adaptador = new MiAdaptador(this , MainActivity.almacen.listaPuntuaciones(10)) ;
        rcvPuntos.setAdapter(adaptador);
        layoutManager = new LinearLayoutManager(this) ;
        rcvPuntos.setLayoutManager(layoutManager);
    }

}