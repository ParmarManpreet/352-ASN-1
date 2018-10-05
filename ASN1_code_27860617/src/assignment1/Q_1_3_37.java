package assignment1;

import java.util.ArrayDeque;
import java.util.Queue;

public class Q_1_3_37 {
	
	 private static int nextIndex(int size, int current)
	  { return (current < size - 1) ? current + 1 : 0; }

	  public static Queue<Integer> buildQueue(int ordinal, int N)
	  {
	    // populate circle with integers
	    Integer[] circle = new Integer[N];
	    for (int i = 0; i < circle.length; i++)
	      circle[i] = i;

	    // queue that holds the order of elimination:
	    // the last one survives!
	    Queue<Integer> q = new ArrayDeque<Integer>();
	    int            i = 0;
	    int      skipped = 0;
	    int       toSkip = ordinal - 1;

	    while (q.size() < N) {
	      if (skipped < toSkip)
	        skipped++;
	      else {
	        // when N is an even multiple of ordinal,
	        // we'll hit the position of a previously
	        // eliminated element.
	        if (circle[i] == null)
	          i = nextIndex(circle.length, i);

	        q.offer(circle[i]);

	        // indicate the element has been eliminated
	        circle[i] = null;

	        // reset to find next element to eliminate
	        skipped = 0;
	      }
	      i = nextIndex(circle.length, i);
	    }
	    return q;
	  }
	  public static void main(String[] args)
	  {

	    Queue<Integer> q = buildQueue(2,7);

	    System.out.println(q);

	  }
}
