/*
 * This file was automatically generated by EvoSuite
 * Thu May 21 22:32:11 GMT 2020
 */

package org.json;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PushbackInputStream;
import java.io.Reader;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSONTokener_ESTest extends JSONTokener_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = "{\"Unterminated string\":110,\"\\u\":false}";
      JSONTokener jSONTokener0 = new JSONTokener(string0);
      jSONTokener0.nextTo('!');
      jSONTokener0.skipTo('x');
      assertTrue(jSONTokener0.end());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-97);
      byteArray0[1] = (byte)2;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JSONTokener jSONTokener0 = new JSONTokener(byteArrayInputStream0);
      jSONTokener0.nextTo('2');
      assertTrue(jSONTokener0.end());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("{\"org.json.JSONPointerException\":[],\"org.json.JSONException\":null,\"value\":true,\"u@T a3m\":false,\".json.JSONObject\":null}");
      try { 
        jSONTokener0.next('&');
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected '&' and instead saw '{' at 1 [character 2 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-50);
      byteArray0[1] = (byte) (-52);
      byteArray0[2] = (byte)89;
      byteArray0[3] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JSONTokener jSONTokener0 = new JSONTokener(byteArrayInputStream0);
      Object object0 = jSONTokener0.nextValue();
      assertEquals("\uFFFD\uFFFDY", object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = JSONTokener.dehexchar('a');
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = JSONTokener.dehexchar('F');
      assertEquals(15, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("{\"x\":\"\t\",\"y\":null,\"Illegal escape.\":true,\",:]}/\"[{;=#\":\"a string\",\"Expected a ',' or '}'\":\"a string\"}");
      try { 
        jSONTokener0.nextString('-');
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unterminated string at 101 [character 102 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("{\"Missing value\":null,\"JSONArray initial value should be a string or collection or array.\":7,\"' and instead saw '\":\"a string\",\"\f\":false,\" line \":null,\"' and instead saw ''\":99}");
      jSONTokener0.nextValue();
      assertFalse(jSONTokener0.end());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("{\"x\":\"\t\",\"y\":null,\"z\":true,\"a\":[],\"b\":\"a string\"}");
      JSONObject jSONObject0 = (JSONObject)jSONTokener0.nextValue();
      assertEquals(5, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Z( -rBq'h3");
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
  public void test10()  throws Throwable  {
      StringReader stringReader0 = new StringReader(" at 39 [character 40 line 1]");
      JSONTokener jSONTokener0 = new JSONTokener(stringReader0);
      char char0 = jSONTokener0.skipTo('1');
      assertEquals('1', char0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("' and instead saw ''");
      char char0 = jSONTokener0.skipTo('e');
      assertEquals('e', char0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("' and instead saw ''");
      String string0 = jSONTokener0.nextString('\'');
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("-99");
      jSONTokener0.nextClean();
      char char0 = jSONTokener0.nextClean();
      assertEquals('9', char0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringReader stringReader0 = new StringReader("7");
      JSONTokener jSONTokener0 = new JSONTokener(stringReader0);
      char char0 = jSONTokener0.next();
      assertEquals('7', char0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int int0 = JSONTokener.dehexchar('0');
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      JSONTokener jSONTokener0 = new JSONTokener(dataInputStream0);
      try { 
        jSONTokener0.skipTo('|');
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Pipe not connected
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(dataInputStream0);
      JSONTokener jSONTokener0 = new JSONTokener(pushbackInputStream0);
      // Undeclared exception!
      try { 
        jSONTokener0.skipTo('%');
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-66), (byte)12);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0);
      JSONTokener jSONTokener0 = new JSONTokener(pushbackInputStream0);
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
      PipedInputStream pipedInputStream0 = new PipedInputStream(92);
      JSONTokener jSONTokener0 = new JSONTokener(pipedInputStream0);
      try { 
        jSONTokener0.nextTo("Sz0");
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
      StringReader stringReader0 = new StringReader("\uFFFD\uFFFDY");
      JSONTokener jSONTokener0 = new JSONTokener(stringReader0);
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
      PipedInputStream pipedInputStream0 = new PipedInputStream(2241);
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      JSONTokener jSONTokener0 = new JSONTokener(dataInputStream0);
      try { 
        jSONTokener0.nextTo('\\');
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Pipe not connected
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-32), 3694);
      JSONTokener jSONTokener0 = new JSONTokener(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        jSONTokener0.nextTo('7');
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
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-2525), (byte)68);
      JSONTokener jSONTokener0 = new JSONTokener(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        jSONTokener0.nextString('&');
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
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-32), 3694);
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
  public void test26()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("eJW");
      // Undeclared exception!
      try { 
        jSONTokener0.next((-2442));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-45), 2737);
      JSONTokener jSONTokener0 = new JSONTokener(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        jSONTokener0.next('a');
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(46);
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
  public void test29()  throws Throwable  {
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
  public void test30()  throws Throwable  {
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      JSONTokener jSONTokener0 = new JSONTokener(dataInputStream0);
      // Undeclared exception!
      try { 
        jSONTokener0.more();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
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
  public void test32()  throws Throwable  {
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
  public void test33()  throws Throwable  {
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
  public void test34()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("Es0RC0JO!BK6s<=GrPQ");
      Object object0 = jSONTokener0.nextValue();
      assertEquals("Es0RC0JO!BK6s<", object0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("\"$md8Y\"?|+}nmn/Ps}");
      Object object0 = jSONTokener0.nextValue();
      assertEquals("$md8Y", object0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("' and instead saw ''");
      Object object0 = jSONTokener0.nextValue();
      assertEquals(" and instead saw ", object0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("[]");
      jSONTokener0.nextValue();
      assertFalse(jSONTokener0.end());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      String string0 = "{\"Unterminated string\":110,\"\\u\":false}";
      JSONTokener jSONTokener0 = new JSONTokener(string0);
      try { 
        jSONTokener0.nextString('?');
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Illegal escape. at 34 [character 35 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("]uG#H(aqk}\u0001L'y1&");
      jSONTokener0.next();
      jSONTokener0.nextClean();
      try { 
        jSONTokener0.nextString('u');
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unterminated string at 16 [character 17 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("{\"Missing value\":null,\"JSONArray initial value should be a string or collection or array.\":{},\"' and instead saw '\":-99,\"]\":false,\" line \":{\"Unable to write JSONArray value at index: \":-99},\"' and instead saw ''\":false,\"%\":false}");
      jSONTokener0.nextValue();
      char char0 = jSONTokener0.nextClean();
      assertTrue(jSONTokener0.end());
      assertEquals('\u0000', char0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener(" [character ");
      char char0 = jSONTokener0.nextClean();
      assertEquals('[', char0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("{\"x\":\"elo\",\"Unable to read the next character from the stream\":7,\"z\":false,\"a\":\"a string\",\"b\":{}}");
      assertFalse(jSONTokener0.end());
      
      String string0 = jSONTokener0.next(91);
      assertEquals("{\"x\":\"elo\",\"Unable to read the next character from the stream\":7,\"z\":false,\"a\":\"a string\",\"", string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("");
      assertFalse(jSONTokener0.end());
      
      jSONTokener0.next();
      assertTrue(jSONTokener0.end());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("' and instead saw ''");
      String string0 = jSONTokener0.nextTo("z}<d");
      assertEquals("' an", string0);
      
      char char0 = jSONTokener0.next();
      assertEquals('d', char0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("true");
      boolean boolean0 = jSONTokener0.end();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      StringReader stringReader0 = new StringReader("vsTz'm`3");
      JSONTokener jSONTokener0 = new JSONTokener(stringReader0);
      jSONTokener0.next();
      jSONTokener0.back();
      assertFalse(jSONTokener0.end());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("+6Jy");
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
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JSONTokener jSONTokener0 = new JSONTokener(byteArrayInputStream0);
      String string0 = jSONTokener0.toString();
      assertFalse(jSONTokener0.end());
      assertEquals(" at 0 [character 1 line 1]", string0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      StringReader stringReader0 = new StringReader("~^bwu)u@T a3m\b");
      JSONTokener jSONTokener0 = new JSONTokener(stringReader0);
      JSONException jSONException0 = jSONTokener0.syntaxError("p!I-O");
      MockThrowable mockThrowable0 = new MockThrowable("~^bwu)u@T a3m\b", jSONException0);
      jSONTokener0.syntaxError("~^bwu)u@T a3m\b", (Throwable) mockThrowable0);
      assertFalse(jSONTokener0.end());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
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
  public void test51()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)3;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JSONTokener jSONTokener0 = new JSONTokener(byteArrayInputStream0);
      jSONTokener0.nextTo("~");
      assertTrue(jSONTokener0.end());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JSONTokener jSONTokener0 = new JSONTokener(byteArrayInputStream0);
      jSONTokener0.nextTo("*D");
      assertFalse(jSONTokener0.end());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      String string0 = "{\"Unterminated string\":110,\"\\u\":false}";
      JSONTokener jSONTokener0 = new JSONTokener(string0);
      assertFalse(jSONTokener0.end());
      
      String string1 = jSONTokener0.nextTo(string0);
      assertEquals("", string1);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("{\"org.json.JSONPointerException\":\"Apple\",\"org.json.JSONException\":null,\"value\":true,\"value2\":false,\"number\":\"1\",\"g\":null}");
      String string0 = jSONTokener0.nextTo('g');
      assertFalse(jSONTokener0.end());
      assertEquals("{\"or", string0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      StringReader stringReader0 = new StringReader("~^bwu)u@T a3m\b");
      JSONTokener jSONTokener0 = new JSONTokener(stringReader0);
      String string0 = jSONTokener0.nextString('');
      assertEquals("~^bwu)u", string0);
      assertFalse(jSONTokener0.end());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JSONTokener jSONTokener0 = new JSONTokener(byteArrayInputStream0);
      try { 
        jSONTokener0.nextString('m');
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unterminated string at 1 [character 0 line 2]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      StringReader stringReader0 = new StringReader("~^bwu)u@T a3m\b");
      JSONTokener jSONTokener0 = new JSONTokener(stringReader0);
      jSONTokener0.nextValue();
      try { 
        jSONTokener0.nextString('');
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unterminated string at 15 [character 16 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("' and instead saw ''");
      try { 
        jSONTokener0.next(44);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Substring bounds error at 20 [character 21 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("' and instead saw ''");
      String string0 = jSONTokener0.next(0);
      assertFalse(jSONTokener0.end());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JSONTokener jSONTokener0 = new JSONTokener(byteArrayInputStream0);
      try { 
        jSONTokener0.next('\"');
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected '\"' and instead saw '
         // ' at 1 [character 0 line 2]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("{\"Missing value\":null,\"JSONArray initial value should be a string or collection or array.\":{},\"' and instead saw '\":-99,\"]\":false,\" line \":{\"Unable to write JSONArray value at index: \":-99},\"' and instead saw ''\":false,\"%\":false}");
      jSONTokener0.nextValue();
      char char0 = jSONTokener0.next('\u0000');
      assertTrue(jSONTokener0.end());
      assertEquals('\u0000', char0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("");
      assertFalse(jSONTokener0.end());
      
      boolean boolean0 = jSONTokener0.more();
      assertTrue(jSONTokener0.end());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      String string0 = "{\"Unterminated string\":110,\"\\u\":false}";
      JSONTokener jSONTokener0 = new JSONTokener(string0);
      boolean boolean0 = jSONTokener0.more();
      assertTrue(boolean0);
      assertFalse(jSONTokener0.end());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      StringReader stringReader0 = new StringReader("pTOOo8i.");
      JSONTokener jSONTokener0 = new JSONTokener(stringReader0);
      assertFalse(jSONTokener0.end());
      
      jSONTokener0.skipTo('7');
      boolean boolean0 = jSONTokener0.end();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      int int0 = JSONTokener.dehexchar('q');
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      int int0 = JSONTokener.dehexchar('A');
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      int int0 = JSONTokener.dehexchar('f');
      assertEquals(15, int0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      int int0 = JSONTokener.dehexchar('9');
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      int int0 = JSONTokener.dehexchar('\u0000');
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JSONTokener jSONTokener0 = new JSONTokener(byteArrayInputStream0);
      String string0 = jSONTokener0.nextTo('p');
      assertEquals(0, byteArrayInputStream0.available());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)43;
      byteArray0[1] = (byte)117;
      byteArray0[2] = (byte) (-18);
      byteArray0[3] = (byte)13;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JSONTokener jSONTokener0 = new JSONTokener(byteArrayInputStream0);
      String string0 = jSONTokener0.nextTo('}');
      assertFalse(jSONTokener0.end());
      assertEquals("+u\uFFFD", string0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("false");
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
  public void test73()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JSONTokener jSONTokener0 = new JSONTokener(byteArrayInputStream0);
      try { 
        jSONTokener0.next('\"');
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected '\"' and instead saw '' at 0 [character 1 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("-|");
      jSONTokener0.nextValue();
      boolean boolean0 = jSONTokener0.more();
      assertTrue(boolean0);
  }
}