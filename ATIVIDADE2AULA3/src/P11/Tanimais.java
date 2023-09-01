/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P11;

import java.util.Scanner;

/**
 *
 * @author maria
 */
public class Tanimais {
    public static void main(String[] args)
    {
        int a = 0;
        Scanner ler = new Scanner(System.in);
        animais coisas [] = new animais[10];
        
        for (int i = 0; i < coisas.length; i++)
        {
            coisas[i] = new animais();
        }
        for (int i = 0; i < coisas.length; i++)
        {
            //System.out.println("====dados do animal "+ coisas[i]+"====");
            System.out.println("informe a classificacao do animal: \n");
            coisas[i].classif = ler.next();
            System.out.println("informe a idade do animal: \n");
            coisas[i].idade = ler.nextInt();
            System.out.println("informe o local onde o animal foi encontrado: \n");
            coisas[i].localE = ler.next();
        }
        for (int i = 0; i < coisas.length; i++)
        {
            System.out.println("classificacao: "+coisas[i].classif+ "\n");
            System.out.println("idade: "+coisas[i].idade+ "\n");
            System.out.println("local encontrado: "+coisas[i].localE+ "\n");
        }
        for (int i = 0; i < coisas.length; i++)
        {
            if(coisas[i].idade > 50){
                a++;
                System.out.println(" classificacao: "+ coisas[i].classif + " tem mais de 50 anos, tem "+coisas[i].idade +" anos!" + "\n");
            }else
            {
                //System.out.println(" \n ");
            }
        }
        System.out.println("existem "+a+" animais com mais de 50 anos!");
    }
}
