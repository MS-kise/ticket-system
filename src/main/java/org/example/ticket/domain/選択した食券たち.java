package org.example.ticket.domain;

public class 選択した食券たち {

    private final String ID;
    private final int 枚数;

    public 選択した食券たち(String ID, int 枚数){
        this.ID = ID;
        this.枚数 = 枚数;
    }

    public String getID() {
        return ID;
    }

    public int get枚数(){
        return this.枚数;
    }
}
