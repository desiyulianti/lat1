/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MOKLET-2
 */
public class latihan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // membuat objek mini dari kelas Bus
        // membuat objek mini dari kelas Bus
        Buss busmini = new Buss();
        //memasukkan jumlah nilai penumpang dan penumpang maxsimal ke
        //dalam objek busmini
        busmini.penumpang = 5;
        busmini.maxpenumpang = 15;
        //memanggil method cetak ke dalam class Buss
        busmini.cetak();
        
        //menambah penumang pada bus mini
        busmini.penumpang = busmini.penumpang + 5;
        //memanggil method cetak pada kelas Buss
        busmini.cetak();
        
        //mengurangi penumpang pada buss mini
        busmini.penumpang = busmini.penumpang - 2;
        //memanggil method cetak pada kelas Buss;
        busmini.cetak();
        
        //menambah penumpang pada Buss mini
        busmini.penumpang = busmini.penumpang + 8;
        busmini.cetak();
        
         //pada program diatas menampilkan jumlah penumpang yang maksimum karena pada saat penjumlahan penumpang tidak ada kondisi yang digunakan untuk
     //membatasi jumlah penumpang sehingga mengakibatkan bus mengalami overload atau jumlah penumpang yang terlalu banyak.

        
    
    }
    
   
        
      
       
        
        
        
    }
    

