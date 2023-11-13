import java.util.Scanner;

public class Main {
     public static void main(String[] args){

         /*//Codigo para calcular si es mayor o no de edad
        //Le pedimos al usuario que ingrese su edad por consola
        System.out.println("Ingrese su edad");
        Scanner cargarEdad = new Scanner(System.in);
        //Declaramos una variable
        Integer edad = cargarEdad.nextInt();
        //Validaos la edad ingresada
        if (edad >= 18 && edad <70) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }*/

         //Otra forma de validar una edad
        /*System.out.println("Ingrese su edad");
        Scanner datoCargado = new Scanner(System.in);
        Integer edad = datoCargado.nextInt();

        boolean esmayor = !(edad < 18 || edad > 70);
        if (esmayor){
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }*/

         //Indice de masa corporal
         //IMC = peso en kg / altura al cuadrado
         /*System.out.println("Ingrese su peso en KG");
         Scanner cargarpeso = new Scanner(System.in);
         double peso = cargarpeso.nextDouble();

         System.out.println("Ingrese su altura en metros");
         Scanner cargarAltura = new Scanner(System.in);
         double altura = cargarAltura.nextDouble();

         double IMC = peso / (altura * altura);
         System.out.println("Su indice de masa corporal es " + IMC);

         //Mayor a 30 -> obesidad
         if (IMC >= 30){
             System.out.println("Estas en un estado de obesidad");
         }
         //Entre25 y 30 sobrepeso
         if (IMC >=25 && IMC < 30) {
             System.out.println("Estas en un estado de sobrepeso");
         }
         //Entre 15 y 25 peso normal
         if (IMC >=15 && IMC <=25) {
             System.out.println("Estas en un estado normal");
         }
         //Menor  a 18.6 delgades
         if (IMC <18.6){
             System.out.println("Estas en un estado por debajo de lo normal");
         }*/



     }
}
