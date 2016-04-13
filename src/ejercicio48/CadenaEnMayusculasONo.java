package ejercicio48;

import java.util.Scanner;

public class CadenaEnMayusculasONo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce cadena: ");
		String cadena = sc.nextLine();
		sc.close();
		boolean mayuscula = false;
		if (cadena.equals(cadena.toUpperCase()))
		{
			mayuscula = true;
		}
		if (mayuscula)
		{
			System.out.println("La cadena está en mayúsculas.");
		} else
		{
			System.out.println("La cadena no está en mayúsculas.");
		}
	}
}
