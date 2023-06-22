package Ch05;

import java.util.Arrays;

public class Ex04_ArrayCopy {

	public static void main(String[] args) {
		int src[] = {1, 3, 4, 8};
		int[] dst = src;
		
		System.out.println(Arrays.toString(dst));
		dst[3] = 99;
		System.out.println(Arrays.toString(src));		// 같은 주소지를 참조하고 있기때문에 src값도 변경됨
		
		// 배열을 copy하려면 새로운 객체에 복사본을 담아 그 객체에 대해 수정해야 원본에 영향 X
		int[] realDst = new int[4];
		for (int i=0; i<src.length; i++)
			realDst[i] = src[i];
		System.out.println(Arrays.toString(realDst));
		
		realDst[0] = 11;
		System.out.println(Arrays.toString(src));
		
		int[] newSrc = {3, 4, 7, 9};
		int[] newDst = new int[4];
		System.arraycopy(newSrc, 0, newDst, 0, newSrc.length);
		System.out.println(Arrays.toString(newDst));
		newDst[newDst.length-1] = 88;
		System.out.println(Arrays.toString(newSrc));
		
		// 다차원 배열의 복사는 위의 방법으로는 불가 -> 각 행마다 array.clone()메서드 적용하여 복사
		
	}
		

}
