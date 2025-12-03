package org.example.ticket.domain;

import org.springframework.stereotype.Component;

@Component
public class ポイント計算式 {
    public 獲得ポイント数 計算する(セット割引後の合計金額 セット割引後の合計金額) {
        int 獲得ポイント数 = 50 * (int) Math.floor(セット割引後の合計金額.getセット割引後の合計金額() / 500);
        return new 獲得ポイント数(獲得ポイント数);
    }
}
