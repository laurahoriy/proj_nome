package projetos_LPA.aula04;

import java.util.Scanner;

public class Ativ {

	public static void main(String[] args) {
	//VARIÁVEIS
	double horatrab,valorhora,salbruto,salliquido,inss;
	Scanner ler = new Scanner(System.in);
	//ENTRADA
	System.out.println("Informe a hora de trabalho");
	horatrab = ler.nextDouble();
	System.out.println("Informe o valor por hora");
	valorhora = ler.nextDouble();
	System.out.println("Informe o salário bruto");
	salbruto = ler.nextDouble();
	System.out.println("Informe o salário líquido");
	salliquido = ler.nextDouble();
	System.out.println("Informe o INSS (desconto)");
	inss = ler.nextDouble();
	//PROCESSAMENTO
	salbruto = horatrab * valorhora;
	inss = salbruto * 0.12;
	salliquido = salbruto - inss;
	//SAÍDA
	System.out.println("O resultado do salário bruto é:" + salbruto);
	System.out.println("O resultado do salário líquido é:" + salliquido);	
	
	
	

	}

}
