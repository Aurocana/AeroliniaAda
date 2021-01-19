package Main;

import Interfaces.IBuscar;
import Interfaces.Implementacion.BuscarImpl;
import Interfaces.Implementacion.PoblarImp;
import Interfaces.Ipoblar;
import Modelos.Aerolinea;
import Modelos.Avion;
import Modelos.Pasajero;
import Modelos.Vuelo;

import java.util.List;

public class Main {
    public static void main (String[] args) {
        Ipoblar poblar = new PoblarImp();
        IBuscar buscar = new BuscarImpl();
        List<Aerolinea> aerolineas = poblar.creaAerolinea();
        System.out.println(aerolineas);
        List<Pasajero> pasajeros = poblar.crearPasajero();
        System.out.println(pasajeros);
        List<Avion> avions = poblar.crearAvion();
        System.out.println(avions);
        List<Vuelo> vuelos = poblar.crearVuelo();
        System.out.println(vuelos);
        // Buscar vuelos
        //System.out.println(buscar.buscarVueloPorDestino(vuelos,"Miami"));
        List<Vuelo> vuelosMiami = buscar.buscarVueloPorDestino(vuelos, "Miami");
        Vuelo vueloEscogido = vuelosMiami.get(0);
        vueloEscogido.setAvion(avions.get(0));
        Pasajero pasajeroQueVaAComprar= pasajeros.get(0);
        System.out.println(pasajeroQueVaAComprar.comprarTicket(aerolineas.get(1), vuelosMiami.get(0), "CLASE1"));
        System.out.println(vueloEscogido.getAvion().getCapacidad());

        Pasajero pasajeroQueVaAComprar1= pasajeros.get(1);
        System.out.println(pasajeroQueVaAComprar.comprarTicket(aerolineas.get(1), vuelosMiami.get(0), "CLASE2"));
        System.out.println(vueloEscogido.getAvion().getCapacidad());

    }

}
