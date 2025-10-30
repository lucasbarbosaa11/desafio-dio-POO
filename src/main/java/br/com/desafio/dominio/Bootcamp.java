package br.com.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInico = LocalDate.now();
    private final LocalDate dataFim = dataInico.plusDays(45);
    private Set<Dev> devsinscritos = new HashSet<>();
    private Set<Conteudos> Conteudos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInico() {
        return dataInico;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public Set<Dev> getDevsinscritos() {
        return devsinscritos;
    }

    public void setDevsinscritos(Set<Dev> devsinscritos) {
        this.devsinscritos = devsinscritos;
    }

    public Set<Conteudos> getConteudos() {
        return Conteudos;
    }

    public void setConteudos(Set<Conteudos> conteudos) {
        Conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInico, bootcamp.dataInico) && Objects.equals(dataFim, bootcamp.dataFim) && Objects.equals(devsinscritos, bootcamp.devsinscritos) && Objects.equals(Conteudos, bootcamp.Conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInico, dataFim, devsinscritos, Conteudos);
    }
}
