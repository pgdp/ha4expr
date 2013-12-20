public class Const<T> extends MathExpr<T> {

	private final T value;

	public Const(T value) {
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
