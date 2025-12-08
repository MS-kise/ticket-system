package org.example.ticket.domain;

import java.util.ArrayList;
import java.util.List;

public class 取扱食券の一覧 {
    private final List<取扱食券> 食券の一覧;

    public 取扱食券の一覧() {
        this.食券の一覧 = new ArrayList<>();
    }

    public List<取扱食券> get食券の一覧() {
        return 食券の一覧;
    }

    public void 追加する(List<取扱食券> 追加する食券の一覧) {
        this.食券の一覧.addAll(追加する食券の一覧);
    }
}
