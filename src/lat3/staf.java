/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lat3;

/**
 *
 * @author Pesek
 */
public class staf extends pegawai {
    private static final int gajistaf=50000;
    private static final int bonusstaf=10000;
    
    public int gaji(){
        return gajistaf;
    }
    
    public int bonusstaf(){
        return bonusstaf;
    }
}