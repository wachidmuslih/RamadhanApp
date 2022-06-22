package com.example.ramadhanapp.Database;

public class dbFardhu {
    String fardhuId;
    boolean isSubuh, isDzhuhur, isAshar, isMagrib, isIsya;

    public dbFardhu() {
    }

    public dbFardhu(String fardhuId, boolean isSubuh, boolean isDzhuhur, boolean isAshar, boolean isMagrib, boolean isIsya) {
        this.fardhuId = fardhuId;
        this.isSubuh = isSubuh;
        this.isDzhuhur = isDzhuhur;
        this.isAshar = isAshar;
        this.isMagrib = isMagrib;
        this.isIsya = isIsya;
    }

    public String getFardhuId() {
        return fardhuId;
    }

    public void setFardhuId(String fardhuId) {
        this.fardhuId = fardhuId;
    }

    public boolean isSubuh() {
        return isSubuh;
    }

    public void setSubuh(boolean subuh) {
        isSubuh = subuh;
    }

    public boolean isDzhuhur() {
        return isDzhuhur;
    }

    public void setDzhuhur(boolean dzhuhur) {
        isDzhuhur = dzhuhur;
    }

    public boolean isAshar() {
        return isAshar;
    }

    public void setAshar(boolean ashar) {
        isAshar = ashar;
    }

    public boolean isMagrib() {
        return isMagrib;
    }

    public void setMagrib(boolean magrib) {
        isMagrib = magrib;
    }

    public boolean isIsya() {
        return isIsya;
    }

    public void setIsya(boolean isya) {
        isIsya = isya;
    }
}
