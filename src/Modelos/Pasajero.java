package Modelos;

public class Pasajero {
    private String nombre;
    private String apellido;
    private int dni;

    public Pasajero(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
   public Ticket comprarTicket(Aerolinea aerolinea, Vuelo vuelo,String claseAsiento){
        Ticket ticket = new Ticket(aerolinea,this, vuelo, claseAsiento);
     Avion avion = vuelo.getAvion();
     int capacidad = avion.getCapacidad();
     avion.setCapacidad(capacidad-1);

        return ticket;

   }
    @Override
    public String toString() {
        return "Pasajero{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni=" + dni +
                '}';
    }
}
