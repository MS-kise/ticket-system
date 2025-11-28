package org.example.ticket.domain;

import org.springframework.stereotype.Component;

@Component
public class 合計金額計算式 {
    public 割引前合計金額 計算する(選択した食券たちの一覧 選択した食券たちの一覧, 販売中の食券の一覧 販売中の食券の一覧) {
        int 合計 = 0;
        for (選択した食券たち 選択した食券たち : 選択した食券たちの一覧.get選択した食券たちの一覧()){
            販売中の食券 対応する販売中の食券 = null;
            for (販売中の食券 販売中の食券 : 販売中の食券の一覧.get販売中の食券の一覧()) {
                if (販売中の食券.getID().equals(選択した食券たち.getID())) {
                    対応する販売中の食券 = 販売中の食券;
                    break;
                }
            }

            int 単価 = 対応する販売中の食券.get単価();
            int 枚数 = 選択した食券たち.get枚数();

            合計 += 単価 * 枚数;
        }
        return new 割引前合計金額(合計);
    }
}
