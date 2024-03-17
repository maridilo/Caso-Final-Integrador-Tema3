package Entidades;

import java.util.ArrayList;

    public class Ambiente {
        private String clima;
        private String terreno;
        private ArrayList<String> recursos;
        private ArrayList<Organismos> organismos;

        public Ambiente(String clima, String terreno) {
            this.clima = clima;
            this.terreno = terreno;
            this.recursos = new ArrayList<>();
            this.organismos = new ArrayList<>();
        }

        public void modificarClima(String nuevoClima) {
            this.clima = nuevoClima;
        }

        public void modificarTerreno(String nuevoTerreno) {
            this.terreno = nuevoTerreno;
        }

        public void agregarRecurso(String recurso) {
            this.recursos.add(recurso);
        }

        public void eliminarRecurso(String recurso) {
            this.recursos.remove(recurso);
        }

        public void agregarOrganismo(Organismos organismos) {
            this.organismos.add(organismos);
        }

        // Método para obtener presas cercanas a un animal
        public ArrayList<Organismos> obtenerPresasCercanas(Animal animal) {
            ArrayList<Organismos> presasCercanas = new ArrayList<>();
            for (Organismos organismos : organismos) {
                if (organismos instanceof Animal && ((Animal) organismos).getTipoAnimal().equals("Presa")) {
                    // Verificar que el organismo sea una presa y esté dentro de un rango de posiciones
                    if (Math.abs(animal.getPosicionX() - ((Animal)organismos).getPosicionX()) <= 10 &&
                            Math.abs(animal.getPosicionY() - ((Animal)organismos).getPosicionY()) <= 10) {
                        presasCercanas.add(organismos);
                    }
                }
            }
            return presasCercanas;
        }

        // Método para obtener plantas cercanas a un animal
        public ArrayList<Organismos> obtenerPlantasCercanas(Animal animal) {
            ArrayList<Organismos> plantasCercanas = new ArrayList<>();
            for (Organismos organismo : organismos) {
                if (organismo instanceof Planta) {
                    // Verificar que el organismo sea una planta y esté dentro de un rango de posiciones
                    if (Math.abs(animal.getPosicionX() - ((Planta) organismo).getPosicionX()) <= 10 &&
                            Math.abs(animal.getPosicionY() - ((Planta) organismo).getPosicionY()) <= 10) {
                        plantasCercanas.add(organismo);
                    }
                }
            }
            return plantasCercanas;
        }

        public ArrayList<Organismos> getOrganismos() {
            return organismos;
        }

        public void setOrganismos(ArrayList<Organismos> organismos) {
            this.organismos = organismos;
        }
    }

