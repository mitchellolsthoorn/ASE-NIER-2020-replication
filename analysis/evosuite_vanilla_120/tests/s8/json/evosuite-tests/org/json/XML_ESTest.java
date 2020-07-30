/*
 * This file was automatically generated by EvoSuite
 * Thu May 21 18:15:10 GMT 2020
 */

package org.json;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.util.Collection;
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
      XML.toJSONObject("kjqr++z<!ce", true);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = XML.unescape("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray((Collection<?>) null);
      String string0 = XML.toString((Object) jSONArray0, "gep");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSONObject jSONObject0 = XML.toJSONObject("[]7fj#G#c?>v:g", true);
      assertTrue(jSONObject0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JSONObject jSONObject0 = XML.toJSONObject((Reader) stringReader0);
      assertTrue(jSONObject0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = XML.escape("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
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
  public void test07()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject((Object) "<] could not be converted to bigdecimal.><bytes>java.lang.byte@0000000003</bytes><bytes>java.lang.byte@0000000006</bytes><bytes>java.lang.byte@0000000009</bytes<empty>java.lang.boolean@0000000012</empty></] could not be cnverted to bigdecimal.>");
      // Undeclared exception!
      XML.toString((Object) jSONObject0, "<] could not be converted to bigdecimal.><bytes>java.lang.byte@0000000003</bytes><bytes>java.lang.byte@0000000006</bytes><bytes>java.lang.byte@0000000009</bytes<empty>java.lang.boolean@0000000012</empty></] could not be cnverted to bigdecimal.>");
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      XML.toJSONObject("Missing '>' Yfter '<!'.", true);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
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
      StringReader stringReader0 = new StringReader("Missing '>' after '<!'.");
      // Undeclared exception!
      XML.toJSONObject((Reader) stringReader0, true);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
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
  public void test14()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Xa<@h5^r");
      try { 
        XML.toJSONObject((Reader) stringReader0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped element at 8 [character 9 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Missing '>' after '<!'.");
      // Undeclared exception!
      XML.toJSONObject((Reader) stringReader0);
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
      Integer integer0 = new Integer(0);
      String string0 = XML.toString((Object) integer0, (String) null);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.put(false);
      String string0 = XML.toString((Object) jSONArray0, (String) null);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = XML.toString((Object) "", "");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject((Object) "&lt;&lt;8lqf|9w$g%r&#x7f;_wck,&gt;null&lt;/&lt;8lqf|9w$g%r&#x7f;_wck,&gt;");
      String string0 = XML.toString((Object) jSONObject0, (String) null);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringReader stringReader0 = new StringReader("ha%\"e3");
      JSONObject jSONObject0 = XML.toJSONObject((Reader) stringReader0, false);
      assertEquals(0, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<org.json.JSONPointer>null</org.json.JSONPointer>");
      JSONObject jSONObject0 = XML.toJSONObject((Reader) stringReader0, true);
      assertFalse(jSONObject0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Object object0 = XML.stringToValue("mE:>+V6=z^;\"PRe");
      assertEquals("mE:>+V6=z^;\"PRe", object0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String string0 = XML.toString((Object) null);
      assertEquals("\"null\"", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.put(false);
      String string0 = XML.toString((Object) jSONArray0, "#q/+z<C");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      jSONArray0.put(2316, (Object) dataInputStream0);
      // Undeclared exception!
      XML.toString((Object) jSONArray0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String string0 = XML.toString((Object) null, "org.json.JSONPointer");
      assertEquals("<org.json.JSONPointer>null</org.json.JSONPointer>", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.put("content", 2);
      String string0 = XML.toString((Object) jSONObject1, "content");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      String string0 = XML.toString((Object) jSONObject0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JSONObject jSONObject0 = XML.toJSONObject("-RYYnx");
      assertTrue(jSONObject0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Object object0 = XML.stringToValue("9");
      assertEquals(9, object0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Object object0 = XML.stringToValue("0000");
      assertEquals("0000", object0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Object object0 = XML.stringToValue("2*,E");
      assertEquals("2*,E", object0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Object object0 = XML.stringToValue("5S.n}@`-g%?M$1Hu");
      assertEquals("5S.n}@`-g%?M$1Hu", object0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Object object0 = XML.stringToValue("-0");
      assertEquals(-0.0, object0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Object object0 = XML.stringToValue("42?`e");
      assertEquals("42?`e", object0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Object object0 = XML.stringToValue("$:4U5atNbJ(YP]5WG:-");
      assertEquals("$:4U5atNbJ(YP]5WG:-", object0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Object object0 = XML.stringToValue("null");
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Object object0 = XML.stringToValue("false");
      assertEquals(false, object0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Object object0 = XML.stringToValue("true");
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Object object0 = XML.stringToValue("");
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      JSONObject jSONObject0 = XML.toJSONObject("<G></G>");
      assertEquals(1, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JSONObject jSONObject0 = XML.toJSONObject("<org.json.#SOPo4nter>null</org.json.#SOPo4nter>", true);
      assertEquals(1, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      try { 
        XML.toJSONObject("<org.[son.#^OPo4nter>Pullr/org.jsoy.#OPo4)ter>");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unclosed tag org. at 46 [character 47 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      try { 
        XML.toJSONObject("c<B~(JC-5kK=", false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped tag at 12 [character 13 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      try { 
        XML.toJSONObject("a:5<,oY/(W");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped tag at 10 [character 11 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      StringReader stringReader0 = new StringReader(".2rto<y`p]#1 =qgf");
      try { 
        XML.toJSONObject((Reader) stringReader0, true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped element at 17 [character 18 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      try { 
        XML.toJSONObject(".2rto<y`P]#1 =qGF");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped element at 17 [character 18 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      try { 
        XML.toJSONObject(",s<=V*wRf");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped tag at 4 [character 5 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      try { 
        XML.toJSONObject("<] could not be converted to bigdecimal.><bytes>java.lang.byte@0000000003</bytes><bytes>java.lang.byte@0000000006</bytes><bytes>java.lang.byte@0000000009</bytes><empty>java.lang.boolean@0000000012</empty></] could not be converted to bigdecimal.>");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped close tag at 214 [character 215 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      try { 
        XML.toJSONObject("<] could not be converted to bigdecimal.><bytes>java.lang.byte@0000000003</bytes><bytes>java.lang.byte@c000000006</byt`s><bytes>java.lang.byte@000d000009</bytes<empty>java.lang.boolean@0000000012</empty></] could not be cnverted to bigdecimal.>");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Mismatched bytes and byt`s at 120 [character 121 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      JSONObject jSONObject0 = XML.toJSONObject("<?3(~xZ");
      assertEquals(0, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<Misstng '>' Yfter '<!'.>java.math.RoundingMode@0000000001</Misstng '>' Yfter '<!'.>");
      stringReader0.read();
      try { 
        XML.toJSONObject((Reader) stringReader0, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Mismatched close tag Misstng at 67 [character 68 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      try { 
        XML.noSpace("Misshaped close tag");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 'Misshaped close tag' contains a space character.
         //
         verifyException("org.json.XML", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
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
  public void test59()  throws Throwable  {
      XML.noSpace("<org.[son.#^OPo4nter>Pullr/org.jsoy.#OPo4)ter>");
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      String string0 = XML.unescape("&#x");
      assertEquals("&#x", string0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      String string0 = XML.unescape("&lt;");
      assertEquals("<", string0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      String string0 = XML.escape("<8lqf|9w$g%r_wck,");
      assertEquals("&lt;8lqf|9w$g%r&#x7f;_wck,", string0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      String string0 = XML.escape("Missing '>' after '<!'.");
      assertEquals("Missing &apos;&gt;&apos; after &apos;&lt;!&apos;.", string0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      String string0 = XML.escape("\"&");
      assertEquals("&quot;&amp;", string0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      JSONObject jSONObject0 = XML.toJSONObject("<&lt;><bytes>java.lang.Byte@0000000003</bytes><bytes>java.lang.Byte@0000000006</bytes><bytes>java.lang.Byte@0000000009</bytes><bytes>java.lang.Byte@0000000012</bytes><empty>java.lang.Boolean@0000000015</empty></&lt;>");
      assertFalse(jSONObject0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<G><bytes>java.lang.Byte@0000000003</bytes><empty>java.lang.Boolean@0000000006</empty></G>");
      JSONObject jSONObject0 = XML.toJSONObject((Reader) stringReader0);
      assertFalse(jSONObject0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      XML xML0 = new XML();
  }
}
