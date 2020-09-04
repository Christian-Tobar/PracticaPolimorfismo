package co.unicauca.tallerpolimorfismo.modelo;

import java.util.Date;

/**
 *
 * @author Carlos Salamanca & Christian Tobar
 */
public class ViajeFamiliar extends Viaje {

    /**
     * Cantidad de integrantes de la familia
     */
    private int familia;

    /**
     * Constructor parametrizado
     *
     * @param familia
     * @param origen
     * @param destino
     * @param costo
     * @param fechaSalida
     * @param fechaLlegada
     */
    public ViajeFamiliar(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada, int familia) {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
        this.familia = familia;
    }

    @Override
    public String descripcion() {
        return "Viaje para disfrutar con toda tu familia";
    }

    @Override
    public String cualquierMetodo2() {
        return "Método implementado en la clase hija viaje familiar";
    }

    //GETTERS AND SETTERS
    public int getFamilia() {
        return familia;
    }

    public void setFamilia(int familia) {
        this.familia = familia;
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
