package terminal.messages;

import zoo.Zoo;

public class ZooSummaryMessage implements Message {

    Zoo zoo;

    public ZooSummaryMessage(Zoo zoo) {
        this.zoo = zoo;
    }

    @Override
    public void displayMessage() {
        System.out.println(zoo.Summary());
    }

}
