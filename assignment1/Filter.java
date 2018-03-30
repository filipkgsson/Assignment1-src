package assignment1;

public interface Filter {

	boolean accept(String x);
}

public static String[] filter(String[] a, Filter f){
	String[] x = {"a","b","c"};
	return x;
}
