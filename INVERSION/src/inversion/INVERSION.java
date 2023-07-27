/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inversion;

/**
 *
 * @author ASUS
 */
public class INVERSION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
   

        Persona Roberto = new Persona("Roberto", 5000);
        Persona Cezar = new Persona("Cezar", 75000);
        Persona Erick = new Persona("Erick", 100000);

        // Calculadora de lo invertido
        double totalInvertido = Roberto.getCantidadInvertida() + Cezar.getCantidadInvertida()
                + Erick.getCantidadInvertida();

        // Se calcula el porcentaje de cada persona de inversión :-)
        double porcentajeRoberto = Roberto.calcularPorcentajeInvertido(totalInvertido);
        double porcentajeCezar = Cezar.calcularPorcentajeInvertido(totalInvertido);
        double porcentajeErick = Erick.calcularPorcentajeInvertido(totalInvertido);

        System.out.println("Porcentaje de inversión de " + Erick.getNombre() + ": " + porcentajeErick + "%");
        System.out.println("Porcentaje de inversión de " + Cezar.getNombre() + ": " + porcentajeCezar + "%");
        System.out.println("Porcentaje de inversión de " + Roberto.getNombre() + ": " + porcentajeRoberto + "%");
    }
}
// el nombre se usa como una especie de guardado de variables en este caso con los nombre erick, roberto
//y cezar. Pasa lo mismo con cantidadInversa toda esta clase es una especie de calcuiadora para cada una
// de las variables mejor dicho para cada persona, ya que los calculos de cada persona pasan por esta clase.
class Persona {
    private String nombre;
    private double cantidadInvertida;

    public Persona(String nombre, double cantidadInvertida) {
        this.nombre = nombre;
        this.cantidadInvertida = cantidadInvertida;
    }

    public double getCantidadInvertida() {
        return cantidadInvertida;
    }

    public String getNombre() {
        return nombre;
    }

    public double calcularPorcentajeInvertido(double totalInvertido) {
        return (cantidadInvertida / totalInvertido) * 100;
    }
}
