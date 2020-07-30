/*
 * This file was automatically generated by EvoSuite
 * Wed May 20 16:10:38 GMT 2020
 */

package com.alibaba.fastjson;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.ParserConfig;
import java.io.ObjectInputStream;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileWriter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSONObject_ESTest extends JSONObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(false);
      Class<Integer> class0 = Integer.TYPE;
      Integer integer0 = jSONObject0.toJavaObject(class0);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(false);
      JSONObject jSONObject1 = jSONObject0.fluentPut("", (Object) null);
      int int0 = jSONObject1.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(false);
      jSONObject0.fluentPut("", (Object) null);
      Map<String, Object> map0 = jSONObject0.getInnerMap();
      assertEquals(1, map0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(true);
      JSONObject jSONObject1 = jSONObject0.fluentPut("get", jSONObject0);
      JSONObject jSONObject2 = jSONObject1.fluentRemove((Object) null);
      assertFalse(jSONObject2.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.fluentPut("+uwc}q$", "+uwc}q$");
      JSONObject jSONObject2 = jSONObject1.fluentPutAll(jSONObject0);
      assertEquals(3089, JSON.DEFAULT_GENERATE_FEATURE);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      boolean boolean0 = jSONObject0.equals(jSONObject0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Class<MockFileWriter> class0 = MockFileWriter.class;
      // Undeclared exception!
      try { 
        jSONObject0.toJavaObject(class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // create instance error, public org.evosuite.runtime.mock.java.io.MockFileWriter(java.io.File,boolean) throws java.io.IOException
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(90);
      // Undeclared exception!
      try { 
        jSONObject0.putAll((Map<? extends String, ?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.HashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ConcurrentSkipListMap<String, Object> concurrentSkipListMap0 = new ConcurrentSkipListMap<String, Object>();
      JSONObject jSONObject0 = new JSONObject();
      try { 
        jSONObject0.invoke(concurrentSkipListMap0, (Method) null, (Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.JSONObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      LinkedHashMap<Byte, JSON> linkedHashMap0 = new LinkedHashMap<Byte, JSON>();
      jSONObject0.put((String) null, (Object) linkedHashMap0);
      // Undeclared exception!
      try { 
        jSONObject0.getInteger((String) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to int, value : {}
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(90);
      LinkedHashMap<Object, Short> linkedHashMap0 = new LinkedHashMap<Object, Short>();
      JSONObject jSONObject1 = jSONObject0.fluentPut("curContext", linkedHashMap0);
      // Undeclared exception!
      try { 
        jSONObject1.getFloatValue("curContext");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to float, value : {}
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(23);
      jSONObject0.put("K;u+1)*2gYTmGM/(N[", (Object) ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
      // Undeclared exception!
      try { 
        jSONObject0.getFloatValue("K;u+1)*2gYTmGM/(N[");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ConcurrentSkipListMap<String, Object> concurrentSkipListMap0 = new ConcurrentSkipListMap<String, Object>();
      JSONObject jSONObject0 = new JSONObject(concurrentSkipListMap0);
      // Undeclared exception!
      try { 
        jSONObject0.getBooleanValue((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ConcurrentSkipListMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ConcurrentSkipListMap<String, Object> concurrentSkipListMap0 = new ConcurrentSkipListMap<String, Object>();
      JSONObject jSONObject0 = new JSONObject(concurrentSkipListMap0);
      // Undeclared exception!
      try { 
        jSONObject0.fluentPut("9d}", (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ConcurrentSkipListMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSONObject jSONObject0 = null;
      try {
        jSONObject0 = new JSONObject((-1908874352), false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal initial capacity: -1908874352
         //
         verifyException("java.util.HashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSONObject jSONObject0 = null;
      try {
        jSONObject0 = new JSONObject((-3275));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal initial capacity: -3275
         //
         verifyException("java.util.HashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(23);
      Class<Integer> class0 = Integer.class;
      boolean boolean0 = jSONObject0.containsKey(class0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      int int0 = jSONObject0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ConcurrentSkipListMap<String, Object> concurrentSkipListMap0 = new ConcurrentSkipListMap<String, Object>();
      JSONObject jSONObject0 = new JSONObject(concurrentSkipListMap0);
      jSONObject0.hashCode();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(false);
      Set<Map.Entry<String, Object>> set0 = (Set<Map.Entry<String, Object>>)jSONObject0.entrySet();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(23);
      ParserConfig parserConfig0 = new ParserConfig();
      Class<Float> class0 = Float.class;
      // Undeclared exception!
      try { 
        jSONObject0.toJavaObject(class0, parserConfig0, 23);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not get javaBeanDeserializer. java.lang.Float
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(true);
      Class<JSON> class0 = JSON.class;
      JSONObject jSONObject1 = (JSONObject)jSONObject0.toJavaObject(class0);
      assertEquals(3089, JSON.DEFAULT_GENERATE_FEATURE);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(0, true);
      Class<JSONObject> class0 = JSONObject.class;
      JSONObject jSONObject1 = jSONObject0.toJavaObject(class0);
      assertEquals(0, jSONObject1.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSONObject.SecureObjectInputStream.ensureFields();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(true);
      JSONObject jSONObject1 = (JSONObject)jSONObject0.clone();
      assertEquals(0, jSONObject1.size());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ConcurrentSkipListMap<String, Object> concurrentSkipListMap0 = new ConcurrentSkipListMap<String, Object>();
      JSONObject jSONObject0 = new JSONObject(concurrentSkipListMap0);
      JSONObject jSONObject1 = (JSONObject)jSONObject0.clone();
      assertTrue(jSONObject1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(true);
      String string0 = jSONObject0.getString("WBI4,W");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(false);
      double double0 = jSONObject0.getDoubleValue("scanBoolean");
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(false);
      float float0 = jSONObject0.getFloatValue("2bLu8_2'|[");
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      int int0 = jSONObject0.getIntValue("dh|");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      short short0 = jSONObject0.getShortValue("k[VY1wXhP*C}");
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      byte byte0 = jSONObject0.getByteValue("~p");
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      boolean boolean0 = jSONObject0.getBooleanValue("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      byte[] byteArray0 = jSONObject0.getBytes((String) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(90);
      Boolean boolean0 = jSONObject0.getBoolean("1.2.68");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Double double0 = jSONObject0.getObject("@type", (TypeReference) null);
      assertNull(double0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONArray jSONArray0 = jSONObject0.getJSONArray("java.lang.AutoCloseable");
      assertNull(jSONArray0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.getJSONObject("uIhB5S~");
      assertNull(jSONObject1);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(90);
      LinkedHashMap<Object, Short> linkedHashMap0 = new LinkedHashMap<Object, Short>();
      JSONObject jSONObject1 = jSONObject0.fluentPut("curContext", linkedHashMap0);
      // Undeclared exception!
      try { 
        jSONObject1.getSqlDate("curContext");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to Date, value : {}
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(90);
      boolean boolean0 = jSONObject0.containsValue((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Double double0 = new Double(3089);
      Object object0 = jSONObject0.getOrDefault(double0, double0);
      assertEquals(3089.0, object0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(23);
      Class<Object> class0 = Object.class;
      ParserConfig parserConfig0 = new ParserConfig();
      JSONObject jSONObject1 = (JSONObject)jSONObject0.toJavaObject(class0, parserConfig0, 23);
      assertEquals(0, jSONObject1.size());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(false);
      boolean boolean0 = jSONObject0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(90);
      assertTrue(jSONObject0.isEmpty());
      
      LinkedHashMap<Object, Short> linkedHashMap0 = new LinkedHashMap<Object, Short>();
      jSONObject0.fluentPut("curContext", linkedHashMap0);
      boolean boolean0 = jSONObject0.isEmpty();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JSONObject jSONObject0 = null;
      try {
        jSONObject0 = new JSONObject((Map<String, Object>) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // map is null.
         //
         verifyException("com.alibaba.fastjson.JSONObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ConcurrentSkipListMap<String, Object> concurrentSkipListMap0 = new ConcurrentSkipListMap<String, Object>();
      JSONObject jSONObject0 = new JSONObject(concurrentSkipListMap0);
      long long0 = jSONObject0.getLongValue("fastjson.parser.autoTypeSupport");
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.clear();
      assertEquals(989, JSON.DEFAULT_PARSER_FEATURE);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Collection<Object> collection0 = jSONObject0.values();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(23);
      Timestamp timestamp0 = jSONObject0.getTimestamp("`Uo:x?`ejx=&8t/7RU");
      assertNull(timestamp0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(90);
      Date date0 = jSONObject0.getDate("Gt8<!@P{YX%~*oW");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Map<String, Object> map0 = jSONObject0.getInnerMap();
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(23);
      Set<String> set0 = jSONObject0.keySet();
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(true);
      Long long0 = jSONObject0.getLong(">JR3.]F1");
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(true);
      Float float0 = jSONObject0.getFloat((String) null);
      assertNull(float0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.fluentPutAll(jSONObject0);
      assertSame(jSONObject1, jSONObject0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(26085, false);
      Integer integer0 = jSONObject0.getInteger("istoString");
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Double double0 = jSONObject0.getDouble((String) null);
      assertNull(double0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(90);
      BigDecimal bigDecimal0 = jSONObject0.getBigDecimal("get");
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(90);
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      JSONObject jSONObject1 = jSONObject0.fluentRemove(parserConfig0);
      assertEquals(3089, JSON.DEFAULT_GENERATE_FEATURE);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(90);
      java.sql.Date date0 = jSONObject0.getSqlDate("Nn^s9s+@5\"GjzaIcs'F");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(false);
      JSONObject jSONObject1 = jSONObject0.fluentClear();
      assertTrue(jSONObject1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(90);
      Class<Method> class0 = Method.class;
      JSONArray jSONArray0 = jSONObject0.getObject("get", (Type) class0);
      assertNull(jSONArray0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(90);
      Short short0 = jSONObject0.getShort("@type");
      assertNull(short0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      LinkedHashMap<String, Float> linkedHashMap0 = new LinkedHashMap<String, Float>();
      jSONObject0.putAll(linkedHashMap0);
      assertTrue(jSONObject0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Byte byte0 = jSONObject0.getByte("");
      Object object0 = jSONObject0.remove((Object) byte0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      BigInteger bigInteger0 = jSONObject0.getBigInteger("3");
      assertNull(bigInteger0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(90);
      Object object0 = jSONObject0.get(jSONObject0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(false);
      boolean boolean0 = jSONObject0.equals("[7u4");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      JSONObject.SecureObjectInputStream jSONObject_SecureObjectInputStream0 = null;
      try {
        jSONObject_SecureObjectInputStream0 = new JSONObject.SecureObjectInputStream((ObjectInputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.JSONObject$SecureObjectInputStream", e);
      }
  }
}
