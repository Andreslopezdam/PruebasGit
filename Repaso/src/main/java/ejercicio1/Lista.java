package ejercicio1;

public class Lista {
    private Libro[] lista;
    private int size;

    public Lista(int capacidad){
        lista = new Libro[capacidad];
        size = 0;
    }

    private void redimensiona() {
        Libro[] nuevaLista = new Libro[lista.length * 3];
        for (int i = 0; i < size;i++){
            nuevaLista[i]  = lista[i];
        }
        lista = nuevaLista;
    }

    public void add(Libro libro){
        if (size == lista.length){
            redimensiona();
        }
        lista[size++] = libro;
    }

    public Libro get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Indice fuera de rango");
        }
        return lista[index];
    }

    public void set(int index,Libro libro){
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Indice fuera de rango");
        }
        lista[index] = libro;
    }

    public void  remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Indice fuera de rango");
        }
        for (int i = index;i < size - 1;i++){
            lista[i] = lista[i + 1];
        }
        lista[--index] = null;
    }

    public int size() {
        return size;
    }

    public void mostrar() {
        for (int i = 0;i < size;i++){
            System.out.println(lista[i]);
        }
    }
}
