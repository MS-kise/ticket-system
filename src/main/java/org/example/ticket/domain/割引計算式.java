package org.example.ticket.domain;

import org.springframework.stereotype.Component;

@Component
public class 割引計算式 {
    public セット割後合計金額 計算する(割引前合計金額 割引前合計金額, セット割引率 セット割引率) {
        int セット割後金額 = (int) Math.ceil(割引前合計金額.get割引前合計金額() * (1 - セット割引率.getセット割引率()));
        return new セット割後合計金額(セット割後金額);
    }
}
