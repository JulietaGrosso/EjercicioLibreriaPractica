import model.Ciencia;
import model.Infantil;
import model.Novela;
import model.Libro;
import model.Libreria;
public class Main {
    public static void main(String[] args) {

        Libro novelaIng = new Novela("Orgullo y Prejuicio", "Jane Austen", "978987563", 2005, 30000);
        Libro ciencia = new Ciencia("Cosmos", "Carl Sagan", "978987347", 1986, 50000);
        Libro infantil = new Infantil("Aquí estamos", "Oliver Jeffers", "978877562", 2023, 40000);

        Libreria libros = new Libreria(0, 3);
        novelaIng.getGenero();
        ciencia.getGenero();
        infantil.getGenero();

        libros.agregarLibro(novelaIng);





    }
}