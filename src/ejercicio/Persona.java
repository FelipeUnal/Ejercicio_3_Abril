/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;
import java.util.ArrayList;
/**
 *
 * @author Estudiante
 */
public class Persona {
    private ArrayList<Carro> Carro;
    private String Nombre;
    private String CC;
    private int Edad;

    public Persona(ArrayList<Carro> Carro, String Nombre, String CC, int Edad) {
        this.Carro = Carro;
        this.Nombre = Nombre;
        this.CC = CC;
        this.Edad = Edad;
    }

    public void setCarro(ArrayList<Carro> Carro) {
        this.Carro = Carro;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setCC(String CC) {
        this.CC = CC;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public ArrayList<Carro> getCarro() {
        return Carro;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getCC() {
        return CC;
    }

    public int getEdad() {
        return Edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "Carro=" + Carro + ", Nombre=" + Nombre + ", CC=" + CC + ", Edad=" + Edad + '}';
    }
    
    
    
}
