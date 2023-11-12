public class Cadena {
    private int longitud;
    private String contenido;

    // Constructor
    public Cadena(String contenido) {
        this.contenido = contenido;
        this.longitud = contenido.length();
    }


    public int getLongitud() {
        return longitud;
    }

    public String getContenido() {
        return contenido;
    }

    public void visualizar() {
        System.out.println("Contenido: " + contenido);
        System.out.println("Longitud: " + longitud);
    }


    public char caracter(int i) {
        if (i >= 0 && i < longitud) {
            return contenido.charAt(i);
        } else {
            return 0;
        }
    }
}
 public class Main{   
    public static void main(String[] args) {
        Cadena cadena = new Cadena("probar cadena");

        System.out.println("Cadena actual:");
        cadena.visualizar();

        int indice = 7;
        char caracterEnIndice = cadena.caracter(indice);

        if (caracterEnIndice != '\0') {
            System.out.printf("Carácter en la posición %d: %c\n", indice, caracterEnIndice);
        } else {
            System.out.printf("Índice %d fuera de rango.\n", indice);
        }
    }
}
