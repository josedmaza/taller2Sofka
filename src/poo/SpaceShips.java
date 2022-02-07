package poo;

/**
 * @author Jose Daniel Maza
 * Esta es la clase abstracta de la cual heredaran las clases hijas para poder crear naves espaciales
 */

public abstract class SpaceShips {
    public Boolean shuttleVehicle;
    public String name;
    public  float weight;
    public String country;

    /**
     * Constructor por defecto
     */
    public SpaceShips(){
    }

    /**
     * Constructor con parametros
     * @param name
     * @param weight
     * @param country
     */
    public SpaceShips(String name, float weight, String country) {
        this.shuttleVehicle = true;
        this.name = name;
        this.weight = weight;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String toString(){
        return "\nNombre: "+this.name+"\nPeso: "+this.weight+ "Kg" + "\nPais: "+this.country + "\n";
    }

    /**
     * Metodo abstracto que se implementara en las clases hijas
     */
    public abstract void getDescription();
    public abstract void launch();

}
