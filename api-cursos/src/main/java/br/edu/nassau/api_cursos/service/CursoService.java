package br.edu.nassau.api_cursos.service;

import br.edu.nassau.api_cursos.model.Curso;
import br.edu.nassau.api_cursos.repository.CursoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CursoService {
    private final CursoRepository repository;

    public CursoService(CursoRepository repository){
        this.repository = repository;
    }

    public Curso cadastrar(Curso curso){
        if (curso.getNome() == null){
            throw new IllegalArgumentException("O nome é obrigatório!");
        }
        if (curso.getCargaHoraria() <= 0){
            throw new IllegalArgumentException("A carga Horária deve sr maior que 0!");
        }
        return repository.cadastrar(curso);
    }
    public List<Curso> listar(){
        return repository.listar();
    }
    public Curso buscarPorId(Long id){
        return repository.buscarPorId(id);
    }
    public Curso atualizar(Long id, Curso dados){
        Curso curso = repository.buscarPorId(id);
        if (curso == null) return null;
        curso.setNome(dados.getNome());
        curso.setCargaHoraria(dados.getCargaHoraria());
        return curso;
    }
    public void remover(Long id){
        Curso curso = repository.buscarPorId(id);
        if (curso != null){
            repository.remover(curso);
        }

    }

}
