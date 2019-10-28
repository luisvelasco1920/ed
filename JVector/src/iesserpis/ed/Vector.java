package iesserpis.ed;

public class Vector {

	public static void main(String[] args) {
		
		//int[] v = new int[] {17, 12, 15, 9, 14};
		
//		int index = 0;
//		while (index < 5) {
//			System.out.println(index);
//			index++;
//		}

//		for (int index = 0; index <5; index++)
//			System.out.println(index);
		
		int[] v = new int[] {17, 12, 15, 9, 14};
		int x = 33;
		int index = indexOf(v, x);
		System.out.println("index=" + index);
		System.out.println("fin");

	}
	
	public static int indexOf(int[] v, int x) {
//		int index = 0;
//		while (index < v.length && v[index] != x)
//			index++;
//		if (index == v.length)
//			return -1;
//		return index;
		for (int index = 0; index < v.length; index++)
			if (v[index] == x)
				return index;
		return -1;
	}

}
