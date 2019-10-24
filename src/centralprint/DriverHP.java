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
public class DriverHP implements Driver{

    @Override
    public Laser criarLaser() {
       PrintHPLaser hpLaser = new PrintHPLaser();
       return hpLaser;
    }

    @Override
    public Jato criarJato() {
        PrintHPJato hp_jato = new PrintHPJato();
        return hp_jato;
    }    
}
