/*
 * This file was automatically generated by EvoSuite
 * Fri May 22 18:31:02 GMT 2020
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
      Object object0 = XML.stringToValue("\"");
      assertEquals("\"", object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Object object0 = XML.stringToValue("9G");
      assertEquals("9G", object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      try { 
        XML.toJSONObject("<!njava.ang.String@0000000004</!>");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped meta tag at 33 [character 34 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = XML.unescape("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      String string0 = XML.toString((Object) jSONArray0, "KK jZZOx");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      String string0 = XML.toString((Object) jSONArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringReader stringReader0 = new StringReader("mM{C'C{]Fi+6Kr+");
      JSONObject jSONObject0 = XML.toJSONObject((Reader) stringReader0);
      assertTrue(jSONObject0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<\"\">null</\"\">");
      JSONObject jSONObject0 = XML.toJSONObject((Reader) stringReader0);
      assertEquals(1, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = XML.escape("");
      assertEquals("", string0);
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
      JSONArray jSONArray1 = jSONArray0.put(935, (double) 935);
      // Undeclared exception!
      XML.toString((Object) jSONArray1, "!>$6Xf");
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      XML.toJSONObject("tOP~<!*#LwB.6}o=~", false);
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
      XML.toJSONObject("Missing '>' after '<!'.");
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
      StringReader stringReader0 = new StringReader("tOP~<!*#B.6}o=~");
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
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        XML.stringToValue((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
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
  public void test20()  throws Throwable  {
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
  public void test21()  throws Throwable  {
      String string0 = XML.toString((Object) "_e:k7tAicy<", (String) null);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.put(43, (double) 43);
      String string0 = XML.toString((Object) jSONArray0, (String) null);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = XML.toString((Object) "s9+-2l &JqQ'24KW.G", "s9+-2l &JqQ'24KW.G");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject((Object) "0000");
      String string0 = XML.toString((Object) jSONObject0, "0000");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringReader stringReader0 = new StringReader(".Cjo#k-");
      JSONObject jSONObject0 = XML.toJSONObject((Reader) stringReader0, true);
      assertTrue(jSONObject0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<true>null</true>");
      JSONObject jSONObject0 = XML.toJSONObject((Reader) stringReader0, true);
      assertEquals(1, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Object object0 = XML.stringToValue("m|z");
      assertEquals("m|z", object0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Object object0 = XML.stringToValue("null");
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String string0 = XML.toString((Object) "oUS+=n");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.put(3070, (float) 3070);
      // Undeclared exception!
      XML.toString((Object) jSONArray0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String string0 = XML.toString((Object) null, "?7X+&;S_$8");
      assertEquals("<?7X+&;S_$8>null</?7X+&;S_$8>", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.putOpt("M`PC?8.xD-}q~}(Li7", "");
      String string0 = XML.toString((Object) jSONObject0, "");
      assertEquals("<><M`PC?8.xD-}q~}(Li7/></>", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JSONObject jSONObject0 = XML.toJSONObject("TT5l6DmV{m0T}4KC", false);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Locale.Category locale_Category0 = Locale.Category.DISPLAY;
      linkedList0.add((Object) locale_Category0);
      jSONObject0.put("TT5l6DmV{m0T}4KC", (Collection<?>) linkedList0);
      String string0 = XML.toString((Object) jSONObject0, (String) null);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.append("kIO,~e?", jSONArray0);
      String string0 = XML.toString((Object) jSONObject0, "V9TVa/f?2X>5P");
      assertEquals("<V9TVa/f?2X>5P><kIO,~e?></kIO,~e?></V9TVa/f?2X>5P>", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Object object0 = XML.stringToValue("5");
      assertEquals(5, object0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Object object0 = XML.stringToValue("-0");
      assertEquals(-0.0, object0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Object object0 = XML.stringToValue("8FJOEP{*Fnj%W;}8");
      assertEquals("8FJOEP{*Fnj%W;}8", object0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Object object0 = XML.stringToValue("18e{a'd0");
      assertEquals("18e{a'd0", object0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Object object0 = XML.stringToValue("3]*%j.l");
      assertEquals("3]*%j.l", object0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Object object0 = XML.stringToValue("0000");
      assertEquals("0000", object0);
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
      JSONObject jSONObject0 = XML.toJSONObject("<48Zuin5></48Zuin5>", false);
      assertEquals(1, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      try { 
        XML.toJSONObject("UJ (<[9l>p", true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unclosed tag [9l at 10 [character 11 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      try { 
        XML.toJSONObject("<' contains a space chaactr.>java.lang.String@0000000001</' contains a pace chaactr.>");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unclosed tag  contains a space chaactr.>java.lang.String@0000000001</ at 85 [character 86 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      try { 
        XML.toJSONObject("gZ@=C#;@i| <D0?ym:");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped tag at 15 [character 16 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<7%$yka.3g/></7%$ywka[.3g/>");
      try { 
        XML.toJSONObject((Reader) stringReader0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Mismatched close tag 7%$ywka at 21 [character 22 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      try { 
        XML.toJSONObject("<7%$ywka[.3g/></7%$ywka[.3g/>", false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Mismatched close tag 7%$ywka at 23 [character 24 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      try { 
        XML.toJSONObject("<\"\"Jnul]*/\"\">");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped tag at 12 [character 13 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      try { 
        XML.toJSONObject("kgv2pss<q`^](|=d", true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped element at 16 [character 17 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      StringReader stringReader0 = new StringReader("kgv2pss<q`^](|=d");
      try { 
        XML.toJSONObject((Reader) stringReader0, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped element at 16 [character 17 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      try { 
        XML.toJSONObject("<=Cm(S)Z>java.lang.Character@0000000003</=Cm(S)Z>");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped tag at 2 [character 3 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      try { 
        XML.toJSONObject("<Empty string.>java.lang.Object@0000000001</Empty string.>", false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Misshaped close tag at 57 [character 58 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      try { 
        XML.toJSONObject("<5t:W4mf}oe`>a<L>java.lang.Character@0000000001</5t:W4mf}oe`>a<L>");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Mismatched L and 5t:W4mf}oe` at 60 [character 61 line 1]
         //
         verifyException("org.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      JSONObject jSONObject0 = XML.toJSONObject("<?7X+&;S_$8>null</?7X+&;S_$8>");
      assertEquals(0, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      JSONObject jSONObject0 = XML.toJSONObject("<!VjJvarnR@Str-ng[r}00000);/Y>");
      assertTrue(jSONObject0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      try { 
        XML.noSpace(" and ");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // ' and ' contains a space character.
         //
         verifyException("org.json.XML", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
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
  public void test60()  throws Throwable  {
      XML.noSpace("BmK+~ZOnbmHP");
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      String string0 = XML.unescape("+N$YU-(JE&nqnyh5.7t");
      assertEquals("+N$YU-(JE&nqnyh5.7t", string0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      String string0 = XML.unescape("<?7X+&;S_$8>null</?7X+&;S_$8>");
      assertEquals("<?7X+S_$8>null</?7X+S_$8>", string0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      String string0 = XML.escape("\t");
      assertEquals("&#x9;", string0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      String string0 = XML.escape("<7%$ywka[.3g/></7%$ywka[.3g/>");
      assertEquals("&lt;7%$ywka[.3g/&gt;&lt;/7%$ywka[.3g/&gt;", string0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      String string0 = XML.escape("s9+-2l &JqQ'24KW.G");
      assertEquals("s&#x7f;9+-2l &amp;JqQ&apos;24KW.G", string0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      String string0 = XML.escape("\"1F-(>~");
      assertEquals("&quot;1F-(&gt;~", string0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Missing '>' after '<!'.");
      // Undeclared exception!
      XML.toJSONObject((Reader) stringReader0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      XML xML0 = new XML();
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      JSONObject jSONObject0 = XML.toJSONObject("<\"\">null</\"\">");
      XML.toString((Object) jSONObject0);
      assertFalse(jSONObject0.isEmpty());
      assertEquals(1, jSONObject0.length());
  }
}
