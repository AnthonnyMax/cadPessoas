package com.anthonnymax.cadPessoas.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anthonnymax.cadPessoas.entidade.Curso;

@Repository
public interface CursoDao extends JpaRepository<Curso, Long>{

}