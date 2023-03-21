package terminal.parsers;

import terminal.Command;

import java.util.ArrayList;

public interface CommandParser {

    default Command parseCommand(String inputCommand) {
        ArrayList<String> param = new ArrayList<>();
        String[] paramTmp = inputCommand.split("\\s+");
        String animal = paramTmp[0];
        String action = paramTmp[1];
        if (paramTmp.length == 6) {
            for (int i = 2; i < 6; i++) {
                param.add(i - 2, paramTmp[i]);
            }
        } else {
            param.add(0,  " ");
        }
        return new Command(animal, action, param);
    }
}
