package model;

public abstract class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private int anioPublicacion;
    private float precio;



    public Libro(){

    }

    public Libro(String titulo, String autor, String isbn, int anioPublicacion, float precio){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.anioPublicacion = anioPublicacion;
        this.precio = precio;
    }


    public String getTitulo(){
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }
    public int getAnioPublicacion(){
        return anioPublicacion;
    }
    public float getPrecio(){
        return precio;
    }


    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void setAnioPublicacion(int anioPublicacion){
        this.anioPublicacion = anioPublicacion;
    }
    public void setPrecio(float precio){
        this.precio = precio;
    }


    public abstract void getGenero();

    public String mostrarLibro(){
        return "Titulo: " + this.titulo + "  " +
                "Autor: " + this.autor + "   " +
                "ISBN: " + this.isbn + "   " +
                "Año publicación: " + this.anioPublicacion + "  " +
                "Precio: " +  this.precio;
    }
}


