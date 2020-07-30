/*
 * This file was automatically generated by EvoSuite
 * Thu May 21 16:31:51 GMT 2020
 */

package org.json;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Reader;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.json.XMLTokener;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XMLTokener_ESTest extends XMLTokener_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("&%]:Sl3r=#)RRYR;");
      xMLTokener0.skipPast(":3Ta @@j");
      assertTrue(xMLTokener0.end());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringReader stringReader0 = new StringReader("' contains a space character.");
      XMLTokener xMLTokener0 = new XMLTokener(stringReader0);
      try { 
        xMLTokener0.nextToken();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unterminated string at 29 [character 30 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("']9K& ");
      try { 
        xMLTokener0.nextToken();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Missing ';' in XML entity: & at 6 [character 7 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("' contains a space character.");
      try { 
        xMLTokener0.nextMeta();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unterminated string at 29 [character 30 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        XMLTokener.unescapeEntity("#{ u{9X");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"{ u{9X\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = XMLTokener.unescapeEntity("\"j");
      assertEquals("&\"j;", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("] could not be converted to BigInteger.");
      try { 
        xMLTokener0.nextCDATA();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unclosed CDATA at 39 [character 40 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        XMLTokener.unescapeEntity("#");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringReader stringReader0 = new StringReader("L");
      stringReader0.close();
      XMLTokener xMLTokener0 = new XMLTokener(stringReader0);
      // Undeclared exception!
      try { 
        xMLTokener0.skipPast("L");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Stream closed
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("2l\"J$p1uNxO,+z");
      // Undeclared exception!
      try { 
        xMLTokener0.skipPast((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.json.XMLTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XMLTokener xMLTokener0 = null;
      try {
        xMLTokener0 = new XMLTokener((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XMLTokener xMLTokener0 = null;
      try {
        xMLTokener0 = new XMLTokener((Reader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Q+PDu9F;vM-lRO");
      XMLTokener xMLTokener0 = new XMLTokener(stringReader0);
      char[] charArray0 = new char[4];
      stringReader0.read(charArray0);
      Object object0 = xMLTokener0.nextEntity('9');
      assertEquals("&u9f;", object0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringReader stringReader0 = new StringReader("#iFN#K1<&mL]aS\"t");
      XMLTokener xMLTokener0 = new XMLTokener(stringReader0);
      try { 
        xMLTokener0.nextEntity('&');
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Missing ';' in XML entity: &#ifn#k1 at 8 [character 9 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("^I7yy$PnCuj(*^*");
      xMLTokener0.nextContent();
      xMLTokener0.skipPast("^I7yy$PnCuj(*^*");
      assertTrue(xMLTokener0.end());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringReader stringReader0 = new StringReader("q59&^@+>hfj/6J'b.");
      XMLTokener xMLTokener0 = new XMLTokener(stringReader0);
      xMLTokener0.skipPast("q59&^@+>hfj/6J'b.");
      assertFalse(xMLTokener0.end());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringReader stringReader0 = new StringReader("%]:Sl3r=#)RRYR");
      XMLTokener xMLTokener0 = new XMLTokener(stringReader0);
      Object object0 = xMLTokener0.nextToken();
      assertEquals("%", object0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("e[J.");
      Object object0 = xMLTokener0.nextToken();
      assertEquals("e", object0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("%~>Z@#O}uk^/Wy");
      Object object0 = xMLTokener0.nextToken();
      assertEquals("%~", object0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("D4=0Q~f");
      Object object0 = xMLTokener0.nextToken();
      assertEquals("D4", object0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringReader stringReader0 = new StringReader("q59&^@+>hfj/6J'b.");
      XMLTokener xMLTokener0 = new XMLTokener(stringReader0);
      XMLTokener xMLTokener1 = new XMLTokener(stringReader0);
      xMLTokener1.nextMeta();
      Object object0 = xMLTokener0.nextToken();
      assertEquals("hfj", object0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("#q'");
      try { 
        xMLTokener0.nextToken();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Bad character in a name at 3 [character 4 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("2l\"J$p1uNxO,+z");
      try { 
        xMLTokener0.nextToken();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Bad character in a name at 3 [character 4 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("#9");
      Object object0 = xMLTokener0.nextToken();
      assertEquals("#9", object0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("\"onp&>nT9S/'VEqE.km");
      try { 
        xMLTokener0.nextToken();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Missing ';' in XML entity: & at 6 [character 7 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("?");
      Object object0 = xMLTokener0.nextToken();
      assertEquals('?', object0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringReader stringReader0 = new StringReader(">v?]Fh-U.w");
      XMLTokener xMLTokener0 = new XMLTokener(stringReader0);
      Object object0 = xMLTokener0.nextToken();
      assertEquals('>', object0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("<");
      try { 
        xMLTokener0.nextToken();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misplaced '<' at 1 [character 2 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("mvQIQ7!_;XbaG>'DD(&");
      xMLTokener0.nextMeta();
      Object object0 = xMLTokener0.nextToken();
      assertEquals('!', object0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("");
      try { 
        xMLTokener0.nextToken();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped element at 0 [character 1 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener(" at ");
      Object object0 = xMLTokener0.nextToken();
      assertEquals("at", object0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("j(?F4GYw%wNsn");
      Object object0 = xMLTokener0.nextMeta();
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StringReader stringReader0 = new StringReader("%]:Sl3r=#)RRYR");
      XMLTokener xMLTokener0 = new XMLTokener(stringReader0);
      xMLTokener0.nextMeta();
      Object object0 = xMLTokener0.nextToken();
      assertEquals('=', object0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("#iFN#K1<&mL]aS\"t");
      Object object0 = xMLTokener0.nextMeta();
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("Tl}:5vUR/5");
      xMLTokener0.nextMeta();
      Object object0 = xMLTokener0.nextToken();
      assertEquals('/', object0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StringReader stringReader0 = new StringReader(":0mVKoc|j{*\"Bx");
      XMLTokener xMLTokener0 = new XMLTokener(stringReader0);
      xMLTokener0.nextMeta();
      try { 
        xMLTokener0.nextToken();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unterminated string at 14 [character 15 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StringReader stringReader0 = new StringReader("WF!$g9wt!");
      XMLTokener xMLTokener0 = new XMLTokener(stringReader0);
      xMLTokener0.nextMeta();
      xMLTokener0.nextMeta();
      Object object0 = xMLTokener0.nextToken();
      assertEquals("$g9wt", object0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("q0m,ZKagVZD]]xzqU");
      Object object0 = xMLTokener0.nextMeta();
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("Misplaced '<'");
      xMLTokener0.nextMeta();
      Object object0 = xMLTokener0.nextToken();
      assertEquals("<", object0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("?.SE8g~@GXAW?J(W");
      Object object0 = xMLTokener0.nextMeta();
      assertEquals('?', object0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener(">v?]Fh-U.w");
      Object object0 = xMLTokener0.nextMeta();
      assertEquals('>', object0);
      
      Object object1 = xMLTokener0.nextToken();
      assertEquals("v", object1);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("=%^|k%7");
      Object object0 = xMLTokener0.nextMeta();
      assertEquals('=', object0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<C(7:<M $c");
      XMLTokener xMLTokener0 = new XMLTokener(stringReader0);
      xMLTokener0.nextMeta();
      try { 
        xMLTokener0.nextToken();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Bad character in a name at 6 [character 7 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("/");
      Object object0 = xMLTokener0.nextMeta();
      assertEquals('/', object0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("\"\"");
      Object object0 = xMLTokener0.nextMeta();
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("");
      try { 
        xMLTokener0.nextMeta();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped meta tag at 0 [character 1 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener(" (C'TP4LZJ~P");
      Object object0 = xMLTokener0.nextMeta();
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      // Undeclared exception!
      try { 
        XMLTokener.unescapeEntity("#xW:*|o*}fig=");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"W:*|o*}fig=\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      String string0 = XMLTokener.unescapeEntity("#9");
      assertEquals("\t", string0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      String string0 = XMLTokener.unescapeEntity("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      String string0 = XMLTokener.unescapeEntity((String) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("&apos;");
      xMLTokener0.nextContent();
      assertTrue(xMLTokener0.end());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("&#x");
      try { 
        xMLTokener0.nextContent();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Missing ';' in XML entity: &#x at 3 [character 4 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("#iFN#K1<&mL]aS\"t");
      Object object0 = xMLTokener0.nextContent();
      assertEquals("#iFN#K1", object0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("<$xq");
      Object object0 = xMLTokener0.nextContent();
      assertEquals('<', object0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("");
      Object object0 = xMLTokener0.nextContent();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener(" (C'TP4LZJ~P");
      xMLTokener0.nextContent();
      assertTrue(xMLTokener0.end());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("q0m,ZKagVZD]]xzqU");
      try { 
        xMLTokener0.nextCDATA();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unclosed CDATA at 17 [character 18 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("F]]&");
      try { 
        xMLTokener0.nextCDATA();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unclosed CDATA at 4 [character 5 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }
}