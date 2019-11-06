import models.JsonMessage;
import models.MessageConverter;
import models.MessageProcessor;
import models.XmlMessage;

public class Main {
    public static void main(String[] args) {
        MessageConverter converter = new MessageConverter();
        XmlMessage xmlMessage = new XmlMessage("Salut");
        MessageProcessor messageProcessor = new MessageProcessor();
        messageProcessor.process(xmlMessage);
        JsonMessage jsonMessage = new JsonMessage("  Hello");
        MessageProcessor messageProcessor1 = new MessageProcessor();
        messageProcessor1.process(jsonMessage);

        System.out.printf(" Converted JSONMessage: " + converter.convert(jsonMessage));
        System.out.printf(" Converted XMLMessage: " + converter.convert(xmlMessage));


    }
}
