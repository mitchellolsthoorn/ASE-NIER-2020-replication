/*
 * This file was automatically generated by EvoSuite
 * Thu May 21 18:23:38 GMT 2020
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
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JsonElement_ESTest extends JsonElement_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Double double0 = new Double(1.0);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(double0);
      Number number0 = jsonPrimitive0.getAsNumber();
      assertEquals(1.0, number0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      boolean boolean0 = jsonObject0.isJsonPrimitive();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Float float0 = new Float(0.0F);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(float0);
      boolean boolean0 = jsonPrimitive0.isJsonObject();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      boolean boolean0 = jsonObject0.isJsonNull();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("");
      boolean boolean0 = jsonPrimitive0.isJsonArray();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Byte byte0 = new Byte((byte)105);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(byte0);
      String string0 = jsonPrimitive0.getAsString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("");
      String string0 = jsonPrimitive0.getAsString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Float float0 = new Float(0.0F);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(float0);
      short short0 = jsonPrimitive0.getAsShort();
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Short short0 = new Short((short)1);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(short0);
      short short1 = jsonPrimitive0.getAsShort();
      assertEquals((short)1, short1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Float float0 = new Float(0.0);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(float0);
      long long0 = jsonPrimitive0.getAsLong();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Float float0 = new Float(1.0);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(float0);
      long long0 = jsonPrimitive0.getAsLong();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("com.google.gson.internal.bind.TypeAdapters$14");
      JsonPrimitive jsonPrimitive1 = jsonPrimitive0.getAsJsonPrimitive();
      assertFalse(jsonPrimitive1.isJsonNull());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Long long0 = new Long((-4414L));
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(long0);
      JsonPrimitive jsonPrimitive1 = jsonPrimitive0.getAsJsonPrimitive();
      assertFalse(jsonPrimitive1.isBoolean());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Character character0 = new Character('|');
      jsonArray0.add(character0);
      JsonArray jsonArray1 = jsonArray0.getAsJsonArray();
      assertSame(jsonArray0, jsonArray1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Integer integer0 = new Integer(805);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(integer0);
      jsonArray0.add((JsonElement) jsonPrimitive0);
      int int0 = jsonArray0.getAsInt();
      assertEquals(805, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Float float0 = new Float((-822.6168457));
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(float0);
      int int0 = jsonPrimitive0.getAsInt();
      assertEquals((-822), int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Double double0 = new Double(0.0);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(double0);
      float float0 = jsonPrimitive0.getAsFloat();
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Byte byte0 = new Byte((byte)0);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(byte0);
      double double0 = jsonPrimitive0.getAsDouble();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Float float0 = new Float((-4893.1F));
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(float0);
      double double0 = jsonPrimitive0.getAsDouble();
      assertEquals((-4893.10009765625), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add(",+Na>");
      char char0 = jsonArray0.getAsCharacter();
      assertEquals(',', char0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("3iRD");
      char char0 = jsonPrimitive0.getAsCharacter();
      assertEquals('3', char0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Float float0 = new Float(0.0F);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(float0);
      char char0 = jsonPrimitive0.getAsCharacter();
      assertEquals('j', char0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Byte byte0 = new Byte((byte)1);
      jsonArray0.add((Number) byte0);
      byte byte1 = jsonArray0.getAsByte();
      assertEquals((byte)1, byte1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(true);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(boolean0);
      boolean boolean1 = jsonPrimitive0.getAsBoolean();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Long long0 = new Long(0L);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(long0);
      boolean boolean0 = jsonPrimitive0.getAsBoolean();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonElement jsonElement0 = jsonObject0.deepCopy();
      assertFalse(jsonElement0.isJsonNull());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      JsonElement jsonElement0 = jsonNull0.deepCopy();
      assertSame(jsonElement0, jsonNull0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonElement jsonElement0 = jsonArray0.deepCopy();
      assertFalse(jsonElement0.isJsonPrimitive());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("(8A`!%/pZJ6QN8~ec?");
      JsonPrimitive jsonPrimitive1 = (JsonPrimitive)jsonPrimitive0.deepCopy();
      assertFalse(jsonPrimitive1.isBoolean());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
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
  public void test30()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("#>");
      // Undeclared exception!
      try { 
        jsonPrimitive0.getAsShort();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"#>\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
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
  public void test32()  throws Throwable  {
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
  public void test33()  throws Throwable  {
      Boolean boolean0 = new Boolean("null");
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(boolean0);
      // Undeclared exception!
      try { 
        jsonPrimitive0.getAsNumber();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Boolean cannot be cast to java.lang.Number
         //
         verifyException("com.google.gson.JsonPrimitive", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Boolean boolean0 = new Boolean(false);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(boolean0);
      // Undeclared exception!
      try { 
        jsonPrimitive0.getAsLong();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"false\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
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
  public void test36()  throws Throwable  {
      Character character0 = Character.valueOf('J');
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(character0);
      // Undeclared exception!
      try { 
        jsonPrimitive0.getAsInt();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"J\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
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
  public void test38()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("Invalid escape sequence");
      // Undeclared exception!
      try { 
        jsonPrimitive0.getAsFloat();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
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
  public void test40()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("com.google.gson.internal.bind.TypeAdapters$17");
      // Undeclared exception!
      try { 
        jsonPrimitive0.getAsDouble();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
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
  public void test42()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("");
      // Undeclared exception!
      try { 
        jsonPrimitive0.getAsCharacter();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
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
  public void test44()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("SE\"#1zh:+P7;2");
      // Undeclared exception!
      try { 
        jsonPrimitive0.getAsByte();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"SE\"#1zh:+P7;2\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
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
  public void test46()  throws Throwable  {
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
  public void test47()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("+BZhYvQJNX(kw#<*}-Q");
      // Undeclared exception!
      try { 
        jsonPrimitive0.getAsBigInteger();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"java.lang\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
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
  public void test49()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("CINouX+8T\"pb");
      // Undeclared exception!
      try { 
        jsonPrimitive0.getAsBigDecimal();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
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
  public void test51()  throws Throwable  {
      Boolean boolean0 = new Boolean((String) null);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(boolean0);
      JsonPrimitive jsonPrimitive1 = jsonPrimitive0.getAsJsonPrimitive();
      assertSame(jsonPrimitive1, jsonPrimitive0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonArray jsonArray1 = jsonArray0.getAsJsonArray();
      assertTrue(jsonArray1.isJsonArray());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonObject jsonObject1 = jsonObject0.getAsJsonObject();
      assertSame(jsonObject1, jsonObject0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("q>kzbl");
      String string0 = jsonPrimitive0.toString();
      assertEquals("\"q>kzbl\"", string0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      boolean boolean0 = jsonObject0.isJsonObject();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray(0);
      boolean boolean0 = jsonArray0.isJsonArray();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Character character0 = new Character('Z');
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(character0);
      boolean boolean0 = jsonPrimitive0.isJsonPrimitive();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      boolean boolean0 = jsonNull0.isJsonNull();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      JsonNull jsonNull1 = jsonNull0.getAsJsonNull();
      assertFalse(jsonNull1.isJsonPrimitive());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      // Undeclared exception!
      try { 
        jsonNull0.getAsJsonPrimitive();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Not a JSON Primitive: null
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      // Undeclared exception!
      try { 
        jsonArray0.getAsJsonObject();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Not a JSON Object: []
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      // Undeclared exception!
      try { 
        jsonObject0.getAsJsonNull();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Not a JSON Null: {}
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      // Undeclared exception!
      try { 
        jsonNull0.getAsShort();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // JsonNull
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      // Undeclared exception!
      try { 
        jsonNull0.getAsBigInteger();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // JsonNull
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      // Undeclared exception!
      try { 
        jsonNull0.getAsLong();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // JsonNull
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      // Undeclared exception!
      try { 
        jsonNull0.getAsInt();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // JsonNull
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      // Undeclared exception!
      try { 
        jsonNull0.getAsFloat();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // JsonNull
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      // Undeclared exception!
      try { 
        jsonNull0.getAsBoolean();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // JsonNull
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      // Undeclared exception!
      try { 
        jsonObject0.getAsBigDecimal();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // JsonObject
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Float float0 = new Float((-4893.1F));
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(float0);
      // Undeclared exception!
      try { 
        jsonPrimitive0.getAsJsonArray();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Not a JSON Array: java.lang.Float@0000000004
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      // Undeclared exception!
      try { 
        jsonNull0.getAsNumber();
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
      JsonObject jsonObject0 = new JsonObject();
      // Undeclared exception!
      try { 
        jsonObject0.getAsByte();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // JsonObject
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      // Undeclared exception!
      try { 
        jsonNull0.getAsDouble();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // JsonNull
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      // Undeclared exception!
      try { 
        jsonObject0.getAsCharacter();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // JsonObject
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      // Undeclared exception!
      try { 
        jsonNull0.getAsString();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // JsonNull
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }
}