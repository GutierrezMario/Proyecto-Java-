public class App {
    public static void main(String[] args) {
        // 1. Creación de una Carrera
        Carrera ingenieriaSistemas = new Carrera("Ingeniería de Sistemas");

        // 2. Creación de estudiantes
        Estudiante estudiante1 = new Estudiante("Ana", "Perez", 20, "Ingeniería de Sistemas");
        Estudiante estudiante2 = new Estudiante("Luis", "González", 22, "Ingeniería de Sistemas");
        Estudiante estudiante3 = new Estudiante("Sofía", "Castro", 21, "Ingeniería de Sistemas");

        // 3. Creación de materias con calificaciones
        Materia programacion1 = new Materia("Programacion 1", "PROG101", 6, 9.5);
        Materia baseDeDatos = new Materia("Base de Datos", "BD202", 5, 8.0);
        Materia matematicaII = new Materia("Matematica II", "MAT203", 5, 7.5);
        Materia paradigmas = new Materia("Paradigmas de programacion", "PARA301", 6, 9.0);

        // 4. Asignar materias a los estudiantes
        estudiante1.agregarMateria(programacion1);
        estudiante1.agregarMateria(baseDeDatos);

        estudiante2.agregarMateria(baseDeDatos);
        estudiante2.agregarMateria(matematicaII);
        estudiante2.agregarMateria(paradigmas);

        estudiante3.agregarMateria(programacion1);
        estudiante3.agregarMateria(paradigmas);

        // 5. Agregar estudiantes a la carrera
        ingenieriaSistemas.agregarEstudiante(estudiante1);
        ingenieriaSistemas.agregarEstudiante(estudiante2);
        ingenieriaSistemas.agregarEstudiante(estudiante3);

        // 6. Demostrar el cálculo de promedio y listar estudiantes
        System.out.println("--- Información de los estudiantes de la carrera de " + ingenieriaSistemas.getNombre() + " ---");
        for (Estudiante est : ingenieriaSistemas.getEstudiantes()) {
            System.out.println("Nombre: " + est.getNombre() + " " + est.getApellido());
            System.out.println("Promedio calculado: " + String.format("%.2f", est.calcularPromedio()));
            System.out.println("------------------------------------");
        }

        // 7. Demostrar el método de búsqueda
        System.out.println("\n--- Buscando un estudiante ---");
        Estudiante estudianteEncontrado = ingenieriaSistemas.buscarEstudiante("Luis");
        if (estudianteEncontrado != null) {
            System.out.println("Estudiante encontrado: " + estudianteEncontrado.getNombre() + " " + estudianteEncontrado.getApellido());
        } else {
            System.out.println("Estudiante no encontrado.");
        }
    }
}