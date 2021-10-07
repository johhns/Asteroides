package com.developer.johhns.asteroides;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class AlmacenPuntuacionesGSon implements AlmacenPuntuaciones{

    private String cadena; //Almacena puntuaciones en formato JSON
    private Gson gson = new Gson();
    private Type type = new TypeToken<List<Puntuacion>>() {}.getType();

    public AlmacenPuntuacionesGSon() {
        guardarPuntuacion(45000,"Mi nombre", System.currentTimeMillis());
        guardarPuntuacion(31000,"Otro nombre", System.currentTimeMillis());
    }

    @Override
    public void guardarPuntuacion(int puntos, String nombre, long fecha) {

        ArrayList<Puntuacion> puntuaciones ;

        if ( cadena == null ) {
            puntuaciones = new ArrayList<>() ;
        } else {
            puntuaciones = gson.fromJson( cadena , type ) ;
        }

        puntuaciones.add( new Puntuacion( puntos , nombre , fecha ) ) ;
        cadena = gson.toJson( puntuaciones , type ) ;
    }

    @Override
    public ArrayList<String> listaPuntuaciones( int cantidad ) {
        //string = leerString();
        ArrayList<Puntuacion> puntuaciones;
        if (cadena == null) {
            puntuaciones = new ArrayList<>();
        } else {
            puntuaciones = gson.fromJson( cadena , type );
        }

        ArrayList<String> salida = new ArrayList<>();

        for (Puntuacion puntuacion : puntuaciones) {
            salida.add(puntuacion.getPuntos() + " " + puntuacion.getNombre());
        }

        return salida;
    }

}
