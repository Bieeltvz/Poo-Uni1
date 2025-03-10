/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista3;
import java.util.Scanner;
/**
 *
 * @author gtvargas
 */
public class Funcionario {

    private String nome;
    private double salario;
    Scanner teclado = new Scanner(System.in);

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

    public double cacularirpf() {
        double pagar = 0;
      if (salario <= 1903.98) {
            System.out.println("Isento de imposto de renda");
        } else if (salario > 1903.98 && salario < 2826.65) {
            pagar = (salario * (7.5 / 100));
        } else if (salario > 2826.65 && salario < 3751.05) {
            pagar = (salario * (15 / 100));
        } else if (salario > 3751.05 && salario < 4664.68) {
            pagar = (salario * (22.5 / 100));
        } else {
            pagar = (salario * (27.5 / 100));
        }
        return pagar;
    }
}
