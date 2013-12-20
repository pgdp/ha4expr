public abstract class BinOp<T> extends MathExpr<T> {

	protected MathExpr<T> operand1;
	protected MathExpr<T> operand2;

	public BinOp(MathExpr<T> operand1, MathExpr<T> operand2) {
		this.operand1 = operand1;
		this.operand2 = operand2;
	}

	protected abstract T fun(T operand1, T operand2);

	@Override
	public T evaluate() {
		return fun(operand1.evaluate(), operand2.evaluate());
	}

}
