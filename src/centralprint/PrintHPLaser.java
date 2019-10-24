/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centralprint;

/**
 *
 * @author Aluno
 */
public class PrintHPLaser  implements Laser{
    
    private String texto;
    
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String impressaoLaserHP() {
        this.texto ="Impressão sendo realizada por ImpressoraEpson Jato";
        return this.texto;
    }

    @Override
    public String impressaoLaserEpson() {
        this.texto ="Impressora não encontrada";
        return this.texto;
    }
}
