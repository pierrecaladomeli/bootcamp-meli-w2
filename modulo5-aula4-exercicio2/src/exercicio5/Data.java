package exercicio5;

import java.time.Year;
import java.util.Arrays;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    private final static int[] DIAS_DO_MES = {31,28,31,30,31,30,31,31,30,31,30,31};
    private final static int[] DIAS_DO_MES_BISSEXTO = {31,29,31,30,31,30,31,31,30,31,30,31};

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isValid (){
        if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || ano < 1) {
            return false;
        } else {
            int[] ultimosDias = DIAS_DO_MES;
            if (Year.isLeap(ano)) {
                ultimosDias = DIAS_DO_MES_BISSEXTO;
            }
            if (dia > ultimosDias[mes-1]){
                return false;
            }
        }
        return true;
    }

    public void adicionarDia(){
        if (this.isValid()){
            int[] ultimosDias = DIAS_DO_MES;
            if (Year.isLeap(ano)) {
                ultimosDias = DIAS_DO_MES_BISSEXTO;
            }

            dia++;

            if (dia > ultimosDias[mes-1]) {
                dia = 1;
                mes++;

                if(mes > 12){
                    mes = 1;
                    ano++;
                }
            }
        }


    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
}
