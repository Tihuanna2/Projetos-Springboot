package com.tihuanna.blogpessoal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table (name = "tb_temas")
public class Tema {

	@Id
	@GeneratedValue
	private Long id;
	
	@NotBlank
	@Size (min = 5, max = 100, message = "O atributo descricao deve conter entre 5 a 100 caracteres")
	private String descricao;
}
