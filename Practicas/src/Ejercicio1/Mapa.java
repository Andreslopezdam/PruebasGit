package Ejercicio1;

import java.util.Arrays;

public class Mapa {
    private Object[][] datos;

    public Mapa() {
        datos = new Object[0][2];
    }

    public void put(Object clave,Object valor) {
        int index = indexKey(clave);
        if (index != -1) {
            datos[index][1] = valor;
        } else {
            Object[][] nueva = new Object[datos.length + 1][2];
            for (int i=0;i<datos.length;i++) {
                nueva[i][0] = datos[i][0];
                nueva[i][1] = datos[i][1];
            }
            nueva[datos.length][0] = clave;
            nueva[datos.length][1] = valor;

            datos = nueva;
        }
    }

    public void remove(Object clave) {
        int index = indexKey(clave);
        if (index != -1) {
            Object[][] nueva = new Object[datos.length - 1][2];
            for (int i=0,j=0;i <datos.length;i++) {
                if (i != index) {
                    nueva[j][0] = datos[i][0];
                    nueva[j][1] = datos[i][1];
                    j++;
                }
            }
            datos = nueva;
        }
    }

    private int indexKey(Object clave) {
        for (int i=0;i < datos.length;i++) {
            if (datos[i][0].equals(clave)) {
                return i;
            }
        }
        return -1;
    }

    public int size() {
        return datos.length;
    }

    public  boolean containsKey(Object clave) {
        return indexKey(clave) != -1;
    }

    public boolean containsValue(Object valor) {
        for (int i=0;i < datos.length; i++) {
            if(datos[i][1].equals(valor)) {
                return true;
            }
        }
        return false;
    }

    public void mostrar() {
        for (int i = 0; i < datos.length;i++) {
            System.out.println(datos[i][0] + " " + datos[i][1]);
        }
    }

    public Object[][] getDatos() {
        return datos;
    }

    public void setDatos(Object[][] datos) {
        this.datos = datos;
    }

    @Override
    public String toString() {
        return "Mapa{" +
                "datos=" + Arrays.toString(datos) +
                '}';
    }
}
