package exercicio;

import java.util.Date;
import java.util.Scanner;

public class Aluno {

	public static void main(String[] args) {
		
		String nome; 
		int matricula, periodo;
		double nota1, nota2, nota3, nota4, media;
		
		Date DataHora = new Date();		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.print("Digite seu Nome: ");
		nome = teclado.nextLine();
		System.out.print("Digite sua Matrícula: ");
		matricula = teclado.nextInt();
		System.out.print("Digite o Período: ");
		periodo = teclado.nextInt();
		System.out.print("Digite a 1ª Nota: ");
		nota1 = teclado.nextDouble();
		System.out.print("Digite a 2ª Nota: ");
		nota2 = teclado.nextDouble();
		System.out.print("Digite a 3ª Nota: ");
		nota3 = teclado.nextDouble();
		System.out.print("Digite a 4ª Nota: ");
		nota4 = teclado.nextDouble();
		
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.println("=======================================");
		System.out.println("            UNIVERSIDADE MV            ");
		System.out.println("=======================================");
		System.out.println("     B O L E T I M  DO  A L U N O      ");
		System.out.println("---------------------------------------");
		System.out.println("NOME: " + nome);
		System.out.println("MATRÍCULA: " + matricula);
		System.out.println("CURSO: CUBO 2023.2");
		System.out.println("PERIODO: " + periodo + "º.");
		System.out.println("1ª Nota: " + nota1);
		System.out.println("2ª Nota: " + nota2);
		System.out.println("3ª Nota: " + nota3);
		System.out.println("4ª Nota: " + nota4);
		
		System.out.println("MÉDIA: " + media);
		
		if (media >= 7) {
			System.out.println("-------------------------------------");
			System.out.println("O Aluno " + nome + " está APROVADO!!!");
			System.out.println("-------------------------------------");
		}else if ((media >= 5) && (media <= 6.9)) {
			System.out.println("-----------------------------------------");
			System.out.println("O Aluno " + nome + " está em RECUPERAÇÃO.");
			System.out.println("-----------------------------------------");
		}else if (media < 5) {
			System.out.println("------------------------------------");
			System.out.println("O Aluno " + nome + " está REPROVADO.");
			System.out.println("------------------------------------");
		}
		System.out.println();
		System.out.println("CONSULTA REALIZADA EM: ");
		System.out.println(DataHora.toString());
	
	}

}
