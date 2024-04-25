import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        EXTERNA:

        while (true) {
            System.out.println("Conversor de monedas");
            System.out.println("""
                    1 - Soles Peruanos a dolares
                    2- Pesos mexicanos a dolares
                    3 - Pesos colombianos a dolares
                    4 - Salir
                    """);
                    System.out.println("Ingrese una opción");
                    Scanner leer = new Scanner(System.in);
                    char opcion = leer.next().charAt(0);

                    switch (opcion) {
                        case '1':
                            convertir(3.58, "Soles Peruanos");
                            break;
                            case '2':
                            convertir(22.15, "Pesos Mexicanos");
                            break;
                            case '3':
                            convertir(3810.9, "Pesos Colombianos");
                            break;
                            case '4':
                            System.out.println("Cerrando programa");
                            break EXTERNA;
                        default:
                        System.out.println("Seleccione una opción válida");
                            break;
                    }
        }
    }

    static void convertir(double valorMoneda, String pais) {
            Scanner leer = new Scanner(System.in);
            System.out.printf("Ingrese la cantidad de %s ", pais);
            double cantidadMoneda = leer.nextDouble();

            double dolares = cantidadMoneda / valorMoneda;
            dolares = (double) Math.round(dolares * 100d) / 100;

            System.out.println("******************************");
            System.out.println("Tienes $" + dolares + " dolares");
            System.out.println("******************************");
    }
}
