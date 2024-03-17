package Entidades;


    public class Organismos {
        private int posicionX;
        private int posicionY;
        private int edad;
        int salud;
        private int reproduccion;

        public Organismos(int posicionX, int posicionY, int edad, int salud, String energia) {
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

        public int getPosicionX() {
            return posicionX;
        }

        public void setPosicionX(int posicionX) {
            this.posicionX = posicionX;
        }

        public int getPosicionY() {
            return posicionY;
        }

        public void setPosicionY(int posicionY) {
            this.posicionY = posicionY;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public int getSalud() {
            return salud;
        }

        public void setSalud(int salud) {
            this.salud = salud;
        }

        public int getReproduccion() {
            return reproduccion;
        }

        public void setReproduccion(int reproduccion) {
            this.reproduccion = reproduccion;
        }
        @Override
        public String toString() {
            return "Organismo{" +
                    "posicionX=" + posicionX +
                    ", posicionY=" + posicionY +
                    ", edad=" + edad +
                    ", salud=" + salud +
                    ", reproduccion=" + reproduccion +
                    '}';
        }
        public void String (String organismo) {
            System.out.println(organismo);
        }
    }

