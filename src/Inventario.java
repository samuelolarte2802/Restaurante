import java.util.HashMap;
import java.util.Scanner;

public class Inventario extends Palanca {

    private HashMap<String, String> productos;

    public Inventario() {
        this.productos = new HashMap<>();
    }

    public Inventario(HashMap<String, String> productos) {
        this.productos = productos;
    }

    public HashMap<String, String> getProductos() {
        return productos;
    }

    public void setProductos(HashMap<String, String> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Inventario{" +
                "productos=" + productos +
                '}';
    }

    public void lista() {

        System.out.println("Caldos");
        productos.put("Costilla", "Estandar");
        productos.put("Pollo", "Estandar");
        productos.put("Pescado", "Estandar");

        System.out.println("Proteina desayuno");
        productos.put("Carne Asada", "Estandar");
        productos.put("Carne en Bistec", "Estandar");
        productos.put("Huevos", "Estandar");

        System.out.println("Sopas");
        productos.put("Ajiaco", "Estandar");
        productos.put("Arroz", "Estandar");
        productos.put("Cuchuco", "Estandar");

        System.out.println("Principio");
        productos.put("Frijol", "Estandar");
        productos.put("Pasta", "Estandar");
        productos.put("Lentejas", "Estandar");

        System.out.println("Proteina almuerzo");
        productos.put("Pollo Dorado", "Estandar");
        productos.put("Carne Molida", "Estandar");
        productos.put("Chuleta a la plancha", "Estandar");
    }

    @Override
    public HashMap<String, String> agregar() {
        Scanner sca = new Scanner(System.in);
        System.out.println("Nombre del producto: ");
        String prod = sca.next();
        System.out.println("Precio: Estandar o Especial");
        String precio = sca.next();
        if (precio.equalsIgnoreCase("Especial")) {
            System.out.println("Ingrese el precio adicional que tendra: ");
            int precioAdi = sca.nextInt();
            System.out.println("Producto guardado con exito");
        } else {
            System.out.println("Producto guardado con exito");
        }
        productos.put(prod,precio);

        return productos;
    }

    @Override
    public void mostrar() {
        lista();
        if (!productos.isEmpty()) {
            for (HashMap.Entry<String, String> entry : productos.entrySet()) {
                System.out.println(entry.getKey() + ", " + entry.getValue());
            }
        } else {
            System.out.println("No hay productos en el inventario");
        }
    }
}
