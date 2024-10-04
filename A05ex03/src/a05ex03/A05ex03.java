/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a05ex03;

import java.util.Scanner;

/**
 *
 * @author ALUNO
 */
public class A05ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        float n1 = s.nextFloat();
        System.out.println("Digite a segunda nota: ");
        float n2 = s.nextFloat();
        System.out.println("Digite a frequência: ");
        float f = s.nextFloat();
        
        float m = (n1 + n2) / 2 ;
        String r = "Aprovado";
        if (m < 6 || f < 75)
            r = "Reprovado";
        System.out.println("Média: "+m+" / Frequência: "+f+"  / Resultado: "+r);
    }
    
}
