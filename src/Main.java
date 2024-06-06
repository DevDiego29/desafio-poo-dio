import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[]args){
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(9);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição curso Js");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria java");
        LocalDate localDate = null;
        mentoria.setData(localDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDiego = new Dev();
        devDiego.setNome("Diego");
        devDiego.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos de Diego: " + devDiego.getConteudosInscritos());
        devDiego.progredir();
        devDiego.progredir();
        System.out.println("--");
        System.out.println("Conteudos inscritos de Diego: " + devDiego.getConteudosInscritos());
        System.out.println("Conteudos concluídos de Diego: " + devDiego.getConteudosConcluidos());
        System.out.println("XP: " + devDiego.calcularTotalXp());

        System.out.println("-----------------------");

        Dev devAna = new Dev();
        devAna.setNome("Ana Paula");
        devAna.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos de Ana: " + devAna.getConteudosInscritos());
        devAna.progredir();
        devAna.progredir();
        devAna.progredir();
        System.out.println("--");
        System.out.println("Conteudos inscritos de Ana: " + devAna.getConteudosInscritos());
        System.out.println("Conteudos concluidos de Ana: " + devAna.getConteudosConcluidos());
        System.out.println("XP: " + devAna.calcularTotalXp());
    }
}