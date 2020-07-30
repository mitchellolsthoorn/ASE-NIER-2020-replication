/*
 * This file was automatically generated by EvoSuite
 * Fri May 22 16:51:12 GMT 2020
 */

package org.json;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Reader;
import java.io.StringReader;
import java.util.Collection;
import java.util.Locale;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XML_ESTest extends XML_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = XML.unescape("rZr~Xo#-,");
      assertEquals("rZr~Xo#-,", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = XML.unescape("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      String string0 = XML.toString((Object) jSONArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<tkos>java.lang.String@0000000006</tkos>");
      JSONObject jSONObject0 = XML.toJSONObject((Reader) stringReader0);
      assertEquals(1, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = XML.escape("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        XML.unescape((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.json.XML", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.put(3094, (-993));
      // Undeclared exception!
      XML.toString((Object) jSONArray0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      XML.toJSONObject("Missing '>' after '<!'.", true);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        XML.toJSONObject((String) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        XML.toJSONObject((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Missing '>' after '<!'.");
      // Undeclared exception!
      XML.toJSONObject((Reader) stringReader0, false);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        XML.toJSONObject((Reader) null, false);
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
      StringReader stringReader0 = new StringReader("#(o+fJ<5SGJ';/G");
      try { 
        XML.toJSONObject((Reader) stringReader0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Bad character in a name at 12 [character 13 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringReader stringReader0 = new StringReader("y!<!(}c[");
      // Undeclared exception!
      XML.toJSONObject((Reader) stringReader0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        XML.toJSONObject((Reader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        XML.stringToValue((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        XML.noSpace((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.json.XML", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.put(45, 1218.3F);
      XML.toString((Object) jSONArray0);
      String string0 = XML.toString((Object) jSONArray0);
      String string1 = XML.escape(string0);
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        XML.escape((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = XML.toString((Object) "TfTs7o{9QgYY~d:Da", (String) null);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = XML.toString((Object) "7m}-,5'", "7m}-,5'");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = XML.toString((Object) null, "ofS]");
      assertEquals("<ofS]>null</ofS]>", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"fruit\":\"Apple\",\"size\":\"Large\",\"color\":99,\"value\":true,\"value2\":false,\"number\":\"1\"}");
      JSONObject jSONObject0 = XML.toJSONObject((Reader) stringReader0, false);
      assertTrue(jSONObject0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Object object0 = XML.stringToValue("a");
      assertEquals("a", object0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JSONObject jSONObject0 = XML.toJSONObject("<Tfrs7k${9QgYY~d:Da><bytes>java.lang.Byte@0000000003</bytes><bytes>java.lang.Byte@0000000006</bytes><bytes>java.lang.Byte@0000000009</bytes><bytes>java.lang.Byte@0000000012</bytes><bytes>java.lang.Byte@0000000015</bytes><bytes>java.lang.Byte@0000000018</bytes><bytes>java.lang.Byte@0000000021</bytes><bytes>java.lang.Byte@0000000024</bytes><bytes>java.lang.Byte@0000000027</bytes><bytes>java.lang.Byte@0000000030</bytes><bytes>java.lang.Byte@0000000033</bytes><bytes>java.lang.Byte@0000000036</bytes><bytes>java.lang.Byte@0000000039</bytes><bytes>java.lang.Byte@0000000042</bytes><bytes>java.lang.Byte@0000000045</bytes><bytes>java.lang.Byte@0000000048</bytes><bytes>java.lang.Byte@0000000051</bytes><bytes>java.lang.Byte@0000000054</bytes><empty>java.lang.Boolean@0000000057</empty></Tfrs7k${9QgYY~d:Da>");
      assertEquals(1, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Locale locale0 = Locale.TAIWAN;
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      jSONArray0.put(63, (Collection<?>) set0);
      String string0 = XML.toString((Object) jSONArray0, "-0");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.put(510, false);
      // Undeclared exception!
      XML.toString((Object) jSONArray0, (String) null);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JSONObject jSONObject0 = XML.toJSONObject("apos");
      jSONObject0.accumulate("", "");
      String string0 = XML.toString((Object) jSONObject0, "Yg[38f}");
      assertEquals("<Yg[38f}></></Yg[38f}>", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.increment("content");
      String string0 = XML.toString((Object) jSONObject0, "content");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StringReader stringReader0 = new StringReader("0r6Jx/ou6*6i4");
      JSONObject jSONObject0 = XML.toJSONObject((Reader) stringReader0);
      String string0 = XML.toString((Object) jSONObject0, (String) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Object object0 = XML.stringToValue("9");
      assertEquals(9, object0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Object object0 = XML.stringToValue("4x#:]Eb l}(hs");
      assertEquals("4x#:]Eb l}(hs", object0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Object object0 = XML.stringToValue("4x#:]eb l}(hs");
      assertEquals("4x#:]eb l}(hs", object0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Object object0 = XML.stringToValue("7v.e60s{qk)1e5]e");
      assertEquals("7v.e60s{qk)1e5]e", object0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Object object0 = XML.stringToValue("-0");
      assertEquals(-0.0, object0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Object object0 = XML.stringToValue("0000");
      assertEquals("0000", object0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Object object0 = XML.stringToValue("null");
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Object object0 = XML.stringToValue("false");
      assertEquals(false, object0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Object object0 = XML.stringToValue("true");
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Object object0 = XML.stringToValue("");
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<Ygf38f}></Ygf38f}>");
      JSONObject jSONObject0 = XML.toJSONObject((Reader) stringReader0, true);
      assertEquals(1, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      try { 
        XML.toJSONObject("*}p{QuM'E<7-TO>$F", true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unclosed tag 7-TO at 17 [character 18 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      try { 
        XML.toJSONObject(".pjz\"L~4#Q<@/7w", false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped tag at 15 [character 16 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      try { 
        XML.toJSONObject("i!<XBC8 (EjK)`WAb=$G", true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped element at 20 [character 21 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      try { 
        XML.toJSONObject("i!<XBC8 (jK)`WAb=$!");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped tag at 19 [character 20 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      try { 
        XML.toJSONObject("))|&,c>8<=.e");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped tag at 10 [character 11 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<Uncosed tags><Unclosed tag >ava.lang.Integer@0000000006</Unclosed ag ></Unclosed tag >");
      try { 
        XML.toJSONObject((Reader) stringReader0, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped close tag at 70 [character 71 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      try { 
        XML.toJSONObject("<Unclosed tags><nclosed tag >ava.lang.Integer@0000000006</Unlosed tag ></Unclosed tag >");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Mismatched nclosed and Unlosed at 66 [character 67 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<Unclosed tag >java.lang.Integer@0000000001</Unclosed tag >");
      char[] charArray0 = new char[2];
      stringReader0.read(charArray0);
      try { 
        XML.toJSONObject((Reader) stringReader0, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Mismatched close tag Unclosed at 52 [character 53 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      JSONObject jSONObject0 = XML.toJSONObject("<?T-.kwjg25", true);
      assertEquals(0, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      // Undeclared exception!
      XML.toJSONObject("Missin '>' after '<!].");
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      try { 
        XML.noSpace(" q1$3jl~(zepmv$");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // ' q1$3jl~(zepmv$' contains a space character.
         //
         verifyException("org.json.XML", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      try { 
        XML.noSpace("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Empty string.
         //
         verifyException("org.json.XML", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      XML.noSpace("<0>null</0>");
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      String string0 = XML.unescape("&quot;");
      assertEquals("\"", string0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      String string0 = XML.unescape("&amp");
      assertEquals("&amp", string0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      String string0 = XML.escape("Kv[- ?=g4$Bi/+>");
      assertEquals("Kv[- ?=g4$Bi/+&gt;", string0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      String string0 = XML.escape("/hy7FfK'8,ZZ~");
      assertEquals("/hy7FfK&apos;&#x7f;8,ZZ~", string0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      String string0 = XML.escape("&amp");
      assertEquals("&amp;amp", string0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      String string0 = XML.escape(".pjz\"L~4#Q<@/7w");
      assertEquals(".pjz&quot;L~4#Q&lt;@/7w", string0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      JSONObject jSONObject0 = XML.toJSONObject("<Ygf38fp><Ygf38fp>java.lang.Double@0000000002</Ygf38fp></Ygf38fp>");
      assertEquals(1, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      JSONObject jSONObject0 = XML.toJSONObject("<-0><bytes>java.lang.Byte@0000000003</bytes><bytes>java.lang.Byte@0000000006</bytes><empty>java.lang.Boolean@0000000009</empty></-0>", false);
      assertEquals(1, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      XML xML0 = new XML();
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject((Object) "-0");
      JSONArray jSONArray0 = new JSONArray();
      jSONObject0.append("IG-tkF$\"v0;", jSONArray0);
      String string0 = XML.toString((Object) jSONObject0, "-0");
      assertNotNull(string0);
  }
}