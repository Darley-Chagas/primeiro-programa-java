package curso.java;

import java.util.Date;

public class Pessoa {
	
	private String nome;
	
	private String sobrenome;
	
	private String sexo;
	

	private int idade;
	
	private Date dataNascimento;
	

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
/*Teste*/
}
