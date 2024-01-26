import java.util.Scanner;

public class calificacionesalumnos {

    //estos son los atributos
    private String nombre;
    private double[] calificaciones;
// lo siguiente forma parte de un constructor
    public calificacionesalumnos(String nombre, double[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }
// 1er metodo
    public double calcularPromedio() {
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }
//2 metodo
    public char obtenerCalificacionFinal(double promedio) {
        if (promedio <= 50) {
            return 'F';
        } else if (promedio <= 60) {
            return 'E';
        } else if (promedio <= 70) {
            return 'D';
        } else if (promedio <= 80) {
            return 'C';
        } else if (promedio <= 90) {
            return 'B';
        } else {
            return 'A';
        }
    }
//3er metodo
    public void imprimirResultados() {
        System.out.println("Nombre del estudiante: " + nombre);
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Calificación " + (i + 1) + ": " + calificaciones[i]);
        }
        double promedio = calcularPromedio();
        char calificacionFinal = obtenerCalificacionFinal(promedio);

        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calificacionFinal);
    }
    //Metodo, para leer la información y realizar los calculos correspondientes

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del estudiante: ");
        String nombreEstudiante = scanner.nextLine();

        double[] calificacionesEstudiante = new double[5];
        for (int i = 0; i < calificacionesEstudiante.length; i++) {
            System.out.print("Ingrese la calificación " + (i + 1) + ": ");
            calificacionesEstudiante[i] = scanner.nextDouble();
        }

        calificacionesalumnos alumno = new calificacionesalumnos(nombreEstudiante, calificacionesEstudiante);
        alumno.imprimirResultados();

        scanner.close();
    }
}
