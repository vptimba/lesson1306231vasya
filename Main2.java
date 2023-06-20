import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {

    public static void main(String[] args) throws IOException {
        boolean isTrue = false;
        boolean isOneEqualsTwo = 1 == 2;
        boolean isYes = 1 < 2;
        if (isOneEqualsTwo) {
            System.out.println("one equals two");
        } else {
            System.out.println("One does not equal two");
        }
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("введите имя");
        String name = reader.readLine();
        System.out.println("введите расу");
        String race = reader.readLine();
        System.out.println("введите возраст (ТОЛЬКО ЦИФРАМИ!!!)");
        Integer age = readInt(reader);
        Person examplePerson = new Person(name, race, age);
        if (hasAccessRights(examplePerson)) {
            System.out.println("Персоне " + examplePerson.toString() + " доступ разрешён");
        } else {
            System.out.println("Персоне " + examplePerson.toString() + " доступ запрещён");
        }

    }

    public static boolean hasAccessRights(Person human) {
        boolean result = false;
        if (human.age >= 18) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public static int readInt(BufferedReader reader) throws IOException {
        String inputText = reader.readLine();
        Integer inputIntenger = 0;
        try {
            inputIntenger = Integer.parseInt(inputText);
        } catch (NumberFormatException nfe) {
            System.out.println("Введите цифры, а не текст сука блять!");
            return readInt(reader);
        }
        return inputIntenger;

    }
}


