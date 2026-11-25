
import Domínio.Curso;
import Domínio.Mentoria;
import Domínio.Bootcamp;
import Domínio.Dev;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso cursoJavaBásico = new Curso();
        cursoJavaBásico.setTítulo("Java Básico");
        cursoJavaBásico.setDescrição("Aprenda os Concetos Básicos da Linguagem Java");
        cursoJavaBásico.setCargaHorária(80);

        Curso cursoDotNet = new Curso();
        cursoDotNet.setTítulo("C# Básico");
        cursoDotNet.setDescrição("Aprenda os Concetos Básicos da Linguagem C#");
        cursoDotNet.setCargaHorária(80);

        Curso cursoJavaII = new Curso();
        cursoJavaII.setTítulo("Java Intermediário");
        cursoJavaII.setDescrição("Aprenda os Concetos Intermediários da Linguagem Java");
        cursoJavaII.setCargaHorária(80);

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTítulo("Aprendendo POO com Java");
        mentoriaJava.setDescrição("Imersão sobre os pilares da POO  com Java");
        mentoriaJava.setData(LocalDate.now());

        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Bootcamp Java Developer");    
        bootcampJava.setInício(LocalDate.now());
        bootcampJava.setFim(LocalDate.now().plusDays(45));
        bootcampJava.setConteúdos(Arrays.asList(cursoJavaBásico, cursoJavaII, mentoriaJava, cursoDotNet));
    
        Dev felipão = new Dev();
        felipão.setNome("Felipe");
        felipão.inscrever(bootcampJava);
        felipão.inscrever(cursoDotNet);
        System.out.println("Conteúdos Inscritos de " + felipão.getNome() + ": " + felipão.getConteúdosInscritos());
        felipão.progredir();
        felipão.progredir();


        Dev venilton = new Dev();
        venilton.setNome("Venilton");
        venilton.inscrever(bootcampJava);
        System.out.println("Conteúdos Inscritos de " + venilton.getNome() + ": " + venilton.getConteúdosInscritos());
        venilton.progredir();
        venilton.progredir();
        venilton.progredir();

        System.out.println(String.format("XP Felipão: %.2f", felipão.calcularTotalXP()));
        System.out.println(String.format("XP Venilton: %.2f", venilton.calcularTotalXP()));

        List<Dev> ranking = Arrays.asList(felipão, venilton).stream()
                 .sorted((dev1, dev2) -> Double.compare(dev2.calcularTotalXP(), dev1.calcularTotalXP()))
                 .collect(Collectors.toList());

        for (Dev dev : ranking) {
            System.out.println(String.format("Dev: %s - XP: %.2f", dev.getNome(), dev.calcularTotalXP()));
        }
    }
}
