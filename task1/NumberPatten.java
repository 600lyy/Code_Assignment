package task1;

public class NumberPatten {
	
	public static void main(String [ ] args) {
		UnitTest.runTestItems();
	}
	
	public static int getValue(int n) {
		if (0 == n || 1 == n) {
			return n;
		}
		else {
			return (getValue(n-1) + getValue(n-2));
		}
	}
}

class UnitTest {
	
	public static void runTestItems() {
		UnitTest.Test_01();
		UnitTest.Test_02();
		UnitTest.Test_03();
		UnitTest.Test_04();
		
	}
	private static void Test_01() {
		int n = NumberPatten.getValue(0);
		if (0 == n) {
			System.out.println("Passed---Test_01");
		}
		else {
			System.out.println("Failed!!! Test_01");
		}
	}
	
	private static void Test_02() {
		int n = NumberPatten.getValue(1);
		if (1 == n) {
			System.out.println("Passed---Test_02");
		}
		else {
			System.out.println("Failed!!! Test_02");
		}
	}
	
	private static void Test_03() {
		int n = NumberPatten.getValue(6);
		if (8 == n) {
			System.out.println("Passed---Test_03");
		}
		else {
			System.out.println("Failed!!! Test_03");
		}
	}
	
	private static void Test_04() {
		int n = NumberPatten.getValue(8);
		if (21 == n) {
			System.out.println("Passed---Test_04");
		}
		else {
			System.out.println("Failed!!! Test_04");
		}
	}
}

