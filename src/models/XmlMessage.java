package models;

public class XmlMessage implements Message {
    private  String body;
    public String prepareMessage(){
        return " ";
    }

    @Override
    public String getBody() {
        return body;
    }

    public XmlMessage(String body) {
        this.body = body;
    }
}
