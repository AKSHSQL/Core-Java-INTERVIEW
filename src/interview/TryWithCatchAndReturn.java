package interview;

public class TryWithCatchAndReturn {

	public static void main(String[] args) {

		TryWithCatchAndReturn t = new TryWithCatchAndReturn();
		System.out.println(t.getNmberFinally());
	}

	@SuppressWarnings("finally")
	public int getNmberFinally() {

		int a = 0;

		try {
			System.out.println("try");
			// throw new Exception("try phata");
			a = 1;
			return a;

		} catch (Exception e) {
			System.out.println("catch");
			a = 2;
			return a;
		} finally {
			System.out.println("Finally");
			a = 3;
			return a;
		}
	}

}
