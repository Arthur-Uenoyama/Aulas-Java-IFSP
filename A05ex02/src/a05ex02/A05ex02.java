/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a05ex02;

/**
 *
 * @author ALUNO
 */
public class A05ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (args.length < 2){
            System.out.println("Faltam os argumentos da linha de comandos!");
        }
        else{
            float x = Float.parseFloat(args[0]);
            float y = Float.parseFloat(args[1]);
            float m = (x + y) / 2 ;
            String r = "Aprovado";
            if (m < 6)
                r = "Reprovado";
            System.out.println("Média: "+m+"  / Resultado: "+r);
        }
    }
    
}
