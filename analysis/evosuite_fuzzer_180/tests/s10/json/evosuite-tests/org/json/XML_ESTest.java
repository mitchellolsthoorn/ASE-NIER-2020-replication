/*
 * This file was automatically generated by EvoSuite
 * Fri May 22 16:26:36 GMT 2020
 */

package org.json;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Reader;
import java.io.StringReader;
import java.util.Collection;
import java.util.LinkedList;
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
      XML.stringToValue("\"");
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XML.stringToValue("9|JQOXopcti2&JvA >");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      XML.toJSONObject("97<!qJ1mE[j{yk");
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XML.unescape("");
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      XML.toString((Object) jSONArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XML.toJSONObject("P;;tLu&", true);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XML.toJSONObject("<_)9kVt*Tv_|d|@CgU>java.lang.String@0000000003</_)9kVt*Tv_|d|@CgU>", true);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<.ifdv9\u0005t-jku$kb>java.lang.Object@0000000001</.ifdv9\u0005t-jku$kb>");
      XML.toJSONObject((Reader) stringReader0, false);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XML.escape("");
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
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
  public void test10()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.put(120, (Map<?, ?>) null);
      String string0 = XML.toString((Object) jSONArray0);
      String string1 = XML.toString((Object) jSONArray1, string0);
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.put(626, 626);
      // Undeclared exception!
      XML.toString((Object) jSONArray0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      XML.toJSONObject("io{bYfz'nLR0E<!1i$j", true);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
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
      StringReader stringReader0 = new StringReader("io{bYfz'nLR0E<!1i$j");
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
      LinkedList<JSONObject> linkedList0 = new LinkedList<JSONObject>();
      JSONArray jSONArray0 = new JSONArray((Collection<?>) linkedList0);
      jSONArray0.put(69, 0.0);
      String string0 = XML.toString((Object) jSONArray0, "fase");
      String string1 = XML.escape(string0);
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
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
  public void test23()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.put(false);
      String string0 = XML.toString((Object) jSONArray1, (String) null);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = XML.toString((Object) null, (String) null);
      assertEquals("\"null\"", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject((Object) "C.ATA");
      String string0 = XML.toString((Object) jSONObject0, "C.ATA");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Object object0 = XML.stringToValue("{\"wfedqr63:&;>n~<\":false,\"size\":\"ar@e\",\"color\":\"a string\",\"value\":true,\"Duplicate key \"\"99,\"7g%.\":\"1\"}");
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Object object0 = XML.stringToValue("null");
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String[] stringArray0 = new String[8];
      JSONObject jSONObject0 = new JSONObject("", stringArray0);
      jSONObject0.putOnce("\"", "");
      String string0 = XML.toString((Object) jSONObject0);
      assertEquals("<\"/>", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JSONObject jSONObject0 = XML.toJSONObject("?\"RtI>");
      JSONObject jSONObject1 = jSONObject0.put(" at ", true);
      Object object0 = new Object();
      jSONObject1.accumulate(" at ", object0);
      String string0 = XML.toString((Object) jSONObject1, "] is not a JSONObject.");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StringReader stringReader0 = new StringReader("] not a string.");
      JSONObject jSONObject0 = XML.toJSONObject((Reader) stringReader0, false);
      String string0 = XML.toString((Object) jSONObject0, (String) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Object object0 = XML.stringToValue("7");
      assertEquals(7, object0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Object object0 = XML.stringToValue("-0");
      assertEquals(-0.0, object0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Object object0 = XML.stringToValue("7+tkSAf(3MC`oPEd");
      assertEquals("7+tkSAf(3MC`oPEd", object0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Object object0 = XML.stringToValue("0<6:f?e~nusok");
      assertEquals("0<6:f?e~nusok", object0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Object object0 = XML.stringToValue("1null key.");
      assertEquals("1null key.", object0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Object object0 = XML.stringToValue("0000");
      assertEquals("0000", object0);
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
      JSONObject jSONObject0 = XML.toJSONObject("<C.ATA><bytes>java.lang.Byte@0000000003</bytes><bytes>java.lang.Byte@0000000006</bytes><bytes>java.lang.Byte@0000000009</bytes><bytes>java.lang.Byte@0000000012</bytes><bytes>java.lang.Byte@0000000015</bytes><empty>java.lang.Boolean@0000000018</empty></C.ATA>");
      assertEquals(1, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      JSONObject jSONObject0 = XML.toJSONObject("<array></array><array>org.json.JSONObject$Null@0000000003</array><array>org.json.JSONObject$Null@0000000003</array><array>org.json.JSONObject$Null@0000000003</array><array>org.json.JSONObject$Null@0000000003</array><array>org.json.JSONObject$Null@0000000003</array><array>org.json.JSONObject$Null@0000000003</array><array>org.json.JSONObject$Null@0000000003</array><array>org.json.JSONObject$Null@0000000003</array><array>java.lang.Float@0000000020</array>");
      assertEquals(1, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JSONObject jSONObject0 = XML.toJSONObject("<P;;tLu&><P;;tLu&>java.lang.Integer@0000000002</P;;tLu&></P;;tLu&>");
      assertFalse(jSONObject0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      try { 
        XML.toJSONObject("<wfedqr5j3:&;>n~<java.lang.<oolean@0000000010</wfedqr563:&;>n~<>", true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Bad character in a name at 28 [character 29 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      try { 
        XML.toJSONObject("`<yz{b5wT BB>qx5Uj");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unclosed tag yz{b5wT at 18 [character 19 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      StringReader stringReader0 = new StringReader("@g<340%fi~?&e");
      try { 
        XML.toJSONObject((Reader) stringReader0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped tag at 12 [character 13 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      try { 
        XML.toJSONObject("<dIvBI/SfL8F{Ml_>java.lang.Integer@0000000002</dIvBI/SfL8F{Ml_>");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped tag at 16 [character 17 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      try { 
        XML.toJSONObject("%6<b00 LbP_=w");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped element at 13 [character 14 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      try { 
        XML.toJSONObject("%6<b00 LbP_=w", true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped element at 13 [character 14 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
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
  public void test50()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<Illegal escape.>null</Illegal escape.>");
      try { 
        XML.toJSONObject((Reader) stringReader0, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped close tag at 38 [character 39 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<Illegal escape.>null</Ilegal esape.>");
      try { 
        XML.toJSONObject((Reader) stringReader0, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Mismatched Illegal and Ilegal at 30 [character 31 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<Illegal escape.>null</Illegal escape.>");
      char[] charArray0 = new char[8];
      stringReader0.read(charArray0);
      try { 
        XML.toJSONObject((Reader) stringReader0, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Mismatched close tag Illegal at 23 [character 24 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<?Y3");
      JSONObject jSONObject0 = XML.toJSONObject((Reader) stringReader0);
      assertTrue(jSONObject0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      String string0 = "3\\u?TJ f 9=%0I/";
      try { 
        XML.noSpace(string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // '3\\u?TJ f 9=%0I/' contains a space character.
         //
         verifyException("org.json.XML", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
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
  public void test56()  throws Throwable  {
      XML.noSpace("<sv>null</sv>");
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      String string0 = XML.unescape("wFEDqr563:&;>N~<");
      assertEquals("wFEDqr563:>N~<", string0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      String string0 = XML.unescape("/E=1`QH7s < \u0004S&Ou&");
      assertEquals("/E=1`QH7s < \u0004S&Ou&", string0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      String string0 = XML.escape("gx:VzSoH[kKF-;5][");
      assertEquals("g&#x7f;x:VzSoH[kKF-;5][", string0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      String string0 = XML.escape("Expected 'CDATA['");
      assertEquals("Expected &apos;CDATA[&apos;", string0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      String string0 = XML.escape("wFEDqr563:&;>N~<");
      assertEquals("wFEDqr563:&amp;;&gt;N~&lt;", string0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      String string0 = XML.escape("{\"fruit\":\"Apple\",\"size\":\"Large\",\"color\":{},\"value\":true,\"value2\":false,\"number\":\"1\"}");
      assertEquals("{&quot;fruit&quot;:&quot;Apple&quot;,&quot;size&quot;:&quot;Large&quot;,&quot;color&quot;:{},&quot;value&quot;:true,&quot;value2&quot;:false,&quot;number&quot;:&quot;1&quot;}", string0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Integer integer0 = new Integer(101);
      String string0 = "ynl_l)45o\\u";
      String string1 = XML.toString((Object) integer0, string0);
      StringReader stringReader0 = new StringReader(string1);
      JSONObject jSONObject0 = XML.toJSONObject((Reader) stringReader0);
      assertFalse(jSONObject0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      XML xML0 = new XML();
  }
}
