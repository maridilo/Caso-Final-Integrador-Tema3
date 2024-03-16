package Entidades;

public class Planta extends Organismos {
private String tipoplanta;
    public Planta(int posicionX, int posicionY, int edad, int salud, int reproduccion) {
        super(posicionX, posicionY, edad, salud, reproduccion);
        this.tipoplanta = tipoplanta;
    }
    public void setTipoplanta(String tipoplanta) {
        this.tipoplanta = tipoplanta;
    }
    public String getTipoplanta() {
        return tipoplanta;
    }
    public void fotosintesis(){
    // Simulacion de la fotosintesis
        if (this.salud > 0) {
            // Verificamos que la planta esté viva
            int luzSolar = obtenerLuzSolar(); // Supongamos que esta función devuelve la cantidad de luz solar recibida
            int aguaDisponible = obtenerAguaDisponible(); // Supongamos que esta función devuelve la cantidad de agua disponible
            if (luzSolar > 0 && aguaDisponible > 0) {
                // La planta realiza fotosíntesis
                int cantidadGlucosa = (luzSolar * aguaDisponible) / 2; // Fórmula simplificada
                this.salud += cantidadGlucosa; // Aumentamos la salud de la planta con la cantidad de glucosa producida

    }
}
}
private int obtenerLuzSolar() {
    // Supongamos que esta función devuelve la cantidad de luz solar recibida
    return 100;
}
private int obtenerAguaDisponible() {
    // Supongamos que esta función devuelve la cantidad de agua disponible
    return 50;
}
}


