package co.unicauca.tallerpolimorfismo.modelo.viaje;

import java.util.Date;

/**
 * Clase para crear un vaje familiar que hereda de una clase base
 * @author Santiago Acuña
 */
public class ViajeFamiliar extends Viaje {

    /**
     * Cantidad de integrantes en la familia
     */
    private int familia;

    /**
     * Constructor parametrizado para la creacion de un viaje
     *
     * @param origen Lugar de origen para el viaje
     * @param destino Lugar de destino para el viaje
     * @param costo Valor total del viaje
     * @param fechaSalida Fecha de salida para el viaje
     * @param fechaLlegada Fecha de llegada para el viaje
     * @param familia Cantidad de personas en la familia
     */
    public ViajeFamiliar(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada, int familia) {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
        this.familia = familia;
    }

    // Getters and Setters
    public int getFamilia() {
        return familia;
    }

    public void setFamilia(int familia) {
        this.familia = familia;
    }
    
    /**
     * Descripcion del viaje
     * @return Mensaje de la descripcion
     */
    @Override
    public String descripcion() {
        return "Viaje para disfrutar con toda tu familia";
    }

    /**
     * Mensaje para un metodo sobrescrito
     * @return Mensaje del metodo sobrescrito
     */
    @Override
    public String cualquierMetodo2() {
        return "Método implementado en la clase hija viaje familiar";
    }
    
}
