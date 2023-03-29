/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoPessoa2;

/**
 *
 * @author Geovani-PC
 */
public class Bolsista extends Aluno{
    
    private float bolsa;
    

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
       
    public void RenovarBolsa(){
        System.out.println("Renovando bolsa de " + this.getNome());
    }
    
    @Override
    public void PagarMensalidade(){
        System.out.println(this.nome + " é bolsista! Pagamento facilitado.");
    }
}
