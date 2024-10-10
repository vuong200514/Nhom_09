package ChoNgoi;

import TrangThai.LoaiChoNgoi;

public class ChoNgoi {
    private int soCho;
    private LoaiChoNgoi loaiChoNgoi;

    public ChoNgoi(int chongoi, LoaiChoNgoi type) {
        this.soCho = chongoi;
        this.loaiChoNgoi = type;
    }

    public int getSoCho() {
        return soCho;
    }

    public LoaiChoNgoi getLoaiChoNgoi() {
        return loaiChoNgoi;
    }

    public void setLoaiCho(LoaiChoNgoi type) {
        this.loaiChoNgoi = type;
    }
}
