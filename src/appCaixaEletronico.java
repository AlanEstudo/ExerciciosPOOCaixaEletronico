/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alan <alanjuniorestudo@gmail.com>
 */
public class appCaixaEletronico {

    public static void main(String[] args) {
        CaixaEletronico caixa1 = new CaixaEletronico();
        caixa1.depositar(5000);
        
        System.out.println("Saldo: " + caixa1.getSaldoCaixa());
        
        boolean sacou =caixa1.sacar(2000);
        if(sacou){
            System.out.println("Saque realizado com sucesso!");
        }else{
            System.out.println("Saque nao realizado");
        }
        
        
    }
    
}
