package br.com.fiap.challegersprint4.model.entity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class Cliente {
	
	@NotBlank
	private String nome;
	@NotNull
	private Long idade;
	@NotNull
	private String cpf;
	@NotBlank
	private String telefone;
	@NotNull
	private String email;
	@NotBlank
	private String endereco;
	
	
	public Cliente() {

	}

	public Cliente(@NotBlank String nome, @NotNull Long idade, @NotNull String cpf, @NotBlank String telefone,
			@NotNull String email, @NotBlank String endereco) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getIdade() {
		return idade;
	}

	public void setIdade(Long idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
}



