//Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
// dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
//Persona con atributos: nombre, apellido, edad, documento y Perro.
//Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
//que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
//mostrar desde la clase Persona, la información del Perro y de la Persona.
package entidades;
  
import java.util.ArrayList;
import java.util.List;


public class Persona {
    
    private String nombre ; 
    private int edad ; 
    private String apellido ; 
    private Long documenmto ; 
    private List<Perro> perros = new ArrayList<>(); 

    public Persona() {
    }

    public Persona(String nombre, int edad, String apellido, Long documenmto, List<Perro> perros) {
        this.nombre = nombre;
        this.edad = edad;
        this.apellido = apellido;
        this.documenmto = documenmto;
        this.perros= perros; 
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Long getDocumenmto() {
        return documenmto;
    }

    public void setDocumenmto(Long documenmto) {
        this.documenmto = documenmto;
    }

    public List<Perro> getPerros() {
        return perros;
    }

    public void setPerros(List<Perro> perros) {
        this.perros = perros;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", apellido=" + apellido + ", documenmto=" + documenmto + ", perros=" + perros + '}';
    }
    
    
}
