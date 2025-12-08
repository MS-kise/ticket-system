package org.example.ticket.domain;

import java.util.List;

public class 取扱中のフード食券 {
    private final List<取扱食券> 食券の一覧;

    public 取扱中のフード食券(List<取扱食券> 食券の一覧) {
        this.食券の一覧 = 食券の一覧;
    }

    public List<取扱食券> get食券の一覧() {
        return 食券の一覧;
    }
}
