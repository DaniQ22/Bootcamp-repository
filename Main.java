import javax.swing.plaf.synth.SynthTextAreaUI;
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

          //Ejersicio 1 Calculador para edad de perros
          /*System.out.println("Ingrese la edad de su perro");
          Scanner cargarDatos = new Scanner(System.in);

          Integer edadPerro = cargarDatos.nextInt();
          //Se dice que un año de un perro e equivalente a 7 años de una persona

          Integer calcularEdad = 7 * edadPerro;

          System.out.println("La edad de su perro en años humanos es de " + calcularEdad);*/

          //Ejersicio 2 Conversor de millas a kilometros
          /*System.out.println("Ingrese las millas a convertir");
          Scanner cargarDatos = new Scanner(System.in);

          double millas = cargarDatos.nextDouble();

          double kilometros = millas * 1.60934;

          System.out.println("Las millas ingresadas equivalen a " + kilometros + " Kilometros");*/

          //Ejersicio 3 calculadora de descuento
          /*Scanner cargarDatos = new Scanner(System.in);
          System.out.println("Ingrese el precio del producto");
          double precio = cargarDatos.nextDouble();

          System.out.println("Ingrese el descuento del producto en porcentaje %");
          double porcentaje = cargarDatos.nextDouble() / 100;

          double precioFinal = precio - (precio * porcentaje);

          System.out.println("El precio final con descuento es del " + precioFinal);*/

          //Ejersicio 4 calculadora de propinas
          /*Scanner cargarDatos = new Scanner(System.in);
          System.out.println("Ingrese el total de la cuenta a pagar");
          double totalPagar = cargarDatos.nextDouble();

          System.out.println("Ingrese el total de su propina en %");
          double totalPropina = cargarDatos.nextDouble()/100;

          double propina = totalPropina * totalPagar;

          System.out.println("El total de su propina es de " + propina);*/

          //Ejersicio 5 juego de adivinar el numero

          //Aqui generamos un numero aleatorio ente y 10
          Integer numero = (int) (Math.random()*10+1);

          //Aqui mostramos el numero aleatorio
          System.out.println("El numero aleatorio es " + numero);

          System.out.println("Ingrese un numero");
          Scanner cargarDato = new Scanner(System.in);
          Integer numeroIngresado = cargarDato.nextInt();

          //Aqui comparamos el numero aleatorio generado con el ingresado por consola
          if (numeroIngresado == numero) {
               System.out.println("FELICIDADES, adivinaste el numero");
          } else {
               System.out.println("UPS, no has adivinado el numero");
          }
     }
}
