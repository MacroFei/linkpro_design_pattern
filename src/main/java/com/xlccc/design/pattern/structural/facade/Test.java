package com.xlccc.design.pattern.structural.facade;

public class Test {
    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("Phone");
        GiftExchangeService giftExchangeService = new GiftExchangeService();

        giftExchangeService.giftExchange(pointsGift);
    }
}
