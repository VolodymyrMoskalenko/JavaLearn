package lab08;

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Group group=new Group("ОФ-01");

        Student s1=new Student("Иванов","Иван","Иванович",true, "01.01.1900","Киев");
        Student s2=new Student("Петров","Петр","Петрович",true,"01.01.1900","Киев");
        Student s3=new Student("Сергеев","Сергей","Сергеевич",true,"01.01.1900","Киев");
        Student s4=new Student("Романов","Роман","Романович",true,"01.01.1900","Киев");
        Student s5=new Student("Андреев","Андрей","Андреевич",true,"01.01.1900","Киев");
        Student s6=new Student("Максимов","Максим","Максимович",true,"01.01.1900","Киев");
        Student s7=new Student("Игорев","Игорь","Игоревич",true,"01.01.1900","Киев");
        Student s8=new Student("Алексеев","Алексей","Алексеевич",true,"01.01.1900","Киев");
        Student s9=new Student("Еленова","Елена","Ивановна",false,"01.01.1900","Киев");
        Student s10=new Student("Денисова","Наталья","Денисовна",false,"01.01.1900","Киев");
        Student s11=new Student("Петрова","Ольга","Петровна",false,"01.01.1900","Киев");

        Student demo =new Student("Петрова","Ольга","Петровна");
        demo.shortPrintInfo();
        demo.shortPrintInfo("IA-z91");
        group.printInfo();
        group.addStudent(s1);
        group.addStudent(s2);
        group.addStudent(s3);
        group.addStudent(s4);
        group.addStudent(s5);
        group.addStudent(s6);
        group.addStudent(s7);
        group.addStudent(s8);
        group.addStudent(s9);
        group.addStudent(s10);

        group.printInfo();
        group.addStudent(s11);
        group.findStudent("Андреев");

        group.delStudent(s2);

        s1.printInfo();
        group.delStudent(s1);
        s1.printInfo();

        group.addStudent(s11);
        group.addStudent(s11);
        group.printInfo();
    }
}