/*
 * This file was automatically generated by EvoSuite
 * Fri May 22 10:19:01 GMT 2020
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
      // Undeclared exception!
      try { 
        XMLTokener.unescapeEntity("#|hE[nE9mhKPR9X_@PT");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"|hE[nE9mhKPR9X_@PT\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = XMLTokener.unescapeEntity(" rTY");
      assertEquals("& rTY;", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringReader stringReader0 = new StringReader("$13%l4KWG=`4");
      XMLTokener xMLTokener0 = new XMLTokener(stringReader0);
      xMLTokener0.nextToken();
      try { 
        xMLTokener0.nextEntity('C');
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Missing ';' in XML entity: & at 11 [character 12 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("{\"x\":\"a string\",\"\":{},\"lt\":true,\"a\":[99,[]],\"b\":{\"x\":{}}}");
      try { 
        xMLTokener0.nextCDATA();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unclosed CDATA at 57 [character 58 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("0I5]_l|?`J");
      try { 
        xMLTokener0.nextCDATA();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unclosed CDATA at 11 [character 12 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringReader stringReader0 = new StringReader("lXFHA;Y2MR{?v(Wk={");
      XMLTokener xMLTokener0 = new XMLTokener(stringReader0);
      Object object0 = xMLTokener0.nextEntity('|');
      assertEquals("&lxfha;", object0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        XMLTokener.unescapeEntity("#");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"J>^`%f3N,Q8v");
      stringReader0.close();
      XMLTokener xMLTokener0 = new XMLTokener(stringReader0);
      // Undeclared exception!
      try { 
        xMLTokener0.skipPast("\"J>^`%f3N,Q8v");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Stream closed
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("quot");
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
  public void test09()  throws Throwable  {
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
      StringReader stringReader0 = new StringReader("&\"a string\";");
      XMLTokener xMLTokener0 = new XMLTokener(stringReader0);
      xMLTokener0.skipPast(" line ");
      assertTrue(xMLTokener0.end());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("&{\"fruit\":\"Apple\",\"size\":\"Large\",\"color\":true,\"value\":true,\"<\":false,\"number\":\"1\",\"x\":{}};");
      xMLTokener0.skipPast("{\"fruit\":\"Apple\",\"size\":\"Large\",\"color\":true,\"value\":true,\"<\":false,\"number\":\"1\",\"x\":{}}");
      assertFalse(xMLTokener0.end());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("v;s7:I");
      xMLTokener0.skipPast("!}5q&.t}Elp");
      assertTrue(xMLTokener0.end());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("9&wX8]z4yC");
      Object object0 = xMLTokener0.nextToken();
      assertEquals("9&wX8", object0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringReader stringReader0 = new StringReader("^G%ofEe5Er[P[$&");
      XMLTokener xMLTokener0 = new XMLTokener(stringReader0);
      Object object0 = xMLTokener0.nextToken();
      assertEquals("^G%ofEe5Er", object0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("bU?#jLld/9(");
      Object object0 = xMLTokener0.nextToken();
      assertEquals("bU", object0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("I<`f@MJ}U");
      try { 
        xMLTokener0.nextToken();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Bad character in a name at 2 [character 3 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringReader stringReader0 = new StringReader("@P{RQzN/(utEiP*");
      XMLTokener xMLTokener0 = new XMLTokener(stringReader0);
      Object object0 = xMLTokener0.nextToken();
      assertEquals("@P{RQzN", object0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("UFcj\"");
      try { 
        xMLTokener0.nextToken();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Bad character in a name at 5 [character 6 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("$!8e[NL");
      Object object0 = xMLTokener0.nextToken();
      assertEquals("$", object0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Zj:Qq>RKe3KrTX");
      XMLTokener xMLTokener0 = new XMLTokener(stringReader0);
      xMLTokener0.nextToken();
      Object object0 = xMLTokener0.nextToken();
      assertEquals('>', object0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringReader stringReader0 = new StringReader("$13%l4KWG=`4");
      XMLTokener xMLTokener0 = new XMLTokener(stringReader0);
      xMLTokener0.nextToken();
      Object object0 = xMLTokener0.nextToken();
      assertEquals('=', object0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringReader stringReader0 = new StringReader("p+sKi<X- *RgNa^F@");
      XMLTokener xMLTokener0 = new XMLTokener(stringReader0);
      xMLTokener0.nextMeta();
      try { 
        xMLTokener0.nextToken();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misplaced '<' at 6 [character 7 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringReader stringReader0 = new StringReader("/.yWB[d");
      XMLTokener xMLTokener0 = new XMLTokener(stringReader0);
      Object object0 = xMLTokener0.nextToken();
      assertEquals('/', object0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("' and instead saw '");
      Object object0 = xMLTokener0.nextToken();
      assertEquals(" and instead saw ", object0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("!i,2OU'OXpmJb");
      Object object0 = xMLTokener0.nextToken();
      assertEquals('!', object0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StringReader stringReader0 = new StringReader("5ORe$bU|s GJs");
      XMLTokener xMLTokener0 = new XMLTokener(stringReader0);
      xMLTokener0.nextToken();
      xMLTokener0.back();
      Object object0 = xMLTokener0.nextToken();
      assertEquals("GJs", object0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StringReader stringReader0 = new StringReader("lXFHA;Y2MR{?v(Wk={");
      XMLTokener xMLTokener0 = new XMLTokener(stringReader0);
      Object object0 = xMLTokener0.nextMeta();
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StringReader stringReader0 = new StringReader("+1p;>-u5H77'T");
      XMLTokener xMLTokener0 = new XMLTokener(stringReader0);
      xMLTokener0.nextMeta();
      XMLTokener xMLTokener1 = new XMLTokener(stringReader0);
      try { 
        xMLTokener1.nextToken();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Bad character in a name at 7 [character 8 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("|Hp=+gm*3dz6hNh");
      Object object0 = xMLTokener0.nextMeta();
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener(" l/jb");
      Object object0 = xMLTokener0.nextMeta();
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("jmrJ'M3{T)e>ek8K");
      Object object0 = xMLTokener0.nextMeta();
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("K!");
      Object object0 = xMLTokener0.nextMeta();
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?%WT");
      XMLTokener xMLTokener0 = new XMLTokener(stringReader0);
      xMLTokener0.nextToken();
      Object object0 = xMLTokener0.nextMeta();
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StringReader stringReader0 = new StringReader("5ORe$bU|s GJs");
      XMLTokener xMLTokener0 = new XMLTokener(stringReader0);
      Object object0 = xMLTokener0.nextMeta();
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("?>");
      Object object0 = xMLTokener0.nextMeta();
      assertEquals('?', object0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener(">");
      Object object0 = xMLTokener0.nextMeta();
      assertEquals('>', object0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("=#L-fr{");
      Object object0 = xMLTokener0.nextMeta();
      assertEquals('=', object0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      StringReader stringReader0 = new StringReader("5<");
      XMLTokener xMLTokener0 = new XMLTokener(stringReader0);
      xMLTokener0.nextMeta();
      xMLTokener0.nextMeta();
      try { 
        xMLTokener0.nextToken();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped element at 2 [character 3 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("/");
      Object object0 = xMLTokener0.nextMeta();
      assertEquals('/', object0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
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
  public void test43()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"a string\"");
      XMLTokener xMLTokener0 = new XMLTokener(stringReader0);
      Object object0 = xMLTokener0.nextMeta();
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("!Sj:uX}+iap'R");
      Object object0 = xMLTokener0.nextMeta();
      assertEquals('!', object0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      StringReader stringReader0 = new StringReader("org.json.JSONPointerException");
      XMLTokener xMLTokener0 = new XMLTokener(stringReader0);
      xMLTokener0.nextToken();
      try { 
        xMLTokener0.nextMeta();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped meta tag at 29 [character 30 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"a\" string\"");
      XMLTokener xMLTokener0 = new XMLTokener(stringReader0);
      xMLTokener0.nextToken();
      xMLTokener0.nextMeta();
      try { 
        xMLTokener0.nextToken();
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
      // Undeclared exception!
      try { 
        XMLTokener.unescapeEntity("#x>o~N72q]\"");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \">o~N72q]\"\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      String string0 = XMLTokener.unescapeEntity("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      String string0 = XMLTokener.unescapeEntity((String) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("\"J>^`%f3;N,&8v");
      try { 
        xMLTokener0.nextToken();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Missing ';' in XML entity: &8v at 14 [character 15 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("#l;}R{Rle");
      // Undeclared exception!
      try { 
        xMLTokener0.nextEntity('D');
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"l\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("&quot;");
      xMLTokener0.nextContent();
      assertTrue(xMLTokener0.end());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("C=\"+tpvB<D?w18D![sg");
      Object object0 = xMLTokener0.nextContent();
      assertEquals("C=\"+tpvB", object0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("<}t1k`^/c=qm>}7");
      Object object0 = xMLTokener0.nextContent();
      assertNotNull(object0);
      assertEquals('<', object0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      StringReader stringReader0 = new StringReader("#!u+.>+");
      XMLTokener xMLTokener0 = new XMLTokener(stringReader0);
      xMLTokener0.skipPast("#!u+.>+");
      Object object0 = xMLTokener0.nextContent();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener(" and ");
      xMLTokener0.nextContent();
      assertTrue(xMLTokener0.end());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      XMLTokener xMLTokener0 = new XMLTokener("&]]?0!cJ;");
      try { 
        xMLTokener0.nextCDATA();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unclosed CDATA at 9 [character 10 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }
}