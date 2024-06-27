package br.com.devmedia.introducaojpa;

import java.util.Scanner;

public class Cartaofuncionario {

    private double Cpf;
    private String Nome;
    private int Numemergencia;
    private  String Tiposanguineo;
    private String Alergia;
    private String Problemamedico;

    public Cartaofuncionario() {
        this.setCpf(Cpf);
        this.setNumemergencia(193); // NÚMERO PADRÃO A SER ACIONADO EM CASO DE EMERGÊNCIA MÉDICA
        this.setNome(Nome);
        this.setTiposanguineo(Tiposanguineo);
        this.setAlergia(Alergia);
        this.setProblemamedico(Problemamedico);
    }

    public double getCpf() {
        return Cpf;
    }

    public void setCpf(double Cpf) {
        this.Cpf = Cpf;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getNumemergencia() {
        return Numemergencia;
    }

    public void setNumemergencia(int Numemergencia) {
        this.Numemergencia = Numemergencia;
    }

    public String getTiposanguineo() {
        return Tiposanguineo;
    }

    public void setTiposanguineo(String Tiposanguineo) {
        this.Tiposanguineo = Tiposanguineo;
    }

    public String getAlergia() {
        return Alergia;
    }

    public void setAlergia(String Alergia) {
        this.Alergia = Alergia;
    }

    public String getProblemamedico() {
        return Problemamedico;
    }

    public void setProblemamedico(String Problemamedico) {
        this.Problemamedico = Problemamedico;
    }

    public void cadastrar(){ // MÉTODO QUE PERMITE CADASTRAR UM NOVO FUNCIONÁRIO

        Scanner leitor = new Scanner(System.in);
        System.out.println("----------------------------------");
        System.out.println(" INFORME OS DADOS DO FUNCIONÁRIO");
        System.out.println("-----------------------------------");

        System.out.print("INSIRA O CPF : ");
        this.Cpf = leitor.nextDouble();

        System.out.print("INSIRA O NOME : ");
        this.Nome = leitor.next();

        System.out.print("INSIRA O TIPO SANGUÍNEO : ");
        this.Tiposanguineo = leitor.next();

        System.out.print("INSIRA AS ALERGIAS : ");
        this.Alergia = leitor.next();

        System.out.print("INSIRA OS PROBLEMAS MÉDICOS : ");
        this.Problemamedico = leitor.next();

    }

    public void gerarcartao(){ // MÉTODO QUE PERMITE GERAR O CARTÃO DO FUNCIONÁRIO
        System.out.println("CPF: "+getCpf());
        System.out.println("NOME: "+getNome());
        System.out.println("TIPAGEM: "+getTiposanguineo());
        System.out.println("ALERGIAS: "+getAlergia());
        System.out.println("PROBLEMAS MÉDICOS: "+getProblemamedico());
    }



}
