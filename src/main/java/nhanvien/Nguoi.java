package nhanvien;

public abstract class Nguoi {
    private String tenNV;
    private String email;
    private String SDT;

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    
    
    public Nguoi(String ten, String email, String sdt) {
        this.tenNV = ten;
        this.email = email;
        this.SDT = sdt;
    }

}
    // Xong