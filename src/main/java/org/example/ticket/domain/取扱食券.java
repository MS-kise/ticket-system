package org.example.ticket.domain;

public class 取扱食券 {
    private final String ID;
    private final String 商品名;
    private final int 単価;

    public 取扱食券(String ID, String 商品名, int 単価) {
        this.ID = ID;
        this.商品名 = 商品名;
        this.単価 = 単価;
    }

    public String getID() {
        return this.ID;
    }

    public int get単価() {
        return this.単価;
    }
}
