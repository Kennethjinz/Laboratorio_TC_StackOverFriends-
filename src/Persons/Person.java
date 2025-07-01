/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persons;

/**
 *
 * @author User
 */
public abstract class Person {
    private String cedula;
    private String name;
    private String correo;
    private int telefono;

    public int getCedula() {
        return cedula.hashCode();
    }

    public int getName() {
        return name.hashCode();
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Person(String cedula, String name, String correo, int telefono) {
        this.cedula = cedula;
        this.name = name;
        this.correo = correo;
        this.telefono = telefono;
    }
    
    
    
    
}
