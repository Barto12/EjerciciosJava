public class OperadoresAritmeticos {

    public static void main(String[] args) {

        int numeroDos = 2;
        int numeroTres =3;

        int resultadoSuma = numeroDos + numeroTres;

        System.out.println("El resultado de sumar " + numeroDos + " y " + numeroTres + " es "  + resultadoSuma);

        System.out.println("Esto es un String " + " y lo concateno con este otro");

        int resultadoResta = numeroTres - numeroDos;

        int numeroDosConCambioDeSigno = -numeroDos;

        System.out.println("Si aplicamos el operador resta a numeroDos obtenemos " + numeroDosConCambioDeSigno);

        double resultadoMultiplicacion = numeroTres * 3.5;



        double resultadoDivision = (double)numeroDos / numeroTres;

        System.out.println("resultadoDivision contiene " + resultadoDivision);

        int resultadoModulo = numeroTres % numeroDos;

        System.out.println("El resto de dividir 3 entre 2 es " + resultadoModulo);


    }
}
