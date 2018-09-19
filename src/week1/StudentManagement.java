package week1;

public class StudentManagement {
	// TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    public Student[] students = new Student[100];
    public boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }
	void  studentsByGroup() {
        // TODO:
		int[] A = new int[100];
		for (int i =0; i<100;i++) A[i] = 0;
		for (int i =0; students[i] != null;i++) {
			if (A[i] == 0)
			{
				System.out.println("Danh sach lop " + students[i].getGroup() + ":");
				for (int j = i; students[j] != null; j++){
					if (students[j].getGroup().equals(students[i].getGroup())) {
						System.out.println(students[i].getName());
						A[j] = 1;
					}
				}
			}
		}
	}

	void removeStudent(String id) {
    	int a,b;
		for ( a = 0; a < students.length;a++) {
			if (students[a] != null && students[a].getID().equals(id)) {
				for ( b = a; b < students.length-1;b++)
					students[b] = students[b+1];
				students[students.length-1] = new Student();
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
		System.out.println(std1.getName());
		System.out.println(std1.getInfo());
		// Test 6
		Student std2 = new Student();
		System.out.println(std2.getInfo());
		// Test 7a - INT22041
		Student std3 = new Student("Nguyen Van A", "17020000", "VanA@vnu.edu.vn");
		System.out.println(std3.getInfo());
		// Test 7b -- INT22041
		Student std4 = new Student(std1);
		System.out.println(std4.getInfo());
		//Test 7c -- INT22044
		Student std5 = new Student("Nguyen Van B", "17029999", "VanB@vnu.edu.vn");
		std5.setGroup("INT22042");
		// Test 10
		System.out.println( stds.sameGroup(std1,std4));
		System.out.println( stds.sameGroup(std1,std5));
		stds.students[0] = std1;
		stds.students[1] = std3;
		stds.students[2] = std5;
		stds.studentsByGroup();
		stds.removeStudent("17020000");
        System.out.println("Danh sach lop sau khi xoa:");
        for (int i = 0; stds.students[i] != null; i++) {
              System.out.println(stds.students[i].getInfo());
        }
		// TODO:
    }
}
