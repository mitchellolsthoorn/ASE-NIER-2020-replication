/*
 * This file was automatically generated by EvoSuite
 * Fri May 22 16:14:15 GMT 2020
 */

package org.json;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.Reader;
import java.io.SequenceInputStream;
import java.io.StringReader;
import java.util.Enumeration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSONTokener_ESTest extends JSONTokener_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener(" line ");
      Object object0 = jSONTokener0.nextValue();
      assertEquals("line", object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)1;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JSONTokener jSONTokener0 = new JSONTokener(byteArrayInputStream0);
      jSONTokener0.nextTo("99");
      assertTrue(jSONTokener0.end());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringReader stringReader0 = new StringReader(" at 0 [character 1 line 1]");
      JSONTokener jSONTokener0 = new JSONTokener(stringReader0);
      String string0 = jSONTokener0.nextTo("{\"fruit\":\"Apple\",\"size\":true,\" line \":null,\"value2\":[],\"00\":\"1\"}");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JSONTokener jSONTokener0 = new JSONTokener(byteArrayInputStream0);
      try { 
        jSONTokener0.nextValue();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Missing value at 0 [character 1 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("{\"00\":\"Apple\",\"size\":[],\" line \":null,\"value2\":[],\"00\":\"1\"}");
      try { 
        jSONTokener0.next(']');
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected ']' and instead saw '{' at 1 [character 2 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JSONTokener jSONTokener0 = new JSONTokener(byteArrayInputStream0);
      boolean boolean0 = jSONTokener0.more();
      assertEquals(0, byteArrayInputStream0.available());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int int0 = JSONTokener.dehexchar('f');
      assertEquals(15, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int int0 = JSONTokener.dehexchar('F');
      assertEquals(15, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int int0 = JSONTokener.dehexchar('A');
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)9;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JSONTokener jSONTokener0 = new JSONTokener(byteArrayInputStream0);
      jSONTokener0.nextTo('T');
      jSONTokener0.back();
      assertFalse(jSONTokener0.end());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"x\":[],\"y\":7,\"z\":true,\"a\":[],\"b\":{}}");
      JSONTokener jSONTokener0 = new JSONTokener(stringReader0);
      stringReader0.close();
      try { 
        jSONTokener0.skipTo('d');
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Stream closed
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("A/[?q9iP]");
      try { 
        jSONTokener0.nextString('');
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unterminated string at 9 [character 10 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("{\"00\":\"\r\",\"size\":[],\" line \":null,\"value2\":[],\"x\":99}");
      try { 
        jSONTokener0.nextString('9');
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unterminated string at 8 [character 0 line 2]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("{\"\":-99,\"\b\":\"Substring bounds error\",\"color\":\"\",\"value\":true,\"number\":[]}");
      String string0 = jSONTokener0.nextString('d');
      assertEquals("{\"\":-99,\"\b\":\"Substring boun", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"fruit\":-99,\"size\":\"Large\",\"color\":\"Red\",\"value\":true,\"value2\":false,\"number\":\"1\"}");
      JSONTokener jSONTokener0 = new JSONTokener(stringReader0);
      stringReader0.close();
      try { 
        jSONTokener0.more();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to preserve stream position
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("{\"00\":\"\r\",\"size\":[],\" line \":null,\"value2\":[],\"x\":99,\"~1\":-99}");
      char char0 = jSONTokener0.skipTo('9');
      assertEquals('9', char0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("A/[?q9iP]");
      String string0 = jSONTokener0.nextString('A');
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("99");
      char char0 = jSONTokener0.nextClean();
      assertEquals('9', char0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("kS-=O1KwJa;T{e");
      char char0 = jSONTokener0.nextClean();
      assertEquals('k', char0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("{\"\b\":\"a striPg\",\"\":true,\"at 0\":true,\"] could not be converted to BigInteger.\":{},\"] could not be converted to BigDecimal.\":true,\"not be converted to BigInteger.\":[]}");
      String string0 = jSONTokener0.nextTo(',');
      assertEquals("{\"\b\":\"a striPg\"", string0);
      
      char char0 = jSONTokener0.next(',');
      assertEquals(',', char0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("5Z=Sb-88wcRsUyP@8");
      char char0 = jSONTokener0.next();
      assertEquals('5', char0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int int0 = JSONTokener.dehexchar('0');
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      JSONTokener jSONTokener0 = new JSONTokener(pipedInputStream0);
      try { 
        jSONTokener0.skipTo('~');
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Pipe not connected
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-128), 102);
      JSONTokener jSONTokener0 = new JSONTokener(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        jSONTokener0.skipTo('U');
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      JSONTokener jSONTokener0 = new JSONTokener(pipedInputStream0);
      try { 
        jSONTokener0.nextTo(",:]}/\"[{;=#");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Pipe not connected
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("Unterminated string");
      // Undeclared exception!
      try { 
        jSONTokener0.nextTo((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-2544), (byte)123);
      JSONTokener jSONTokener0 = new JSONTokener(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        jSONTokener0.nextTo("");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      JSONTokener jSONTokener0 = new JSONTokener(pipedInputStream0);
      try { 
        jSONTokener0.nextTo('1');
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Pipe not connected
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(3219);
      JSONTokener jSONTokener0 = new JSONTokener(pipedInputStream0);
      try { 
        jSONTokener0.nextClean();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Pipe not connected
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Enumeration<BufferedInputStream> enumeration0 = (Enumeration<BufferedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      SequenceInputStream sequenceInputStream1 = new SequenceInputStream(sequenceInputStream0, (InputStream) null);
      JSONTokener jSONTokener0 = new JSONTokener(sequenceInputStream1);
      // Undeclared exception!
      try { 
        jSONTokener0.nextClean();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.SequenceInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("A/[?q9iP]");
      // Undeclared exception!
      try { 
        jSONTokener0.next((-1));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-2038), (byte)110);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
      JSONTokener jSONTokener0 = new JSONTokener(bufferedInputStream0);
      // Undeclared exception!
      try { 
        jSONTokener0.next(4069);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-344), 467);
      JSONTokener jSONTokener0 = new JSONTokener(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        jSONTokener0.next('r');
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      JSONTokener jSONTokener0 = new JSONTokener(pipedInputStream0);
      try { 
        jSONTokener0.more();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to read the next character from the stream
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JSONTokener jSONTokener0 = null;
      try {
        jSONTokener0 = new JSONTokener((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JSONTokener jSONTokener0 = null;
      try {
        jSONTokener0 = new JSONTokener((Reader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JSONTokener jSONTokener0 = null;
      try {
        jSONTokener0 = new JSONTokener((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("] is not a Boolean.");
      try { 
        jSONTokener0.nextValue();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Missing value at 0 [character 1 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("\"d#!@51a.E<kvfAGs");
      try { 
        jSONTokener0.nextValue();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unterminated string at 19 [character 20 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("[\"a string\"]");
      jSONTokener0.nextValue();
      assertFalse(jSONTokener0.end());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("{\"\":-99,\"\b\":\"Substring bounds error\",\"d '\":\"\",\"value\":true,\"number\":\"a string\"}");
      jSONTokener0.nextString('d');
      assertFalse(jSONTokener0.end());
      
      jSONTokener0.next(16);
      jSONTokener0.nextTo('d');
      char char0 = jSONTokener0.nextClean();
      assertTrue(jSONTokener0.end());
      assertEquals('\u0000', char0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("J,4EFW?");
      try { 
        jSONTokener0.next(73);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Substring bounds error at 7 [character 8 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("");
      assertFalse(jSONTokener0.end());
      
      jSONTokener0.next();
      assertTrue(jSONTokener0.end());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      JSONTokener jSONTokener0 = new JSONTokener(pipedInputStream0);
      try { 
        jSONTokener0.next();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Pipe not connected
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("{\"fruit\":\"Apple\",\"size\":true,\"color\":\"Red\",\" line \":null,\"value2\":false,\"number\":\"1\"}");
      jSONTokener0.nextString('o');
      assertFalse(jSONTokener0.end());
      
      jSONTokener0.back();
      char char0 = jSONTokener0.next();
      assertEquals('o', char0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("{\"fruit\":\"Apple\",\"size\":true,\"color\":\"Red\",\"value\":true,\"value2\":false,\"number\":\"1\"}");
      jSONTokener0.nextTo('V');
      boolean boolean0 = jSONTokener0.end();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("{\"\":-99,\"\b\":\"Substring bounds error\",\"d '\":\"\",\"value\":true,\"number\":\"a string\"}");
      boolean boolean0 = jSONTokener0.end();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("{\",:]}/\"[{;=#\":\"hello\",\"y\":7,\"z\":true,\"a\":[\"a string\",[]],\"b\":{}}");
      try { 
        jSONTokener0.back();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Stepping back two steps is not supported
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("{\"\":true,\"\b\":null,\"d '\":\"a string\",\"]\":true,\"r\":\"a string\"}");
      jSONTokener0.nextString('d');
      assertFalse(jSONTokener0.end());
      
      char char0 = jSONTokener0.skipTo('l');
      assertTrue(jSONTokener0.end());
      assertEquals('\u0000', char0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("{\"\":true,\"\b\":null,\"d '\":\"a string\",\"]\":true,\"r\":\"a string\"}");
      char char0 = jSONTokener0.skipTo('l');
      assertEquals('l', char0);
      assertFalse(jSONTokener0.end());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("{\"\b\":{},\"\":false,\"at 0\":true,\"] could not be conv^rted to BigInteger.\":false,\"] could not be converted to BigDecimal.\":-99,\"Unterminated string\":[]}");
      JSONObject jSONObject0 = (JSONObject)jSONTokener0.nextValue();
      assertEquals(6, jSONObject0.length());
      assertFalse(jSONTokener0.end());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("A|/[?q9i)]");
      String string0 = jSONTokener0.nextTo("A|/[?q9i)]");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)99;
      byteArray0[1] = (byte)119;
      byteArray0[2] = (byte)13;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JSONTokener jSONTokener0 = new JSONTokener(byteArrayInputStream0);
      String string0 = jSONTokener0.nextTo('^');
      assertEquals("cw", string0);
      assertFalse(jSONTokener0.end());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-32);
      byteArray0[1] = (byte)101;
      byteArray0[2] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JSONTokener jSONTokener0 = new JSONTokener(byteArrayInputStream0);
      String string0 = jSONTokener0.nextTo('0');
      assertEquals("\uFFFDe", string0);
      assertFalse(jSONTokener0.end());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-10);
      byteArray0[1] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JSONTokener jSONTokener0 = new JSONTokener(byteArrayInputStream0);
      try { 
        jSONTokener0.nextString('S');
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unterminated string at 2 [character 0 line 2]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("{\"00\":\"1\",\"Expected '\":[],\" line \":null,\"value2\":[99]}");
      jSONTokener0.nextTo(' ');
      try { 
        jSONTokener0.nextValue();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unterminated string at 54 [character 55 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("{\"\":true,\"\b\":null,\"d '\":\"a string\",\"]\":true,\"r\":\"a string\"}");
      jSONTokener0.nextString('d');
      char char0 = jSONTokener0.nextClean();
      assertFalse(jSONTokener0.end());
      assertEquals('\'', char0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("{\"\":true,\"\b\":null,\"d '\":\"a string\",\"]\":true,\"r\":\"a string\"}");
      String string0 = jSONTokener0.next(0);
      assertEquals("", string0);
      assertFalse(jSONTokener0.end());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("");
      try { 
        jSONTokener0.next('/');
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected '/' and instead saw '' at 0 [character 1 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener(" at 0 [character 1 line 1]");
      String string0 = jSONTokener0.nextTo('r');
      assertEquals("at 0 [cha", string0);
      
      char char0 = jSONTokener0.next('r');
      assertEquals('r', char0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("A/[?q9iP]");
      assertFalse(jSONTokener0.end());
      
      jSONTokener0.nextTo("");
      boolean boolean0 = jSONTokener0.more();
      assertTrue(jSONTokener0.end());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("false");
      assertFalse(jSONTokener0.end());
      
      Object object0 = jSONTokener0.nextValue();
      assertEquals(false, object0);
      
      boolean boolean0 = jSONTokener0.more();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("{\"\":true,\"\b\":null,\"d '\":\"a string\",\"]\":true,\"r\":\"a string\"}");
      boolean boolean0 = jSONTokener0.more();
      assertTrue(boolean0);
      assertFalse(jSONTokener0.end());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      String string0 = "TtF&R<Doh|/(F9\\u";
      StringReader stringReader0 = new StringReader(string0);
      JSONTokener jSONTokener0 = new JSONTokener(stringReader0);
      try { 
        jSONTokener0.nextString('^');
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Substring bounds error at 16 [character 17 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      int int0 = JSONTokener.dehexchar('a');
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      int int0 = JSONTokener.dehexchar('j');
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      int int0 = JSONTokener.dehexchar('9');
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      int int0 = JSONTokener.dehexchar('\'');
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-10);
      byteArray0[1] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JSONTokener jSONTokener0 = new JSONTokener(byteArrayInputStream0);
      Object object0 = jSONTokener0.nextValue();
      assertEquals("\uFFFD", object0);
      
      jSONTokener0.nextTo("\uFFFD");
      assertFalse(jSONTokener0.end());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)13;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JSONTokener jSONTokener0 = new JSONTokener(byteArrayInputStream0);
      String string0 = jSONTokener0.nextTo("8<k2)_p9");
      assertEquals(0, byteArrayInputStream0.available());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("true");
      jSONTokener0.nextValue();
      try { 
        jSONTokener0.back();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Stepping back two steps is not supported
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("{\"\":true,\"\b\":null,\"d '\":\"a string\",\"]\":true,\"r\":\"a string\"}");
      jSONTokener0.syntaxError((String) null);
      assertFalse(jSONTokener0.end());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("{\"\":-99,\"\b\":\"Substring bounds error\",\"color\":\"\",\"value\":true,\"Missing value\":{}}");
      MockThrowable mockThrowable0 = new MockThrowable();
      jSONTokener0.syntaxError("ine", (Throwable) mockThrowable0);
      assertFalse(jSONTokener0.end());
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("{\"\":true,\"\b\":null,\"d '\":\"a string\",\"]\":true,\"r\":\"a string\"}");
      String string0 = jSONTokener0.toString();
      assertFalse(jSONTokener0.end());
      assertEquals(" at 0 [character 1 line 1]", string0);
  }
}