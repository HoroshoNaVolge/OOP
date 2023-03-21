package terminal.messages;

public class InviteMessage implements Message {
    String inviteMessage = "ТЕРМИНАЛ:\n " +
            "\nДля удаления животного введите 'вид животного' delete (wolf delete или snake delete)\n" +
            "Для создания животного введите 'вид животного' create и через пробелы ИМЯ ГОДРОЖДЕНИЯ ВЕС НОМЕР) (ПРИМЕР: snake create Bill 2020 15 1)\n" +
            "Для выхода из программы введите exit";

    @Override
    public void displayMessage() {
        System.out.println(inviteMessage);
    }
}