//paquete

import java.util.Scanner;

public class Principal
{

    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el primer numero");
        int Primer_Numero = teclado.nextInt();
        System.out.println("Ingresa el segundo numero");
        int Segundo_Numero = teclado.nextInt();

        System.out.println("La suma es: "+(Primer_Numero+Segundo_Numero));
    }
}
