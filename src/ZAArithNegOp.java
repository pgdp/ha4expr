public class ZAArithNegOp extends ZAUnOp<Integer> {

	public ZAArithNegOp(ZAMathExpr<Integer> operand) {
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
