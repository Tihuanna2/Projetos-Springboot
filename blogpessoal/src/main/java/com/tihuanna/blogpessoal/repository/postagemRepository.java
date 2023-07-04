package com.tihuanna.blogpessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tihuanna.blogpessoal.model.Postagem;

@Repository
public interface postagemRepository extends JpaRepository<Postagem, Long> {

}
