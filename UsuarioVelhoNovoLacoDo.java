import java.util.Scanner;
public class UsuarioVelhoNovoLacoDo {
	public static void main (String[]args) {
		Scanner ler=new Scanner(System.in);
		int maiorIdade=-1,menorIdade=1000, idade, i=1;
		String nome, nomeVelho = null, nomeNovo = null;
		do {
			System.out.println("Digite o nome do "+i+"� usu�rio:");
			nome=ler.next();
			System.out.println("Digite a idade do "+i+"� usu�rio:");
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
		System.out.println ("O usu�rio mais velho � "+nomeVelho+",com "+maiorIdade+" anos e o usu�rio mais novo � "+nomeNovo+", com "+menorIdade+" anos");
		ler.close();
	}
}
