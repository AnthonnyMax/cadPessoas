package com.anthonnymax.cadPessoas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/pessoa") 

public class PessoaRest {

	@Autowired 
	private PessoaDao pessoaDao;
	
	@GetMapping 
	public List<Pessoa> get(){
		return pessoaDao.findAll();
	}
	
	@PostMapping 
	public void post(@RequestBody Pessoa pessoa) { 
		pessoaDao.save(pessoa);
	}
}
