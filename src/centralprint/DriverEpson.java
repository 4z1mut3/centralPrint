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
public class DriverEpson extends Driver{

    private PrintEpsonLaser epsonLaser;
    private PrintEpsonJato epsonJato;

    public PrintEpsonLaser getEpsonLaser() {
        return epsonLaser;
    }
    public void setEpsonLaser(PrintEpsonLaser epsonLaser) {
        this.epsonLaser = epsonLaser;
    }                
    public PrintEpsonJato getEpsonJato() {
        return epsonJato;
    }
    public void setEpsonJato(PrintEpsonJato epsonJato) {
        this.epsonJato = epsonJato;
    }       
}
