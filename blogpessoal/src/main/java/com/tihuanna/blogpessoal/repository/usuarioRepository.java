package com.tihuanna.blogpessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tihuanna.blogpessoal.model.Usuario;

@Repository
public interface usuarioRepository extends JpaRepository<Usuario, Long> {

}
