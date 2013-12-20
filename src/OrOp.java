public class OrOp extends BinOp<Boolean> {

	public OrOp(MathExpr<Boolean> operand1, MathExpr<Boolean> operand2) {
		super(operand1, operand2);
	}

	@Override
	public Boolean fun(Boolean operand1, Boolean operand2) {
		return operand1 || operand2;
	}

	@Override
	public String toString() {
		return "( " + operand1.toString() + " || " + operand2.toString() + " )";
	}

}
