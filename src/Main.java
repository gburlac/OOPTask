import models.JsonMessage;
import models.MessageProcessor;
import models.XmlMessage;

public class Main {
    public static void main(String[] args) {
        XmlMessage xmlMessage = new XmlMessage("Salut");
        MessageProcessor messageProcessor = new MessageProcessor();
        messageProcessor.process(xmlMessage);
        JsonMessage jsonMessage = new JsonMessage("  Hello");
        MessageProcessor messageProcessor1 = new MessageProcessor();
        messageProcessor1.process(jsonMessage);


    }
}
