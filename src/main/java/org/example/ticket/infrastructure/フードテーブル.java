package org.example.ticket.infrastructure;

import org.example.ticket.domain.フードメニュー;
import org.example.ticket.domain.取扱中のフード食券;
import org.example.ticket.domain.取扱食券;
import org.example.ticket.domain.食券明細;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class フードテーブル implements フードメニュー {
    private final List<FoodData> データベース = List.of(
            new FoodData("F1", "豚汁",160),
            new FoodData("F2", "チキン",230),
            new FoodData("F3", "ポテト", 310),
            new FoodData("F4", "のり弁当", 580),
            new FoodData("F5", "麻婆豆腐丼", 660),
            new FoodData("F6", "ナポリタン", 720),
            new FoodData("F7", "サンドウィッチ", 400),
            new FoodData("F8", "焼肉弁当", 1050)
    );

    @Override
    public 取扱中のフード食券 取得する(食券明細 食券明細) {
        List<取扱食券> フードの食券リスト = new ArrayList<>();
        for (var 選択した食券: 食券明細.get食券明細項目の一覧()) {
            for (var foodData: データベース) {
                if (選択した食券.getID().equals(foodData.ID)) {
                    フードの食券リスト.add(new 取扱食券(foodData.ID, foodData.name, foodData.price));
                    break;
                }
            }
        }
        return new 取扱中のフード食券(フードの食券リスト);
    }

    public record FoodData(String ID, String name, int price) {
    }

}
