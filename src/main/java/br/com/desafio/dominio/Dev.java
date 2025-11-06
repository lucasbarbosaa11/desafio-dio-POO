package br.com.desafio.dominio;

import java.util.*;

public class Dev {
    private String nome;
    private Set<Conteudos> conteudosInscritos =  new LinkedHashSet<>();
    private Set<Conteudos> conteudosConcluidos =   new LinkedHashSet<>();


    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsinscritos().add(this);
    }

    public void progresso() {
        Optional<Conteudos> conteudo = this.conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()){
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum curso!");
        }
    }

    public double  calcularXp() {
        this.conteudosConcluidos.stream().mapToDouble(Conteudos -> Conteudos.CalcularXP()).sum();
        return Conteudos.XP_PADRAO * Curso.XP_PADRAO;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudos> getConteudosconcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidosonteudosConcluidos(Set<Conteudos> conteudosconcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    public Set<Conteudos> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudos> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}
