package QuanNuoc;

import ChoNgoi.Ban;
import java.util.ArrayList;
import java.util.List;

public class ChiNhanh {
    private String tenChiNhanh;
    private String DiaChi;
    private List<Ban> danhSachBan;

    public ChiNhanh(String ten, String diadiem) {
        this.tenChiNhanh = ten;
        this.DiaChi = diadiem;
        this.danhSachBan = new ArrayList<>();
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

    public List<Ban> getDanhSachBan() {
        return danhSachBan;
    }

    public void setDanhSachBan(List<Ban> dsban) {
        this.danhSachBan = dsban;
    }

    // them ban vao chi nhanh
    public void themBan(Ban ban) {
        danhSachBan.add(ban);
        System.out.println("Đã thêm bàn: " + ban.getMaBan());
    }
    // xoa ban di
    public boolean xoaBan(String maBan) {
        for (Ban ban : danhSachBan) {
            if (ban.getMaBan().equals(maBan)) {
                danhSachBan.remove(ban);
                System.out.println("Đã xóa bàn: " + maBan);
                return true;
            }
        }
        System.out.println("Không tìm thấy bàn với mã: " + maBan);
        return false;
    }
    // hien thi thong tin chi nhanh
    public void ThongTinChiNhanh() {
        System.out.println("Chi nhánh: " + tenChiNhanh + " tại " + DiaChi);
        for (Ban ban : danhSachBan) {
            System.out.println("ID Bàn: " + ban.getMaBan());
        }
    }

    public String getTenCN() {
        return tenChiNhanh;
    }
    
    public void dsBan(){
        for (Ban ban : danhSachBan){
            ban.hienthi();
        }
    }
}
