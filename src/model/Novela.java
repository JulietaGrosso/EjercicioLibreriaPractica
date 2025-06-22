package model;

public class Novela extends Libro implements Vendible{

    public Novela (String titulo,String autor,String isbn,int anioPublicacion, float precio){
        super(titulo,autor,isbn,anioPublicacion,precio);
    }


    public Novela(){

    }

    @Override
    public void getGenero(){
        System.out.println("Novela");
    }

    @Override
    public float calcularPrecioFinal() {
        Double resultado = getPrecio() + (getPrecio() * 0.10);
        return resultado.floatValue();
    }
}
