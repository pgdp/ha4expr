public abstract class UnOp<T> extends MathExpr<T> {

	protected MathExpr<T> operand;

	public UnOp(MathExpr<T> operand) {
		this.operand = operand;
	}

	protected abstract T fun(T operand);

	@Override
	public T evaluate() {
		return fun(operand.evaluate());
	}

}
