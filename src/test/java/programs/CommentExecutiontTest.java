package programs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CommentExecutiontTest {

	@Test
	public void IsCommentedLineExecuted() {
		CommentExecution ce = new CommentExecution();
		String ExpResult = "Java comment is executed!!";
		String ActResult = ce.CommentExecution();
		assertEquals(ExpResult, ActResult);
	}

}
