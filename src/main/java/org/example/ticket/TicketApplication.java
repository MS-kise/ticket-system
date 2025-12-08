package org.example.ticket;

import org.example.ticket.domain.出力内容;
import org.example.ticket.domain.食券明細項目;
import org.example.ticket.domain.食券明細;
import org.example.ticket.usecase.食券を購入する;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class TicketApplication {

    public static void main(String[] args) {

        var context = SpringApplication.run(TicketApplication.class, args);
        出力内容 out = context.getBean(食券を購入する.class).実行する(new 食券明細(List.of(
                new 食券明細項目("F4", 1),
                new 食券明細項目("F3", 2)
        )));
        System.out.println("割引前合計金額: " + out.get小計().get割引前の金額());
        System.out.println("割引後合計金額: " + out.getセット割後金額().get金額());
        System.out.println("get獲得ポイント数: " + out.get獲得ポイント数().get獲得ポイント数());
    }

}

