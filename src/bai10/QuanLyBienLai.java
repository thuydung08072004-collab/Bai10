/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai10;

/**
 *
 * @author tnfb0
 */




import java.util.*;

public class QuanLyBienLai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<BienLai> dsBienLai = new ArrayList<>();

        System.out.print("Nhap so ho dan: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("\nNhap thong tin ho dan thu " + (i + 1));
            System.out.print("Ho ten chu ho: ");
            String hoTen = sc.nextLine();
            System.out.print("So nha: ");
            String soNha = sc.nextLine();
            System.out.print("Ma cong to: ");
            String maCongTo = sc.nextLine();

            KhachHang kh = new KhachHang(hoTen, soNha, maCongTo);

            System.out.print("Chi so cu: ");
            int chiSoCu = Integer.parseInt(sc.nextLine());
            System.out.print("Chi so moi: ");
            int chiSoMoi = Integer.parseInt(sc.nextLine());

            BienLai bl = new BienLai(kh, chiSoCu, chiSoMoi);
            dsBienLai.add(bl);
        }

        System.out.println("\n=== DANH SACH BIEN LAI TIEN DIEN ===");
        for (BienLai bl : dsBienLai) {
            bl.hienThi();
        }
    }
}
