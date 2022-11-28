package com.example.restapi_2018076;
import java.io.Serializable;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;

public class Results implements Serializable {
    private Data data;

    private Boolean success;

    private Object message;

    public Data getData() {
        return this.data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Boolean getSuccess() {
        return this.success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Object getMessage() {
        return this.message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    public static class Data implements Serializable {
        private String datetime;

        private String potensi;

        private String dirasakan;

        private String lintang;

        private String jam;

        private String coordinates;

        private String magnitude;

        private String tanggal;

        private String kedalaman;

        private String wilayah;

        private String shakemap;

        private String bujur;

        public String getDatetime() {
            return this.datetime;
        }

        public void setDatetime(String datetime) {
            this.datetime = datetime;
        }

        public String getPotensi() {
            return this.potensi;
        }

        public void setPotensi(String potensi) {
            this.potensi = potensi;
        }

        public String getDirasakan() {
            return this.dirasakan;
        }

        public void setDirasakan(String dirasakan) {
            this.dirasakan = dirasakan;
        }

        public String getLintang() {
            return this.lintang;
        }

        public void setLintang(String lintang) {
            this.lintang = lintang;
        }

        public String getJam() {
            return this.jam;
        }

        public void setJam(String jam) {
            this.jam = jam;
        }

        public String getCoordinates() {
            return this.coordinates;
        }

        public void setCoordinates(String coordinates) {
            this.coordinates = coordinates;
        }

        public String getMagnitude() {
            return this.magnitude;
        }

        public void setMagnitude(String magnitude) {
            this.magnitude = magnitude;
        }

        public String getTanggal() {
            return this.tanggal;
        }

        public void setTanggal(String tanggal) {
            this.tanggal = tanggal;
        }

        public String getKedalaman() {
            return this.kedalaman;
        }

        public void setKedalaman(String kedalaman) {
            this.kedalaman = kedalaman;
        }

        public String getWilayah() {
            return this.wilayah;
        }

        public void setWilayah(String wilayah) {
            this.wilayah = wilayah;
        }

        public String getShakemap() {
            return this.shakemap;
        }

        public void setShakemap(String shakemap) {
            this.shakemap = shakemap;
        }

        public String getBujur() {
            return this.bujur;
        }

        public void setBujur(String bujur) {
            this.bujur = bujur;
        }
    }
}

