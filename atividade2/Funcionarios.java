/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade2;

/**
 *
 * @author Usuário
 */
public class Funcionarios {

    String nome;
    double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double cacularIrpf() {
        double pagar = 0;
        if (salario <= 1903.98) {
            return 0;
        } else if (salario <= 2826.65) {
            pagar = (salario * 0.075) - 142.80;
        } else if (salario <= 3751.05) {
            pagar = (salario * 0.15) - 354.80;
        } else if (salario <= 4664.68) {
            pagar = (salario * 0.225) - 636.13;
        } else {
            pagar = (salario * 0.275) - 869.36;
        }

        return pagar;
    }
}
