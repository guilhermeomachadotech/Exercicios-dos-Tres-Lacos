import java.util.Scanner;
public class TabuadaLacoFor {
	public static void main (String args[]) {
		Scanner ler=new Scanner (System.in);
		int i, num, tab;
		System.out.println ("Digite um número para mostrar sua tabuada:");
		num=ler.nextInt ();
		for (i=1;i<=10;i++) {
			tab=num*i;
			System.out.println (num+" X "+i+" = "+tab);
		}
		ler.close ();
	}
}
