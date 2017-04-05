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
public class Motor {
    private String Marca;
    private String ID;
    private int Caballos_Fuerza;

    public Motor(String Marca, String ID, int Caballos_Fuerza) {
        this.Marca = Marca;
        this.ID = ID;
        this.Caballos_Fuerza = Caballos_Fuerza;
    }

    public String getMarca() {
        return Marca;
    }

    public String getID() {
        return ID;
    }

    public int getCaballos_Fuerza() {
        return Caballos_Fuerza;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setCaballos_Fuerza(int Caballos_Fuerza) {
        this.Caballos_Fuerza = Caballos_Fuerza;
    }
    
    
}
