package br.edu.nassau.api_cursos.service;

import br.edu.nassau.api_cursos.model.Curso;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CursoService {
    private final List<Curso> cursos = new ArrayList<>();
    private Long proximoId= 1L;

    public List<Curso> listar(){
        return cursos;
    }

    public Curso cadastrar(Curso curso){
        curso.setId(proximoId++);
        cursos.add(curso);
        return curso;
    }
    public Curso buscarPorId(Long id){
        for (Curso curso : cursos){
            if (curso.getId().equals(id)){
                return curso;
            }
        }
        return null;
    }
    public Curso atualizar(Long id, Curso dados){
        Curso curso = buscarPorId(id);
        if (curso == null) return  null;
        curso.setNome(dados.getNome());
        curso.setCargaHoraria(dados.getCargaHoraria());
        return curso;
    }
    public void remover(Long id){
        Curso curso = buscarPorId(id);
        cursos.remove(curso);
    }
}
