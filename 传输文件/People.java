package 传输文件;

import java.io.Serializable;

public class People implements Serializable{
	private int id;
	private String name;
	private String sex;
	
	public People(int id, String name, String sex) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
	}


	@Override
	public String toString() {
		return "People [id=" + id + ", name=" + name + ", sex=" + sex + "]";
	}
	
	
	
	

}
