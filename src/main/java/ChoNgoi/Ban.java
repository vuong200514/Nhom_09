package ChoNgoi;

import TrangThai.LoaiChoNgoi;
import TrangThai.TrangThaiBan;

public class Ban {
    private String maBan;
    private int sucChua;
    private TrangThaiBan trangThai;

    public Ban(String id, int succhua, TrangThaiBan trangThaiBan) {
        this.maBan = id;
        this.sucChua = succhua;
        this.trangThai = trangThaiBan;
    }

    public String getMaBan() {
        return maBan;
    }

    public int getSucChua() {
        return sucChua;
    }

    public TrangThaiBan getTrangThaiBan() {
        return trangThai;
    }

    public void setTrangThaiBan(TrangThaiBan trangThai) {
        this.trangThai = trangThai;
    }

    
       // ham dat ban kiem tra suc chua va trang thai cua ban
    public boolean datBan(int soCho, LoaiChoNgoi loaiChoNgoi) {
        if (this.trangThai == TrangThaiBan.ConBan && this.sucChua >= soCho) {
            this.trangThai = TrangThaiBan.DangSuDung;
            System.out.println("Đặt bàn thành công. Mã bàn: " + maBan + ", Số chỗ: " + sucChua + ", Loại chỗ: " + loaiChoNgoi);
            return true;
        } else {
            System.out.println("Đã hết bàn hoặc bàn không đủ chỗ. Vui lòng thử lại sau.");
            return false;
        }
    }
}
