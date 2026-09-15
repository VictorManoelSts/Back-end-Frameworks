package br.edu.nassau.api_cursos.model;

public class Curso {
    private Long id;
    private String nome;
    private Integer cargaHoraria;

    public Curso(){

    }

    public Curso(Long id, Integer cargaHoraria, String nome) {
        this.id = id;
        this.cargaHoraria = cargaHoraria;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
