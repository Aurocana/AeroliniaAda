package Modelos;

public class Avion {
    private int avion;
    private int capacidad;
    private String marca;

    public Avion(int avion, int capacidad, String marca) {
        this.avion = avion;
        this.capacidad = capacidad;
        this.marca = marca;
    }

    public int getAvion() {
        return avion;
    }

    public void setAvion(int avion) {
        this.avion = avion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Avion{" +
                "avion=" + avion +
                ", capacidad=" + capacidad +
                ", marca='" + marca + '\'' +
                '}';
    }
}
