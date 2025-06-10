package ejercicio1;

public class Pila {
    private Libro[] pila;
    private int valor;

    public Pila (int capacidad){
        pila = new Libro[capacidad];
        valor = -1;
    }

    public void redimensionar(){
        int nuevaCapacidad = pila.length * 2;
        Libro[] nuevaPila = new Libro[nuevaCapacidad];
        for (int i = 0; i <= valor;i++){
            nuevaPila[i] = pila[i];
        }
        pila = nuevaPila;
    }

    public void push(Libro libro){
        if (valor == pila.length){
            redimensionar();
        }
        pila[++valor] = libro;
    }

    public Libro pop(){
        if (isEmpty()){
            System.out.println("Pila vacia");
        }
        return pila[valor--];
    }

    public Libro peek() {
        if (isEmpty()){
            System.out.println("Pila vacia");
        }
        return pila[valor];
    }

    public boolean isEmpty() {
        return valor == -1;
    }

    public int size(){
        return valor + 1;
    }

    public void  mostrar(){
        for (int i = valor;i >= 0;i-- ){
            System.out.println(pila[i]);
        }
    }
}
