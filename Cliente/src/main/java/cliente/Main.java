/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cliente;

import javax.print.attribute.standard.JobMessageFromOperator;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){
        Cliente objCliente1 = new Cliente();
        Cliente objCliente2 = new Cliente();
        Cliente objCliente3 = new Cliente();
        
        
        
        objCliente1.nome = "Fabrício";
        objCliente1.cpf = "001.001.001-01";
        objCliente1.rg = "00000001";
        objCliente1.endereco = "Rua Gomercindo Cunha";
        objCliente1.rendaBruta = 1800.00;
        objCliente1.limite = 2500.00;
        
        objCliente2.nome = "Leandro";
        objCliente2.cpf = "002.002.002-02";
        objCliente2.rg = "00000002";
        objCliente2.endereco = "Rua Botafogo";
        objCliente2.rendaBruta = 2500.00;
        objCliente2.limite = 3800.00;
        
        objCliente3.nome = "Anderson";
        objCliente3.cpf = "003.003.003-03";
        objCliente3.rg = "00000003";
        objCliente3.endereco = "Rua Flamengo";
        objCliente3.rendaBruta = 2200.00;
        objCliente3.limite = 2700.00;
        
        JOptionPane.showMessageDialog(null, "Cliente 1"
            + "\nNome: " + objCliente1.nome
            + "\nCPF: " + objCliente1.cpf
            + "\nRG: " + objCliente1.rg
            + "\nEndereço: " + objCliente1.endereco
            + "\nRenda Bruta: R$" + objCliente1.rendaBruta
            + "\nLimite: R$" + objCliente1.limite
            + "\n\nCliente 2"
            + "\nNome: " + objCliente2.nome
            + "\nCPF: " + objCliente2.cpf
            + "\nRG: " + objCliente2.rg
            + "\nEndereço: " + objCliente2.endereco
            + "\nRenda Bruta: R$" + objCliente2.rendaBruta
            + "\nLimite: R$" + objCliente2.limite
            + "\n\nCliente 3"
            + "\nNome: " + objCliente3.nome
            + "\nCPF: " + objCliente3.cpf
            + "\nRG: " + objCliente3.rg
            + "\nEndereço: " + objCliente3.endereco
            + "\nRenda Bruta: R$" + objCliente3.rendaBruta
            + "\nLimite: R$" + objCliente3.limite);
        
    }
}
