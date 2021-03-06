/*
 * This file was automatically generated by EvoSuite
 * Fri May 22 11:21:56 GMT 2020
 */

package org.json;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Reader;
import java.io.StringReader;
import java.util.Collection;
import java.util.LinkedList;
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
      Object object0 = XML.stringToValue("#rszh");
      assertEquals("#rszh", object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Object object0 = XML.stringToValue("99");
      assertEquals(99, object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = XML.unescape("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      String string0 = XML.toString((Object) jSONArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSONObject jSONObject0 = XML.toJSONObject("{\"fruit\":\"Apple\",\"size\":\"Large\",\"color\":\"Red\",\"value\":null,\"value2\":false,\"number\":\"1\"}", false);
      assertTrue(jSONObject0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSONObject jSONObject0 = XML.toJSONObject("<quot>java.lang.String@0000000006</quot>", false);
      assertEquals(1, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"fruit\":\"Apple\",\"size\":\"Large\",\"color\":\"Red\",\"value\":null,\"<array>java.lang.String@0000000011</array>\":false,\"number\":\"1\"}");
      JSONObject jSONObject0 = XML.toJSONObject((Reader) stringReader0);
      assertEquals(1, jSONObject0.length());
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
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.put(22);
      jSONArray0.put((Object) jSONArray1);
      XML.toString((Object) jSONArray0, "..DQ");
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSONObject jSONObject0 = XML.toJSONObject("`1o");
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Object object0 = new Object();
      linkedList0.add(object0);
      linkedList0.add((Object) jSONObject0);
      jSONObject0.put("`1o", (Collection<?>) linkedList0);
      XML.toString((Object) jSONObject0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      try { 
        XML.toJSONObject("-|gld<,k:>Oy", true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unclosed tag ,k: at 12 [character 13 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        XML.toJSONObject((String) null, true);
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
      XML.toJSONObject("{\"quot\":false,\"java.lang.String@0000000008\":\"\",\"'i5h;51\":\"Missing '>' after '<!'.\",\"Y}^GKO|Dx gt{4\"_\":-99,\"<array>java.lang.String@0000000011</array>\":null,\"Mismatched close tag \":\"Misshaped close tag\",\"org.json.XML$1\":[],\"xx\":\"a string\",\"</\":{}}");
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
      XML.toJSONObject((Reader) stringReader0, false);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
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
  public void test17()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Missing '>' after '<!'.");
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
      String string0 = XML.toString((Object) "I<)T#D?jX&mEwS", "I<)T#D?jX&mEwS");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = XML.toString((Object) null, (String) null);
      assertEquals("\"null\"", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Object object0 = XML.stringToValue("pointer cannot be null");
      assertEquals("pointer cannot be null", object0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = XML.toString((Object) null);
      assertEquals("\"null\"", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject("{\"frut\":\"{\",\"size\":\"\",\"color\":[],\"Expected 'CDATA['\":true,\"<array>java.lag.String@0000000011</arra>\":false,\"number\":\"Misshaped close tag\",\"' and instead saw '\":\"a string\"}");
      String string0 = XML.toString((Object) jSONObject0, "{\"frut\":\"{\",\"size\":\"\",\"color\":[],\"Expected 'CDATA['\":true,\"<array>java.lag.String@0000000011</arra>\":false,\"number\":\"Misshaped close tag\",\"' and instead saw '\":\"a string\"}");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"v=4s95q,+?t=*s\":\"Apple\",\"size\":\"\\\",\"value\":true,\"number\":-99,\"x\":-99}");
      JSONObject jSONObject0 = XML.toJSONObject((Reader) stringReader0);
      String string0 = XML.toString((Object) jSONObject0, (String) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JSONObject jSONObject0 = XML.toJSONObject((Reader) stringReader0, true);
      String string0 = XML.toString((Object) jSONObject0, "quot");
      assertEquals("<quot></quot>", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Object object0 = XML.stringToValue("60");
      assertEquals(60, object0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Object object0 = XML.stringToValue("-|gld<,k:>Oy");
      assertEquals("-|gld<,k:>Oy", object0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Object object0 = XML.stringToValue("0l6cEOTpn4:<e7\"4KaL");
      assertEquals("0l6cEOTpn4:<e7\"4KaL", object0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Object object0 = XML.stringToValue("7l|EPKOtxKdM+q.7");
      assertEquals("7l|EPKOtxKdM+q.7", object0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Object object0 = XML.stringToValue("4k#=EU");
      assertEquals("4k#=EU", object0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Object object0 = XML.stringToValue("-0");
      assertEquals(-0.0, object0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Object object0 = XML.stringToValue("null");
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Object object0 = XML.stringToValue("false");
      assertEquals(false, object0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Object object0 = XML.stringToValue("true");
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Object object0 = XML.stringToValue("");
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\".R&lt;y*&apos;=\":\"Apple\",\"size\":\"\",\"color\":\"Red\",\"value\":null,\"<array>java.lang.String@0000000011</array>\":false,\"number\":\"1\",\"x\":true}");
      JSONObject jSONObject0 = XML.toJSONObject((Reader) stringReader0, true);
      assertEquals(1, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      try { 
        XML.toJSONObject("ax7|+H<uz{={2*");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped tag at 11 [character 12 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<@mBRV/>java.lang.String@0000000001</@mBRV/>");
      try { 
        XML.toJSONObject((Reader) stringReader0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Mismatched close tag @mBRV at 42 [character 43 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      try { 
        XML.toJSONObject("GsX<+UTz[|CzUg/uKJ");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped tag at 18 [character 19 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<>java.lang.String@0000000001</>");
      try { 
        XML.toJSONObject((Reader) stringReader0, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped tag at 2 [character 3 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<+ie5c55# +^v>java.lang.String@0000000001</+ie5c55# +^v>");
      try { 
        XML.toJSONObject((Reader) stringReader0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped close tag at 55 [character 56 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      JSONObject jSONObject0 = XML.toJSONObject("{\"quot\":{},\"getDeclaringClass\":\"\",\"color\":\"a string\",\"value\":[],\"<array>java.lang.String@0000000011</array>\":null,\"Mismatched close tag \":\"Misshaped close tag\",\"org.json.XML$1\":-99,\"xx\":false,\"xxx\":false}");
      String string0 = XML.toString((Object) jSONObject0, "{\"quot\":{},\"getDeclaringClass\":\"\",\"color\":\"a string\",\"value\":[],\"<array>java.lang.String@0000000011</array>\":null,\"Mismatched close tag \":\"Misshaped close tag\",\"org.json.XML$1\":-99,\"xx\":false,\"xxx\":false}");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<!rNwe(mpe#a!>null</!rNwe(mpe#a!>");
      try { 
        XML.toJSONObject((Reader) stringReader0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Mismatched close tag ! at 21 [character 22 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      try { 
        XML.toJSONObject("{\"quot\":{},\"size\":\"\",\"color\":\"Missing '>' after '<!'.\",\"value\":[],\"<array>java.lang.String@0000000011</array>\":null,\"Mismatched close tag \":\"Misshaped close tag\",\"org.json.XML$1\":-99,\"xx\":false,\"xxx\":{}}");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unterminated string at 203 [character 204 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      // Undeclared exception!
      XML.toJSONObject("Missing '>' after '<!'.", false);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      try { 
        XML.noSpace("unterminated string");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 'unterminated string' contains a space character.
         //
         verifyException("org.json.XML", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
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
  public void test51()  throws Throwable  {
      XML.noSpace("B\"e!yex");
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      String string0 = XML.unescape("{\"java.lang.Strig@0000000006\":\"\\\",\"3f{X&`?_@C\":-99,\"&quot;\":[],\"\n\":rue,\"d*7&30]ZUHJ]\":[]}");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      String string0 = XML.escape("vuYmS#o");
      assertEquals("vuYmS&#x7f;#o", string0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      String string0 = XML.escape(".S.t#<a-yl4>p+N");
      assertEquals(".S.t#&lt;a-yl4&gt;p+N", string0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      String string0 = XML.escape("A JSONArray text must start with '['");
      assertEquals("A JSONArray text must start with &apos;[&apos;", string0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      String string0 = XML.escape("I<)T#D?jX&mEwS");
      assertEquals("I&lt;)T#D?jX&amp;mEwS", string0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      String string0 = XML.escape("\"");
      assertEquals("&quot;", string0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      XML xML0 = new XML();
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.put((-528));
      String string0 = XML.toString((Object) jSONArray1, "org.json.XML$1");
      assertNotNull(string0);
  }
}
