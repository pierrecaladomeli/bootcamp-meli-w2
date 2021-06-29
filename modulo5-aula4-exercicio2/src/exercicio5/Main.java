package exercicio5;

import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        Data data = new Data(30,12,2021);
        Data dataInvalida = new Data(35, 01, 2022);

        System.out.println(data.isValid());
        System.out.println(data);
        data.adicionarDia();
        System.out.println(data);
        data.adicionarDia();
        System.out.println(data);

        System.out.println(dataInvalida);

    }

}
