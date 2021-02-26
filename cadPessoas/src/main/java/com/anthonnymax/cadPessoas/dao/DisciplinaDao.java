package com.anthonnymax.cadPessoas.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anthonnymax.cadPessoas.entidade.Disciplina;

@Repository
public interface DisciplinaDao extends JpaRepository<Disciplina, Long>{

}