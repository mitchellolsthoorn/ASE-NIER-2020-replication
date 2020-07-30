/*
 * This file was automatically generated by EvoSuite
 * Fri May 22 19:35:46 GMT 2020
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
      // Undeclared exception!
      XML.toJSONObject("/\"<!~7_q41");
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = XML.unescape("Expected 'CDA|A['");
      assertEquals("Expected 'CDA|A['", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = XML.unescape("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSONObject jSONObject0 = XML.toJSONObject("<uh0tdrfj2kdtn__l,>null</uh0tdrfj2kdtn__l,>", true);
      assertFalse(jSONObject0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<uh0tdrfj2kdtn__l,>null</uh0tdrfj2kdtn__l,>");
      JSONObject jSONObject0 = XML.toJSONObject((Reader) stringReader0, false);
      assertFalse(jSONObject0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JSONObject jSONObject0 = XML.toJSONObject((Reader) stringReader0);
      assertTrue(jSONObject0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<UH0TDrfj2kDtN__L,>null</UH0TDrfj2kDtN__L,>");
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
      JSONObject jSONObject0 = new JSONObject((Object) "<bytes>java.lang.byte@0000000003</bytes><bytes>java.lang.byte@0000000006</bytes><bytes>java.lang.byte@0000000009</bytes><bytes>java.lang.byte@0000000012</bytes><n]lim=f5>java.lang.integer@0000000015</n]lim=f5><empty>java.lang.boolean@0000000018</empty>");
      // Undeclared exception!
      XML.toString((Object) jSONObject0, "O)%u+,?gv+>x+3Jdq?L");
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.put(1098, (double) 1098);
      // Undeclared exception!
      XML.toString((Object) jSONArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      XML.toJSONObject("Missing '>' after '<!'.", true);
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
  public void test14()  throws Throwable  {
      StringReader stringReader0 = new StringReader("missing '>' after '<!'.");
      // Undeclared exception!
      XML.toJSONObject((Reader) stringReader0, false);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
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
  public void test16()  throws Throwable  {
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
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        XML.stringToValue((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
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
  public void test19()  throws Throwable  {
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
  public void test20()  throws Throwable  {
      String string0 = XML.toString((Object) ",1ZZj:Qq>RKe3KrTX", (String) null);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = XML.toString((Object) "Expected 'CDA|A['", "Expected 'CDA|A['");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = XML.toString((Object) null, "/");
      assertEquals("</>null<//>", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Locale locale0 = Locale.forLanguageTag("DXkA");
      JSONObject jSONObject0 = new JSONObject(locale0);
      String string0 = XML.toString((Object) jSONObject0, "java.lang.Integer@0000000015");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JSONObject jSONObject0 = XML.toJSONObject(";(aK[|n$y/", false);
      String string0 = XML.toString((Object) jSONObject0, (String) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringReader stringReader0 = new StringReader("lJx=B");
      JSONObject jSONObject0 = XML.toJSONObject((Reader) stringReader0, false);
      assertTrue(jSONObject0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Object object0 = XML.stringToValue("lE)J&INAE");
      assertEquals("lE)J&INAE", object0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Object object0 = XML.stringToValue("null");
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      try { 
        XML.toJSONObject("<'Mgs.M19Vs*lUy>java.lang.String@0000000001</'Mgs.M19Vs*lUy>");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unclosed tag Mgs.M19Vs*lUy>java.lang.String@0000000001</ at 64 [character 65 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.put(41, (double) 41);
      String string0 = XML.toString((Object) jSONArray0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.put(41, (double) 41);
      String string0 = XML.toString((Object) jSONArray1, "Z6mR.U^y");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JSONObject jSONObject0 = XML.toJSONObject("TJ");
      Object object0 = new Object();
      jSONObject0.append("b*(^}*`a", object0);
      String string0 = XML.toString((Object) jSONObject0, "TJ");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JSONObject jSONObject0 = XML.toJSONObject("<java.lang.Integer@0000000015><country/><ISO3Language>java.lan.String@0000000005</ISO3Language><displayName>java.lang.String@0000000008</displayName><displayVariant/><language>java.lang.String@0000000011</language><displayLanguage>java.lang.String@0000000014</displayLanguage><script/><displayCountry/>]ISO3Country/><variant/><displayScript/></java.lang.Integer@0000000015>");
      LinkedList<JSONObject> linkedList0 = new LinkedList<JSONObject>();
      linkedList0.add(jSONObject0);
      linkedList0.add(jSONObject0);
      jSONObject0.put("content", (Collection<?>) linkedList0);
      XML.toString((Object) jSONObject0);
      assertEquals(2, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Object object0 = XML.stringToValue("-1");
      assertEquals((-1), object0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Object object0 = XML.stringToValue("0000");
      assertEquals("0000", object0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Object object0 = XML.stringToValue("9>>]~v03I");
      assertEquals("9>>]~v03I", object0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Object object0 = XML.stringToValue("4Z}Hz[=K#jEn5Fm25");
      assertEquals("4Z}Hz[=K#jEn5Fm25", object0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Object object0 = XML.stringToValue("5O3wy;o.n*wP");
      assertEquals("5O3wy;o.n*wP", object0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Object object0 = XML.stringToValue("-0");
      assertEquals(-0.0, object0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Object object0 = XML.stringToValue("1e``BS7&Rh2t+");
      assertEquals("1e``BS7&Rh2t+", object0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Object object0 = XML.stringToValue("&21");
      assertEquals("&21", object0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Object object0 = XML.stringToValue("false");
      assertEquals(false, object0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Object object0 = XML.stringToValue("true");
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Object object0 = XML.stringToValue("");
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JSONObject jSONObject0 = XML.toJSONObject("<DlAA></DlAA>");
      assertFalse(jSONObject0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      try { 
        XML.toJSONObject("<uh0tdrfj2kdtn__l%>null6/uh0tdrfj2kdtn__l,>", false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unclosed tag uh0tdrfj2kdtn__l% at 44 [character 45 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      try { 
        XML.toJSONObject(")<#W!)8T46j@#QZ");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped tag at 5 [character 6 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      try { 
        XML.toJSONObject("&JMyAp<N/1");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped tag at 10 [character 11 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      try { 
        XML.toJSONObject("<bytes>javalang.byte@0000000003</bytes><bytes>java.lang.byte@0000000006</bytes><bytes>java.lang.byte@0000000009</bytes><bytes>java.lang.byte@0000000012</bytes><n]lim=f5>java.lang.integer@0000000015</n]lim=f5><empty>java.lang.boolean@0000000018</empty>");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped close tag at 204 [character 205 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      try { 
        XML.toJSONObject("<>v2_b36ar5Z2");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped tag at 2 [character 3 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      JSONObject jSONObject0 = XML.toJSONObject("<\"java.lang.String@0000000006\"><\"java.lang.String@0000000006\">java.lang.Long@0000000009</\"java.lang.String@0000000006\"></\"java.lang.String@0000000006\">");
      assertEquals(1, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      try { 
        XML.toJSONObject("<uh0tdrfj2kdtn__l,>null</uh0tdrfj2kdtn_,>");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Mismatched uh0tdrfj2kdtn__l, and uh0tdrfj2kdtn_, at 42 [character 43 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      StringReader stringReader0 = new StringReader("&jap</1");
      try { 
        XML.toJSONObject((Reader) stringReader0, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Mismatched close tag 1 at 7 [character 8 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      JSONObject jSONObject0 = XML.toJSONObject("i,gBVTGcN>iT<?.");
      assertTrue(jSONObject0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<![S7IS n7+>java.lang.String@0000000001</![S7IS n7+>");
      try { 
        XML.toJSONObject((Reader) stringReader0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected 'CDATA[' at 8 [character 9 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      try { 
        XML.toJSONObject("<GO.gmNct]M><n]LIM=F5>java.lang.Integer@0000000003</n]LIM=F5></GO.gmNct]M>", true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped close tag at 57 [character 58 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      try { 
        XML.noSpace("3- 7,C:>_3");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // '3- 7,C:>_3' contains a space character.
         //
         verifyException("org.json.XML", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
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
  public void test58()  throws Throwable  {
      XML.noSpace("CDATA");
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      String string0 = XML.unescape("&gt;");
      assertEquals(">", string0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      String string0 = XML.unescape("&jap</1");
      assertEquals("&jap</1", string0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      String string0 = XML.escape("K60v}r:Bbe+s4~");
      assertEquals("K6&#x7f;0v}r:Bbe+s4~", string0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      String string0 = XML.escape("-->");
      assertEquals("--&gt;", string0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      String string0 = XML.escape("Expected 'CDA|A['");
      assertEquals("Expected &apos;CDA|A[&apos;", string0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      String string0 = XML.escape("&1");
      assertEquals("&amp;1", string0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      String string0 = XML.escape("/\"<!~7_q41");
      assertEquals("/&quot;&lt;!~7_q41", string0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      StringReader stringReader0 = new StringReader("missing '>' after '<!'.");
      // Undeclared exception!
      XML.toJSONObject((Reader) stringReader0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      XML xML0 = new XML();
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      String string0 = XML.toString((Object) jSONArray0);
      assertEquals("", string0);
  }
}
