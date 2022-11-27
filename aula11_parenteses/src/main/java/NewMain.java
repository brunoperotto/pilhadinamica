/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import javax.swing.JOptionPane;

/**
 *
 * @author bperotto
 */
public class NewMain {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        String n;
        int i;
        String resultStr;
        String Abre = "([{";
        String Fecha = ")]}";
        int AbreP = 0;
        int FechaP = 0;
        int AbreCh = 0;
        int FechaCh = 0;
        int AbreCol = 0;
        int FechaCol = 0;
        
        n = JOptionPane.showInputDialog("Insira uma operação numérica.");
        System.out.println("A operação informada foi: "+n);
        System.out.println("------------------------");
        
        for(i=0;i<n.length();i++){
            char result = n.charAt(i);
            resultStr = Character.toString(result);
            
            if(Abre.indexOf(result)> -1){
            
                switch (resultStr){
                case "(":
                    pilha.push(Character.toString(result));
                    AbreP++;
                break;
                case "[":
                    pilha.push(Character.toString(result));
                    AbreCh++;
                break;
                case "{":
                    pilha.push(Character.toString(result));
                    AbreCol++;
                break;
                }
                
            }else if(Fecha.indexOf(result)> -1){
                
                switch (resultStr){
                case ")":
                    pilha.push(Character.toString(result));
                    FechaP++;
                break;
                case "]":
                    pilha.push(Character.toString(result));
                    FechaCh++;
                break;
                case "}":
                    pilha.push(Character.toString(result));
                    FechaCol++;
                break;
                }
            }
        }
        
        if(AbreP == FechaP && AbreCh == FechaCh && AbreCol == FechaCol){
            System.out.println("Operação está balanceada");
        }else{
            System.out.println("Operação Desbalanceada");
        }
        
        pilha.imprimir();

    }

}
