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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    //Visitante v1 = new Visitante();
    //v1.setNome("Juvenal");
    //v1.setIdade(37);
    //v1.setSexo("M");
    //System.out.println(v1.toString());
     
    Aluno a1 = new Aluno();
    a1.setNome("Cl�udio");
    a1.setMatricula(1111);
    a1.setCurso("inform�tica");
    a1.setIdade(16);
    a1.setSexo("M");
    a1.PagarMensalidade();
    
    Bolsista b1 = new Bolsista();
    b1.setNome("Jubileu");
    b1.setMatricula(2222);
    b1.setBolsa(12.0f);
    b1.setSexo("Ml");
    b1.setCurso("Inform�tica");
    b1.setIdade(17);
    b1.PagarMensalidade();
    
    Tecnico c1 = new Tecnico();
    c1.setNome("Marc�o");
    c1.setRegistroProfissional(1111);
    c1.praticar();
    
    }
    
    
}
