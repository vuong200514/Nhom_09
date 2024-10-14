package cacloaihoadon;

import menu.DanhSachNuoc;
import java.util.ArrayList;
import java.util.List;

public class HoaDon {
    private String orderId;
    private List<DanhSachNuoc> dsHoaDon;

    
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public List<DanhSachNuoc> getDsHoaDon() {
        return dsHoaDon;
    }

    public void setDsHoaDon(List<DanhSachNuoc> dsHoaDon) {
        this.dsHoaDon = dsHoaDon;
    }

    
    
    public HoaDon(String id) {
        this.orderId = id;
        this.dsHoaDon = new ArrayList<>();
    }

    public void themMonHD(DanhSachNuoc nuoc) {
        dsHoaDon.add(nuoc);
    }
    
    public void inHoaDon() {
        System.out.println("Order ID: " + orderId);
        for (DanhSachNuoc nuoc : dsHoaDon) {
            System.out.println("- " + nuoc.getTenNuoc() + ": $" + nuoc.getGiatien());
        }
    }
}
