package org.linphone.tester;

import junit.framework.TestSuite;

import org.junit.runner.RunWith;

@RunWith(org.junit.runners.AllTests.class)
public class QualityReportingTests {
    public static TestSuite suite() {
        TestSuite testSuites = new TestSuite();
        testSuites.setName("QualityReporting");

        LinphoneTestSuite testsList = new LinphoneTestSuite();
        testsList.run(new String[]{"tester", "--list-tests", "QualityReporting"});
        for (String testName: testsList.getList()) {
            LinphoneTest test = new LinphoneTest("QualityReporting", testName);
            testSuites.addTest(test);
        }

        return testSuites;
    }
}

