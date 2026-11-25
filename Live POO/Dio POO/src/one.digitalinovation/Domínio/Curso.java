package Domínio;

public class Curso extends ConteúdoEducacional {
    private int cargaHorária;

    @Override
    public double calcularXP() {
        return XP_PADRÃO * cargaHorária;
    }

    public int getCargaHorária() {
        return cargaHorária;
    }

    public void setCargaHorária(int cargaHorária) {
        this.cargaHorária = cargaHorária;
    }
}

