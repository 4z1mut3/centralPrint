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
public class DriverHP extends Driver{

    private PrintHPJato hpJato;
    private PrintHPLaser hpLaser;
    
    public PrintHPJato getHpJato() {
        return hpJato;
    }

    public void setHpJato(PrintHPJato hpJato) {
        this.hpJato = hpJato;
    }

    public PrintHPLaser getHpLaser() {
        return hpLaser;
    }

    public void setHpLaser(PrintHPLaser hpLaser) {
        this.hpLaser = hpLaser;
    }
    
}
