/*
 * This file was automatically generated by EvoSuite
 * Thu May 21 21:46:21 GMT 2020
 */

package com.google.gson.stream;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JsonWriter_ESTest extends JsonWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.beginArray();
      JsonWriter jsonWriter2 = jsonWriter1.name("java.lang.Short@0000000004");
      // Undeclared exception!
      try { 
        jsonWriter2.beginObject();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Nesting problem.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.beginArray();
      // Undeclared exception!
      try { 
        jsonWriter1.endObject();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Nesting problem.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setLenient(true);
      jsonWriter0.value(true);
      assertEquals("true", stringWriter0.toString());
      assertTrue(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setHtmlSafe(true);
      jsonWriter0.value(false);
      assertTrue(jsonWriter0.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(502);
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setSerializeNulls(false);
      jsonWriter0.value(false);
      assertEquals("false", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setLenient(true);
      JsonWriter jsonWriter1 = jsonWriter0.value("java.lang.Long@0000000003");
      assertTrue(jsonWriter1.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setSerializeNulls(false);
      JsonWriter jsonWriter1 = jsonWriter0.value("java.lang.Double@0000000002");
      assertFalse(jsonWriter1.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setHtmlSafe(true);
      Double double0 = new Double(0.0);
      jsonWriter0.value((Number) double0);
      assertTrue(jsonWriter0.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(502);
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setSerializeNulls(false);
      Float float0 = new Float((-818.0865F));
      JsonWriter jsonWriter1 = jsonWriter0.value((Number) float0);
      assertFalse(jsonWriter1.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      Boolean boolean0 = Boolean.valueOf("H@ulgp=N<]v");
      jsonWriter0.setLenient(true);
      jsonWriter0.value(boolean0);
      assertEquals("false", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setHtmlSafe(true);
      Boolean boolean0 = Boolean.FALSE;
      jsonWriter0.value(boolean0);
      assertEquals("false", stringWriter0.toString());
      assertTrue(jsonWriter0.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setSerializeNulls(false);
      jsonWriter0.value((Boolean) null);
      assertEquals("null", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(39);
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setLenient(true);
      jsonWriter0.value((-956L));
      assertEquals("-956", stringWriter0.toString());
      assertTrue(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setHtmlSafe(true);
      jsonWriter0.value(88L);
      assertEquals("88", stringWriter0.toString());
      assertTrue(jsonWriter0.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setSerializeNulls(false);
      jsonWriter0.value(2534L);
      assertEquals("2534", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setHtmlSafe(true);
      jsonWriter0.value((-236.0));
      assertTrue(jsonWriter0.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.beginObject();
      jsonWriter0.name("v");
      jsonWriter0.setSerializeNulls(false);
      jsonWriter0.value((double) (short) (-1));
      assertEquals("{\"v\":-1.0", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(39);
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setLenient(true);
      jsonWriter0.nullValue();
      assertEquals("null", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setHtmlSafe(true);
      jsonWriter0.nullValue();
      assertEquals("null", stringWriter0.toString());
      assertTrue(jsonWriter0.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setLenient(true);
      JsonWriter jsonWriter1 = jsonWriter0.name("\"a string\"");
      assertTrue(jsonWriter1.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setHtmlSafe(true);
      jsonWriter0.name("Nesting problem.");
      assertTrue(jsonWriter0.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(0);
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setLenient(true);
      jsonWriter0.jsonValue("H@ulgp=N<]v");
      assertEquals("H@ulgp=N<]v", stringWriter0.toString());
      assertTrue(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setHtmlSafe(true);
      jsonWriter0.jsonValue("java.lang.Byte@0000000002");
      assertTrue(jsonWriter0.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(502);
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setSerializeNulls(false);
      jsonWriter0.jsonValue("=!08,");
      assertEquals("=!08,", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setLenient(true);
      jsonWriter0.isLenient();
      assertTrue(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(1);
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setHtmlSafe(true);
      boolean boolean0 = jsonWriter0.isHtmlSafe();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setSerializeNulls(false);
      boolean boolean0 = jsonWriter0.getSerializeNulls();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setLenient(true);
      JsonWriter jsonWriter1 = jsonWriter0.beginObject();
      jsonWriter1.endObject();
      assertEquals("{}", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.beginObject();
      jsonWriter1.endObject();
      assertEquals("{}", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.beginObject();
      jsonWriter1.name("Infinity");
      jsonWriter0.setSerializeNulls(false);
      jsonWriter1.beginObject();
      jsonWriter0.endObject();
      assertEquals("{\"Infinity\":{}", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.beginArray();
      jsonWriter1.setLenient(true);
      jsonWriter0.endArray();
      assertEquals("[]", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.beginArray();
      jsonWriter1.setHtmlSafe(true);
      jsonWriter0.endArray();
      assertTrue(jsonWriter0.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.beginArray();
      jsonWriter0.setSerializeNulls(false);
      jsonWriter0.endArray();
      assertEquals("[]", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setHtmlSafe(true);
      jsonWriter0.beginObject();
      assertEquals("{", stringWriter0.toString());
      assertTrue(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setLenient(true);
      jsonWriter0.beginArray();
      assertEquals("[", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(1);
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setHtmlSafe(true);
      jsonWriter0.beginArray();
      assertTrue(jsonWriter0.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.beginObject();
      jsonWriter1.setSerializeNulls(false);
      jsonWriter1.name("`|,naf/O{` 4W");
      jsonWriter1.beginArray();
      assertEquals("{\"`|,naf/O{` 4W\":[", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.beginObject();
      // Undeclared exception!
      try { 
        jsonWriter1.value(true);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Nesting problem.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.value("\"a string\"");
      // Undeclared exception!
      try { 
        jsonWriter0.value("\"a string\"");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // JSON must have only one top-level value.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.nullValue();
      Byte byte0 = new Byte((byte)3);
      // Undeclared exception!
      try { 
        jsonWriter0.value((Number) byte0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // JSON must have only one top-level value.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.nullValue();
      Boolean boolean0 = Boolean.TRUE;
      // Undeclared exception!
      try { 
        jsonWriter1.value(boolean0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // JSON must have only one top-level value.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.beginObject();
      // Undeclared exception!
      try { 
        jsonWriter0.value(0L);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Nesting problem.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      // Undeclared exception!
      try { 
        jsonWriter0.setIndent((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.name("\"a string\"");
      // Undeclared exception!
      try { 
        jsonWriter0.beginArray();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Nesting problem.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.beginObject();
      // Undeclared exception!
      try { 
        jsonWriter0.beginObject();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Nesting problem.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.beginArray();
      JsonWriter jsonWriter1 = jsonWriter0.beginArray();
      JsonWriter jsonWriter2 = jsonWriter1.beginArray();
      JsonWriter jsonWriter3 = jsonWriter2.beginArray();
      JsonWriter jsonWriter4 = jsonWriter3.beginArray();
      JsonWriter jsonWriter5 = jsonWriter0.beginArray();
      JsonWriter jsonWriter6 = jsonWriter1.beginArray();
      JsonWriter jsonWriter7 = jsonWriter5.beginArray();
      JsonWriter jsonWriter8 = jsonWriter3.beginArray();
      JsonWriter jsonWriter9 = jsonWriter7.beginArray();
      JsonWriter jsonWriter10 = jsonWriter7.beginArray();
      jsonWriter5.beginArray();
      jsonWriter10.beginArray();
      jsonWriter0.beginArray();
      JsonWriter jsonWriter11 = jsonWriter4.beginArray();
      JsonWriter jsonWriter12 = jsonWriter8.beginArray();
      jsonWriter3.beginArray();
      JsonWriter jsonWriter13 = jsonWriter0.beginArray();
      jsonWriter13.beginArray();
      JsonWriter jsonWriter14 = jsonWriter9.beginArray();
      jsonWriter14.beginArray();
      JsonWriter jsonWriter15 = jsonWriter12.beginObject();
      jsonWriter15.name("Infinity");
      jsonWriter7.beginArray();
      jsonWriter2.beginArray();
      JsonWriter jsonWriter16 = jsonWriter12.beginArray();
      jsonWriter0.beginArray();
      jsonWriter10.beginArray();
      jsonWriter3.beginArray();
      jsonWriter5.beginArray();
      jsonWriter6.beginArray();
      jsonWriter11.beginArray();
      jsonWriter16.beginArray();
      assertEquals("[[[[[[[[[[[[[[[[[[[[[{\"Infinity\":[[[[[[[[[[", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.nullValue();
      jsonWriter1.setLenient(true);
      jsonWriter0.beginObject();
      assertEquals("null{", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.value("m-$RV\"B");
      // Undeclared exception!
      try { 
        jsonWriter1.jsonValue("m-$RV\"B");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // JSON must have only one top-level value.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.beginObject();
      JsonWriter jsonWriter2 = jsonWriter1.name(";kN");
      jsonWriter1.value(0.0);
      // Undeclared exception!
      try { 
        jsonWriter2.beginObject();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Nesting problem.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.beginObject();
      // Undeclared exception!
      try { 
        jsonWriter1.value(0.0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Nesting problem.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.beginArray();
      jsonWriter1.nullValue();
      jsonWriter0.beginObject();
      assertEquals("[null,{", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.beginObject();
      JsonWriter jsonWriter2 = jsonWriter1.name("99");
      JsonWriter jsonWriter3 = jsonWriter2.value((-4049L));
      jsonWriter0.name("99");
      jsonWriter3.value(521.1215);
      assertEquals("{\"99\":-4049,\"99\":521.1215", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.beginArray();
      jsonWriter1.setIndent("J_b MScl9'");
      jsonWriter0.beginObject();
      assertEquals("[\nJ_b MScl9'{", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setHtmlSafe(true);
      jsonWriter0.value("\"a string\"");
      assertTrue(jsonWriter0.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      try { 
        jsonWriter0.close();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Incomplete document
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.nullValue();
      jsonWriter1.close();
      jsonWriter1.close();
      assertEquals("null", stringWriter0.toString());
      assertTrue(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.beginObject();
      try { 
        jsonWriter0.close();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Incomplete document
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.nullValue();
      jsonWriter1.close();
      // Undeclared exception!
      try { 
        jsonWriter0.flush();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // JsonWriter is closed.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.flush();
      assertTrue(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setLenient(true);
      Byte byte0 = new Byte((byte)96);
      jsonWriter0.value((Number) byte0);
      assertTrue(jsonWriter0.isLenient());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.value((Number) null);
      assertEquals("null", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      Boolean boolean0 = Boolean.TRUE;
      jsonWriter0.value(boolean0);
      assertEquals("true", stringWriter0.toString());
      assertTrue(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.name("Nesting problem.");
      assertTrue(jsonWriter1.getSerializeNulls());
      
      jsonWriter0.setSerializeNulls(false);
      assertFalse(jsonWriter0.getSerializeNulls());
      
      jsonWriter0.nullValue();
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.name("[ i<Wv_}qm}Ibaj-C: ");
      // Undeclared exception!
      try { 
        jsonWriter1.nullValue();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Nesting problem.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.jsonValue((String) null);
      assertEquals("null", stringWriter0.toString());
      assertTrue(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.value((String) null);
      assertEquals("null", stringWriter0.toString());
      assertTrue(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.value("J_b MScl9'");
      jsonWriter1.close();
      // Undeclared exception!
      try { 
        jsonWriter0.name("J_b MScl9'");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // JsonWriter is closed.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.name("\" stri|ng\"");
      // Undeclared exception!
      try { 
        jsonWriter1.name("\" stri|ng\"");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      // Undeclared exception!
      try { 
        jsonWriter0.name((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // name == null
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.nullValue();
      jsonWriter0.close();
      // Undeclared exception!
      try { 
        jsonWriter0.nullValue();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // JsonWriter is closed.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setIndent("");
      assertTrue(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      JsonWriter jsonWriter0 = null;
      try {
        jsonWriter0 = new JsonWriter((Writer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // out == null
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.beginObject();
      JsonWriter jsonWriter1 = jsonWriter0.name("java.lang.Long@0000000003");
      // Undeclared exception!
      try { 
        jsonWriter1.endObject();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Dangling name: java.lang.Long@0000000003
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      // Undeclared exception!
      try { 
        jsonWriter0.endObject();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Nesting problem.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      // Undeclared exception!
      try { 
        jsonWriter0.endArray();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Nesting problem.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.beginArray();
      jsonWriter1.nullValue();
      jsonWriter0.endArray();
      assertEquals("[null]", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      boolean boolean0 = jsonWriter0.getSerializeNulls();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(502);
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.isLenient();
      assertTrue(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.isHtmlSafe();
      assertTrue(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      jsonWriter0.setLenient(true);
      jsonWriter0.value((-869.1030405682));
      assertEquals("-869.1030405682", stringWriter0.toString());
  }
}
