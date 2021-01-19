package Modelos;

public class Vuelo {
    private String idVuelo;
    private String origen;
    private String destino;
    private String fecha;
    private String horaSalida;
    private String horaLlegada;
    private Avion avion;

    public Vuelo(String idVuelo, String origen, String destino, String fecha, String horaSalida, String horaLlegada, Avion avion) {
        this.idVuelo = idVuelo;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;

        this.avion = avion;
    }

    public String getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(String idVuelo) {
        this.idVuelo = idVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;


    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    @Override
    public String toString() {
        return "Vuelo{" +
                "idVuelo='" + idVuelo + '\'' +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", fecha='" + fecha + '\'' +
                ", horaSalida='" + horaSalida + '\'' +
                ", horaLlegada='" + horaLlegada + '\'' +
                ", avion=" + avion +
                '}';
    }
}

