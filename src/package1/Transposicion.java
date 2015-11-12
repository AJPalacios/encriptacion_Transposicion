//Programa que encripta un mensaje mendiante el metodo de transposición
package package1;

import java.io.IOException;
import java.util.Scanner;

public class Transposicion {

	public static void main(String[] args) {
		
		String mensaje;
		char array[];
		int i,j;
		
		System.out.println("Dame un mensaje para encriptar: ");
		Scanner entrada = new Scanner(System.in);
		mensaje = entrada.nextLine();
		array = mensaje.toCharArray();
		
		for(i=0;i<array.length;i++){
			System.out.print(" "+i);
			System.out.print(" ");
		}
		
		System.out.print("\nTu mensaje encriptado es: ");
		
		for(j=i-1;j>=0;j--){
			System.out.print(array[j]);
		}					

	}

}
