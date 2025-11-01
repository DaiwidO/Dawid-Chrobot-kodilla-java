package com.kodilla.good.patterns.challenges;

public class Application {

    public static void main(String[] args) {

        System.out.println("Starting Application");

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderingProcessor orderingProcessor = new OrderingProcessor(
                new MailSender(), new ProductOrderService() , new OrderRepository());

        orderingProcessor.process(orderRequest);
    }
}
