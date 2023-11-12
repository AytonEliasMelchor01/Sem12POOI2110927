public class Hora {
    private int horas;
    private int minutos;
    private int segundos;

  
    public Hora() {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }


    public Hora(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }


    public void visualizarHora() {
        System.out.printf(horas+":"+minutos+":"+segundos+"\n");
    }


    public void sumarHoras(Hora hora2) {
        this.segundos += hora2.segundos;
        this.minutos += hora2.minutos;
        this.horas += hora2.horas;

            if (this.segundos >= 60) {
            this.segundos -= 60;
            this.minutos += 1;
        }

        if (this.minutos >= 60) {
            this.minutos -= 60;
            this.horas += 1;
        }

        System.out.println("Resultado de la suma: ");
        visualizarHora();
    }
}
public class Main {
    public static void main(String[] args) {
        
        Hora hora1 = new Hora(5, 30, 45);
        Hora hora2 = new Hora(3, 35, 20);

     
        Hora resultadoHora = new Hora();
    
        System.out.println("Hora 1: ");
        hora1.visualizarHora();
        System.out.println("Hora 2: ");
        hora2.visualizarHora();

        resultadoHora.sumarHoras(hora1);
        resultadoHora.sumarHoras(hora2);

    }
}
