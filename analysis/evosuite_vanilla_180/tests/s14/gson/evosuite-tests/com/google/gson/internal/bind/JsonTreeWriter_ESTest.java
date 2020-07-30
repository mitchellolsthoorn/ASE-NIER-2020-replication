/*
 * This file was automatically generated by EvoSuite
 * Fri May 22 20:20:33 GMT 2020
 */

package com.google.gson.internal.bind;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.internal.bind.JsonTreeWriter;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JsonTreeWriter_ESTest extends JsonTreeWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      JsonWriter jsonWriter0 = jsonTreeWriter0.beginArray();
      jsonWriter0.beginObject();
      jsonWriter0.name("$u<WqPUP0)v3roK");
      jsonTreeWriter0.value(false);
      JsonWriter jsonWriter1 = jsonWriter0.endObject();
      assertFalse(jsonWriter1.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setLenient(true);
      JsonWriter jsonWriter0 = jsonTreeWriter0.value(false);
      assertFalse(jsonWriter0.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setHtmlSafe(true);
      JsonWriter jsonWriter0 = jsonTreeWriter0.value(false);
      assertFalse(jsonWriter0.isLenient());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setSerializeNulls(false);
      JsonWriter jsonWriter0 = jsonTreeWriter0.value(true);
      assertSame(jsonTreeWriter0, jsonWriter0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setLenient(true);
      JsonWriter jsonWriter0 = jsonTreeWriter0.value("yz+j6.m\"IY(a");
      assertSame(jsonTreeWriter0, jsonWriter0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setHtmlSafe(true);
      JsonWriter jsonWriter0 = jsonTreeWriter0.value("");
      assertTrue(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setSerializeNulls(false);
      JsonWriter jsonWriter0 = jsonTreeWriter0.value("com.google.gson.internal.bind.TypeAdapters$10");
      assertSame(jsonTreeWriter0, jsonWriter0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setHtmlSafe(true);
      Double double0 = new Double((-1222.832143688082));
      JsonWriter jsonWriter0 = jsonTreeWriter0.value((Number) double0);
      assertSame(jsonTreeWriter0, jsonWriter0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setSerializeNulls(false);
      Float float0 = new Float(0.0);
      JsonWriter jsonWriter0 = jsonTreeWriter0.value((Number) float0);
      assertFalse(jsonWriter0.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setLenient(true);
      Boolean boolean0 = Boolean.TRUE;
      JsonWriter jsonWriter0 = jsonTreeWriter0.value(boolean0);
      assertTrue(jsonWriter0.isLenient());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setHtmlSafe(true);
      Boolean boolean0 = new Boolean("tX12W`TU=aw*eq=(#k");
      JsonWriter jsonWriter0 = jsonTreeWriter0.value(boolean0);
      assertSame(jsonWriter0, jsonTreeWriter0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setSerializeNulls(false);
      jsonTreeWriter0.beginObject();
      jsonTreeWriter0.name("ANG[).ZS%~q@d");
      Boolean boolean0 = Boolean.TRUE;
      JsonWriter jsonWriter0 = jsonTreeWriter0.value(boolean0);
      assertSame(jsonTreeWriter0, jsonWriter0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setLenient(true);
      JsonWriter jsonWriter0 = jsonTreeWriter0.value(0L);
      assertTrue(jsonWriter0.isLenient());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setHtmlSafe(true);
      JsonWriter jsonWriter0 = jsonTreeWriter0.value(3662L);
      assertFalse(jsonWriter0.isLenient());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setSerializeNulls(false);
      JsonWriter jsonWriter0 = jsonTreeWriter0.value((-1L));
      assertFalse(jsonWriter0.isLenient());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setHtmlSafe(true);
      JsonWriter jsonWriter0 = jsonTreeWriter0.value((double) 3662L);
      assertSame(jsonWriter0, jsonTreeWriter0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setSerializeNulls(false);
      JsonWriter jsonWriter0 = jsonTreeWriter0.value(0.0);
      assertSame(jsonTreeWriter0, jsonWriter0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setLenient(true);
      JsonWriter jsonWriter0 = jsonTreeWriter0.nullValue();
      assertFalse(jsonWriter0.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setHtmlSafe(true);
      JsonWriter jsonWriter0 = jsonTreeWriter0.nullValue();
      assertFalse(jsonWriter0.isLenient());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setLenient(true);
      jsonTreeWriter0.beginObject();
      JsonWriter jsonWriter0 = jsonTreeWriter0.name("SoS<QWx^");
      assertFalse(jsonWriter0.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.beginObject();
      jsonTreeWriter0.setHtmlSafe(true);
      JsonWriter jsonWriter0 = jsonTreeWriter0.name("Expected a ");
      assertSame(jsonWriter0, jsonTreeWriter0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      Double double0 = new Double(230.33757823724);
      jsonTreeWriter0.value((Number) double0);
      JsonPrimitive jsonPrimitive0 = (JsonPrimitive)jsonTreeWriter0.get();
      assertFalse(jsonPrimitive0.isString());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      JsonElement jsonElement0 = jsonTreeWriter0.get();
      assertFalse(jsonElement0.isJsonObject());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setSerializeNulls(false);
      jsonTreeWriter0.beginObject();
      JsonWriter jsonWriter0 = jsonTreeWriter0.endObject();
      assertFalse(jsonWriter0.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.beginArray();
      jsonTreeWriter0.setSerializeNulls(false);
      JsonWriter jsonWriter0 = jsonTreeWriter0.endArray();
      assertSame(jsonWriter0, jsonTreeWriter0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setLenient(true);
      JsonWriter jsonWriter0 = jsonTreeWriter0.beginObject();
      JsonWriter jsonWriter1 = jsonTreeWriter0.endObject();
      assertSame(jsonWriter1, jsonWriter0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setHtmlSafe(true);
      jsonTreeWriter0.beginObject();
      JsonWriter jsonWriter0 = jsonTreeWriter0.endObject();
      assertFalse(jsonWriter0.isLenient());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setLenient(true);
      jsonTreeWriter0.beginArray();
      JsonWriter jsonWriter0 = jsonTreeWriter0.endArray();
      assertSame(jsonTreeWriter0, jsonWriter0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setHtmlSafe(true);
      jsonTreeWriter0.beginArray();
      JsonWriter jsonWriter0 = jsonTreeWriter0.endArray();
      assertTrue(jsonWriter0.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setSerializeNulls(false);
      JsonWriter jsonWriter0 = jsonTreeWriter0.beginArray();
      assertFalse(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.close();
      // Undeclared exception!
      try { 
        jsonTreeWriter0.value(false);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.JsonTreeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.beginObject();
      // Undeclared exception!
      try { 
        jsonTreeWriter0.value("Error] Expecting: bitset nu]ber value (1,P0), Found: ");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.JsonTreeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      JsonWriter jsonWriter0 = jsonTreeWriter0.beginObject();
      // Undeclared exception!
      try { 
        jsonWriter0.value((Number) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.JsonTreeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.beginObject();
      Boolean boolean0 = Boolean.FALSE;
      // Undeclared exception!
      try { 
        jsonTreeWriter0.value(boolean0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.JsonTreeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.beginObject();
      // Undeclared exception!
      try { 
        jsonTreeWriter0.value(0L);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.JsonTreeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.close();
      // Undeclared exception!
      try { 
        jsonTreeWriter0.value(564.5287);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.JsonTreeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.close();
      // Undeclared exception!
      try { 
        jsonTreeWriter0.beginObject();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.JsonTreeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.close();
      // Undeclared exception!
      try { 
        jsonTreeWriter0.beginArray();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.JsonTreeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.beginArray();
      try { 
        jsonTreeWriter0.close();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Incomplete document
         //
         verifyException("com.google.gson.internal.bind.JsonTreeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setLenient(true);
      Integer integer0 = new Integer((-3765));
      JsonWriter jsonWriter0 = jsonTreeWriter0.value((Number) integer0);
      assertSame(jsonWriter0, jsonTreeWriter0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setLenient(true);
      JsonWriter jsonWriter0 = jsonTreeWriter0.value((-2869.921168636));
      assertTrue(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      JsonWriter jsonWriter0 = jsonTreeWriter0.value((Boolean) null);
      assertFalse(jsonWriter0.isLenient());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      JsonWriter jsonWriter0 = jsonTreeWriter0.value((String) null);
      assertSame(jsonWriter0, jsonTreeWriter0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.beginArray();
      // Undeclared exception!
      try { 
        jsonTreeWriter0.name("04IEA,q`xf");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.JsonTreeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      JsonWriter jsonWriter0 = jsonTreeWriter0.beginObject();
      jsonWriter0.name("w");
      // Undeclared exception!
      try { 
        jsonTreeWriter0.name("w");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.JsonTreeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      // Undeclared exception!
      try { 
        jsonTreeWriter0.name("]'2K\"ugQ{jD2Y<#!St");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.JsonTreeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      JsonTreeWriter jsonTreeWriter1 = (JsonTreeWriter)jsonTreeWriter0.beginObject();
      jsonTreeWriter0.endObject();
      JsonObject jsonObject0 = (JsonObject)jsonTreeWriter1.get();
      assertFalse(jsonObject0.isJsonArray());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.beginObject();
      jsonTreeWriter0.name("D@py");
      // Undeclared exception!
      try { 
        jsonTreeWriter0.endObject();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.JsonTreeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      // Undeclared exception!
      try { 
        jsonTreeWriter0.endObject();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.JsonTreeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      JsonWriter jsonWriter0 = jsonTreeWriter0.beginArray();
      // Undeclared exception!
      try { 
        jsonWriter0.endObject();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.JsonTreeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.beginObject();
      // Undeclared exception!
      try { 
        jsonTreeWriter0.endArray();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.JsonTreeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.beginObject();
      JsonWriter jsonWriter0 = jsonTreeWriter0.name("");
      // Undeclared exception!
      try { 
        jsonWriter0.endArray();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.JsonTreeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      // Undeclared exception!
      try { 
        jsonTreeWriter0.endArray();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.JsonTreeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.beginObject();
      // Undeclared exception!
      try { 
        jsonTreeWriter0.nullValue();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.JsonTreeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setSerializeNulls(false);
      jsonTreeWriter0.beginObject();
      jsonTreeWriter0.name("Incomplete document");
      JsonWriter jsonWriter0 = jsonTreeWriter0.nullValue();
      assertFalse(jsonWriter0.isLenient());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      JsonTreeWriter jsonTreeWriter1 = (JsonTreeWriter)jsonTreeWriter0.beginArray();
      jsonTreeWriter1.endArray();
      JsonArray jsonArray0 = (JsonArray)jsonTreeWriter1.get();
      assertTrue(jsonArray0.isJsonArray());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.beginArray();
      // Undeclared exception!
      try { 
        jsonTreeWriter0.get();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Expected one JSON element but was [[]]
         //
         verifyException("com.google.gson.internal.bind.JsonTreeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.beginArray();
      JsonWriter jsonWriter0 = jsonTreeWriter0.beginArray();
      JsonWriter jsonWriter1 = jsonTreeWriter0.endArray();
      assertSame(jsonWriter1, jsonWriter0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.flush();
      assertFalse(jsonTreeWriter0.isLenient());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.beginObject();
      jsonTreeWriter0.name("Incomplete document");
      JsonWriter jsonWriter0 = jsonTreeWriter0.nullValue();
      assertSame(jsonTreeWriter0, jsonWriter0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      // Undeclared exception!
      try { 
        jsonTreeWriter0.jsonValue("");
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
