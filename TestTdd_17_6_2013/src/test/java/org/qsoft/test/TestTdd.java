package org.qsoft.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by IntelliJ IDEA.
 * User: haopt
 * Date: 6/17/13
 * Time: 1:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestTdd {

    private ServiceTest serviceTest = new ServiceTest();

    @Test
    public void testCreateStackAndCheckSize() {
        serviceTest.createStark();
        assertEquals(0, serviceTest.getSizeStack());
    }

    @Test
    public void testPushObjectIntoStack() {
        serviceTest.createStark();
        serviceTest.pushObject("Step 2");
        assertEquals(1, serviceTest.getSizeStack());
    }

    @Test
    public void testPushMoreObjectIntoStack() {
        serviceTest.createStarkAutoTenObject();
        assertEquals(10, serviceTest.getSizeStack());
        serviceTest.pushObject("String 11");
        assertEquals(11, serviceTest.getSizeStack());
    }

    @Test
    public void testStackNullReturnTopEqualNull() {
        serviceTest.createStark();
        assertEquals(null, serviceTest.top());
//        assertEquals(Integer.valueOf(1), serviceTest.top());
    }

    @Test
    public void testStackReturnObjectJustPush() {
        serviceTest.createStark();
        serviceTest.pushObject("String 1");
        assertEquals("String 1", serviceTest.top());
    }

    @Test
    public void testStackException() throws Exception {
        try {
            serviceTest.createStark();
            serviceTest.pop();
            fail("Exception ");
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println("Exception throw");
        }
    }
}
