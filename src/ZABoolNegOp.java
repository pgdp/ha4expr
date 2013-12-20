public class ZABoolNegOp extends ZAUnOp<Boolean> {

	public ZABoolNegOp(ZAMathExpr<Boolean> operand) {
		super(operand);
	}

	@Override
	public Boolean fun(Boolean operand) {
		return !operand;
	}

	@Override
	public String toString() {
		return "!" + operand.toString();
	}

}
