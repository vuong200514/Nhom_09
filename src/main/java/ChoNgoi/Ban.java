package ChoNgoi;

import TrangThai.LoaiChoNgoi;
import TrangThai.TrangThaiBan;
import ChoNgoi.GheNgoi;

public class Ban {
    private String maBan;
    private int soCho;
    private TrangThaiBan trangThai;
    private GheNgoi gheNgoi;

    public Ban(String id, int soCho, TrangThaiBan trangThaiBan, GheNgoi gheNgoi) {
        this.maBan = id;
        this.soCho = soCho;
        this.trangThai = trangThaiBan;
        this.gheNgoi = gheNgoi;
    }

    public String getMaBan() {
        return maBan;
    }

    public int soCho() {
        return soCho;
    }

    public TrangThaiBan getTrangThaiBan() {
        return trangThai;
    }

    public void setTrangThaiBan(TrangThaiBan trangThai) {
        this.trangThai = trangThai;
    }

    public GheNgoi getGheNgoi() {
        return gheNgoi;
    }

    public void setGheNgoi(GheNgoi gheNgoi) {
        this.gheNgoi = gheNgoi;
    }
    
    public void hienthi(){
        System.out.println("Mã bàn: "+maBan);
        System.out.println("Số chỗ: "+soCho);
        System.out.println("Trạng thái: "+trangThai);
    }
    
}
