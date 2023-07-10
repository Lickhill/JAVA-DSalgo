public class OOPSconceptpractice {
    public static void main(String args[]) {

        String hello = "hello";
        int world = 1;
        System.out.printf("The greeting is %s and the number of planets is %d", hello, world);
        System.out.println();

        Pen p1 = new Pen();
        p1.changecolor("yellow");
        System.out.println(p1.color);
        p1.tip = 5;
        System.out.println(p1.tip);

        // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        Password accountholder = new Password();
        accountholder.username = "LikhiL";
        // accountholder.password="likhli12345"; //not possible because password is
        // private in the lcass Password

        accountholder.setpassword("likhil12345@@");
        // System.out.println(accountholder.password); //again not possible

        // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        Pencil pencil = new Pencil();
        pencil.setmaterial("wood");
        pencil.settipmaterial("graphite");
        System.out.println(pencil.getmaterial());
        System.out.println(pencil.gettipmaterial());
        pencil.changematerial("plastic");
        System.out.println(pencil.material2);
        // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        Constructorconcept nonparameterized = new Constructorconcept();
        Constructorconcept parameterized = new Constructorconcept("Likhil", 19);

        // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        Student s1 = new Student();
        s1.password = "likhil123";
        s1.marks[0] = 100;
        s1.marks[1] = 80;
        s1.marks[2] = 57;
        s1.name = "Yash";
        s1.age = 22;
        System.out.println("\n" + s1.marks[1]);

        Student s2 = new Student(s1);
        s2.password = "yashyash";

        System.out.println(s2.marks[0]);
        System.out.println(s2.name);

        s1.marks[0] = 0;
        System.out.println(s2.marks[0]);

        // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        Fish nemo = new Fish();
        nemo.breathe();
        Dog puchu = new Dog();
        puchu.legs = 4;
        puchu.breed = "yes";
        puchu.tail = 1;
        System.out.println(puchu.tail);
        puchu.breathe();

        // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        Calculator calc = new Calculator();
        System.out.println(calc.sum(1, 2, 4));
        System.out.println(calc.sum(13, 21));
        System.out.println(calc.sum(1.3f, 2.0f));
        System.out.println(calc.sum(1, 2.4f));
        // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        // janwar pashu=new janwar(); //this is always give an error because you cannot
        // make an object for abstract class
        horse ghoda = new horse();
        ghoda.eat();
        ghoda.walks();
        insan manushya = new insan();
        manushya.walks();
    }
}

class Pen {
    String color;
    int tip;

    void changecolor(String newcolor) {
        color = newcolor;
    }

    void changetip(int newtip) {
        tip = newtip;
    }
}

class Password {
    public String username;
    private String password;

    void setpassword(String newpasswrod) {
        password = newpasswrod;
    }
}

class Pencil {
    private String material;
    String material2;
    private String tipmaterial;

    void changematerial(String newmaterial) {
        material2 = newmaterial;
    }

    void changetipmaterial(String newtipmaterial) {
        tipmaterial = newtipmaterial;
    }

    void setmaterial(String mat) {
        this.material = mat;// this. is used for material which is the material under the lcass globule
                            // [String material;] this one
    }

    void settipmaterial(String newtip) {
        this.tipmaterial = newtip;
    }

    String getmaterial() {
        return this.material;
    }

    String gettipmaterial() {
        return this.tipmaterial;
    }
}

class Constructorconcept {
    String myname;
    int myage;

    Constructorconcept() {
        System.out.println(
                "hello this is a non parameterized constructor. we call this constructor in the main class and everything inside the constructor runs smoothly");
    }

    Constructorconcept(String name, int age) {
        this.myname = name;
        this.myage = age;
        System.out.printf("My name is %s and my age is %d", this.myname, this.myage);
    }
}

class Student {

    Student() {

    }

    String password;
    String name;
    int age;
    int marks[] = new int[3];

    Student(Student s1) {// shallow copy constructor
        marks = new int[3];
        this.name = s1.name;
        this.age = s1.age;
        // this.marks = s1.marks; //this is used to shallow coping means the even after
        // b copies from a and a is changed afterwards, the the data b copied also
        // changes

        int i;// after coping it doesnt change as A changes
        for (i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }

    }
}

class Animals {
    int legs;
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

class Fish extends Animals {
    String coloroffin;

    void swim() {
        System.out.println("swims");
    }
}

class mammal extends Animals {
    String breed;
}

class Dog extends mammal {
    int tail;
}

class Calculator {// class which shows function overloading which means the same parameter but
                  // different data type or diff count
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    float sum(int a, float b) {
        return a + b;
    }
}

abstract class janwar {
    void eat() {
        System.out.println("Eats");
    }

    abstract void walks();
}

class horse extends janwar {
    void walks() {
        System.out.println("walks on 4 legs");
    }
}

class insan extends janwar {
    void walks() {
        System.out.println("walks on 2 legs");
    }
}