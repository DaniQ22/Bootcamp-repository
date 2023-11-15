package EjersiciosJava_arreglos;

import java.util.Scanner;

public class Main {
    public  static  void main(String[] args){

        //Creemos un arrglo que permita mal usuario guardar 5 numeros y mostrarlos en pantalla
        Scanner cargarDatos = new Scanner(System.in);
        /*int[] numeros = new int[5];

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
        /*int mayor = 0;
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

        System.out.println("El promedio el arreglo es de " + promedio);*/
        /*contador = 0;
        do {
            System.out.println(numeros[contador]);
            contador++;
        }while (contador<numeros.length);
        /*while (contador<5){
            System.out.print(numeros[contador]);
            contador++;
        }*/

        //Programa de la historia interactiva utulizando arreglos
        //Primero creamo el arreglo que alamacenara toda la hostoria
        /*String[] historia = {"Es una noche estrellada, te encuentras en un bosque misterioso:",
                "1) Exploras la oscuridad en busca de la fuente de un susurro escalofriante",
                "2) Sigues el sendero iluminado hacia una pequeña cabaña acogedora",
                "Decides seguir el sendero iluminado hacia la pequeña cabaña acogedora. Al llegar a la cabaña, te das cuenta de que hay dos puertas:",
                "1) Entras por la puerta de la izquierda",
                "2) Optas por la puerta de la derecha",
                "Al abrir la puerta de la izquierda, te encuentras con una habitación llena de tesoros brillantes y mágicos. Te maravillas con las joyas y los objetos preciosos que llenan la sala. Te das cuenta de que has encontrado el legendario tesoro perdido del bosque. Con tu corazón lleno de emoción y riquezas, decides regresar a casa para compartir tu increíble aventura con el mundo. ¡Felicidades, has tenido un final exitoso en tu búsqueda!",
                "Ups, has escogido la opción incorrecta"};

        for (int i = 0; i < 3; i++){
            System.out.println(historia[i]);
        }

        int opcion = cargarDatos.nextInt();
        if (opcion ==1){
                System.out.println("Ups, elegiste el camino equivocado en la historia");
            }else if (opcion==2) {
            for (int i = 3; i <= 5; i++) {
                System.out.println(historia[i]);
            }
                opcion = cargarDatos.nextInt();
                if (opcion == 1) {
                    System.out.println(historia[6]);
                } else {
                    System.out.println(historia[7]);
                }
        }*/

        //Ejersicios con arreglos
        //Escribe un programa que sume todos los elementos de un arreglo de enteros.
        /*System.out.println("Ingrese el tamaño del arreglo");
        int tamañoArrlego = cargarDatos.nextInt();
        int [] numeros = new int[tamañoArrlego];
        for (int indice = 0; indice < tamañoArrlego; indice++){
            System.out.println("Ingrese los numero en el arreglo");
            numeros[indice] = cargarDatos.nextInt();
        }
        int suma = 0;
        for (int indice = 0; indice < tamañoArrlego; indice++){
            suma += numeros[indice];
        }
        System.out.println("La suma de lo numeros en el arreglo es: " +suma);*/
        //Escribe un programa que encuentre el valor máximo en un arreglo de números enteros.
       /*System.out.println("Ingrese el tamaño del arreglo");
        int tamañoArrlego = cargarDatos.nextInt();
        int [] numeros = new int[tamañoArrlego];
        for (int indice = 0; indice < tamañoArrlego; indice++){
            System.out.println("Ingrese los numero en el arreglo");
            numeros[indice] = cargarDatos.nextInt();
        }
        int maximo = numeros[0];
        for (int indice = 0; indice < tamañoArrlego; indice++){
            if (numeros[indice]>maximo){
                maximo = numeros[indice];
            }
        }
        System.out.println("El valor maximo del arreglo es" +maximo);*/
    }
    }

