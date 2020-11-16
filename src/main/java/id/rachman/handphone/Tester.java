/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.rachman.handphone;

/**
 *
 * @author
 * NAMA  : Rachman Aldiansyah
 * KELAS : IF-1
 * NIM   : 10119038
 * Deskripsi Program : program ini berisi untuk menampilkan value hasil masukkan
 * 
 */

public class Tester {
    public static String man,os,model;
    public static int harga;
    
    public static void main(String[] args) {
        Android android = new Android(man,os,model,harga);
        android.manufacture = "Samsung";
        android.operatingSystem = "Android";
        android.model = "Grand";
        android.harga = 3000000;
        android.setKeyStore("234ibfd3840fo");
        android.displayProduct();
        System.out.println("Android Key Store : " + android.getKeyStore());
        
        System.out.println();
        
        BlackBerry blackB = new BlackBerry(man,os,model,harga);
        blackB.manufacture = "BlackB";
        blackB.operatingSystem = "RIM";
        blackB.model = "Curve";
        blackB.harga = 2000000;
        blackB.setPinBB("BHS249");
        blackB.displayProduct();
        System.out.println("PIN : " + blackB.getPinBB());
        
        System.out.println();
        
        WindowsPhone windowsP = new WindowsPhone(man,os,model,harga);
        windowsP.manufacture = "Nokia";
        windowsP.operatingSystem = "Win8";
        windowsP.model = "Lumia";
        windowsP.harga = 1000000;
        windowsP.setWpKeyStore("UUUQIJWORJ");
        windowsP.displayProduct();
        System.out.println("Wp Key Store : " + windowsP.getWpKeyStore());
    }
}