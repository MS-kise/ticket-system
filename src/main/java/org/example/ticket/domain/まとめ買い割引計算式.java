package org.example.ticket.domain;

import org.springframework.stereotype.Component;

@Component
public class まとめ買い割引計算式 {
    public まとめ買い割引後の金額 計算する(小計 小計, まとめ買い割引率 まとめ買い割引率) {
        int まとめ買い割引後の金額の値 = (int) Math.ceil(小計.get割引前の金額() * (1 - まとめ買い割引率.get割引率()));
        return new まとめ買い割引後の金額(まとめ買い割引後の金額の値);
    }
}
