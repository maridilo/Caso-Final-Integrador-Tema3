package Entidades;

public class Animal extends Organismos{
    private String tipoAnimal;
    public Animal(int posicionX, int posicionY, int edad, int salud, int energia) {
        super(posicionX, posicionY, edad, salud, energia);
        this.tipoAnimal = tipoAnimal;
    }
}
