package java_basics;


class Human {
    // data's wrapped inside in the class (private)
    // which are accessible only inside in this class
    private int age;
    private String name;
    private String rollno;

    /* getters and setter could be even auto-generated or manually defined */
    // accessing the data's (getter() method)
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getRollno() {
        return rollno;
    }

    // setting the data's (setter() method)
    public void setAge(int a) {
        age = a;
    }

    public void setName(String n) {
        name = n;
    }

    public void setRollno(String rno) {
        rollno = rno;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        // ENCAPSULATION: a technique of wrapping the required datas into the class
        Human obj = new Human();
        // setting and accessing datas only through the methods
        obj.setAge(20);
        obj.setName("Preveen");
        obj.setRollno("22ITA50");
        System.out.println(obj.getName() + " : " + obj.getAge() + " : " + obj.getRollno());
    }
}