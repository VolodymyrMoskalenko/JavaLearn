package lab08;
import lab08.Human;
public class Student extends Human {
    public String group="абитуриент";

    public Student(String surname, String name, String patronymic, boolean sex,
                   String birthDate, String location) {
        super(surname, name, patronymic, sex, birthDate, location);
    }

    public Student(String surname, String name, String patronymic) {
        super(surname, name, patronymic);
    }

    public void printInfo() {
        super.printInfo();
        System.out.println(" " + group);
    }

    public void shortPrintInfo() {
        super.shortPrintInfo();
    }

    @Override
    public void shortPrintInfo(String group) {
        super.shortPrintInfo(group);
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}