package p1;

public class Main {
    public static void main(String[] args) { //1. создать класс, переход
        Person ivan = new Person(); //5
        ivan.printInfo();         //9  перех
        ivan.name = "Ivan";            //6
        ivan.age = 30;                  //7
        ivan.printInfo();            //8

        Person person = new Person("Mary");//16
        person.printInfo();//17 вызов перех

        Person person1 = new Person("Sergey",21); //21
        person1.printInfo();//22 вызов перех
        person1.printAddress();//31 переделать с окна мейк



    }
}