import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Queue micola = new Queue();
        Scanner scanner = new Scanner(System.in);
        String valorUsuario = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor introduzca un número: ");
        valorUsuario = sc.nextInt();
        sc.nextLine();
        micola.enqueue(valorUsuario);

        System.out.println("Por favor introduzca un número: ");
        valorUsuario = sc.nextInt();
        sc.nextLine();
        micola.enqueue(valorUsuario);

        System.out.println("Por favor, seleccione una opcion");
        System.out.println("1. Enceder impresora");
        System.out.println("2. Apagar impresora");
        System.out.println("3. Añadir trabajo");
        System.out.println("4. Ver lista de trabajo");
        System.out.println("5. Imprimir");
        System.out.println("6. Salir");


        valorUsuario = sc.nextInt();

        int operando1 = micola.pop();
        int operando2 = miPila.pop();
        int solucion = 0;

        switch(valorUsuario) {
            case 1:
                solucion = operando1 + operando2;
                break;
            case 2:
                solucion = operando1 - operando2;
                break;
            case 3:
                solucion = operando1 * operando2;
                break;
            case 4:
                solucion = operando1 / operando2;
                break;
            default:
                System.out.println("Es usted demasiado totufo para utilizar esta aplicación");
                break;
        }
        System.out.println("El resultado es: " + solucion);
    }
}

    }
}
