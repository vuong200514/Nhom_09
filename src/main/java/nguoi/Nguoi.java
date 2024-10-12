package nguoi;

public abstract class Nguoi {
    private String ten;
    private String email;
    private String SDT;

    public String getTen() {
        return ten;
    }

    public void setTen(String tenNV) {
        this.ten = tenNV;
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
        this.ten = ten;
        this.email = email;
        this.SDT = sdt;
    }

}
