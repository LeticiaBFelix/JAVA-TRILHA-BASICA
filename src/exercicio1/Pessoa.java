package exercicio1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DateFormat;

public class Pessoa {

    DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

    private String nome;
    private Date dataNasc = df.parse(getDataRecebida());
    private String dataRecebida;
    private double altura;


    public Pessoa(String nome) throws ParseException{
        this.nome = nome;
        //this.dataRecebida = dataRecebida;
        //this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public String getDataRecebida() {
        return dataRecebida;
    }

    public double getAltura() {
        return altura;
    }

    public void imprimir() {
        System.out.println("Nome: " + getNome());
        //System.out.println("Data de nascimento: " + getDataNasc());
        //System.out.println("Altura: " + getAltura());
    }

    /*public void getIdade(Pessoa pessoa) {
        GregorianCalendar dataAtual=new GregorianCalendar();
        GregorianCalendar nascimento=new GregorianCalendar();
        if(pessoa.getDataNasc() != null){
            nascimento.setTime(pessoa.getDataNasc());
        }
        int anoAtual = dataAtual.get(Calendar.YEAR);
        int anoNascimento = nascimento.get(Calendar.YEAR);
        System.out.println(anoAtual-anoNascimento);
    }*/



}
