package ranjancapgemini;




import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class StudentTreeSet{
	int sid;
	String name;
	int marks;
	public StudentTreeSet(int sid, String name, int marks) {
		super();
		this.sid = sid;
		this.name = name;
		this.marks = marks;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
}
class StudentMarksCompare implements Comparator<StudentTreeSet>{

	public int compare(StudentTreeSet o1, StudentTreeSet o2) {
		
		return o1.marks-o2.marks;
	}
}
class StudentNameCompare implements Comparator<StudentTreeSet>{

	public int compare(StudentTreeSet o1, StudentTreeSet o2) {
		
		return o1.getName().compareTo(o2.getName());
	}
}
class StudentIdCompare implements Comparator<StudentTreeSet>{

	public int compare(StudentTreeSet o1, StudentTreeSet o2) {
		
		return o1.sid-o2.sid;
	}
}
public class TreeSet_Pgm {

	public static void main(String[] args) {
		TreeSet<StudentTreeSet> ob=new TreeSet< StudentTreeSet>(new StudentMarksCompare() );
		StudentTreeSet tob1=new StudentTreeSet(1, "RANJAN",640);
		StudentTreeSet tob2=new StudentTreeSet(2, "RUPESH",612);
		StudentTreeSet tob3=new StudentTreeSet(3, "GOKU",600);
		ob.add(tob1);
		ob.add(tob2);
		ob.add(tob3);
		
		System.out.println("Sorting based on the Marks");
		
		Iterator<StudentTreeSet> it=ob.iterator();
		while (it.hasNext()) {
			StudentTreeSet sob=it.next();
			System.out.println("sid= "+sob.getSid()+" name= "+sob.getName()+" marks"+sob.getMarks());
		}
		TreeSet<StudentTreeSet> ob1=new TreeSet<StudentTreeSet>(new StudentNameCompare());
		StudentTreeSet tob4=new StudentTreeSet(1, "RANJAN",640);
		StudentTreeSet tob5=new StudentTreeSet(2, "RUPESH",612);
		StudentTreeSet tob6=new StudentTreeSet(3, "GOKU",600);
		ob1.add(tob4);
		ob1.add(tob5);
		ob1.add(tob6);
		
		 System.out.println("Sorting Based on the Name");
		 
		Iterator<StudentTreeSet> it1=ob1.iterator();
		while(it1.hasNext()) {
			StudentTreeSet sob1=it1.next();
			System.out.println("sid= "+sob1.getSid()+"name= "+sob1.getName()+" marks= "+sob1.getMarks());
		}
		TreeSet<StudentTreeSet> ob2=new TreeSet<StudentTreeSet>(new StudentIdCompare());
		StudentTreeSet tob7=new StudentTreeSet(1, "RANJAN",640);
		StudentTreeSet tob8=new StudentTreeSet(2, "RUPESH",612);
		StudentTreeSet tob9=new StudentTreeSet(3, "GOKU",600);
		ob2.add(tob7);
		ob2.add(tob8);
		ob2.add(tob9);
		
		System.out.println("Sorting based on the id");
		
		Iterator<StudentTreeSet> it2=ob2.iterator();
		while(it2.hasNext()) {
		StudentTreeSet sob2=it2.next();
		System.out.println("sid= "+sob2.getSid()+"name= "+sob2.getName()+" marks= "+sob2.getMarks());

	}

}
}