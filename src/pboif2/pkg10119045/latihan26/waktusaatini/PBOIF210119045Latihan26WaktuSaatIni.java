/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119045.latihan26.waktusaatini;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author Legion
 * NAMA                 : Fahma Maulana
 * KELAS                : PBOIF2
 * NIM                  : 10119045
 * Deskripsi Program    : Waktu Saat Ini
 */
public class PBOIF210119045Latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date tanggal = new Date();
        
        SimpleDateFormat format = new SimpleDateFormat("E dd MMMM yyyy HH:mm:ss");
        System.out.println("Hari ini adalah hari: " + format.format(tanggal));
        System.out.println("-----------------------------");
        System.out.println("Developed bye : Fahma Maulana");
    }
    
}

