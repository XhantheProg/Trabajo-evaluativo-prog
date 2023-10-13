package Automovil;



public class automovil {
    private String marca;
    private int modelo;
    private double motor;
    private Combustible tipoCombustible;
    private TipoAutomovil tipo;
    private int numPuertas;
    private int numAsientos;
    private int velocidadMaxima;
    private Color color;
    private int velocidadActual;

    // Enumerados para tipo de combustible, tipo de automóvil y color
    public enum Combustible {
        GASOLINA,
        BIOETANOL,
        DIESEL,
        BIODIESEL,
        GAS_NATURAL
    }

    public enum TipoAutomovil {
        CIUDAD,
        SUBCOMPACTO,
        COMPACTO,
        FAMILIAR,
        EJECUTIVO,
        SUV
    }

    public enum Color {
        BLANCO,
        NEGRO,
        ROJO,
        NARANJA,
        AMARILLO,
        VERDE,
        AZUL,
        VIOLETA
    }

    public automovil(String marca, int modelo, double motor, Combustible tipoCombustible,
                     TipoAutomovil tipo, int numPuertas, int numAsientos,
                     int velocidadMaxima, Color color) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipo = tipo;
        this.numPuertas = numPuertas;
        this.numAsientos = numAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
        this.velocidadActual = 0; // Velocidad inicial en 0
    }

    // Métodos getter y setter para velocidadActual
    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    // Método para acelerar el automóvil
    public void acelerar(int incremento) {
        if (velocidadActual + incremento <= velocidadMaxima) {
            velocidadActual += incremento;
        } else {
            System.out.println("No se puede acelerar más allá de la velocidad máxima.");
        }
    }

    // Método para desacelerar el automóvil
    public void desacelerar(int decremento) {
        if (velocidadActual - decremento >= 0) {
            velocidadActual -= decremento;
        } else {
            System.out.println("No se puede desacelerar a una velocidad negativa.");
        }
    }

    // Método para frenar el automóvil
    public void frenar() {
        velocidadActual = 0;
    }

    // Método para calcular el tiempo estimado de llegada
    public double calcularTiempoEstimado(int distancia) {
        return (double) distancia / velocidadActual;
    }

    // Método para mostrar los valores de los atributos del automóvil
    public void mostrarDatos() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Motor: " + motor + " litros");
        System.out.println("Combustible: " + tipoCombustible);
        System.out.println("Tipo de Automóvil: " + tipo);
        System.out.println("Número de Puertas: " + numPuertas);
        System.out.println("Número de Asientos: " + numAsientos);
        System.out.println("Velocidad Máxima: " + velocidadMaxima + " km/h");
        System.out.println("Color: " + color);
        System.out.println("Velocidad Actual: " + velocidadActual + " km/h");
    }


}
