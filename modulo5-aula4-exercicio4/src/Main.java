import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Funcionario> listaFuncionarios = new ArrayList<>();

        Empresa empresa = new Empresa("Meli" , new BigDecimal(150000), listaFuncionarios, 7);

        PJ pj = new PJ("Fulano", "1234", empresa, 30, BigDecimal.valueOf(20.23));

        CLT tecnico = new Tecnico("Ricardo", "222333", empresa);
        CLT analista = new Analista("Zé", "1312", empresa);
        CLT gerente = new Gerente("Jorge", "342", empresa);
        CLT diretor = new Diretor("Silva", "3", empresa);

        pj.pagarSalario();
        tecnico.pagarSalario();
        analista.pagarSalario();
        gerente.pagarSalario();
        diretor.pagarSalario();

        System.out.println(empresa.getListaFuncionarios().size());

    }
}
