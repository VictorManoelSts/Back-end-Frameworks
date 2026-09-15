package br.edu.nassau.api_cursos.controller;

import br.edu.nassau.api_cursos.model.Curso;
import br.edu.nassau.api_cursos.service.CursoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {
    private  CursoService cursoService;

    public CursoController(CursoService cursoService){
        this.cursoService = cursoService;
    }
    @GetMapping
    public List<Curso> listar(){
        return cursoService.listar();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Curso cadastrar(@RequestBody Curso curso){
        return cursoService.cadastrar(curso);
    }
    @GetMapping("/{id}")
    public Curso buscarPorId(@PathVariable Long id){
        return cursoService.buscarPorId(id);
    }
    @PutMapping("/{id}")
    public Curso atualizar(@PathVariable Long id, @RequestBody Curso curso){
        return cursoService.atualizar(id, curso);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void remover(@PathVariable Long id){
        cursoService.remover(id);
    }


}
