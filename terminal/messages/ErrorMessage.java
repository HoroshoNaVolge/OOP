package terminal.messages;

public class ErrorMessage implements Message {

    String errorMessage = "Bad input, pls try again: \n";

    @Override
    public void displayMessage() {
        System.out.println(errorMessage);
    }
}