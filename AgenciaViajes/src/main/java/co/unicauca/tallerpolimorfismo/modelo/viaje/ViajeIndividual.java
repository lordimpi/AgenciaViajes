package co.unicauca.tallerpolimorfismo.modelo.viaje;

import java.util.Date;

/**
 * Clase para crear un viaje individual que hereda de una clase base
 * @author Santiago Acuña
 */
public class ViajeIndividual extends Viaje {
    
    public ViajeIndividual(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada) {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
    }

    @Override
    public String descripcion() {
        return "Disfruta de tu viaje individual";
    }

}
