package lab08;

public class Group {

	private int countStudent = 0;
	private String nameGroup;
	private Student[] aStudents = new Student[10];

	Group(String nameGroup) {
		this.nameGroup=nameGroup;
	}

	public String getNameGroup() {
		return nameGroup;
	}

	public void setNameGroup(String nameGroup) {
		this.nameGroup = nameGroup;
	}

	public void findStudent(String surname) {
		for (int i = 0; i < countStudent; i++) {
			if (aStudents[i].getSurname().equalsIgnoreCase(surname)) {
				System.out.println("Студент найден:");
				aStudents[i].printInfo();
			}
		}
	}

	public void addStudent(Student s) {
		try{
			if (countStudent == 10) {
				throw new OverflowGroupException();
			}
			if (s.getGroup().equals("абитуриент")){
				aStudents[countStudent] = s;
				aStudents[countStudent].setGroup(nameGroup);
				countStudent++;
			} else {
				System.out.println("Студент "+ s.getSurname() +" уже закреплен за группой: "+ s.getGroup());
			}
		} catch (OverflowGroupException e){
			System.out.println(e.getMessage());
		}
	}

	public void delStudent(Student s) {
		try{
			if (countStudent == 0) {
				throw new NullGroupException();
			} else {
				for (int i = 0; i < countStudent; i++) {
					if (aStudents[i].equals(s)) {
						aStudents[i].setGroup("абитуриент");
						aStudents[i] = null;

						for (; i < countStudent-1; i++) {
							aStudents[i] = aStudents[i + 1];
						}
						countStudent--;
					}
				}
			}
		} catch (NullGroupException e){
			System.out.println(e.getMessage());
		}
	}

	public void printInfo() {
		for (int i = 0; i < countStudent; i++) {
			System.out.print(i+1+".");
			aStudents[i].printInfo();
		}
		try {
			if (countStudent==0) throw new NullGroupException();
		} catch (NullGroupException e) {
			System.out.println(e.getMessage());
		}
	}
}
