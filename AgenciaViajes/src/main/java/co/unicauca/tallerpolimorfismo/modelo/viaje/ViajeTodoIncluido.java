package co.unicauca.tallerpolimorfismo.modelo.viaje;

import java.util.Date;

/**
 * Clase para crear un viaje que incluye todo y hereda de una clase base
 *
 * @author Santiago Acuña
 */
public class ViajeTodoIncluido extends Viaje {

    /**
     * Constructor parametrizado para la creacion de un viaje
     *
     * @param origen Lugar de origen para el viaje
     * @param destino Lugar de destino para el viaje
     * @param costo Valor total del viaje
     * @param fechaSalida Fecha de salida para el viaje
     * @param fechaLlegada Fecha de llegada para el viaje
     */
    public ViajeTodoIncluido(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada) {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
    }

    /**
     * Descripcion para un viaje todo incluido
     *
     * @return Devuelve una descripcion
     */
    @Override
    public String descripcion() {
        return "Disfruta tu viaje todo incluido";
    }

}
