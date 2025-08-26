package ApnaCollage;

import java.util.HashSet;

public class ContainsDuplicate {
	
	public static boolean hasDuplicate(int []nums) {
		HashSet<Integer>set=new HashSet<>();
		for(int num:nums) {
			if(set.contains(num)) {
				return true;
			}
			set.add(num);
		}
		return false;
	
	}
	public static void main(String[] args) {
		int[]arr= {1,22,3,4,5,22};
		if(hasDuplicate(arr)) {
			System.out.println("Array contains duplicate elements");
		}
		else {
			System.out.println("Array does not contsins duplicate elements");
		}
		
	}

}
