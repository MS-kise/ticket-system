package org.example.ticket.domain;

public class 小計 {
    private final int 割引前の金額;

    public 小計(int 割引前の金額) {
        this.割引前の金額 = 割引前の金額;
    }

    public int get割引前の金額(){
        return this.割引前の金額;
    }
}
