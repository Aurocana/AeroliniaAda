package Interfaces;

import Modelos.Vuelo;

import java.util.List;

public interface IBuscar {
    List<Vuelo> buscarVueloPorDestino(List<Vuelo>vuelos,String destino);

}
