package algorithms.other_useful;

public class 判断一个数是否是2的N次方 {
	public static boolean powerOfTwo(int i){
	    return (i > 0) && ((i & (i - 1)) == 0);
	}
}
