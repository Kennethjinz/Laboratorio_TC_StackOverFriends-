/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Casos;
import java.time.LocalDateTime;
/**
 *
 * @author Yumor
 */
public class Caso  {
    public int Id ; 
    public String Victima;
    public String Descripcion;
    public String Tipo;
    public LocalDateTime Fecha;
    public Prioridad Prioridad;

    public int getId() {
        return Id;
    }

    public String getVictima() {
        return Victima;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public String getTipo() {
        return Tipo;
    }

    public LocalDateTime getFecha() {
        return Fecha;
    }

    public Prioridad getPrioridad() {
        return Prioridad;
    }

    public void setVictima(String Victima) {
        this.Victima = Victima;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public void setFecha(LocalDateTime Fecha) {
        this.Fecha = Fecha;
    }

    public void setPrioridad(Prioridad Prioridad) {
        this.Prioridad = Prioridad;
    }

    public Caso(int Id, String Victima, String Descripcion, String Tipo, LocalDateTime Fecha, Prioridad Prioridad) {
        this.Id = Id;
        this.Victima = Victima;
        this.Descripcion = "";
        this.Tipo = "";
        this.Fecha = LocalDateTime.now();
        this.Prioridad = Prioridad.BAJA;
    }

    @Override
    public String toString() {
        return "Caso{" + "Id=" + Id + ", Victima=" + Victima + ", Descripcion=" + Descripcion + ", Tipo=" + Tipo + ", Fecha=" + Fecha + ", Prioridad=" + Prioridad + '}';
    }
    
    
   
}