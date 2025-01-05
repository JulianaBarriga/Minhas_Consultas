package Facade;
import java.util.Objects;

public class Apartamento {
    private Long codigo;
    private String end;



    public Apartamento(Long codigo, String endereco) {
        this.codigo = codigo;
        this.end = endereco;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Apartamento that = (Apartamento) obj;
        return Objects.equals(codigo,that.codigo) && Objects.equals(end,that.end);

    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, end);
    }
}
