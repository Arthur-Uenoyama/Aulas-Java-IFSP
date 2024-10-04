/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a05ex01;

import java.util.Scanner;

/**
 *
 * @author ALUNO
 */
public class A05ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        float x = s.nextFloat();
        System.out.println("Digite a segunda nota: ");
        float y = s.nextFloat();
        float m = (x + y) / 2 ;
        String r = "Aprovado";
        if (m < 6)
            r = "Reprovado";
        System.out.println("Média: "+m+"  / Resultado: "+r);
    }
    
}
