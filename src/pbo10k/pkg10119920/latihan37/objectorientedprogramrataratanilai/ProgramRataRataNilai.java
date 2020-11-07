/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119920.latihan37.objectorientedprogramrataratanilai;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Umar Said Adi Pranoto
 * KELAS    : IF10K
 * NIM      : 10119920
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * jenis-jenis tipe data bilangan bulat
 * 
 */

class Mahasiswa {
    Scanner input = new Scanner(System.in);
    
    public int banyakMahasiswa;
    public float rataRata;
    
    public float hitungRataRata(){
        int nilai, perulangan;
        float jumlah;
        jumlah = 0;
        perulangan = 1;
        
        while (perulangan <= banyakMahasiswa){
            System.out.print("Nilai Mahasiswa ke-"+ perulangan +" : ");
            nilai = input.nextInt();
            jumlah += nilai;
            perulangan++;
        }
        rataRata = jumlah / banyakMahasiswa;
        return 0;
    }
}

public class ProgramRataRataNilai {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Mahasiswa mhs = new Mahasiswa();
        
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        mhs.banyakMahasiswa = input.nextInt();
        mhs.hitungRataRata();
        System.out.println();
        System.out.println("Maka, Rata-rata Nilainya adalah "+ mhs.rataRata);
        System.out.println("Developed by : Umar Said Adi Pranoto");
    }
    
}
