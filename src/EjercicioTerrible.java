import java.util.Scanner;

public class EjercicioTerrible {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nombres;
        int edades;

      
        for (int i = 1; i <= 5; i++) {
            System.out.println("Ingrese el nombre del estudiante " + i);
            nombres = input.nextLine();
           

            System.out.println("Ingrese la edad:");
            edades = input.nextInt();
            input.nextLine();
            
        }

        System.out.println("Ingrese el nombre del primer estudiante:");
        String PrimerNombreEstudiante = input.nextLine();
        System.out.println("Ingrese la edad:");
        int EdadPrimerEstudiante = input.nextInt();
        input.nextLine();

        System.out.println("Ingrese el nombre del segundo estudiante:");
        String SegundoNombreEstudiante = input.nextLine();
        System.out.println("Ingrese la edad:");
        int EdadSegundoEstudiante = input.nextInt();
        input.nextLine();

        System.out.println("Ingrese el nombre del tercer estudiante:");
        String TercerNombreEstudiante = input.nextLine();
        System.out.println("Ingrese la edad:");
        int EdadTercerEstudiante = input.nextInt();
        input.nextLine();

        System.out.println("Ingrese el nombre del cuarto estudiante:");
        String CuartoNombreEstudiante = input.nextLine();
        System.out.println("Ingrese la edad:");
        int EdadCuartoEstudiante = input.nextInt();
        input.nextLine();

        System.out.println("Ingrese el nombre del quinto estudiante:");
        String QuintoNombreEstudiante = input.nextLine();
        System.out.println("Ingrese la edad:");
        int EdadQuintoEstudiante = input.nextInt();
        input.nextLine();

        double PromedioDeEdad = (EdadPrimerEstudiante + EdadSegundoEstudiante + EdadTercerEstudiante + EdadCuartoEstudiante + EdadQuintoEstudiante) / 5;

        System.out.println("Edad promedio de los estudiantes: " + PromedioDeEdad);

        if (EdadPrimerEstudiante > 17) {
            System.out.println(PrimerNombreEstudiante + " es mayor de edad");
        } else {
            System.out.println(PrimerNombreEstudiante + " es menor de edad");
        }

        if (EdadSegundoEstudiante > 17) {
            System.out.println(SegundoNombreEstudiante + " es mayor de edad");
        } else {
            System.out.println(SegundoNombreEstudiante + " es menor de edad");
        }

        if (EdadTercerEstudiante > 17) {
            System.out.println(TercerNombreEstudiante + " es mayor de edad");
        } else {
            System.out.println(TercerNombreEstudiante + " es menor de edad");
        }

        if (EdadCuartoEstudiante > 17) {
            System.out.println(CuartoNombreEstudiante + " es mayor de edad");
        } else {
            System.out.println(CuartoNombreEstudiante + " es menor de edad");
        }

        if (EdadQuintoEstudiante > 17) {
            System.out.println(QuintoNombreEstudiante + " es mayor de edad");
        } else {
            System.out.println(QuintoNombreEstudiante + " es menor de edad");
        }

        System.out.println("Programa finalizado.");

        input.close();
    }
}
