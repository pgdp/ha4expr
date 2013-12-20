public abstract class ZABinOp<I, R> extends ZAMathExpr<R> {

	protected ZAMathExpr<I> operand1, operand2;

	public ZABinOp(ZAMathExpr<I> operand1, ZAMathExpr<I> operand2) {
		this.operand1 = operand1;
		this.operand2 = operand2;
	}

	protected abstract R fun(I operand1, I operand2);

	@Override
	public R evaluate() {
		return fun(operand1.evaluate(), operand2.evaluate());
	}

}
