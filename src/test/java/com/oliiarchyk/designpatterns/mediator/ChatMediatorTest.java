package com.oliiarchyk.designpatterns.mediator;

import org.junit.jupiter.api.Test;

class ChatMediatorTest {

    @Test
    void mediatorTest(){
        var chatroom = new ChatRoom();

        var user1 = new ChatUser(chatroom, "Alice");
        var user2 = new ChatUser(chatroom, "Bob");
        var user3 = new ChatUser(chatroom, "Charlie");

        chatroom.addUser(user1);
        chatroom.addUser(user2);
        chatroom.addUser(user3);

        user1.send("Hello everyone!");
        user2.send("Hey Alice!");
    }

}