package EjersiciosJava_arreglos;

import java.util.Scanner;

public class Main {
    public  static  void main(String[] args){

        //Creemos un arrglo que permita mal usuario guardar 5 numeros y mostrarlos en pantalla
        Scanner cargarDatos = new Scanner(System.in);
        int[] numeros = new int[5];

        //Aplicando bucle for

        for (int i = 0; i<numeros.length; i++){
            System.out.println("Ingrese un numero");
            int num = cargarDatos.nextInt();
            numeros[i]=num;
        }

        /*int contador = 0;
        //Apliquemos do while

        do {
            System.out.println("Ingrese un numero");
            Integer num = cargarDatos.nextInt();
            numeros[contador]=num;
            contador++;
        }while (contador<numeros.length);*/

        //Aplicando while
        /*while (contador<5){
            System.out.println("Ingrese un numero");
            Integer num = cargarDatos.nextInt();
            numeros[contador]=num;
            contador++;
        }*/

        //Ahora vamos a mostrar el numero mayor y menos del arreglo
        //Primero declaramos nos varibles mayor y menos y se inizializan en 0
        int mayor = 0;
        int menor = 0;

        for (int i = 0; i <numeros.length; i++){
            //Con el for ya hecho recorremos el arreglo y lo almcenamos en una variables
            int num = numeros[i];
            if (num>=mayor || i ==0 ){
                mayor = num;
            }
            if (num<=menor || i == 0){
                menor = num;
            }

        }
        System.out.println("El numero mayor del arreglo es " + mayor);
        System.out.println("El numero menor es" + menor);

        float suma = 0;
        for (int i = 0; i < numeros.length; i++){
            suma += numeros[i];
        }
        System.out.println("La suma de los valores en el arrelgo es " + suma);
        float promedio = suma/numeros.length;

        System.out.println("El promedio el arreglo es de " + promedio);
        /*contador = 0;
        do {
            System.out.println(numeros[contador]);
            contador++;
        }while (contador<numeros.length);
        /*while (contador<5){
            System.out.print(numeros[contador]);
            contador++;
        }*/

    }
}
