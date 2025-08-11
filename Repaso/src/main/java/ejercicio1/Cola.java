package ejercicio1;

public class Cola {
    private Libro[] array;
    private int frente;
    private int finalCola;
    private int size;

    public Cola(int capadidadCola){
        array = new Libro[capadidadCola];
        frente = 0;
        finalCola = -1;
        size = 0;
    }

    private void redimensionar() {
        Libro[] nuevoArray = new Libro[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            nuevoArray[i] = array[(frente + i) % array.length];
        }
        array = nuevoArray;
        frente = 0;
        finalCola = size - 1;
    }
    public void meter(Libro libro){
        if (size == array.length){
            redimensionar();
        }
        finalCola = (finalCola + 1) % array.length;
        array[finalCola] = libro;
        size ++;
    }

    public Libro sacar(){
        if (isEmptyCola()){
            System.out.println("Esta vacio");
            return null;
        }
        Libro libro = array[frente];
        frente = (frente + 1) % array.length;
        size --;
        return libro;
    }

    public boolean isEmptyCola() {
        return size == 0;
    }

    public Libro peekCola() {
        if (isEmptyCola()) {
            System.out.println("Cola vacía");
            return null;
        }
        return array[frente];
    }

    public int sizeCola() {
        return array.length;
    }

    public void mostrarCola() {
        for (int i = 0;i < size;i++){
            int index = (frente + i) % array.length;
            System.out.println(array[index]);
        }
    }
}
