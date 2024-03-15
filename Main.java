import java.util.Scanner;

public class Main {
    static Scanner scanner;

    public static void main(String[] args) {
        int opSw;
        System.out.println("Ingrese el ejercicio que quiere hacer: ");


        scanner = new Scanner(System.in);
        opSw = scanner.nextInt();
        //falta validacion


        int[] arreglito = {1, 5, 7, 3, 2};

        switch (opSw) {
            case 1:
                calcularPromedioArreglo(arreglito);
                break;
            case 2:
                esPar(2);//numero de prueba2
                break;
            case 3:
                imprimirPrimos();
                break;
            case 4:

                imprimirPrimosPorRango(scanner.nextInt());
                break;
            case 5:
                verificarSiEsPrimo(scanner.nextInt());
                break;
            case 6:
                sumaPrimeroDiezNaturales();
                break;
            case 7:
                sumarEnCantidadNumerosPositivos();
                break;
            case 8:
                esBisiesto();
                break;
            case 9:
                encontrarASCII();
                break;
            case 10:
                multiplicarDosNumeros();
                break;


        }

        scanner.close();
    }

    static public void calcularPromedioArreglo(int[] arreglito) {
        /*Ejercicio nº1: Calcular el promedio de un arreglo de números enteros.
        Realizar variantes con arreglos ya inicializados e ingreso por teclado.*/
        float promedio = 0;
        float sum = 0;
        for (int i = 0; i < arreglito.length; i++) {
            sum += (float) arreglito[i];
        }
        promedio = sum / arreglito.length;

        System.out.println("El promedio del arreglo es: " + promedio);

    }

    static public void esPar(int num) {
        /*Ejercicio nº2: Calcular si un número es par o no.*/


        if (num % 2 == 0) {
            System.out.println("Es par: " + num);
        } else {
            System.out.println("No es par: " + num);
        }
    }

    static public void imprimirPrimos() {
        int cont = 0, i = 1;
        while (cont < 100) {

            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                cont++;
                System.out.println("Su numero es primo: " + i + " " + "cantidad numeros primos = " + cont);
            } else {
                if (i == 2 || i == 3 || i == 5 || i == 7) {
//Evaluo los casos donde utilizo los numeros del condicional para poder printearlo
                    cont++;
                    System.out.println("Su numero es primo: " + i + " " + "cantidad numeros primos = " + cont);
                }
            }
            i++;
        }
    }

    static public void imprimirPrimosPorRango(int rango) {
        /*  Ejercicio nº4: Mostrar los primeros n números primos.*/
        for (int i = rango; i >= 0; i--) {

            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                System.out.println("Su numero es primo: " + i);
            } else {
                if (i == 2 || i == 3 || i == 5 || i == 7) {//Evaluo los casos donde utilizo los numeros del condicional para poder printearlo
                    System.out.println("Su numero es primo: " + i);
                }
            }

        }
    }

    public static void verificarSiEsPrimo(int num) {
        /*Ejercicio nº6: Ingresar un número o tantos como quiera el usuario y revisar si es primo.*/
        if (num % 2 != 0 && num % 3 != 0 && num % 5 != 0 && num % 7 != 0) {
            System.out.println("Su numero es primo: " + num);
        } else {
            if (num == 2 || num == 3 || num == 5 || num == 7) {//Evaluo los casos donde utilizo los numeros del condicional para poder printearlo
                System.out.println("Su numero es primo: " + num);

            }
        }
    }


    public static void sumaPrimeroDiezNaturales() {
        /*Ejercicio nº7: Encontrar la suma de los primeros 10 números naturales.*/
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void sumarEnCantidadNumerosPositivos() {
        /*Ejercicio nº8: Sumar (en cantidad, no acumular) cuántos números positivos ingresa un usuario.*/

        char op = 's';
        int num = 0;
        int cont = 0;
        do {
            num = scanner.nextInt();


            if (num > 0) {
                cont++;
            }
            System.out.println("Desea seguir ingresando numeros?: s/n");
            scanner.nextLine();// limpia el buffer para poder guardar el char sino tira error
            op = scanner.nextLine().charAt(0);


        } while (op == 's');

        System.out.println("La cantidad de numeros positivos ingresados es: " + cont);
    }

    public static void esBisiesto()
    {
        int anio= scanner.nextInt();
        if(anio % 4 == 0)
        {
            if (anio % 100 != 0)
            {
                System.out.println("El año es bisiesto");
            }
            else if(anio % 100 == 0 && anio % 400 == 0)
            {
                System.out.println("El año es bisiesto");
            }
            else{
                System.out.println("No es bisiesto");
            }
        }
        else
        {
            System.out.println("No es bisiesto");
        }


    }
    public static void encontrarASCII()
    {
        /*Ejercicio nº10: Encontrar el valor ASCII de un carácter.*/
        char letra= 's';

        System.out.println("Ingrese la letra que desee transformar: ");
        scanner.nextLine();
        letra = scanner.next().charAt(0);
        int numAscii= letra;
        System.out.println(numAscii);
    }
    public static void multiplicarDosNumeros()
    {
        /*Ejercicio nº11: Multiplicar dos números.*/
        int num1 = 0,num2 = 0,multiplicacion = 0;
        System.out.println("Ingrese el primer numero a multiplicar: ");
        num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero a multiplicar: ");
        num2 = scanner.nextInt();

        multiplicacion = num1*num2;

        System.out.println("Multiplicacion: "+multiplicacion);

    }

    public static void 

}
