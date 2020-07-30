/*
 * This file was automatically generated by EvoSuite
 * Wed May 20 12:28:46 GMT 2020
 */

package org.json;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Reader;
import java.io.StringReader;
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
      Object object0 = XML.stringToValue("9$A4bwH!]");
      assertEquals("9$A4bwH!]", object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = XML.unescape("M}sbing '>' after '<!.");
      assertEquals("M}sbing '>' after '<!.", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = XML.unescape("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringReader stringReader0 = new StringReader("&t");
      JSONObject jSONObject0 = XML.toJSONObject((Reader) stringReader0);
      assertTrue(jSONObject0.isEmpty());
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
      JSONArray jSONArray1 = jSONArray0.put((-1L));
      jSONArray0.put((Object) jSONArray1);
      XML.toString((Object) jSONArray1, "2.nd{`A(R");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
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
  public void test08()  throws Throwable  {
      // Undeclared exception!
      XML.toJSONObject("Missing '>' after '<!'.");
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
      StringReader stringReader0 = new StringReader("Ils{<G;J4~rT02<o");
      try { 
        XML.toJSONObject((Reader) stringReader0, true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Bad character in a name at 15 [character 16 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Missing '>' after '<!'.");
      // Undeclared exception!
      XML.toJSONObject((Reader) stringReader0, true);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
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
  public void test13()  throws Throwable  {
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
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        XML.stringToValue((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
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
  public void test16()  throws Throwable  {
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
  public void test17()  throws Throwable  {
      String string0 = XML.toString((Object) "org.json.JSONException", (String) null);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSONObject jSONObject0 = XML.toJSONObject("=$", false);
      String string0 = XML.toString((Object) jSONObject0, (String) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringReader stringReader0 = new StringReader("lt");
      JSONObject jSONObject0 = XML.toJSONObject((Reader) stringReader0, true);
      assertTrue(jSONObject0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<T>null</T>");
      JSONObject jSONObject0 = XML.toJSONObject((Reader) stringReader0, false);
      assertEquals(1, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Object object0 = XML.stringToValue("org.json.xmltokener");
      assertEquals("org.json.xmltokener", object0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Object object0 = XML.stringToValue("&HTKOQ");
      assertEquals("&HTKOQ", object0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Object object0 = XML.stringToValue("null");
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = XML.toString((Object) "-Ky7eeM6");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.put(0L);
      String string0 = XML.toString((Object) jSONArray0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.put(2202L);
      String string0 = XML.toString((Object) jSONArray1, "<FZ(&,>Wl):@");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String string0 = XML.toString((Object) null, "Expected 'CDATA['");
      assertEquals("<Expected 'CDATA['>null</Expected 'CDATA['>", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject((Object) "CDATA");
      String string0 = XML.toString((Object) jSONObject0, "CDATA");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Object object0 = XML.stringToValue("000");
      assertEquals("000", object0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Object object0 = XML.stringToValue("-0");
      assertEquals(-0.0, object0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Object object0 = XML.stringToValue("3E8g]=Q\u0005Xm~q[6wd");
      assertEquals("3E8g]=Q\u0005Xm~q[6wd", object0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Object object0 = XML.stringToValue("2");
      assertEquals(2, object0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Object object0 = XML.stringToValue("1TP=Z|o_.[");
      assertEquals("1TP=Z|o_.[", object0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Object object0 = XML.stringToValue("-Ky7eeM6");
      assertEquals("-Ky7eeM6", object0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Object object0 = XML.stringToValue("false");
      assertEquals(false, object0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Object object0 = XML.stringToValue("true");
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Object object0 = XML.stringToValue("");
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JSONObject jSONObject0 = XML.toJSONObject("<SBQW{></SBQW{>");
      assertEquals(1, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<CDATA><z`98y`0>java.lang.Integer@0000000003</z`98y`0><bytes>java.lang.Byte@0000000006</bytes><bytes>java.lang.Byte@0000000009</bytes><bytes>java.lang.Byte@0000000012</bytes><bytes>java.lang.Byte@0000000015</bytes><bytes>java.lang.Byte@0000000018</bytes><empty>java.lang.Boolean@0000000021</empty></CDATA>");
      JSONObject jSONObject0 = XML.toJSONObject((Reader) stringReader0);
      assertEquals(1, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      try { 
        XML.toJSONObject("o`=W1v%Gvh<.[ `?g");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped tag at 16 [character 17 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      try { 
        XML.toJSONObject("<qjBOuq/IrI>java.lang.String@0000000001</qjBOuq/IrI>");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped tag at 11 [character 12 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      try { 
        XML.toJSONObject("<>java.lang.String@0000000001</>");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped tag at 2 [character 3 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      try { 
        XML.toJSONObject("<Expected 'CDATA['>null</Expected 'CDATA['>");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped close tag at 42 [character 43 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JSONObject jSONObject0 = XML.toJSONObject("<o>java.lang.long@0000000002</o>", true);
      assertFalse(jSONObject0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      try { 
        XML.toJSONObject("<FZ(&,>Wl:@", false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unclosed tag FZ(&, at 11 [character 12 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JSONObject jSONObject0 = XML.toJSONObject("=W1v%Gv< ?u");
      assertTrue(jSONObject0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      try { 
        XML.toJSONObject("<!>[Y2o]fd>null</!>[Y2o]fd>");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Mismatched close tag ! at 18 [character 19 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      // Undeclared exception!
      XML.toJSONObject("Missing '>' after '<!'.", true);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      try { 
        XML.noSpace("Mismatched ");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 'Mismatched ' contains a space character.
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
      XML.noSpace("-Ky7eeM6");
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      String string0 = XML.unescape("<FZ(&,>Wl:@");
      assertEquals("<FZ(&,>Wl:@", string0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      String string0 = XML.unescape("{I&b4k!?)H4;I,");
      assertEquals("{I&b4k!?)H4;I,", string0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      String string0 = XML.escape("D7-:f?6e ]w");
      assertEquals("D7-:&#x7f;f?6e ]w", string0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      String string0 = XML.escape("cL=A8po,613~Te'");
      assertEquals("cL=A8po,613~Te&apos;", string0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      String string0 = XML.escape("<FZ(&,>Wl:@");
      assertEquals("&lt;FZ(&amp;,&gt;Wl:@", string0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      String string0 = XML.escape("%H>\"H!Vt#9(eY>2");
      assertEquals("%H&gt;&quot;H!Vt#9(eY&gt;2", string0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      StringReader stringReader0 = new StringReader("M}sbing '>' after '<!.");
      try { 
        XML.toJSONObject((Reader) stringReader0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped meta tag at 22 [character 23 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      XML xML0 = new XML();
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      JSONObject jSONObject0 = XML.toJSONObject("wl:@");
      String string0 = XML.toString((Object) jSONObject0);
      assertEquals("", string0);
  }
}
