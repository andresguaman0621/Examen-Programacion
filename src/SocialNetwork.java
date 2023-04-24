import java.util.*;

public class SocialNetwork {
    private Queue<Persona> cola;
    private PriorityQueue<Persona> colaPrioridad;
    private Stack<Persona> pila;

    public SocialNetwork() {
        cola = new LinkedList<Persona>();
        colaPrioridad = new PriorityQueue<Persona>(new Comparator<Persona>() {
            public int compare(Persona p1, Persona p2) {
                return p2.getPrioridad() - p1.getPrioridad();
            }
        });
        pila = new Stack<Persona>();
    }

    public void agregarPersona(Persona persona) {
        if (!cola.contains(persona) && !colaPrioridad.contains(persona)) {
            for (Persona p : colaPrioridad) {
                if (p.getNombreCompleto().equals(persona.getNombreCompleto())) {
                    return;
                }
            }
            cola.add(persona);
        }
    }

    public List<Persona> buscarPorId(int id) {
        List<Persona> resultados = new ArrayList<Persona>();
        for (Persona p : cola) {
            if (p.getId() == id) {
                resultados.add(p);
            }
        }
        for (Persona p : colaPrioridad) {
            if (p.getId() == id) {
                resultados.add(p);
            }
        }
        return resultados;
    }

    public List<Persona> buscarPorPrioridad(int prioridad) {
        List<Persona> resultados = new ArrayList<Persona>();
        for (Persona p : colaPrioridad) {
            if (p.getPrioridad() >= prioridad) {
                resultados.add(p);
            }
        }
        return resultados;
    }

    public List<Persona> buscarEnCola(boolean enCola) {
        List<Persona> resultados = new ArrayList<Persona>();
        if (enCola) {
            resultados.addAll(cola);
        } else {
            resultados.addAll(colaPrioridad);
        }
        return resultados;
    }
}


