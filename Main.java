package Q1;
import java.util.Iterator;
/*
 * BY: Doron Sharaby
 * ID: 204862197
 * DATE: 15/5/2021
 *
 * A primary program that produces a Student-type collection. 
 * */
public class Main {
	public static void main(String[]args) {
		SortedGroup<Student> group = new SortedGroup<>();

		//create students
		group.add(new Student("Doron Sharaby",0000,90));
		group.add(new Student("Omer Vassal",1111,95));
		group.add(new Student("Shahar Adar",2222,98));
		group.add(new Student("Or Sofer",3333,87));
		group.add(new Student("Or Sofer",3333,87));
		group.add(new Student("Tomer Arbiter",4444,97));
		group.add(new Student("Tomer Arbiter",4444,97));
		group.add(new Student("Tomer Arbiter",4444,97));
		group.add(new Student("Ron Aharon",5555,100));
		group.add(new Student("Niv Vilenchuk",6666,60));
		group.add(new Student("Shir Armi",7777,57));
		group.add(new Student("Ben Ezra",8888,40));
		group.add(new Student("Dor Moshe",9999,50));
		group.add(new Student("Eden Baranes",2345,92));

		//print group
		System.out.println("The Students Group\n-----------------------------");
		printGroup(group);


		Student s = new Student("David levi", 1234, 60);
		group.add(s);
		System.out.println("\n The Student "+s+"\n has been added to the group! \n");
		System.out.println("The Students Group\n-----------------------------");
		printGroup(group);


		//use reduce method
		SortedGroup<Student> newGroup = (SortedGroup2.reduce(group, s));

		//print new group
		Iterator iter = newGroup.iterator();
		System.out.println("The New Students Group\n-----------------------------");
		printGroup(newGroup);

		//use remove method
		Student sd = new Student("Tomer Arbiter",4444,97);
		int removeNum= newGroup.remove(sd);
		System.out.println("\n Student "+sd+" has been removed from the group! \n");
		System.out.println("\n "+removeNum+" Students has been removed from the group! \n");
		System.out.println("Update Students Group\n-----------------------------");
		printGroup(newGroup);

	}
	public static void printGroup(SortedGroup<Student> group) {
		Iterator<Student> iter = group.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next().toString());
		}
		System.out.println("");
	}

}
