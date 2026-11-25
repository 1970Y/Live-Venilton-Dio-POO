package Domínio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Bootcamp {
    private String nome;
    private LocalDate início;
    private LocalDate fim;
    private List<ConteúdoEducacional> conteúdos = new ArrayList<>();
    private List<Dev> devs = new ArrayList<Dev>();
    
    public LocalDate getInício() {
        return início;
    }

    public void setInício(LocalDate início) {
        this.início = início;
    }

    public LocalDate getFim() {
        return fim;
    }

    public void setFim(LocalDate fim) {
        this.fim = fim;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Dev> getDevs() {
        return devs;
    }

    public void setDevs(List<Dev> devs) {
        this.devs = devs;
    }

    public List<ConteúdoEducacional> getConteúdos() {
        return conteúdos;
    }

    public void setConteúdos(List<ConteúdoEducacional> conteúdos) {
        this.conteúdos = conteúdos;
    }
}
