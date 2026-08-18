package model.entities;

import java.time.LocalDate;
import java.time.Period;

public class Paciente {
	
	private String name;
	private String cpf;
	private LocalDate dataNascimento;
	private int idade;
	
	public Paciente() {
		
	}

	public Paciente(String name, String cpf, LocalDate dataNascimento) {
		this.name = name;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.idade = calcularIdade(dataNascimento);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
		this.idade = calcularIdade(dataNascimento);
	}
	
	public int getIdade() {
		return idade;
	}
	
	private int calcularIdade(LocalDate dataNascimento) {
		if (dataNascimento == null) {
			return 0;
		}
		return  Period.between(this.dataNascimento, LocalDate.now()).getYears();
	}
	
	public String toString() {
		return "Paciente: " + name + "\n" + 
				" | CPF: " + cpf + "\n" + 
				" | Nascimento: " + dataNascimento + "\n" + 
				" | Idade: " + idade + " anos";
	}
	
}
