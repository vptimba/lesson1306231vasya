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
        System.out.println("введите расу ");
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
        boolean hasAccessByAge = human.age >= 18;
        boolean hasAccessByRace = human.race.equals("white") || human.race.equals("european") || human.race.equals("белый")
                || human.race.equals("европеоид") || human.race.equals("бледнолицый") || human.race.equals("whites") || human.race.equals("вайт")
                || human.race.equals("beliy") || human.race.equals("belie") || human.race.equals("европеец")
                || human.race.equals("снежок") || human.race.equals("снежинка") || human.race.equals("snowy");
        boolean hasAccessByName = !(human.name.toLowerCase().contains("r") || human.name.toLowerCase().contains("t")
               || human.name.toLowerCase().contains("р") || human.name.toLowerCase().contains("т") || human.name.toLowerCase().contains("к"));
        return hasAccessByAge && hasAccessByRace && hasAccessByName;


    }

    public static int readInt(BufferedReader reader) throws IOException {
        String inputText = reader.readLine();
        int inputIntenger = 0;
        try {
            inputIntenger = Integer.parseInt(inputText);
        } catch (NumberFormatException nfe) {
            System.out.println("Введите цифры, а не текст сука блять!");
            return readInt(reader);
        }
        return inputIntenger;

    }
}


