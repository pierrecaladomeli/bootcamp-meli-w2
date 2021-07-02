import java.math.BigDecimal;
import java.util.List;

public class Empresa {
    private String nome;
    private BigDecimal lucros;
    private List<Funcionario> listaFuncionarios;
    private int metasBatidas;

    public Empresa(String nome, BigDecimal lucros, List<Funcionario> listaFuncionarios, int metasBatidas) {
        this.nome = nome;
        this.lucros = lucros;
        this.listaFuncionarios = listaFuncionarios;
        this.metasBatidas = metasBatidas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getLucros() {
        return lucros;
    }

    public void setLucros(BigDecimal lucros) {
        this.lucros = lucros;
    }

    public List<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }

    public void setListaFuncionarios(List<Funcionario> listaFuncionarios) {
        this.listaFuncionarios = listaFuncionarios;
    }

    public int getMetasBatidas() {
        return metasBatidas;
    }

    public void setMetasBatidas(int metasBatidas) {
        this.metasBatidas = metasBatidas;
    }
}
