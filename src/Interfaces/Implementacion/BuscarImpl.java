package Interfaces.Implementacion;

import Interfaces.IBuscar;
import Modelos.Vuelo;

import java.util.ArrayList;
import java.util.List;

public class BuscarImpl implements IBuscar {


    @Override
    public List<Vuelo> buscarVueloPorDestino(List<Vuelo> vuelos, String destino) {
        List<Vuelo> vuelosEncontrados = new ArrayList<>();

        for (Vuelo vuelo:vuelos) {
            if (vuelo.getDestino().equals(destino)){
                vuelosEncontrados.add(vuelo);
            }

        }

        return vuelosEncontrados;
    }
}
