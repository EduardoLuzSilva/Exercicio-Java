package exercicio;

import java.util.Date;
import java.util.Scanner;

public class ExercicioEndereco {

	public static void main(String[] args) {
		
		String nome;
		String rua;
		String bairro;
		String cidade;
		String estado;
		String complemento;
		String datanasc;
		String cpf;
		String rg;
		String cep;
		int numero;  
		double peso;
		double altura;
		double imc;
		
		Date DataHora = new Date();
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("=================================================");
		System.out.println("                  C A D A S T R O                ");
		System.out.println("=================================================");
		System.out.println("                  DADOS PESSOAIS                 ");
		System.out.println();
		System.out.print("Digite seu Nome: ");
		nome = teclado.nextLine();
		System.out.print("Digite sua Data de Nascimento: ");
		datanasc = teclado.nextLine();
		System.out.print("Digite o número do RG: ");
		rg = teclado.nextLine();
		System.out.print("Digite o número do CPF: ");
		cpf = teclado.nextLine();
		System.out.print("Digite seu Peso: ");
		peso = teclado.nextDouble();
		System.out.print("Digite sua Altura: ");
		altura = teclado.nextDouble();
		teclado.nextLine();
		System.out.print("Digite o nome da rua: ");
		rua = teclado.nextLine();
		System.out.print("Digite o número da residência: ");
		numero = teclado.nextInt();
		teclado.nextLine();
		System.out.print("Digite o complemento: ");
		complemento = teclado.nextLine();
		System.out.print("Digite o CEP: ");
		cep = teclado.nextLine();
		System.out.print("Digite o Bairro: ");
		bairro = teclado.nextLine();
		System.out.print("Digite a Cidade: ");
		cidade = teclado.nextLine();
		System.out.print("Digite o Estado: ");
		estado = teclado.nextLine();
		
		imc = peso / (altura*altura);
		
		System.out.println();
		System.out.println("=================================================");
		System.out.println("                 C A D A S T R O                 ");
		System.out.println("=================================================");
		System.out.println("                 DADOS PESSOAIS                  ");
		System.out.println();
		System.out.println("NOME: " + nome);
		System.out.println("DATA DE NASCIMENTO: " + datanasc);
		System.out.println("RG: " + rg);
		System.out.println("CPF: " + cpf);
		System.out.println("PESO: " + peso);
		System.out.println("ALTURA: " + altura);
		System.out.format("Seu IMC é: %.2f\n", imc);
		if(imc <= 18.4) {
			System.out.println("Cuidado, você está ABAIXO DO PESO ideal");
		}else if((imc >= 18.5) && (imc <= 24.99)) {
				System.out.println("Parabéns, seu peso está NORMAL.");
		}else if((imc >=25) && (imc <= 29.99)) {
				System.out.println("Você está com SOBREPESO.");
		}else if((imc >= 30) && (imc <=34.99)) {
				System.out.println("Você está com OBESIDADE GRAU 1.");			
		}else if((imc >= 35) && (imc <= 39.99)) {
				System.out.println("Se cuide, você está com OBESIDADE GRAU 2 (Morbida).");
		}else if(imc >= 40) {
				System.out.println("Cuidado, você está com OBESIDADE GRAU 3 (Morbida.)");
		}
		System.out.println();
		System.out.println("-------------------------------------------------");
		System.out.println("                    ENDEREÇO                     ");
		System.out.println("RUA: " + rua);
		System.out.println("NÚMERO: " + numero);
		System.out.println("COMPLEMENTO: " + complemento);
		System.out.println("CEP: " + cep);
		System.out.println("BAIRRO: " + bairro);
		System.out.println("CIDADE: " + cidade);
		System.out.println("ESTADO: " + estado +"BR");
		
		System.out.println();
		System.out.println("CONSULTA REALIZADA EM: ");
		System.out.println(DataHora.toString());
		

	}

}
