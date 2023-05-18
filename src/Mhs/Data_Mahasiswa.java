/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mhs;

import java.util.Scanner; // import scanner untuk inputannya

public class Data_Mahasiswa {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); //object scanner baru
        
        String nama, nim, jenisKelamin, fakultas, jurusan, nope, def=""; //variabel
        
        System.out.println("            Data Mahasiswa         ");
        System.out.println("|   Silahkan isi Data Diri Anda   |");
        System.out.println("===================================");
        
        System.out.print(def + "Nama \t\t: " );
        nama = input.nextLine(); //memberikan nilai variabel dengan menyimpan inputan dari user
        System.out.print(def + "NIM \t\t: " );
        nim = input.nextLine();
        System.out.print(def + "Jenis Kelamin \t: " );
        jenisKelamin = input.nextLine();
        System.out.print(def + "Fakultas \t\t: " );
        fakultas = input.nextLine();
        System.out.print(def + "Jurusan \t: " );
        jurusan = input.nextLine();
        System.out.print(def + "Nomor Handphone \t: " );
        nope = input.nextLine();
        
        System.out.println("");
        
        // Tampilkan datanya
        System.out.println("+-------------------------------------+");
        System.out.println("|           Biodata Mahasiswa         |");
        System.out.println("| Nama\t\t:" + nama);
        System.out.println("| NIM\t\t:" + nim);
        System.out.println("| Jenis Kelamin\t:" + jenisKelamin);
        System.out.println("| Fakultas\t:" + fakultas);
        System.out.println("| Jurusan\t:" + jurusan);
        System.out.println("| Nomor HP\t:" + nope);
        System.out.println("+-------------------------------------+");
    }
    
}
