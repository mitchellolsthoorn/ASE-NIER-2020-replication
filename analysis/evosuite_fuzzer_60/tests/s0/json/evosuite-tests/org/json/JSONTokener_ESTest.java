/*
 * This file was automatically generated by EvoSuite
 * Fri May 22 07:34:09 GMT 2020
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
      int int0 = JSONTokener.dehexchar('f');
      assertEquals(15, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = JSONTokener.dehexchar('A');
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = JSONTokener.dehexchar('9');
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("Y3\"");
      char char0 = jSONTokener0.skipTo('3');
      assertEquals('3', char0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("org.json.JSONTokener");
      char char0 = jSONTokener0.skipTo('o');
      assertEquals('o', char0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("{\"fruit\":false,\"size\":\"Large\",\"color\":\"Red\",\"value\":true,\"value2\":fase,\"numbeN\":\"1\"}");
      jSONTokener0.nextTo('A');
      jSONTokener0.nextTo('\u0000');
      assertTrue(jSONTokener0.end());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"fruit\":true,\",:]}/\"[{;=#\":\"Large\",\"true\":null,\"\":\"a string\",\"Missing value\":false,\"x\":null}");
      JSONTokener jSONTokener0 = new JSONTokener(stringReader0);
      jSONTokener0.nextString('i');
      jSONTokener0.nextString('i');
      char char0 = jSONTokener0.next('n');
      assertEquals('n', char0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("99");
      char char0 = jSONTokener0.next();
      assertEquals('9', char0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("S#T");
      char char0 = jSONTokener0.next();
      assertEquals('S', char0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int int0 = JSONTokener.dehexchar('0');
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(2960);
      JSONTokener jSONTokener0 = new JSONTokener(pipedInputStream0);
      try { 
        jSONTokener0.skipTo(')');
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Pipe not connected
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-504), 59);
      JSONTokener jSONTokener0 = new JSONTokener(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        jSONTokener0.skipTo('x');
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
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
  public void test13()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("S#T");
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
  public void test14()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      JSONTokener jSONTokener0 = new JSONTokener(pipedInputStream0);
      try { 
        jSONTokener0.nextTo(' ');
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Pipe not connected
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-6), (byte)45);
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
  public void test16()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("d>D}[po<KK<G");
      // Undeclared exception!
      try { 
        jSONTokener0.next((-664));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      JSONTokener jSONTokener0 = new JSONTokener(dataInputStream0);
      // Undeclared exception!
      try { 
        jSONTokener0.next('\u0000');
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
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      JSONTokener jSONTokener0 = new JSONTokener(mockFileInputStream0);
      try { 
        jSONTokener0.next();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(3915);
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
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-55), (byte)57);
      JSONTokener jSONTokener0 = new JSONTokener(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        jSONTokener0.more();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
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
  public void test22()  throws Throwable  {
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
  public void test23()  throws Throwable  {
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
  public void test24()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("{\"fruit\":\"Apple\",\"size\":\"Large\",\"color\":null,\"value\":true,\"value2\":false,\"number\":\"1\"}");
      char char0 = jSONTokener0.nextClean();
      assertEquals('{', char0);
      
      Object object0 = jSONTokener0.nextValue();
      assertEquals("fruit", object0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("[{R~SY;");
      try { 
        jSONTokener0.nextValue();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected a ':' after a key at 7 [character 8 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("5<o+9K>B (C\"EpH!=%");
      try { 
        jSONTokener0.nextString('6');
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unterminated string at 18 [character 19 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"fruit\":\"Apple\",\"size\":\"Large\",\"color\":\"Red\",\"value\":true,\"value2\":-99,\"number\":\"1\"}");
      JSONTokener jSONTokener0 = new JSONTokener(stringReader0);
      jSONTokener0.nextValue();
      char char0 = jSONTokener0.nextClean();
      assertTrue(jSONTokener0.end());
      assertEquals('\u0000', char0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener(" at ");
      char char0 = jSONTokener0.nextClean();
      assertEquals('a', char0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("Unterminated string");
      jSONTokener0.nextTo('S');
      char char0 = jSONTokener0.next();
      assertTrue(jSONTokener0.end());
      assertEquals('\u0000', char0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("S#T");
      Object object0 = jSONTokener0.nextValue();
      assertEquals("S", object0);
      
      char char0 = jSONTokener0.next();
      assertFalse(jSONTokener0.end());
      assertEquals('#', char0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener(" at ");
      jSONTokener0.nextTo('H');
      boolean boolean0 = jSONTokener0.end();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("' and instead saw ''");
      jSONTokener0.nextString('\'');
      jSONTokener0.back();
      assertFalse(jSONTokener0.end());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("' and instead saw ''");
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
      JSONTokener jSONTokener0 = new JSONTokener("Unterminated string");
      JSONException jSONException0 = jSONTokener0.syntaxError("");
      assertNotNull(jSONException0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("Unterminated string");
      String string0 = jSONTokener0.toString();
      assertEquals(" at 0 [character 1 line 1]", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"fruit\":true,\",:]}/\"[{;=#\":\"Large\",\"true\":null,\"\":\"a stri,g\",\"Missing value\":fwlse,\"x\":null}");
      JSONTokener jSONTokener0 = new JSONTokener(stringReader0);
      char char0 = jSONTokener0.skipTo(',');
      assertEquals(',', char0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StringReader stringReader0 = new StringReader("' and instead saw ''");
      JSONTokener jSONTokener0 = new JSONTokener(stringReader0);
      Object object0 = jSONTokener0.nextValue();
      assertEquals(" and instead saw ", object0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("{\"fruit\":false,\"size\":\"Large\",\"color\":\"Red\",\"value\":true,\"value2\":false,\"number\":\"1\"}");
      jSONTokener0.nextTo('A');
      jSONTokener0.nextTo("Expected a ':' after a key");
      assertTrue(jSONTokener0.end());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("5<o+9K>B (C\"EpH!=%");
      String string0 = jSONTokener0.nextTo("5<o+9K>B (C\"EpH!=%");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("5s;)9l6%g]");
      String string0 = jSONTokener0.nextTo('9');
      assertEquals("5s;)", string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)6;
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
  public void test42()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("5<o+9K>B (C\"EpH!=%");
      assertFalse(jSONTokener0.end());
      
      String string0 = jSONTokener0.next(14);
      assertEquals("5<o+9K>B (C\"Ep", string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("Unterminated string");
      String string0 = jSONTokener0.next(0);
      assertFalse(jSONTokener0.end());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("pQz<I!ivy");
      jSONTokener0.nextValue();
      jSONTokener0.skipTo('3');
      try { 
        jSONTokener0.next('4');
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected '4' and instead saw '' at 8 [character 9 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"fruit\":true,\",:]}/\"[{;=#\":\"Large\",\"true\":null,\"\":\"a stri,g\",\"Missing value\":fwlse,\"x\":null}");
      JSONTokener jSONTokener0 = new JSONTokener(stringReader0);
      jSONTokener0.nextString('i');
      String string0 = jSONTokener0.nextString('i');
      assertEquals("t\":true,\",:]}/\"[{;=#\":\"Large\",\"true\":null,\"\":\"a str", string0);
      
      char char0 = jSONTokener0.next(',');
      assertEquals(',', char0);
      assertFalse(jSONTokener0.end());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("Unterminated string");
      assertFalse(jSONTokener0.end());
      
      jSONTokener0.nextTo('S');
      boolean boolean0 = jSONTokener0.more();
      assertTrue(jSONTokener0.end());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("5<o+\u0001K>a (C\"EpH!=F%");
      jSONTokener0.nextValue();
      boolean boolean0 = jSONTokener0.more();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"fruit\":true,\",:]}/\"[{;=#\":\"Large\",\"true\":null,\"\":\"a stri,g\",\"Missing value\":fwlse,\"x\":null}");
      JSONTokener jSONTokener0 = new JSONTokener(stringReader0);
      boolean boolean0 = jSONTokener0.more();
      assertTrue(boolean0);
      assertFalse(jSONTokener0.end());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("5<o+9K>B (C\"EpH!=%");
      jSONTokener0.nextValue();
      try { 
        jSONTokener0.next(14);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Substring bounds error at 18 [character 19 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("' and instead saw ''");
      boolean boolean0 = jSONTokener0.end();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      int int0 = JSONTokener.dehexchar('d');
      assertEquals(13, int0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      int int0 = JSONTokener.dehexchar('}');
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      int int0 = JSONTokener.dehexchar('F');
      assertEquals(15, int0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      int int0 = JSONTokener.dehexchar('\'');
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)47;
      byteArray0[1] = (byte)76;
      byteArray0[2] = (byte)13;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JSONTokener jSONTokener0 = new JSONTokener(byteArrayInputStream0);
      String string0 = jSONTokener0.nextTo("-");
      assertEquals(0, byteArrayInputStream0.available());
      assertEquals("/L", string0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("pQLdz<IX!ivy");
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
  public void test57()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener(" at ");
      jSONTokener0.syntaxError(" at ", (Throwable) null);
      assertFalse(jSONTokener0.end());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      StringReader stringReader0 = new StringReader("' and instead saw ''");
      JSONTokener jSONTokener0 = new JSONTokener(stringReader0);
      try { 
        jSONTokener0.next('\u0000');
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected '\u0000' and instead saw ''' at 1 [character 2 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("{\"fruit\":false,\"size\":\"s\",\"color\":\"Red\",\"value\":[],\"value2\":false,\"number\":\"1\"}");
      String string0 = jSONTokener0.nextTo("' and instead saw ''");
      assertEquals("{\"fru", string0);
  }
}
