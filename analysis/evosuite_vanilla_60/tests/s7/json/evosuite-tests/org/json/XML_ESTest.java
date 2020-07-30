/*
 * This file was automatically generated by EvoSuite
 * Wed May 20 13:33:04 GMT 2020
 */

package org.json;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.Reader;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
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
      Object object0 = XML.stringToValue("9\"");
      assertEquals("9\"", object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Object object0 = XML.stringToValue("0x7t*%\u0003|Pq");
      assertEquals("0x7t*%\u0003|Pq", object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = XML.unescape("Missing '>' after '<!'.");
      assertEquals("Missing '>' after '<!'.", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = XML.unescape("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSONObject jSONObject0 = XML.toJSONObject("T 'qZ");
      String string0 = XML.toString((Object) jSONObject0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSONObject jSONObject0 = XML.toJSONObject("", true);
      assertTrue(jSONObject0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSONObject jSONObject0 = XML.toJSONObject("<RxQwDRi#(TuPQ3r1i>java.lang.String@0000000004</RxQwDRi#(TuPQ3r1i>", true);
      assertFalse(jSONObject0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = XML.escape("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
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
  public void test09()  throws Throwable  {
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
  public void test10()  throws Throwable  {
      // Undeclared exception!
      XML.toJSONObject("Missing '>' after '<!'.");
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
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
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        XML.toJSONObject((Reader) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Q/}<^7m]>-?trN");
      try { 
        XML.toJSONObject((Reader) stringReader0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unclosed tag ^7m at 14 [character 15 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
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
  public void test18()  throws Throwable  {
      Locale.Category locale_Category0 = Locale.Category.DISPLAY;
      String string0 = XML.toString((Object) locale_Category0, (String) null);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = XML.toString((Object) "3[?}k", "3[?}k");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringReader stringReader0 = new StringReader("]G\"Ur7% t>!fKgXt<");
      JSONObject jSONObject0 = XML.toJSONObject((Reader) stringReader0, false);
      assertTrue(jSONObject0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<\"java.lang.string@0000000001\">java.lang.string@0000000002</\"java.lang.string@0000000001\">");
      JSONObject jSONObject0 = XML.toJSONObject((Reader) stringReader0, false);
      assertEquals(1, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Object object0 = XML.stringToValue("}?\"cL>neS");
      assertEquals("}?\"cL>neS", object0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Object object0 = XML.stringToValue("&amp;");
      assertEquals("&amp;", object0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Object object0 = XML.stringToValue("null");
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.put(2330.24F);
      String string0 = XML.toString((Object) jSONArray1);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String string0 = XML.toString((Object) null, "Illegal esf{p.");
      assertEquals("<Illegal esf{p.>null</Illegal esf{p.>", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.put(2316.182F);
      HashMap<InputStream, JSONArray> hashMap0 = new HashMap<InputStream, JSONArray>();
      PipedInputStream pipedInputStream0 = new PipedInputStream(6);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0, 6);
      hashMap0.put(bufferedInputStream0, jSONArray1);
      jSONArray0.put((Map<?, ?>) hashMap0);
      XML.toString((Object) jSONArray0, "&amp;");
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      String[] stringArray0 = new String[3];
      JSONObject jSONObject0 = new JSONObject((JSONObject) null, stringArray0);
      jSONObject0.putOnce("9\"", jSONArray0);
      String string0 = XML.toString((Object) jSONObject0, "is");
      assertEquals("<is></is>", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      HashMap<String, JSONArray> hashMap0 = new HashMap<String, JSONArray>();
      JSONObject jSONObject0 = new JSONObject((Map<?, ?>) hashMap0);
      jSONObject0.putOnce("!", hashMap0);
      String string0 = XML.toString((Object) jSONObject0, "!");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String[] stringArray0 = new String[2];
      JSONObject jSONObject0 = new JSONObject("-?trn", stringArray0);
      String string0 = XML.toString((Object) jSONObject0, (String) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Object object0 = XML.stringToValue("8");
      assertEquals(8, object0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Object object0 = XML.stringToValue("-0");
      assertEquals(-0.0, object0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Object object0 = XML.stringToValue("8fc2>K:/%d|:>/4FlEa");
      assertEquals("8fc2>K:/%d|:>/4FlEa", object0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Object object0 = XML.stringToValue("1,p*r&.%");
      assertEquals("1,p*r&.%", object0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Q/}<^7m]>-?trN");
      try { 
        XML.toJSONObject((Reader) stringReader0, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unclosed tag ^7m at 14 [character 15 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Object object0 = XML.stringToValue("5}@V2P/8e,L3<cJ3");
      assertEquals("5}@V2P/8e,L3<cJ3", object0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      try { 
        XML.toJSONObject("<Illegal esf{p.>null</Illegal esf{p.>");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped close tag at 36 [character 37 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Object object0 = XML.stringToValue("false");
      assertEquals(false, object0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Object object0 = XML.stringToValue("true");
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Object object0 = XML.stringToValue("");
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<is><is>java.lang.Character@0000000003</is></is>");
      JSONObject jSONObject0 = XML.toJSONObject((Reader) stringReader0);
      assertEquals(1, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      try { 
        XML.toJSONObject("<-?trn>java.lang.Character@0000000001</-?trn>");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped tag at 3 [character 4 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      try { 
        XML.toJSONObject("Q/}<8/^7]>-?trN");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped tag at 8 [character 9 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      try { 
        XML.toJSONObject("<C:A/< ='^b32>java.lang.Object@0000000001</C:A/< ='^b32>", false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misplaced '<' at 6 [character 7 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      try { 
        XML.toJSONObject("C:A/< ='^b32", false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped tag at 7 [character 8 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JSONObject jSONObject0 = XML.toJSONObject("<\"java.lang.string@0000000001\">java.lang.string@0000000002</\"java.lang.string@0000000001\">");
      assertEquals(1, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      try { 
        XML.toJSONObject("</>>java.lang.Integer@0000000001<//>>");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Mismatched close tag > at 3 [character 4 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      JSONObject jSONObject0 = XML.toJSONObject("[B<?Z.?/_>$lQ");
      assertTrue(jSONObject0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      try { 
        XML.toJSONObject("<!></!>", true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped meta tag at 7 [character 8 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      // Undeclared exception!
      XML.toJSONObject("Missing '>' after '<!'.", false);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      try { 
        XML.noSpace("vx=FcVbOp;pIT emN");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 'vx=FcVbOp;pIT emN' contains a space character.
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
      XML.noSpace("$o8oi-|*1:`G(`Z");
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      String string0 = XML.unescape("&amp;");
      assertEquals("&", string0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      String string0 = XML.unescape("&");
      assertEquals("&", string0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      String string0 = XML.escape("T 'qZ");
      assertEquals("T &#x7f;&apos;qZ", string0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      String string0 = XML.escape("Missing '>' after '<!'.");
      assertEquals("Missing &apos;&gt;&apos; after &apos;&lt;!&apos;.", string0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      String string0 = XML.escape("oKg&,-9");
      assertEquals("oKg&amp;,-9", string0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      String string0 = XML.escape("/DC\"d.4HTz9_");
      assertEquals("/DC&quot;d.4HTz9_", string0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      StringReader stringReader0 = new StringReader("RxQwDRi#(TuPQ3r1i");
      JSONObject jSONObject0 = XML.toJSONObject((Reader) stringReader0);
      assertTrue(jSONObject0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      XML xML0 = new XML();
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.put(2330.24F);
      String string0 = XML.toString((Object) jSONArray0, "\"DA|Z+BiD");
      assertNotNull(string0);
  }
}
