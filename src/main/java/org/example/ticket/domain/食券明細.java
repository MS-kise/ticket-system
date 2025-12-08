package org.example.ticket.domain;

import java.util.List;

public class 食券明細 {
    private final List<食券明細項目> 食券明細項目の一覧;

    public 食券明細(List<食券明細項目> 食券明細項目の一覧) {
        this.食券明細項目の一覧 = 食券明細項目の一覧;
    }

    public List<食券明細項目> get食券明細項目の一覧() {
        return 食券明細項目の一覧;
    }
}
