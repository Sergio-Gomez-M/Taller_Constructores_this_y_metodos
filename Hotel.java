/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerpaquetes;

/**
 *
 * @author estuam
 */
public class Hotel {
    public static void main(String[] args) {
 
        Habitacion h1 = new Habitacion(101, "Suite Presidencial", 300000.0, false);
        Habitacion h2 = new Habitacion(102, "Doble Standard");
        Habitacion h3 = new Habitacion(103, "Individual");

        h2.ocupar();

        h1.mostrarInformacion();
        h2.mostrarInformacion();
        h3.mostrarInformacion();

        double estadiaNormal = h2.calcularEstadia(3);
        double estadiaConDescuento = h2.calcularEstadia(3, 10.0);

        System.out.println("--- Cálculo de Estadía para Habitacion 102 (3 noches) ---");
        System.out.println("Valor sin descuento: " + estadiaNormal);
        System.out.println("Valor con 10% de descuento: " + estadiaConDescuento);
    }
}