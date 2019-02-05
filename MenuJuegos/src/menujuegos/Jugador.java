package menujuegos;

import javax.swing.JOptionPane;

/**
 *
 * @author alexj
 */
public class Jugador {
    
    private String nombre;
    private int LP;
    
    public Jugador(String nombre, int LP){
        this.nombre = nombre;
        this.LP = LP;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getLP(){
        return LP;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setLP(int LP){
        this.LP = LP;
    }
    
    public void sumar(){
        String cadena = JOptionPane.showInputDialog("¿Cuánto quieres sumar?");
        int sum = Integer.parseInt(cadena);
        LP += sum;
    }
    
    public void restar(){
        String cadena = JOptionPane.showInputDialog("¿Cuánto quieres restar?");
        int res = Integer.parseInt(cadena);
        LP -= res;
    }
    
    public void finTurno(){
        YuGiOh.turno++;
    }
}
