/*
 * This file was automatically generated by EvoSuite
 * Fri May 22 02:27:12 GMT 2020
 */

package com.alibaba.fastjson;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.JSONValidator;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSONValidator_ESTest extends JSONValidator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"a string\"");
      JSONValidator jSONValidator0 = JSONValidator.from((Reader) stringReader0);
      boolean boolean0 = jSONValidator0.validate();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JSONValidator.UTF8InputStreamValidator jSONValidator_UTF8InputStreamValidator0 = new JSONValidator.UTF8InputStreamValidator(byteArrayInputStream0);
      jSONValidator_UTF8InputStreamValidator0.next();
      // Undeclared exception!
      try { 
        jSONValidator_UTF8InputStreamValidator0.error();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error, readCount 1, valueCount : 0, pos 1
         //
         verifyException("com.alibaba.fastjson.JSONValidator$UTF8InputStreamValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JSONValidator.UTF8InputStreamValidator jSONValidator_UTF8InputStreamValidator0 = new JSONValidator.UTF8InputStreamValidator(byteArrayInputStream0);
      // Undeclared exception!
      jSONValidator_UTF8InputStreamValidator0.fieldName();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      JSONValidator.UTF8Validator jSONValidator_UTF8Validator0 = new JSONValidator.UTF8Validator(byteArray0);
      // Undeclared exception!
      jSONValidator_UTF8Validator0.fieldName();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringReader stringReader0 = new StringReader("-]uP#\"c?,^/eK5 Y2");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = new JSONValidator.ReaderValidator(stringReader0);
      // Undeclared exception!
      try { 
        jSONValidator_ReaderValidator0.error();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error, readCount 1, valueCount : 0, pos 0
         //
         verifyException("com.alibaba.fastjson.JSONValidator$ReaderValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"x\":\"hello\",\"y\":7,\"z\":true,\"a\":[],\"b\":{\"x\":null}}");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = new JSONValidator.ReaderValidator(stringReader0);
      jSONValidator_ReaderValidator0.close();
      assertNull(jSONValidator_ReaderValidator0.getType());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"x\":\"hello\",\"y\":7,\"z\":true,\"a\":[],\"b\":{},\"xx\":99}");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = new JSONValidator.ReaderValidator(stringReader0);
      jSONValidator_ReaderValidator0.skipWhiteSpace();
      assertNull(jSONValidator_ReaderValidator0.getType());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      boolean boolean0 = JSONValidator.isWhiteSpace(' ');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      boolean boolean0 = JSONValidator.isWhiteSpace('p');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("[false,null,null,99]");
      jSONValidator_UTF16Validator0.any();
      JSONValidator.Type jSONValidator_Type0 = jSONValidator_UTF16Validator0.getType();
      assertEquals(JSONValidator.Type.Array, jSONValidator_Type0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("[{\"\":null},false,[],null,[99]]");
      jSONValidator_UTF16Validator0.fieldName();
      // Undeclared exception!
      jSONValidator_UTF16Validator0.validate();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
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
  public void test12()  throws Throwable  {
      File file0 = MockFile.createTempFile("{\"fruit\":false,\"size\":\"\",\"color\":\"Red\",\"value\":true,\"value2\":false,\"number\":\"1\",\"x\":99}", "{\"fruit\":false,\"size\":\"\",\"color\":\"Red\",\"value\":true,\"value2\":false,\"number\":\"1\",\"x\":99}");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      mockFileInputStream0.close();
      // Undeclared exception!
      try { 
        JSONValidator.fromUtf8((InputStream) mockFileInputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // read error
         //
         verifyException("com.alibaba.fastjson.JSONValidator$UTF8InputStreamValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
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
  public void test14()  throws Throwable  {
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
  public void test15()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
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
  public void test16()  throws Throwable  {
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
  public void test17()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = (JSONValidator.ReaderValidator)JSONValidator.from((Reader) stringReader0);
      jSONValidator_ReaderValidator0.eof = false;
      // Undeclared exception!
      try { 
        jSONValidator_ReaderValidator0.fieldName();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = (JSONValidator.UTF16Validator)JSONValidator.from("true");
      // Undeclared exception!
      try { 
        jSONValidator_UTF16Validator0.error();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error : 0
         //
         verifyException("com.alibaba.fastjson.JSONValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("false");
      jSONValidator_UTF16Validator0.ch = '\"';
      // Undeclared exception!
      jSONValidator_UTF16Validator0.any();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("[false,[],null,[99,-99]]");
      jSONValidator_UTF16Validator0.pos = (-3119);
      // Undeclared exception!
      try { 
        jSONValidator_UTF16Validator0.any();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = new JSONValidator.ReaderValidator(stringReader0);
      jSONValidator_ReaderValidator0.next();
      assertNull(jSONValidator_ReaderValidator0.getType());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"fruit\":\"Apple\",\"size\":\"Large\",\"color\":\"Red\",\"value\":false,\"\":false,\"number\":\"1\"}");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = new JSONValidator.ReaderValidator(stringReader0);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      jSONValidator_ReaderValidator0.fieldName();
      assertNull(jSONValidator_ReaderValidator0.getType());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("");
      jSONValidator_UTF16Validator0.pos = (-4782);
      // Undeclared exception!
      try { 
        jSONValidator_UTF16Validator0.fieldName();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JSONValidator.UTF8InputStreamValidator jSONValidator_UTF8InputStreamValidator0 = new JSONValidator.UTF8InputStreamValidator(byteArrayInputStream0);
      jSONValidator_UTF8InputStreamValidator0.next();
      assertNull(jSONValidator_UTF8InputStreamValidator0.getType());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      File file0 = MockFile.createTempFile("{\"fruit\":false,\"\":\"\",\"color\":\"Red\",\"value\":true,\"value2\":false,\"number\":\"1\",\"x\":99,\"xx\":null}", "{\"fruit\":false,\"\":\"\",\"color\":\"Red\",\"value\":true,\"value2\":false,\"number\":\"1\",\"x\":99,\"xx\":null}");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      JSONValidator.UTF8InputStreamValidator jSONValidator_UTF8InputStreamValidator0 = (JSONValidator.UTF8InputStreamValidator)JSONValidator.fromUtf8((InputStream) mockFileInputStream0);
      jSONValidator_UTF8InputStreamValidator0.next();
      assertEquals((-1), mockFileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("{\"com.alibaba.fastjson.JSONException\":\"\",\"y\":7,\"z\":null,\"\":[],\"xx\":-99,\"x\":{}}");
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      jSONValidator_UTF16Validator0.eof = false;
      jSONValidator_UTF16Validator0.count = (-281);
      jSONValidator_UTF16Validator0.any();
      jSONValidator_UTF16Validator0.next();
      jSONValidator_UTF16Validator0.next();
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)114;
      byteArray0[1] = (byte) (-1);
      byteArray0[2] = (byte)3;
      byteArray0[3] = (byte)14;
      byteArray0[4] = (byte)25;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JSONValidator.UTF8InputStreamValidator jSONValidator_UTF8InputStreamValidator0 = new JSONValidator.UTF8InputStreamValidator(byteArrayInputStream0);
      StringReader stringReader0 = null;
      try {
        stringReader0 = new StringReader((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)12;
      JSONValidator.UTF8Validator jSONValidator_UTF8Validator0 = new JSONValidator.UTF8Validator(byteArray0);
      assertNull(jSONValidator_UTF8Validator0.getType());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)10;
      JSONValidator jSONValidator0 = JSONValidator.fromUtf8(byteArray0);
      assertNull(jSONValidator0.getType());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)13;
      JSONValidator.UTF8Validator jSONValidator_UTF8Validator0 = new JSONValidator.UTF8Validator(byteArray0);
      assertNull(jSONValidator_UTF8Validator0.getType());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)9;
      JSONValidator.UTF8Validator jSONValidator_UTF8Validator0 = new JSONValidator.UTF8Validator(byteArray0);
      assertNull(jSONValidator_UTF8Validator0.getType());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)8;
      JSONValidator.UTF8Validator jSONValidator_UTF8Validator0 = new JSONValidator.UTF8Validator(byteArray0);
      assertNull(jSONValidator_UTF8Validator0.getType());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("{\"\":0.0,\"error : \":true,\"\":null}");
      jSONValidator_UTF16Validator0.any();
      assertEquals(JSONValidator.Type.Object, jSONValidator_UTF16Validator0.getType());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("[false,{\"\":99},[],null]");
      jSONValidator_UTF16Validator0.any();
      assertEquals(JSONValidator.Type.Array, jSONValidator_UTF16Validator0.getType());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("n");
      // Undeclared exception!
      try { 
        jSONValidator_UTF16Validator0.any();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error : 1
         //
         verifyException("com.alibaba.fastjson.JSONValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("false");
      jSONValidator_UTF16Validator0.any();
      assertEquals(JSONValidator.Type.Value, jSONValidator_UTF16Validator0.getType());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("{\"\":null,\"error : \":true,\"error, readCount \":false}");
      jSONValidator_UTF16Validator0.any();
      assertEquals(JSONValidator.Type.Object, jSONValidator_UTF16Validator0.getType());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("[fale,null,nul,[true],false]");
      // Undeclared exception!
      try { 
        jSONValidator_UTF16Validator0.any();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error : 4
         //
         verifyException("com.alibaba.fastjson.JSONValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("faHse");
      // Undeclared exception!
      try { 
        jSONValidator_UTF16Validator0.any();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error : 2
         //
         verifyException("com.alibaba.fastjson.JSONValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("fL~d+9%,");
      // Undeclared exception!
      try { 
        jSONValidator_UTF16Validator0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error : 1
         //
         verifyException("com.alibaba.fastjson.JSONValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("true");
      jSONValidator_UTF16Validator0.any();
      assertEquals(JSONValidator.Type.Value, jSONValidator_UTF16Validator0.getType());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("{\"\":0.0,\"error : \":trueV\"\":null}");
      // Undeclared exception!
      try { 
        jSONValidator_UTF16Validator0.any();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error : 23
         //
         verifyException("com.alibaba.fastjson.JSONValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("[false,false,[true],null,[99]]");
      jSONValidator_UTF16Validator0.any();
      assertEquals(JSONValidator.Type.Array, jSONValidator_UTF16Validator0.getType());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("{\"com.alibaba.fastjson.JSONException\":\"hello\",\"y\":7,\"z\":true,\"a\":[],\"b\":{\"com.alibaba.fastjson.JSONException\":true},\"xx\":-99}");
      jSONValidator_UTF16Validator0.any();
      assertEquals(JSONValidator.Type.Object, jSONValidator_UTF16Validator0.getType());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = new JSONValidator.ReaderValidator(stringReader0);
      jSONValidator_ReaderValidator0.ch = 't';
      // Undeclared exception!
      try { 
        jSONValidator_ReaderValidator0.any();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error, readCount 1, valueCount : 0, pos 0
         //
         verifyException("com.alibaba.fastjson.JSONValidator$ReaderValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("{\"\":0.0}");
      jSONValidator_UTF16Validator0.any();
      assertEquals(JSONValidator.Type.Object, jSONValidator_UTF16Validator0.getType());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)43;
      JSONValidator.UTF8Validator jSONValidator_UTF8Validator0 = new JSONValidator.UTF8Validator(byteArray0);
      // Undeclared exception!
      try { 
        jSONValidator_UTF8Validator0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error : 1
         //
         verifyException("com.alibaba.fastjson.JSONValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)91;
      byteArray0[1] = (byte)52;
      JSONValidator.UTF8Validator jSONValidator_UTF8Validator0 = new JSONValidator.UTF8Validator(byteArray0);
      // Undeclared exception!
      try { 
        jSONValidator_UTF8Validator0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error : 2
         //
         verifyException("com.alibaba.fastjson.JSONValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"fruit\":\"Apple\",\"size\":\"Large,\"color\":\"\",\"value\":true\"v#lue2\":flse,\"number\":[],\"x\":null}");
      JSONValidator jSONValidator0 = JSONValidator.from((Reader) stringReader0);
      // Undeclared exception!
      try { 
        jSONValidator0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error, readCount 1, valueCount : 0, pos 32
         //
         verifyException("com.alibaba.fastjson.JSONValidator$ReaderValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("[{\"\"null},false,[],nul,[99]");
      // Undeclared exception!
      try { 
        jSONValidator_UTF16Validator0.any();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error : 4
         //
         verifyException("com.alibaba.fastjson.JSONValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("{\"\":[],\"error : \":true}");
      jSONValidator_UTF16Validator0.pos = 48;
      // Undeclared exception!
      try { 
        jSONValidator_UTF16Validator0.any();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error : 49
         //
         verifyException("com.alibaba.fastjson.JSONValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("81}5J$,ogoAKHu~kT;");
      jSONValidator_UTF16Validator0.any();
      assertEquals(JSONValidator.Type.Value, jSONValidator_UTF16Validator0.getType());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("6ARCQxCH3`!H%L");
      jSONValidator_UTF16Validator0.any();
      assertEquals(JSONValidator.Type.Value, jSONValidator_UTF16Validator0.getType());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte)53;
      JSONValidator.UTF8Validator jSONValidator_UTF8Validator0 = new JSONValidator.UTF8Validator(byteArray0);
      jSONValidator_UTF8Validator0.next();
      jSONValidator_UTF8Validator0.any();
      assertEquals(JSONValidator.Type.Value, jSONValidator_UTF8Validator0.getType());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("2>:&m*R\"4%1hiv");
      jSONValidator_UTF16Validator0.fieldName();
      // Undeclared exception!
      try { 
        jSONValidator_UTF16Validator0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error : 9
         //
         verifyException("com.alibaba.fastjson.JSONValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("3|BJDNR}8");
      jSONValidator_UTF16Validator0.any();
      assertEquals(JSONValidator.Type.Value, jSONValidator_UTF16Validator0.getType());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      StringReader stringReader0 = new StringReader("2>:&m*R\"4%1hiv");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = new JSONValidator.ReaderValidator(stringReader0);
      jSONValidator_ReaderValidator0.any();
      assertEquals(JSONValidator.Type.Value, jSONValidator_ReaderValidator0.getType());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("1YhZ");
      jSONValidator_UTF16Validator0.any();
      assertEquals(JSONValidator.Type.Value, jSONValidator_UTF16Validator0.getType());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("+=}h3Fsz");
      // Undeclared exception!
      try { 
        jSONValidator_UTF16Validator0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error : 1
         //
         verifyException("com.alibaba.fastjson.JSONValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("[{},false,[],null,[99,false]]");
      boolean boolean0 = jSONValidator_UTF16Validator0.validate();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"fruit\":\"Apple\",\"size\":\"Large\",\"color\":\"Red\",\"value\":false,\"\":false,\"number\":\"1\"}");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = new JSONValidator.ReaderValidator(stringReader0);
      jSONValidator_ReaderValidator0.close();
      assertNull(jSONValidator_ReaderValidator0.getType());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      JSONValidator jSONValidator0 = JSONValidator.fromUtf8(byteArray0);
      assertNull(jSONValidator0.getType());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("{\"\":0.0,\"error : \":true,\"\":null:");
      // Undeclared exception!
      try { 
        jSONValidator_UTF16Validator0.any();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error : 31
         //
         verifyException("com.alibaba.fastjson.JSONValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("[false,null,null,99]");
      jSONValidator_UTF16Validator0.getType();
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("[{\"\"null},false,[],nul,[99]");
      jSONValidator_UTF16Validator0.close();
      assertNull(jSONValidator_UTF16Validator0.getType());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JSONValidator.UTF8InputStreamValidator jSONValidator_UTF8InputStreamValidator0 = new JSONValidator.UTF8InputStreamValidator(byteArrayInputStream0);
      jSONValidator_UTF8InputStreamValidator0.close();
      assertEquals(0, byteArrayInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JSONValidator jSONValidator0 = JSONValidator.fromUtf8((InputStream) byteArrayInputStream0);
      // Undeclared exception!
      try { 
        jSONValidator0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error, readCount 1, valueCount : 0, pos 0
         //
         verifyException("com.alibaba.fastjson.JSONValidator$UTF8InputStreamValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      JSONValidator.UTF8Validator jSONValidator_UTF8Validator0 = new JSONValidator.UTF8Validator(byteArray0);
      jSONValidator_UTF8Validator0.pos = (int) (byte) (-62);
      // Undeclared exception!
      try { 
        jSONValidator_UTF8Validator0.fieldName();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}