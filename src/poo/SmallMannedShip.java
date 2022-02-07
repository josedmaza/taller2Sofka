package poo;

import javax.swing.*;


/**
 * @author Jose Daniel Maza
 * Clase que representa una nave espacial pequeña,
 * hereda de la clase SpaceShips e implementa la interface IShuttleVehicle
 */
public class SmallMannedShip extends SpaceShips {

    private int crew;
    private int year;
    ;

    public SmallMannedShip() {

    }

    public SmallMannedShip(int crew, int year) {
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

    public void setCrew(int crew) {

        this.crew = crew;

        if (this.crew <= 3) {
            this.crew = crew;
        } else {
            while (this.crew > 3) {
                System.out.print("Esta nave solo puede llevar a 3 personas");
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
        System.out.println("Nave espacial tripulada pequeña");
    }


    public void propulsionSystem(){
        System.out.println("Propulsion por motor funcionando");
    }

    @Override
    public String toString() {
        return super.toString() + "# Numero de tripulantes " + crew + "\nAño de creacion= " + year +"\n";
    }

}


