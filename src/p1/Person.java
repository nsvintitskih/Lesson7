package p1;

public class Person {//шаблон


    String name;// 2
    protected int age;//3, 24 (модификаторы добавили протектор)
    public String address;//25
    private String phone;//26



    {
        System.out.println("Start init object");//24 перед созданием обьектов переход вызов
    }

    public Person() {         //10 генерир.
     // name = "None";           //11
      //age = 18;                //12 переход,а там вызов 13
        this("None",18);                //23 удалить 11,12


    }

    public Person(String name) {   //14
        this.name = name;               //15 перех,переделать на зис
    }

    public Person(String name, int age) {//18
       this.name = name;//19
        this.age = age;//20перех
    }

    public Person(String name, int age, String address, String phone) {//27
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    void printInfo() {
        System.out.printf("Name: %s \tAge: %d \n", name, age);//4 переход( делать обьекты)
}

    public void printAge(){            //34 добавили модификатор public
        System.out.printf("Name: %s \tAge: %d \n", name, age); //28
    }

    void printAddress(){
        System.out.printf("Name: %s \tAddress: %s \n", name, address);//29, 32 удалился модифик private, создаем p2
    }

    protected void printPhone(){
        System.out.printf("Name: %s \tPhone: %s \n", name, phone);//30 переход
    }
}
