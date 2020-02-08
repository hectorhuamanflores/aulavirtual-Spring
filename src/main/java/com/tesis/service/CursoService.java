package com.tesis.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tesis.model.Curso;
import com.tesis.model.Menu;
import com.tesis.repository.ICursoRepository;

@Service
public class CursoService implements ICursoService{
	
    @Autowired
	private ICursoRepository cursoRepo;
	
	@Override
	public Curso registrar(Curso t) {
		// TODO Auto-generated method stub
		return cursoRepo.save(t);
	}

	@Override
	public Curso modificar(Curso t) {
		// TODO Auto-generated method stub
		return cursoRepo.save(t);
	}

	@Override
	public Curso leer(Integer id) {
		// TODO Auto-generated method stub
		Optional<Curso> op = cursoRepo.findById(id);
		return op.isPresent() ? op.get() : new Curso();
	}

	@Override
	public List<Curso> listar() {
		// TODO Auto-generated method stub
		return cursoRepo.findAll();
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		cursoRepo.deleteById(id);
	}

}
