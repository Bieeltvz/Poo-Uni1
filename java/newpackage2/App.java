/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage2;

/**
 *
 * @author gtvargas
 */
import java.util.Scanner;
public class App {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Pessoa2[] pessoa = new Pessoa2[3];
        Pessoa2 p = new Pessoa2();
        for(int i = 0; i < 3; i++){
        System.out.println("Qual a altura da pessoa?");
        p.altura = teclado.nextDouble();
        System.out.println("Qual o peso da pessoa?");
        p.peso = teclado.nextDouble();
        pessoa[i] = p;
        }
                for (int i = 0; i < pessoa.length; i++) {
            double imc = pessoa[i].calcularimc(); 
            System.out.println("IMC da pessoa " + (i + 1) + ": " + imc);
        }
    }
}

