/*
 * This file was automatically generated by EvoSuite
 * Fri May 22 00:40:03 GMT 2020
 */

package com.google.gson.internal.bind;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.internal.bind.JsonTreeReader;
import com.google.gson.stream.JsonToken;
import java.util.ConcurrentModificationException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JsonTreeReader_ESTest extends JsonTreeReader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("");
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonPrimitive0);
      String string0 = jsonTreeReader0.nextString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.addProperty("", "");
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonObject0);
      jsonTreeReader0.beginObject();
      String string0 = jsonTreeReader0.nextName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Float float0 = new Float(0.0F);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(float0);
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonPrimitive0);
      long long0 = jsonTreeReader0.nextLong();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Float float0 = new Float((-592.425501));
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(float0);
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonPrimitive0);
      int int0 = jsonTreeReader0.nextInt();
      assertEquals((-592), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Integer integer0 = Integer.getInteger("\n", 0);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(integer0);
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonPrimitive0);
      double double0 = jsonTreeReader0.nextDouble();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader((JsonElement) null);
      // Undeclared exception!
      try { 
        jsonTreeReader0.skipValue();
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonArray0);
      jsonTreeReader0.skipValue();
      // Undeclared exception!
      try { 
        jsonTreeReader0.skipValue();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.google.gson.internal.bind.JsonTreeReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      Float float0 = new Float(0.0);
      jsonObject0.addProperty("3Fg<5j`(6", (Number) float0);
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonObject0);
      jsonTreeReader0.beginObject();
      jsonObject0.addProperty(":", (Number) float0);
      // Undeclared exception!
      try { 
        jsonTreeReader0.promoteNameToValue();
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedTreeMap$LinkedTreeMapIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader((JsonElement) null);
      // Undeclared exception!
      try { 
        jsonTreeReader0.promoteNameToValue();
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonArray0);
      jsonTreeReader0.beginArray();
      Character character0 = new Character('9');
      jsonArray0.add(character0);
      // Undeclared exception!
      try { 
        jsonTreeReader0.peek();
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList$Itr", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader((JsonElement) null);
      // Undeclared exception!
      try { 
        jsonTreeReader0.nextString();
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonArray0);
      // Undeclared exception!
      try { 
        jsonTreeReader0.nextNull();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Expected NULL but was BEGIN_ARRAY at path $
         //
         verifyException("com.google.gson.internal.bind.JsonTreeReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader((JsonElement) null);
      // Undeclared exception!
      try { 
        jsonTreeReader0.nextNull();
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader((JsonElement) null);
      // Undeclared exception!
      try { 
        jsonTreeReader0.nextName();
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader((JsonElement) null);
      // Undeclared exception!
      try { 
        jsonTreeReader0.nextLong();
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader((JsonElement) null);
      // Undeclared exception!
      try { 
        jsonTreeReader0.nextInt();
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonObject0);
      // Undeclared exception!
      try { 
        jsonTreeReader0.nextBoolean();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Expected BOOLEAN but was BEGIN_OBJECT at path $
         //
         verifyException("com.google.gson.internal.bind.JsonTreeReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader((JsonElement) null);
      // Undeclared exception!
      try { 
        jsonTreeReader0.nextBoolean();
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonObject0);
      jsonTreeReader0.close();
      // Undeclared exception!
      try { 
        jsonTreeReader0.hasNext();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // JsonReader is closed
         //
         verifyException("com.google.gson.internal.bind.JsonTreeReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader((JsonElement) null);
      // Undeclared exception!
      try { 
        jsonTreeReader0.hasNext();
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader((JsonElement) null);
      // Undeclared exception!
      try { 
        jsonTreeReader0.endObject();
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonObject0);
      // Undeclared exception!
      try { 
        jsonTreeReader0.endArray();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Expected END_ARRAY but was BEGIN_OBJECT at path $
         //
         verifyException("com.google.gson.internal.bind.JsonTreeReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader((JsonElement) null);
      // Undeclared exception!
      try { 
        jsonTreeReader0.endArray();
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonArray0);
      Boolean boolean0 = Boolean.FALSE;
      jsonTreeReader0.beginArray();
      jsonArray0.add(boolean0);
      // Undeclared exception!
      try { 
        jsonTreeReader0.beginObject();
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList$Itr", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonArray0);
      // Undeclared exception!
      try { 
        jsonTreeReader0.beginObject();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Expected BEGIN_OBJECT but was BEGIN_ARRAY at path $
         //
         verifyException("com.google.gson.internal.bind.JsonTreeReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader((JsonElement) null);
      // Undeclared exception!
      try { 
        jsonTreeReader0.beginObject();
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonArray0);
      jsonTreeReader0.beginArray();
      Short short0 = new Short((short) (-377));
      jsonArray0.add((Number) short0);
      // Undeclared exception!
      try { 
        jsonTreeReader0.beginArray();
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList$Itr", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonObject0);
      // Undeclared exception!
      try { 
        jsonTreeReader0.beginArray();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Expected BEGIN_ARRAY but was BEGIN_OBJECT at path $
         //
         verifyException("com.google.gson.internal.bind.JsonTreeReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader((JsonElement) null);
      // Undeclared exception!
      try { 
        jsonTreeReader0.beginArray();
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonObject0);
      Long long0 = new Long(0L);
      jsonObject0.addProperty("je", (Number) long0);
      jsonTreeReader0.beginObject();
      jsonTreeReader0.skipValue();
      String string0 = jsonTreeReader0.getPath();
      assertEquals("$.null", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonObject0);
      jsonTreeReader0.beginObject();
      String string0 = jsonTreeReader0.getPath();
      assertEquals("$.", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonObject0);
      String string0 = jsonTreeReader0.getPath();
      assertEquals("$", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonArray0);
      jsonTreeReader0.beginArray();
      String string0 = jsonTreeReader0.getPath();
      assertEquals("$[0]", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonArray0);
      String string0 = jsonTreeReader0.getPath();
      assertEquals("$", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader((JsonElement) null);
      jsonTreeReader0.close();
      // Undeclared exception!
      try { 
        jsonTreeReader0.peek();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // JsonReader is closed
         //
         verifyException("com.google.gson.internal.bind.JsonTreeReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonNull0);
      JsonToken jsonToken0 = jsonTreeReader0.peek();
      assertEquals(JsonToken.NULL, jsonToken0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Float float0 = new Float((-1.0));
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(float0);
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonPrimitive0);
      JsonToken jsonToken0 = jsonTreeReader0.peek();
      assertEquals(JsonToken.NUMBER, jsonToken0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(boolean0);
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonPrimitive0);
      JsonToken jsonToken0 = jsonTreeReader0.peek();
      assertEquals(JsonToken.BOOLEAN, jsonToken0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      Float float0 = new Float(0.0);
      jsonObject0.addProperty("\b", (Number) float0);
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonObject0);
      jsonTreeReader0.beginObject();
      jsonTreeReader0.promoteNameToValue();
      JsonToken jsonToken0 = jsonTreeReader0.peek();
      assertEquals(JsonToken.STRING, jsonToken0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonArray0);
      JsonToken jsonToken0 = jsonTreeReader0.peek();
      assertEquals(JsonToken.BEGIN_ARRAY, jsonToken0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonObject0);
      JsonToken jsonToken0 = jsonTreeReader0.peek();
      assertEquals(JsonToken.BEGIN_OBJECT, jsonToken0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonObject0);
      jsonTreeReader0.beginObject();
      JsonToken jsonToken0 = jsonTreeReader0.peek();
      assertEquals(JsonToken.END_OBJECT, jsonToken0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonObject0);
      Long long0 = new Long(0L);
      jsonObject0.addProperty("", (Number) long0);
      jsonTreeReader0.beginObject();
      JsonToken jsonToken0 = jsonTreeReader0.peek();
      assertEquals(JsonToken.NAME, jsonToken0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonArray0);
      jsonArray0.add((Number) null);
      jsonTreeReader0.beginArray();
      JsonToken jsonToken0 = jsonTreeReader0.peek();
      assertEquals(JsonToken.NULL, jsonToken0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonArray0);
      jsonTreeReader0.beginArray();
      JsonToken jsonToken0 = jsonTreeReader0.peek();
      assertEquals(JsonToken.END_ARRAY, jsonToken0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Float float0 = new Float((-1.0));
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add((Number) float0);
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonArray0);
      jsonTreeReader0.beginArray();
      jsonTreeReader0.nextString();
      jsonTreeReader0.endArray();
      JsonToken jsonToken0 = jsonTreeReader0.peek();
      assertEquals(JsonToken.END_DOCUMENT, jsonToken0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader((JsonElement) null);
      // Undeclared exception!
      try { 
        jsonTreeReader0.peek();
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonObject0);
      jsonObject0.addProperty("w", "w");
      jsonTreeReader0.beginObject();
      // Undeclared exception!
      try { 
        jsonTreeReader0.endObject();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Expected END_OBJECT but was NAME at path $.
         //
         verifyException("com.google.gson.internal.bind.JsonTreeReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonArray0);
      jsonTreeReader0.beginArray();
      // Undeclared exception!
      try { 
        jsonTreeReader0.nextLong();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Expected NUMBER but was END_ARRAY at path $[0]
         //
         verifyException("com.google.gson.internal.bind.JsonTreeReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Float float0 = new Float(2388.0804903654034);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(float0);
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonPrimitive0);
      int int0 = jsonTreeReader0.nextInt();
      assertEquals(2388, int0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonArray0);
      // Undeclared exception!
      try { 
        jsonTreeReader0.nextInt();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Expected NUMBER but was BEGIN_ARRAY at path $
         //
         verifyException("com.google.gson.internal.bind.JsonTreeReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("*b7GN+iM3,w/x'H(");
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonPrimitive0);
      // Undeclared exception!
      try { 
        jsonTreeReader0.nextInt();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"*b7GN+iM3,w/x'H(\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonObject0);
      Long long0 = new Long(0L);
      jsonObject0.addProperty("je", (Number) long0);
      jsonTreeReader0.beginObject();
      jsonTreeReader0.skipValue();
      int int0 = jsonTreeReader0.nextInt();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Float float0 = new Float(2388.0804903654034);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(float0);
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonPrimitive0);
      long long0 = jsonTreeReader0.nextLong();
      assertEquals(2388L, long0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("@iYQ@f_e`Wjq");
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonPrimitive0);
      // Undeclared exception!
      try { 
        jsonTreeReader0.nextLong();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"@iYQ@f_e`Wjq\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonArray0);
      Short short0 = new Short((short) (-2089));
      jsonArray0.add((Number) short0);
      jsonTreeReader0.beginArray();
      long long0 = jsonTreeReader0.nextLong();
      assertEquals((-2089L), long0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Float float0 = new Float((-1.0));
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add((Number) float0);
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonArray0);
      jsonTreeReader0.beginArray();
      double double0 = jsonTreeReader0.nextDouble();
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Float float0 = new Float(1851.0088F);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(float0);
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonPrimitive0);
      jsonTreeReader0.setLenient(true);
      double double0 = jsonTreeReader0.nextDouble();
      assertEquals(1851.0087890625, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("com.google.gson.internal.bind.JsonTreeReader");
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonPrimitive0);
      // Undeclared exception!
      try { 
        jsonTreeReader0.nextDouble();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonNull0);
      jsonTreeReader0.nextNull();
      assertFalse(jsonTreeReader0.isLenient());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(boolean0);
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonPrimitive0);
      boolean boolean1 = jsonTreeReader0.nextBoolean();
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonArray0);
      // Undeclared exception!
      try { 
        jsonTreeReader0.nextString();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Expected STRING but was BEGIN_ARRAY at path $
         //
         verifyException("com.google.gson.internal.bind.JsonTreeReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader((JsonElement) null);
      // Undeclared exception!
      try { 
        jsonTreeReader0.nextDouble();
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.addProperty("'", boolean0);
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonObject0);
      jsonTreeReader0.beginObject();
      jsonTreeReader0.skipValue();
      boolean boolean1 = jsonTreeReader0.nextBoolean();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonArray0);
      jsonTreeReader0.beginArray();
      Double double0 = new Double(0.0);
      jsonArray0.add((Number) double0);
      // Undeclared exception!
      try { 
        jsonTreeReader0.endArray();
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList$Itr", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Float float0 = new Float((-3360.29F));
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(float0);
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonPrimitive0);
      jsonTreeReader0.nextDouble();
      // Undeclared exception!
      try { 
        jsonTreeReader0.nextName();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Expected NAME but was END_DOCUMENT at path $
         //
         verifyException("com.google.gson.internal.bind.JsonTreeReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonArray0);
      jsonTreeReader0.beginArray();
      boolean boolean0 = jsonTreeReader0.hasNext();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonArray0);
      boolean boolean0 = jsonTreeReader0.hasNext();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonObject0);
      jsonTreeReader0.beginObject();
      boolean boolean0 = jsonTreeReader0.hasNext();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      Byte byte0 = new Byte((byte)76);
      jsonObject0.addProperty("com.google.gson.internal.bind.TypeAdapters$4", (Number) byte0);
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonObject0);
      jsonTreeReader0.beginObject();
      jsonTreeReader0.nextName();
      jsonTreeReader0.skipValue();
      // Undeclared exception!
      try { 
        jsonTreeReader0.nextDouble();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Expected NUMBER but was END_OBJECT at path $.null
         //
         verifyException("com.google.gson.internal.bind.JsonTreeReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader((JsonElement) null);
      String string0 = jsonTreeReader0.toString();
      assertEquals("JsonTreeReader", string0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonObject0);
      jsonTreeReader0.beginObject();
      jsonTreeReader0.endObject();
      assertFalse(jsonTreeReader0.isLenient());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonObject0);
      // Undeclared exception!
      try { 
        jsonTreeReader0.promoteNameToValue();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Expected NAME but was BEGIN_OBJECT at path $
         //
         verifyException("com.google.gson.internal.bind.JsonTreeReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonNull0);
      jsonTreeReader0.close();
      // Undeclared exception!
      try { 
        jsonTreeReader0.skipValue();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // JsonReader is closed
         //
         verifyException("com.google.gson.internal.bind.JsonTreeReader", e);
      }
  }
}
