package Interfaces.Implementacion;

import Interfaces.Ipoblar;
import Modelos.*;

import java.util.ArrayList;
import java.util.List;

public class PoblarImp implements Ipoblar {

    @Override
    public List<Aerolinea> creaAerolinea() {
        List<Aerolinea> aerolineas=new ArrayList<>();
        Aerolinea latam= new Aerolinea("LATAM");
        Aerolinea aerolineasArg = new Aerolinea("AEROLINEA ARG");

        aerolineas.add(latam);
        aerolineas.add(aerolineasArg);

        return aerolineas;
    }

    @Override
    public List<Pasajero> crearPasajero() {
        List<Pasajero> pasajeros = new ArrayList<>();

        Pasajero pasajero1 = new Pasajero("Yuli" , "Araneda", 1234);
        Pasajero pasajero2 = new Pasajero("Paulina" , "Estrada", 1235);
        Pasajero pasajero3 = new Pasajero("Beatriz" , "Aravena", 1236);

        pasajeros.add(pasajero1);
        pasajeros.add(pasajero2);
        pasajeros.add(pasajero3);
        return pasajeros;
    }

    @Override
    public List<Avion> crearAvion() {
        List<Avion> aviones = new ArrayList<>();
        Avion boeing = new Avion( 747, 200, "BOEING");

        aviones.add(boeing);

        return aviones;
    }

    @Override
    public List<Ticket> crearTicket() {
        return null;
    }

    @Override
    public List<Vuelo> crearVuelo() {
        List<Vuelo> vuelos = new ArrayList<>();

        Vuelo vuelo1= new Vuelo("AB123","BS.", "Miami","04/12/2020", "10:00", "15:00", null);
        Vuelo vuelo2= new Vuelo("AB126","BS.", "Bogota","04/12/2020", "10:00", "15:00", null);
        Vuelo vuelo3= new Vuelo("AT123","BS.", "Madrid","04/12/2020", "10:00", "15:00", null);
        Vuelo vuelo4= new Vuelo("MB123","BS.", "Miami","04/12/2020", "10:00", "15:00", null);

                vuelos.add(vuelo1);
                vuelos.add(vuelo2);
                vuelos.add(vuelo3);
                vuelos.add(vuelo4);

        return vuelos;
    }
}
