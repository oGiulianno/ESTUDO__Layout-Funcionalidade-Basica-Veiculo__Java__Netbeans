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
public class Aviao extends Veiculo implements IVeiculo{
    
    //atributos
    
    //metodos
    public Aviao(){}
    public Aviao(String nome_do_veiculo) throws Exception{
        super(nome_do_veiculo);
    }
    
    public String aviao_puxar_manche_esquerda(){
        return "Inclinando para a esquerda";
    }
    
    public String aviao_puxar_manche_direita(){
        return "Inclinando para a direita";
    }
    
    public String aviao_empurrar_manche_frente(){
        return "Inclinando para a baixo";
    }
    
    public String aviao_puxar_manche_tras(){
        return "Inclinando para a cima";
    }
    
    public String aviao_empurrar_alavanca_acelerar(){
        return "Acelerando";
    }
    
    public String aviao_puxar_alavanca_freiar(){
        return "Freiando";
    }

    @Override
    public String getTipoDoVeiculo() {
        return "Aviao";
    }
    
    
    
}
