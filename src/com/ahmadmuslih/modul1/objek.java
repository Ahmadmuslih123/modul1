package com.ahmadmuslih.modul1;

public class objek {
    public static void main(String[] args) {
        //Deklarasi object tanpa parameter
        Mahasiswa mahasiswaTanpa = new Mahasiswa();

        mahasiswaTanpa.setNama("Muslih");
        mahasiswaTanpa.setNim(19104034);

        //Output
        System.out.println("Mahasiswa 1");
        System.out.println("Nama\t: " + mahasiswaTanpa.getNama());
        System.out.println("Nim\t\t: " + mahasiswaTanpa.getNim());

        Mahasiswa mahasiswa = new Mahasiswa("Sunar", 1910404040);

        System.out.println("Mahasiswa 2");
        System.out.println("Nama\t: " + mahasiswa.getNama());
        System.out.println("Nim\t\t: " + mahasiswa.getNim());

    }
}
