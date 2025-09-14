import java.util.ArrayList;
import java.util.List;

public class Carrera {
    // Atributos privados
    private String nombre;
    private List<Estudiante> estudiantes;

    // Constructor
    public Carrera(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }

    // Métodos para gestionar la lista de estudiantes
    public void agregarEstudiante(Estudiante estudiante) {
        if (estudiante != null) {
            this.estudiantes.add(estudiante);
        }
    }

    public void listarEstudiantes() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes inscritos en esta carrera.");
            return;
        }
        System.out.println("--- Estudiantes de la carrera de " + nombre + " ---");
        for (Estudiante estudiante : estudiantes) {
            System.out.println("Nombre: " + estudiante.getNombre() + " " + estudiante.getApellido() +
                               ", Promedio: " + String.format("%.2f", estudiante.getPromedio()));
        }
    }

    public Estudiante buscarEstudiante(String nombreBuscado) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNombre().equalsIgnoreCase(nombreBuscado) ||
                (estudiante.getNombre() + " " + estudiante.getApellido()).equalsIgnoreCase(nombreBuscado)) {
                return estudiante;
            }
        }
        return null;
    }

    public String getNombre() { return nombre; }
    public List<Estudiante> getEstudiantes() { return estudiantes; }
}