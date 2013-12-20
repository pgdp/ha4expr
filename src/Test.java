public class Test {

	public static void main(String[] args) {
		MathExpr<Integer> mathExpr1 = new MulOp(new Const<Integer>(3),
				new AddOp(new Const<Integer>(1), new Const<Integer>(2)));
		System.out.println(mathExpr1);
		System.out.println(mathExpr1.evaluate());

		MathExpr<Integer> mathExpr2 = new DivOp(new SubOp(
				new Const<Integer>(99), new ArithNegOp(new Const<Integer>(1))),
				new Const<Integer>(10));
		System.out.println(mathExpr2);
		System.out.println(mathExpr2.evaluate());

		MathExpr<Boolean> mathExpr3 = new AndOp(new AndOp(new Const<Boolean>(
				false), new OrOp(new Const<Boolean>(false), new Const<Boolean>(
				true))), new Const<Boolean>(false));
		System.out.println(mathExpr3);
		System.out.println(mathExpr3.evaluate());
	}

}
