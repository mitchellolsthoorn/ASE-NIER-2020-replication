/*
 * This file was automatically generated by EvoSuite
 * Fri May 22 02:35:54 GMT 2020
 */

package com.google.gson.internal.bind;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
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
      jsonTreeWriter0.beginArray();
      jsonTreeWriter0.beginObject();
      JsonWriter jsonWriter0 = jsonTreeWriter0.endObject();
      assertSame(jsonWriter0, jsonTreeWriter0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      JsonWriter jsonWriter0 = jsonTreeWriter0.beginArray();
      jsonWriter0.beginArray();
      JsonWriter jsonWriter1 = jsonWriter0.endArray();
      assertFalse(jsonWriter1.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setLenient(true);
      JsonWriter jsonWriter0 = jsonTreeWriter0.value(false);
      assertSame(jsonWriter0, jsonTreeWriter0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setHtmlSafe(true);
      JsonWriter jsonWriter0 = jsonTreeWriter0.value(true);
      assertSame(jsonWriter0, jsonTreeWriter0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setSerializeNulls(false);
      JsonWriter jsonWriter0 = jsonTreeWriter0.value(true);
      assertSame(jsonTreeWriter0, jsonWriter0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setLenient(true);
      JsonWriter jsonWriter0 = jsonTreeWriter0.value("");
      assertSame(jsonTreeWriter0, jsonWriter0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setHtmlSafe(true);
      JsonWriter jsonWriter0 = jsonTreeWriter0.value("");
      assertTrue(jsonWriter0.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setSerializeNulls(false);
      JsonWriter jsonWriter0 = jsonTreeWriter0.value("}!OaA");
      assertFalse(jsonWriter0.isLenient());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setHtmlSafe(true);
      Float float0 = new Float((-245.1F));
      JsonWriter jsonWriter0 = jsonTreeWriter0.value((Number) float0);
      assertSame(jsonWriter0, jsonTreeWriter0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setSerializeNulls(false);
      Long long0 = new Long((-2358L));
      JsonWriter jsonWriter0 = jsonTreeWriter0.value((Number) long0);
      assertFalse(jsonWriter0.isLenient());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setLenient(true);
      Boolean boolean0 = new Boolean("Expected a ");
      JsonWriter jsonWriter0 = jsonTreeWriter0.value(boolean0);
      assertSame(jsonTreeWriter0, jsonWriter0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setHtmlSafe(true);
      Boolean boolean0 = new Boolean(false);
      JsonWriter jsonWriter0 = jsonTreeWriter0.value(boolean0);
      assertSame(jsonTreeWriter0, jsonWriter0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      JsonWriter jsonWriter0 = jsonTreeWriter0.beginObject();
      JsonWriter jsonWriter1 = jsonTreeWriter0.endObject();
      jsonWriter0.setSerializeNulls(false);
      Boolean boolean0 = Boolean.valueOf(false);
      JsonWriter jsonWriter2 = jsonWriter0.value(boolean0);
      assertSame(jsonWriter2, jsonWriter1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setLenient(true);
      JsonWriter jsonWriter0 = jsonTreeWriter0.value(1878L);
      assertTrue(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setSerializeNulls(false);
      JsonWriter jsonWriter0 = jsonTreeWriter0.value(3460L);
      assertSame(jsonWriter0, jsonTreeWriter0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setHtmlSafe(true);
      JsonWriter jsonWriter0 = jsonTreeWriter0.value((-30.505126386271748));
      assertSame(jsonTreeWriter0, jsonWriter0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setSerializeNulls(false);
      JsonWriter jsonWriter0 = jsonTreeWriter0.value((-404.528));
      assertSame(jsonTreeWriter0, jsonWriter0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setLenient(true);
      JsonWriter jsonWriter0 = jsonTreeWriter0.nullValue();
      assertTrue(jsonWriter0.isLenient());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setHtmlSafe(true);
      JsonWriter jsonWriter0 = jsonTreeWriter0.nullValue();
      assertSame(jsonTreeWriter0, jsonWriter0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setLenient(true);
      jsonTreeWriter0.beginObject();
      JsonWriter jsonWriter0 = jsonTreeWriter0.name((String) null);
      assertSame(jsonTreeWriter0, jsonWriter0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setHtmlSafe(true);
      JsonWriter jsonWriter0 = jsonTreeWriter0.beginObject();
      jsonTreeWriter0.name("");
      JsonWriter jsonWriter1 = jsonWriter0.value((-174L));
      assertFalse(jsonWriter1.isLenient());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      JsonWriter jsonWriter0 = jsonTreeWriter0.beginArray();
      jsonWriter0.setLenient(true);
      JsonWriter jsonWriter1 = jsonTreeWriter0.endArray();
      assertTrue(jsonWriter1.isLenient());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setLenient(true);
      jsonTreeWriter0.beginObject();
      JsonWriter jsonWriter0 = jsonTreeWriter0.endObject();
      assertTrue(jsonWriter0.isLenient());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setHtmlSafe(true);
      jsonTreeWriter0.beginObject();
      JsonWriter jsonWriter0 = jsonTreeWriter0.endObject();
      assertSame(jsonTreeWriter0, jsonWriter0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setSerializeNulls(false);
      jsonTreeWriter0.beginObject();
      JsonWriter jsonWriter0 = jsonTreeWriter0.endObject();
      assertFalse(jsonWriter0.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setLenient(true);
      JsonWriter jsonWriter0 = jsonTreeWriter0.beginArray();
      assertSame(jsonWriter0, jsonTreeWriter0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setHtmlSafe(true);
      jsonTreeWriter0.beginArray();
      JsonWriter jsonWriter0 = jsonTreeWriter0.endArray();
      assertSame(jsonTreeWriter0, jsonWriter0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setSerializeNulls(false);
      jsonTreeWriter0.beginArray();
      JsonWriter jsonWriter0 = jsonTreeWriter0.endArray();
      assertFalse(jsonWriter0.isLenient());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.beginObject();
      // Undeclared exception!
      try { 
        jsonTreeWriter0.value(true);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.JsonTreeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      JsonWriter jsonWriter0 = jsonTreeWriter0.beginObject();
      // Undeclared exception!
      try { 
        jsonWriter0.value("uV1/Ddu1j=/k {qW)");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.JsonTreeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
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
  public void test31()  throws Throwable  {
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
  public void test32()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.close();
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
  public void test33()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.beginObject();
      // Undeclared exception!
      try { 
        jsonTreeWriter0.value((-4040.26));
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
      jsonTreeWriter0.close();
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
  public void test35()  throws Throwable  {
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
  public void test36()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      JsonWriter jsonWriter0 = jsonTreeWriter0.beginObject();
      try { 
        jsonWriter0.close();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Incomplete document
         //
         verifyException("com.google.gson.internal.bind.JsonTreeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setLenient(true);
      Double double0 = new Double((-2724.643741));
      JsonWriter jsonWriter0 = jsonTreeWriter0.value((Number) double0);
      assertTrue(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.setLenient(true);
      JsonWriter jsonWriter0 = jsonTreeWriter0.value((double) 3460L);
      assertSame(jsonWriter0, jsonTreeWriter0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      JsonWriter jsonWriter0 = jsonTreeWriter0.value((Boolean) null);
      assertTrue(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      JsonWriter jsonWriter0 = jsonTreeWriter0.value((String) null);
      assertFalse(jsonWriter0.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.beginArray();
      // Undeclared exception!
      try { 
        jsonTreeWriter0.name(";'k|Wiov=EL");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.JsonTreeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.beginObject();
      jsonTreeWriter0.name("5}");
      // Undeclared exception!
      try { 
        jsonTreeWriter0.name("5}");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.JsonTreeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      // Undeclared exception!
      try { 
        jsonTreeWriter0.name("bK|}7!?#:37t");
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
      jsonTreeWriter0.close();
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
  public void test45()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      JsonWriter jsonWriter0 = jsonTreeWriter0.beginObject();
      jsonWriter0.name("");
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
  public void test46()  throws Throwable  {
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
  public void test47()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.beginObject();
      JsonTreeWriter jsonTreeWriter1 = (JsonTreeWriter)jsonTreeWriter0.endObject();
      JsonObject jsonObject0 = (JsonObject)jsonTreeWriter1.get();
      assertFalse(jsonObject0.isJsonNull());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.beginArray();
      jsonTreeWriter0.endArray();
      JsonElement jsonElement0 = jsonTreeWriter0.get();
      assertFalse(jsonElement0.isJsonPrimitive());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.beginObject();
      JsonWriter jsonWriter0 = jsonTreeWriter0.name("n: ");
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
  public void test50()  throws Throwable  {
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
  public void test51()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      JsonWriter jsonWriter0 = jsonTreeWriter0.beginObject();
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
      jsonTreeWriter0.beginObject();
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
  public void test53()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      JsonWriter jsonWriter0 = jsonTreeWriter0.beginObject();
      jsonWriter0.setSerializeNulls(false);
      jsonTreeWriter0.name("");
      JsonWriter jsonWriter1 = jsonTreeWriter0.nullValue();
      assertFalse(jsonWriter1.isLenient());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      JsonElement jsonElement0 = jsonTreeWriter0.get();
      assertFalse(jsonElement0.isJsonObject());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.beginObject();
      // Undeclared exception!
      try { 
        jsonTreeWriter0.get();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Expected one JSON element but was [{}]
         //
         verifyException("com.google.gson.internal.bind.JsonTreeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.value(false);
      JsonElement jsonElement0 = jsonTreeWriter0.get();
      assertTrue(jsonElement0.isJsonPrimitive());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.flush();
      assertTrue(jsonTreeWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
      jsonTreeWriter0.beginObject();
      jsonTreeWriter0.name("");
      JsonWriter jsonWriter0 = jsonTreeWriter0.nullValue();
      assertFalse(jsonWriter0.isLenient());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
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
