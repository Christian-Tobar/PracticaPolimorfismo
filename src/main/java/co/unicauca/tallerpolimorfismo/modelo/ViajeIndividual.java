package co.unicauca.tallerpolimorfismo.modelo;

import java.util.Date;

/**
 *
 * @author Carlos Salamanca & Christian Tobar
 */
public class ViajeIndividual extends Viaje {

    /**
     * Constructor parametrizado
     *
     * @param origen
     * @param destino
     * @param costo
     * @param fechaSalida
     * @param fechaLlegada
     */
    public ViajeIndividual(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada) {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
    }

    @Override
    public String descripcion() {
        return "Disfruta tu viaje individual";
    }
//No se sobreescribe cualquierMetodo2()

    //GETTERS AND SETTERS
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

}
