package org.example.ticket.domain;

import org.springframework.stereotype.Component;

@Component
public class セットルール {
    public セット割引率 判断する(割引前の合計金額 割引前の合計金額) {
        float 割引率の値 = 0.0f;
        if(割引前の合計金額.get割引前の合計金額() < 400){
            割引率の値 = 0.0f;
        }else if (400 <= 割引前の合計金額.get割引前の合計金額() && 割引前の合計金額.get割引前の合計金額() < 1500){
            割引率の値 = 0.05f;
        }else{
            割引率の値 = 0.1f;
        }
        return new セット割引率(割引率の値);
    }
}
