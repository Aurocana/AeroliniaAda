package Modelos;

public class Ticket {
    private Aerolinea aerolinea;
    private Pasajero pasajero;
    private Vuelo vuelo;
    private String categoriaAsiento;
    private int precio;


    public Ticket(Aerolinea aerolinea, Pasajero pasajero, Vuelo vuelo, String asiento) {
        this.aerolinea = aerolinea;
        this.pasajero = pasajero;
        this.vuelo = vuelo;
        this.categoriaAsiento = asiento;

    }

    public Aerolinea getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(Aerolinea aerolinea) {
        this.aerolinea = aerolinea;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public String getCategoriaAsiento() {
        return categoriaAsiento;
    }

    public void setCategoriaAsiento(String categoriaAsiento) {
        this.categoriaAsiento = categoriaAsiento;
    }

    public int getPrecio() {
        if (categoriaAsiento.equals("CLASE1")){
           precio =50;
        }

        if (categoriaAsiento.equals("CLASE2")){
        precio=40;
        }
        if (categoriaAsiento.equals("CLASE3")){
        precio=30;
        }
        if (aerolinea.getNombre().equals("LATAM")){
            precio = precio + 10;
            } else {
                precio=precio-2;
            }


        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "aerolinea=" + aerolinea +
                ", pasajero=" + pasajero +
                ", vuelo=" + vuelo +
                ", asiento='" + categoriaAsiento + '\'' +
                ", precio=" + getPrecio()+
                '}';
    }
}
