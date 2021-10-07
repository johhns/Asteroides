package com.developer.johhns.asteroides;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class AlmacenPuntuacionesArray implements AlmacenPuntuaciones {

    ArrayList<String> puntuaciones ;

    public AlmacenPuntuacionesArray() {
       this.puntuaciones = new ArrayList<>();

       puntuaciones.add("1000 Pepito Dominguez");
       puntuaciones.add("2000 Juan Perez");
       puntuaciones.add("3000 Jose Sanchez");
    }

    @Override
    public void guardarPuntuacion(int puntos, String nombre, long fecha) {
      puntuaciones.add(0 , puntos + " " + nombre ) ;
    }

    @Override
    public ArrayList<String> listaPuntuaciones(int cantidad) {
        return puntuaciones;
    }
}
