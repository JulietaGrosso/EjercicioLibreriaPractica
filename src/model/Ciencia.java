package model;

public class Ciencia extends Libro implements Vendible{

    public Ciencia(String titulo, String autor, String isbn, int anioPublicacion, float precio){
        super(titulo, autor, isbn, anioPublicacion, precio);
    }

    public Ciencia(){

    }
    @Override
    public void getGenero() {
        System.out.println("Ciencia");
    }

    @Override
    public float calcularPrecioFinal() {
        Double resultado;
        resultado = getPrecio() + (getPrecio() * 0.10);
        return resultado.floatValue();
    }
}

