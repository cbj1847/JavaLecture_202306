package ch06;

public class Ex01_Interaction {

	public static void main(String[] args) {

		int[] scores = {67, 89, 87, 92, 72};
		MyUtil myUtil = new MyUtil();				   // 객체 생성
		int min = myUtil.getMinimum(scores);		   // 인스턴스 메소드 호출
		int max = myUtil.getMaximum(scores);
		double average = MyUtil.getAverage(scores);	   // 정적 메서드 호출
		
		System.out.printf("min : %d / max : %d / avg : %.1f", min, max, average);
		
		//myUtil.privateMethod(); 						// 접근 제한자가 private이라서 외부에서 사용 불가
	}

}