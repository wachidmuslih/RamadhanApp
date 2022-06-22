package com.example.ramadhanapp.Database;

import java.util.Date;

public class dbTarawih {
    String tarawihId, hariKe, imam, masjid;
    Date tanggal;
    boolean isTarawih;

    public dbTarawih() {
    }

    public dbTarawih(String tarawihId, String hariKe, String imam, String masjid, Date tanggal, boolean isTarawih) {
        this.tarawihId = tarawihId;
        this.hariKe = hariKe;
        this.imam = imam;
        this.masjid = masjid;
        this.tanggal = tanggal;
        this.isTarawih = isTarawih;
    }

    public String getTarawihId() {
        return tarawihId;
    }

    public void setTarawihId(String tarawihId) {
        this.tarawihId = tarawihId;
    }

    public String getHariKe() {
        return hariKe;
    }

    public void setHariKe(String hariKe) {
        this.hariKe = hariKe;
    }

    public String getImam() {
        return imam;
    }

    public void setImam(String imam) {
        this.imam = imam;
    }

    public String getMasjid() {
        return masjid;
    }

    public void setMasjid(String masjid) {
        this.masjid = masjid;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public boolean isTarawih() {
        return isTarawih;
    }

    public void setTarawih(boolean tarawih) {
        isTarawih = tarawih;
    }
}
