/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package premio;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class PREMIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);
int opcion;
do{
        System.out.println("Por favor elige el ejercicio:");
        System.out.println("1 - Ejercicio 1.3.2");
        System.out.println("2 - Ejercicio 1.3.3");
        System.out.println("3 - Ejercicio 1.3.4");
        System.out.println("4 - Ejercicio 1.3.5");
        System.out.println("5 - Ejercicio 1.3.6");
        System.out.println("6 - Ejercicio 1.3.7");
        System.out.println("7 - Ejercicio 1.3.8");
        System.out.println("8 - Ejercicio 1.3.9");
        System.out.println("9 - Ejercicio 1.3.10");
        System.out.println("10 - Ejercicio 1.3.11");

        opcion = scanner.nextInt();

        switch (opcion) {
            case 1: 
                System.out.println("Por favor ingrese un numero real mayor a 5");
                double real5=scanner.nextDouble();
                RealMayor5 numeroMayor5=new RealMayor5(real5);
                 numeroMayor5.mayor(); 
                break;
            case 2:
                
                System.out.println("Por favor ingrese un numero real  ");
                double real2=scanner.nextDouble();
                Cuadrado cuadrado=new Cuadrado(real2);
                cuadrado.numeromayor();
                cuadrado.calcularCuadrado();
                break;
            case 3: 
                System.out.println("Ingrese un numero real ");
                Double real4=scanner.nextDouble();
                Adsoluto adsoluto =new Adsoluto(real4);
                System.out.println("El valor adsoluto es:"+adsoluto.ValorAdsoluto());
                
                
                break;
            case 4:
                System.out.println("Por favor ingrese un numero real positivo o negativo");
                        double real6=scanner.nextDouble();
                        PositivoNegativo determinacion=new PositivoNegativo(real6);
                        determinacion.ValorNumero();
                
                break;
            case 5:
                System.out.println("Por favor ingrese un numero real");
                double real8=scanner.nextDouble();
                Mayor200 mayor=new Mayor200(real8);
                mayor.mayor();
                
                break;
            case 6:
                System.out.println("Por favor ingrese un numero real");
                double real66=scanner.nextDouble();
                Rango rango=new Rango(real66);
                rango.Solucion();
                
                break;
            case 7:
                System.out.println("Por favor ingrese un numero real");
                int real=scanner.nextInt();
                ParImpar par=new ParImpar( real);
                par.SolucionParImpar();
                
                
                break;
            case 8:
                System.out.println("Por favor ingrese un numero Entero");
                int real88=scanner.nextInt();
                ParImparPositivoNegativo neg=new ParImparPositivoNegativo(real88);
                neg.SolucionTodo();
                neg.PositivoNegativo();
                break;
            case 9:
                System.out.println("Ingresa un numero entero");
                int entero99=scanner.nextInt();
                RangoParImpar Ranpar=new RangoParImpar(entero99);
                Ranpar.Solucion();
                Ranpar.SolucionTodo();
                break;
                
                 case 10:
                System.out.println("Por favor ingrese dos números enteros:");
                int num1 = scanner.nextInt();
                int num2 = scanner.nextInt();

                ComparadorNumeros comparador = new ComparadorNumeros();
                comparador.compararNumeros(num1, num2);
                break;
            default:
                System.out.println("Opción inválida. Seleccione una opción del 1 al 10.");
                break;
        }
         }while(opcion !=0);
    }


}
// CLASE REALMAYOR5
class RealMayor5 {
    
    
    
    private double numero;

    public RealMayor5(double numero) {
        this.numero = numero;
    }
//condicion
    public double mayor() {
        if (numero > 5) {
            System.out.println("El número es mayor a 5.");
        } else {
            System.out.println("El número no es mayor a 5.");
        }
        return numero;
    }
}

// CLASE Cuadrado mayor a 5000
class Cuadrado{
    
    
    
private double numero;
private double cuadrado;

public Cuadrado(double numero){
  
    this.numero=numero;

}

public void calcularCuadrado(){
cuadrado =numero*numero;
    System.out.println("El cuadrado del numero es:"+cuadrado);
}
public void numeromayor() {
        double cuadro = numero * numero;
        if (cuadro > 5000) {
            System.out.println("El cuadrado del número es mayor a 5000.");
        } else {
            System.out.println("El cuadrado del número no es mayor a 5000.");
        }
    }
}
    // CLASE VALOR ADSOLUTO
