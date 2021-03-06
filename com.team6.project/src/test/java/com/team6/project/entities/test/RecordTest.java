package com.team6.project.entities.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.math.BigInteger;
import java.util.Date;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.team6.project.entities.Record;

public class RecordTest {
    private static Record rec1;
    private static Record rec2;
 
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        setFirstRecord();
    }
    
    
    @Before
    public void setUpBefore() throws Exception {
        setRecord();
    }

    @Test
    public void getKeyTest_True() {
        assertEquals(new Integer(rec1.getKey()), new Integer(1));
    }
    
    @Test
    public void getKeyTest_False() {
        assertNotEquals(new Integer(rec1.getKey()), new Integer(4));
    }
    @Test
    public void toStringTest(){
        assertEquals(rec1.toString(), "Id : 1 Date : "+rec1.getDate().getTime()+" Cause Code : 100 Event Id : 200 Failure Type : 10 User Equipment : 12345678 MCC : 123 MNC : 321 Cell Id : 4 Duration : 1000 NetworkElement Version : 12g Imsi : 1234567890 Hier3Id : 1234567890 Hier32Id : 1234567890 Hier321Id : 1234567890 Description : ");
    }

    @Test
    public void equalsTrueTest() {
        assertTrue(rec2.equals(rec1));
    }
    
    @Test
    public void equalsTrueTest2() {
        assertTrue(rec2.equals(rec2));
    }
    @Test
    public void equalsFalseTest_EventId() {
        rec2.setEventId(0);
        assertFalse(rec1.equals(rec2));
    }
    @Test
    public void equalsFalseTest_EventIdNull() {
        rec2.setEventId(null);
        assertFalse(rec2.equals(rec1));
    }
    @Test
    public void equalsFalseTest_CauseCodeNull() {
        rec2.setCauseCode(null);
        assertFalse(rec2.equals(rec1));
    }
    @Test
    public void equalsFalseTest_CauseCode() {
        rec2.setCauseCode(0);
        assertFalse(rec1.equals(rec2));
    }
    
    @Test
    public void equalsFalseTest_CellID() {
        rec2.setCellId(0);
        assertFalse(rec2.equals(rec1));
    }
    @Test
    public void equalsFalseTest_CellIDNull() {
        rec2.setCellId(null);
        assertFalse(rec2.equals(rec1));
    }
    
    @Test
    public void equalsFalseTest_Date() {
    	sleep(100);
        rec2.setDate(new Date());
        assertFalse(rec1.equals(rec2));
    }
    
    
    @Test
    public void equalsFalseTest_Duration() {
        rec2.setDuration(10);
        assertFalse(rec2.equals(rec1));
    }
    @Test
    public void equalsFalseTest_DurationNull() {
        rec2.setDuration(null);
        assertFalse(rec2.equals(rec1));
    }
    
    @Test
    public void equalsFalseTest_FailureType() {
        rec2.setFailureType(0);
        assertFalse(rec1.equals(rec2));
    }
    @Test
    public void equalsFalseTest_FailureTypeNull() {
        rec2.setFailureType(null);
        assertFalse(rec2.equals(rec1));
    }
    
    @Test
    public void equalsFalseTest_Hier321Id() {
        rec2.setHier321Id(new BigInteger("0987654321"));
        assertFalse(rec1.equals(rec2));
    }
    @Test
    public void equalsFalseTest_Hier321IdNull() {
        rec2.setHier321Id(null);
        assertFalse(rec2.equals(rec1));
    }
    
    @Test
    public void equalsFalseTest_Hier32Id() {
        rec2.setHier32Id(new BigInteger("0987654321"));
        assertFalse(rec1.equals(rec2));
    }
    @Test
    public void equalsFalseTest_Hier32IdNull() {
        rec2.setHier32Id(null);
        assertFalse(rec2.equals(rec1));
    }
    
    @Test
    public void equalsFalseTest_Hier3Id() {
        rec2.setHier3Id(new BigInteger("0987654321"));
        assertFalse(rec1.equals(rec2));
    }
    @Test
    public void equalsFalseTest_Hier3IdNull() {
        rec2.setHier3Id(null);
        assertFalse(rec2.equals(rec1));
    }
    
    @Test
    public void equalsFalseTest_Imsi() {
        rec2.setImsi(new BigInteger("0987654321"));
        assertFalse(rec1.equals(rec2));
    }
    @Test
    public void equalsFalseTest_ImsiNull() {
        rec2.setImsi(null);
        assertFalse(rec2.equals(rec1));
    }
    
    @Test
    public void equalsFalseTest_Mcc() {
        rec2.setMcc(1);
        assertFalse(rec1.equals(rec2));
    }
    @Test
    public void equalsFalseTest_MccNull() {
        rec2.setMcc(null);
        assertFalse(rec2.equals(rec1));
    }
    
    @Test
    public void equalsFalseTest_Mnc() {
        rec2.setMnc(1);
        assertFalse(rec1.equals(rec2));
    }
    @Test
    public void equalsFalseTest_MncNull() {
        rec2.setMnc(null);
        assertFalse(rec2.equals(rec1));
    }
    
    @Test
    public void equalsFalseTest_UserEquipment() {
        rec2.setUserEquipment(1);
        assertFalse(rec1.equals(rec2));
    }
    @Test
    public void equalsFalseTest_UserEquipmentNull() {
        rec2.setUserEquipment(null);
        assertFalse(rec2.equals(rec1));
    }

    @Test
    public void equalsFalseTest_NeV() {
        rec2.setNeVersion("1");
        assertFalse(rec1.equals(rec2));
    }
    @Test
    public void equalsFalseTest_NeVNull() {
        rec2.setNeVersion(null);
        assertFalse(rec2.equals(rec1));
    }
    
    @Test
    public void hashCode_Same() {
        assertEquals(rec2.hashCode(), rec1.hashCode());
    }
    
    @Test
    public void hashCode_NotSame() {
        rec1.setCauseCode(100);
        assertNotEquals(rec1.hashCode(), rec2.hashCode());
    }
   
   private static void setFirstRecord(){
       rec1 = new Record();
       rec1.setId(1);
       rec1.setDate(new Date());
       rec1.setCauseCode(3);
       rec1.setCellId(4);
       rec1.setDescription("");
       rec1.setDuration(1000);
       rec1.setEventId(200);
       rec1.setFailureType(10);
       rec1.setHier321Id(new BigInteger("1234567890"));
       rec1.setHier32Id(new BigInteger("1234567890"));
       rec1.setHier3Id(new BigInteger("1234567890"));
       rec1.setImsi(new BigInteger("1234567890"));
       rec1.setMcc(123);
       rec1.setMnc(321);
       rec1.setNeVersion("12g");
       rec1.setUserEquipment(12345678);
   }
    
   private void setRecord(){
        rec2 = new Record();
        rec2.setDate(rec1.getDate());
        rec2.setCauseCode(rec1.getCauseCode());
        rec2.setCellId(rec1.getCellId());
        rec2.setDescription("");
        rec2.setDuration(rec1.getDuration());
        rec2.setEventId(rec1.getEventId());
        rec2.setFailureType(rec1.getFailureType());
        rec2.setHier321Id(rec1.getHier321Id());
        rec2.setHier32Id(rec1.getHier32Id());
        rec2.setHier3Id(rec1.getHier3Id());
        rec2.setImsi(rec1.getImsi());
        rec2.setMcc(rec1.getMcc());
        rec2.setMnc(rec1.getMnc());
        rec2.setNeVersion(rec1.getNeVersion());
        rec2.setUserEquipment(rec1.getUserEquipment());
    }
   
   private void sleep(long ms){
   	try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   }
}
