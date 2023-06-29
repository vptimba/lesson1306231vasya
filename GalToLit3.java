
    class Demomemo {
        public static void main(String args[])  {
            int a, b, c;
            a = 2;
            b = 3;

            if(a < b) System.out.println("a is less than b");
            // следующая строка не должна выводиться
            if(a == b) System.out.println("you won't see this");

            System.out.println();

            c = a - b; // переменная с содержит значение -1

            System.out.println("с contains -Iм");
            if(c >= 0) System.out.println("с is non-negative");
            if(c < 0) System.out.println("c is negative");

            System.out.println();

            c = b - a; // переменная с теперь содержит значение 1

            System.out.println("с contains 1");
            if(c >= 0) System.out.println("с is non-negative");
            if(c < 0) System.out.println("c is negative");
        }
    }

