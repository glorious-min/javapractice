
public class VariableScopeMain {

	public static void main(String[] args) {
		VariableScope scope = new VariableScope();
		scope.firstMethod();
        scope.secondMethod(2);
        System.out.println(scope.i);// 
	}

}
