package BaiTap;

public class TriangleEdgesCheck {
    public void checkTriangleEdges(double a, double b, double c) throws TriangleEdgesException {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new TriangleEdgesException("Khong phai tam giac");
        } else {
            System.out.println("La tam giac");
        }
    }
}
