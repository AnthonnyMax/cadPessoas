package com.anthonnymax.cadPessoas.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anthonnymax.cadPessoas.entidade.Pessoa;

@Repository 
public interface PessoaDao extends JpaRepository<Pessoa, Long>{

}