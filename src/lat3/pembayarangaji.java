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
public class pembayarangaji {
    public int hitunggaji(pegawai peg){
        int uang=peg.gaji();
        if(peg instanceof direktur)
            uang+=((direktur)peg).tunjangan();
        if(peg instanceof staf)
            uang+=((staf)peg).bonusstaf();
        return uang;
    }
    public static void main(String []args){
        pembayarangaji pg=new pembayarangaji();
        staf ali=new staf();
        direktur tony = new direktur();
        System.out.println("Gaji yang dibayarkan untuk staf ="+pg.hitunggaji(ali));
        System.out.println("Gaji yang dibayarkan kepada direktur ="+pg.hitunggaji(tony));
        
    }
}
