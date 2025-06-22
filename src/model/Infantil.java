package model;

public class Infantil extends Libro implements Vendible{

    public Infantil(String titulo, String autor, String isbn, int anioPublicacion, float precio){
        super(titulo,autor,isbn,anioPublicacion,precio);
    }

    public Infantil(){

    }

    @Override
    public void getGenero(){
        System.out.println("Infantil");
    }

    @Override
    public float calcularPrecioFinal() {
        Double resultado;
        resultado = getPrecio() - (getPrecio() * 0.10);
        return resultado.floatValue();

    }
}

