package springcourse.solutions.exercise8.dao.impl;

import org.junit.Before;
import springcourse.solutions.exercise8.dao.api.IMemberDaoBlackBoxTest;

/**
 * @author amira
 * @since 4/17/2014
 */
public class MemberInMemoryDaoBlackBoxTest extends IMemberDaoBlackBoxTest {

    @Before
    public void setUp2() throws Exception {
        uut = new MemberInMemoryDao();
    }
}
