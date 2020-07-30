/*
 * This file was automatically generated by EvoSuite
 * Fri May 22 09:43:57 GMT 2020
 */

package com.google.gson;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
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
      jsonObject0.addProperty("key == null", "");
      assertFalse(jsonObject0.isJsonNull());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.addProperty("Z28TH", (String) null);
      assertFalse(jsonObject0.isJsonNull());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      Character character0 = Character.valueOf('V');
      jsonObject0.addProperty("", character0);
      int int0 = jsonObject0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      Integer integer0 = new Integer((-2706));
      jsonObject0.addProperty("com.google.gson.JsonObject", (Number) integer0);
      JsonPrimitive jsonPrimitive0 = jsonObject0.getAsJsonPrimitive("com.google.gson.JsonObject");
      assertFalse(jsonPrimitive0.isJsonObject());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      Boolean boolean0 = Boolean.FALSE;
      jsonObject0.addProperty("", boolean0);
      JsonPrimitive jsonPrimitive0 = jsonObject0.getAsJsonPrimitive("");
      assertTrue(jsonPrimitive0.isBoolean());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.add("QmhhgzN-04v8p<s(+|", jsonObject0);
      JsonObject jsonObject1 = jsonObject0.getAsJsonObject("QmhhgzN-04v8p<s(+|");
      assertFalse(jsonObject1.isJsonPrimitive());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      Character character0 = Character.valueOf('V');
      jsonObject0.addProperty("", character0);
      JsonElement jsonElement0 = jsonObject0.get("");
      assertFalse(jsonElement0.isJsonArray());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.add("QmhhgzNT04v8p<s(+|", jsonObject0);
      JsonElement jsonElement0 = jsonObject0.get("QmhhgzNT04v8p<s(+|");
      assertFalse(jsonElement0.isJsonNull());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.add("com.google.gson.JsonObject", (JsonElement) null);
      JsonElement jsonElement0 = jsonObject0.get("com.google.gson.JsonObject");
      assertTrue(jsonElement0.isJsonNull());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      jsonObject0.add("", jsonNull0);
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
  public void test10()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.addProperty("", (Number) null);
      // Undeclared exception!
      try { 
        jsonObject0.getAsJsonObject("");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.gson.JsonNull cannot be cast to com.google.gson.JsonObject
         //
         verifyException("com.google.gson.JsonObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      Double double0 = new Double(0.0);
      jsonObject0.addProperty("{\"fruit\":false,\"size\":\"\",\"color\":99,\"value\":true,\"value2\":false,\"\":true}", (Number) double0);
      // Undeclared exception!
      try { 
        jsonObject0.getAsJsonArray("{\"fruit\":false,\"size\":\"\",\"color\":99,\"value\":true,\"value2\":false,\"\":true}");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.gson.JsonPrimitive cannot be cast to com.google.gson.JsonArray
         //
         verifyException("com.google.gson.JsonObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      Integer integer0 = new Integer((-1));
      // Undeclared exception!
      try { 
        jsonObject0.addProperty((String) null, (Number) integer0);
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
      Character character0 = new Character('I');
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
  public void test14()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      Boolean boolean0 = new Boolean("YF;Ax:foj}P=bPl'i?3");
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
  public void test16()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      Boolean boolean0 = Boolean.FALSE;
      jsonObject0.addProperty("", boolean0);
      JsonElement jsonElement0 = jsonObject0.remove("");
      jsonObject0.add("com.google.gson.JsonObject", jsonElement0);
      assertFalse(jsonElement0.isJsonNull());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonObject jsonObject1 = jsonObject0.deepCopy();
      JsonObject jsonObject2 = jsonObject1.getAsJsonObject();
      Boolean boolean0 = Boolean.valueOf("");
      jsonObject2.addProperty("", boolean0);
      boolean boolean1 = jsonObject2.equals(jsonObject0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      boolean boolean0 = jsonObject0.equals("w;iZ[Qc");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      boolean boolean0 = jsonObject0.equals(jsonObject0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.addProperty("C4", (Character) null);
      JsonElement jsonElement0 = jsonObject0.remove("C4");
      assertFalse(jsonElement0.isJsonPrimitive());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.addProperty("w;iZ[Qc", (Boolean) null);
      assertFalse(jsonObject0.isJsonNull());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      Float float0 = new Float(1.0);
      jsonObject0.addProperty("`M+d(", (Number) float0);
      boolean boolean0 = jsonObject0.has("`M+d(");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
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
  public void test24()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.addProperty("", "");
      JsonPrimitive jsonPrimitive0 = jsonObject0.getAsJsonPrimitive("");
      assertFalse(jsonPrimitive0.isJsonNull());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.add("i", (JsonElement) null);
      JsonObject jsonObject1 = jsonObject0.deepCopy();
      assertTrue(jsonObject1.equals((Object)jsonObject0));
      assertNotSame(jsonObject1, jsonObject0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonObject jsonObject1 = jsonObject0.deepCopy();
      JsonObject jsonObject2 = jsonObject1.getAsJsonObject();
      boolean boolean0 = jsonObject2.equals(jsonObject0);
      assertTrue(boolean0);
      assertNotSame(jsonObject2, jsonObject0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.hashCode();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonObject jsonObject1 = jsonObject0.getAsJsonObject("K");
      assertNull(jsonObject1);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonPrimitive jsonPrimitive0 = jsonObject0.getAsJsonPrimitive("");
      assertNull(jsonPrimitive0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonElement jsonElement0 = jsonObject0.get("QmhhgzNT04v8p<s(+|");
      assertNull(jsonElement0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonArray jsonArray0 = jsonObject0.getAsJsonArray("C4");
      assertNull(jsonArray0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      boolean boolean0 = jsonObject0.has("`M+d(");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonElement jsonElement0 = jsonObject0.remove("P5Bvkz`OhN:f_XX*");
      assertNull(jsonElement0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      int int0 = jsonObject0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      Set<Map.Entry<String, JsonElement>> set0 = (Set<Map.Entry<String, JsonElement>>)jsonObject0.entrySet();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      Set<String> set0 = jsonObject0.keySet();
      assertTrue(set0.isEmpty());
  }
}
