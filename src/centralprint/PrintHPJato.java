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
public class PrintHPJato implements Jato{
    
    private String texto;
    
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String impressaoHpJato() {
        this.texto ="Impressão sendo realizada por Impressora Jato HP";
        return this.texto;
    }

    @Override
    public String impressaoPrintEpsonJato() {
        this.texto ="Impressora não encontrada";
        return this.texto;
    }
}
