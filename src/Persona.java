import java.util.*;
public class Persona {
    private int id;
    private String nombreCompleto;
    private int edad;
    private int prioridad;
    private List<Persona> amigos;

    public Persona(int id, String nombreCompleto, int edad, int prioridad) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.prioridad = prioridad;
        amigos = new ArrayList<Persona>();
    }

    public int getId() {
        return id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public List<Persona> getAmigos() {
        return amigos;
    }

    public void agregarAmigo(Persona amigo) {
        amigos.add(amigo);
    }

    public void eliminarAmigo(Persona amigo) {
        amigos.remove(amigo);
    }
}