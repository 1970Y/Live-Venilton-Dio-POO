package Domínio;

public abstract class ConteúdoEducacional {
    protected static final double XP_PADRÃO = 10.0;
    private String título;
    private String descrição;

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public abstract double calcularXP();
}
