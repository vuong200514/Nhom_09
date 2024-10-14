package menu;

public class DanhSachNuoc {
    private final String menuItemId;
    private final String tenNuoc;
    private final String moTaNuoc;
    private double giatien;

    public DanhSachNuoc(String id, String tennuoc, String mota, double giatien) {
        this.menuItemId = id;
        this.tenNuoc = tennuoc;
        this.moTaNuoc = mota;
        this.giatien = giatien;
    }

    public String getMenuItemId() {
        return menuItemId;
    }

    public String getMoTaNuoc() {
        return moTaNuoc;
    }

    public double getGiatien() {
        return giatien;
    }

    public String getTenNuoc() {
        return tenNuoc;
    }

    public void capNhapGia(double gia) {
        if (gia >= 0) {
            this.giatien = gia;
        } else {
            System.out.println("Giá phải lớn hơn hoặc bằng 0");
        }
    }

    
    //chuyen cac thuoc tinh ve 1 String de ghi vao file
    @Override
    public String toString() {
        return menuItemId+";" +tenNuoc+";"+moTaNuoc+";"+giatien;
    }
    
}
