package pilaarraylist;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class PilaArrayList {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Stack<LinkedList<Accion>> historial = new Stack();
        LinkedList<Accion> cambio = new LinkedList<>();

        mostrarCambios(historial);

        realizarCambios(cambio, historial);
        
        mostrarCambios(historial);
        
        mostrarCambios(historial);

    }

    public static void realizarCambios(LinkedList<Accion> cambio, Stack<LinkedList<Accion>> historial) {
        Accion objAccion = new Accion();
        System.out.println("Vamos a realizar cambios en el documento, entonces \n¿Cuál es el tipo de cambio que quiere realizar en el documento?");
        String tipo = sc.nextLine();
        objAccion.setTipo(tipo);

        System.out.println("Describa el cambio que va a realizar");
        String descripcion = sc.nextLine();
        objAccion.setDescripcion(descripcion);
        cambio.add(objAccion);
        historial.push(cambio);
    }

    public static void mostrarCambios(Stack historial) {
        int i=0;
        if (historial.isEmpty()) {
            System.out.println("No se han realizado cambios en el documento");

        } else {

            System.out.println("Los cambios en el documento son:");
            while (!historial.isEmpty()) {

                System.out.println(i+"). "+historial.pop());
                i++;
            }
        }
    }

    public static String revertirCambios(Stack historial){
        mostrarCambios(historial);
        System.out.println("¿Desea eliminar el primer cambio realizado? true/false");
        Boolean v=sc.nextBoolean();
        if (v) {
            
            System.out.println("Se ha deshecho el cambio: "+);
        }
        return"";
    }
}
