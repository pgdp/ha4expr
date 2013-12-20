public class ZAOrOp extends ZABinOp<Boolean, Boolean> {

	public ZAOrOp(ZAMathExpr<Boolean> operand1, ZAMathExpr<Boolean> operand2) {
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
