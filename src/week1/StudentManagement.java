package week1;

public class StudentManagement {
	Student[] students = new Student[99];
    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)

    public boolean sameGroup(Student s1, Student s2) {
    	return (s1.getGroup() == s2.getGroup());
    }

	void studentsByGroup() {
		System.out.println("INT22044\n");
		for (int a =0; a < students.length;a++)
			if (students[a].getGroup() == "INT22044")
				System.out.println(students[a].getName());

		// TODO:
	}

	void removeStudent(String id) {
		for ( int a = 0; a<this.students.length;a++){
			if(this.students[a].getID().equals(id)) {
				for (int b = a; b<this.students.length;b++) this.students[b] = this.students[b+1];
			}
		}
		// TODO:
	}


	public static void main(String[] args) {
    	StudentManagement stds = new StudentManagement();
    	Student std1 = new Student();
		std1.setName("Nguyen Xuan Hien");
		std1.setID("17020730");
		std1.setGroup("INT22044");
		std1.setemail("nguyenxuanhientb@icloud.com");
		String name;
		name = std1.getName();
		System.out.println(name);
		std1.getInfo();
		// Test 6
		Student std2 = new Student();
		std2.getInfo();
		// Test 7a - INT22041
		Student std3 = new Student("Nguyen Van A", "17020000", "VanA@vnu.edu.vn");
		std3.getInfo();
		// Test 7b -- INT22041
		Student std4 = new Student(std1);
		std4.getInfo();
		//Test 7c -- INT22044
		Student std5 = new Student("Nguyen Van B", "17029999", "VanB@vnu.edu.vn");
		std5.setGroup("INT22042");
		// Test 10
		System.out.println( stds.sameGroup(std1,std4));
		System.out.println( stds.sameGroup(std1,std5));
		stds.students[0] = std1;
		stds.students[1] = std2;
		stds.students[2] = std3;
		stds.students[3] = std4;
		stds.students[4] = std5;
		stds.studentsByGroup();
		// TODO:
    }
}
