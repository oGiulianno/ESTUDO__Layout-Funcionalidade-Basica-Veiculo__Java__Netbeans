/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.classes;
import modelo.interfaces.IVeiculo;
/**
 *
 * @author Giu
 */
public class Barco extends Veiculo implements IVeiculo{
    
    //atributos
    
    //metodos
    public Barco(){}
    public Barco(String nome_do_veiculo) throws Exception{
        super(nome_do_veiculo);
    }
    
    public String barco_virando_timao_esquerda(){
        return "Virando para a esquerda";
    }
    
    public String barco_virando_timao_direita(){
        return "Virando para a direita";
    }
    
    public String barco_empurrar_alavanca_acelerar(){
        return "Acelerando";
    }
    
    public String barco_puxar_alavanca_freiar(){
        return "Freiando";
    }
    
    
    @Override
    public String getTipoDoVeiculo() {
        return "Barco";
    }
    
}
