package terminal;

public class inputChecker {

    public static boolean checked(String input) {
        String[] inputList = input.split("\\s");
        if (inputList.length != 2 && inputList.length != 6) {
            return false;
        } else if (!inputList[0].equals("wolf") && !inputList[0].equals("snake")) {
            return false;
        } else if (!inputList[1].equals("delete") && !inputList[1].equals("create")) {
            return false;
        } else if (inputList.length == 6 && !(inputList[3].matches("\\d+") &&
                inputList[4].matches("\\d+") &&
                inputList[5].matches("\\d+"))) {
            return false;
        } else if (inputList.length == 2 && inputList[1].equals("create")) {
            return false;
        } else {
            return true;
        }
    }
}