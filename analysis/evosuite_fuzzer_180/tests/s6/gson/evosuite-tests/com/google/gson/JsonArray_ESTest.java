/*
 * This file was automatically generated by EvoSuite
 * Fri May 22 14:49:32 GMT 2020
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
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JsonArray_ESTest extends JsonArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Character character0 = new Character('`');
      jsonArray0.add(character0);
      int int0 = jsonArray0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add("comgooglegson.TypeAdapter");
      JsonElement jsonElement0 = jsonArray0.set(0, jsonArray0);
      assertFalse(jsonElement0.isJsonObject());
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add((JsonElement) jsonArray0);
      JsonElement jsonElement0 = jsonArray0.set(0, jsonArray0);
      assertSame(jsonElement0, jsonArray0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add((String) null);
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      JsonElement jsonElement0 = jsonArray0.set(0, jsonNull0);
      assertTrue(jsonElement0.isJsonNull());
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Character character0 = Character.valueOf('[');
      jsonArray0.add(character0);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(character0);
      boolean boolean0 = jsonArray0.remove((JsonElement) jsonPrimitive0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add((Number) null);
      JsonElement jsonElement0 = jsonArray0.remove(0);
      assertFalse(jsonElement0.isJsonArray());
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray(0);
      jsonArray0.add((JsonElement) jsonArray0);
      JsonElement jsonElement0 = jsonArray0.remove(0);
      assertFalse(jsonElement0.isJsonObject());
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Float float0 = new Float(0.0);
      jsonArray0.add((Number) float0);
      JsonPrimitive jsonPrimitive0 = (JsonPrimitive)jsonArray0.remove((int) (short)0);
      assertFalse(jsonPrimitive0.isBoolean());
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add("");
      String string0 = jsonArray0.getAsString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray(1);
      Float float0 = new Float((double) 1);
      jsonArray0.add((Number) float0);
      short short0 = jsonArray0.getAsShort();
      assertEquals((short)1, short0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray(1637);
      byte[] byteArray0 = new byte[7];
      byteArray0[5] = (byte) (-84);
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      jsonArray0.add((Number) bigInteger0);
      short short0 = jsonArray0.getAsShort();
      assertEquals((short) (-21504), short0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray(1637);
      byte[] byteArray0 = new byte[7];
      byteArray0[5] = (byte) (-84);
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      jsonArray0.add((Number) bigInteger0);
      Number number0 = jsonArray0.getAsNumber();
      assertEquals((byte)0, number0.byteValue());
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray(1637);
      byte[] byteArray0 = new byte[7];
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      jsonArray0.add((Number) bigInteger0);
      Number number0 = jsonArray0.getAsNumber();
      assertSame(number0, bigInteger0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Character character0 = Character.valueOf('2');
      jsonArray0.add(character0);
      Number number0 = jsonArray0.getAsNumber();
      assertEquals(2.0F, number0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray(5466);
      byte[] byteArray0 = new byte[6];
      byteArray0[5] = (byte) (-36);
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      jsonArray0.add((Number) bigInteger0);
      Number number0 = jsonArray0.getAsNumber();
      assertEquals((byte) (-36), number0.byteValue());
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      BigDecimal bigDecimal0 = new BigDecimal(0.0);
      jsonArray0.add((Number) bigDecimal0);
      long long0 = jsonArray0.getAsLong();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Character character0 = Character.valueOf('2');
      jsonArray0.add(character0);
      long long0 = jsonArray0.getAsLong();
      assertEquals(2L, long0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray(0);
      Short short0 = new Short((short) (-2044));
      jsonArray0.add((Number) short0);
      long long0 = jsonArray0.getAsLong();
      assertEquals((-2044L), long0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Float float0 = new Float(1.0);
      jsonArray0.add((Number) float0);
      int int0 = jsonArray0.getAsInt();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Double double0 = new Double((-1.0));
      jsonArray0.add((Number) double0);
      int int0 = jsonArray0.getAsInt();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Float float0 = new Float(3385.6262F);
      jsonArray0.add((Number) float0);
      float float1 = jsonArray0.getAsFloat();
      assertEquals(3385.6262F, float1, 0.01F);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Byte byte0 = new Byte((byte) (-3));
      jsonArray0.add((Number) byte0);
      float float0 = jsonArray0.getAsFloat();
      assertEquals((-3.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Float float0 = new Float(1.0);
      jsonArray0.add((Number) float0);
      double double0 = jsonArray0.getAsDouble();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray(0);
      Short short0 = new Short((short) (-2044));
      jsonArray0.add((Number) short0);
      double double0 = jsonArray0.getAsDouble();
      assertEquals((-2044.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add("}#mmbWge%y'v");
      char char0 = jsonArray0.getAsCharacter();
      assertEquals('}', char0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray(0);
      Boolean boolean0 = Boolean.FALSE;
      jsonArray0.add(boolean0);
      char char0 = jsonArray0.getAsCharacter();
      assertEquals('f', char0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray(0);
      Short short0 = new Short((short) (-2044));
      jsonArray0.add((Number) short0);
      byte byte0 = jsonArray0.getAsByte();
      assertEquals((byte)4, byte0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Byte byte0 = new Byte((byte) (-3));
      jsonArray0.add((Number) byte0);
      byte byte1 = jsonArray0.getAsByte();
      assertEquals((byte) (-3), byte1);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray(5466);
      byte[] byteArray0 = new byte[23];
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      jsonArray0.add((Number) bigInteger0);
      BigInteger bigInteger1 = jsonArray0.getAsBigInteger();
      assertEquals((byte)0, bigInteger1.byteValue());
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray(5466);
      byte[] byteArray0 = new byte[9];
      byteArray0[8] = (byte)109;
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      jsonArray0.add((Number) bigInteger0);
      BigInteger bigInteger1 = jsonArray0.getAsBigInteger();
      assertSame(bigInteger1, bigInteger0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray(5466);
      byte[] byteArray0 = new byte[10];
      byteArray0[9] = (byte) (-2);
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      jsonArray0.add((Number) bigInteger0);
      BigInteger bigInteger1 = jsonArray0.getAsBigInteger();
      assertSame(bigInteger1, bigInteger0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      BigDecimal bigDecimal0 = new BigDecimal(0.0);
      jsonArray0.add((Number) bigDecimal0);
      BigDecimal bigDecimal1 = jsonArray0.getAsBigDecimal();
      assertEquals((byte)0, bigDecimal1.byteValue());
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      BigDecimal bigDecimal0 = new BigDecimal(1340L);
      jsonArray0.add((Number) bigDecimal0);
      BigDecimal bigDecimal1 = jsonArray0.getAsBigDecimal();
      assertEquals((short)1340, bigDecimal1.shortValue());
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonObject jsonObject0 = new JsonObject();
      jsonArray0.add((JsonElement) jsonObject0);
      JsonElement jsonElement0 = jsonArray0.get(0);
      assertTrue(jsonElement0.isJsonObject());
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add((Number) null);
      JsonElement jsonElement0 = jsonArray0.get(0);
      assertFalse(jsonElement0.isJsonArray());
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Boolean boolean0 = new Boolean(true);
      jsonArray0.add(boolean0);
      JsonElement jsonElement0 = jsonArray0.get(0);
      assertFalse(jsonElement0.isJsonNull());
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      // Undeclared exception!
      try { 
        jsonArray0.set((-3), (JsonElement) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      // Undeclared exception!
      try { 
        jsonArray0.remove((-2110));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
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
  public void test039()  throws Throwable  {
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
  public void test040()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add("com.google.gson.JsonArray");
      // Undeclared exception!
      try { 
        jsonArray0.getAsShort();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"com.google.gson.JsonArray\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add((JsonElement) null);
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
  public void test042()  throws Throwable  {
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
  public void test043()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add((Number) null);
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
  public void test044()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add((Number) null);
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
  public void test045()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add("N?'Rn");
      // Undeclared exception!
      try { 
        jsonArray0.getAsInt();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"N?'Rn\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add((Number) null);
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
  public void test047()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add("dT,>h}L$FU&");
      // Undeclared exception!
      try { 
        jsonArray0.getAsFloat();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Boolean boolean0 = Boolean.FALSE;
      jsonArray0.add(boolean0);
      // Undeclared exception!
      try { 
        jsonArray0.getAsDouble();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
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
  public void test050()  throws Throwable  {
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
  public void test051()  throws Throwable  {
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
  public void test052()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add("");
      // Undeclared exception!
      try { 
        jsonArray0.getAsByte();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add((Number) null);
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
  public void test054()  throws Throwable  {
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
  public void test055()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      // Undeclared exception!
      try { 
        jsonArray0.get((-232));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
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
  public void test057()  throws Throwable  {
      JsonArray jsonArray0 = null;
      try {
        jsonArray0 = new JsonArray((-89));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal Capacity: -89
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonArray jsonArray1 = jsonArray0.deepCopy();
      jsonArray1.add("_*Gt(xbAMobI2WPn");
      boolean boolean0 = jsonArray1.equals(jsonArray0);
      assertFalse(jsonArray1.equals((Object)jsonArray0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonArray jsonArray1 = jsonArray0.deepCopy();
      boolean boolean0 = jsonArray1.equals(jsonArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      boolean boolean0 = jsonArray0.equals("u-Apq3-}");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      boolean boolean0 = jsonArray0.equals(jsonArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray(1637);
      byte[] byteArray0 = new byte[7];
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      jsonArray0.add((Number) bigInteger0);
      boolean boolean0 = jsonArray0.getAsBoolean();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
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
  public void test064()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray(1637);
      byte[] byteArray0 = new byte[7];
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      jsonArray0.add((Number) bigInteger0);
      short short0 = jsonArray0.getAsShort();
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      BigDecimal bigDecimal0 = new BigDecimal(0.0);
      jsonArray0.add((Number) bigDecimal0);
      jsonArray0.add((Number) null);
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
  public void test066()  throws Throwable  {
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
  public void test067()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray(1637);
      byte[] byteArray0 = new byte[7];
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      jsonArray0.add((Number) bigInteger0);
      byte byte0 = jsonArray0.getAsByte();
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
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
  public void test069()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      BigDecimal bigDecimal0 = new BigDecimal(0.0);
      jsonArray0.add((Number) bigDecimal0);
      int int0 = jsonArray0.getAsInt();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
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
  public void test071()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Character character0 = Character.valueOf('(');
      jsonArray0.add(character0);
      // Undeclared exception!
      try { 
        jsonArray0.getAsLong();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"(\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
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
  public void test073()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray(1637);
      byte[] byteArray0 = new byte[7];
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      jsonArray0.add((Number) bigInteger0);
      float float0 = jsonArray0.getAsFloat();
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
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
  public void test075()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray(1);
      Float float0 = new Float((double) 1);
      jsonArray0.add((Number) float0);
      // Undeclared exception!
      try { 
        jsonArray0.getAsBigInteger();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"java.lan\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
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
  public void test077()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      BigDecimal bigDecimal0 = new BigDecimal((-38L));
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(bigDecimal0);
      jsonArray0.add((JsonElement) jsonPrimitive0);
      BigDecimal bigDecimal1 = jsonArray0.getAsBigDecimal();
      assertEquals((byte) (-38), bigDecimal1.byteValue());
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Double double0 = new Double(0.0);
      jsonArray0.add((Number) double0);
      double double1 = jsonArray0.getAsDouble();
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
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
  public void test080()  throws Throwable  {
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
  public void test081()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Character character0 = new Character('`');
      jsonArray0.add(character0);
      jsonArray0.add("|~FT~OA7&FRD6");
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
  public void test082()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add((JsonElement) jsonArray0);
      boolean boolean0 = jsonArray0.contains(jsonArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      boolean boolean0 = jsonArray0.contains(jsonArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add((JsonElement) null);
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
  public void test085()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add((String) null);
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
  public void test086()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add("09");
      char char0 = jsonArray0.getAsCharacter();
      assertEquals('0', char0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add((Number) null);
      Boolean boolean0 = Boolean.TRUE;
      jsonArray0.add(boolean0);
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
  public void test088()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Double double0 = new Double(0.0);
      jsonArray0.add((Number) double0);
      String string0 = jsonArray0.getAsString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add((Character) null);
      assertEquals(1, jsonArray0.size());
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add((Boolean) null);
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
  public void test091()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Boolean boolean0 = Boolean.TRUE;
      jsonArray0.add(boolean0);
      boolean boolean1 = jsonArray0.getAsBoolean();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Character character0 = Character.valueOf('(');
      jsonArray0.add(character0);
      JsonArray jsonArray1 = jsonArray0.deepCopy();
      assertNotSame(jsonArray1, jsonArray0);
      assertTrue(jsonArray1.equals((Object)jsonArray0));
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Character character0 = Character.valueOf('[');
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(character0);
      boolean boolean0 = jsonArray0.remove((JsonElement) jsonPrimitive0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
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
  public void test095()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray(2);
      jsonArray0.hashCode();
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray(1637);
      // Undeclared exception!
      try { 
        jsonArray0.get((byte)0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray(1637);
      Iterator<JsonElement> iterator0 = jsonArray0.iterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      int int0 = jsonArray0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.addAll(jsonArray0);
      assertEquals(0, jsonArray0.size());
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray(1637);
      Character character0 = new Character('0');
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(character0);
      // Undeclared exception!
      try { 
        jsonArray0.set((byte)11, jsonPrimitive0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 11, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }
}
