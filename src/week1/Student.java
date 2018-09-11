package week1;

public  class Student{
	private	String 	Name,
			ID,
			Group,	
			email;
	public void setName(String name){  
		this.Name = name;
	}
	public String getName(){
		return this.Name;
	}
	public void setID(String id){  
		this.ID = id;
	}
	public String getID(){
		return this.ID;
	}
	public void setGroup(String gr ){  
		this.Group = gr;
	}
	public String getGroup(){
		return this.Group;
	}
	public void setemail(String mail){  
		this.email = mail;
	}
	public String getemail(){
		return this.email;
	}
	public void getInfo(){
		System.out.println(this.Name + "\n" + this.ID + "\n" + this.Group + "\n" + this.email);
	}
	public Student(){
		this.Name ="Student";
		this.ID = "000";
		this.Group = "INT22041";
		this.email = "uet@vnu.edu.vn";
	}
	public Student(String n, String sid, String em)	{
		this.Name = n ;
		this.ID = sid ;
		this.Group = "INT22041";
		this.email = em ;
	}
	public Student(Student s){
		this.Name = s.Name ;
		this.ID = s.ID ;
		this.Group = s.Group ;
		this.email = s.email ;
	}
}
