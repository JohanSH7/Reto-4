package co.edu.udea.reto4;

import static co.edu.udea.reto4.Reto4.scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author Santiago Graciano
 */
public class Empresa {

    ArrayList<Venta> listaVentas = new ArrayList<>();
    ArrayList<Seguro> listaSeguros = new ArrayList<>();
    ArrayList<Panel> listaPaneles = new ArrayList<>();

    public String crearVenta() {
        Venta venta = new Venta();
        System.out.println("Ingrese id del panel");
        venta.setIdPanel(scanner.next());
        venta.setFechaVenta(LocalDateTime.now());
        System.out.println("ingrese el tipo documento del comprador");
        venta.setTipoDocumentoComprador(scanner.next());
        System.out.println("Ingrese el id del comprador");
        venta.setIdComprador(scanner.next());
        System.out.println("Ingrese el nombre del comprador");
        venta.setNombreComprador(scanner.next());
        System.out.println("ingrese descripcion de la venta");
        venta.setDescripcionUso(scanner.next());

        listaVentas.add(venta);

        return "venta creada";
    }

    public void listarVentas() {
        for (int i = 0; i < listaVentas.size(); i++) {
            System.out.println(listaVentas.get(i).toString());
        }

    }

    public String crearPanel() {
        Panel panel = new Panel();
        System.out.println("Ingrese el id del panel");
        panel.setId(scanner.next());
        System.out.println("Ingrese la serie del panel");
        panel.setSerie(scanner.next());
        System.out.println("Ingrese la descripción del panel");
        panel.setDescripcion(scanner.next());
        System.out.println("Ingrese el tipo del panel");
        panel.setTipo(scanner.next());
        System.out.println("Ingrese el modelo del panel");
        panel.setModelo(scanner.next());
        System.out.println("Ingrese el año de fabricacion del panel");
        panel.setAnioFabricacion(scanner.nextInt());
        System.out.println("Ingrese el precio de venta del panel");
        panel.setPrecioVenta(scanner.nextDouble());

        listaPaneles.add(panel);

        return "panel creado exitosamente";
    }

    public void listarPaneles() {
        for (int i = 0; i < listaPaneles.size(); i++) {
            System.out.println(listaPaneles.get(i).toString());
        }
    }

    public String crearSeguro() {
        Seguro seguro = new Seguro();
        System.out.println("Ingrese nombre de la empresa");
        seguro.setNombreEmpresa(scanner.next());
        System.out.println("ingrese fecha inicio");
        seguro.setFechaInicio(LocalDate.parse(scanner.next(),DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println("Ingrese fecha fin");
        seguro.setFechaFin(LocalDate.parse(scanner.next(),DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println("Ingrese descripcion");
        seguro.setDescripcion(scanner.next());
        System.out.println("Ingrese id del panel");
        seguro.setIdPanel(scanner.next());

        listaSeguros.add(seguro);

        return "Seguro creado correctamente";
    }

    public void listarSeguros() {
        for (int i = 0; i < listaSeguros.size(); i++) {
            System.out.println(listaSeguros.get(i).toString());
        }

    }

}
