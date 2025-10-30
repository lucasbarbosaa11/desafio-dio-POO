package br.com.desafio.dominio;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudos> conteudosinscritos =  new LinkedHashSet<>();
    private Set<Conteudos> conteudosconcluidos =   new LinkedHashSet<>();


    public void inscreverBootcamp(Bootcamp bootcamp) {}

    public void progresso() {}

    public void calcularXp() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudos> getConteudosconcluidos() {
        return conteudosconcluidos;
    }

    public void setConteudosconcluidos(Set<Conteudos> conteudosconcluidos) {
        this.conteudosconcluidos = conteudosconcluidos;
    }

    public Set<Conteudos> getConteudosinscritos() {
        return conteudosinscritos;
    }

    public void setConteudosinscritos(Set<Conteudos> conteudosinscritos) {
        this.conteudosinscritos = conteudosinscritos;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosinscritos, dev.conteudosinscritos) && Objects.equals(conteudosconcluidos, dev.conteudosconcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosinscritos, conteudosconcluidos);
    }
}
