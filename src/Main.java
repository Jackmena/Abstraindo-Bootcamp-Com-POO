import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        //System.out.println(curso1);
        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devJackson = new Dev();
        devJackson.setNome("Jackson");
        devJackson.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Jackson" + devJackson.getConteudosInscritos());
        devJackson.progredir();
        System.out.println("--");
        System.out.println("Conteúdos Inscritos Jackson" + devJackson.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Jackson" + devJackson.getConteudosConcluidos());
        System.out.println("XP: " + devJackson.calcularTotalXp());
        
        System.out.println("---------");
        
        Dev devDani = new Dev();
        devDani.setNome("Danillo");
        devDani.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Danillo" + devDani.getConteudosInscritos());
        devDani.progredir();
        devDani.progredir();
        System.out.println("--");
        System.out.println("Conteúdos Inscritos Danillo" + devDani.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Danillo" + devDani.getConteudosConcluidos());
        System.out.println("XP: " + devDani.calcularTotalXp());
    }

}
