import java.util.Scanner;
import java.util.Stack;
public class metodos {
    Scanner sc = new Scanner(System.in);
    Stack<llamada> pilaLlamadas = new Stack<>();
    public Stack<llamada> llamadas(){
        boolean continuar = true;
        while(continuar){
            System.out.println("Ingrese el numero de la llamada:");
        String numero = sc.nextLine();
        System.out.println("Ingrese el nombre del contacto:");
        String nombreContacto = sc.nextLine();
        System.out.println("Ingrese la duración de la llamada:");
        String duracion = sc.nextLine();
        System.out.println("Ingrese la fecha de la llamada:");
        String fecha = sc.nextLine();
        llamada llamada = new llamada(numero, nombreContacto, duracion, fecha);
        pilaLlamadas.push(llamada);
        System.out.println("¿Desea ingresar otra llamada? (s/n)");
        String respuesta = sc.nextLine();
        if(respuesta.equalsIgnoreCase("n")){
            continuar = false;
        }
    }
    return pilaLlamadas;
}
    public Stack<llamada> eliminarUltimaLlamada(Stack<llamada> pilaLlamadas){
        if(!pilaLlamadas.isEmpty()){
            pilaLlamadas.pop();
            System.out.println("Se ha eliminado la última llamada.");
        } else {
            System.out.println("No hay llamadas para eliminar.");
        }
        return pilaLlamadas;
    }
    public void mostrarLlamadaReciente(Stack<llamada> pilaLlamadas){
        if(!pilaLlamadas.isEmpty()){
            llamada llamadaReciente = pilaLlamadas.peek();
            System.out.println("Número: " + llamadaReciente.getNumero());
            System.out.println("Nombre del contacto: " + llamadaReciente.getNombreContacto());
            System.out.println("Duración: " + llamadaReciente.getDuracion());
            System.out.println("Fecha: " + llamadaReciente.getFecha());
        } else {
            System.out.println("No hay llamadas registradas.");
        }
    }
    public void mostrarTodasLasLlamadas(Stack<llamada> pilaLlamadas){
        if(!pilaLlamadas.isEmpty()){
            System.out.println("Llamadas registradas:");
            for(llamada llamada : pilaLlamadas){
                System.out.println("Número: " + llamada.getNumero());
                System.out.println("Nombre del contacto: " + llamada.getNombreContacto());
                System.out.println("Duración: " + llamada.getDuracion());
                System.out.println("Fecha: " + llamada.getFecha());
                System.out.println("-------------------------");
            }
        } else {
            System.out.println("No hay llamadas registradas.");
        }
    }
}