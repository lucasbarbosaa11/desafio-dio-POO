package br.com.desafio.dominio;

public class Curso extends Conteudos {
    private int carga;

    public Curso() {
    }


    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", carga=" + carga +
                '}';
    }

    @Override
    public double CalcularXP() {
        return XP_PADRAO * carga;
    }
}
