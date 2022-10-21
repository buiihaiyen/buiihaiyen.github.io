package jstlEntity;
import javax.persistence.Entity;
@Entity
public class Student {
	private String name; 
	private Double mark; 
	private String major;
	private String danhhieu;
	private String xeploai;
	
	public Student() { 
		
	}
	public Student (String name, Double mark, String major, String danhhieu, String xeploai) { 
		this.setMajor (major); 
		this.setName(name); 
		this.setMark (mark);
		this.setDanhhieu (danhhieu);
		this.setXeploai (xeploai);
		
	}
	public String getName() { 
		return name; 
	} 
	public void setName(String name) { 
		this.name = name; 
	} 
	public Double getMark() { 
		return mark; 
	} 
	public void setMark (Double mark) {
		this.mark = mark ; 
	} 
	public String getMajor() { 
		return major; 
	} 
	public void setMajor(String major) { 
		this.major = major; 
	}
	public String getXeploai() {
		if (mark >= 8.5) {
	         xeploai = "Xuat sac";
	     } else if ((mark >= 7) && (mark < 8.5)) {
	        
	    	 xeploai = "Kha";
	     } else if ((mark >= 5) && (mark < 7)) {
	    	 xeploai = "Trung binh";
	     
		} else if (mark < 5) {
			xeploai = "Yeu";
		}
		return xeploai; 
	} 
	public void setDanhhieu(String danhhieu) { 
		this.danhhieu = danhhieu; 
	}
	public String getDanhhieu() { 
		if (mark >= 8.5) {
	         danhhieu = "Ong Vang";
	     } else if ((mark >= 7) && (mark < 8.5)) {
	        
	    	 danhhieu = null;
	     } else if ((mark >= 5) && (mark < 7)) {
	    	 danhhieu = null;
	     
		} else if (mark < 5) {
			danhhieu = null;
		}
		
		return danhhieu; 
	} 
	public void setXeploai(String xeploai) { 
		this.xeploai = xeploai; 
	}
	 

}
