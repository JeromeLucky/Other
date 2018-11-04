package homework.common.dbutil;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.Test;

public class DButilTest {

	@Test
	public void test() {
			Connection connection=DButil.getConnection();
			org.junit.Assert.assertNotNull(connection);
	}

}
