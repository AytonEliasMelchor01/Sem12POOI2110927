import java.util.Scanner;

class Empleado {
    private String nombre;
    private int numEmpleado;

  
    public void leerDatos() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre: ");
        this.nombre = scanner.nextLine();

        System.out.print("Número de empleado: ");
        this.numEmpleado = scanner.nextInt();
    }

  
    public void verDatos(int numero) {
        System.out.println("Empleado #" + numero + ":");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Número de empleado: " + this.numEmpleado);
    }
    
}
public class Main {
    public static void main(String[] args) {
        
        Empleado[] empleados = new Empleado[50];

      
        for (int i = 0; i < 50; i++) {
            empleados[i] = new Empleado();
            System.out.println("\nIngrese los datos del empleado #" + (i + 1) + ":");
            empleados[i].leerDatos();
        }

     
        System.out.println("\nDatos de todos los empleados:");
        for (int i = 0; i < empleados.length; i++) {
            empleados[i].verDatos(i + 1);
            System.out.println("-------------------------");
        }
    }
}