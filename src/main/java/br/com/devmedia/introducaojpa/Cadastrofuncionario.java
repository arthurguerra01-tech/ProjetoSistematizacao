package br.com.devmedia.introducaojpa;

import java.util.ArrayList;
import java.util.Scanner;

public class Cadastrofuncionario {

    public static int mostrarinterface() {
        Scanner leitor = new Scanner(System.in);


        System.out.println("-------------------------");
        System.out.println("    MGS FUNCIONÁRIOS ");
        System.out.println("--------------------------");
        System.out.println("[1] ADICIONAR CARTÃO ");
        System.out.println("[2] EXCLUIR CARTÃO ");
        System.out.println("[3] PESQUISAR FUNCIONÁRIO (CPF)");
        System.out.println("[4] FECHAR PROGRAMA ");
        System.out.println("--------------------------");
        System.out.println("SELECIONE A OPCAO DESEJADA: ");

        return leitor.nextInt();
    }

    public static void main(String[] args) {

        ArrayList<Cartaofuncionario> listacartao;
        listacartao = new ArrayList<Cartaofuncionario>();
        int opcao = 4;

        do {
            opcao = mostrarinterface();

            Scanner leitor = new Scanner(System.in);

            switch (opcao) {
                case 1:

                    Cartaofuncionario c = new Cartaofuncionario();
                    c.cadastrar();
                    listacartao.add(c);

                    break;


                case 2:
                    System.out.println("INFORME O CPF DO FUNCIONÁRIO: ");

                    Double cpf = leitor.nextDouble(); // Variável que irá receber o valor do cpf a ser procurado.

                    for (int i = 0; i <= listacartao.size() - 1; i++) {

                        Cartaofuncionario cf = listacartao.get(i);

                        if (cpf.equals(cf.getCpf())) { // Se o cpf digitado for encontrado na lista, ou seja o cpf digitado for igual ao cpf na lista.
                            System.out.println("FUNCIONÁRIO ENCONTRADO");
                            listacartao.remove(cf);
                        }

                    }

                    break;

                case 3:
                    System.out.println("INFORME O CPF DO FUNCIONÁRIO: ");

                    Double cpf1 = leitor.nextDouble(); // Variável que irá receber o valor do cpf a ser procurado.

                    for (int i = 0; i <= listacartao.size() - 1; i++) {

                        Cartaofuncionario cf = listacartao.get(i);

                        if (cpf1.equals(cf.getCpf())) { // Se o cpf digitado for encontrado na lista, ou seja o cpf digitado for igual ao cpf na lista.
                            System.out.println("FUNCIONÁRIO ENCONTRADO");
                            cf.gerarcartao();
                        }

                    }

                    break;

                case 4:

                    System.out.println("PROGRAMA FINALIZADO");

                    break;

            }
        
        }while(opcao!=4);

    }
}