package com.developer.johhns.asteroides;

import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

import java.lang.reflect.Type;

public class PreferenciasActivity extends AppCompatActivity {

    SharedPreferences preferencias = PreferenceManager.getDefaultSharedPreferences(this) ;

    @Override
    protected void onCreate(Bundle savedInstanceState){
       super.onCreate(savedInstanceState);
       getSupportFragmentManager().beginTransaction()
               .replace(android.R.id.content,new PreferenciasFragment())
               .commit() ;

       Type tipo ;

       Boolean reproducir_musica = preferencias.getBoolean("musica",true) ;
       Boolean multijugador      = preferencias.getBoolean("multijugador",true);
       String  tipo_grafico      = preferencias.getString("graficos","?") ;
       int     fragmentos        = preferencias.getInt("fragmentos",1) ;
       int     max_jugadores     = preferencias.getInt("maxjugadores",1) ;
    }

}
