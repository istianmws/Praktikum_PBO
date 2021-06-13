
import static com.sun.media.jfxmediaimpl.MediaUtils.error;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Main {
    public static void main(String args[]){
    Lks pbo = new Lks(450,400000,true);
    Scanner input = new Scanner(System.in);
    int kode; 
    pbo.halaman(15,3);
    pbo.sampul();
    pbo.baru();
    System.out.println("input kode buku : ");
    try{
        pbo.setKode_lks(kode = input.nextInt());
    }
    catch (Exception e){
        System.out.println("Kode Buku Harus Integer");
    }
    finally{
        pbo.tampil();
        System.out.println("Kode : " + pbo.getKode_lks());
    }
    
    System.out.println("==SELESAI==");
    }
}
