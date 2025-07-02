/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Casos;

/**
 *
 * @author Yumor
 */
public enum Prioridad {
    ALTA("Alta"),
    MEDIA("Media"),
    BAJA("Baja");
    
    private final String Prioridad;

    
    Prioridad (String Prioridad){
    this.Prioridad= Prioridad; 
    }
    
    public String getPrioridad() {
        return Prioridad;
    }
    
    @Override
    public String toString() {
        return "EstadoBicicletas{" + ", status=" + Prioridad + '}';
    }
    
    
}
