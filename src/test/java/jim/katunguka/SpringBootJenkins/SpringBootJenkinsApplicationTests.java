package jim.katunguka.SpringBootJenkins;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.TestCase.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringBootJenkinsApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(SpringBootJenkinsApplication.class);
	@Test
	public void contextLoads() {
		logger.info("testcase executing...");
		logger.info("testcase executing second log statement...");
		assertEquals(true, true);
		
	}

}
