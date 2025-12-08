package org.example.ticket.domain;

import org.springframework.stereotype.Component;

@Component
public class まとめ買い割引ルール {
    public まとめ買い割引率 判断する(小計 小計) {
        float 割引率の値 = 0.0f;
        if(小計.get割引前の金額() < 400){
            割引率の値 = 0.0f;
        }else if (400 <= 小計.get割引前の金額() && 小計.get割引前の金額() < 1500){
            割引率の値 = 0.05f;
        }else{
            割引率の値 = 0.1f;
        }
        return new まとめ買い割引率(割引率の値);
    }
}
