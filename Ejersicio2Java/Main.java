package Ejersicio2Java;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.net.Inet4Address;
import java.util.Random;
import java.util.Scanner;

public class Main {

    //Metodo para calcular el numero mayor, continua en la linea 40
    /*public  static int obtenerMayor(Integer a, Integer b, Integer c){
        Integer numeroMayor = a;

        if (b > numeroMayor) {
            numeroMayor = b;
        }
        if (c > numeroMayor) {
            numeroMayor = c;
        }

        return numeroMayor;
    }*/

    //Aqui creamos el metodo que eligira al ganador
    public static void determinarGandor(String usuario, String computadora){
        if (usuario.equals(computadora)){
            System.out.println("Genial, tiene un empate");
        } else if (usuario.equals("piedra") && computadora.equals("tijera") ||
        usuario.equals("papel") && computadora.equals("piedra") ||
        usuario.equals("tijera") && computadora.equals("pepel")) {
            System.out.println("El ganador es el usuario");
        } else {
            System.out.println("Gana la computadora");
        }
    }
    public static  void main(String[] args){
        Scanner cargarDato = new Scanner(System.in);

        /*System.out.println("Ingrese el primer numero");
        Integer numero1 = cargarDato.nextInt();

        System.out.println("Ingrese el segundo numero");
        Integer numero2 = cargarDato.nextInt();

        System.out.println("Ingrese el tercer numero");
        Integer numero3 = cargarDato.nextInt();

        if (numero1 > numero2 && numero1 > numero3) {
             System.out.println("El numero mayor es " + numero1);
        } else if (numero2 > numero1 && numero2 > numero3 ) {
            System.out.println("El numero mayor es "+numero2);
        } else if (numero3 > numero1 && numero3 > numero2){
            System.out.println("El numero mayor es " +numero3);
        } */

        /*System.out.println("Ingrese el primer numero");
        Integer numero1 = cargarDato.nextInt();

        System.out.println("Ingrese el segundo numero");
        Integer numero2 = cargarDato.nextInt();

        System.out.println("Ingrese el tercer numero");
        Integer numero3 = cargarDato.nextInt();

        Integer numeroMayor = obtenerMayor(numero1, numero2, numero3);

        System.out.println("El numero mayor es "+numeroMayor);*/

        //Programa buscador de paises
        /*System.out.println("Escriba el pais que desea consultar");
        String escribirPais = cargarDato.nextLine();
        System.out.println("https://www.google.com/maps/search/" + escribirPais);*/

        //Programa buscadot de tweets
        /*System.out.println("Ingrese el nombre de un usario en una sola palabra, Ejemplo 'Messi'");
        String escribirUsuario = cargarDato.nextLine();
        System.out.println("https://twitter.com/search?q="+escribirUsuario);*/

        //Programa para llamar una persona por WhatsApp
        /*System.out.println("Ingrese el numero telefonico a quien desea llamar");
        long cargarNumero = cargarDato.nextLong();
        System.out.println("https://api.whatsapp.com/send?phone="+cargarNumero);*/

        //Programa que cuenta una hostoria interactiva
        /*System.out.println("Es una noche estrellada, te encuentras en un bosque misterioso: \n" +
                "1) Exploras la oscuridad en busca de la fuente de un susurro escalofriante\n" +
                "2) Sigues el sendero iluminado hacia una pequeña cabaña acogedora\n");

        Integer opcion = cargarDato.nextInt();
        if (opcion == 1){
            System.out.println("Hasta Aqui llego la hostiria JAJAJA");
        }else if (opcion == 2){
            System.out.println("Decides seguir el sendero iluminado hacia la pequeña cabaña acogedora. " +
                    "Al llegar a la cabaña, te das cuenta de que hay dos puertas: \n" +
                    "1) Entras por la puerta de la izquierda \n" +
                    "2) Optas por la puerta de la derecha\n");
            Integer op2 = cargarDato.nextInt();
            if (op2 == 1) {
                System.out.println("Al abrir la puerta de la izquierda, te encuentras con una " +
                        "habitación llena de tesoros brillantes y mágicos. Te maravillas con las joyas y " +
                        "los objetos preciosos que llenan la sala. Te das cuenta de que has encontrado el legendario " +
                        "tesoro perdido del bosque. Con tu corazón lleno de emoción y riquezas, decides regresar " +
                        "a casa para compartir tu increíble aventura con el mundo. ¡Felicidades, has tenido " +
                        "un final exitoso en tu búsqueda!");
            } else if (op2 ==2){
                System.out.println("Ups, has escogio la opcion incorrecta");
            }
        }*/

        //Otra forma de hacer la historia usando switch and case
        /*System.out.println("Es una noche estrellada, te encuentras en un bosque misterioso: \n" +
                "1) Exploras la oscuridad en busca de la fuente de un susurro escalofriante\n" +
                "2) Sigues el sendero iluminado hacia una pequeña cabaña acogedora\n");

        Integer opcion = cargarDato.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Opcion incorrecta, debiiste usar la opcion 2");
                break;

            case 2:
                System.out.println("Decides seguir el sendero iluminado hacia la pequeña cabaña acogedora. " +
                        "Al llegar a la cabaña, te das cuenta de que hay dos puertas: \n" +
                        "1) Entras por la puerta de la izquierda \n" +
                        "2) Optas por la puerta de la derecha\n");
                Integer op2 = cargarDato.nextInt();
                switch (op2) {
                    case 1:
                        System.out.println("Al abrir la puerta de la izquierda, te encuentras con una habitación llena de tesoros brillantes y mágicos. Te maravillas con las joyas y los objetos preciosos que llenan la sala. " +
                                        "Te das cuenta de que has encontrado el legendario tesoro perdido del bosque. " +
                                        "Con tu corazón lleno de emoción y riquezas, decides regresar a casa para compartir tu increíble aventura con el mundo." +
                                        "¡Felicidades, has tenido  un final exitoso en tu búsqueda!");
                        break;

                    case 2:
                        System.out.println("Opcion incorrecta debiste usar la opicio 1");
                    break;

                    default:
                        System.out.println("Debiste usar la opcion 1 o 2 ");

                }
                break;

            default:
                System.out.println("Opcion incorrecta debiste usar la opcion 1 o 2");
        }*/

        //Programa para calcular un promedio de 3 numero

        /*System.out.println("Ingrese el numero");
        double num1 = cargarDato.nextDouble();
        System.out.println("Ingrese el numero");
        double num2 = cargarDato.nextDouble();
        System.out.println("Ingrese el numero");
        double num3 = cargarDato.nextDouble();

        double promedio = num1+num2+num2/3;

        System.out.println("El promedio es " + promedio);*/

        //Prigama que genera numeros del 1 al 100  con bucle while
        /*System.out.println("Generador del numero del 1  al 100");
        Integer numero = 0;
        while (numero<100){
            numero++;
            System.out.println("Numero " + numero);
        }*/

        //Programa para jugar piedra papel o tijera
        //Primero me aseguro de que el ususario digite las elecciones de papel, piedramo tijera

        System.out.println("Bienvenidos al juego de piedra papel o tijera " +
                "Escoje tu opcion");
        String cargarEleccion = cargarDato.nextLine();
        if (!cargarEleccion.equals("papel")&& !cargarEleccion.equals("tijera")&& !cargarEleccion.equals("piedra")) {
            System.out.println("Ingresaste una opcion invalida, recuerda que solo debes de escribir piedra, papel o tijera");
        }

        //Ahora me aseguro de escoger la opcion de la computadora

        String[] eleccionPC = {"piedra", "papel", "tijera"};
        Random random = new Random();
        int indicePC = random.nextInt(eleccionPC.length);
        String opcionDelaComputadora = eleccionPC[indicePC];

        //Mostramos las elecciones del ususario y la computadora
        System.out.println("Usted elegio " + cargarEleccion);
        System.out.println("La computadora eligio " + opcionDelaComputadora);

        //Declaramos el metodo que elegira al ganados
        determinarGandor(cargarEleccion, opcionDelaComputadora);

    }
}
