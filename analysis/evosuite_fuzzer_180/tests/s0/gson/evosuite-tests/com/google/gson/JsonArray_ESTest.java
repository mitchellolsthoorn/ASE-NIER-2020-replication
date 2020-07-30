/*
 * This file was automatically generated by EvoSuite
 * Fri May 22 12:13:25 GMT 2020
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
import java.math.BigInteger;
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
      assertFalse(jsonArray0.isJsonPrimitive());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      BigDecimal bigDecimal0 = new BigDecimal(3414);
      jsonArray0.add((Number) bigDecimal0);
      int int0 = jsonArray0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Boolean boolean0 = Boolean.TRUE;
      jsonArray0.add(boolean0);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(boolean0);
      boolean boolean1 = jsonArray0.remove((JsonElement) jsonPrimitive0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add((JsonElement) jsonArray0);
      JsonElement jsonElement0 = jsonArray0.remove(0);
      assertTrue(jsonElement0.isJsonArray());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Boolean boolean0 = Boolean.TRUE;
      jsonArray0.add(boolean0);
      JsonPrimitive jsonPrimitive0 = (JsonPrimitive)jsonArray0.remove(0);
      assertFalse(jsonPrimitive0.isNumber());
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
      JsonArray jsonArray0 = new JsonArray();
      BigDecimal bigDecimal0 = new BigDecimal(3414);
      jsonArray0.add((Number) bigDecimal0);
      short short0 = jsonArray0.getAsShort();
      assertEquals((short)3414, short0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte) (-118);
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      BigDecimal bigDecimal0 = new BigDecimal(bigInteger0);
      jsonArray0.add((Number) bigDecimal0);
      short short0 = jsonArray0.getAsShort();
      assertEquals((short) (-30208), short0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte) (-118);
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      BigDecimal bigDecimal0 = new BigDecimal(bigInteger0);
      jsonArray0.add((Number) bigDecimal0);
      Number number0 = jsonArray0.getAsNumber();
      assertEquals((byte)0, number0.byteValue());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Character character0 = new Character('8');
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(character0);
      jsonArray0.add((JsonElement) jsonPrimitive0);
      Number number0 = jsonArray0.getAsNumber();
      assertEquals("8", number0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray(2810);
      BigDecimal bigDecimal0 = new BigDecimal((double) 2810);
      jsonArray0.add((Number) bigDecimal0);
      Number number0 = jsonArray0.getAsNumber();
      assertEquals((byte) (-6), number0.byteValue());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      BigDecimal bigDecimal0 = new BigDecimal(0.0);
      jsonArray0.add((Number) bigDecimal0);
      long long0 = jsonArray0.getAsLong();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Integer integer0 = new Integer((-853));
      jsonArray0.add((Number) integer0);
      long long0 = jsonArray0.getAsLong();
      assertEquals((-853L), long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      BigDecimal bigDecimal0 = new BigDecimal(0);
      jsonArray0.add((Number) bigDecimal0);
      int int0 = jsonArray0.getAsInt();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      BigDecimal bigDecimal0 = new BigDecimal(3414);
      jsonArray0.add((Number) bigDecimal0);
      int int0 = jsonArray0.getAsInt();
      assertEquals(3414, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Integer integer0 = new Integer((-877));
      jsonArray0.add((Number) integer0);
      int int0 = jsonArray0.getAsInt();
      assertEquals((-877), int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Character character0 = new Character('3');
      jsonArray0.add(character0);
      float float0 = jsonArray0.getAsFloat();
      assertEquals(3.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Integer integer0 = new Integer((-853));
      jsonArray0.add((Number) integer0);
      float float0 = jsonArray0.getAsFloat();
      assertEquals((-853.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      BigDecimal bigDecimal0 = new BigDecimal(0);
      jsonArray0.add((Number) bigDecimal0);
      double double0 = jsonArray0.getAsDouble();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Integer integer0 = new Integer(2147483645);
      jsonArray0.add((Number) integer0);
      double double0 = jsonArray0.getAsDouble();
      assertEquals(2.147483645E9, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      String string0 = "\\u";
      jsonArray0.add(string0);
      char char0 = jsonArray0.getAsCharacter();
      assertEquals('\\', char0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Short short0 = new Short((short)0);
      jsonArray0.add((Number) short0);
      byte byte0 = jsonArray0.getAsByte();
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Integer integer0 = new Integer(4);
      jsonArray0.add((Number) integer0);
      byte byte0 = jsonArray0.getAsByte();
      assertEquals((byte)4, byte0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Boolean boolean0 = Boolean.TRUE;
      jsonArray0.add(boolean0);
      boolean boolean1 = jsonArray0.getAsBoolean();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      byte[] byteArray0 = new byte[7];
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      jsonArray0.add((Number) bigInteger0);
      BigInteger bigInteger1 = jsonArray0.getAsBigInteger();
      assertSame(bigInteger1, bigInteger0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      byte[] byteArray0 = new byte[7];
      byteArray0[6] = (byte)49;
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      jsonArray0.add((Number) bigInteger0);
      BigInteger bigInteger1 = jsonArray0.getAsBigInteger();
      assertEquals((byte)49, bigInteger1.byteValue());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      BigDecimal bigDecimal0 = new BigDecimal(0);
      jsonArray0.add((Number) bigDecimal0);
      BigDecimal bigDecimal1 = jsonArray0.getAsBigDecimal();
      assertEquals((byte)0, bigDecimal1.byteValue());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      BigDecimal bigDecimal0 = new BigDecimal(3414);
      jsonArray0.add((Number) bigDecimal0);
      BigDecimal bigDecimal1 = jsonArray0.getAsBigDecimal();
      assertEquals((short)3414, bigDecimal1.shortValue());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Boolean boolean0 = Boolean.TRUE;
      jsonArray0.add(boolean0);
      JsonPrimitive jsonPrimitive0 = (JsonPrimitive)jsonArray0.get(0);
      assertFalse(jsonPrimitive0.isString());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      // Undeclared exception!
      try { 
        jsonArray0.set((-276), jsonArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      // Undeclared exception!
      try { 
        jsonArray0.remove((-1826));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add((JsonElement) null);
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
  public void test32()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add((Number) null);
      jsonArray0.set(0, (JsonElement) null);
      // Undeclared exception!
      try { 
        jsonArray0.getAsString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.JsonArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add((Number) null);
      // Undeclared exception!
      try { 
        jsonArray0.getAsShort();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // JsonNull
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Boolean boolean0 = Boolean.FALSE;
      jsonArray0.add(boolean0);
      // Undeclared exception!
      try { 
        jsonArray0.getAsShort();
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
      jsonArray0.add((Boolean) null);
      // Undeclared exception!
      try { 
        jsonArray0.getAsNumber();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // JsonNull
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Boolean boolean0 = Boolean.FALSE;
      jsonArray0.add(boolean0);
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
  public void test37()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add((Character) null);
      // Undeclared exception!
      try { 
        jsonArray0.getAsLong();
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
      jsonArray0.add("");
      // Undeclared exception!
      try { 
        jsonArray0.getAsLong();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add("");
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
  public void test40()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add((Character) null);
      // Undeclared exception!
      try { 
        jsonArray0.getAsFloat();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // JsonNull
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
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
  public void test42()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add((String) null);
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
  public void test43()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add("");
      // Undeclared exception!
      try { 
        jsonArray0.getAsDouble();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      BigDecimal bigDecimal0 = new BigDecimal(0);
      jsonArray0.add((Number) bigDecimal0);
      jsonArray0.set(0, (JsonElement) null);
      // Undeclared exception!
      try { 
        jsonArray0.getAsDouble();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.JsonArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
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
  public void test46()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonObject jsonObject0 = new JsonObject();
      jsonArray0.add((JsonElement) jsonObject0);
      // Undeclared exception!
      try { 
        jsonArray0.getAsByte();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // JsonObject
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add("com.google.gson.JsonArray");
      // Undeclared exception!
      try { 
        jsonArray0.getAsByte();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"com.google.gson.JsonArray\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add((Boolean) null);
      // Undeclared exception!
      try { 
        jsonArray0.getAsBoolean();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // JsonNull
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Boolean boolean0 = Boolean.FALSE;
      jsonArray0.add(boolean0);
      // Undeclared exception!
      try { 
        jsonArray0.getAsBigInteger();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"j\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      // Undeclared exception!
      try { 
        jsonArray0.get((-4560));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      JsonArray jsonArray0 = null;
      try {
        jsonArray0 = new JsonArray((-4544));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal Capacity: -4544
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonArray jsonArray1 = jsonArray0.deepCopy();
      Boolean boolean0 = Boolean.valueOf("0Ql@ ~X{40");
      jsonArray1.add(boolean0);
      boolean boolean1 = jsonArray1.equals(jsonArray0);
      assertFalse(jsonArray1.equals((Object)jsonArray0));
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonArray jsonArray1 = jsonArray0.deepCopy();
      boolean boolean0 = jsonArray0.equals(jsonArray1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonArray jsonArray1 = new JsonArray();
      jsonArray0.add((JsonElement) jsonArray1);
      assertFalse(jsonArray1.equals((Object)jsonArray0));
      
      boolean boolean0 = jsonArray0.contains(jsonArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      boolean boolean0 = jsonArray0.equals(jsonArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Integer integer0 = new Integer(1);
      jsonArray0.add((Number) integer0);
      boolean boolean0 = jsonArray0.getAsBoolean();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
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
  public void test58()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Short short0 = new Short((short)0);
      jsonArray0.add((Number) short0);
      short short1 = jsonArray0.getAsShort();
      assertEquals((short)0, short1);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
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
  public void test60()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Short short0 = new Short((short)0);
      jsonArray0.add((Number) short0);
      char char0 = jsonArray0.getAsCharacter();
      assertEquals('j', char0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
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
  public void test62()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      BigDecimal bigDecimal0 = new BigDecimal((-2));
      jsonArray0.add((Number) bigDecimal0);
      byte byte0 = jsonArray0.getAsByte();
      assertEquals((byte) (-2), byte0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
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
  public void test64()  throws Throwable  {
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
  public void test65()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Integer integer0 = new Integer(1);
      jsonArray0.add((Number) integer0);
      long long0 = jsonArray0.getAsLong();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
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
  public void test67()  throws Throwable  {
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
  public void test68()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Integer integer0 = new Integer((-877));
      jsonArray0.add((Number) integer0);
      Boolean boolean0 = Boolean.valueOf("com.google.gson.internal.Streams$AppendableWriter");
      jsonArray0.add(boolean0);
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
  public void test69()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      BigDecimal bigDecimal0 = new BigDecimal((-2));
      jsonArray0.add((Number) bigDecimal0);
      BigDecimal bigDecimal1 = jsonArray0.getAsBigDecimal();
      assertEquals((byte) (-2), bigDecimal1.byteValue());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
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
  public void test71()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Double double0 = new Double((-1343.9110938784));
      jsonArray0.add((Number) double0);
      double double1 = jsonArray0.getAsDouble();
      assertEquals((-1343.9110938784), double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
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
  public void test73()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Double double0 = new Double((-1343.9110938784));
      jsonArray0.add((Number) double0);
      String string0 = jsonArray0.getAsString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
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
  public void test75()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add("0");
      Number number0 = jsonArray0.getAsNumber();
      assertEquals((short)0, number0.shortValue());
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
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
  public void test77()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add((JsonElement) jsonArray0);
      boolean boolean0 = jsonArray0.contains(jsonArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
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
  public void test79()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add((String) null);
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
  public void test80()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add("");
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
  public void test81()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add((Number) null);
      jsonArray0.set(0, (JsonElement) null);
      // Undeclared exception!
      try { 
        jsonArray0.getAsFloat();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.JsonArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Short short0 = new Short((short)0);
      jsonArray0.add((Number) short0);
      float float0 = jsonArray0.getAsFloat();
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add((Character) null);
      // Undeclared exception!
      try { 
        jsonArray0.getAsInt();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // JsonNull
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Character character0 = new Character('3');
      jsonArray0.add(character0);
      char char0 = jsonArray0.getAsCharacter();
      assertEquals('3', char0);
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add((Boolean) null);
      // Undeclared exception!
      try { 
        jsonArray0.getAsBigInteger();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // JsonNull
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonArray jsonArray1 = new JsonArray(0);
      jsonArray1.add((JsonElement) jsonArray0);
      JsonArray jsonArray2 = jsonArray1.deepCopy();
      assertEquals(1, jsonArray2.size());
      assertNotSame(jsonArray2, jsonArray1);
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      boolean boolean0 = jsonArray0.remove((JsonElement) jsonArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
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
  public void test89()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.hashCode();
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
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
  public void test91()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Iterator<JsonElement> iterator0 = jsonArray0.iterator();
      boolean boolean0 = jsonArray0.equals(iterator0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test92()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      int int0 = jsonArray0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test93()  throws Throwable  {
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
  public void test94()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      // Undeclared exception!
      try { 
        jsonArray0.set(0, (JsonElement) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }
}
