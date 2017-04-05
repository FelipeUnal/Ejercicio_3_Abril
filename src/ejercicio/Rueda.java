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
public class Rueda {
    private double Diametro;
    private double Ancho;
    private String Marca;

    public Rueda(double Diametro, double Ancho, String Marca) {
        this.Diametro = Diametro;
        this.Ancho = Ancho;
        this.Marca = Marca;
    }

    public double getDiametro() {
        return Diametro;
    }

    public double getAncho() {
        return Ancho;
    }

    public String getMarca() {
        return Marca;
    }

    public void setDiametro(double Diametro) {
        this.Diametro = Diametro;
    }

    public void setAncho(double Ancho) {
        this.Ancho = Ancho;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }
}