class Adsoluto{
    
    
private double numero;
public Adsoluto(double numero){
    this.numero=numero;
    
    

}
public double ValorAdsoluto(){
if (numero>=0){
    return numero;
    }else{
    return -numero;
    }
}
}
//CLASE POSITIVO O NEGATIVO
   
class PositivoNegativo{
    
    
private double numero;
public PositivoNegativo(double numero){
    this.numero=numero;
    
}
public double ValorNumero(){
if (numero>=0){
    System.out.println("El numero es positivo");
return numero;
}else{
    System.out.println("El numero es negativo");
    return numero;
}
}
        }
// CLASE MAYOR200
class Mayor200{
    
    
    private double numero;

    public Mayor200(double numero) {
        this.numero = numero;
    }

    public double mayor() {
        if (numero > 200) {
            System.out.println("El número es mayor a 200.");
        } else {
            System.out.println("El número no es mayor a 200.");
        }
        return numero;
    }
}
//CLASE RANGO
class Rango{
    
    
private double numero;
public Rango(double numero){
this.numero=numero;
}
public boolean SolucionRango(){
return (numero>=50&& numero<=100);

}
public double Solucion(){
   //Se llama la informacion de SolucionRango a Solucion
if (SolucionRango()) {
    
    System.out.println("Esta en el rango de 50--100");
            return numero;
        } else {
    System.out.println("No esta en el rango de 50--100");
            return -numero;
        }
    }
}
//CLASE PAR Y IMPAR
class ParImpar{
    
    
private int numero;
public ParImpar(int numero){
this.numero=numero;
}
public boolean solucion(int numero){
return numero %2==0;
}
public void SolucionParImpar(){


        if (solucion(numero)) {
            System.out.println(numero + " es un número par.");
        } else {
            System.out.println(numero + " es un número impar.");
        }
}
}

// CLASE PAR IMPAR POSITIVO NEGATIVO
class ParImparPositivoNegativo{
    
    
private int numero;
public ParImparPositivoNegativo(int numero){
    this.numero=numero;

}
public double PositivoNegativo(){
    if (numero>=0){
        System.out.println(numero+" Es positivo");
    return numero;
    }else{
        System.out.println(numero+"  Es negativo");
    return numero;
    }

}


public boolean Entero(int numero){
return numero%2==0;
}


public void SolucionTodo(){
    if (Entero(numero)){
        System.out.println(numero+" Es un numero par");
    }else{
        System.out.println(numero+" Es un numero Impar");
    }

}
}
//CLASE RANGO PAR O IMPAR

class RangoParImpar{
    
    
    
private int numero;
public RangoParImpar(int numero){
    this.numero=numero;
    

}
public boolean SolucionRango(){
return (numero>=200&& numero<=300);

}
public double Solucion(){
   //Se llama la informacion de SolucionRango a Solucion
if (SolucionRango()) {
    
    System.out.println("Esta en el rango de 200--300");
            return numero;
        } else {
    System.out.println("No esta en el rango de 200--300");
            return -numero;
        }
    }
public boolean Entero(int numero){
return numero%2==0;
}


public void SolucionTodo(){
    if (Entero(numero)){
        System.out.println(numero+" Es un numero par");
    }else{
        System.out.println(numero+" Es un numero Impar");
    }

}

}
// CLASE  ComparadorNumeros
class ComparadorNumeros {
    
    
    private int num1;
    private int num2;
    
    public void compararNumeros(int num1, int num2) {
        if (num1 > num2) {
            System.out.println(num1 + " es mayor que " + num2);
            System.out.println(num2 + " es menor que " + num1);
        } else if (num1 < num2) {
            System.out.println(num2 + " es mayor que " + num1);
            System.out.println(num1 + " es menor que " + num2);
        } else {
            System.out.println(num1 + " y " + num2 + " son iguales.");
        }
   
    }
}