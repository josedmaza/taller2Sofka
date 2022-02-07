package poo;

import javax.swing.*;
import java.util.Scanner;

/**
 * Esta es la clase principal del programa, permite crear naves de diferentes tipos.
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        /**
         * Con este condicional podemos mantener la ejecución del programa hasta que el usuario decida salir.
         */
        do {
            System.out.println("Bienbenido al programa creador de naves espaciales\n" +
                    "1. Crear nave espacial tripulada grande\n" +
                    "2. Crear nave espacial tripulada pequeña\n" +
                    "3. Crear nave espacial no tripulada grande\n" +
                    "4. Crear nave espacial no tripulada pequeña\n" +
                    "5. Salir\n");

            System.out.println("Ingrese una opcion: ");
            option = sc.nextInt();

            switch (option){
                case 1:
                    System.out.println("Creando nave espacial tripulada grande...");
                    BigMannedSpaceship bigShip = new BigMannedSpaceship();
                    bigShip.setName(JOptionPane.showInputDialog("Ingrese el nombre de la nave: "));
                    bigShip.setWeight(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el peso de la nave: ")));
                    bigShip.setCountry(JOptionPane.showInputDialog("Ingrese el pais de la nave: "));
                    bigShip.setCrew(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de tripulantes: ")));
                    bigShip.setYear(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de fabricacion de la nave: ")));

                    System.out.println(bigShip);

                    bigShip.getDescription();
                    bigShip.propulsionSystem();
                    bigShip.launch();
                    break;

                case 2:
                    System.out.println("Creando nave espacial tripulada pequeña");
                    SmallMannedShip sMShip = new SmallMannedShip();
                    sMShip.setName(JOptionPane.showInputDialog("Ingrese el nombre de la nave: "));
                    sMShip.setWeight(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el peso de la nave: ")));
                    sMShip.setCountry(JOptionPane.showInputDialog("Ingrese el pais de la nave: "));
                    sMShip.setCrew(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de tripulantes: ")));
                    sMShip.setYear(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de fabricacion de la nave: ")));

                    System.out.println(sMShip);

                    sMShip.getDescription();
                    sMShip.propulsionSystem();
                    sMShip.launch();
                    break;

                case 3:
                    System.out.println("Creando nave espacial no tripulada grande...");
                    BigUnmannedShip bUShip = new BigUnmannedShip();
                    bUShip.setName(JOptionPane.showInputDialog("Ingrese el nombre de la nave: "));
                    bUShip.setWeight(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el peso de la nave: ")));
                    bUShip.setCountry(JOptionPane.showInputDialog("Ingrese el pais de la nave: "));
                    bUShip.setDestination(JOptionPane.showInputDialog("Ingrese el destino de la nave: (Planeta)"));
                    bUShip.setYear(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de fabricacion de la nave: ")));

                    System.out.println(bUShip);

                    bUShip.getDescription();
                    bUShip.propulsionSystem();
                    bUShip.launch();
                    break;

                case 4:
                    System.out.println("Creando nave espacial no tripulada pequeña");
                    SmallUnmannedShip sUShip = new SmallUnmannedShip();
                    sUShip.setName(JOptionPane.showInputDialog("Ingrese el nombre de la nave: "));
                    sUShip.setWeight(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el peso de la nave: ")));
                    sUShip.setCountry(JOptionPane.showInputDialog("Ingrese el pais de la nave: "));
                    sUShip.setDestination(JOptionPane.showInputDialog("Ingrese el destino de la nave: (Planeta)"));
                    sUShip.setYear(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de fabricacion de la nave: ")));

                    System.out.println(sUShip);

                    sUShip.getDescription();
                    sUShip.propulsionSystem();
                    sUShip.launch();
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion incorrecta");
            }
        }while (option != 5);
    }
}







