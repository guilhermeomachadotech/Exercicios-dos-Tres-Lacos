import java.util.Scanner;
public class UsuarioVelhoNovoLacoDo {
	public static void main (String[]args) {
		Scanner ler=new Scanner(System.in);
		int maiorIdade=-1,menorIdade=1000, idade, i=1;
		String nome, nomeVelho = null, nomeNovo = null;
		do {
			System.out.println("Digite o nome do "+i+"° usuário:");
			nome=ler.next();
			System.out.println("Digite a idade do "+i+"° usuário:");
			idade=ler.nextInt();
			if(idade>maiorIdade) {
				nomeVelho=nome;
				maiorIdade=idade;
			}else if(idade<menorIdade) {
				nomeNovo=nome;
				menorIdade=idade;
			}
			i++;
		}while (i<=10);
		System.out.println ("O usuário mais velho é "+nomeVelho+",com "+maiorIdade+" anos e o usuário mais novo é "+nomeNovo+", com "+menorIdade+" anos");
		ler.close();
	}
}
