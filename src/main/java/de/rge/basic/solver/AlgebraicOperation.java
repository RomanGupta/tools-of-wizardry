package de.rge.basic.solver;

public enum AlgebraicOperation {
	ADDITION(){
		@Override
		public Integer execute(Integer operand1, Integer operand2) {
			return operand1 + operand2;
		}

		@Override
		public AlgebraicOperation getCounterOperation() {
			return SUBTRACTION;
		}
	}, 
	SUBTRACTION() {
		@Override
		public Integer execute(Integer operand1, Integer operand2) {
			return operand1 - operand2;
		}

		@Override
		public AlgebraicOperation getCounterOperation() {
			return ADDITION;
		}
	}
	, 
	MULTIPLICATION(){
		@Override
		public Integer execute(Integer operand1, Integer operand2) {
			return operand1 * operand2;
		}

		@Override
		public AlgebraicOperation getCounterOperation() {
			return DIVISION;
		}
	}, 
	DIVISION(){
		@Override
		public Integer execute(Integer operand1, Integer operand2) {
			return operand1 / operand2;
		}

		@Override
		public AlgebraicOperation getCounterOperation() {
			return MULTIPLICATION;
		}
	};
	
	public Boolean isLineOperation() {
		return ADDITION.equals(this) || SUBTRACTION.equals(this);
	}
	
	public Boolean isDotOperation() {
		return MULTIPLICATION.equals(this) || DIVISION.equals(this);
	}

	public abstract Integer execute(Integer operand1, Integer operand2);

	public abstract AlgebraicOperation getCounterOperation();
}
