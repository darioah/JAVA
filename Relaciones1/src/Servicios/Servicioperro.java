
package Servicios;

import entidades.Perro;
import java.util.Scanner;

public class Servicioperro {
    
    public Perro crearPerro (){
        Scanner sc = new Scanner(System.in);
        Perro perros = new Perro (); 
        System.out.println("Ingrese nombre");
        perros.setNombre(sc.next());
        System.out.println("Ingrese Raza");
        perros.setRaza(sc.next());
        System.out.println("Ingrese Edad");
        perros.setEdad(sc.nextInt());
        System.out.println("Ingrese tamanio");
        perros.setTamaño(sc.next()); 
       return perros;
    }
    
}
