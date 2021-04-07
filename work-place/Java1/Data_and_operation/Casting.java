
public class Casting {

	public static void main(String[] args) {
		
		double a = 1.1;
		double b = 1;	// is b's type int? or double?, �ڵ�(�Ͻ���) casting
		System.out.println(b); // b is converted from int to double.
		double b2 = (double) 1; // ����(�����) casting
		
		
//		int c = 1.1;	// �ս�(loss)�� ������ auto casting�� �Ͼ�� �ʴ´�.
		double d = 1.1;
		int e = (int) 1.1;
		System.out.println(e);
		
		// 1 to String
		String f = Integer.toString(1);
		System.out.println(f.getClass()); // class java.lang.String
		
		// 1.1 to String
		String g = Double.toString(1.1);
		System.out.println(g.getClass()); // class java.lang.String
		
		// 1/2
		double half = 1/2;
		System.out.println(half); // 0.0, because of 1/2 = 0.5 = 0, 1(int) / 2(int) = 0 (int) 
		double half_2 = (double) 1/2;	// casting
		System.out.println(half_2); // 0.5
	}

}
