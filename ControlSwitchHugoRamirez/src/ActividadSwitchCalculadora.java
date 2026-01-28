import java.util.Scanner;

public class ActividadSwitchCalculadora {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("=== Calculadora con Switch ===");
        System.out.println("1) Sumar");
        System.out.println("2) Restar");
        System.out.println("3) Multiplicar");
        System.out.println("4) Dividir");

        System.out.print("Selecciona una opción: ");
        int opcion = entrada.nextInt();

        System.out.print("Ingresa el primer número (a): ");
        double a = entrada.nextDouble();

        System.out.print("Ingresa el segundo número (b): ");
        double b = entrada.nextDouble();

        double resultado;

        switch (opcion) {
            case 1:
                resultado = a + b;
                System.out.println("Operación seleccionada: Suma");
                System.out.println("a = " + a + " | b = " + b);
                System.out.println("Resultado: " + resultado);
                break;

            case 2:
                resultado = a - b;
                System.out.println("Operación seleccionada: Resta");
                System.out.println("a = " + a + " | b = " + b);
                System.out.println("Resultado: " + resultado);
                break;

            case 3:
                resultado = a * b;
                System.out.println("Operación seleccionada: Multiplicación");
                System.out.println("a = " + a + " | b = " + b);
                System.out.println("Resultado: " + resultado);
                break;

            case 4:
                System.out.println("Operación seleccionada: División");
                System.out.println("a = " + a + " | b = " + b);

                if (b == 0) {
                    System.out.println("No se puede dividir entre cero");
                } else {
                    resultado = a / b;
                    System.out.println("Resultado: " + resultado);
                }
                break;

            default:
                System.out.println("Opción inválida");
                break;
        }

        entrada.close();
    }
}
