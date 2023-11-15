package Funciones_Java;

public class Main {
    public static void main(String[] args){
       /* double sumatoria = 0;
        sumatoria += calcularAreaCuadrado(85.5, 25.3);
        sumatoria += calcularAreaCuadrado(5.3, 8.2);
        System.out.println("la sumatoria de los areas es de: "+sumatoria);

        calcularAreaTriangulo(25, 30);*/

        String newPassword = generadorDeContraseña();
        System.out.println(newPassword);
    }

    /*private static double calcularAreaCuadrado(double lado, double lado2){
        return lado * lado2;
    }

    //Hacer una función que calcule el área de un triángulo. Al llamarla debe devolver el área del triángulo.
    private  static  void calcularAreaTriangulo(float base, float altura) {
        float area = (base * altura)/2;
        System.out.println("El area del triangulo es de: "+area);
    }*/
    //Crear una función que sea un generador de contraseñas. Al llamarla debe devolver una contraseña (por ejemplo, puedes utilizar Math.random() para devolver un número aleatorio que podría ser una contraseña.
    private static String generadorDeContraseña(){
        double aleatorio = Math.random() * 1000000;
        long numero = Math.round(aleatorio);
        return "fjsflsf" + numero;

    }

}
