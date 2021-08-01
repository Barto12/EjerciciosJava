import java.util.Scanner;

public class EstructuraSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Por favor, introduzca el dia de la semana en que quiere su cita");
        String dia = scanner.nextLine();

        switch(dia){
            case "Lunes":
                System.out.println("ELlunes puede venir de 11:00 a 12:30");
                break;
            case "Martes":
                System.out.println("EL martes puede venir de 15:30 a 17:30");
                break;
            case "Miercoles":
                System.out.println("El miercoles puede venir de 11:00 a 12:30");
                break;
            case "jueves":
                System.out.println("El jueves puede venir de 15:30 a 17:30");
                break;
            case "viernes":
                System.out.println("El viernes puede venir de 11:00 a 12:30");
                break;
            case "sabado":
                System.out.println("El setablecimiento estara cerrado");
                break;
            case "domingo":
                System.out.println("El establecimiento estara cerrado");
                break;
            default:
                System.out.println("Usted no ha introducido un dia valido");


        }

    }
}
