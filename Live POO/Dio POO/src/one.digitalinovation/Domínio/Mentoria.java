package Domínio;

import java.time.LocalDate;

public class Mentoria extends ConteúdoEducacional {
    private LocalDate data;

    @Override
    public double calcularXP() {
        return XP_PADRÃO + 20.0;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

}
