/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerpaquetes;

/**
 *
 * @author estuam
 */
public class Envios {
    public static void main(String[] args) {

        Paquete p1 = new Paquete("P-001", "Manizales", 3.0, true);
        Paquete p2 = new Paquete("P-002", "Pereira");
        Paquete p3 = new Paquete("P-003");

        p1.mostrarInformacion();
        p2.mostrarInformacion();
        p3.mostrarInformacion();

        p3.actualizarPeso(2.5);
        double total = p1.calcularCosto() + p2.calcularCosto() + p3.calcularCosto();
        System.out.println("Total del envío: " + total);

        System.out.println(p1.calcularCosto(4000));
        System.out.println(p2.calcularCosto(4000));
        
        if (p1.esPesado()) {
            System.out.println("Aviso: El paquete " + p1.codigo + " requiere manejo especial.");
        } else {
            System.out.println("El paquete " + p1.codigo + " no requiere manejo especial.");
        }

        p1.mostrarInformacion("=== REPORTE OFICIAL DE ENVÍO ===");

        double valorOriginal = 100.0;
        System.out.println("Antes del método, valor original: " + valorOriginal);
        modificarValor(valorOriginal);
        System.out.println("Después del método, el valor original sigue siendo: " + valorOriginal);
    }

    public static void modificarValor(double numero) {
        numero = 500.0;
        System.out.println("Dentro del método modificado, el valor cambió a: " + numero);
    }
}