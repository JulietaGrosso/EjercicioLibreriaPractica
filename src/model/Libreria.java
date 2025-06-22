package model;

import java.util.ArrayList;

public class Libreria {
    private ArrayList<Libro> libroArray;
    private float ganancias;
    private int cantidadVentas;

    public Libreria (){
        this.libroArray = new ArrayList<>();
        this.ganancias = 0;
        this.cantidadVentas = 0;
    }
    public Libreria(float ganancias, int cantidadVentas){
        this.libroArray = new ArrayList<>();
        this.ganancias = ganancias;
        this.cantidadVentas = cantidadVentas;

    }

    public float getGanancias() {
        return ganancias;
    }
    public void setGanancias(float ganancias) {
        this.ganancias = ganancias;
    }
    public int getCantidadVentas() {
        return cantidadVentas;
    }
    public void setCantidadVentas(int cantidadVentas) {
        this.cantidadVentas = cantidadVentas;
    }


    public void agregarLibro(Libro libro){
        this.libroArray.add(libro);
    }

    public Libro obtenerLibro(String isbn){
        for(Libro libro : this.libroArray){
            if(libro.getIsbn().equals(isbn)){
                return libro;
            }
        }
        return null;
    }

    public void venderLibro(String isbn){
       Libro libro = this.obtenerLibro(isbn);
           if(isbn == null){
               throw new LibroNoDisponibleExcepcion("El libro no se está en el inventario");
           }else {
               this.libroArray.remove(libro);

           }


    }

    public void mostrarLibrosDisponibles(){
        System.out.println("Los libros disponibles son: ");
        for(Libro libro : this.libroArray){
            System.out.println(libro.mostrarLibro());
        }
    }




}
