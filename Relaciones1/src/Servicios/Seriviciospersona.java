
package Servicios;

import entidades.Perro;
import entidades.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Seriviciospersona {

    
    public Persona crearPersona (){
           
        Scanner sc = new Scanner(System.in);
        Persona persona = new Persona(); 
        System.out.println("Ingrese nombre");
        persona.setNombre(sc.next());
        System.out.println("Ingrese Apellido");
        persona.setApellido(sc.next());
        System.out.println("Ingrese Edad");
        persona.setEdad(sc.nextInt());
        System.out.println("Ingrese Documento");
        persona.setDocumenmto(sc.nextLong());
        
      
        return persona; 
    }
    public Persona adopcion(Persona persona, Perro perro){
  
       List<Perro> aux = new ArrayList<Perro>(); 
       aux = persona.getPerros(); 
       aux.add(perro);
       persona.setPerros(aux);
        
        return persona ;      
             
    }
    public void mostrar (Persona persona ){
       System.out.println(persona.toString());
        
        
    }
}
