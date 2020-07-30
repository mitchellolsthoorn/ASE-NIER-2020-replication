/*
 * This file was automatically generated by EvoSuite
 * Fri May 22 17:07:23 GMT 2020
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
      jsonObject0.add("+ztr", jsonObject0);
      int int0 = jsonObject0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.add("{\"fruit\":\"Expected BEGIN_OBJECT but was \",\"size\":\"Large\",\"color\":\"Red\",\"value\":99,\"value2\":false,\"number\":\"1\",\"x\":-99}", jsonObject0);
      JsonElement jsonElement0 = jsonObject0.remove("{\"fruit\":\"Expected BEGIN_OBJECT but was \",\"size\":\"Large\",\"color\":\"Red\",\"value\":99,\"value2\":false,\"number\":\"1\",\"x\":-99}");
      assertFalse(jsonElement0.isJsonArray());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.add("{\"fruit\":\"Apple\",\"size\":\"Large\",\"color\":\"Red\",\"value\":true,\"value2\":false,\"number\":\"1\",\"x\":-99}", (JsonElement) null);
      JsonElement jsonElement0 = jsonObject0.remove("{\"fruit\":\"Apple\",\"size\":\"Large\",\"color\":\"Red\",\"value\":true,\"value2\":false,\"number\":\"1\",\"x\":-99}");
      assertFalse(jsonElement0.isJsonObject());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonArray jsonArray0 = new JsonArray();
      jsonObject0.add("{\"fruit\":\"\",\"size\":\"Large\",\"color\":\"Red\",\"value\":true,\"value2\":false,\"number\":-99,\"x\":-99,\"xx\":-99}", jsonArray0);
      JsonElement jsonElement0 = jsonObject0.remove("{\"fruit\":\"\",\"size\":\"Large\",\"color\":\"Red\",\"value\":true,\"value2\":false,\"number\":-99,\"x\":-99,\"xx\":-99}");
      assertFalse(jsonElement0.isJsonObject());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      Short short0 = new Short((short) (-1909));
      jsonObject0.addProperty("fuVHAFAR@2]]u5lk^hq", (Number) short0);
      JsonPrimitive jsonPrimitive0 = (JsonPrimitive)jsonObject0.remove("fuVHAFAR@2]]u5lk^hq");
      assertFalse(jsonPrimitive0.isString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.addProperty("", "");
      boolean boolean0 = jsonObject0.has("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.addProperty("[] U$ymF25-\")F#cUD", "xPSVs<6H2");
      JsonPrimitive jsonPrimitive0 = jsonObject0.getAsJsonPrimitive("[] U$ymF25-\")F#cUD");
      assertFalse(jsonPrimitive0.isJsonObject());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      Boolean boolean0 = new Boolean(false);
      jsonObject0.addProperty("X", boolean0);
      JsonPrimitive jsonPrimitive0 = jsonObject0.getAsJsonPrimitive("X");
      assertFalse(jsonPrimitive0.isNumber());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      Byte byte0 = new Byte((byte)44);
      jsonObject0.addProperty("l.", (Number) byte0);
      JsonPrimitive jsonPrimitive0 = jsonObject0.getAsJsonPrimitive("l.");
      assertFalse(jsonPrimitive0.isJsonObject());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      Boolean boolean0 = Boolean.valueOf(false);
      jsonObject0.addProperty("\"a string\"", boolean0);
      JsonPrimitive jsonPrimitive0 = (JsonPrimitive)jsonObject0.get("\"a string\"");
      assertFalse(jsonPrimitive0.isString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.add("true", (JsonElement) null);
      JsonElement jsonElement0 = jsonObject0.get("true");
      assertFalse(jsonElement0.isJsonObject());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.add("+ztr", jsonObject0);
      JsonElement jsonElement0 = jsonObject0.get("+ztr");
      assertTrue(jsonElement0.isJsonObject());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.addProperty("", "");
      // Undeclared exception!
      try { 
        jsonObject0.getAsJsonObject("");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.gson.JsonPrimitive cannot be cast to com.google.gson.JsonObject
         //
         verifyException("com.google.gson.JsonObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.addProperty("", "");
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
      Float float0 = new Float(51.34F);
      // Undeclared exception!
      try { 
        jsonObject0.addProperty((String) null, (Number) float0);
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
      Character character0 = new Character('%');
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
  public void test16()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      Boolean boolean0 = Boolean.TRUE;
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
  public void test17()  throws Throwable  {
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
  public void test18()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.add("", jsonObject0);
      JsonObject jsonObject1 = jsonObject0.getAsJsonObject("");
      assertSame(jsonObject1, jsonObject0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      Boolean boolean0 = Boolean.valueOf(false);
      jsonObject0.addProperty("\"a string\"", boolean0);
      JsonObject jsonObject1 = new JsonObject();
      boolean boolean1 = jsonObject1.equals(jsonObject0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      boolean boolean0 = jsonObject0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      boolean boolean0 = jsonObject0.equals(jsonObject0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.addProperty("com.google.gson.internal.bind.TypeAdapters$23", (Character) null);
      assertTrue(jsonObject0.isJsonObject());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.addProperty("_", (Boolean) null);
      assertFalse(jsonObject0.isJsonNull());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.addProperty("~#", (Number) null);
      // Undeclared exception!
      try { 
        jsonObject0.getAsJsonPrimitive("~#");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.gson.JsonNull cannot be cast to com.google.gson.JsonPrimitive
         //
         verifyException("com.google.gson.JsonObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
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
  public void test26()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.addProperty("", "");
      JsonObject jsonObject1 = jsonObject0.deepCopy();
      assertTrue(jsonObject1.equals((Object)jsonObject0));
      assertNotSame(jsonObject1, jsonObject0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonObject jsonObject1 = jsonObject0.deepCopy();
      boolean boolean0 = jsonObject1.equals(jsonObject0);
      assertTrue(boolean0);
      assertNotSame(jsonObject1, jsonObject0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.hashCode();
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonObject jsonObject1 = jsonObject0.getAsJsonObject("");
      assertNull(jsonObject1);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonPrimitive jsonPrimitive0 = jsonObject0.getAsJsonPrimitive("~#");
      assertNull(jsonPrimitive0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonElement jsonElement0 = jsonObject0.get("+ztr");
      assertNull(jsonElement0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonArray jsonArray0 = jsonObject0.getAsJsonArray("");
      assertNull(jsonArray0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      boolean boolean0 = jsonObject0.has("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonElement jsonElement0 = jsonObject0.remove("");
      assertNull(jsonElement0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      int int0 = jsonObject0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      Set<Map.Entry<String, JsonElement>> set0 = (Set<Map.Entry<String, JsonElement>>)jsonObject0.entrySet();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      Set<String> set0 = jsonObject0.keySet();
      assertTrue(set0.isEmpty());
  }
}
