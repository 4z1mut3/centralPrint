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
public class PrintEpsonJato implements Jato{

    private String status;
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
   
    @Override
    public String impressaoHpJato() {
       this.status = "Impressão realizada por impressora HP jato de tinta";
       return this.status;
    }

    @Override
    public String impressaoPrintEpsonJato() {
       this.status = "Impressão realizada por impressora Epson jato de tinta";
       return this.status;
    }
    
}
