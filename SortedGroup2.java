package Q1;
import java.util.Iterator;
/*
 * BY: Doron Sharaby
 * ID: 204862197
 * DATE: 15/5/2021
 * 
 * 
 * 
 * A generic method called reduce that receives a sorted collection (sGroup) of the type
 * .sGroup of the same type as the x collection members defined above (as well as a single SortedGroup member
 *The method produces a new SortedGroup collection that contains all the members from the sGroup collection
 *Which are really larger than the limb x. The method will return the new collection.
 * */
public class SortedGroup2 {

	public static <T extends Comparable> SortedGroup<T> reduce(SortedGroup<T> sGroup,T t){
		Iterator iter=sGroup.iterator();
		SortedGroup<T> reducedG = new SortedGroup<T>();
		T temp;
		while(iter.hasNext()) {
			if((temp=(T)iter.next()).compareTo(t) > 0) {
				reducedG.add(temp);				
			}
		}
		return reducedG;
	}
}
