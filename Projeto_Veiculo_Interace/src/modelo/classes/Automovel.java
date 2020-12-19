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
public class Automovel extends Veiculo implements IVeiculo{
    
    //atributos
    
    //metodos
    public Automovel(){}
    public Automovel(String nome_do_veiculo) throws Exception{
        super(nome_do_veiculo);
    }
    
    public String automovel_virar_volante_esquerda(){
        return "Virando para a esquerda";
    }
    
    public String automovel_virar_volante_direita(){
        return "Virando para a direita";
    }
    
    public String automovel_pisar_pedal_acelerar(){
        return "Acelerando";
    }
    
    public String automovel_pisar_pedal_freiar(){
        return "Freiando";
    }

    @Override
    public String getTipoDoVeiculo() {
        return "Automovel";
    }
    
    
    
}
