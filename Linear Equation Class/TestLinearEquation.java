public class TestLinearEquation {

	public static void main(String[] args) {
		
		LinearEquation le = new LinearEquation(1, 2, 2, 4, 4, 5);
		if(le.isSolvable()) {
			System.out.println("Equation has no solution");
		} else {
			System.out.println("X = "+ le.getX());
			System.out.println("Y = "+ le.getY());
		}
		
	}

}