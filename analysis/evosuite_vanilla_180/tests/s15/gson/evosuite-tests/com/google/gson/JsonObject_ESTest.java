/*
 * This file was automatically generated by EvoSuite
 * Fri May 22 20:42:28 GMT 2020
 */

package com.google.gson;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.util.Map;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JsonObject_ESTest extends JsonObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      Set<Map.Entry<String, JsonElement>> set0 = (Set<Map.Entry<String, JsonElement>>)jsonObject0.entrySet();
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.add("P", (JsonElement) null);
      int int0 = jsonObject0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      Long long0 = new Long(1129L);
      jsonObject0.addProperty("P", (Number) long0);
      JsonPrimitive jsonPrimitive0 = (JsonPrimitive)jsonObject0.remove("P");
      assertFalse(jsonPrimitive0.isBoolean());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.add("P", jsonObject0);
      JsonElement jsonElement0 = jsonObject0.remove("P");
      assertFalse(jsonElement0.isJsonArray());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonArray jsonArray0 = new JsonArray();
      jsonObject0.add("", jsonArray0);
      JsonElement jsonElement0 = jsonObject0.remove("");
      assertSame(jsonElement0, jsonArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.add("P", (JsonElement) null);
      JsonElement jsonElement0 = jsonObject0.remove("P");
      assertFalse(jsonElement0.isJsonPrimitive());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      Long long0 = new Long(477L);
      jsonObject0.addProperty("", (Number) long0);
      boolean boolean0 = jsonObject0.has("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.addProperty("com.google.gson.internal.bind.TypeAdapters$18", "Expected ");
      JsonPrimitive jsonPrimitive0 = jsonObject0.getAsJsonPrimitive("com.google.gson.internal.bind.TypeAdapters$18");
      assertTrue(jsonPrimitive0.isJsonPrimitive());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonArray jsonArray0 = new JsonArray();
      jsonObject0.add("", jsonArray0);
      JsonArray jsonArray1 = jsonObject0.getAsJsonArray("");
      assertTrue(jsonArray1.isJsonArray());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      Character character0 = new Character('?');
      jsonObject0.addProperty("Expected ':'", character0);
      JsonElement jsonElement0 = jsonObject0.get("Expected ':'");
      assertTrue(jsonElement0.isJsonPrimitive());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonArray jsonArray0 = new JsonArray();
      jsonObject0.add("", jsonArray0);
      JsonElement jsonElement0 = jsonObject0.get("");
      assertFalse(jsonElement0.isJsonObject());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.add("kzf9O}EHC", (JsonElement) null);
      JsonElement jsonElement0 = jsonObject0.get("kzf9O}EHC");
      assertFalse(jsonElement0.isJsonArray());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonArray jsonArray0 = new JsonArray();
      jsonObject0.add("", jsonArray0);
      // Undeclared exception!
      try { 
        jsonObject0.getAsJsonObject("");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.gson.JsonArray cannot be cast to com.google.gson.JsonObject
         //
         verifyException("com.google.gson.JsonObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      Character character0 = Character.valueOf('p');
      jsonObject0.addProperty("", character0);
      // Undeclared exception!
      try { 
        jsonObject0.getAsJsonArray("");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.gson.JsonPrimitive cannot be cast to com.google.gson.JsonArray
         //
         verifyException("com.google.gson.JsonObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      // Undeclared exception!
      try { 
        jsonObject0.addProperty((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key == null
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      Boolean boolean0 = Boolean.valueOf((String) null);
      // Undeclared exception!
      try { 
        jsonObject0.addProperty((String) null, boolean0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key == null
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      // Undeclared exception!
      try { 
        jsonObject0.add((String) null, jsonObject0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key == null
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.add("", jsonObject0);
      JsonObject jsonObject1 = jsonObject0.getAsJsonObject("");
      assertSame(jsonObject1, jsonObject0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.addProperty("com.google.gson.internal.bind.TypeAdapters$18", "com.google.gson.internal.bind.TypeAdapters$18");
      JsonObject jsonObject1 = new JsonObject();
      boolean boolean0 = jsonObject0.equals(jsonObject1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      boolean boolean0 = jsonObject0.equals("com.google.gson.internal.bind.TypeAdapters$18");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      boolean boolean0 = jsonObject0.equals(jsonObject0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.addProperty("pm^CXwW+", (Character) null);
      assertTrue(jsonObject0.isJsonObject());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      Character character0 = Character.valueOf('=');
      // Undeclared exception!
      try { 
        jsonObject0.addProperty((String) null, character0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key == null
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.addProperty("", (Boolean) null);
      // Undeclared exception!
      try { 
        jsonObject0.getAsJsonPrimitive("");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.gson.JsonNull cannot be cast to com.google.gson.JsonPrimitive
         //
         verifyException("com.google.gson.JsonObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      Boolean boolean0 = Boolean.TRUE;
      jsonObject0.addProperty("9bSZ-v9<g-_", boolean0);
      JsonPrimitive jsonPrimitive0 = jsonObject0.getAsJsonPrimitive("9bSZ-v9<g-_");
      assertFalse(jsonPrimitive0.isJsonObject());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      // Undeclared exception!
      try { 
        jsonObject0.addProperty((String) null, (Number) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key == null
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      Float float0 = new Float((-926.62494F));
      jsonObject0.addProperty("vx^?f(L", (Number) float0);
      JsonPrimitive jsonPrimitive0 = jsonObject0.getAsJsonPrimitive("vx^?f(L");
      assertFalse(jsonPrimitive0.isJsonArray());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.add("Uv(b/fFF[.", (JsonElement) null);
      JsonObject jsonObject1 = jsonObject0.deepCopy();
      assertTrue(jsonObject1.equals((Object)jsonObject0));
      assertNotSame(jsonObject1, jsonObject0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonObject jsonObject1 = jsonObject0.deepCopy();
      boolean boolean0 = jsonObject0.equals(jsonObject1);
      assertTrue(boolean0);
      assertNotSame(jsonObject1, jsonObject0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.hashCode();
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonObject jsonObject1 = jsonObject0.getAsJsonObject("");
      assertNull(jsonObject1);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonPrimitive jsonPrimitive0 = jsonObject0.getAsJsonPrimitive("9bSZ-v9<g-_");
      assertNull(jsonPrimitive0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonElement jsonElement0 = jsonObject0.get("");
      assertNull(jsonElement0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonArray jsonArray0 = jsonObject0.getAsJsonArray("");
      assertNull(jsonArray0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      boolean boolean0 = jsonObject0.has("com.google.gson.JsonObject");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonElement jsonElement0 = jsonObject0.remove("z1P\"8H|Nc&");
      assertNull(jsonElement0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      int int0 = jsonObject0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      Set<String> set0 = jsonObject0.keySet();
      assertTrue(set0.isEmpty());
  }
}
