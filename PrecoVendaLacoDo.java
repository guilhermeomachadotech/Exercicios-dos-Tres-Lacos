import java.util.Scanner;
public class PrecoVendaLacoDo {
	public static void main (String args[]) {
		Scanner ler=new Scanner(System.in);
		double custo, margem, pV, porcen;
		String resposta="s";
		do {
			System.out.println ("Digite o custo do produto:");
			custo=ler.nextDouble();
			System.out.println ("Digite a margem de lucro do produto:");
			margem=ler.nextDouble();
			porcen=(custo/100)*margem;
			pV=custo+porcen;
			System.out.println ("O preço de venda é de R$ "+pV);
			System.out.println ("Deseja continuar? Digite S para sim ou N para não:");
			resposta=ler.next();
		}while (resposta.equalsIgnoreCase("s"));
		System.out.println("Fim do programa.");
		ler.close();
	}
}
