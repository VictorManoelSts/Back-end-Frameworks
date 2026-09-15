package br.edu.nassau.api_cursos.controller;

import br.edu.nassau.api_cursos.service.CursoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CursoController {
    private  CursoService cursoService;

    public CursoController(CursoService cursoService){
        this.cursoService = cursoService;
    }

    @GetMapping("/curso/mensagem")
    public String mensagem(){
        return cursoService.mensagem();
    }
}
