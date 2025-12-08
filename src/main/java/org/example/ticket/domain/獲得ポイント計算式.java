package org.example.ticket.domain;

import org.springframework.stereotype.Component;

@Component
public class 獲得ポイント計算式 {
    public 獲得ポイント数 計算する(まとめ買い割引後の金額 まとめ買い割引後の金額) {
        int 獲得ポイント数 = 50 * (int) Math.floor(まとめ買い割引後の金額.get金額() / 500);
        return new 獲得ポイント数(獲得ポイント数);
    }
}
