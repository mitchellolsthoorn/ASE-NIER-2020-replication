/*
 * This file was automatically generated by EvoSuite
 * Thu May 21 21:42:50 GMT 2020
 */

package org.json;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Reader;
import java.io.StringReader;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Locale;
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
      String string0 = XML.unescape("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      String string0 = XML.toString((Object) jSONArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSONObject jSONObject0 = XML.toJSONObject("<?{5B>null</?{5B>", false);
      assertTrue(jSONObject0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSONObject jSONObject0 = XML.toJSONObject("<;x^bkj,8pczqf>nulG</;x^bkj,8pczqf>", true);
      assertEquals(1, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringReader stringReader0 = new StringReader("true");
      JSONObject jSONObject0 = XML.toJSONObject((Reader) stringReader0, true);
      assertTrue(jSONObject0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"fruit\":false,\"size\":\"Null key.\",\"color\":-99,\"value\":99,\"value2\":false,\"number\":\"1\"}");
      JSONObject jSONObject0 = XML.toJSONObject((Reader) stringReader0);
      assertEquals(0, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<;x^bkj,8pczqf>null</;x^bkj,8pczqf>");
      JSONObject jSONObject0 = XML.toJSONObject((Reader) stringReader0);
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
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      JSONArray jSONArray0 = new JSONArray((Collection<?>) linkedList0);
      jSONArray0.put(1862, (long) 1862);
      // Undeclared exception!
      XML.toString((Object) jSONArray0, "\t");
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.put(3544, (-1L));
      // Undeclared exception!
      XML.toString((Object) jSONArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      try { 
        XML.toJSONObject("YlSYu<]7E%", true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped element at 10 [character 11 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
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
  public void test13()  throws Throwable  {
      // Undeclared exception!
      XML.toJSONObject("m@[e<!7s{$b");
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
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
  public void test15()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Missing '>' after '<!'.");
      // Undeclared exception!
      XML.toJSONObject((Reader) stringReader0, true);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
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
  public void test17()  throws Throwable  {
      StringReader stringReader0 = new StringReader("m@[e<!7s{$b");
      // Undeclared exception!
      XML.toJSONObject((Reader) stringReader0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
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
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        XML.stringToValue((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
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
  public void test21()  throws Throwable  {
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
  public void test22()  throws Throwable  {
      String string0 = XML.toString((Object) "org.json.JSONException", (String) null);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = XML.toString((Object) "{\"size\":\"a string\",\"{\"size\":true,\"fruit\":\"apple\",\"number\":\"1\",\"value2\":false,\"true\":true,\"color\":\"red\"}\":\"Apple\",\"number\":\"1\",\"value2\":false,\"true\":-99,\"color\":\"[]\"}", "{\"size\":\"a string\",\"{\"size\":true,\"fruit\":\"apple\",\"number\":\"1\",\"value2\":false,\"true\":true,\"color\":\"red\"}\":\"Apple\",\"number\":\"1\",\"value2\":false,\"true\":-99,\"color\":\"[]\"}");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Object object0 = XML.stringToValue("@");
      assertEquals("@", object0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Object object0 = XML.stringToValue("null");
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      LinkedList<Locale.Category> linkedList0 = new LinkedList<Locale.Category>();
      jSONArray0.put((Collection<?>) linkedList0);
      String string0 = XML.toString((Object) jSONArray0, (String) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String string0 = XML.toString((Object) null, "");
      assertEquals("<>null</>", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSONObject jSONObject0 = XML.toJSONObject("null");
      jSONObject0.accumulate("null", "");
      String string0 = XML.toString((Object) jSONObject0, "JSONArray[");
      assertEquals("<JSONArray[><null/></JSONArray[>", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONArray jSONArray0 = new JSONArray();
      jSONObject0.append("oGo;}QtsHU&m#!l3", jSONArray0);
      String string0 = XML.toString((Object) jSONObject0, "R9&Z");
      assertEquals("<R9&Z><oGo;}QtsHU&m#!l3></oGo;}QtsHU&m#!l3></R9&Z>", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject((Object) ".mX;vq6n.uF8/)^Gr");
      String string0 = XML.toString((Object) jSONObject0, "\f");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JSONObject jSONObject0 = XML.toJSONObject("Y/bx|Z4A-");
      String string0 = XML.toString((Object) jSONObject0, (String) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Object object0 = XML.stringToValue("99");
      assertEquals(99, object0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Object object0 = XML.stringToValue("0000");
      assertEquals("0000", object0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Object object0 = XML.stringToValue("0E");
      assertEquals("0E", object0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Object object0 = XML.stringToValue("3(EVu=ey");
      assertEquals("3(EVu=ey", object0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Object object0 = XML.stringToValue("6>Wn-&${>%$W.B*&u");
      assertEquals("6>Wn-&${>%$W.B*&u", object0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Object object0 = XML.stringToValue("-0");
      assertEquals(-0.0, object0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Object object0 = XML.stringToValue("*QaQrD");
      assertEquals("*QaQrD", object0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Object object0 = XML.stringToValue("false");
      assertEquals(false, object0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Object object0 = XML.stringToValue("true");
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Object object0 = XML.stringToValue("");
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JSONObject jSONObject0 = XML.toJSONObject("<14><14>java.lang.Integer@0000000002</14></14>");
      assertFalse(jSONObject0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JSONObject jSONObject0 = XML.toJSONObject("<%></%>");
      assertEquals(1, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<0mw:>qj><0mw:>qj>java.lang.long@0000000002</0mw:>qj></0mw:>qj>");
      JSONObject jSONObject0 = XML.toJSONObject((Reader) stringReader0, true);
      assertEquals(1, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      try { 
        XML.toJSONObject("xBQjpV<~}a>3[wxCmv*");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unclosed tag ~}a at 19 [character 20 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      try { 
        XML.toJSONObject("s9i<jB]N1/Y}q");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped tag at 13 [character 14 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      try { 
        XML.toJSONObject("<-Nrs[)K]c=FBkg!>java.lang.String@0000000003</-Nrs[)K]c=FBkg!>");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped tag at 17 [character 18 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<>null</>");
      try { 
        XML.toJSONObject((Reader) stringReader0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped tag at 2 [character 3 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      try { 
        XML.toJSONObject("<yg&m8|q-fuvloa#]]>java.lang.String@0000000001</yg&m8|q-fuvloa#]]>");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped close tag at 66 [character 67 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<x^bkj,8pczqf>null</;x^kj,8pczqf>");
      try { 
        XML.toJSONObject((Reader) stringReader0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Mismatched x^bkj,8pczqf and ;x^kj,8pczqf at 34 [character 35 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<!r>g>java.lang.String@0000000001</!r>g>");
      try { 
        XML.toJSONObject((Reader) stringReader0, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Mismatched close tag ! at 36 [character 37 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      // Undeclared exception!
      XML.toJSONObject("m@[e<!7s{$b", false);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      try { 
        XML.noSpace("A JSONArray text must start with '['");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 'A JSONArray text must start with '['' contains a space character.
         //
         verifyException("org.json.XML", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
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
  public void test55()  throws Throwable  {
      XML.noSpace("<-Nrs[)K]c=FBkg!>java.lang.String@0000000003</-Nrs[)K]c=FBkg!>");
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      String string0 = XML.unescape("&#x");
      assertEquals("&#x", string0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      String string0 = XML.unescape("expected a &apos;,&apos; or &apos;]&apos;");
      assertEquals("expected a ',' or ']'", string0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      String string0 = XML.escape("k8-Kkz>Q$)uy");
      assertEquals("k8-Kkz&gt;Q$)&#x7f;uy", string0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      String string0 = XML.escape("T7:O<==");
      assertEquals("T7:O&lt;==", string0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      String string0 = XML.escape("expected a ',' or ']'");
      assertEquals("expected a &apos;,&apos; or &apos;]&apos;", string0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      String string0 = XML.escape("6>wn-&${>%$w.b*&u");
      assertEquals("6&gt;wn-&amp;${&gt;%$w.b*&amp;u", string0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      String string0 = XML.escape("\"");
      assertEquals("&quot;", string0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      JSONObject jSONObject0 = XML.toJSONObject("<0Mw:>Qj><d>java.lang.Float@0000000002</d></0Mw:>Qj>");
      assertFalse(jSONObject0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      XML xML0 = new XML();
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      String string0 = XML.toString((Object) "-)kO20+[");
      assertNotNull(string0);
  }
}
