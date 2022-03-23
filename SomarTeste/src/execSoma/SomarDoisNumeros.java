/**
 * 
 */
package execSoma;

/**
 * @author Rafael Marques Radieddine
 * Exemplo de integração com Github
 */

import java.util.Scanner;

public class SomarDoisNumeros {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		
		//declarando variaveis.
		int x, y, total;
		
		//apresentar o primeiro numero a ser somado.
		System.out.println("Digite um numero:");
		x = sc.nextInt();
		
		//apresentar o primeiro numero a ser somado.
		System.out.println("Digite um numero:");
		y = sc.nextInt();

		//soma
		total = y + x;
		
		//resultado aparece na tela do usuario
		System.out.printf("Resultado:" + total);
		
	}
	

}
