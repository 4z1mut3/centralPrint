/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centralprint;

import java.util.Scanner;

/**
 *
 * @author Paulo André
 */
public class CentralPrint {
    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        Driver driverEpson = new DriverEpson();
        Driver driverHp = new DriverHP();
        
        System.out.println("Informe qual tipo de imprssão gostaria de realizar:: ");
        
        int opcao = sc.nextInt();
        
        if(opcao == 1){
            driverEpson.criarJato();
        }else{
            if(opcao == 2){
                driverEpson.criarLaser();
                
            }else{
                if(opcao == 3){
                    driverHp.criarJato();
                }else{
                    driverHp.criarLaser();
                }
                
            }
        }
    }
}
