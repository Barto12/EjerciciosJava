import java.util.Scanner;

public class LaEscaleraIfElseIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe un numero y te dare informacion sobre el ");
        int numeroIntroducido = scanner.nextInt();

        if(numeroIntroducido < 3) {
            System.out.println("El numero introducido es menor que 3");

        }else if (numeroIntroducido < 5){
            System.out.println("El numero que has introducido esta entre 3 y 5");

        } else if (numeroIntroducido < 8) {
            System.out.println("El numero introducido esta entre 5 y 8");
        } else {
            System.out.println("El numero introducio es igual o mayor que 8 ");
        }
    }
}
