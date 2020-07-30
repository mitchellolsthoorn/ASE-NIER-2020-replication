/*
 * This file was automatically generated by EvoSuite
 * Fri May 22 17:07:31 GMT 2020
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
      JsonArray jsonArray0 = new JsonArray(45);
      assertTrue(jsonArray0.isJsonArray());
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.addAll(jsonArray0);
      assertFalse(jsonArray0.isJsonPrimitive());
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add((JsonElement) null);
      int int0 = jsonArray0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      boolean boolean0 = jsonArray0.remove((JsonElement) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Character character0 = new Character('A');
      jsonArray0.add(character0);
      jsonArray0.set(0, jsonArray0);
      JsonElement jsonElement0 = jsonArray0.remove(0);
      assertSame(jsonElement0, jsonArray0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Character character0 = new Character('D');
      jsonArray0.add(character0);
      JsonPrimitive jsonPrimitive0 = (JsonPrimitive)jsonArray0.remove(0);
      assertFalse(jsonPrimitive0.isBoolean());
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Iterator<JsonElement> iterator0 = jsonArray0.iterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add("");
      String string0 = jsonArray0.getAsString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Character character0 = new Character('6');
      jsonArray0.add(character0);
      short short0 = jsonArray0.getAsShort();
      assertEquals((short)6, short0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      Short short0 = new Short((short) (-23));
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add((Number) short0);
      short short1 = jsonArray0.getAsShort();
      assertEquals((short) (-23), short1);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      byte[] byteArray0 = new byte[5];
      byteArray0[3] = (byte) (-25);
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      BigDecimal bigDecimal0 = new BigDecimal(bigInteger0);
      jsonArray0.add((Number) bigDecimal0);
      Number number0 = jsonArray0.getAsNumber();
      assertSame(number0, bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      byte[] byteArray0 = new byte[20];
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      BigDecimal bigDecimal0 = new BigDecimal(bigInteger0);
      jsonArray0.add((Number) bigDecimal0);
      Number number0 = jsonArray0.getAsNumber();
      assertSame(number0, bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Character character0 = Character.valueOf('3');
      jsonArray0.add(character0);
      Number number0 = jsonArray0.getAsNumber();
      assertEquals(3.0F, number0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      BigDecimal bigDecimal0 = new BigDecimal(4523);
      jsonArray0.add((Number) bigDecimal0);
      Number number0 = jsonArray0.getAsNumber();
      assertSame(number0, bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Float float0 = new Float(1138.22);
      jsonArray0.add((Number) float0);
      long long0 = jsonArray0.getAsLong();
      assertEquals(1138L, long0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Short short0 = new Short((short) (-164));
      jsonArray0.add((Number) short0);
      long long0 = jsonArray0.getAsLong();
      assertEquals((-164L), long0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Float float0 = new Float(3028.230718);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(float0);
      jsonArray0.add((JsonElement) jsonPrimitive0);
      int int0 = jsonArray0.getAsInt();
      assertEquals(3028, int0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Long long0 = new Long((-1648L));
      jsonArray0.add((Number) long0);
      int int0 = jsonArray0.getAsInt();
      assertEquals((-1648), int0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Float float0 = new Float(1138.22);
      jsonArray0.add((Number) float0);
      float float1 = jsonArray0.getAsFloat();
      assertEquals(1138.22F, float1, 0.01F);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Long long0 = new Long((-1648L));
      jsonArray0.add((Number) long0);
      float float0 = jsonArray0.getAsFloat();
      assertEquals((-1648.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Character character0 = new Character('1');
      jsonArray0.add(character0);
      double double0 = jsonArray0.getAsDouble();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      BigDecimal bigDecimal0 = new BigDecimal((-253L));
      jsonArray0.add((Number) bigDecimal0);
      double double0 = jsonArray0.getAsDouble();
      assertEquals((-253.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add("[q|B:Ur9k");
      char char0 = jsonArray0.getAsCharacter();
      assertEquals('[', char0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Character character0 = new Character('1');
      jsonArray0.add(character0);
      char char0 = jsonArray0.getAsCharacter();
      assertEquals('1', char0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Short short0 = Short.valueOf((short)0);
      jsonArray0.add((Number) short0);
      byte byte0 = jsonArray0.getAsByte();
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      Short short0 = new Short((short) (-23));
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add((Number) short0);
      byte byte0 = jsonArray0.getAsByte();
      assertEquals((byte) (-23), byte0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Boolean boolean0 = Boolean.valueOf(true);
      jsonArray0.add(boolean0);
      boolean boolean1 = jsonArray0.getAsBoolean();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-89);
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      jsonArray0.add((Number) bigInteger0);
      BigInteger bigInteger1 = jsonArray0.getAsBigInteger();
      assertSame(bigInteger1, bigInteger0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      byte[] byteArray0 = new byte[2];
      byteArray0[1] = (byte)117;
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      jsonArray0.add((Number) bigInteger0);
      BigInteger bigInteger1 = jsonArray0.getAsBigInteger();
      assertEquals((short)117, bigInteger1.shortValue());
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      byte[] byteArray0 = new byte[6];
      byteArray0[5] = (byte) (-1);
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      jsonArray0.add((Number) bigInteger0);
      BigInteger bigInteger1 = jsonArray0.getAsBigInteger();
      assertSame(bigInteger1, bigInteger0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      byte[] byteArray0 = new byte[5];
      byteArray0[3] = (byte) (-25);
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      BigDecimal bigDecimal0 = new BigDecimal(bigInteger0);
      jsonArray0.add((Number) bigDecimal0);
      BigDecimal bigDecimal1 = jsonArray0.getAsBigDecimal();
      assertSame(bigDecimal1, bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      byte[] byteArray0 = new byte[5];
      byteArray0[4] = (byte)125;
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      BigDecimal bigDecimal0 = new BigDecimal(bigInteger0);
      jsonArray0.add((Number) bigDecimal0);
      BigDecimal bigDecimal1 = jsonArray0.getAsBigDecimal();
      assertEquals((byte)125, bigDecimal1.byteValue());
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      byte[] byteArray0 = new byte[5];
      byteArray0[4] = (byte) (-25);
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      BigDecimal bigDecimal0 = new BigDecimal(bigInteger0);
      jsonArray0.add((Number) bigDecimal0);
      BigDecimal bigDecimal1 = jsonArray0.getAsBigDecimal();
      assertEquals((byte) (-25), bigDecimal1.byteValue());
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonObject jsonObject0 = new JsonObject();
      jsonArray0.add((JsonElement) jsonObject0);
      JsonElement jsonElement0 = jsonArray0.get(0);
      assertFalse(jsonElement0.isJsonNull());
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Boolean boolean0 = Boolean.FALSE;
      jsonArray0.add(boolean0);
      jsonArray0.set(0, jsonArray0);
      JsonElement jsonElement0 = jsonArray0.get(0);
      assertSame(jsonArray0, jsonElement0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      // Undeclared exception!
      try { 
        jsonArray0.set((-2), (JsonElement) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      // Undeclared exception!
      try { 
        jsonArray0.remove((-1));
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
  public void test038()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Boolean boolean0 = Boolean.TRUE;
      jsonArray0.add(boolean0);
      // Undeclared exception!
      try { 
        jsonArray0.getAsShort();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"true\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add((Number) null);
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
  public void test040()  throws Throwable  {
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
  public void test041()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      jsonArray0.add((JsonElement) jsonNull0);
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
  public void test042()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Boolean boolean0 = Boolean.TRUE;
      jsonArray0.add(boolean0);
      // Undeclared exception!
      try { 
        jsonArray0.getAsLong();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"true\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
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
  public void test044()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Boolean boolean0 = Boolean.FALSE;
      jsonArray0.add(boolean0);
      // Undeclared exception!
      try { 
        jsonArray0.getAsInt();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"false\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      jsonArray0.add((JsonElement) jsonNull0);
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
  public void test046()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add("com.google.gson.JsonArray");
      // Undeclared exception!
      try { 
        jsonArray0.getAsFloat();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add((Number) null);
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
  public void test048()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Boolean boolean0 = Boolean.TRUE;
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
      JsonObject jsonObject0 = new JsonObject();
      jsonArray0.add((JsonElement) jsonObject0);
      // Undeclared exception!
      try { 
        jsonArray0.getAsCharacter();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // JsonObject
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
  public void test055()  throws Throwable  {
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
  public void test056()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      // Undeclared exception!
      try { 
        jsonArray0.get((-1637));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Short short0 = new Short((short)3774);
      JsonArray jsonArray1 = new JsonArray();
      jsonArray1.add((Number) short0);
      boolean boolean0 = jsonArray0.equals(jsonArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      JsonArray jsonArray0 = null;
      try {
        jsonArray0 = new JsonArray((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal Capacity: -1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonArray jsonArray1 = jsonArray0.deepCopy();
      boolean boolean0 = jsonArray0.equals(jsonArray1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Boolean boolean0 = Boolean.valueOf("JSON must have only one top-level value.");
      boolean boolean1 = jsonArray0.equals(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      boolean boolean0 = jsonArray0.equals(jsonArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
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
  public void test063()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Float float0 = new Float(0.0);
      jsonArray0.add((Number) float0);
      short short0 = jsonArray0.getAsShort();
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
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
  public void test065()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Character character0 = new Character('c');
      jsonArray0.add(character0);
      char char0 = jsonArray0.getAsCharacter();
      assertEquals('c', char0);
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
      JsonArray jsonArray0 = new JsonArray();
      BigDecimal bigDecimal0 = new BigDecimal((-253L));
      jsonArray0.add((Number) bigDecimal0);
      byte byte0 = jsonArray0.getAsByte();
      assertEquals((byte)3, byte0);
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
      Character character0 = Character.valueOf('0');
      jsonArray0.add(character0);
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
      byte[] byteArray0 = new byte[20];
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      BigDecimal bigDecimal0 = new BigDecimal(bigInteger0);
      jsonArray0.add((Number) bigDecimal0);
      long long0 = jsonArray0.getAsLong();
      assertEquals(0L, long0);
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
      JsonArray jsonArray0 = new JsonArray();
      Float float0 = new Float(0.0);
      jsonArray0.add((Number) float0);
      float float1 = jsonArray0.getAsFloat();
      assertEquals(0.0F, float1, 0.01F);
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
      JsonArray jsonArray0 = new JsonArray();
      byte[] byteArray0 = new byte[6];
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      jsonArray0.add((Number) bigInteger0);
      BigInteger bigInteger1 = jsonArray0.getAsBigInteger();
      assertEquals((short)0, bigInteger1.shortValue());
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
      byte[] byteArray0 = new byte[20];
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      BigDecimal bigDecimal0 = new BigDecimal(bigInteger0);
      jsonArray0.add((Number) bigDecimal0);
      BigDecimal bigDecimal1 = jsonArray0.getAsBigDecimal();
      assertSame(bigDecimal1, bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
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
      Character character0 = Character.valueOf(' ');
      jsonArray0.add(character0);
      String string0 = jsonArray0.getAsString();
      assertEquals(" ", string0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
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
  public void test082()  throws Throwable  {
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
  public void test083()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Character character0 = new Character('A');
      jsonArray0.add(character0);
      JsonElement jsonElement0 = jsonArray0.get(0);
      boolean boolean0 = jsonArray0.contains(jsonElement0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      boolean boolean0 = jsonArray0.contains(jsonArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add((JsonElement) null);
      JsonElement jsonElement0 = jsonArray0.get(0);
      assertFalse(jsonElement0.isJsonPrimitive());
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add((String) null);
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
  public void test087()  throws Throwable  {
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
  public void test088()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add((Number) null);
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
  public void test089()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Long long0 = new Long(0L);
      jsonArray0.add((Number) long0);
      double double0 = jsonArray0.getAsDouble();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add((Character) null);
      JsonElement jsonElement0 = jsonArray0.remove(0);
      assertFalse(jsonElement0.isJsonPrimitive());
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.add((Boolean) null);
      JsonElement jsonElement0 = jsonArray0.set(0, jsonArray0);
      assertFalse(jsonElement0.isJsonObject());
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Boolean boolean0 = Boolean.FALSE;
      jsonArray0.add(boolean0);
      boolean boolean1 = jsonArray0.getAsBoolean();
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Character character0 = new Character('A');
      jsonArray0.add(character0);
      JsonElement jsonElement0 = jsonArray0.get(0);
      boolean boolean0 = jsonArray0.remove(jsonElement0);
      assertTrue(boolean0);
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
      JsonArray jsonArray0 = new JsonArray();
      jsonArray0.hashCode();
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
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
  public void test097()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      Character character0 = new Character('A');
      jsonArray0.add(character0);
      JsonArray jsonArray1 = jsonArray0.deepCopy();
      assertTrue(jsonArray1.equals((Object)jsonArray0));
      assertNotSame(jsonArray1, jsonArray0);
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
  public void test100()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      // Undeclared exception!
      try { 
        jsonArray0.set(0, jsonArray0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }
}
