package co.edu.udea.reto4;

import java.util.ArrayList;
import java.util.Scanner;

public class Reto4 {

    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Venta> listaVentas = new ArrayList<>();
    public static Empresa empresa = new Empresa();

    public static void main(String[] args) {

        int opcion;
        do {
            System.out.println("1. Agregar venta");
            System.out.println("2. Agregar panel");
            System.out.println("3. Agregar seguro");
            System.out.println("4. Mostrar ventas");
            System.out.println("5. Mostrar paneles");
            System.out.println("6. Mostrar suguros");
            System.out.println("0. Salir");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese una opcion");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println(empresa.crearVenta());
                    break;
                case 2:
                    System.out.println(empresa.crearPanel());
                    break;
                case 3:
                    System.out.println(empresa.crearSeguro());
                    break;
                case 4:
                    empresa.listarVentas();
                    break;
                case 5:
                    empresa.listarPaneles();
                    break;
                case 6:
                    empresa.listarSeguros();
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        } while (opcion != 0);

    }

}
