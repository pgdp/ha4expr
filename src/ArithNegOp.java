public class ArithNegOp extends UnOp<Integer> {

	public ArithNegOp(MathExpr<Integer> operand) {
		super(operand);
	}

	@Override
	public Integer fun(Integer operand) {
		return -operand;
	}

	@Override
	public String toString() {
		return "( -" + operand.toString() + " )";
	}

}
