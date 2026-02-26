package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.util.Scanner;

import entities.Paciente;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		
		System.out.println("Dr. Isabelle Machado Alves");
		System.out.println("__________________________");
		
		System.out.println("MENU");
		
		System.out.println("");
		
		System.out.println("1 - CADASTRAR NOVO PACIENTE");
		System.out.println("2 - PROCURAR PACIENTE");
		System.out.println("3 - NOVA CONSULTA");
		System.out.println("4 - PROCURAR CONSULTA");
		System.out.println("0 - SAIR");
		
		System.out.println("");
		
		System.out.print("OPÇÃO: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		switch (n) {
		case 0:
			System.out.println("FECHANDO PROGRAMA...");
			break;
		case 1:
			Paciente paciente;
			
			System.out.print("NOME: ");
			String name = sc.nextLine();
			
			System.out.print("CPF: ");
			String cpf = sc.nextLine();
			
			System.out.print("DATA DE NASCIMENTO: ");
			String dataDigitada = sc.nextLine();
			
			try {
				LocalDate dataNascimento = LocalDate.parse(dataDigitada, formatador);
				
				if(dataNascimento.isAfter(LocalDate.now())) {
					System.out.println("Data de nascimento não pode ser no futuro!");
				}
				else {
					paciente = new Paciente(name, cpf, dataNascimento);
					System.out.println("PACIENTE CADASTRADO COM SUCESSO!");
					System.out.println(paciente.toString());
				}	
			} catch (DateTimeParseException e) {
				System.err.println("ERRO: FORMATO DE DATA INVÁLIDO! USE O PADRÃO dd/MM/yyyy.");
			}
		}
		
		sc.close();
	}

}
