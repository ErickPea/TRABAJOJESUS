/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alumno;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Alumno {

   private String nombre;
    private double calificacionMatematicas;
    private double calificacionFisica;
    private double calificacionQuimica;

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    public void setCalificacionMatematicas(double examen, double promedioTareas) {
        calificacionMatematicas = examen * 0.9 + promedioTareas * 0.1;
    }

    public void setCalificacionFisica(double examen, double promedioTareas) {
        calificacionFisica = examen * 0.8 + promedioTareas * 0.2;
    }

    public void setCalificacionQuimica(double examen, double promedioTareas) {
        calificacionQuimica = examen * 0.85 + promedioTareas * 0.15;
    }

    public double getPromedioGeneral() {
        return (calificacionMatematicas + calificacionFisica + calificacionQuimica) / 3;
    }
//Retorna la calificación del alumno en Matemáticas.
    public double getCalificacionMatematicas() {
        return calificacionMatematicas;
    }
//Retorna la calificación del alumno en Física.
    public double getCalificacionFisica() {
        return calificacionFisica;
    }
// Retorna la calificación del alumno en Química.
    public double getCalificacionQuimica() {
        return calificacionQuimica;
    }
    
    
//Método "main":
    // INTERACCION CON EL USUARIO
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del alumno: ");
        String nombreAlumno = scanner.nextLine();

        Alumno alumno = new Alumno(nombreAlumno);
// NOTA: Estas calificaciones ingresadas por el usuario se dividen entre 100
//para convertirlas de una escala del 0 al 100 a una escala del 0 al 1
        System.out.println("\n--- Materias del alumno ---");
        System.out.print("Ingrese la calificación del examen de Matemáticas (0-100): ");
        double examenMatematicas = scanner.nextDouble();
        System.out.print("Ingrese el promedio de tareas de Matemáticas (0-100): ");
        double promedioTareasMatematicas = scanner.nextDouble();
        alumno.setCalificacionMatematicas(examenMatematicas / 100, promedioTareasMatematicas / 100);
// NOTA: setCalificacionMatematicas envia los datos entregados  del usuario a ser calculados a  la clase
        System.out.print("\nIngrese la calificación del examen de Física (0-100): ");
        double examenFisica = scanner.nextDouble();
        System.out.print("Ingrese el promedio de tareas de Física (0-100): ");
        double promedioTareasFisica = scanner.nextDouble();
        alumno.setCalificacionFisica(examenFisica / 100, promedioTareasFisica / 100);

        System.out.print("\nIngrese la calificación del examen de Química (0-100): ");
        double examenQuimica = scanner.nextDouble();
        System.out.print("Ingrese el promedio de tareas de Química (0-100): ");
        double promedioTareasQuimica = scanner.nextDouble();
        alumno.setCalificacionQuimica(examenQuimica / 100, promedioTareasQuimica / 100);

        // Mostrar resultados
        System.out.println("\n--- Resultados ---");
        System.out.println("Promedio general del alumno " + alumno.nombre + ": " + (alumno.getPromedioGeneral() * 100) + "%");
        System.out.println("Calificación en Matemáticas: " + (alumno.getCalificacionMatematicas() * 100) + "%");
        System.out.println("Calificación en Física: " + (alumno.getCalificacionFisica() * 100) + "%");
        System.out.println("Calificación en Química: " + (alumno.getCalificacionQuimica() * 100) + "%");
    }
}

    

