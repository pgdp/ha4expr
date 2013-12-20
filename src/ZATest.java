public class ZATest {

	public static void main(String[] args) {
		ZAMathExpr<Boolean> mathExpr1 = new ZAEQOp(new ZAMulOp(
				new ZAConst<Integer>(3), new ZAAddOp(new ZAConst<Integer>(1),
						new ZAConst<Integer>(2))), new ZAConst<Integer>(9));
		System.out.println(mathExpr1);
		System.out.println(mathExpr1.evaluate());

		ZAMathExpr<Integer> mathExpr2 = new ZADivOp(new ZAAddOp(
				new ZAConst<Integer>(99), new ZAConst<Integer>(1)),
				new ZAConst<Integer>(10));
		System.out.println(mathExpr2);
		System.out.println(mathExpr2.evaluate());

		ZAMathExpr<Boolean> mathExpr3 = new ZAAndOp(new ZAOrOp(
				new ZAConst<Boolean>(true), new ZAAndOp(new ZAConst<Boolean>(
						true), new ZAConst<Boolean>(false))),
				new ZAConst<Boolean>(false));
		System.out.println(mathExpr3);
		System.out.println(mathExpr3.evaluate());

		ZAMathExpr<Boolean> mathExpr4 = new ZAOrOp(new ZAGTOp(new ZAMulOp(
				new ZAConst<Integer>(9), new ZAConst<Integer>(3)),
				new ZAConst<Integer>(2)), new ZAConst<Boolean>(false));
		System.out.println(mathExpr4);
		System.out.println(mathExpr4.evaluate());

		ZAMathExpr<Integer> mathExpr5 = new ZAAddOp(new ZAConst<Integer>(-2),
				new ZAArithNegOp(new ZAConst<Integer>(25)));
		System.out.println(mathExpr5);
		System.out.println(mathExpr5.evaluate());
	}

}
