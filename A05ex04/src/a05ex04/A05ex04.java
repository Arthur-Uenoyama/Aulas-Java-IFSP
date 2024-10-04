/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a05ex04;

/**
 *
 * @author ALUNO
 */
public class A05ex04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (args.length < 4){
            System.out.println("Faltam os argumentos da linha de comandos!");
        }
        else{
            float x = Float.parseFloat(args[0]);
            float y = Float.parseFloat(args[1]);
            float a = Float.parseFloat(args[2]);
            float f = Float.parseFloat(args[3]);
            float m = (x + y) / 2 ;
            float freq = (1-(float)f/a)*100;
            String r = "Aprovado";
            if (m < 6 || freq < 75)
                r = "Reprovado";
            System.out.println("Média: "+m+" / Frequência: "+freq+"% / Resultado: "+r);
        }
    }
    
}
