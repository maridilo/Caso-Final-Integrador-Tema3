package Entidades;

import java.util.ArrayList;

public class Animal extends Organismos{
    private String tipoAnimal;
    private Ambiente ambiente;
    public Animal(int posicionX, int posicionY, int edad, int salud, int energia, String tipoAnimal) {
        super(posicionX, posicionY, edad, salud, String.valueOf(energia));
        this.tipoAnimal = this.tipoAnimal;
    }
    @Override
    public void mover(int nuevaposicionX, int nuevaposicionY) {
        super.mover(nuevaposicionX, nuevaposicionY);
        this.salud -= 1; //Consumo de energia al moverse
    }
    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }
    public String getTipoAnimal() {
        return tipoAnimal;
    }
    public void alimentarse(){
        // Simulacion de la alimentacion
        if (this.salud > 0) {
            // Verificamos que el animal esté vivo
            int comidaDisponible = obtenerComidaDisponible(); // Supongamos que esta función devuelve la cantidad de comida disponible
            if (comidaDisponible > 0) {
                // El animal se alimenta
                int cantidadComida = comidaDisponible / 2; // Fórmula simplificada
                this.salud += cantidadComida; // Aumentamos la salud del animal con la cantidad de comida ingerida
            }
        }
    }
private int obtenerComidaDisponible() {
    // Supongamos que esta función devuelve la cantidad de comida disponible
        int cantidadComida = 0;
        if (this.tipoAnimal == "Carnivoro") {
            // Supongamos que esta función devuelve la cantidad de presas disponibles
            cantidadComida = ambiente.obtenerPresasCercanas(this).size();
        } else if (this.tipoAnimal == "Herbivoro") {
            // Supongamos que esta función devuelve la cantidad de plantas disponibles
            cantidadComida = ambiente.obtenerPlantasCercanas(this).size();
        }
        return cantidadComida;
}

    public void cazar(ArrayList<Organismos> presasCercanas) {
        // Simulación de la caza
        if (this.tipoAnimal == "Carnivoro") {
            // Verificamos si el animal es carnívoro
            if (presasCercanas.size() > 0) {
                // El animal caza a una presa
                Organismos presa = presasCercanas.get(0); // Supongamos que el animal caza a la primera presa que encuentra
                presa.enfermarse(0); // La presa muere
                this.salud += 10; // Aumentamos la salud del animal con la cantidad de comida ingerida
            }
        }
    }
    public void setAmbiente(Ambiente ambiente) {
        this.ambiente = ambiente;
    }
    public Ambiente getAmbiente() {
        return ambiente;
    }
    public void reproducirse(){
          // Simulacion de la reproduccion
          if (this.salud > 0) {
                // Verificamos que el animal esté vivo
                int parejaDisponible = obtenerParejaDisponible(); // Supongamos que esta función devuelve la cantidad de parejas disponibles
                if (parejaDisponible > 0) {
                 // El animal se reproduce
                 int cantidadHijos = parejaDisponible / 2; // Fórmula simplificada
                 this.salud -= cantidadHijos; // Disminuimos la salud del animal por el costo de la reproducción
                }
          }
    }
    private int obtenerParejaDisponible() {
        // Supongamos que esta función devuelve la cantidad de parejas disponibles
        int cantidadParejas = ambiente.obtenerOrganismosCercanos(this).size();
        return cantidadParejas;
    }
}
