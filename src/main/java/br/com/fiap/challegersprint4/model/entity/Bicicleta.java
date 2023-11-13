package br.com.fiap.challegersprint4.model.entity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class Bicicleta {
	
	@NotNull
	private Long peso;
	@NotNull
	private Long preco;
	@NotBlank
	private String marca;
	@NotBlank
	private String tipo;
	@NotBlank
	private String material;
	
	public Bicicleta() {
	}
	
	
	public Bicicleta(@NotNull Long peso, @NotNull Long preco, @NotBlank String marca, @NotBlank String tipo,
			@NotBlank String material) {
		this.peso = peso;
		this.preco = preco;
		this.marca = marca;
		this.tipo = tipo;
		this.material = material;
	}
	

	public Long getPeso() {
		return peso;
	}
	public void setPeso(Long peso) {
		this.peso = peso;
	}
	public Long getPreco() {
		return preco;
	}
	public void setPreco(Long preco) {
		this.preco = preco;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	
	
}
