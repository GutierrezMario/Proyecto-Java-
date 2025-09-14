import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    // Atributos privados
    private String nombre;
    private String apellido;
    private int edad;
    private String carrera;
    private double promedio;

    // Relación con la clase Materia (un estudiante tiene una lista de materias)
    private List<Materia> materias;

    // Constructor que inicializa los atributos y la lista de materias
    public Estudiante(String nombre, String apellido, int edad, String carrera) {
        setNombre(nombre);
        setApellido(apellido);
        setEdad(edad);
        this.carrera = carrera;
        this.materias = new ArrayList<>();
    }

    // Métodos Getter y Setter con validaciones
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.err.println("Error: El nombre no puede estar vacío.");
        }
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        if (apellido != null && !apellido.trim().isEmpty()) {
            this.apellido = apellido;
        } else {
            System.err.println("Error: El apellido no puede estar vacío.");
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 16) {
            this.edad = edad;
        } else {
            System.err.println("Error: La edad debe ser mayor a 16 años.");
        }
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getPromedio() {
        return promedio;
    }

    // Método para agregar una materia a la lista del estudiante
    public void agregarMateria(Materia materia) {
        if (materia != null) {
            this.materias.add(materia);
        }
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    // Método para calcular el promedio de calificaciones de las materias
    public double calcularPromedio() {
        if (materias.isEmpty()) {
            return 0.0;
        }
        double sumaCalificaciones = 0.0;
        for (Materia materia : materias) {
            sumaCalificaciones += materia.getCalificacion();
        }
        this.promedio = sumaCalificaciones / materias.size();
        return this.promedio;
    }
}