package utilidades;

public class Formateo {
    public static String nameFormateo(String s) {
        String[] palabras = s.split(" ");
        String salida = "";

        for (String palabra: palabras) {
            if (palabra.length() > 0) {
                String inicial = palabra.substring(0,1).toUpperCase();
                String continuacion = "";
                if (palabra.length() > 1) {
                    continuacion = palabra.substring(1).toLowerCase();
                }
                salida += inicial + continuacion + " ";
            }
        }
        return salida.trim();
    }
}
