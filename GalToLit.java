
class GalToLit {
  public static void main(String args[]) {
    double gallons; //  в этой переменной хранится объем жидкости в галлонах
    double liters;  //  в этой переменной хранится  объем жидкости  в литрах
    gallons = 91;  //  исходное значение равно 10  галлонам
    liters = gallons * 3.7854; // преобразовать в  литры
    System.out.println(gallons + " gallons is " + liters + " liters.");
    if (10 < 11) {
      System.out.println("10 is less than 11");
    }

    if (10 < 9) {
      System.out.println("this won’t be displayed");
    }

  }
}

