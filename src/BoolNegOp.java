public class BoolNegOp extends UnOp<Boolean> {

	public BoolNegOp(MathExpr<Boolean> operand) {
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
