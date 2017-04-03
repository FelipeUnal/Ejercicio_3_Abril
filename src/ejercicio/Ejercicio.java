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
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rueda[] r = new Rueda[4];
        r[0].setAncho(20);
        r[0].setDiametro(50);
        r[0].setMarca("Michellinni");
        r[1].setAncho(20);
        r[1].setDiametro(50);
        r[1].setMarca("Michellinni");
        r[2].setAncho(20);
        r[2].setDiametro(50);
        r[2].setMarca("Michellinni");
        r[3].setAncho(20);
        r[3].setDiametro(50);
        r[3].setMarca("Michellinni");
        
        Chasis ch1 = new Chasis();
        Chasis ch2 = new Chasis();
        
        Persona x = new Persona();
        
        Carro y1 = new Carro("2005_Sandero","LQX-123",r);
        Carro y2 = new Carro("2010_Kia_Rio","ABC-456",r);
      
        Motor m1 = new Motor("Ferrari","123456",15);
        Motor m2 = new Motor("Ford","654321",17);
        
        y1.setMotor(m1);
        y2.setMotor(m2);
    }
}