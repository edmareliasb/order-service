package com.javatechie.aws.cicd.example;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Order {

    private int id;
    private String name;
    private int quantity;
    private long price;
}
