package x;

import java.io.StringReader;

import org.codehaus.commons.compiler.CompilerFactoryFactory;
import org.codehaus.commons.compiler.IClassBodyEvaluator;
import org.codehaus.commons.compiler.ICompilerFactory;
import org.junit.Test;

public class TestTernaryExpression {
	
	@Test
	public void testTernaryExpression() throws Exception {
		final ICompilerFactory compilerFactory = CompilerFactoryFactory.getCompilerFactory("org.codehaus.janino.CompilerFactory");
		final IClassBodyEvaluator evaluator = compilerFactory.newClassBodyEvaluator();
		evaluator.setDebuggingInformation(true, true, true);
		evaluator.setClassName("Test");
		evaluator.setDefaultImports(new String [] {
				"java.util.*"
		});
		evaluator.cook(new StringReader("public void x() { List list = true ? new ArrayList() : Arrays.asList(new String [] {}); }"));
	}
	
}
