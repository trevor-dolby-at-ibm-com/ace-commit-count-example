package test;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import com.ibm.integration.test.v1.NodeSpy;
import com.ibm.integration.test.v1.SpyObjectReference;
import com.ibm.integration.test.v1.TestMessageAssembly;
import com.ibm.integration.test.v1.TestSetup;
import com.ibm.integration.test.v1.exception.TestException;

import static com.ibm.integration.test.v1.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class CommitCountApp_PutMessageFlow_CheckDatabase_0001_Test {

	/*
	 * CommitCountApp_PutMessageFlow_CheckDatabase_0001_Test
	 * Test generated by IBM App Connect Enterprise Toolkit 13.0.2.0 on Feb 6, 2025, 9:04:04 AM
	 */

	@AfterEach
	public void cleanupTest() throws TestException {
		// Ensure any mocks created by a test are cleared after the test runs 
		TestSetup.restoreAllMocks();
	}

	@Test
	public void CommitCountApp_PutMessageFlow_CheckDatabase_TestCase_001() throws TestException {

		// Define the SpyObjectReference
		SpyObjectReference nodeReference = new SpyObjectReference().application("CommitCountApp")
				.messageFlow("PutMessageFlow").node("RepeatedPropagate");

		// Initialise a NodeSpy
		NodeSpy nodeSpy = new NodeSpy(nodeReference);

		TestMessageAssembly blankMessage = new TestMessageAssembly();

		nodeSpy.evaluate(blankMessage, false);
	}

}
