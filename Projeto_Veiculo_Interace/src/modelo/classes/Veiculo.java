/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.classes;

/**
 *
 * @author Giu
 */
public class Veiculo {
    
    //atributos
    private String nome_do_veiculo;
    
    //metodos
    public Veiculo(){}
    public Veiculo(String nome_do_veiculo)
     throws Exception{
        this.nome_do_veiculo = nome_do_veiculo;
    }
    
    //sets e gets

    /**
     * @return the nome_do_veiculo
     */
    public String getNome_do_veiculo() {
        return nome_do_veiculo;
    }

    /**
     * @param nome_do_veiculo the nome_do_veiculo to set
     */
    public void setNome_do_veiculo(String nome_do_veiculo) {
        this.nome_do_veiculo = nome_do_veiculo;
    }
    
    /*******************************************/
    /*******************************************/
    /*******************************************/
    //metodos
    public String entrar_veiculo(){
        return "Entrou no veiculo";
    }
    
    public String sair_veiculo(){
        return "Saiu no veiculo";
    }    
    
    public String ligar_veiculo(){
        return "Ligou o veiculo";
    }
    
    public String desligar_veiculo(){
        return "Desligou o veiculo";
    }
    
    
}
