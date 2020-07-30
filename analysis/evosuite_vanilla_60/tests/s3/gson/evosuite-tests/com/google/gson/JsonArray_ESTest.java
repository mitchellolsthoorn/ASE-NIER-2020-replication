/*
 * This file was automatically generated by EvoSuite
 * Wed May 20 12:35:39 GMT 2020
 */

package com.google.gson;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.math.BigDecimal;
import java.util.Iterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JsonArray_ESTest extends JsonArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.addAll(jsonArray0);
      assertEquals(0, jsonArray0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      BigDecimal bigDecimal0 = new BigDecimal(60);
      jsonArray0.add((Number) bigDecimal0);
      int int0 = jsonArray0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("$Q");
      jsonArray0.add((JsonElement) jsonPrimitive0);
      JsonPrimitive jsonPrimitive1 = (JsonPrimitive)jsonArray0.set(0, jsonPrimitive0);
      assertFalse(jsonPrimitive1.isBoolean());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonObject jsonObject0 = new JsonObject();
      jsonArray0.add((JsonElement) jsonObject0);
      JsonElement jsonElement0 = jsonArray0.set(0, jsonArray0);
      assertFalse(jsonElement0.isJsonPrimitive());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonObject jsonObject0 = new JsonObject();
      jsonArray0.add((JsonElement) jsonObject0);
      boolean boolean0 = jsonArray0.remove((JsonElement) jsonObject0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Boolean boolean0 = Boolean.valueOf("");
      jsonArray0.add(boolean0);
      JsonElement jsonElement0 = jsonArray0.remove(0);
      assertFalse(jsonElement0.isJsonObject());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add((Boolean) null);
      JsonElement jsonElement0 = jsonArray0.remove(0);
      assertFalse(jsonElement0.isJsonPrimitive());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonObject jsonObject0 = new JsonObject();
      jsonArray0.add((JsonElement) jsonObject0);
      JsonElement jsonElement0 = jsonArray0.remove(0);
      assertTrue(jsonElement0.isJsonObject());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Iterator<JsonElement> iterator0 = jsonArray0.iterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("");
      jsonArray0.add((JsonElement) jsonPrimitive0);
      String string0 = jsonArray0.getAsString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      BigDecimal bigDecimal0 = new BigDecimal(1421.631);
      jsonArray0.add((Number) bigDecimal0);
      short short0 = jsonArray0.getAsShort();
      assertEquals((short)1421, short0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      BigDecimal bigDecimal0 = new BigDecimal(2147483645);
      jsonArray0.add((Number) bigDecimal0);
      short short0 = jsonArray0.getAsShort();
      assertEquals((short) (-3), short0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Float float0 = new Float(0.0);
      jsonArray0.add((Number) float0);
      long long0 = jsonArray0.getAsLong();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Double double0 = new Double(0.0);
      jsonArray0.add((Number) double0);
      int int0 = jsonArray0.getAsInt();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray(579);
      Float float0 = new Float(0.0);
      jsonArray0.add((Number) float0);
      float float1 = jsonArray0.getAsFloat();
      assertEquals(0.0F, float1, 0.01F);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      BigDecimal bigDecimal0 = new BigDecimal((-944));
      jsonArray0.add((Number) bigDecimal0);
      float float0 = jsonArray0.getAsFloat();
      assertEquals((-944.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Short short0 = new Short((short) (-1114));
      jsonArray0.add((Number) short0);
      double double0 = jsonArray0.getAsDouble();
      assertEquals((-1114.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray(579);
      Float float0 = new Float(0.0);
      jsonArray0.add((Number) float0);
      byte byte0 = jsonArray0.getAsByte();
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Boolean boolean0 = Boolean.TRUE;
      jsonArray0.add(boolean0);
      boolean boolean1 = jsonArray0.getAsBoolean();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("$Q");
      jsonArray0.add((JsonElement) jsonPrimitive0);
      JsonPrimitive jsonPrimitive1 = (JsonPrimitive)jsonArray0.get(0);
      assertFalse(jsonPrimitive1.isNumber());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray(1505);
      // Undeclared exception!
      try { 
        jsonArray0.set(1505, jsonArray0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1505, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      // Undeclared exception!
      try { 
        jsonArray0.remove((-2531));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonObject jsonObject0 = new JsonObject();
      jsonArray0.add((JsonElement) jsonObject0);
      // Undeclared exception!
      try { 
        jsonArray0.getAsShort();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // JsonObject
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add("com.google.gson.internal.bind.TypeAdapters$33");
      // Undeclared exception!
      try { 
        jsonArray0.getAsShort();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"com.google.gson.internal.bind.TypeAdapters$33\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonObject jsonObject0 = new JsonObject();
      jsonArray0.add((JsonElement) jsonObject0);
      // Undeclared exception!
      try { 
        jsonArray0.getAsNumber();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // JsonObject
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Boolean boolean0 = Boolean.TRUE;
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(boolean0);
      jsonArray0.add((JsonElement) jsonPrimitive0);
      // Undeclared exception!
      try { 
        jsonArray0.getAsNumber();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Boolean cannot be cast to java.lang.Number
         //
         verifyException("com.google.gson.JsonPrimitive", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonObject jsonObject0 = new JsonObject();
      jsonArray0.add((JsonElement) jsonObject0);
      // Undeclared exception!
      try { 
        jsonArray0.getAsLong();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // JsonObject
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add("KKC3IfOhz;E3.dF");
      // Undeclared exception!
      try { 
        jsonArray0.getAsLong();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"KKC3IfOhz;E3.dF\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonObject jsonObject0 = new JsonObject();
      jsonArray0.add((JsonElement) jsonObject0);
      // Undeclared exception!
      try { 
        jsonArray0.getAsInt();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // JsonObject
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("");
      jsonArray0.add((JsonElement) jsonPrimitive0);
      // Undeclared exception!
      try { 
        jsonArray0.getAsInt();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonObject jsonObject0 = new JsonObject();
      jsonArray0.add((JsonElement) jsonObject0);
      // Undeclared exception!
      try { 
        jsonArray0.getAsFloat();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // JsonObject
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Boolean boolean0 = Boolean.FALSE;
      jsonArray0.add(boolean0);
      // Undeclared exception!
      try { 
        jsonArray0.getAsFloat();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add((Boolean) null);
      // Undeclared exception!
      try { 
        jsonArray0.getAsDouble();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // JsonNull
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Boolean boolean0 = Boolean.valueOf(false);
      jsonArray0.add(boolean0);
      // Undeclared exception!
      try { 
        jsonArray0.getAsDouble();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Character character0 = Character.valueOf('K');
      jsonArray0.add(character0);
      // Undeclared exception!
      try { 
        jsonArray0.getAsByte();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"K\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonObject jsonObject0 = new JsonObject();
      jsonArray0.add((JsonElement) jsonObject0);
      // Undeclared exception!
      try { 
        jsonArray0.getAsBoolean();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // JsonObject
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      BigDecimal bigDecimal0 = new BigDecimal(60);
      jsonArray0.add((Number) bigDecimal0);
      // Undeclared exception!
      try { 
        jsonArray0.getAsBigInteger();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"java\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add((JsonElement) null);
      // Undeclared exception!
      try { 
        jsonArray0.getAsBigDecimal();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // JsonNull
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add("!wlUY!\"$%$H+?2");
      // Undeclared exception!
      try { 
        jsonArray0.getAsBigDecimal();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      // Undeclared exception!
      try { 
        jsonArray0.get((-105));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JsonArray jsonArray0 = null;
      try {
        jsonArray0 = new JsonArray((-1862));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal Capacity: -1862
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonArray jsonArray1 = jsonArray0.deepCopy();
      Boolean boolean0 = Boolean.valueOf(false);
      jsonArray0.add(boolean0);
      boolean boolean1 = jsonArray1.equals(jsonArray0);
      assertFalse(jsonArray1.equals((Object)jsonArray0));
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Object object0 = new Object();
      boolean boolean0 = jsonArray0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray(1505);
      boolean boolean0 = jsonArray0.equals(jsonArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      BigDecimal bigDecimal0 = new BigDecimal(1421.631);
      jsonArray0.add((Number) bigDecimal0);
      boolean boolean0 = jsonArray0.getAsBoolean();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      // Undeclared exception!
      try { 
        jsonArray0.getAsBoolean();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.JsonArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Double double0 = new Double(0.0);
      jsonArray0.add((Number) double0);
      short short0 = jsonArray0.getAsShort();
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      BigDecimal bigDecimal0 = new BigDecimal(1421.631);
      jsonArray0.add((Number) bigDecimal0);
      jsonArray0.add((JsonElement) jsonArray0);
      // Undeclared exception!
      try { 
        jsonArray0.getAsShort();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.JsonArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      BigDecimal bigDecimal0 = new BigDecimal(60);
      jsonArray0.add((Number) bigDecimal0);
      char char0 = jsonArray0.getAsCharacter();
      assertEquals('j', char0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      // Undeclared exception!
      try { 
        jsonArray0.getAsCharacter();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.JsonArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      BigDecimal bigDecimal0 = new BigDecimal((-944));
      jsonArray0.add((Number) bigDecimal0);
      byte byte0 = jsonArray0.getAsByte();
      assertEquals((byte)80, byte0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      // Undeclared exception!
      try { 
        jsonArray0.getAsByte();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.JsonArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Float float0 = new Float(1297.6085F);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(float0);
      jsonArray0.add((JsonElement) jsonPrimitive0);
      int int0 = jsonArray0.getAsInt();
      assertEquals(1297, int0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      // Undeclared exception!
      try { 
        jsonArray0.getAsInt();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.JsonArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      BigDecimal bigDecimal0 = new BigDecimal(60);
      jsonArray0.add((Number) bigDecimal0);
      long long0 = jsonArray0.getAsLong();
      assertEquals(60L, long0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      // Undeclared exception!
      try { 
        jsonArray0.getAsLong();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.JsonArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      BigDecimal bigDecimal0 = new BigDecimal(1421.631);
      jsonArray0.add((Number) bigDecimal0);
      float float0 = jsonArray0.getAsFloat();
      assertEquals(1421.631F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      // Undeclared exception!
      try { 
        jsonArray0.getAsFloat();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.JsonArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonObject jsonObject0 = new JsonObject();
      jsonArray0.add((JsonElement) jsonObject0);
      // Undeclared exception!
      try { 
        jsonArray0.getAsBigInteger();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // JsonObject
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      // Undeclared exception!
      try { 
        jsonArray0.getAsBigInteger();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.JsonArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      BigDecimal bigDecimal0 = new BigDecimal(0.0);
      jsonArray0.add((Number) bigDecimal0);
      BigDecimal bigDecimal1 = jsonArray0.getAsBigDecimal();
      assertEquals((short)0, bigDecimal1.shortValue());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      // Undeclared exception!
      try { 
        jsonArray0.getAsBigDecimal();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.JsonArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      // Undeclared exception!
      try { 
        jsonArray0.getAsDouble();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.JsonArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Float float0 = new Float(1297.6085F);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(float0);
      jsonArray0.add((JsonElement) jsonPrimitive0);
      String string0 = jsonArray0.getAsString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      // Undeclared exception!
      try { 
        jsonArray0.getAsString();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.JsonArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Double double0 = new Double(0.0);
      jsonArray0.add((Number) double0);
      Number number0 = jsonArray0.getAsNumber();
      assertEquals(0.0, number0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      // Undeclared exception!
      try { 
        jsonArray0.getAsNumber();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.JsonArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonObject jsonObject0 = new JsonObject();
      jsonArray0.add((JsonElement) jsonObject0);
      boolean boolean0 = jsonArray0.contains(jsonObject0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      boolean boolean0 = jsonArray0.contains(jsonArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add((String) null);
      // Undeclared exception!
      try { 
        jsonArray0.getAsByte();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // JsonNull
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add("");
      // Undeclared exception!
      try { 
        jsonArray0.getAsCharacter();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add((Number) null);
      // Undeclared exception!
      try { 
        jsonArray0.getAsString();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // JsonNull
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Float float0 = new Float(2107.693255312049);
      jsonArray0.add((Number) float0);
      double double0 = jsonArray0.getAsDouble();
      assertEquals(2107.693359375, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add((Character) null);
      assertFalse(jsonArray0.isJsonNull());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Character character0 = new Character('5');
      jsonArray0.add(character0);
      char char0 = jsonArray0.getAsCharacter();
      assertEquals('5', char0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add((Boolean) null);
      // Undeclared exception!
      try { 
        jsonArray0.getAsCharacter();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // JsonNull
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonArray jsonArray1 = jsonArray0.deepCopy();
      boolean boolean0 = jsonArray1.equals(jsonArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonObject jsonObject0 = new JsonObject();
      boolean boolean0 = jsonArray0.remove((JsonElement) jsonObject0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      // Undeclared exception!
      try { 
        jsonArray0.remove(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray(1);
      jsonArray0.hashCode();
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      // Undeclared exception!
      try { 
        jsonArray0.get(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Boolean boolean0 = Boolean.valueOf(false);
      jsonArray0.add(boolean0);
      JsonArray jsonArray1 = jsonArray0.deepCopy();
      assertTrue(jsonArray1.equals((Object)jsonArray0));
      assertNotSame(jsonArray1, jsonArray0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      int int0 = jsonArray0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      // Undeclared exception!
      try { 
        jsonArray0.addAll((JsonArray) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.JsonArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      // Undeclared exception!
      try { 
        jsonArray0.set((-148), jsonArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
