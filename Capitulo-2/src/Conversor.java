import java.math.BigDecimal;
import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        System.out.println("Bienvenido al conversor de moneda");
        System.out.println("Por favor introduzca una cantidad en euros y el programa le devolvera la conversion en US");

        Scanner scanner = new Scanner(System.in);

        double euros = scanner.nextDouble();

        double dolares = 1.09 * euros;

        System.out.println(euros + "euros equivalen a" + dolares + "US Dolares" );

        String euroString = Double.toString(euros);
        BigDecimal eurosBigDecimal = new BigDecimal(euroString);
        double tasaDeCambio = 1.09;
        String tasaDeCambioString = Double.toString(tasaDeCambio);
        BigDecimal tasaDeCambioBigDecimal = new BigDecimal(tasaDeCambioString);

        BigDecimal dolaresBigDecimal = eurosBigDecimal.multiply(tasaDeCambioBigDecimal);

        System.out.println(euros + "euros equivalen a " + dolaresBigDecimal.toString() + " US Dolares ");
    }
}
