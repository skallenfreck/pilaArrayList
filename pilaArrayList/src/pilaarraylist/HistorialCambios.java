
package pilaarraylist;

import java.util.LinkedList;
import java.util.Stack;


public class HistorialCambios {
    
    private Stack<LinkedList<Accion>> historial;

    public HistorialCambios() {
    }

    public HistorialCambios(Stack<LinkedList<Accion>> historial) {
        this.historial = historial;
    }

    public Stack<LinkedList<Accion>> getHistorial() {
        return historial;
    }

    public void setHistorial(Stack<LinkedList<Accion>> historial) {
        this.historial = historial;
    }

    @Override
    public String toString() {
        return "HistorialCambios{" + "historial=" + historial + '}';
    }
    
    
    
}
