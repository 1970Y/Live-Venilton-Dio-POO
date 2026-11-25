package Domínio;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Dev {
    private String nome;
    private List<ConteúdoEducacional> conteúdosInscritos = new ArrayList<>();
    private List<ConteúdoEducacional> conteúdosConcluídos = new ArrayList<>();

    public void inscrever (ConteúdoEducacional conteúdo) {
        if (conteúdosInscritos.contains(conteúdo)) {
            System.out.println("O conteúdo já está inscrito.");
        } else {
            this.conteúdosInscritos.add(conteúdo);
        }
    }

    public void inscrever(Bootcamp bootcamp) {
        for (ConteúdoEducacional conteúdo : bootcamp.getConteúdos()) {
            inscrever(conteúdo);
        }
        if (!bootcamp.getDevs().contains(this)) {
            bootcamp.getDevs().add(this);
        }
    }

    public void progredir() {
        Optional<ConteúdoEducacional> conteúdo = conteúdosInscritos.stream().findFirst();
        if (conteúdo.isPresent()) {
            conteúdosConcluídos.add(conteúdo.get());
            conteúdosInscritos.remove(conteúdo.get());
        } else {
            System.out.println("Você não está matriculado em nenhum conteúdo.");
        }
    }

    public double calcularTotalXP() {
        return conteúdosConcluídos.stream().mapToDouble(ConteúdoEducacional::calcularXP).sum();
    }

    public List<ConteúdoEducacional> getConteúdosInscritos() {
        return conteúdosInscritos;
    }

    public void setConteúdosInscritos(List<ConteúdoEducacional> conteúdosInscritos) {
        this.conteúdosInscritos = conteúdosInscritos;
    }

    public List<ConteúdoEducacional> getConteúdosConcluídos() {
        return conteúdosConcluídos;
    }

    public void setConteúdosConcluídos(List<ConteúdoEducacional> conteúdosConcluídos) {
        this.conteúdosConcluídos = conteúdosConcluídos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
