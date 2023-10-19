class ArtículoCientífico {
    private String título;
    private String autor;
    private String palabrasClave;
    private String nombrePublicación;
    private int año;
    private String resumen;

    // Constructor 1
    public ArtículoCientífico(String título, String autor) {
        this.título = título;
        this.autor = autor;
    }

    // Constructor 2
    public ArtículoCientífico(String título, String autor, String palabrasClave, String nombrePublicación, int año) {
        this(título, autor);
        this.palabrasClave = palabrasClave;
        this.nombrePublicación = nombrePublicación;
        this.año = año;
    }

    // Constructor 3
    public ArtículoCientífico(String título, String autor, String palabrasClave, String nombrePublicación, int año, String resumen) {
        this(título, autor, palabrasClave, nombrePublicación, año);
        this.resumen = resumen;
    }

    public void imprimir() {
        System.out.println("Título: " + título);
        System.out.println("Autor: " + autor);
        System.out.println("Palabras Clave: " + palabrasClave);
        System.out.println("Nombre de la Publicación: " + nombrePublicación);
        System.out.println("Año: " + año);
        System.out.println("Resumen: " + resumen);
    }
}

class Empleado {
    private int identificador;
    private String nombre;
    private String apellidos;
    private int edad;

    // Constructor 1
    public Empleado() {
        identificador = 100;
        nombre = "Nuevo empleado";
        apellidos = "Nuevo empleado";
        edad = 18;
    }

    // Constructor 2
    public Empleado(int identificador, String nombre, String apellidos, int edad) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    // Método para imprimir los valores del empleado
    public void imprimirEmpleado() {
        System.out.println("Identificador: " + identificador);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Edad: " + edad);
    }
}

class Caja {
    private double longitud;
    private double base;
    private double altura;
    private String tipo;

    // Constructor 1
    public Caja(double longitud, double base, double altura, String tipo) {
        this.longitud = longitud;
        this.base = base;
        this.altura = altura;
        this.tipo = tipo;
    }

    // Constructor 2
    public Caja() {
        longitud = 0.0;
        base = 0.0;
        altura = 0.0;
        tipo = "Desconocido";
    }

    // Constructor 3
    public Caja(double longitud) {
        this(longitud, 0.0, 0.0, "Desconocido");
    }

    // Método para imprimir los valores de la caja
    public void imprimirCaja() {
        System.out.println("Longitud: " + longitud);
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Tipo: " + tipo);
    }
}

public class Artc {
    public static void main(String[] args) {
        // Crear un empleado con el constructor 1
        Empleado empleado1 = new Empleado();
        System.out.println("Empleado 1:");
        empleado1.imprimirEmpleado();

        // Crear un empleado con el constructor 2
        Empleado empleado2 = new Empleado(101, "Juan", "Juan", 30);
        System.out.println("\nEmpleado 2:");
        empleado2.imprimirEmpleado();

        // Crear una caja con el constructor 1
        Caja caja1 = new Caja(10.0, 5.0, 3.0, "Tipo 1");
        System.out.println("\nCaja 1:");
        caja1.imprimirCaja();

        // Crear una caja con el constructor 2
        Caja caja2 = new Caja();
        System.out.println("\nCaja 2:");
        caja2.imprimirCaja();

        // Crear una caja con el constructor 3
        Caja caja3 = new Caja(8.0);
        System.out.println("\nCaja 3:");
        caja3.imprimirCaja();
    }
}

