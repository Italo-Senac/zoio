import java.util.*;
public class Calcular {

	public static void main(String[] args) {
		while(true) {
	    Scanner input = new Scanner (System.in);
		System.out.println("Calculadora Simples \n1-Adição \n2-Subtração \n3-Multiplicação \n4-Dvisisão \n5-Encerrar progama ");
		String calculo = input.nextLine();
		if(calculo.equals ("1")) {
			int N1,N2 ;
			System.out.println("Digite um valor");
			N1=input.nextInt();
			System.out.println("Digite um valor");
			N2=input.nextInt();
			System.out.println("O resultado é "+(N1+N2));
		}
		else if(calculo.equals ("2")) {
			int N1,N2 ;
			System.out.println("Digite um valor");
			N1=input.nextInt();
			System.out.println("Digite um valor");
			N2=input.nextInt();
			System.out.println("O resultado é "+(N1-N2));
		}
		else if(calculo.equals ("3")) {
			int N1,N2 ;
			System.out.println("Digite um valor");
			N1=input.nextInt();
			System.out.println("Digite um valor");
			N2=input.nextInt();
			System.out.println("O resultado é "+(N1*N2));
		}
		else if(calculo.equals ("4")) {
			int N1,N2 ;
			System.out.println("Digite um valor");
			N1=input.nextInt();
			System.out.println("Digite um valor");
			N2=input.nextInt();
			System.out.println("O resultado é "+(N1/N2));
		}
		else if(calculo.equals("5")) {
			System.out.println("Progama Encerrado");
			break;
		}
		else {
			System.out.println("Opção inválida");
		}
	}
	}
}
