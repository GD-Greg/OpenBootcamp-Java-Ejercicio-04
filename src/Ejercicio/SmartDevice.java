package Ejercicio;

public class SmartDevice {

    protected String marca;
    protected double pulgadas;
    protected String modelo;
    protected int year;

    public SmartDevice(){

    }

    public SmartDevice(String marca, double pulgadas, String modelo, int year) {
        this.marca = marca;
        this.pulgadas = pulgadas;
        this.modelo = modelo;
        this.year = year;
    }
}
