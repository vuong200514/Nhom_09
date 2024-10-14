package QuanNuoc;

import java.util.ArrayList;
import java.util.List;

public class BlackPink_Coffe {
    private String tenchinhanh;
    private List<ChiNhanh> dsChiNhanh;

    public String getTenchinhanh() {
        return tenchinhanh;
    }

    public void setTenchinhanh(String tenchinhanh) {
        this.tenchinhanh = tenchinhanh;
    }

    public List<ChiNhanh> getDsChiNhanh() {
        return dsChiNhanh;
    }

    public void setDsChiNhanh(List<ChiNhanh> dsChiNhanh) {
        this.dsChiNhanh = dsChiNhanh;
    }

    
    
    public BlackPink_Coffe(String ten) {
        this.tenchinhanh = ten;
        this.dsChiNhanh = new ArrayList<>();
    }

    public void themChiNhanh(ChiNhanh chinhanh) {
        dsChiNhanh.add(chinhanh);
    }

    // in thong tin cua cac chi nhanh
    public void ThongTinChiNhanh() {
        System.out.println("Coffe: " + tenchinhanh);
        for (ChiNhanh chinhanh : dsChiNhanh) {
            System.out.println("Quan: " + chinhanh.getTenCN());
        }
    }
}
