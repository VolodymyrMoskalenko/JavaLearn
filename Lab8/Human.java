package lab08;

public class Human {
    private String surname;
    private String name;
    private String patronymic;
    private boolean sex;
    private String birthDate;
    private String location;


    public Human(String surname, String name, String patronymic, boolean sex,
                 String birthDate, String location) {
        setSurname(surname);
        setName(name);
        setPatronymic(patronymic);
        setSex(sex);
        setBirthDate(birthDate);
        setLocation(location);
    }

    public Human(String surname, String name, String patronymic) {
        setSurname(surname);
        setName(name);
        setPatronymic(patronymic);
    }

    public void printInfo() {
        System.out.printf(getSurname() + " " + getName() + " " + getPatronymic() +" (%s) ",isSex()?"м":"ж");
        System.out.print("("+getBirthDate()+", ");
        System.out.print(getLocation()+")");
    };

    public void shortPrintInfo() {
        System.out.printf(getSurname() + " " + getName() + " " + getPatronymic() + "\n");
    };


    public void shortPrintInfo(String group) {
        System.out.printf(getSurname() + " " + getName() + " " + getPatronymic() + " " + group + "\n");
    };

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
