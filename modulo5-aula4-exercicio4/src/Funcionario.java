public abstract class Funcionario {
    private String nome;
    private String registro;
    private Empresa empresa;

    public Funcionario(String nome, String registro, Empresa empresa) {
        this.nome = nome;
        this.registro = registro;
        this.empresa = empresa;
        empresa.getListaFuncionarios().add(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public abstract void pagarSalario();
}
