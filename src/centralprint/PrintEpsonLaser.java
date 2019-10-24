/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centralprint;

/**
 *
 * @author Paulo André
 */
public class PrintEpsonLaser  implements Laser{
    
    private String texto;
    
    

    @Override
    public String impressaoLaserHP() {        
        this.texto ="Impressora não encontrada";
        return this.texto;
    }

    @Override
    public String impressaoLaserEpson() {
        this.texto = " Impressão sendo realizada por Impressora Laser Epson";
        return this.texto;
    }
}
