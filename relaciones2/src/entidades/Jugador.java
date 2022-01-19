//Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
//jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado
//(indica si está mojado o no el jugador). El número de jugadores será decidido por el
//usuario, pero debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
//Métodos:
//
//8
//• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
//mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
//revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
//devuelve true, sino false.
package entidades;


public class Jugador {
    private int id ; 
    private int nombre ; 
    private String mojado ; 

    public Jugador() {
    }

    public Jugador(int id, int nombre, String mojado) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = mojado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public String getMojado() {
        return mojado;
    }

    public void setMojado(String mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }
    
    //• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
    public void RevolverR(){

    
        
    }
        public void mojar(){
            
            
        }
//mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
    public void siguitechorro(){

}
//revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
//devuelve true, sino false.
   
}
