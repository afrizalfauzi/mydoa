package com.example.kumpulandoa;

public class StoredDataDoaSetelahSholat {
    private String judulitem;
    private String doa;
    private String latin;
    private String terjemahan;

    public StoredDataDoaSetelahSholat(String judulitem, String doa, String latin, String terjemahan) {
        this.setJudulitem(judulitem);
        this.setDoa(doa);
        this.setLatin(latin);
        this.setTerjemahan(terjemahan);

    }


    public String getJudulitem() {
        return judulitem;
    }

    public void setJudulitem(String judulitem) {
        this.judulitem = judulitem;
    }

    public String getDoa() {
        return doa;
    }

    public void setDoa(String doa) {
        this.doa = doa;
    }

    public String getLatin() {
        return latin;
    }

    public void setLatin(String latin) {
        this.latin = latin;
    }

    public String getTerjemahan() {
        return terjemahan;
    }

    public void setTerjemahan(String terjemahan) {
        this.terjemahan = terjemahan;
    }
}