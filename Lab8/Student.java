package lab08;

public class Student {
    String name;
    String surname;
    int number;
    String group;

    Student(String n, String s, int a, String g){
        name = n;
        surname = s;
        number = a;
        group = g;
    }

    void about(){
        System.out.printf("Name: %s \nSurname: %s \nNumber in group: %d \nGroup: %s \n",name,surname,number,group);
    }
}