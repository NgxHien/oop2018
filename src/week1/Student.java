package week1;

public class Student{
	private	String 	Name,
					ID,
					Group,
					email;
	// TODO: khai báo các thuộc tính cho Student
	public void setName(String name){
		this.Name = name;
	}
	public String getName(){
		return Name;
	}
	public void setID(String id){
		this.ID = id;
	}
	public String getID(){
		return ID;
	}
	public void setGroup(String gr ){
		this.Group = gr;
	}
	public String getGroup(){
		return Group;
	}
	public void setemail(String mail) {
		this.email = mail;
	}
	public String getemail(){
		return email;
	}
	// TODO: khai báo các phương thức getter, setter cho Student
	String getInfo(){
		return this.getName()+"\n"+this.getID()+"\n"+this.getGroup()+"\n"+this.getemail();
	}
	/**
	 * Constructor 1
	 */
	Student(){
		this.Name ="Student";
		this.ID = "000";
		this.Group = "INT22041";
		this.email = "uet@vnu.edu.vn";
	}
	/**
	 * Constructor 2
	 * @param n : ten SV
	 * @param sid : ID
	 * @param em : ten Email
	 */
	Student(String n, String sid, String em)	{
		this.Name = n ;
		this.ID = sid ;
		this.Group = "INT22041";
		this.email = em ;
	}
	/**
	 * Constructor 3
	 * @param s: s
	 */
	Student(Student s){
		this.Name = s.Name ;
		this.ID = s.ID ;
		this.Group = s.Group ;
		this.email = s.email ;
	}
}
