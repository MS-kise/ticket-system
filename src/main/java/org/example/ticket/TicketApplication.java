package org.example.ticket;

import org.example.ticket.domain.出力内容;
import org.example.ticket.domain.選択した食券たち;
import org.example.ticket.domain.選択した食券たちの一覧;
import org.example.ticket.usecase.食券を購入する;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class TicketApplication {

    public static void main(String[] args) {

        var context = SpringApplication.run(TicketApplication.class, args);
        出力内容 out = context.getBean(食券を購入する.class).実行する(new 選択した食券たちの一覧(List.of(
                new 選択した食券たち("F4", 1),
                new 選択した食券たち("F3", 2)
        )));
        System.out.println("割引前合計金額: " + out.割引前合計金額().get割引前合計金額());
        System.out.println("割引後合計金額: " + out.セット割後金額().getセット割後合計金額());
        System.out.println("獲得ポイント数: " + out.獲得ポイント数().get獲得ポイント数());
    }

}

