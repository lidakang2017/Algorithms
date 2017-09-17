package algorithms.other_useful;

public class PowerOfTwo {
	public static boolean powerOfTwo(int i){
	    return (i > 0) && ((i & (i - 1)) == 0);
	}
}
