public class OperadoresRelacionales {

    public static void main(String[] args) {
        boolean esUnoMayorQueDos = 1 > 2;
        System.out.println("¿es cierto que uno es mayor que dos? " + esUnoMayorQueDos);

        boolean esUnoComaCincoMenorQueSieteComaDos = 1.5 < 7.2;

        boolean esOchoMayorOIgualQueOcho = 8 >= 8;

        System.out.println("¿Es ocho mayor o igual que ocho? " + esOchoMayorOIgualQueOcho);

        boolean esTresComaUnoIgualQueTresComaDos = 3.1 == 3.2;

        boolean esCuatroDiferenteDeCuatro  = 4 != 4;

        System.out.println("¿Es cuatro diferente de cuatro? " + esCuatroDiferenteDeCuatro);

        String perro = "perro";
        String gato = "gato";

        System.out.println("¿Es cierto que el String perro es igual al String gato? " + perro == gato);




    }
}
