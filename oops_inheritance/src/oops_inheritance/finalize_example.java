package oops_inheritance;

public class finalize_example {
	    public static int count;

	    public finalize_example() {
	        count++;
	    }

	    protected void finalize() {
	        System.out.println("Program about to terminate");
	        count--;
	        System.out.println("Number of objects: " + count);
	    }

	    public static void main(String args[]) {
	        finalize_example ob1 = new finalize_example();
	        System.out.println("Number of objects: " + finalize_example.count);
	        finalize_example ob2 = new finalize_example();
	        System.out.println("Number of objects: " + finalize_example.count);

	        Runtime r = Runtime.getRuntime();
	        ob1 = null;
	        ob2 = null;
	        r.gc();
	    }

}
