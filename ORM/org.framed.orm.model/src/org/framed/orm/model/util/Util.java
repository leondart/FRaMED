package org.framed.orm.model.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public final class Util {
	
	
 /**
  * Joins and Returns the string representation of multiple elements of a given {@link Iterable}
  * separating each element with the given separator.
  * 
  * @param iterable 
  * 	{@link Iterable} of arbitrary elements
  * @param delimiter
  * 	the separator between each element 
  * @return the concatenation of the strings obtained from each element of the {@link Iterable} separated with the given delimiter. 
  */
 public static final String join(final String delimiter, final Iterable<?> iterable){
	if (iterable==null) throw new IllegalArgumentException("The given iterable must not be null!");
	StringBuilder b=new StringBuilder();
	Iterator<?> i = iterable.iterator();
	if (i==null) throw new IllegalArgumentException("The iterator provided was null!");
	if (i.hasNext())
	    b.append(i.next().toString());
	while (i.hasNext()) {
		if (delimiter!=null) b.append(delimiter);
		b.append(i.next().toString());
	}
	 return b.toString(); 
 }
 
 public interface Foo<T,U>{
	 public U f(T t);
 }
 
 public static final<T,U> Iterable<U> map(Foo<T,U> f,final Iterable<T> iterable){
	 Collection<U> c=new ArrayList<U>();
	 for (T t : iterable) c.add(f.f(t));
	 return c;
 }
 
		 
}
