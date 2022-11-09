package org.example;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Diretor();
        Funcionario funcionario2 = new Estagiario();
        Funcionario funcionario3 = new Desenvolvedor();

        funcionario1.setNome("Diretor");
        funcionario1.setSalario(2000);

        funcionario2.setNome("Estagiario");
        funcionario2.setSalario(1000);

        funcionario3.setNome("Desenvolvedor");
        funcionario3.setSalario(14000);

        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(funcionario1);funcionarios.add(funcionario2);funcionarios.add(funcionario3);

        for(Funcionario f : funcionarios){
            System.out.println(f);
            f.aumentoSalario();
            System.out.println(f);
        }

    }
}