/*
 * This file was automatically generated by EvoSuite
 * Wed May 20 14:25:45 GMT 2020
 */

package com.alibaba.fastjson;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.JSONValidator;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PushbackInputStream;
import java.io.Reader;
import java.io.SequenceInputStream;
import java.io.StringReader;
import java.util.Enumeration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSONValidator_ESTest extends JSONValidator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      JSONValidator.fromUtf8((InputStream) dataInputStream0);
      assertEquals(0, byteArrayInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      JSONValidator.UTF8Validator jSONValidator_UTF8Validator0 = new JSONValidator.UTF8Validator(byteArray0);
      // Undeclared exception!
      jSONValidator_UTF8Validator0.fieldName();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)123;
      byteArray0[1] = (byte) (-60);
      JSONValidator jSONValidator0 = JSONValidator.fromUtf8(byteArray0);
      // Undeclared exception!
      try { 
        jSONValidator0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error : 1
         //
         verifyException("com.alibaba.fastjson.JSONValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      JSONValidator.UTF8Validator jSONValidator_UTF8Validator0 = (JSONValidator.UTF8Validator)JSONValidator.fromUtf8(byteArray0);
      jSONValidator_UTF8Validator0.next();
      assertNull(jSONValidator_UTF8Validator0.getType());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(sequenceInputStream0);
      JSONValidator.UTF8InputStreamValidator jSONValidator_UTF8InputStreamValidator0 = new JSONValidator.UTF8InputStreamValidator(pushbackInputStream0);
      // Undeclared exception!
      try { 
        jSONValidator_UTF8InputStreamValidator0.error();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error, readCount 1, valueCount : 0, pos 0
         //
         verifyException("com.alibaba.fastjson.JSONValidator$UTF8InputStreamValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator(";]>J_+iCHa");
      jSONValidator_UTF16Validator0.next();
      assertNull(jSONValidator_UTF16Validator0.getType());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringReader stringReader0 = new StringReader(";0p<15G)4");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = (JSONValidator.ReaderValidator)JSONValidator.from((Reader) stringReader0);
      jSONValidator_ReaderValidator0.next();
      assertNull(jSONValidator_ReaderValidator0.getType());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringReader stringReader0 = new StringReader("$k7H]fBX$");
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
  public void test08()  throws Throwable  {
      StringReader stringReader0 = new StringReader("p+m${!T_.wSa66>");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = (JSONValidator.ReaderValidator)JSONValidator.from((Reader) stringReader0);
      jSONValidator_ReaderValidator0.skipWhiteSpace();
      assertNull(jSONValidator_ReaderValidator0.getType());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      boolean boolean0 = JSONValidator.isWhiteSpace('K');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
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
  public void test11()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(115);
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
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        JSONValidator.fromUtf8((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.JSONValidator$UTF8InputStreamValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-1), 1871);
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
      StringReader stringReader0 = new StringReader(";0p<15G)4");
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
      StringReader stringReader0 = new StringReader("p+m${!T_.wwSa6k6>");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = new JSONValidator.ReaderValidator(stringReader0);
      jSONValidator_ReaderValidator0.close();
      // Undeclared exception!
      try { 
        jSONValidator_ReaderValidator0.fieldName();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // read error
         //
         verifyException("com.alibaba.fastjson.JSONValidator$ReaderValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator(".A~-n8ggAWL5");
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
      StringReader stringReader0 = new StringReader("p+m${!T_.wwSa6k6>");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = new JSONValidator.ReaderValidator(stringReader0);
      // Undeclared exception!
      jSONValidator_ReaderValidator0.fieldName();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JSONValidator jSONValidator0 = JSONValidator.from("");
      assertNull(jSONValidator0.getType());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 94, 94);
      JSONValidator.UTF8InputStreamValidator jSONValidator_UTF8InputStreamValidator0 = new JSONValidator.UTF8InputStreamValidator(byteArrayInputStream0);
      jSONValidator_UTF8InputStreamValidator0.next();
      assertNull(jSONValidator_UTF8InputStreamValidator0.getType());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)10;
      JSONValidator.UTF8Validator jSONValidator_UTF8Validator0 = new JSONValidator.UTF8Validator(byteArray0);
      assertNull(jSONValidator_UTF8Validator0.getType());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)13;
      JSONValidator jSONValidator0 = JSONValidator.fromUtf8(byteArray0);
      assertNull(jSONValidator0.getType());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)9;
      JSONValidator jSONValidator0 = JSONValidator.fromUtf8(byteArray0);
      assertNull(jSONValidator0.getType());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringReader stringReader0 = new StringReader("#%)i\"<+<h5Z___|lp");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = (JSONValidator.ReaderValidator)JSONValidator.from((Reader) stringReader0);
      jSONValidator_ReaderValidator0.fieldName();
      assertNull(jSONValidator_ReaderValidator0.getType());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = (JSONValidator.UTF16Validator)JSONValidator.from("zP-A_U");
      // Undeclared exception!
      jSONValidator_UTF16Validator0.fieldName();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StringReader stringReader0 = new StringReader("+1*p[!x_jm`c~\"6K/x");
      JSONValidator jSONValidator0 = JSONValidator.from((Reader) stringReader0);
      // Undeclared exception!
      try { 
        jSONValidator0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error, readCount 1, valueCount : 1, pos 2
         //
         verifyException("com.alibaba.fastjson.JSONValidator$ReaderValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)123;
      JSONValidator jSONValidator0 = JSONValidator.fromUtf8(byteArray0);
      // Undeclared exception!
      try { 
        jSONValidator0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error : 1
         //
         verifyException("com.alibaba.fastjson.JSONValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StringReader stringReader0 = new StringReader("t2");
      JSONValidator jSONValidator0 = JSONValidator.from((Reader) stringReader0);
      // Undeclared exception!
      try { 
        jSONValidator0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error, readCount 1, valueCount : 0, pos 1
         //
         verifyException("com.alibaba.fastjson.JSONValidator$ReaderValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StringReader stringReader0 = new StringReader("n1`}4^! {[c_[zXL7S>");
      JSONValidator jSONValidator0 = JSONValidator.from((Reader) stringReader0);
      // Undeclared exception!
      try { 
        jSONValidator0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error, readCount 1, valueCount : 0, pos 1
         //
         verifyException("com.alibaba.fastjson.JSONValidator$ReaderValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("Xr:f*G!yPxLD");
      jSONValidator_UTF16Validator0.ch = 'f';
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
  public void test32()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[vEL%i");
      JSONValidator jSONValidator0 = JSONValidator.from((Reader) stringReader0);
      // Undeclared exception!
      try { 
        jSONValidator0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error, readCount 1, valueCount : 0, pos 1
         //
         verifyException("com.alibaba.fastjson.JSONValidator$ReaderValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StringReader stringReader0 = new StringReader("8 valueCount : ");
      JSONValidator jSONValidator0 = JSONValidator.from((Reader) stringReader0);
      // Undeclared exception!
      try { 
        jSONValidator0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error, readCount 1, valueCount : 1, pos 2
         //
         verifyException("com.alibaba.fastjson.JSONValidator$ReaderValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)55;
      JSONValidator jSONValidator0 = JSONValidator.fromUtf8(byteArray0);
      // Undeclared exception!
      try { 
        jSONValidator0.validate();
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
      StringReader stringReader0 = new StringReader("p+m${!T_.wSa66>");
      stringReader0.skip(12L);
      JSONValidator jSONValidator0 = JSONValidator.from((Reader) stringReader0);
      // Undeclared exception!
      try { 
        jSONValidator0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error, readCount 1, valueCount : 1, pos 2
         //
         verifyException("com.alibaba.fastjson.JSONValidator$ReaderValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StringReader stringReader0 = new StringReader("5&s&+Wn.w@&au-7>q>#");
      JSONValidator jSONValidator0 = JSONValidator.from((Reader) stringReader0);
      // Undeclared exception!
      try { 
        jSONValidator0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error, readCount 1, valueCount : 1, pos 1
         //
         verifyException("com.alibaba.fastjson.JSONValidator$ReaderValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)52;
      JSONValidator jSONValidator0 = JSONValidator.fromUtf8(byteArray0);
      boolean boolean0 = jSONValidator0.validate();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)49;
      JSONValidator.UTF8Validator jSONValidator_UTF8Validator0 = new JSONValidator.UTF8Validator(byteArray0);
      jSONValidator_UTF8Validator0.any();
      assertEquals(JSONValidator.Type.Value, jSONValidator_UTF8Validator0.getType());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)48;
      JSONValidator.UTF8Validator jSONValidator_UTF8Validator0 = new JSONValidator.UTF8Validator(byteArray0);
      jSONValidator_UTF8Validator0.any();
      assertEquals(JSONValidator.Type.Value, jSONValidator_UTF8Validator0.getType());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      StringReader stringReader0 = new StringReader("+g^qGW");
      JSONValidator.ReaderValidator jSONValidator_ReaderValidator0 = new JSONValidator.ReaderValidator(stringReader0);
      // Undeclared exception!
      try { 
        jSONValidator_ReaderValidator0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error, readCount 1, valueCount : 0, pos 1
         //
         verifyException("com.alibaba.fastjson.JSONValidator$ReaderValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("\"rU;q[<;#*iH9");
      // Undeclared exception!
      jSONValidator_UTF16Validator0.validate();
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      StringReader stringReader0 = new StringReader("20");
      JSONValidator jSONValidator0 = JSONValidator.from((Reader) stringReader0);
      boolean boolean0 = jSONValidator0.validate();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      StringReader stringReader0 = new StringReader("#%)i\"<+<h5Z___|lp");
      JSONValidator jSONValidator0 = JSONValidator.from((Reader) stringReader0);
      jSONValidator0.close();
      assertNull(jSONValidator0.getType());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      StringReader stringReader0 = new StringReader("3/}G(0P[Mk<4t6j");
      JSONValidator jSONValidator0 = JSONValidator.from((Reader) stringReader0);
      // Undeclared exception!
      try { 
        jSONValidator0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error, readCount 1, valueCount : 1, pos 1
         //
         verifyException("com.alibaba.fastjson.JSONValidator$ReaderValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      JSONValidator.UTF8Validator jSONValidator_UTF8Validator0 = new JSONValidator.UTF8Validator(byteArray0);
      // Undeclared exception!
      try { 
        jSONValidator_UTF8Validator0.any();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error : 0
         //
         verifyException("com.alibaba.fastjson.JSONValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JSONValidator jSONValidator0 = JSONValidator.from((Reader) stringReader0);
      jSONValidator0.getType();
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      JSONValidator jSONValidator0 = JSONValidator.from(" P");
      assertNull(jSONValidator0.getType());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      JSONValidator.UTF16Validator jSONValidator_UTF16Validator0 = new JSONValidator.UTF16Validator("Xr:f*G!yPxLD");
      jSONValidator_UTF16Validator0.close();
      assertNull(jSONValidator_UTF16Validator0.getType());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, (byte) (-9));
      JSONValidator.UTF8InputStreamValidator jSONValidator_UTF8InputStreamValidator0 = new JSONValidator.UTF8InputStreamValidator(byteArrayInputStream0);
      jSONValidator_UTF8InputStreamValidator0.close();
      assertNull(jSONValidator_UTF8InputStreamValidator0.getType());
  }
}
