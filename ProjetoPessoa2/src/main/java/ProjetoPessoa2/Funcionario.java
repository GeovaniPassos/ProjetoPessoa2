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
public class Funcionario extends Pessoa{
    private float salario;

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
       
    public void receberAum(float aum){
        this.salario += aum;
    }
}
