/*
 * This file was automatically generated by EvoSuite
 * Fri May 22 18:28:54 GMT 2020
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
      JsonObject jsonObject0 = new JsonObject();
      boolean boolean0 = jsonObject0.isJsonPrimitive();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      boolean boolean0 = jsonObject0.isJsonObject();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      boolean boolean0 = jsonArray0.isJsonNull();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      boolean boolean0 = jsonNull0.isJsonArray();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Character character0 = Character.valueOf('&');
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(character0);
      String string0 = jsonPrimitive0.getAsString();
      assertEquals("&", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add("");
      String string0 = jsonArray0.getAsString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Long long0 = new Long(1L);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(long0);
      short short0 = jsonPrimitive0.getAsShort();
      assertEquals((short)1, short0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Long long0 = new Long((-165L));
      jsonArray0.add((Number) long0);
      short short0 = jsonArray0.getAsShort();
      assertEquals((short) (-165), short0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray(31);
      jsonArray0.add("6");
      Number number0 = jsonArray0.getAsNumber();
      assertEquals("6", number0.toString());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Float float0 = new Float(0.0);
      jsonArray0.add((Number) float0);
      long long0 = jsonArray0.getAsLong();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Float float0 = new Float(3449.8190974472873);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(float0);
      long long0 = jsonPrimitive0.getAsLong();
      assertEquals(3449L, long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Float float0 = new Float((-2675.4238F));
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(float0);
      long long0 = jsonPrimitive0.getAsLong();
      assertEquals((-2675L), long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Byte byte0 = new Byte((byte)0);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(byte0);
      JsonPrimitive jsonPrimitive1 = jsonPrimitive0.getAsJsonPrimitive();
      assertSame(jsonPrimitive0, jsonPrimitive1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("");
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(boolean0);
      JsonPrimitive jsonPrimitive1 = jsonPrimitive0.getAsJsonPrimitive();
      assertTrue(jsonPrimitive1.isJsonPrimitive());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add((JsonElement) jsonArray0);
      JsonArray jsonArray1 = jsonArray0.getAsJsonArray();
      assertEquals(1, jsonArray1.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Float float0 = new Float(0.0);
      jsonArray0.add((Number) float0);
      int int0 = jsonArray0.getAsInt();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Long long0 = new Long(1L);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(long0);
      int int0 = jsonPrimitive0.getAsInt();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Double double0 = new Double((-3050.5791134));
      jsonArray0.add((Number) double0);
      int int0 = jsonArray0.getAsInt();
      assertEquals((-3050), int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Integer integer0 = new Integer(0);
      jsonArray0.add((Number) integer0);
      float float0 = jsonArray0.getAsFloat();
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Short short0 = new Short((short)2001);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(short0);
      float float0 = jsonPrimitive0.getAsFloat();
      assertEquals(2001.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Byte byte0 = new Byte((byte)0);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(byte0);
      double double0 = jsonPrimitive0.getAsDouble();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Short short0 = new Short((short)1716);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(short0);
      double double0 = jsonPrimitive0.getAsDouble();
      assertEquals(1716.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Byte byte0 = new Byte((byte) (-15));
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(byte0);
      double double0 = jsonPrimitive0.getAsDouble();
      assertEquals((-15.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Character character0 = Character.valueOf('?');
      jsonArray0.add(character0);
      char char0 = jsonArray0.getAsCharacter();
      assertEquals('?', char0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Character character0 = Character.valueOf('4');
      jsonArray0.add(character0);
      char char0 = jsonArray0.getAsCharacter();
      assertEquals('4', char0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(boolean0);
      char char0 = jsonPrimitive0.getAsCharacter();
      assertEquals('t', char0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Float float0 = new Float(0.0F);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(float0);
      byte byte0 = jsonPrimitive0.getAsByte();
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Long long0 = new Long(5948L);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(long0);
      byte byte0 = jsonPrimitive0.getAsByte();
      assertEquals((byte)60, byte0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Long long0 = new Long(2453L);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(long0);
      byte byte0 = jsonPrimitive0.getAsByte();
      assertEquals((byte) (-107), byte0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray(46);
      Boolean boolean0 = Boolean.TRUE;
      jsonArray0.add(boolean0);
      boolean boolean1 = jsonArray0.getAsBoolean();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Character character0 = Character.valueOf('&');
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(character0);
      boolean boolean0 = jsonPrimitive0.getAsBoolean();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Short short0 = new Short((short)2001);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(short0);
      JsonElement jsonElement0 = jsonPrimitive0.deepCopy();
      assertFalse(jsonElement0.isJsonArray());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonElement jsonElement0 = jsonObject0.deepCopy();
      assertFalse(jsonElement0.isJsonArray());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonElement jsonElement0 = jsonArray0.deepCopy();
      assertFalse(jsonElement0.isJsonPrimitive());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      JsonElement jsonElement0 = jsonNull0.deepCopy();
      assertSame(jsonElement0, jsonNull0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
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
  public void test36()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add("com.google.gson.internal.bind.TypeAdapters$2");
      // Undeclared exception!
      try { 
        jsonArray0.getAsShort();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"com.google.gson.internal.bind.TypeAdapters$2\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
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
  public void test38()  throws Throwable  {
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
  public void test39()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(true);
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
  public void test40()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("com.google.gson.internal.LinkedTreeMap$EntrySet");
      // Undeclared exception!
      try { 
        jsonPrimitive0.getAsLong();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"com.google.gson.internal.LinkedTreeMap$EntrySet\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
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
  public void test42()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("");
      // Undeclared exception!
      try { 
        jsonPrimitive0.getAsInt();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
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
  public void test44()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("GT:XlEQw'r2BB1q6O");
      // Undeclared exception!
      try { 
        jsonPrimitive0.getAsFloat();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
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
  public void test46()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("@d");
      // Undeclared exception!
      try { 
        jsonPrimitive0.getAsDouble();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
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
  public void test48()  throws Throwable  {
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
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("Q![NI");
      // Undeclared exception!
      try { 
        jsonPrimitive0.getAsByte();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"Q![NI\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
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
  public void test53()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("com.google.gson.internal.bind.TypeAdapters$29");
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
  public void test54()  throws Throwable  {
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
  public void test55()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("Not a JSON Null: ");
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
  public void test56()  throws Throwable  {
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
  public void test57()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("com.google.gson.JsonElement");
      JsonPrimitive jsonPrimitive1 = jsonPrimitive0.getAsJsonPrimitive();
      assertFalse(jsonPrimitive1.isJsonObject());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonArray jsonArray1 = jsonArray0.getAsJsonArray();
      assertSame(jsonArray1, jsonArray0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonObject jsonObject1 = jsonObject0.getAsJsonObject();
      assertTrue(jsonObject1.isJsonObject());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      boolean boolean0 = jsonArray0.isJsonObject();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      boolean boolean0 = jsonArray0.isJsonArray();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("ccOl");
      boolean boolean0 = jsonPrimitive0.isJsonPrimitive();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      boolean boolean0 = jsonNull0.isJsonNull();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      JsonNull jsonNull1 = jsonNull0.getAsJsonNull();
      assertSame(jsonNull1, jsonNull0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      // Undeclared exception!
      try { 
        jsonArray0.getAsJsonNull();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Not a JSON Null: []
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Integer integer0 = new Integer(0);
      jsonArray0.add((Number) integer0);
      String string0 = jsonArray0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      // Undeclared exception!
      try { 
        jsonArray0.getAsJsonPrimitive();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Not a JSON Primitive: []
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      // Undeclared exception!
      try { 
        jsonObject0.getAsJsonArray();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Not a JSON Array: {}
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      // Undeclared exception!
      try { 
        jsonObject0.getAsShort();
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
  public void test71()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      // Undeclared exception!
      try { 
        jsonObject0.getAsLong();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // JsonObject
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      // Undeclared exception!
      try { 
        jsonNull0.getAsJsonObject();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Not a JSON Object: null
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
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
  public void test74()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      // Undeclared exception!
      try { 
        jsonObject0.getAsFloat();
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
      JsonObject jsonObject0 = new JsonObject();
      // Undeclared exception!
      try { 
        jsonObject0.getAsBoolean();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // JsonObject
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
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
  public void test77()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      // Undeclared exception!
      try { 
        jsonObject0.getAsNumber();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // JsonObject
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
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
  public void test79()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      // Undeclared exception!
      try { 
        jsonObject0.getAsDouble();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // JsonObject
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
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
  public void test81()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      // Undeclared exception!
      try { 
        jsonObject0.getAsString();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // JsonObject
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }
}
