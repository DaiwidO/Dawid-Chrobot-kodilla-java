package com.kodilla.good.patterns.food2door.application;

import com.kodilla.good.patterns.food2door.model.OrderRequest;
import com.kodilla.good.patterns.food2door.model.OrderRequestRetriever;
import com.kodilla.good.patterns.food2door.processor.OrderProcessor;

public class Application {

    public static void main(String[] args){

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor();

        orderProcessor.processOrder(orderRequest.getSupplier(), orderRequest);
    }
}
