import java.util.Scanner;

public class clase19de11eje1 {
    public static void main(String[] args) {
        //clase 19 1.1 Ejercicio 1 escribir en la consola un saludo "Hola Mundo"  mi nombre y mi edad
        String saludo = "hola Mundo";
        String nombre;
        nombre = "Lorena";
        int edad = 47;
        System.out.println(saludo + " mi Nombre es : " + nombre +" Y mi edad es : " + edad);
        System.out.println("------------------------------------------------------------------");
        System.out.println("*****************************************************************");

        // clase 19 1.1 ejercicio dos definir distintos tipos de datos
        boolean siOno;
        siOno = true;
        char unaletra = 'L';
        String palabras = "vamos bien";
        int numeroentero = 4;
        long numdecimal = 260;
        System.out.println("booleano "+siOno);
        System.out.println("char "+unaletra);
        System.out.println("String "+palabras);
        System.out.println("Int "+numeroentero);
        System.out.println("long "+numdecimal);
        System.out.println("------------------------------------------");
        System.out.println("******************************************");

        //clase 19 1.2 ingresar nombre y edad por Scanner
            Scanner pepe = new Scanner(System.in);
           System.out.print("ingrese su nombre : ");
           String nombreentrada;
           nombreentrada = pepe.nextLine();
           System.out.println("Repito mi nombre es :"+nombreentrada);
           System.out.print("ingrese su edad : ");
           int edadingresada;
           edadingresada = pepe.nextInt();
           System.out.println("Repito mi edad es : "+edadingresada);
           System.out.println("------------------------------------------------");
           System.out.println("************************************************");

        // clase 19 1.2 ejer 2
        int numero1 = 20;
        int numero2 = 5;
        System.out.println("La suma de los numeroa : "+numero1+" y "+numero2 + " es : " + (numero1+numero2));
        System.out.println("La resta de los numeroa : "+numero1+" y "+numero2 + " es : " + (numero1-numero2));
        System.out.println("La multiplicacion de los numeroa : "+numero1+" y "+numero2 + " es : " + (numero1*numero2));
        System.out.println("La division de los numeroa : "+numero1+" y "+numero2 + " es : " + (numero1/numero2));
        System.out.println("el resto de la division entre los numeros : "+numero1+" y "+numero2 + " es : " + (numero1%numero2));
        System.out.println("------------------------------------------------------");
        System.out.println("******************************************************"); 

        //clase 19 1.2 sumar dos numeros ingresados por el usuario
        System.out.println("ingrese el primer numero a sumar : ");
        int numingre1 = pepe.nextInt();
        System.out.println("Ingrese el segundo numero a sumar : ");
        int numingre2 = pepe.nextInt();
        System.out.println("La suma de los numero "+numingre1+" Mas el numero "+numingre2+" es : "+(numingre1+numingre2));
        System.out.println("----------------------------------------------------------------");
        System.out.println("****************************************************************");

        //clase 19 ejercicio 3
        System.out.print("Ingresar el primer numero : ");
        int numingre3 = pepe.nextInt();
        System.out.print("Ingrese el segundo numero : ");
        int numingre4 = pepe.nextInt();
        System.out.println((numingre3 > numingre4) ? "el primer numero es mayor" : "el primer numero no es mayor");
        System.out.println((numingre3 != numingre4) ? "el primer numero es distinto de sugundo" : "ambos numeros son iguales");
        System.out.println(((numingre3 % numingre4) == 0) ? "el primer numero es divisible de segundo numero" : "el primer numero no es divisible de segundo");
        System.out.println("fin de los ejercicios de la clase 19");
    }
}
