import desafio.Bootcamp;
import desafio.Curso;
import desafio.Dev;
import desafio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Descrição do curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de JavaScript");
        curso2.setDescricao("Descrição do curso de JavaScript");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da mentoria");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos da Maria: " + devMaria.getConteudosInscritos());
        devMaria.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos da Maria: " + devMaria.getConteudosInscritos());
        System.out.println("Conteúdos concluídos da Maria: " + devMaria.getConteudosConcluidos());
        System.out.println("XP:" + devMaria.calcularTotalXp());


        Dev devJoao = new Dev();
        devJoao.setNome("Maria");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos do João: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos do João: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos concluídos do João: " + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

    }
}