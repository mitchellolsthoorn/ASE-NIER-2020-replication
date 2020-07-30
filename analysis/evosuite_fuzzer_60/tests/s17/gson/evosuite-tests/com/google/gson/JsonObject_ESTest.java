/*
 * This file was automatically generated by EvoSuite
 * Fri May 22 11:23:14 GMT 2020
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
      jsonObject0.add("", (JsonElement) null);
      int int0 = jsonObject0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      Boolean boolean0 = Boolean.TRUE;
      jsonObject0.addProperty("", boolean0);
      JsonElement jsonElement0 = jsonObject0.remove("");
      assertFalse(jsonElement0.isJsonNull());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.add("=", jsonObject0);
      JsonElement jsonElement0 = jsonObject0.remove("=");
      assertFalse(jsonElement0.isJsonNull());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.add("", (JsonElement) null);
      JsonElement jsonElement0 = jsonObject0.remove("");
      assertFalse(jsonElement0.isJsonObject());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.addProperty("", "4m t06");
      boolean boolean0 = jsonObject0.has("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.addProperty("", "");
      JsonPrimitive jsonPrimitive0 = jsonObject0.getAsJsonPrimitive("");
      assertFalse(jsonPrimitive0.isJsonNull());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      Boolean boolean0 = Boolean.TRUE;
      jsonObject0.addProperty("", boolean0);
      JsonPrimitive jsonPrimitive0 = jsonObject0.getAsJsonPrimitive("");
      assertTrue(jsonPrimitive0.isBoolean());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      Byte byte0 = Byte.valueOf((byte)0);
      jsonObject0.addProperty("=&-Z", (Number) byte0);
      JsonPrimitive jsonPrimitive0 = jsonObject0.getAsJsonPrimitive("=&-Z");
      assertFalse(jsonPrimitive0.isString());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.addProperty("{\"fruit\":\"Apple\",\"size\":99,\"color\":\"Red\",\"value\":true,\"value2\":false,\"number\":\"1\"}", (Character) null);
      JsonElement jsonElement0 = jsonObject0.get("{\"fruit\":\"Apple\",\"size\":99,\"color\":\"Red\",\"value\":true,\"value2\":false,\"number\":\"1\"}");
      assertFalse(jsonElement0.isJsonArray());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      Double double0 = new Double(0.0);
      jsonObject0.addProperty("", (Number) double0);
      JsonPrimitive jsonPrimitive0 = (JsonPrimitive)jsonObject0.get("");
      assertFalse(jsonPrimitive0.isBoolean());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.addProperty("", (Number) null);
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
  public void test11()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      Boolean boolean0 = Boolean.TRUE;
      jsonObject0.addProperty("", boolean0);
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
  public void test12()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      Short short0 = new Short((short)0);
      // Undeclared exception!
      try { 
        jsonObject0.addProperty((String) null, (Number) short0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key == null
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      // Undeclared exception!
      try { 
        jsonObject0.addProperty((String) null, (Character) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key == null
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      Boolean boolean0 = Boolean.FALSE;
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
  public void test15()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.add("", jsonObject0);
      JsonObject jsonObject1 = jsonObject0.getAsJsonObject("");
      assertTrue(jsonObject1.isJsonObject());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonArray jsonArray0 = new JsonArray();
      boolean boolean0 = jsonObject0.equals(jsonArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      boolean boolean0 = jsonObject0.equals(jsonObject0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.addProperty("{\"fruit\":\"Apple\",\"size\":99,\"color\":\"Red\",\"value\":true,\"value2\":false,\"number\":\"1\"}", (Character) null);
      JsonObject jsonObject1 = new JsonObject();
      boolean boolean0 = jsonObject1.equals(jsonObject0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      Character character0 = new Character('$');
      jsonObject0.addProperty("Yfk|UY#[MTY+/", character0);
      assertTrue(jsonObject0.isJsonObject());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.addProperty("", (Boolean) null);
      // Undeclared exception!
      try { 
        jsonObject0.getAsJsonArray("");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.gson.JsonNull cannot be cast to com.google.gson.JsonArray
         //
         verifyException("com.google.gson.JsonObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
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
  public void test22()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      // Undeclared exception!
      try { 
        jsonObject0.add((String) null, (JsonElement) null);
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
      jsonObject0.addProperty("+AU&.eyA^z2/~S", "+AU&.eyA^z2/~S");
      JsonObject jsonObject1 = jsonObject0.deepCopy();
      assertNotSame(jsonObject1, jsonObject0);
      assertTrue(jsonObject1.equals((Object)jsonObject0));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonObject jsonObject1 = jsonObject0.deepCopy();
      boolean boolean0 = jsonObject1.equals(jsonObject0);
      assertTrue(boolean0);
      assertNotSame(jsonObject1, jsonObject0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.hashCode();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonObject jsonObject1 = jsonObject0.getAsJsonObject("");
      assertNull(jsonObject1);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonPrimitive jsonPrimitive0 = jsonObject0.getAsJsonPrimitive("");
      assertNull(jsonPrimitive0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonElement jsonElement0 = jsonObject0.get("");
      assertNull(jsonElement0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonArray jsonArray0 = jsonObject0.getAsJsonArray("");
      assertNull(jsonArray0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      boolean boolean0 = jsonObject0.has("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonElement jsonElement0 = jsonObject0.remove("");
      assertNull(jsonElement0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      int int0 = jsonObject0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      Set<Map.Entry<String, JsonElement>> set0 = (Set<Map.Entry<String, JsonElement>>)jsonObject0.entrySet();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      Set<String> set0 = jsonObject0.keySet();
      assertEquals(0, set0.size());
  }
}
