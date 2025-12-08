package org.example.ticket.domain;

public class 出力内容 {
    private final 小計 小計;
    private final 獲得ポイント数 獲得ポイント数;
    private final まとめ買い割引後の金額 セット割後金額;
    private final まとめ買い割引率 まとめ買い割引率;

    public 出力内容(小計 小計, 獲得ポイント数 獲得ポイント数, まとめ買い割引後の金額 セット割後金額, まとめ買い割引率 まとめ買い割引率) {
        this.小計 = 小計;
        this.獲得ポイント数 = 獲得ポイント数;
        this.セット割後金額 = セット割後金額;
        this.まとめ買い割引率 = まとめ買い割引率;
    }

    public 小計 get小計() {
        return 小計;
    }

    public 獲得ポイント数 get獲得ポイント数() {
        return 獲得ポイント数;
    }

    public まとめ買い割引後の金額 getセット割後金額() {
        return セット割後金額;
    }

}
