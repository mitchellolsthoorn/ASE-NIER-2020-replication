/*
 * This file was automatically generated by EvoSuite
 * Wed May 20 13:58:30 GMT 2020
 */

package org.json;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.FileDescriptor;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PushbackInputStream;
import java.io.Reader;
import java.io.SequenceInputStream;
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
      StringReader stringReader0 = new StringReader("5,+J,_3(}Q");
      JSONTokener jSONTokener0 = new JSONTokener(stringReader0);
      Object object0 = jSONTokener0.nextValue();
      assertEquals(5, object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("Stepping back two steps is not supported");
      Object object0 = jSONTokener0.nextValue();
      assertEquals("Stepping back two steps is not supported", object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)38;
      byteArray0[1] = (byte)1;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JSONTokener jSONTokener0 = new JSONTokener(byteArrayInputStream0);
      jSONTokener0.nextTo("");
      assertTrue(jSONTokener0.end());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringReader stringReader0 = new StringReader("_e@b.s*0ERxs5/b+R ");
      JSONTokener jSONTokener0 = new JSONTokener(stringReader0);
      jSONTokener0.nextClean();
      jSONTokener0.skipTo('=');
      jSONTokener0.back();
      Object object0 = jSONTokener0.nextValue();
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("L");
      try { 
        jSONTokener0.next('%');
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected '%' and instead saw 'L' at 1 [character 2 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = JSONTokener.dehexchar('f');
      assertEquals(15, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int int0 = JSONTokener.dehexchar('a');
      assertEquals(10, int0);
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
      int int0 = JSONTokener.dehexchar('9');
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)8;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, (byte)8);
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
  public void test11()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("S0mg/G");
      try { 
        jSONTokener0.nextString('H');
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unterminated string at 6 [character 7 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("Stepping back two steps is not supported");
      String string0 = jSONTokener0.nextString('t');
      assertEquals("S", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("72A.y@9r");
      char char0 = jSONTokener0.nextClean();
      assertEquals('7', char0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("Stepping back two steps is not supported");
      char char0 = jSONTokener0.skipTo('t');
      assertEquals('t', char0);
      
      char char1 = jSONTokener0.next('t');
      assertEquals('t', char1);
      assertFalse(jSONTokener0.end());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringReader stringReader0 = new StringReader("72A.y@9r");
      JSONTokener jSONTokener0 = new JSONTokener(stringReader0);
      char char0 = jSONTokener0.next();
      assertEquals('7', char0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringReader stringReader0 = new StringReader("jHfjAI");
      JSONTokener jSONTokener0 = new JSONTokener(stringReader0);
      char char0 = jSONTokener0.next();
      assertEquals('j', char0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null);
      JSONTokener jSONTokener0 = new JSONTokener(pushbackInputStream0);
      try { 
        jSONTokener0.skipTo('n');
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Stream closed
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-6), (byte)8);
      JSONTokener jSONTokener0 = new JSONTokener(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        jSONTokener0.nextValue();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(dataInputStream0, 48);
      JSONTokener jSONTokener0 = new JSONTokener(bufferedInputStream0);
      try { 
        jSONTokener0.nextTo(" line ");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Pipe not connected
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("1-vHR:s L72");
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
  public void test21()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(mockFileInputStream0, mockFileInputStream0);
      JSONTokener jSONTokener0 = new JSONTokener(sequenceInputStream0);
      try { 
        jSONTokener0.nextTo('');
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
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-4792), 47);
      JSONTokener jSONTokener0 = new JSONTokener(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        jSONTokener0.nextTo('j');
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-2241), 79);
      JSONTokener jSONTokener0 = new JSONTokener(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        jSONTokener0.nextString('n');
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
  public void test25()  throws Throwable  {
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      JSONTokener jSONTokener0 = new JSONTokener(dataInputStream0);
      // Undeclared exception!
      try { 
        jSONTokener0.nextClean();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-6), (byte)8);
      JSONTokener jSONTokener0 = new JSONTokener(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        jSONTokener0.nextClean();
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
      JSONTokener jSONTokener0 = new JSONTokener(" [character ");
      // Undeclared exception!
      try { 
        jSONTokener0.next((-886));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-39), 70);
      JSONTokener jSONTokener0 = new JSONTokener(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        jSONTokener0.next('s');
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
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
  public void test30()  throws Throwable  {
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
  public void test31()  throws Throwable  {
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
  public void test32()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JSONTokener jSONTokener0 = new JSONTokener(stringReader0);
      jSONTokener0.next();
      assertTrue(jSONTokener0.end());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("y_iNLx}@JMF#SCuz");
      Object object0 = jSONTokener0.nextValue();
      assertEquals("y_iNLx", object0);
      
      char char0 = jSONTokener0.next();
      assertEquals('}', char0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)38;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JSONTokener jSONTokener0 = new JSONTokener(byteArrayInputStream0);
      jSONTokener0.nextClean();
      jSONTokener0.back();
      String string0 = jSONTokener0.nextString('&');
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("Hh");
      String string0 = jSONTokener0.toString();
      assertEquals(" at 0 [character 1 line 1]", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StringReader stringReader0 = new StringReader("_e@b.s*0ERxs5/b+R ");
      JSONTokener jSONTokener0 = new JSONTokener(stringReader0);
      char char0 = jSONTokener0.skipTo('=');
      assertTrue(jSONTokener0.end());
      assertEquals('\u0000', char0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StringReader stringReader0 = new StringReader("p'Ea");
      JSONTokener jSONTokener0 = new JSONTokener(stringReader0);
      jSONTokener0.nextClean();
      try { 
        jSONTokener0.nextValue();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unterminated string at 4 [character 5 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"");
      JSONTokener jSONTokener0 = new JSONTokener(stringReader0);
      try { 
        jSONTokener0.nextValue();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unterminated string at 1 [character 2 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[18];
      byteArray0[0] = (byte)13;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, (byte)13);
      JSONTokener jSONTokener0 = new JSONTokener(byteArrayInputStream0);
      jSONTokener0.nextTo('l');
      assertFalse(jSONTokener0.end());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("Hh");
      String string0 = jSONTokener0.nextTo('h');
      assertEquals("H", string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)38;
      byteArray0[1] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JSONTokener jSONTokener0 = new JSONTokener(byteArrayInputStream0);
      try { 
        jSONTokener0.nextString('K');
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unterminated string at 2 [character 0 line 2]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Cy{=HbqcP#XSM gY2WJ");
      JSONTokener jSONTokener0 = new JSONTokener(stringReader0);
      assertFalse(jSONTokener0.end());
      
      String string0 = jSONTokener0.next((int) (byte)1);
      assertEquals("C", string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      StringReader stringReader0 = new StringReader("]");
      JSONTokener jSONTokener0 = new JSONTokener(stringReader0);
      String string0 = jSONTokener0.next(0);
      assertFalse(jSONTokener0.end());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JSONTokener jSONTokener0 = new JSONTokener(byteArrayInputStream0);
      try { 
        jSONTokener0.next((int) (byte)13);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Substring bounds error at 0 [character 1 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\f");
      JSONTokener jSONTokener0 = new JSONTokener(stringReader0);
      jSONTokener0.nextClean();
      try { 
        jSONTokener0.next('\\');
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected '\\' and instead saw '' at 1 [character 2 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("y_iNLx}@JMF#SCuz");
      jSONTokener0.nextClean();
      jSONTokener0.nextTo('y');
      char char0 = jSONTokener0.next('\u0000');
      assertTrue(jSONTokener0.end());
      assertEquals('\u0000', char0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("Stepping back two steps is not supported");
      jSONTokener0.nextTo("d");
      jSONTokener0.nextClean();
      boolean boolean0 = jSONTokener0.more();
      assertTrue(jSONTokener0.end());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)8;
      byteArray0[2] = (byte) (-70);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, (byte)8);
      JSONTokener jSONTokener0 = new JSONTokener(byteArrayInputStream0);
      jSONTokener0.nextTo('l');
      assertTrue(jSONTokener0.end());
      
      jSONTokener0.nextValue();
      boolean boolean0 = jSONTokener0.more();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("Stepping back two steps is not supported");
      boolean boolean0 = jSONTokener0.more();
      assertFalse(jSONTokener0.end());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("Stepping back two steps is not supported");
      jSONTokener0.nextTo("d");
      jSONTokener0.nextClean();
      jSONTokener0.nextTo("Stepping back two steps is not supported");
      boolean boolean0 = jSONTokener0.end();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("Stepping back two steps is not supported");
      boolean boolean0 = jSONTokener0.end();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      int int0 = JSONTokener.dehexchar('0');
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      int int0 = JSONTokener.dehexchar('l');
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      int int0 = JSONTokener.dehexchar('\u0000');
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[1] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JSONTokener jSONTokener0 = new JSONTokener(byteArrayInputStream0);
      byteArrayInputStream0.read();
      String string0 = jSONTokener0.nextTo("0w&k?0tSz2wY|f;");
      assertEquals(0, byteArrayInputStream0.available());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)13;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JSONTokener jSONTokener0 = new JSONTokener(byteArrayInputStream0);
      String string0 = jSONTokener0.nextTo("0w&k?0tSz2wY|f;");
      assertEquals(0, byteArrayInputStream0.available());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("\f");
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
  public void test58()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("y_iNLx}@JMF#SCuz");
      jSONTokener0.nextTo("y_iNLx}@JMF#SCuz");
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
  public void test59()  throws Throwable  {
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
  public void test60()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("Stepping back two steps is not supported");
      JSONException jSONException0 = jSONTokener0.syntaxError("g back two steps is not supported");
      jSONTokener0.syntaxError("] is not a number.", (Throwable) jSONException0);
      assertFalse(jSONTokener0.end());
  }
}
