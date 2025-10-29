package com.oliiarchyk.designpatterns.mediator;

import java.util.ArrayList;
import java.util.List;

class ChatRoom implements ChatMediator {

    private final List<User> users = new ArrayList<>();

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String message, User sender) {
        for (User user : users) {
            user.receive(message);
        }
    }
}