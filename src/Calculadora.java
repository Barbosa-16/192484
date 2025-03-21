import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int num1;
        int num2;
        int Suma;
        int Resta;
        int Multiplicacion;
     
          
            System.out.println("Ingresa el primer número: ");
            num1 = scanner.nextInt();
            
            
            System.out.println("Introduce el segundo número: ");
            num2 = scanner.nextInt();
            
         
            Suma = num1 + num2;
            System.out.println("El resultado de la suma es: " + Suma);

            Resta = num1 - num2;
            System.out.println("El resultado de la resta es: " + Resta);
            
            Multiplicacion = num1 * num2;
            System.out.println("El resultado de la multiplicacion es: " + Multiplicacion);
            
            if (num1 % 2 == 0) {
                System.out.println(num1 + " es par.");
            } else {
                System.out.println(num1 + " es impar.");
            }

            if (num2 % 2 == 0) {
                System.out.println(num2 + " es par.");
                } else {
                    System.out.println(num2 + " es impar.");
                }
            
                if (num1 > num2) {
                System.out.println("El numero " + num1 + " es mayor que el numero " + num2 );
            }   else {
                System.out.println("El numero " + num1 + " es menor que el numero " + num2);
            }
           
            double division = (double) num1 / num2;
            System.out.println("El resultado de la división es: " + division);
            
            
           
        
        
        scanner.close();
    }
}
