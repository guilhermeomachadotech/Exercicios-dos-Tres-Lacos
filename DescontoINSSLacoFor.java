import java.util.Scanner;
public class DescontoINSSLacoFor {
	public static void main (String args[]) {
		Scanner ler=new Scanner (System.in);
		int i;
		double salario, desc;
		for (i=1;i<=4;i++) {
			System.out.println ("Digite o sal�rio do "+i+"� funcion�rio:");
			salario=ler.nextDouble();
			if (salario <2000.00) {
				desc=salario-(salario*8.5)/100;
				System.out.println ("O desconto do INSS � R$ "+desc);
			}else {
				desc=salario-(salario*11)/100;
				System.out.println ("O desconto do INSS � de R$ "+desc);
			}
		}
		ler.close();
	}
}
