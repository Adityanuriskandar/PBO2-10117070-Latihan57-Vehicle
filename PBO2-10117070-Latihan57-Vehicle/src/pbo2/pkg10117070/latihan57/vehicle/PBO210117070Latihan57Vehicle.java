/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117070.latihan57.vehicle;

/**
 *
 * @author Aditya
 * NAMA                 : Aditya Nur Iskandar
 * KELAS                : PBO2
 * NIM                  : 10117070
 * Deskripsi Program    : Program ini berisi program untuk menampilkan kendaraan
 * sepeda dan skateboard
 */
public class PBO210117070Latihan57Vehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bicycle b = new Bicycle();
        b.setMyBrand("Trek Bike");
        b.setMyModel("7.4FX");
        b.setMyGearCount(23);
        System.out.println("Brand : " + b.getMyBrand());
        System.out.println("Model : " + b.getMyModel());
        System.out.println("Jumlah Gear : " + b.getMyGearCount());
        System.out.println();
        
        Skateboard s = new Skateboard();
        s.setMyBrand("Ally Skate");
        s.setMyModel("Rocket");
        s.setMyBoardLength(54.5);
        System.out.println("Brand : " + s.getMyBrand());
        System.out.println("Model : " + s.getMyModel());
        System.out.println("Panjangnya Board : " + s.getMyBoardLength());
    }
    
}
