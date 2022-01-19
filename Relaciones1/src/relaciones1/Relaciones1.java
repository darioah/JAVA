//Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
//dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
//Persona con atributos: nombre, apellido, edad, documento y Perro.
//Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
//que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
//mostrar desde la clase Persona, la información del Perro y de la Persona.
package relaciones1;

import Servicios.Servicioperro;
import entidades.Perro;
import entidades.Persona;
import Servicios.Seriviciospersona; 


public class Relaciones1 {

    
    public static void main(String[] args) {
      //llamar los metodos
      Servicioperro mascota = new Servicioperro (); 
      Seriviciospersona humano = new Seriviciospersona(); 
      
      
        System.out.println("------------------------------------");
        System.out.println("No compre, Adopte un perrito!  ");
        System.out.println("------------------------------------");
        System.out.println("Ingrese una mascota");
        Perro perrin = mascota.crearPerro();
        
        
        System.out.println("Ingrese una persona");
        Persona homosapiens = humano.crearPersona();
        
        System.out.println("Los perros asignados son ");
        
        Persona uu =humano.adopcion(homosapiens,perrin ); 
        
       humano.mostrar(uu);
        
    }
    
}
