package com.developer.johhns.asteroides;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public interface AlmacenPuntuaciones {

    public void guardarPuntuacion( int puntos , String nombre , long fecha ) ;
    public ArrayList<String> listaPuntuaciones(int cantidad ) ;

}
