import java.util.ArrayList;

public class TodoList {
    ArrayList<String> list = new ArrayList<>();
    private final String REPLACE_ADD =  "(A|a)(D|d)(D|d)\\s(\\d+\\s)?";
    private final String REPLACE_EDIT = "(^(E|e)(D|d)(I|i)(T|t)\\s(\\d+\\s))";

    public void add(String todo) {

        String text = todo.replaceAll(REPLACE_ADD, "");
        list.add(text);
        System.out.println("Добавлено дело \"" + text + "\"");
    }

    public void add(int index, String todo) {

        String text = todo.replaceAll(REPLACE_ADD, "");
        if (index < list.size()) {
            list.add(index,text);
            System.out.println("Добавлено дело \"" + text + "\"");
        } else {
            list.add(text);
            System.out.println("Добавлено дело \"" + text + "\"");
        }
    }

    public void edit(int index, String todo) {

        String text = todo.replaceAll(REPLACE_EDIT, "");

        if (index <= list.size() - 1) {
            System.out.println("Дело \"" + list.get(index) + "\" заменено на \"" + text + "\"");
            list.remove(index);
            list.add(index, text);
        }
    }

    public void delete(int index) {

        if (index <= list.size() - 1) {
            System.out.println("Дело \"" + list.get(index) + "\" удалено");
            list.remove(index);
        } else {
            System.out.println("Дела с таким номером не существует");
        }
    }

    public ArrayList<String> getTodos() {

        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + " - " + list.get(i));
        }
        return list;
    }

}