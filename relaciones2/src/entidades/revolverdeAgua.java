//Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual
//(posición del tambor que se dispara, puede que esté el agua o no) y posición agua (la
//posición del tambor donde se encuentra el agua). Estas dos posiciones, se generarán
//aleatoriamente.
//Métodos:
//• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los
//valores deben ser aleatorios.
//• mojar(): devuelve true si la posición del agua coincide con la posición actual
//• siguienteChorro(): cambia a la siguiente posición del tambor
//• toString(): muestra información del revolver (posición actual y donde está el agua)
package entidades;

public class revolverdeAgua {
    
    private Integer posicionActual ;
    private Integer posicionAgua ;

    public revolverdeAgua() {
    }

    public revolverdeAgua(Integer posicionActual, Integer posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public Integer getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(Integer posicionActual) {
        this.posicionActual = posicionActual;
    }

    public Integer getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(Integer posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return "revolverdeAgua{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }
    
    //• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los
//valores deben ser aleatorios.
    public revolverdeAgua llenarRevolver(){
        
        //Dos atributos que son la POSICION ACTUAL y POSICION AGUA
        
        revolverdeAgua arma1 = new revolverdeAgua();
        
       int posicion = (int) (Math.random()*6+1);
       
       arma1.setPosicionActual(posicion);
       
       int posicion2 = (int) (Math.random()*6+1);
       
       arma1.setPosicionAgua(posicion2);
        System.out.println(arma1.toString());
       
       return arma1;
       
        
        
     
        
        
    }
    
//• mojar(): devuelve true si la posición del agua coincide con la posición actual
    public void moojar(){
        
        if(posicionActual)
        
    }
    
//• siguienteChorro(): cambia a la siguiente posición del tambor
    public void siguienteChorro(){
        
    }
    
//• toString(): muestra información del revolver (posición actual y donde está el agua)
    public void mostrar(){
        
    }
    
}
