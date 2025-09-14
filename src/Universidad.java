import java.util.ArrayList;
import java.util.List;

public class Universidad {
    // Atributos privados
    private String nombre;
    private String direccion;
    private List<Estudiante> estudiantes;

    // Constructor
    public Universidad(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.estudiantes = new ArrayList<>();
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    // Método para agregar un estudiante a la universidad
    public void agregarEstudiante(Estudiante estudiante) {
        if (estudiante != null) {
            this.estudiantes.add(estudiante);
        }
    }
}