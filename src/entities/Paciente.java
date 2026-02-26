package entities;

import java.time.LocalDate;


public class Paciente {
	
	private String name;
	private String cpf;
	private LocalDate dataNascimento;
	
	public Paciente() {
		
	}

	public Paciente(String name, String cpf, LocalDate dataNascimento) {
		this.name = name;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
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
	}
	
	public String toString() {
		return name + ", " + cpf + ", " + dataNascimento;
	}
	
}
