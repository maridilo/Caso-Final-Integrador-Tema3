package Entidades;


    public class Organismos {
        private int posicionX;
        private int posicionY;
        private int edad;
        private int salud;
        private int energia;
        private int velocidad;
        private int reproduccion;
        private int muerte;

        public Organismos(int posicionX, int posicionY, int edad, int salud, int energia, int velocidad, int reproduccion, int muerte) {
            this.posicionX = posicionX;
            this.posicionY = posicionY;
            this.edad = edad;
            this.salud = salud;
            this.energia = energia;
            this.velocidad = velocidad;
            this.reproduccion = reproduccion;
            this.muerte = muerte;
        }

        public void mover (int posicionX, int posicionY){
            this.posicionX = posicionX;
            this.posicionY = posicionY;
        }
        public void alimentarse (int energia){
            this.energia = energia;
        }
        public void reproducirse (int reproduccion){
            this.reproduccion = reproduccion;
        }
        public void morir (int muerte){
            this.muerte = muerte;
        }
        public void envejecer (int edad){
            this.edad = edad;
        }
        public void enfermarse (int salud){
            this.salud = salud;
        }
        public void moverse (int velocidad){
            this.velocidad = velocidad;
        }
    }

