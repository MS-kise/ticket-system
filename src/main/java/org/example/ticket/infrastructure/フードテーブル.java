package org.example.ticket.infrastructure;

import org.example.ticket.domain.フードメニュー;
import org.example.ticket.domain.販売中の食券;
import org.example.ticket.domain.販売中の食券の一覧;
import org.example.ticket.domain.選択した食券たちの一覧;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public 販売中の食券の一覧 取得する(選択した食券たちの一覧 選択した食券たちの一覧) {
        List<販売中の食券> 販売中の食券リスト = new ArrayList<>();
        for (var 選択した食券: 選択した食券たちの一覧.get選択した食券たちの一覧()) {
            for (var foodData: データベース) {
                if (選択した食券.getID().equals(foodData.ID)) {
                    販売中の食券リスト.add(new 販売中の食券(foodData.ID, foodData.name, foodData.price));
                    break;
                }
            }
        }
        return new 販売中の食券の一覧(販売中の食券リスト);
    }

    public record FoodData(String ID, String name, int price) {
    }
}
