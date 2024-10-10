package ChoNgoi;

import TrangThai.LoaiChoNgoi;
import TrangThai.TrangThaiBan;

public class Ban {
    private String maBan;
    private int SucChua;
    private TrangThaiBan TrangThai;

    public Ban(String id, int succhua, TrangThaiBan trangThaiBan) {
        this.maBan = id;
        this.SucChua = succhua;
        this.TrangThai = trangThaiBan;
    }

    public String getMaBan() {
        return maBan;
    }

    public int getSucChua() {
        return SucChua;
    }

    public TrangThaiBan getTrangThaiBan() {
        return TrangThai;
    }

    public void setTrangThaiBan(TrangThaiBan trangThai) {
        this.TrangThai = trangThai;
    }
}
