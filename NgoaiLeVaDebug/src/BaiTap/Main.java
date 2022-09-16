package BaiTap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TriangleEdgesCheck check = new TriangleEdgesCheck();
        try {
            System.out.println("Nhap canh thu nhat cua tam giac: \n");
            int a = Integer.parseInt(sc.nextLine());
            System.out.println("Nhap canh thu hai cua tam giac: \n");
            int b = Integer.parseInt(sc.nextLine());
            System.out.println("Nhap canh thu ba cua tam giac: \n");
            int c = Integer.parseInt(sc.nextLine());

            try {
                check.checkTriangleEdges(a, b, c);
            } catch (TriangleEdgesException ex) {
                System.out.println(ex.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Gia tri nhap vao khong hop le");
        }
        sc.close();
    }
}
