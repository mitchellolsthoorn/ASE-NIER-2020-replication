/*
 * This file was automatically generated by EvoSuite
 * Fri May 22 18:52:40 GMT 2020
 */

package com.alibaba.fastjson;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.JSONValidator;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.Reader;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSONValidator_ESTest extends JSONValidator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JSONValidator.UTF8InputStreamValidator jSONValidator_UTF8InputStreamValidator0 = new JSONValidator.UTF8InputStreamValidator(byteArrayInputStream0);
      jSONValidator_UTF8InputStreamValidator0.pos = (-774);
      // Undeclared exception!
      try { 
        jSONValidator_UTF8InputStreamValidator0.error();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error, readCount 1, valueCount : 0, pos -774
         //
         verifyException("com.alibaba.fastjson.JSONValidator$UTF8InputStreamValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[2] = (byte)92;
      byteArray0[3] = (byte)125;
      JSONValidator.UTF8Validator jSONValidator_UTF8Validator0 = (JSONValidator.UTF8Validator)JSONValidator.fromUtf8(byteArray0);
      // Undeclared exception!
      jSONValidator_UTF8Validator0.fieldName();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"\"Vnull}");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = new JSONValidator.ReaderValidator(stringReader0);
      // Undeclared exception!
      try { 
        jSONValidator_ReaderValidator0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error, readCount 1, valueCount : 0, pos 3
         //
         verifyException("com.alibaba.fastjson.JSONValidator$ReaderValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"com.alibaba.fastjson.JSONException\":[-99],\"\":true");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = new JSONValidator.ReaderValidator(stringReader0);
      jSONValidator_ReaderValidator0.pos = (-1);
      // Undeclared exception!
      try { 
        jSONValidator_ReaderValidator0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error, readCount 1, valueCount : 0, pos 0
         //
         verifyException("com.alibaba.fastjson.JSONValidator$ReaderValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      JSONValidator.UTF8Validator jSONValidator_UTF8Validator0 = new JSONValidator.UTF8Validator(byteArray0);
      jSONValidator_UTF8Validator0.next();
      assertNull(jSONValidator_UTF8Validator0.getType());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("true");
      jSONValidator_UTF16Validator0.next();
      assertNull(jSONValidator_UTF16Validator0.getType());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringReader stringReader0 = new StringReader(", valueCount : ");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = new JSONValidator.ReaderValidator(stringReader0);
      jSONValidator_ReaderValidator0.next();
      assertNull(jSONValidator_ReaderValidator0.getType());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      boolean boolean0 = JSONValidator.isWhiteSpace('A');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"error, readCount \":-99,\"com.alibaba.fastjson.JSONException\":true,\"\":\"a string\"}");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = new JSONValidator.ReaderValidator(stringReader0);
      jSONValidator_ReaderValidator0.pos = (-1071);
      // Undeclared exception!
      try { 
        jSONValidator_ReaderValidator0.validate();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        JSONValidator.fromUtf8((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      // Undeclared exception!
      try { 
        JSONValidator.fromUtf8((InputStream) pipedInputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // read error
         //
         verifyException("com.alibaba.fastjson.JSONValidator$UTF8InputStreamValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        JSONValidator.fromUtf8((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-3508), (byte)10);
      // Undeclared exception!
      try { 
        JSONValidator.fromUtf8((InputStream) byteArrayInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        JSONValidator.from((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringReader stringReader0 = new StringReader("com.alibaba.fastjson.JSONException");
      stringReader0.close();
      // Undeclared exception!
      try { 
        JSONValidator.from((Reader) stringReader0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // read error
         //
         verifyException("com.alibaba.fastjson.JSONValidator$ReaderValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        JSONValidator.from((Reader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)1, (byte)1);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0, (byte)1);
      JSONValidator.UTF8InputStreamValidator jSONValidator_UTF8InputStreamValidator0 = new JSONValidator.UTF8InputStreamValidator(bufferedInputStream0);
      jSONValidator_UTF8InputStreamValidator0.close();
      // Undeclared exception!
      try { 
        jSONValidator_UTF8InputStreamValidator0.fieldName();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // read error
         //
         verifyException("com.alibaba.fastjson.JSONValidator$UTF8InputStreamValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)34;
      JSONValidator.UTF8Validator jSONValidator_UTF8Validator0 = (JSONValidator.UTF8Validator)JSONValidator.fromUtf8(byteArray0);
      // Undeclared exception!
      jSONValidator_UTF8Validator0.any();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JSONValidator.UTF8InputStreamValidator jSONValidator_UTF8InputStreamValidator0 = new JSONValidator.UTF8InputStreamValidator(byteArrayInputStream0);
      jSONValidator_UTF8InputStreamValidator0.next();
      jSONValidator_UTF8InputStreamValidator0.next();
      assertEquals(0, byteArrayInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"color\":\"Red\",\"size\":\"com.alibaba.fastjson.JSONException\",\"number\":\"Value\",\"value\":true,\"fruit\":null,\"x\":{},\"xx\":false}");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = new JSONValidator.ReaderValidator(stringReader0);
      jSONValidator_ReaderValidator0.validate();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      JSONValidator.UTF8InputStreamValidator jSONValidator_UTF8InputStreamValidator0 = null;
      try {
        jSONValidator_UTF8InputStreamValidator0 = new JSONValidator.UTF8InputStreamValidator(pipedInputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // read error
         //
         verifyException("com.alibaba.fastjson.JSONValidator$UTF8InputStreamValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[2] = (byte)92;
      JSONValidator.UTF8Validator jSONValidator_UTF8Validator0 = (JSONValidator.UTF8Validator)JSONValidator.fromUtf8(byteArray0);
      // Undeclared exception!
      jSONValidator_UTF8Validator0.fieldName();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{}");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = new JSONValidator.ReaderValidator(stringReader0);
      boolean boolean0 = jSONValidator_ReaderValidator0.validate();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringReader stringReader0 = new StringReader("0Zv^m6z>A\"JR_gqloX");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = new JSONValidator.ReaderValidator(stringReader0);
      // Undeclared exception!
      try { 
        jSONValidator_ReaderValidator0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error, readCount 1, valueCount : 1, pos 1
         //
         verifyException("com.alibaba.fastjson.JSONValidator$ReaderValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringReader stringReader0 = new StringReader("-99");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = new JSONValidator.ReaderValidator(stringReader0);
      boolean boolean0 = jSONValidator_ReaderValidator0.validate();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringReader stringReader0 = new StringReader("4:#E\"m");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = new JSONValidator.ReaderValidator(stringReader0);
      // Undeclared exception!
      try { 
        jSONValidator_ReaderValidator0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error, readCount 1, valueCount : 1, pos 1
         //
         verifyException("com.alibaba.fastjson.JSONValidator$ReaderValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"fruit\":\"Apple\",\"size\":\"Large\",\"color\":\"Red\",\"value\":true,\"value2\":false,\"number\":\"1\",\"x\":99}");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = (JSONValidator.ReaderValidator)JSONValidator.from((Reader) stringReader0);
      jSONValidator_ReaderValidator0.any();
      JSONValidator.Type jSONValidator_Type0 = jSONValidator_ReaderValidator0.getType();
      assertEquals(JSONValidator.Type.Object, jSONValidator_Type0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringReader stringReader0 = new StringReader("1Zn2a\"K/&");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = new JSONValidator.ReaderValidator(stringReader0);
      // Undeclared exception!
      try { 
        jSONValidator_ReaderValidator0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error, readCount 1, valueCount : 1, pos 1
         //
         verifyException("com.alibaba.fastjson.JSONValidator$ReaderValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      JSONValidator.UTF8Validator jSONValidator_UTF8Validator0 = new JSONValidator.UTF8Validator(byteArray0);
      jSONValidator_UTF8Validator0.skipWhiteSpace();
      assertNull(jSONValidator_UTF8Validator0.getType());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JSONValidator.UTF8InputStreamValidator jSONValidator_UTF8InputStreamValidator0 = new JSONValidator.UTF8InputStreamValidator(byteArrayInputStream0);
      jSONValidator_UTF8InputStreamValidator0.next();
      jSONValidator_UTF8InputStreamValidator0.next();
      assertEquals(0, byteArrayInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)8;
      JSONValidator.UTF8Validator jSONValidator_UTF8Validator0 = (JSONValidator.UTF8Validator)JSONValidator.fromUtf8(byteArray0);
      // Undeclared exception!
      try { 
        jSONValidator_UTF8Validator0.error();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error : 1
         //
         verifyException("com.alibaba.fastjson.JSONValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)10;
      JSONValidator jSONValidator0 = JSONValidator.fromUtf8(byteArray0);
      assertNull(jSONValidator0.getType());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)12;
      byteArray0[1] = (byte)13;
      JSONValidator jSONValidator0 = JSONValidator.fromUtf8(byteArray0);
      assertNull(jSONValidator0.getType());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)9;
      JSONValidator jSONValidator0 = JSONValidator.fromUtf8(byteArray0);
      assertNull(jSONValidator0.getType());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StringReader stringReader0 = new StringReader(" nH<G%I");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = new JSONValidator.ReaderValidator(stringReader0);
      assertNull(jSONValidator_ReaderValidator0.getType());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String string0 = "#d07$w)\\u";
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = (JSONValidator.UTF16Validator)JSONValidator.from(string0);
      // Undeclared exception!
      jSONValidator_UTF16Validator0.fieldName();
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"com.alibaba.fastjson.JSONException\":[-99],\":true}");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = new JSONValidator.ReaderValidator(stringReader0);
      // Undeclared exception!
      jSONValidator_ReaderValidator0.validate();
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StringReader stringReader0 = new StringReader("false");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = new JSONValidator.ReaderValidator(stringReader0);
      boolean boolean0 = jSONValidator_ReaderValidator0.validate();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StringReader stringReader0 = new StringReader("falr$pse");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = new JSONValidator.ReaderValidator(stringReader0);
      // Undeclared exception!
      try { 
        jSONValidator_ReaderValidator0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error, readCount 1, valueCount : 0, pos 3
         //
         verifyException("com.alibaba.fastjson.JSONValidator$ReaderValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"com.alibaba.fastjson.JSONException\":[-99],\"\":true");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = new JSONValidator.ReaderValidator(stringReader0);
      jSONValidator_ReaderValidator0.eof = true;
      // Undeclared exception!
      try { 
        jSONValidator_ReaderValidator0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error, readCount 1, valueCount : 0, pos 50
         //
         verifyException("com.alibaba.fastjson.JSONValidator$ReaderValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"\":false,\"\":null,\"x\":true}");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = new JSONValidator.ReaderValidator(stringReader0);
      boolean boolean0 = jSONValidator_ReaderValidator0.validate();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"error, readCount \":-1.0,\"com.alibaba.fastjson.JSONException\":[[false,false],true],\"\":\"a string\"}");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = new JSONValidator.ReaderValidator(stringReader0);
      boolean boolean0 = jSONValidator_ReaderValidator0.validate();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      StringReader stringReader0 = new StringReader("true");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = new JSONValidator.ReaderValidator(stringReader0);
      jSONValidator_ReaderValidator0.pos = 125;
      // Undeclared exception!
      try { 
        jSONValidator_ReaderValidator0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error, readCount 2, valueCount : 0, pos 0
         //
         verifyException("com.alibaba.fastjson.JSONValidator$ReaderValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"\":0.,\"\":99}");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = new JSONValidator.ReaderValidator(stringReader0);
      // Undeclared exception!
      try { 
        jSONValidator_ReaderValidator0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error, readCount 1, valueCount : 0, pos 6
         //
         verifyException("com.alibaba.fastjson.JSONValidator$ReaderValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"number\":{},\":true,\"\":null,\"x\":true}");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = new JSONValidator.ReaderValidator(stringReader0);
      // Undeclared exception!
      try { 
        jSONValidator_ReaderValidator0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error, readCount 1, valueCount : 0, pos 22
         //
         verifyException("com.alibaba.fastjson.JSONValidator$ReaderValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      StringReader stringReader0 = new StringReader("822LZz*0Z");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = new JSONValidator.ReaderValidator(stringReader0);
      // Undeclared exception!
      try { 
        jSONValidator_ReaderValidator0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error, readCount 1, valueCount : 1, pos 3
         //
         verifyException("com.alibaba.fastjson.JSONValidator$ReaderValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      StringReader stringReader0 = new StringReader("74nX0r");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = new JSONValidator.ReaderValidator(stringReader0);
      // Undeclared exception!
      try { 
        jSONValidator_ReaderValidator0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error, readCount 1, valueCount : 1, pos 3
         //
         verifyException("com.alibaba.fastjson.JSONValidator$ReaderValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      StringReader stringReader0 = new StringReader("5c^9G9L<y9/`k");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = new JSONValidator.ReaderValidator(stringReader0);
      // Undeclared exception!
      try { 
        jSONValidator_ReaderValidator0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error, readCount 1, valueCount : 1, pos 1
         //
         verifyException("com.alibaba.fastjson.JSONValidator$ReaderValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[4fLlI'X%");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = new JSONValidator.ReaderValidator(stringReader0);
      // Undeclared exception!
      try { 
        jSONValidator_ReaderValidator0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error, readCount 1, valueCount : 0, pos 2
         //
         verifyException("com.alibaba.fastjson.JSONValidator$ReaderValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      StringReader stringReader0 = new StringReader("3f&ne'<`n{E6S");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = new JSONValidator.ReaderValidator(stringReader0);
      // Undeclared exception!
      try { 
        jSONValidator_ReaderValidator0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error, readCount 1, valueCount : 1, pos 2
         //
         verifyException("com.alibaba.fastjson.JSONValidator$ReaderValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      StringReader stringReader0 = new StringReader("22LZz*0Z");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = new JSONValidator.ReaderValidator(stringReader0);
      // Undeclared exception!
      try { 
        jSONValidator_ReaderValidator0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error, readCount 1, valueCount : 1, pos 2
         //
         verifyException("com.alibaba.fastjson.JSONValidator$ReaderValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"\":0.0}");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = new JSONValidator.ReaderValidator(stringReader0);
      boolean boolean0 = jSONValidator_ReaderValidator0.validate();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      StringReader stringReader0 = new StringReader("6+`_i1PO<Qp:");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = new JSONValidator.ReaderValidator(stringReader0);
      // Undeclared exception!
      try { 
        jSONValidator_ReaderValidator0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error, readCount 1, valueCount : 1, pos 2
         //
         verifyException("com.alibaba.fastjson.JSONValidator$ReaderValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"\":false,\"\":false}");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = new JSONValidator.ReaderValidator(stringReader0);
      jSONValidator_ReaderValidator0.fieldName();
      // Undeclared exception!
      jSONValidator_ReaderValidator0.validate();
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"error, readCount \":-1.0,\"com.alibaba.fastjson.JSONException\":[[],null],\"\":{}}");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = new JSONValidator.ReaderValidator(stringReader0);
      boolean boolean0 = jSONValidator_ReaderValidator0.validate();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"\":true,\"value\":true,\"\":null}");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = new JSONValidator.ReaderValidator(stringReader0);
      jSONValidator_ReaderValidator0.supportMultiValue = false;
      jSONValidator_ReaderValidator0.validate();
      assertEquals(JSONValidator.Type.Object, jSONValidator_ReaderValidator0.getType());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      StringReader stringReader0 = new StringReader("3f&ne'<`n{E6S");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = new JSONValidator.ReaderValidator(stringReader0);
      jSONValidator_ReaderValidator0.close();
      assertNull(jSONValidator_ReaderValidator0.getType());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"com.alibaba.fastjson.JSONException\":[-99],\"\":true");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = new JSONValidator.ReaderValidator(stringReader0);
      // Undeclared exception!
      try { 
        jSONValidator_ReaderValidator0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error, readCount 2, valueCount : 0, pos 0
         //
         verifyException("com.alibaba.fastjson.JSONValidator$ReaderValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = (JSONValidator.UTF16Validator)JSONValidator.from("");
      // Undeclared exception!
      try { 
        jSONValidator_UTF16Validator0.any();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error : 0
         //
         verifyException("com.alibaba.fastjson.JSONValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JSONValidator.UTF8InputStreamValidator jSONValidator_UTF8InputStreamValidator0 = (JSONValidator.UTF8InputStreamValidator)JSONValidator.fromUtf8((InputStream) byteArrayInputStream0);
      // Undeclared exception!
      jSONValidator_UTF8InputStreamValidator0.fieldName();
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"fruit\":\"Apple\",\"size\":\"Large\",\"color\":\"Red\",\"value\":true,\"value2\":false,\"number\":\"1\",\"x\":99}");
      JSONValidator jSONValidator0 = JSONValidator.from((Reader) stringReader0);
      jSONValidator0.getType();
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("0Zv^m6z>A\"JR_gqloX");
      jSONValidator_UTF16Validator0.close();
      assertNull(jSONValidator_UTF16Validator0.getType());
  }
}
