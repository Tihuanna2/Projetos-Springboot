package com.tihuanna.blogpessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tihuanna.blogpessoal.model.Tema;

@Repository
public interface TemaRepository extends JpaRepository<Tema, Long> {

}
