/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import Utils.FunctionNumeric;
import Utils.FunctionString;
import Entity.Colegio.Matricula;

import java.util.Scanner;

public class MatriculaView {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        FunctionNumeric fn = new FunctionNumeric();
        FunctionString fs = new FunctionString();

        int numeroEstudiantes = fn.InputIntegerNumericScanner("Ingrese el número de estudiantes que desea registrar: ");

        for (int i = 0; i < numeroEstudiantes; i++) {
            Matricula matricula = new Matricula();

          
            int numeroNotas = fn.InputIntegerNumericScanner("Ingrese el número de notas para el estudiante " + (i + 1) + ": ");
            
            for (int j = 0; j < numeroNotas; j++) {
                double nota = fn.InputDoubleNumericScanner("Ingrese la nota " + (j + 1) + " para el estudiante " + (i + 1) + ": ");
                
                System.out.println("Nota " + (j + 1) + " para el estudiante " + (i + 1) + ": " + nota);
            }

            matricula.GenerarFactura();

            System.out.println("Matrícula generada para el estudiante " + matricula.getNombre());
            System.out.println("Total a pagar: " + matricula.getTotalPagar());
            System.out.println("-------------");
        }

        scanner.close();
    }
}
