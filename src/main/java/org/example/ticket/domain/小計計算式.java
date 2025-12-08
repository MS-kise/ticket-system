package org.example.ticket.domain;

import org.springframework.stereotype.Component;

@Component
public class 小計計算式 {
    public 小計 計算する(食券明細 食券明細, 取扱食券の一覧 取扱食券の一覧) {
        int 小計 = 0;
        for (食券明細項目 食券明細項目 : 食券明細.get食券明細項目の一覧()){
            取扱食券 対応する取扱食券 = null;
            for (取扱食券 取扱食券 : 取扱食券の一覧.get食券の一覧()) {
                if (取扱食券.getID().equals(食券明細項目.getID())) {
                    対応する取扱食券 = 取扱食券;
                    break;
                }
            }

            int 単価 = 対応する取扱食券.get単価();
            int 枚数 = 食券明細項目.get枚数();

            小計 += 単価 * 枚数;
        }
        return new 小計(小計);
    }
}
