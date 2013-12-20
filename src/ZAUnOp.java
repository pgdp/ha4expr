public abstract class ZAUnOp<R> extends ZAMathExpr<R> {

	protected ZAMathExpr<R> operand;

	public ZAUnOp(ZAMathExpr<R> operand) {
		this.operand = operand;
	}

	protected abstract R fun(R operand);

	@Override
	public R evaluate() {
		return fun(operand.evaluate());
	}

}
