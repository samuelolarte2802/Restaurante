import java.util.HashMap;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Inventario inventario = new Inventario();
        Scanner scan = new Scanner(System.in);
        int opc = 0;

        do {

            System.out.println("""
                    El Sazon
                    1) Menu
                    2) Inventario
                    3) Pedido
                    4) Facturacion
                    5) Mesas
                    6) Dia a Dia
                    7) Salir
                    Ingrese la opcion deseada: """);
            opc = scan.nextInt();
            switch (opc){

                case 1:
                    String opc2 = "";
                    System.out.println("""
                            Menu
                            1) Menu del dia
                            2) Agregar menu""");
                    opc2 = scan.next();
                    switch (opc2){

                        case "1":
                            break;
                        case "2":
                            break;

                    }
                    break;
                case 2:
                    String opc1 = "";
                    System.out.println("""
                            Inventario
                            1) Mostrar
                            2) Agregar""");
                    opc1 = scan.next();
                    switch (opc1){

                        case "1":
                            break;

                        case "2":
                            break;
                    }
                    break;
                case 3:
                    String opc3 = "";
                    System.out.println("""
                            Pedidos
                            1) Mostrar Pedidos
                            2) Agregar Pedido""");
                    opc3 = scan.next();
                    switch (opc3){

                        case "1":
                            break;
                        case "2":
                            break;
                    }
                    break;
                case 4:
                    String opc4 = "";
                    System.out.println("""
                            Facturacion
                            1) Pagar Pedido
                            2) Historial""");
                    break;
                case 5:
                    String opc5 = "";
                    System.out.println("""
                            Mesas
                            1) Agregar Mesa
                            2) Mostrar Mesas""");
                    break;
                case 6:
                    String opc6 = "";
                    System.out.println("""
                            Dia a Dia
                            1) Terminar Dia
                            2) Reiniciar Historial""");
                    break;
                default:
                    System.out.println("ERROR Opcion no valida ERROR");
                    break;
            }

        }while(opc != 7);

    }
}