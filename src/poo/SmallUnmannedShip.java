package poo;

/**
 * @author Jose Daniel Maza
 * Clase que representa una nave no tripulada pequeña,
 * hereda de la clase abstracta SpaceShips e implementa la interfaz IShuttleVehicle
 */
public class SmallUnmannedShip extends SpaceShips implements IShuttleVehicle {
    private String destination;
    private int year;

    /**
     * Metodo construcor por defecto
     */
    public SmallUnmannedShip() {
    }

    /**
     * Metodo constructor con parametros
     * @param name
     * @param weight
     * @param country
     * @param destination
     * @param year
     */
    public SmallUnmannedShip(String name, float weight, String country, String destination, int year) {
        super();
        this.destination = destination;
        this.year = year;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void getDescription() {
        System.out.println("Nave Espacial No tripulada");
    }

    /**
     * Metodo implementado de la interface IShuttleVehicle
     */
    @Override
    public void launch() {
        System.out.println("Lanzamiento en 3, 2, 1... despegue!\n");
    }

    public void propulsionSystem(){
        System.out.println("Propulsion por motor funcionando");
    }

    @Override
    public String toString() {
        return super.toString() + "Nave no tripulada pequeña " +
                "\ndestination: " + destination +
                "\nAño : " + year;
    }
}
