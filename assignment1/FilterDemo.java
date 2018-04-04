package assignment1;

public class FilterDemo implements Filter{

	public boolean accept(String x) {
		if(x.length() <= 3)
			return true;
		else
			return false;
	}
	/**
	 * Append an object at tail.
	 * 
	 * @param anObject
	 *            the object to be appended
	 * @return a new string[] containing the filtered string[]
	 */
	public static String[] filter(String[] a, Filter f) {
		String[] result = new String[a.length];
		int l = 0;
		for(int i = 0; i < a.length; i++) {
			if(f.accept(a[i])) {
				result[l] = a[i];
				l++;
			} 
		}
		String[] temp = new String[l];
		System.arraycopy(result, 0, temp, 0, l);
		result = temp;
		return result;
	}
}