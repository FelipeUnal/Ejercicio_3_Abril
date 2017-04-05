/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

/**
 *
 * @author Estudiante
 */
public class Chasis {
    private String Modelo;
    private String Referencia;
    private double Largo;
    private double Ancho;

    public Chasis() {
        String Modelo = this.Modelo;
        String Referencia = this.Referencia;
        double Largo = this.Largo;
        double Ancho = this.Ancho;
    }

    public String getModelo() {
        return Modelo;
    }

    public String getReferencia() {
        return Referencia;
    }

    public double getLargo() {
        return Largo;
    }

    public double getAncho() {
        return Ancho;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public void setReferencia(String Referencia) {
        this.Referencia = Referencia;
    }

    public void setLargo(double Largo) {
        this.Largo = Largo;
    }

    public void setAncho(double Ancho) {
        this.Ancho = Ancho;
    }
    
    
    
}
