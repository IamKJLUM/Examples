import java.util.Scanner;

public class Main {
    private static TodoList todoList = new TodoList();

    public static void main(String[] args) {
        final String ADD_BY_INDEX = "(^(A|a)(D|d)(D|d)\\s)(\\d*\\s)([\\w]*\\s?)*";
        final String ADD =          "(^(A|a)(D|d)(D|d)\\s)([a-zA-Z]+\\s*\\d*)*";
        final String LIST =         "(^(L|l)(i|I)(s|S)(t|T))";
        final String DELETE =       "((D|d)(E|e)(L|l)(E|e)(T|t)(E|e)\\s)(\\d*)";


        while (true) {
            String input = new Scanner(System.in).nextLine();

            if (input.matches(ADD)) {
                todoList.add(input);

            } else if (input.matches(ADD_BY_INDEX)) {
                int index = 0;
                for (String checkIndex : input.split("\\s")) {
                    if (checkIndex.matches("\\d+")) {
                        index = Integer.parseInt(checkIndex);
                        break;
                    }
                }
                todoList.add(index, input);
            }
            if (input.matches(LIST)) {
                System.out.println(todoList.getTodos());
            }
            if (input.matches("(^(E|e)(D|d)(I|i)(T|t)\\s)(\\d*\\s)([\\w]*\\s?)*")) {
                int index = 0;
                for (String checkIndex : input.split("\\s")) {
                    if (checkIndex.matches("\\d+")) {
                        index = Integer.parseInt(checkIndex);
                        break;
                    }
                }
                todoList.edit(index,input);
            }
            if (input.matches(DELETE)) {
                int index = 0;
                for (String checkIndex : input.split("\\s")) {
                    if (checkIndex.matches("\\d+")) {
                        index = Integer.parseInt(checkIndex);
                        break;
                    }
                }
                todoList.delete(index);
            }
        }
    }
}
