package Interfaces;

import Modelos.*;

import java.util.List;

public interface Ipoblar {
    List<Aerolinea> creaAerolinea();

    List<Pasajero> crearPasajero();

    List<Avion> crearAvion();

    List<Ticket> crearTicket();

    List<Vuelo> crearVuelo();

}
