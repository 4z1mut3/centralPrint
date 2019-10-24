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
public class DriverEpson implements Driver{

     

    @Override
    public Laser criarLaser() {
        PrintEpsonLaser impressaoEpsonLaser = new PrintEpsonLaser();
        return impressaoEpsonLaser;
    }

    @Override
    public Jato criarJato() {
        PrintEpsonJato impressaoEpsonJato = new PrintEpsonJato();
        return impressaoEpsonJato;
    }
}
