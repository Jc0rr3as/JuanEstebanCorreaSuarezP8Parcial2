import java.util.Scanner;
import java.util.Stack;
public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        metodos metodos = new metodos();
        Stack<llamada> pilaLlamadas = new Stack<>();
        boolean continuar = true;
        while(continuar){
            System.out.println("Seleccione una opción:");
            System.out.println("1. Ingresar llamada");
            System.out.println("2. Eliminar última llamada");
            System.out.println("3. Mostrar llamada reciente");
            System.out.println("4. Mostrar todas las llamadas");
            System.out.println("5. Salir");
            int opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer
            switch(opcion){
                case 1:
                    pilaLlamadas = metodos.llamadas();
                    break;
                case 2:
                    pilaLlamadas = metodos.eliminarUltimaLlamada(pilaLlamadas);
                    break;
                case 3:
                    metodos.mostrarLlamadaReciente(pilaLlamadas);
                    break;
                case 4:
                    metodos.mostrarTodasLasLlamadas(pilaLlamadas);
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }
        sc.close();
    }
}
