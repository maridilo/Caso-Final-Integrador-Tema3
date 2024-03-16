package Entidades;


    public class Organismos {
        private int posicionX;
        private int posicionY;
        private int edad;
        int salud;
        private int reproduccion;

        public Organismos(int posicionX, int posicionY, int edad, int salud, int energia) {
            this.posicionX = posicionX;
            this.posicionY = posicionY;
            this.edad = edad;
            this.salud = salud;
            this.reproduccion = reproduccion;}

        public void mover (int posicionX, int posicionY){
            this.posicionX = posicionX;
            this.posicionY = posicionY;
        }
        public void reproducirse (int reproduccion){
            this.reproduccion = reproduccion;
        }
        public void envejecer (int edad){
            this.edad = edad;
        }
        public void enfermarse (int salud){
            this.salud = salud;
        }
        }

