package co.unicauca.tallerpolimorfismo.modelo.viaje;

import java.util.Date;

/**
 * 
 * @author Santiago Acuña
 */
public class ViajeIncentivo extends Viaje{

    /**
     * Nombre de la empresa que patrocina el viaje
     */
    private String empresa;
    
     /**
     * Constructor parametrizado para la creacion de un viaje
     * @param origen Lugar de origen para el viaje
     * @param destino Lugar de destino para el viaje
     * @param costo Valor total del viaje
     * @param fechaSalida Fecha de salida para el viaje
     * @param fechaLlegada Fecha de llegada para el viaje
     * @param empresa Nombre de la empresa
     */
    public ViajeIncentivo(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada, String empresa) {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
        this.empresa = empresa;
    }

    /**
     * Descripcion del viaje incentivo
     * @return Retorna una descripcion de viaje
     */
    @Override
    public String descripcion() {
        return "Disfruta tu viaje empresarial";
    }
    
    /**
     * Implementacion sobrescrita para cualquier método
     * @return Devuelve un mensaje para el método
     */
    @Override
    public String cualquierMetodo()
    {
        return "Cualquier método implementado en la clase base";
    }
    
    /**
     * Implementacion sobrescrita para cualquier metodo 2
     * @return Devuelve un mensaje del metodo2
     */
    @Override
    public String cualquierMetodo2()
    {
        return "Cualquier método2 implementado en la clase base";
    }
}
