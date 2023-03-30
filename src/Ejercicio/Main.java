package Ejercicio;

public class Main {
    public static void main(String[] args) {

        SmartDevice dispositivo = new SmartDevice("Motorola", 5.5, "Moto G5s", 2017);

        System.out.println("__Datos del Dispositivo__");
        System.out.println(dispositivo.marca + " " + dispositivo.pulgadas + " " + dispositivo.modelo + " " + dispositivo.year);

        SmartPhone celular = new SmartPhone("Apple", 6.1, "iPhone 12", 2020, "iOS");

        System.out.println("__Datos del Celular__");
        System.out.println(celular.marca + " " + celular.pulgadas + " " + celular.modelo + " " + celular.year + " " + celular.SO);

        SmartWatch reloj = new SmartWatch("Motorola", 1.3, "Moto Watch 100", 2019);

        System.out.println("__Datos del Reloj__");
        System.out.println(reloj.marca + " " + reloj.pulgadas + " " + reloj.modelo + " " + reloj.year);
    }
}
