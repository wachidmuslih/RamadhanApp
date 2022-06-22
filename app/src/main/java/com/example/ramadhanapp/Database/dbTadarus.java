package com.example.ramadhanapp.Database;

import java.util.Date;

public class dbTadarus {
    String tadarusId, surat, ayat;
    Date waktu;

    public dbTadarus() {
    }

    public dbTadarus(String tadarusId, String surat, String ayat, Date waktu) {
        this.tadarusId = tadarusId;
        this.surat = surat;
        this.ayat = ayat;
        this.waktu = waktu;
    }

    public String getTadarusId() {
        return tadarusId;
    }

    public void setTadarusId(String tadarusId) {
        this.tadarusId = tadarusId;
    }

    public String getSurat() {
        return surat;
    }

    public void setSurat(String surat) {
        this.surat = surat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }

    public Date getWaktu() {
        return waktu;
    }

    public void setWaktu(Date waktu) {
        this.waktu = waktu;
    }
}
