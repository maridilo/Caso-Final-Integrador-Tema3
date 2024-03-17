package Entidades;
import java.util.ArrayList;

public class Interacciones {
    private Ambiente ambiente;
    public Interacciones(Ambiente ambiente) {
        this.ambiente = ambiente;
    }
    public void simularInteracciones() {
        simularPredacion();
        simularReproduccion();
        simularPolonizacion();
    }
    // Método para simular la predación entre animales
    private void simularPredacion() {
        for (Organismos organismo : ambiente.getOrganismos()) {
            if (organismo instanceof Animal) {
                Animal animal = (Animal) organismo;
                ArrayList<Organismos> presasCercanas = ambiente.obtenerPresasCercanas(animal);
                animal.cazar(presasCercanas);
            }
        }
    }
    private void simularReproduccion() {
        // Simulación de la reproducción
        for (Organismos organismo1 : ambiente.getOrganismos()) {
            for (Organismos organismo2 : ambiente.getOrganismos()) {
                if (organismo1 != organismo2) {
                    // Verificar si los organismos están en la misma posición
                    if (organismo1.getPosicionX() == organismo2.getPosicionX() &&
                            organismo1.getPosicionY() == organismo2.getPosicionY()) {
                        // Simular la reproducción de los organismos
                        reproducirse(organismo1, organismo2);
                    }
                }
            }
        }
    }

    private void reproducirse(Organismos organismo1, Organismos organismo2) {
        // Simulación de la reproducción
        if (organismo1 instanceof Animal && organismo2 instanceof Animal) {
            // Verificar si el organismo 1 es un animal y el organismo 2 es otro animal
            if (((Animal) organismo1).getTipoAnimal().equals("Presa") &&
                    ((Animal) organismo2).getTipoAnimal().equals("Presa")) {
                // Las presas se reproducen
                organismo1.reproducirse(0);
                organismo2.reproducirse(0);
            }
        }
        if (organismo1 instanceof Planta && organismo2 instanceof Planta) {
            // Verificar si el organismo 1 es una planta y el organismo 2 es otra planta
            if (((Planta) organismo1).getTipoplanta().equals("Planta polinizadora") &&
                    ((Planta) organismo2).getTipoplanta().equals("Planta polinizada")) {
                // Las plantas se reproducen
                organismo1.reproducirse(0);
                organismo2.reproducirse(0);
            }
        }
    }

    private void simularPolonizacion() {
        // Simulación de la polinización
        for (Organismos organismo1 : ambiente.getOrganismos()) {
            for (Organismos organismo2 : ambiente.getOrganismos()) {
                if (organismo1 != organismo2) {
                    // Verificar si los organismos están en la misma posición
                    if (organismo1.getPosicionX() == organismo2.getPosicionX() &&
                            organismo1.getPosicionY() == organismo2.getPosicionY()) {
                        // Verificar si el organismo 1 es una planta y el organismo 2 es un animal
                        if (organismo1 instanceof Planta && organismo2 instanceof Animal) {
                            // Simular la polinización de la planta por el animal
                            polinizar((Planta) organismo1, (Animal) organismo2);
                        }
                    }
                }
            }
        }
    }

    private void polinizar(Planta organismo1, Animal organismo2) {
        // Simulación de la polinización
        if (organismo1.getTipoplanta().equals("Planta polinizadora") &&
                organismo2.getTipoAnimal().equals("Polinizador")) {
            // La planta polinizadora es polinizada por el animal polinizador
            organismo1.fotosintesis();
        }
    }

    public Ambiente getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(Ambiente ambiente) {
        this.ambiente = ambiente;
    }

    public void setOrganismos(ArrayList<Organismos> organismos) {
        this.ambiente.setOrganismos(organismos);
    }

}
