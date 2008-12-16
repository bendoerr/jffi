/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kenai.jffi;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wayne
 */
public class CallContextTest {

    public CallContextTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test public void VrV() {
        long handle = Foreign.getForeign().newCallContext(NativeType.VOID.value(),
                new int[] { NativeType.VOID.value() }, 0);
        assertNotSame("Foreign#newCallContext failed", 0L, handle);
        CallContext ctx = new CallContext(NativeType.VOID, new NativeType[] { NativeType.VOID });
    }
    @Test public void VrI() {
        long handle = Foreign.getForeign().newCallContext(NativeType.INT.value(),
                new int[] { NativeType.VOID.value() }, 0);
        assertNotSame("Foreign#newCallContext failed", 0L, handle);
    }
    @Test public void IrI() {
        long handle = Foreign.getForeign().newCallContext(NativeType.INT.value(),
                new int[] { NativeType.INT.value() }, 0);
        assertNotSame("Foreign#newCallContext failed", 0L, handle);
    }
}