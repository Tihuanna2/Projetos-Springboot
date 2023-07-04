package com.tihuanna.blogpessoal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table (name = "tb_usuarios")
public class Usuario {
	
	@Id
	@GeneratedValue
	private Long userId;
	
	@NotBlank
	@Size (min = 5, max = 25, message = "O atributo nome deve conter entre 5 a 25 caracteres!!")
	private String nome;
	
	@NotBlank
	@Size (min = 5, max = 25, message = "O atributo usuario deve conter entre 5 a 25 caracteres!!")
	private String usuario;
	
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@NotBlank
	@Size (min = 7, max = 25, message = "O atributo senha deve conter entre 5 a 25 caracteres!!")
	private String senha;

}
