/*
 * This file was automatically generated by EvoSuite
 * Wed May 20 11:47:38 GMT 2020
 */

package org.json;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.FileDescriptor;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PushbackInputStream;
import java.io.Reader;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.json.JSONException;
import org.json.JSONTokener;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSONTokener_ESTest extends JSONTokener_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("");
      assertFalse(jSONTokener0.end());
      
      char char0 = jSONTokener0.skipTo('y');
      assertTrue(jSONTokener0.end());
      assertEquals('\u0000', char0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("i,QGFdc-la6y");
      assertFalse(jSONTokener0.end());
      
      Object object0 = jSONTokener0.nextValue();
      assertEquals("i", object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)9;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JSONTokener jSONTokener0 = new JSONTokener(byteArrayInputStream0);
      assertFalse(jSONTokener0.end());
      
      jSONTokener0.nextTo("\uFFFD\uFFFD");
      assertTrue(jSONTokener0.end());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Expecated '");
      JSONTokener jSONTokener0 = new JSONTokener(stringReader0);
      String string0 = jSONTokener0.nextTo("$r9aZ");
      assertFalse(jSONTokener0.end());
      assertEquals("Expec", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[15];
      byteArray0[0] = (byte)1;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JSONTokener jSONTokener0 = new JSONTokener(byteArrayInputStream0);
      assertFalse(jSONTokener0.end());
      
      jSONTokener0.nextTo('E');
      assertTrue(jSONTokener0.end());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JSONTokener jSONTokener0 = new JSONTokener(byteArrayInputStream0);
      assertFalse(jSONTokener0.end());
      
      char char0 = jSONTokener0.nextClean();
      assertTrue(jSONTokener0.end());
      assertEquals('\u0000', char0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JSONTokener jSONTokener0 = new JSONTokener(byteArrayInputStream0);
      boolean boolean0 = jSONTokener0.more();
      assertEquals(0, byteArrayInputStream0.available());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int int0 = JSONTokener.dehexchar('f');
      assertEquals(15, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int int0 = JSONTokener.dehexchar('a');
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int int0 = JSONTokener.dehexchar('F');
      assertEquals(15, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = JSONTokener.dehexchar('A');
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = JSONTokener.dehexchar('9');
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)120;
      byteArray0[1] = (byte) (-22);
      byteArray0[2] = (byte) (-57);
      byteArray0[3] = (byte)67;
      byteArray0[4] = (byte)87;
      byteArray0[5] = (byte)2;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JSONTokener jSONTokener0 = new JSONTokener(byteArrayInputStream0);
      assertFalse(jSONTokener0.end());
      
      Object object0 = jSONTokener0.nextValue();
      assertEquals("x\uFFFD\uFFFDCW", object0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener(")x(NFoSQ+t#?l1");
      char char0 = jSONTokener0.skipTo('1');
      assertEquals('1', char0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("A>h->c");
      jSONTokener0.nextTo('A');
      assertFalse(jSONTokener0.end());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("~I.?%");
      char char0 = jSONTokener0.skipTo('?');
      assertEquals('?', char0);
      
      String string0 = jSONTokener0.nextString('?');
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("Expecated '");
      char char0 = jSONTokener0.nextClean();
      assertFalse(jSONTokener0.end());
      assertEquals('E', char0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("Expecated '");
      char char0 = jSONTokener0.next('E');
      assertEquals('E', char0);
      assertFalse(jSONTokener0.end());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("5i1lqK[");
      char char0 = jSONTokener0.next();
      assertFalse(jSONTokener0.end());
      assertEquals('5', char0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("j;YYKz%5]O");
      char char0 = jSONTokener0.next();
      assertFalse(jSONTokener0.end());
      assertEquals('j', char0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      JSONTokener jSONTokener0 = new JSONTokener(pipedInputStream0);
      try { 
        jSONTokener0.skipTo('a');
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Pipe not connected
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(mockFileInputStream0);
      JSONTokener jSONTokener0 = new JSONTokener(bufferedInputStream0);
      try { 
        jSONTokener0.nextTo((String) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JSONTokener jSONTokener0 = new JSONTokener(byteArrayInputStream0);
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
  public void test23()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(79);
      JSONTokener jSONTokener0 = new JSONTokener(pipedInputStream0);
      try { 
        jSONTokener0.nextTo('z');
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Pipe not connected
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(mockFileInputStream0, 5);
      JSONTokener jSONTokener0 = new JSONTokener(pushbackInputStream0);
      try { 
        jSONTokener0.nextClean();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("0000");
      // Undeclared exception!
      try { 
        jSONTokener0.next((int) (byte) (-30));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      JSONTokener jSONTokener0 = new JSONTokener(mockFileInputStream0);
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
  public void test27()  throws Throwable  {
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
  public void test28()  throws Throwable  {
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
  public void test29()  throws Throwable  {
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
  public void test30()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("Expecated '");
      assertFalse(jSONTokener0.end());
      
      jSONTokener0.nextTo('y');
      char char0 = jSONTokener0.next();
      assertTrue(jSONTokener0.end());
      assertEquals('\u0000', char0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("] is not a JSONArray.");
      jSONTokener0.nextString('.');
      jSONTokener0.back();
      char char0 = jSONTokener0.next();
      assertFalse(jSONTokener0.end());
      assertEquals('.', char0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener(" ]!\"");
      jSONTokener0.nextClean();
      jSONTokener0.back();
      assertFalse(jSONTokener0.end());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener(" ]!\"");
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
  public void test34()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener(" ]!\"");
      String string0 = jSONTokener0.toString();
      assertEquals(" at 0 [character 1 line 1]", string0);
      assertFalse(jSONTokener0.end());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("&gn9{Nx5");
      jSONTokener0.nextValue();
      try { 
        jSONTokener0.nextValue();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected a ':' after a key at 9 [character 10 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("[rEcXlZy{u .$8>");
      try { 
        jSONTokener0.nextValue();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected a ',' or ']' at 9 [character 10 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener(" ]!\"");
      jSONTokener0.nextClean();
      jSONTokener0.next();
      try { 
        jSONTokener0.nextValue();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unterminated string at 5 [character 6 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JSONTokener jSONTokener0 = new JSONTokener(byteArrayInputStream0);
      jSONTokener0.nextTo("Expected '");
      assertEquals(0, byteArrayInputStream0.available());
      assertFalse(jSONTokener0.end());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener(" ]!\"");
      String string0 = jSONTokener0.nextTo(" ]!\"");
      assertEquals("", string0);
      assertFalse(jSONTokener0.end());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)97;
      byteArray0[1] = (byte) (-112);
      byteArray0[2] = (byte)87;
      byteArray0[3] = (byte)13;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JSONTokener jSONTokener0 = new JSONTokener(byteArrayInputStream0);
      String string0 = jSONTokener0.nextTo('z');
      assertEquals(0, byteArrayInputStream0.available());
      assertEquals("a\uFFFDW", string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("8Cj");
      jSONTokener0.nextTo('E');
      try { 
        jSONTokener0.nextValue();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Missing value at 2 [character 3 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\r");
      JSONTokener jSONTokener0 = new JSONTokener(stringReader0);
      try { 
        jSONTokener0.nextString('b');
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unterminated string at 1 [character 0 line 2]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-11);
      byteArray0[1] = (byte) (-118);
      byteArray0[2] = (byte)48;
      byteArray0[3] = (byte)92;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JSONTokener jSONTokener0 = new JSONTokener(byteArrayInputStream0);
      try { 
        jSONTokener0.nextString('=');
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Illegal escape. at 4 [character 5 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("[rEcXlZy{u .$8>");
      try { 
        jSONTokener0.nextString('b');
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unterminated string at 15 [character 16 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JSONTokener jSONTokener0 = new JSONTokener(byteArrayInputStream0);
      try { 
        jSONTokener0.nextString('v');
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unterminated string at 1 [character 0 line 2]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("Expecated '");
      jSONTokener0.nextTo(' ');
      try { 
        jSONTokener0.nextValue();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unterminated string at 11 [character 12 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("v5<2");
      try { 
        jSONTokener0.next(114);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Substring bounds error at 4 [character 5 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("~I.?%");
      String string0 = jSONTokener0.next(0);
      assertEquals("", string0);
      assertFalse(jSONTokener0.end());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("]}/<}}I&`%A>h-c ");
      assertFalse(jSONTokener0.end());
      
      String string0 = jSONTokener0.next(8);
      assertEquals("]}/<}}I&", string0);
      
      Object object0 = jSONTokener0.nextValue();
      assertEquals("`%A>h-c", object0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("");
      try { 
        jSONTokener0.next('T');
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected 'T' and instead saw '' at 0 [character 1 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("org.json.JSONObject");
      try { 
        jSONTokener0.next('N');
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected 'N' and instead saw 'o' at 1 [character 2 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("");
      assertFalse(jSONTokener0.end());
      
      char char0 = jSONTokener0.next('\u0000');
      assertTrue(jSONTokener0.end());
      assertEquals('\u0000', char0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("A JSONObject text must begin with '{'");
      jSONTokener0.skipTo('N');
      try { 
        jSONTokener0.nextString('I');
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unterminated string at 37 [character 38 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("");
      assertFalse(jSONTokener0.end());
      
      boolean boolean0 = jSONTokener0.more();
      assertTrue(jSONTokener0.end());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener(" ]!\"");
      boolean boolean0 = jSONTokener0.more();
      assertFalse(jSONTokener0.end());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("8Cj");
      jSONTokener0.nextClean();
      assertFalse(jSONTokener0.end());
      
      jSONTokener0.skipTo('8');
      boolean boolean0 = jSONTokener0.end();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("VxtEwg09x`J|\"~");
      boolean boolean0 = jSONTokener0.end();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      int int0 = JSONTokener.dehexchar('t');
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      int int0 = JSONTokener.dehexchar('5');
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      int int0 = JSONTokener.dehexchar('&');
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-41);
      byteArray0[1] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JSONTokener jSONTokener0 = new JSONTokener(byteArrayInputStream0);
      jSONTokener0.nextTo('O');
      assertEquals(0, byteArrayInputStream0.available());
      
      boolean boolean0 = jSONTokener0.more();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-120);
      byteArray0[1] = (byte)85;
      byteArray0[2] = (byte)13;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JSONTokener jSONTokener0 = new JSONTokener(byteArrayInputStream0);
      String string0 = jSONTokener0.nextTo("Substring bounds error");
      assertEquals(0, byteArrayInputStream0.available());
      assertEquals("\uFFFDU", string0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("ExpecaEedR> '");
      jSONTokener0.nextTo('R');
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
  public void test64()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("] is not a JSONArray.");
      JSONException jSONException0 = jSONTokener0.syntaxError(" at 21 [character 22 line 1]");
      jSONTokener0.syntaxError("] is not a JSONArray", (Throwable) jSONException0);
      assertFalse(jSONTokener0.end());
  }
}