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
public class Carro {
    private String Modelo;
    private String Placa;
    private Chasis Chasis;
    private Rueda[] Rueda;
    private Motor Motor;

    public Carro(String Modelo, String Placa, Rueda[] Rueda) {
        this.Modelo = Modelo;
        this.Placa = Placa;
        this.Chasis = new Chasis();
        this.Rueda = Rueda;
    }
    
    public void setRuedas(Rueda[] Rueda){
        this.Rueda = new Rueda[4];
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public void setMotor(Motor Motor) {
        this.Motor = Motor;
    }

    public String getModelo() {
        return Modelo;
    }

    public String getPlaca() {
        return Placa;
    }

    public Chasis getChasis() {
        return Chasis;
    }

    public Rueda[] getRueda() {
        return Rueda;
    }

    public Motor getMotor() {
        return Motor;
    }
    
    
    
}
