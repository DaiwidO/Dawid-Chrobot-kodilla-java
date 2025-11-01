package com.kodilla.good.patterns.challenges;

public class MailSender implements InformationService {


    @Override
    public void sendConfirmation(User user) {
        System.out.println("Order confirmation sent to " + user.getFirstName() + " " + user.getLastName() + " at " + user.getEmail());
    }
}
