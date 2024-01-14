public class OOPspw {

    public static class Student {
        String name;
        int rollnum;
        double percentage;
        final String schoolname = "SXS";
    }

    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Likhil";
        s1.rollnum = 23;
        Student s2 = new Student();
        s2.name = "yash";
        s2.percentage = 90.5;
        // s1.schoolname="DPS";//not possible since final keyword makes it permanent
        // variable of the class that can not be changed afterwads
        System.out.println(s1.schoolname);
        System.out.println(s2.name);
        System.out.println(s1.rollnum);
    }
}
