/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import dominio.Cubo;
import java.util.Scanner;

/**
 *
 * @author Alumno Mañana
 */
public class VolumenCubo {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ent = new Scanner (System.in);
        System.out.println("\tCALCULAR EL VOLUMEN DE UN CUBO");
        System.out.println("\t------------------------------");
        System.out.println("Introduce los siguientes datos:");
        System.out.print("ALTURA: ");
        int alt = ent.nextInt();
        System.out.print("ANCHURA: ");
        int anch = ent.nextInt();
        System.out.print("PROFUNDIDAD: ");
        int prof = ent.nextInt();
        Cubo c1 = new Cubo(alt,anch,prof);
        System.out.println(c1);
        dominio.Cubo.volumen(alt, anch, prof );
        
    }
    
}
