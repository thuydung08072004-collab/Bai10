/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai10;

/**
 *
 * @author tnfb0
 */




public class KhachHang {
    private String hoTen;
    private String soNha;
    private String maCongTo;

    public KhachHang(String hoTen, String soNha, String maCongTo) {
        this.hoTen = hoTen;
        this.soNha = soNha;
        this.maCongTo = maCongTo;
    }

    public void hienThi() {
        System.out.println("Ho ten chu ho: " + hoTen);
        System.out.println("So nha: " + soNha);
        System.out.println("Ma cong to: " + maCongTo);
    }

    public String getHoTen() {
        return hoTen;
    }
}
