import java.util.Scanner;
public class Main {
    private static double a;
    private static double b;
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Bienvenido a la calculiadora");
        ingresarNumeros();
        out1:
        while (true) {
            System.out.println("Numero A: " + a + " " + "Numero B: " + b);
            menu();
            String opcion = teclado.next();
            switch (opcion) {
                case "1":
                    double suma = realizarSuma();
                    mostrarResultado(suma);
                    break;
                case "2":
                    double resta = realizarResta();
                    mostrarResultado(resta);
                    break;
                case "3":
                    realizarDivision();
                    break;
                case "4":
                    double multi = realizarMultiplicacion();
                    mostrarResultado(multi);
                case "5":
                    ingresarNumeros();
                    break;
                case "0":
                    System.out.println("Adios");
                    break out1;
                default:
                    System.out.println("ingrese una opcion correcta");
                    break;
            }
        }


    }

    private static double realizarMultiplicacion() {
        return a*b;
    }

    private static void realizarDivision() {
        if(b==0){
            System.out.println("error: nose puede dividir por 0");
            return;
        }
        double division = a/b;
        mostrarResultado(division);
    }

    public static double realizarResta() {
        return a - b;
    }
    public static void mostrarResultado(double resultado){
        System.out.println("El resultado es: "+resultado);
    }

    public static void ingresarNumeros(){
        try {
            System.out.println("Ingrese el numero de A: ");
            a = teclado.nextDouble();
            System.out.println("Ingrese el numero de B: ");
            b= teclado.nextDouble();

        }catch (Exception e){
            System.out.println("error, entrada no valida");
            ingresarNumeros();

        }
        if (teclado.hasNextLine()) teclado.next();
    }
    public static void menu(){
        System.out.println("Elija que operación quiere realizar");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Dividir");
        System.out.println("4. Multiplicar");
        System.out.println("5. Cambiar los valores de A y B");
        System.out.println("0. Salir");
    }
    public static double realizarSuma(){
        return a + b;
    }
}


