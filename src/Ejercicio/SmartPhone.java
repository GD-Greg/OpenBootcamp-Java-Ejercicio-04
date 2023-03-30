package Ejercicio;

public class SmartPhone extends SmartDevice{

    protected String SO;

    public SmartPhone() {

    }

    public SmartPhone(String marca, double pulgadas, String modelo, int year, String SO) {
        this.marca = marca;
        this.pulgadas = pulgadas;
        this.modelo = modelo;
        this.year = year;
        this.SO = SO;
    }
}
