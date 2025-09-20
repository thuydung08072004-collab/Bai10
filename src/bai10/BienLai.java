/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai10;

/**
 *
 * @author tnfb0
 */



public class BienLai {
    private KhachHang khachHang;
    private int chiSoCu;
    private int chiSoMoi;

    public BienLai(KhachHang khachHang, int chiSoCu, int chiSoMoi) {
        this.khachHang = khachHang;
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
    }

    public int tinhTien() {
        return (chiSoMoi - chiSoCu) * 750;
    }

    public void hienThi() {
        System.out.println("=== Bien lai tien dien ===");
        khachHang.hienThi();
        System.out.println("Chi so cu: " + chiSoCu);
        System.out.println("Chi so moi: " + chiSoMoi);
        System.out.println("So tien phai tra: " + tinhTien() + " VND");
        System.out.println("-----------------------------");
    }
}
