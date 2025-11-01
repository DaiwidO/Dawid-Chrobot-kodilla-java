package com.kodilla.good.patterns.challenges;

public class OrderingProcessor {

        private InformationService informationService;
        private OrderService orderService;
        private OrderingRepository orderingRepository;

    public OrderingProcessor(InformationService informationService, OrderService orderService, OrderingRepository orderingRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderingRepository = orderingRepository;
    }

    public OrderDto process(OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getQuantity());

        if (isOrdered) {
            informationService.sendConfirmation(orderRequest.getUser());
            orderingRepository.saveInRepository(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getQuantity());
            return new OrderDto(orderRequest.getUser(), true);
        }
        else  {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
