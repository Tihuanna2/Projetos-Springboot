package com.tihuanna.blogpessoal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table (name = "tb_usuarioLogin")
public class UsuarioLogin {

	
	@Id
	@GeneratedValue
	private Long id;
	
	@NotBlank
	@Size (min = 5, max = 25, message = "O atributo nome precisa conter entre 5 a 25 caracteres!!")
	private String nome;
	
	@NotBlank
	@Size (min = 5, max = 25, message = "O atributo usuario precisa conter entre 5 a 25 caracteres!!")
	private String usuario;
	
	@NotBlank
	@Size (min = 7, max = 25, message = "O atributo senha precisa conter entre 5 a 25 caracteres!!")
	private String senha;
	
	@NotBlank
	@Size (min = 5, max = 25, message = "O atributo foto precisa conter entre 5 a 25 caracteres!!")
	private String foto;
	
	@NotBlank
	@Size (min = 5, max = 100, message = "O atributo token precisa conter entre 5 a 25 caracteres!!")
	private String token;
	
	
}
