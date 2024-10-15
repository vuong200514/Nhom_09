package QuanLy;

public class DoanhThu {
    private double doanhThu;

    public DoanhThu() {
        this.doanhThu = 0.0;
    }

    public void capNhatDoanhThu(double soTien) {
        doanhThu += soTien;
    }

    public void hienThiDoanhThu() {
        System.out.println("Doanh thu hiện tại: $" + doanhThu);
    }
    
    public void resetDoanhThu() {
        this.doanhThu = 0.0;
        System.out.println("Doanh thu đã được reset về 0.");
    }
}
