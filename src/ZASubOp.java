public class ZASubOp extends ZABinOp<Integer, Integer> {

	public ZASubOp(ZAMathExpr<Integer> operand1, ZAMathExpr<Integer> operand2) {
		super(operand1, operand2);
	}

	@Override
	public Integer fun(Integer operand1, Integer operand2) {
		return operand1 - operand2;
	}

	@Override
	public String toString() {
		return "( " + operand1.toString() + " - " + operand2.toString() + " )";
	}

}
