/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10118045latihan24perbandinganduabuahnilai;

import java.util.Scanner;

/**
 *
* @author 
 * Nama     :   Muhammad Ilham Apriyadi
 * Kelas    :   IF 2
 * NIM      :   10118045
 * Deskripsi Program : Program Perbandingan Dua Buah Nilai
 */
public class PBO10118045Latihan24PerbandinganDuaBuahNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int satu,dua;
        String ulangi = "Ya";
        System.out.println("========Program Perbandingan Nilai========");
        while(ulangi.equals("Ya")){
            System.out.print("Masukkan nilai pertama : ");
            Scanner a = new Scanner(System.in);
            satu = a.nextInt();
            System.out.print("Masukkan nilai kedua : ");
            Scanner b = new Scanner(System.in);
            dua = b.nextInt();
            if(satu > dua)
                System.out.println("Hasil : "+satu+" Lebih besar dari " +dua);
            else if(satu < dua)
                System.out.println("Hasil : "+satu+" Lebih kecil dari " +dua);
            else
                System.out.println("Hasil : "+satu+" Sama dengan " +dua);
            System.out.println("");
            System.out.print("Ulangi Aktifitas? (Ya/Tidak) : ");
            Scanner c = new Scanner(System.in);
            ulangi = c.next();
            System.out.println("");
        
        }
            
            
    }
    
}
