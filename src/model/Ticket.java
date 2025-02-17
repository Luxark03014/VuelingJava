package model;

import java.time.LocalDateTime;

public class Ticket {
    private String nombrePasajero;
    private Companias companiaAerea;
    private Ubicacion origen;
    private Ubicacion destino;
    private LocalDateTime fechaSalida;
    private LocalDateTime fechaLlegada;
    private double precioBase;
    private boolean equipajeIncluido;
    private String numeroAsiento;


    // Constructor
    public Ticket(String nombrePasajero, Companias companiaAerea, Ubicacion origen, Ubicacion destino,
                  LocalDateTime fechaSalida, LocalDateTime fechaLlegada, double precioBase, boolean equipajeIncluido, String numeroAsiento) {
        this.nombrePasajero = nombrePasajero;
        this.companiaAerea = companiaAerea;
        this.origen = origen;
        this.destino = destino;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
        this.precioBase = precioBase;
        this.equipajeIncluido = equipajeIncluido;
        this.numeroAsiento = numeroAsiento;
    }

    public String getNumeroAsiento() {
        return numeroAsiento;
    }
    public String getNombrePasajero() {
        return nombrePasajero;
    }

    public Companias getCompaniaAerea() {
        return companiaAerea;
    }

    public Ubicacion getOrigen() {
        return origen;
    }

    public Ubicacion getDestino() {
        return destino;
    }

    public LocalDateTime getFechaSalida() {
        return fechaSalida;
    }

    public LocalDateTime getFechaLlegada() {
        return fechaLlegada;
    }

    public double getPrecioBase() {return precioBase;}

    public boolean isEquipajeIncluido() {return equipajeIncluido;}

    public boolean setEquipajeIncluido(boolean equipajeIncluido) { return this.equipajeIncluido = equipajeIncluido; }

    // Métodos setters
    public void setNombrePasajero(String nombrePasajero) {
        this.nombrePasajero = nombrePasajero;
    }

    public void setCompaniaAerea(Companias companiaAerea) {
        this.companiaAerea = companiaAerea;
    }

    public void setOrigen(Ubicacion origen) {
        this.origen = origen;
    }

    public void setDestino(Ubicacion destino) {
        this.destino = destino;
    }

    public void setFechaSalida(LocalDateTime fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public void setFechaLlegada(LocalDateTime fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public void setLuggageIncluded(boolean luggageIncluded) {
        this.equipajeIncluido = equipajeIncluido;
    }

    public double calcularPrecioTotal() {
        return equipajeIncluido ? precioBase * 1.1 : precioBase;
    }


    @Override
    public String toString() {
        return "Ticket [nombrePasajero=" + nombrePasajero + ", companiaAerea=" + companiaAerea +
                ", origen=" + origen + ", destino=" + destino +
                ", fechaSalida=" + fechaSalida + ", fechaLlegada=" + fechaLlegada +
                ", precioBase=" + precioBase + ", equipajeIncluido=" + equipajeIncluido +
                ", numeroAsiento=" + numeroAsiento + ", precioTotal=" + calcularPrecioTotal() + "]";
    }
}
