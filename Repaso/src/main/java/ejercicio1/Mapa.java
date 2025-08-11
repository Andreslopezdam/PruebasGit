package ejercicio1;

public class Mapa<K, V> {
    public Object[] claves;
    public Object[] valores;
    public int size;

    public Mapa() {
        claves = new Libro[1];
        valores = new Object[1];
        size = 0;
    }

    public void put(K clave, V valor) {
        int index = indexOfKey(clave);
        if (index != -1) {
            valores[index] = valor;
        } else {
            if (size == claves.length) {
                redimensionar();
            }
            claves[size] = clave;
            valores[size] = valor;
            size++;
        }
    }

    public void remove(K clave) {
        int index = indexOfKey(clave);
        if (index != -1) {
            for (int i = index; i < size - 1; i++) {
                claves[i] = claves[i + 1];
                valores[i] = valores[i + 1];
            }
            claves[size - 1] = null;
            valores[size - 1] = null;
            size--;
        }
    }


    private int indexOfKey(K clave) {
        for (int i = 0; i < claves.length; i++) {
            if (claves[i].equals(clave)) {
                return i;
            }
        }
        return -1;
    }

    private int indexOfValue(V valor) {
        for (int i = 0; i < valores.length; i++) {
            if (valores[i].equals(valor)) {
                return i;
            }
        }
        return -1;
    }

    private void redimensionar() {
        Object[] nuevaClaves = new Object[claves.length + 1];
        Object[] nuevoValores = new Object[valores.length + 1];
        for (int i = 0; i < claves.length; i++) {
            nuevaClaves[i] = claves[i];
        }
        for (int i = 0; i < valores.length; i++) {
            nuevoValores[i] = valores[i];
        }
        claves = nuevaClaves;
        valores = nuevoValores;
    }

    public int size() {
        return claves.length;
    }

    public boolean containsKey(K clave) {
        return indexOfKey(clave) != -1;
    }

    public boolean containsValue(V valor) {
        return indexOfValue(valor) != -1;
    }

    public V get(K clave) {
        int index = indexOfKey(clave);
        if (indexOfKey(clave) != -1) {
            return (V) valores[index];
        }
        return null;
    }

}
