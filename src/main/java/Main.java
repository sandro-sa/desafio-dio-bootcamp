import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Descrição do curso javascript");
        curso2.setCargaHoraria(5);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        System.out.println();
        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.isnscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos João"+devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();

        System.out.println("-----");
        System.out.println("Conteúdos inscritos João"+devJoao.getConteudosInscritos());
        System.out.println("Conteúdos conluidos João"+devJoao.getConteudosConcluidos());
        System.out.println("XP: "+devJoao.calcularTotalXp());
        System.out.println();

        Dev devThereza = new Dev();
        devThereza.setNome("Thereza");
        devThereza.isnscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Thereza"+devThereza.getConteudosInscritos());
        devThereza.progredir();
        System.out.println("-----");
        System.out.println("Conteúdos inscritos Thereza"+devThereza.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Thereza"+devThereza.getConteudosConcluidos());
        System.out.println("XP: "+devThereza.calcularTotalXp());
//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);
    }
}
