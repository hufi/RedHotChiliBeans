package com.team6.project.entities.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.BeforeClass;
import org.junit.Test;

import com.team6.project.entities.EventCause;

public class EventCauseTest {

    private static EventCause ec1;
    private static EventCause ec2;
    private static EventCause ec3;
    private static EventCause ec4;
    private static EventCause ec5;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ec1 = new EventCause(1, null, "description");
        ec2 = new EventCause(null, 2, "description");
        ec3 = new EventCause(1, 2, "description");
        ec4 = new EventCause(1, 2, null);
        ec5 = new EventCause(1, null, "description");
    }

    @Test
    public void hasRequiredFieldsTest_NoCauseCode() {
        assertFalse(ec1.hasRequiredFields());
    }
    @Test
    public void hasRequiredFieldsTest_NoEventId() {
        assertFalse(ec2.hasRequiredFields());
    }
    
    @Test
    public void hasRequiredFieldsTest() {
        assertTrue(ec3.hasRequiredFields());
    }
    
    @Test
    public void hasRequiredFieldsTest_NoDescription() {
        assertTrue(ec4.hasRequiredFields());
    }
    
    @Test
    public void hasRequiredFieldsTest_NoBoth() {
        assertFalse(ec5.hasRequiredFields());
    }

}
