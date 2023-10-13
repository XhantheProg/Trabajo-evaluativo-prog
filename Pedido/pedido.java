package Pedido;

public class pedido {

        public double calcularValorPedido(String primerPlato, String bebida) {
            // Lógica para calcular el valor del pedido con un primer plato y una bebida.
            // Puedes asignar valores fijos o consultar una base de datos para obtener los precios.
            double precioPrimerPlato = 10.0; // Precio del primer plato
            double precioBebida = 2.5; // Precio de la bebida
            return precioPrimerPlato + precioBebida;
        }

        public double calcularValorPedido(String primerPlato, String segundoPlato, String bebida) {
            // Lógica para calcular el valor del pedido con un primer plato, un segundo plato y una bebida.
            // Similar a la anterior, puedes asignar valores fijos o consultar una base de datos para obtener los precios.
            double precioPrimerPlato = 10.0; // Precio del primer plato
            double precioSegundoPlato = 15.0; // Precio del segundo plato
            double precioBebida = 2.5; // Precio de la bebida
            return precioPrimerPlato + precioSegundoPlato + precioBebida;
        }

        public double calcularValorPedido(String primerPlato, String segundoPlato, String bebida, String postre) {
            // Lógica para calcular el valor del pedido con un primer plato, un segundo plato, una bebida y un postre.
            // Similar a las anteriores, puedes asignar valores fijos o consultar una base de datos para obtener los precios.
            double precioPrimerPlato = 10.0; // Precio del primer plato
            double precioSegundoPlato = 15.0; // Precio del segundo plato
            double precioBebida = 2.5; // Precio de la bebida
            double precioPostre = 5.0; // Precio del postre
            return precioPrimerPlato + precioSegundoPlato + precioBebida + precioPostre;
        }


    }
