//package s4.fortest;
//
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ActiveProfiles;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
///**
// * DemoBeanIntegrationTests
// *
// * @author wqc
// * @create 2017-12-18 17:30
// **/
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = {TestConfig.class})
//@ActiveProfiles("dev")
//public class DemoBeanIntegrationTest {
//    @Autowired
//    private TestBean testBean;
//
//    @Test
//    public void prodBeanShouldInject(){
//        String expected = "from production profile";
//        String actual = testBean.getContext();
//        Assert.assertEquals(expected,actual);
//    }
//}
