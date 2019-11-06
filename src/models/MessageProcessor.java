package models;

public class MessageProcessor {

//    String name;
//
//    public MessageProcessor(String name) {
//        this.name = name;
//    }

    public void process(Message message){
        System.out.printf(message.getBody());
    }

}
