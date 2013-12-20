public class ZAConst<T> extends ZAMathExpr<T> {

	private final T value;

	public ZAConst(T value) {
		this.value = value;
	}

	@Override
	public T evaluate() {
		return value;
	}

	@Override
	public String toString() {
		return value.toString();
	}

}
