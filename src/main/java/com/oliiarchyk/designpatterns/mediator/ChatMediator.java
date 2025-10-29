package com.oliiarchyk.designpatterns.mediator;

interface ChatMediator {

    void sendMessage(String message, User user);

    void addUser(User user);
}