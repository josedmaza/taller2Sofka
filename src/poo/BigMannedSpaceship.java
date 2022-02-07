package poo;

import javax.swing.*;


/**
 * @author Jose Daniel Maza
 * Esta clase representa una nave espacial que tiene tripulacion humana,
 * heredade la clase SpaceShip y implementa la interface
 */

public class BigMannedSpaceship extends SpaceShips implements IShuttleVehicle{

    private int crew;
    private int year;



    /**
     * Constructor por defecto
     */
    public BigMannedSpaceship() {
    }

    /**
     * Constructor con parametros
     * @param name
     * @param crew
     * @param year
     */
    public BigMannedSpaceship(String name, float weight, String country, int crew, int year) {
        super();
        this.crew = crew;
        this.year = year;
    }

    public int getCrew() {
        return crew;
    }

    public int getYear() {
        return year;
    }

    /**
     * Metodo para establecer un limite para el numero de tripulantes
     */
    public void setCrew(int crew) {

        this.crew = crew;

        if (this.crew <= 8) {
            this.crew = crew;
        } else {
            while (this.crew > 8) {
                System.out.print("Esta nave solo puede llevar a 8 personas");
                this.crew = Integer.parseInt((JOptionPane.showInputDialog("Ingresa nuevamente el # de personas: ")));
            }
        }
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void launch() {
        System.out.println("Lanzamiento en 3, 2, 1... Despegue!\n");
    }

    @Override
    public void getDescription() {
        System.out.println("Nave espacial tripulada");
    }
    /**
     * Metodo implementado de la interface IShuttleVehicle
     */
    public void propulsionSystem(){
        System.out.println("Propulsion por motor funcionando");
    }

    @Override
    public String toString() {
        return super.toString() + "# Numero de tripulantes " + crew + "\nAño de creacion: " + year +"\n";
    }

}
