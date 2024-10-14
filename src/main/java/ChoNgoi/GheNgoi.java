package ChoNgoi;

import ChoNgoi.Ban;
import TrangThai.LoaiChoNgoi;

public class GheNgoi {
    private int maGhe;
    private LoaiChoNgoi loaiChoNgoi;

    public GheNgoi(int chongoi, LoaiChoNgoi type) {
        this.maGhe = chongoi;
        this.loaiChoNgoi = type;
    }

    public int getSoCho() {
        return maGhe;
    }

    public LoaiChoNgoi getLoaiChoNgoi() {
        return loaiChoNgoi;
    }

    public void setLoaiCho(LoaiChoNgoi type) {
        this.loaiChoNgoi = type;
    }
}
