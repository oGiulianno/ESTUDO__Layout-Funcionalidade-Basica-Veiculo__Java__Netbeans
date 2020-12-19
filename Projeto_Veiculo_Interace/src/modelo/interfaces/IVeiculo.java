/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.interfaces;

/**
 *
 * @author Giu
 */
public interface IVeiculo {
    
    public String entrar_veiculo();
    public String sair_veiculo();
    public String ligar_veiculo();
    public String desligar_veiculo();
    
    public String getTipoDoVeiculo();
    
}
