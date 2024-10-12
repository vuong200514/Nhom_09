package QuanNuoc;

import ChoNgoi.Ban;
import java.util.ArrayList;
import java.util.List;

public class ChiNhanh {
    private String tenChiNhanh;
    private String DiaChi;
    private List<Ban> soBan;

    public ChiNhanh(String ten, String diadiem) {
        this.tenChiNhanh = ten;
        this.DiaChi = diadiem;
        this.soBan = new ArrayList<>();
    }

    public String getTenChiNhanh() {
        return tenChiNhanh;
    }

    public void setTenChiNhanh(String tenChiNhanh) {
        this.tenChiNhanh = tenChiNhanh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public List<Ban> getSoBan() {
        return soBan;
    }

    public void setSoBan(List<Ban> soBan) {
        this.soBan = soBan;
    }

    public void themBan(Ban ban) {
        soBan.add(ban);
        System.out.println("Đã thêm bàn: " + ban.getMaBan());
    }

    public boolean xoaBan(String maBan) {
        for (Ban ban : soBan) {
            if (ban.getMaBan().equals(maBan)) {
                soBan.remove(ban);
                System.out.println("Đã xóa bàn: " + maBan);
                return true;
            }
        }
        System.out.println("Không tìm thấy bàn với mã: " + maBan);
        return false;
    }

    public void ThongTinChiNhanh() {
        System.out.println("Chi nhánh: " + tenChiNhanh + " tại " + DiaChi);
        for (Ban ban : soBan) {
            System.out.println("ID Bàn: " + ban.getMaBan());
        }
    }

    public String getTenCN() {
        return tenChiNhanh;
    }
}
