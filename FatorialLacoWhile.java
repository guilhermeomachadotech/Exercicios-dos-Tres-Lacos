import java.util.Scanner;
public class FatorialLacoWhile {
	public static void main (String[]args) {
		Scanner ler=new Scanner (System.in);
		int num, fat=1, i=1;
		System.out.println ("Digite o número a ser fatorado:");
		num=ler.nextInt();
		while (i<=num){
			fat=i*fat;
			i++;
		}
		System.out.println ("O resultado da fatoração é "+fat);
		ler.close();
	}
}
