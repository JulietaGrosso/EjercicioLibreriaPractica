package model;

public class LibroNoDisponibleExcepcion extends RuntimeException {
    public LibroNoDisponibleExcepcion(String message) {
        super(message);
    }
}
