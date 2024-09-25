package pilaarraylist;

import java.util.ArrayList;
import java.util.Stack;

public class PilaArrayList {
    
    public static void main(String[] args) {
        Stack<ArrayList<Accion>> historial = new Stack();
        
        realizarCambios(historial);
        mostrarCambios(historial);
        System.out.println("");
        
        int i=0;
        do{
            revertirCambios(historial);
            mostrarCambios(historial);
            System.out.println("");
            i++;
        }while(i!=5);
        
    }

    public static void realizarCambios(Stack<ArrayList<Accion>> historial) {
        
        ArrayList<Accion> cambio1 = new ArrayList<>();
        Accion accion1 = new Accion("Cambio Multimedia", "Ajuste de imagen central.");
        cambio1.add(accion1);
        historial.push(cambio1);
        
        ArrayList<Accion> cambio2 = new ArrayList<>();
        Accion accion2 = new Accion("Cambio Formato", "Ajuste de márgenes a 2cm");
        cambio2.add(accion2);
        historial.push(cambio2);
        
        ArrayList<Accion> cambio3 = new ArrayList<>();
        Accion accion3 = new Accion("Cambio Tipografia", "Cambio de fuente a Arial");
        cambio3.add(accion3);
        historial.push(cambio3);
        
        ArrayList<Accion> cambio4 = new ArrayList<>();
        Accion accion4 = new Accion("Correción", "Correción tildes");
        cambio4.add(accion4);
        historial.push(cambio4);
        
        ArrayList<Accion> cambio5 = new ArrayList<>();
        Accion accion5 = new Accion("Cambio Tipografia", "Ajuste tamaño de fuente a 11");
        cambio5.add(accion5);
        historial.push(cambio5);
        
    }

    public static void mostrarCambios(Stack<ArrayList<Accion>> historial) {
        if (historial.isEmpty()) {
            System.out.println("No se han realizado cambios en el documento");
        } else {
            System.out.println("Los cambios en el documento son:");
            for(int i=0; i < historial.size(); i++){
                ArrayList<Accion> cambio = historial.get(i);
                for (int j=0; j<cambio.size(); j++) {
                    Accion accion = cambio.get(j);
                    System.out.println((i + 1) + "). " + accion);
                }
            }
        }
    }

    public static void revertirCambios(Stack<ArrayList<Accion>> historial){
        if(!historial.isEmpty()){
            ArrayList<Accion> ultimoCambio = historial.pop();
            System.out.println("Se ha deshecho el ultimo cambio: ");
            
            for (int i = 0; i < ultimoCambio.size(); i++) {
                Accion accion = ultimoCambio.get(i);
                System.out.println(accion.revertir());
            }
        }else{
            System.out.println("No hay cambios para deshacer.");
        }
    }
}
