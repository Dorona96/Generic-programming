package Q1;
import java.util.ArrayList;
import java.util.Iterator;
/*
 * BY: Doron Sharaby
 * ID: 204862197
 * DATE: 15/5/2021
 * 
 * 
 * A generic class used to define a collection of sorted organs in ascending order of type.
 * */
public class SortedGroup <T extends Comparable> {
	private ArrayList<T> data;

	public SortedGroup() {
		data = new ArrayList<T>();
	}
	/*
	 * 
	 * add gets an organ and adds it to the collection in its proper place so that the sort is saved. There may be a situation
	 *That the collection will include double organs.
	 * */
	public void add(T t) {
		Iterator<T> iter= this.iterator();
		int count = 0;

		while(iter.hasNext() && t.compareTo(iter.next())>0) {
			count++;
		}
		data.add(count,t);
	}

	/*
	 * remove receives an organ and removes from the collection all equal organs (according to equals) to the organ
	 *The donkey. The method will return a number indicating how many organs have been removed.
	 * */
	public int remove(T t){
		int count=0;
		Iterator<T> iter=this.iterator();
		T temp= null;


		while (iter.hasNext()){
			temp=iter.next();

			if (temp.equals(t)){
				iter.remove();
				count++;
			}
		}

		return count;
	}
/*
 * iterator returns an iterator of the generic type.
 * */
	public Iterator<T> iterator(){
		return data.iterator();
	}


}
