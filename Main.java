import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("введите текст");
        String sex = reader.readLine();
        printMyVariable(5, sex);
        sex = sex + sex + " s negrom";
        System.out.println(sex);

        int myFirstVariable = 1;
        System.out.println(myFirstVariable);
        printMyVariable(myFirstVariable , "Artak");
        printMyVariable(myFirstVariable , "Artak");
        printMyVariable(5 , "Artak");
        suckMyDick("suck my cock which is");


        Person firstPerson = new Person();
        System.out.println(firstPerson.name);
        Person secondPerson = new Person();
        secondPerson.name = "Gay";
        secondPerson.race = "Uzkoglaziy";
        secondPerson.toString();
        printMyVariable(2, "suckball");
        System.out.println(firstPerson);
        System.out.println(secondPerson);

    }

    public static void printMyVariable (int a , String name) {
        a = a + 1;
        System.out.println(a);
        String greeting = name + ", hello";
        System.out.println(greeting);




    }

    public static void suckMyDick (String cock) {
        String typeOfCock = cock + " black";
        System.out.println(typeOfCock);
    }

}
