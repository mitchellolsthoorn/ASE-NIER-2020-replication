/*
 * This file was automatically generated by EvoSuite
 * Fri May 22 08:30:05 GMT 2020
 */

package com.google.gson;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.JsonPrimitive;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JsonPrimitive_ESTest extends JsonPrimitive_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(bigDecimal0);
      BigDecimal bigDecimal1 = BigDecimal.ONE;
      JsonPrimitive jsonPrimitive1 = new JsonPrimitive(bigDecimal1);
      boolean boolean0 = jsonPrimitive0.equals(jsonPrimitive1);
      assertFalse(boolean0);
      assertFalse(jsonPrimitive1.equals((Object)jsonPrimitive0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Short short0 = new Short((short) (-1621));
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(short0);
      boolean boolean0 = jsonPrimitive0.isString();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Double double0 = new Double(424.10558038953263);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(double0);
      boolean boolean0 = jsonPrimitive0.isNumber();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("");
      boolean boolean0 = jsonPrimitive0.isNumber();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(boolean0);
      boolean boolean1 = jsonPrimitive0.isBoolean();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("{\"x\":\"hello\",\"y\":7,\"z\":true,\"a\":[{}],\"b\":{}}");
      boolean boolean0 = jsonPrimitive0.isBoolean();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("");
      String string0 = jsonPrimitive0.getAsString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Integer integer0 = new Integer((-3503));
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(integer0);
      short short0 = jsonPrimitive0.getAsShort();
      assertEquals((short) (-3503), short0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(bigDecimal0);
      Number number0 = jsonPrimitive0.getAsNumber();
      assertEquals((short)0, number0.shortValue());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BigDecimal bigDecimal0 = new BigDecimal((-2307L));
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(bigDecimal0);
      Number number0 = jsonPrimitive0.getAsNumber();
      assertEquals((byte) (-3), number0.byteValue());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(bigDecimal0);
      long long0 = jsonPrimitive0.getAsLong();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ZERO;
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(bigInteger0);
      int int0 = jsonPrimitive0.getAsInt();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BigDecimal bigDecimal0 = new BigDecimal((-2378));
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(bigDecimal0);
      int int0 = jsonPrimitive0.getAsInt();
      assertEquals((-2378), int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Float float0 = new Float((-1452.16));
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(float0);
      float float1 = jsonPrimitive0.getAsFloat();
      assertEquals((-1452.16F), float1, 0.01F);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ZERO;
      BigDecimal bigDecimal0 = new BigDecimal(bigInteger0);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(bigDecimal0);
      double double0 = jsonPrimitive0.getAsDouble();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Long long0 = new Long((-9223372036854775808L));
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(long0);
      double double0 = jsonPrimitive0.getAsDouble();
      assertEquals((-9.223372036854776E18), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("{\"x\":\"hello\",\"y\":7,\"z\":false,\"a\":[],\"b\":{}}");
      char char0 = jsonPrimitive0.getAsCharacter();
      assertEquals('{', char0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Character character0 = new Character('1');
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(character0);
      char char0 = jsonPrimitive0.getAsCharacter();
      assertEquals('1', char0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ZERO;
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(bigInteger0);
      byte byte0 = jsonPrimitive0.getAsByte();
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Short short0 = new Short((short) (-1621));
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(short0);
      byte byte0 = jsonPrimitive0.getAsByte();
      assertEquals((byte) (-85), byte0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      BigInteger bigInteger0 = new BigInteger(101, 101, mockRandom0);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(bigInteger0);
      BigInteger bigInteger1 = jsonPrimitive0.getAsBigInteger();
      assertEquals((byte)7, bigInteger1.byteValue());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(bigDecimal0);
      BigDecimal bigDecimal1 = jsonPrimitive0.getAsBigDecimal();
      assertSame(bigDecimal0, bigDecimal1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BigDecimal bigDecimal0 = new BigDecimal(3291L);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(bigDecimal0);
      BigDecimal bigDecimal1 = jsonPrimitive0.getAsBigDecimal();
      assertSame(bigDecimal0, bigDecimal1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("");
      JsonPrimitive jsonPrimitive1 = jsonPrimitive0.deepCopy();
      assertFalse(jsonPrimitive1.isBoolean());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("{\"x\":\"hello\",\"y\":7,\"z\":true,\"a\":[],\"b\":{},\"xx\":true}");
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(boolean0);
      JsonPrimitive jsonPrimitive1 = jsonPrimitive0.deepCopy();
      assertTrue(jsonPrimitive1.isBoolean());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("");
      // Undeclared exception!
      try { 
        jsonPrimitive0.getAsShort();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
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
  public void test27()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("JsonReader is closed");
      // Undeclared exception!
      try { 
        jsonPrimitive0.getAsLong();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"JsonReader is closed\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("p");
      // Undeclared exception!
      try { 
        jsonPrimitive0.getAsInt();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"p\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(boolean0);
      // Undeclared exception!
      try { 
        jsonPrimitive0.getAsFloat();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("");
      // Undeclared exception!
      try { 
        jsonPrimitive0.getAsCharacter();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(boolean0);
      // Undeclared exception!
      try { 
        jsonPrimitive0.getAsByte();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"true\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = null;
      try {
        jsonPrimitive0 = new JsonPrimitive((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.$Gson$Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = null;
      try {
        jsonPrimitive0 = new JsonPrimitive((Number) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.$Gson$Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = null;
      try {
        jsonPrimitive0 = new JsonPrimitive((Character) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.$Gson$Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = null;
      try {
        jsonPrimitive0 = new JsonPrimitive((Boolean) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.$Gson$Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ONE;
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(bigInteger0);
      String string0 = jsonPrimitive0.getAsString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Integer integer0 = new Integer((-3503));
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(integer0);
      Byte byte0 = new Byte((byte)73);
      JsonPrimitive jsonPrimitive1 = new JsonPrimitive(byte0);
      boolean boolean0 = jsonPrimitive0.equals(jsonPrimitive1);
      assertFalse(jsonPrimitive1.equals((Object)jsonPrimitive0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Short short0 = new Short((short) (-1621));
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(short0);
      jsonPrimitive0.hashCode();
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Integer integer0 = new Integer((-3503));
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(integer0);
      Boolean boolean0 = new Boolean("V?/9_4ZH");
      JsonPrimitive jsonPrimitive1 = new JsonPrimitive(boolean0);
      boolean boolean1 = jsonPrimitive0.equals(jsonPrimitive1);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(boolean0);
      JsonPrimitive jsonPrimitive1 = new JsonPrimitive(boolean0);
      boolean boolean1 = jsonPrimitive0.equals(jsonPrimitive1);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Integer integer0 = new Integer((-3503));
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(integer0);
      Long long0 = new Long((-3503));
      JsonPrimitive jsonPrimitive1 = new JsonPrimitive(long0);
      boolean boolean0 = jsonPrimitive0.equals(jsonPrimitive1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      BigInteger bigInteger0 = BigInteger.TEN;
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(bigInteger0);
      JsonPrimitive jsonPrimitive1 = new JsonPrimitive(bigDecimal0);
      boolean boolean0 = jsonPrimitive0.equals(jsonPrimitive1);
      assertFalse(boolean0);
      assertFalse(jsonPrimitive1.equals((Object)jsonPrimitive0));
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(bigDecimal0);
      JsonPrimitive jsonPrimitive1 = new JsonPrimitive(bigDecimal0);
      boolean boolean0 = jsonPrimitive0.equals(jsonPrimitive1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Integer integer0 = new Integer((-3503));
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(integer0);
      Long long0 = new Long((-1L));
      JsonPrimitive jsonPrimitive1 = new JsonPrimitive(long0);
      boolean boolean0 = jsonPrimitive1.equals(jsonPrimitive0);
      assertFalse(jsonPrimitive0.equals((Object)jsonPrimitive1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(boolean0);
      boolean boolean1 = jsonPrimitive0.equals((Object) null);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(bigDecimal0);
      boolean boolean0 = jsonPrimitive0.equals(jsonPrimitive0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ZERO;
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(bigInteger0);
      boolean boolean0 = jsonPrimitive0.equals("java.lang.Float@0000000003");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Float float0 = new Float((-1816.2068F));
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(float0);
      jsonPrimitive0.hashCode();
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ONE;
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(bigInteger0);
      byte byte0 = jsonPrimitive0.getAsByte();
      assertEquals((byte)1, byte0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(bigDecimal0);
      int int0 = jsonPrimitive0.getAsInt();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ZERO;
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(bigInteger0);
      short short0 = jsonPrimitive0.getAsShort();
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Character character0 = new Character('1');
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(character0);
      short short0 = jsonPrimitive0.getAsShort();
      assertEquals((short)1, short0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Character character0 = new Character('1');
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(character0);
      long long0 = jsonPrimitive0.getAsLong();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ZERO;
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(bigInteger0);
      float float0 = jsonPrimitive0.getAsFloat();
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Character character0 = new Character('1');
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(character0);
      float float0 = jsonPrimitive0.getAsFloat();
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ZERO;
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(bigInteger0);
      BigInteger bigInteger1 = jsonPrimitive0.getAsBigInteger();
      assertEquals((byte)0, bigInteger1.byteValue());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(boolean0);
      // Undeclared exception!
      try { 
        jsonPrimitive0.getAsBigInteger();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"j\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      BigDecimal bigDecimal0 = new BigDecimal(0L);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(bigDecimal0);
      BigDecimal bigDecimal1 = jsonPrimitive0.getAsBigDecimal();
      assertEquals((short)0, bigDecimal1.shortValue());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(boolean0);
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
  public void test60()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(bigDecimal0);
      double double0 = jsonPrimitive0.getAsDouble();
      assertEquals(10.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("zr5,{64*7' eXJyE]2z");
      // Undeclared exception!
      try { 
        jsonPrimitive0.getAsDouble();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(boolean0);
      String string0 = jsonPrimitive0.getAsString();
      assertEquals("true", string0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("6");
      Number number0 = jsonPrimitive0.getAsNumber();
      assertEquals(6.0, number0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ZERO;
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(bigInteger0);
      boolean boolean0 = jsonPrimitive0.getAsBoolean();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(boolean0);
      boolean boolean1 = jsonPrimitive0.getAsBoolean();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Integer integer0 = new Integer((-3503));
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(integer0);
      char char0 = jsonPrimitive0.getAsCharacter();
      assertEquals('j', char0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("");
      boolean boolean0 = jsonPrimitive0.isString();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Integer integer0 = new Integer((-3503));
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(integer0);
      long long0 = jsonPrimitive0.getAsLong();
      assertEquals((-3503L), long0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Character character0 = Character.valueOf('(');
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(character0);
      jsonPrimitive0.hashCode();
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      BigDecimal bigDecimal0 = new BigDecimal(0L);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(bigDecimal0);
      JsonPrimitive jsonPrimitive1 = jsonPrimitive0.deepCopy();
      assertFalse(jsonPrimitive1.isJsonArray());
  }
}
