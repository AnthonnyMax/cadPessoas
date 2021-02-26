package com.anthonnymax.cadPessoas.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anthonnymax.cadPessoas.entidade.Turma;

@Repository
public interface TurmaDao extends JpaRepository<Turma, Long>{

}
