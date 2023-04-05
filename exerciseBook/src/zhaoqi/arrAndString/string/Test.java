package arrAndString.string;

import arrAndString.string.impl.StringOperatorImpl;

public class Test {
    public static void main(String[] args) {
        StringOperator stringOperator = new StringOperatorImpl();
        System.out.println(stringOperator.replaceSpace("We are happy."));
    }
}
