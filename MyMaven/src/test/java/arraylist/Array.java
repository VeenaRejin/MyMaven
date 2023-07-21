package arraylist;

import java.util.*;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList ar =new ArrayList ();
ArrayList a =new ArrayList ();
ar.add("Hai");
ar.add("Hello");
ar.add(true);
ar.add(false);
ar.add("OK");
System.out.println(ar);
System.out.println(ar.size());

a.add("Hello");
a.add(false);

Iterator it=ar.iterator();
while(it.hasNext());{
	System.out.println(it.next());	
}
	}

}
