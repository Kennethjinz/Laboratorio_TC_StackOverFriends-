package Persons.victimas;
import Persons.Person;

import java.time.LocalDate;

public class Victimas extends Person{
    private int dateBirth; 
    private int genero;
    private String adress;


    public int getDateBirth() {
        return dateBirth;
    }

    public String getGenero() {
        switch (genero) {
            case 1:
                return "femenino";
            case 2:
                return "masculino";
            default:
                return "No binario";
        }
    }

    public int calcularEdad() {
        int anioActual = LocalDate.now().getYear();
        return anioActual - dateBirth;
    }

    public String getAdress() {
        return adress;
    }

    public Victimas(int dateBirth, int genero, String adress, String cedula, String name, String correo, int telefono) {
        super(cedula, name, correo, telefono);
        this.dateBirth = dateBirth;
        this.genero = genero;
        this.adress = adress;
    }
    
    
    
}
