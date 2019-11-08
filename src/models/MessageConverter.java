package models;

import models.Message;

public class MessageConverter {

    public String convert(Message message){
        return message.getBody();
    }



}
