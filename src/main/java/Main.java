import br.com.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Conteudos conteudos = new Curso();

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso Java");
        curso1.setCarga(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Curso Java");
        curso2.setCarga(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Mentoria Java");
        mentoria1.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao(" Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreverBootcamp(bootcamp);
        System.out.println("XP total: " + devLucas.calcularXp());
        System.out.println("Conteudos Inscritos:" + devLucas.getConteudosInscritos());
        devLucas.progresso();
        System.out.println("Conteudos Concluidos:" + devLucas.getConteudosconcluidos());


        Dev devOtavio = new Dev();
        devOtavio.setNome("Otavio");
        devOtavio.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos:" + devOtavio.getConteudosInscritos());
        devOtavio.progresso();
        System.out.println("Conteudos Concluidos:" + devOtavio.getConteudosconcluidos());
        System.out.println("XP: " + devOtavio.calcularXp());



    }
}
