package co.unicauca.tallerpolimorfismo.modelo.viaje;

import java.util.Date;

/**
 *
 * @author Santiago Acuña
 */

/**
 * Clase base para herencia
 * @author Santiago Acuña
 */
public abstract class Viaje {

    /**
     * Lugar de origen donde se realiza el viaje
     */
    protected String origen;
    /**
     * Lugar de destino del viaje
     */
    protected String destino;
    /**
     * Valor total del viaje.
     */
    protected int costo;
    /**
     * Fecha de salida para el viaje
     */
    protected Date fechaSalida;
    /**
     * Fecha de llega para el viaje
     */
    protected Date fechaLlegada;

    /**
     * Constructor parametrizado para la creacion de un viaje
     *
     * @param origen Lugar de origen para el viaje
     * @param destino Lugar de destino para el viaje
     * @param costo Valor total del viaje
     * @param fechaSalida Fecha de salida para el viaje
     * @param fechaLlegada Fecha de llegada para el viaje
     */
    public Viaje(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada) {
        this.origen = origen;
        this.destino = destino;
        this.costo = costo;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
    }

    //Getters and Setters
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

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }
    
    // Metodos
    public abstract String descripcion();

    public String cualquierMetodo() {
        return "Cualquier método implementado en la clase base";
    }

    public String cualquierMetodo2() {
        return "Cualquier método2 implementado en la clase base";
    }

}
