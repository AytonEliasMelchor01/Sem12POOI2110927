import java.util.ArrayList;
import java.util.List;


class LAN {
    protected List<Nodo> nodos;
    protected String topologia;
    protected int tamanoPaquete;

    public LAN() {
        this.nodos = new ArrayList<>();
        this.topologia = "Desconocida";
        this.tamanoPaquete = 64;
    }

    public void agregarNodo(Nodo nodo) {
        nodos.add(nodo);
        System.out.println("Nodo " + nodo + " aádido de la red LAN.");
    }

    public void quitarNodo(Nodo nodo) {
        nodos.remove(nodo);
        System.out.println("Nodo " + nodo + " eliminado de la red LAN.");
    }

    public void listarNodos() {
        System.out.println("Nodos en la red LAN:");
        for (Nodo nodo : nodos) {
            System.out.println("- " + nodo);
        }
    }

    public void configurarRed(String topologia) {
        this.topologia = topologia;
        System.out.println("Configuración de la red LAN: " + topologia);
    }

    public void especificarTamanoPaquete(int tamanoPaquete) {
        this.tamanoPaquete = tamanoPaquete;
        System.out.println("Tamaño del paquete configurado: " + tamanoPaquete + " bytes");
    }

    public void enviarPaquete(Nodo origen, Nodo destino) {
        System.out.println("Enviando paquete desde " + origen + " a " + destino);
    }

    public void difundirPaquete(Nodo origen) {
        System.out.println("Difundiendo paquete desde " + origen + " a todos los nodos de la red");
    }

    public void realizarEstadisticas() {
       
        System.out.println("Estadísticas de la LAN");
    }
}


class Nodo {
    protected String tipo;

    public Nodo(String tipo) {
        this.tipo = tipo;
    }


    public String toString() {
        return tipo;
    }
}


class EstrellaLAN extends LAN {
    public EstrellaLAN() {
        super();
        this.topologia = "Estrella";
    }
}

class AnilloLAN extends LAN {
    public AnilloLAN() {
        super();
        this.topologia = "Anillo";
    }
}

class BusLAN extends LAN {
    public BusLAN() {
        super();
        this.topologia = "Bus";
    }
}

class HubLAN extends LAN {
    public HubLAN() {
        super();
        this.topologia = "Hub";
    }
}
public class SimulacionLAN {
    public static void main(String[] args) {
        EstrellaLAN redEstrella = new EstrellaLAN();

        Nodo nodo1 = new Nodo("PC1");
        Nodo nodo2 = new Nodo("PC2");

        redEstrella.agregarNodo(nodo1);
        redEstrella.agregarNodo(nodo2);

        redEstrella.listarNodos();

        redEstrella.configurarRed("Estrella");
        redEstrella.especificarTamanoPaquete(128);
        redEstrella.quitarNodo(nodo1);
        redEstrella.enviarPaquete(nodo1, nodo2);
        redEstrella.difundirPaquete(nodo2);

        redEstrella.realizarEstadisticas();
    }
}




