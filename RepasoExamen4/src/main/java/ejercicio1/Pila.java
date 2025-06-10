package ejercicio1;

public class Pila {
    private Libro[] pila;
    private int tope;

    public Pila (int capacidad){
        pila = new Libro[capacidad];
        tope = -1;
    }

    public void redimensionar() {
        int nuevaCapacidad = pila.length * 2;
        Libro[] nuevaPila = new Libro[nuevaCapacidad];
        for (int i = 0; i <= tope;i++){
            nuevaPila[i] = pila[i];
        }
        pila = nuevaPila;
    }


    public void push(Libro libro){
        if (tope == pila.length - 1){
            redimensionar();
        }
        pila[++tope] = libro;
    }

    public Libro pop(){
        if (isEmpty()){
            redimensionar();
        }
        return pila[tope--];
    }

    public Libro peek() {
        if (isEmpty()){
            redimensionar();
        }
        return pila[tope];
    }

    public boolean isEmpty() {
        return (tope == -1);
    }

    public int size() {
        return tope + 1;
    }

    public  void mostrar() {
        for (int i = tope; i >= 0;i--){
            System.out.println(pila[i]);;
        }

    }


}
