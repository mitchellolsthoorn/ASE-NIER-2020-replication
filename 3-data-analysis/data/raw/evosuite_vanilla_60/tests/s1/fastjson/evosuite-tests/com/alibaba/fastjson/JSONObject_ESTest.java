/*
 * This file was automatically generated by EvoSuite
 * Wed May 20 12:13:47 GMT 2020
 */

package com.alibaba.fastjson;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.util.GenericArrayTypeImpl;
import com.alibaba.fastjson.util.ParameterizedTypeImpl;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSONObject_ESTest extends JSONObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Set<String> set0 = jSONObject0.keySet();
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(0);
      Class<Integer> class0 = Integer.TYPE;
      Integer integer0 = jSONObject0.toJavaObject(class0);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(1165);
      Short short0 = new Short((short)154);
      jSONObject0.put(">FVg*7SUl{MNx'dNy8", (Object) short0);
      int int0 = jSONObject0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(1165);
      Short short0 = new Short((short)154);
      jSONObject0.put(">FVg*7SUl{MNx'dNy8", (Object) short0);
      Long long0 = jSONObject0.getLong(">FVg*7SUl{MNx'dNy8");
      assertEquals(154L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(1165);
      Short short0 = new Short((short)154);
      jSONObject0.put(">FVg*7SUl{MNx'dNy8", (Object) short0);
      Map<String, Object> map0 = jSONObject0.getInnerMap();
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Object object0 = jSONObject0.get(jSONObject0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      HashMap<Long, GenericArrayTypeImpl> hashMap0 = new HashMap<Long, GenericArrayTypeImpl>();
      BiFunction<Object, Object, String> biFunction0 = (BiFunction<Object, Object, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      jSONObject0.merge("map is nll.", hashMap0, biFunction0);
      JSONObject jSONObject1 = jSONObject0.fluentRemove(jSONObject0);
      assertSame(jSONObject0, jSONObject1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      HashMap<String, JSON> hashMap0 = new HashMap<String, JSON>();
      hashMap0.put("@type", jSONObject0);
      JSONObject jSONObject1 = jSONObject0.fluentPutAll(hashMap0);
      assertEquals(1, jSONObject1.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(1165);
      boolean boolean0 = jSONObject0.equals(jSONObject0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Class<Integer> class0 = Integer.class;
      boolean boolean0 = jSONObject0.containsKey(class0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.fluentPut("@type", "@type");
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        jSONObject0.toJavaObject(class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // autoType is not support. @type
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Type[] typeArray0 = new Type[0];
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, (Type) null, (Type) null);
      try { 
        jSONObject0.invoke(parameterizedTypeImpl0, (Method) null, (Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.JSONObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(1165);
      Short short0 = new Short((short)154);
      jSONObject0.put(">FVg*7SUl{MNx'dNy8", (Object) short0);
      // Undeclared exception!
      try { 
        jSONObject0.getJSONObject(">FVg*7SUl{MNx'dNy8");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Short cannot be cast to com.alibaba.fastjson.JSONObject
         //
         verifyException("com.alibaba.fastjson.JSONObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.fluentPut("yyyy-MM-dd HH:mm:ss", "1.2.68");
      // Undeclared exception!
      try { 
        jSONObject1.getFloatValue("yyyy-MM-dd HH:mm:ss");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.fluentPut("fastjson.parser.deny", "jkAW0 /d-`|\"");
      // Undeclared exception!
      try { 
        jSONObject1.getFloat("fastjson.parser.deny");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      // Undeclared exception!
      try { 
        jSONObject0.fluentPutAll((Map<? extends String, ?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.HashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSONObject jSONObject0 = null;
      try {
        jSONObject0 = new JSONObject((-2563), false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal initial capacity: -2563
         //
         verifyException("java.util.HashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSONObject jSONObject0 = null;
      try {
        jSONObject0 = new JSONObject((-4));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal initial capacity: -4
         //
         verifyException("java.util.HashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      BiFunction<Object, Object, JSONObject> biFunction0 = (BiFunction<Object, Object, JSONObject>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      jSONObject0.merge("@type", "@type", biFunction0);
      Class<GenericArrayTypeImpl> class0 = GenericArrayTypeImpl.class;
      // Undeclared exception!
      try { 
        JSON.toJavaObject((JSON) jSONObject0, class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // autoType is not support. @type
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      JSONObject jSONObject0 = new JSONObject(hashMap0);
      jSONObject0.putAll(hashMap0);
      assertTrue(hashMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      int int0 = jSONObject0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(0);
      jSONObject0.hashCode();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Set<Map.Entry<String, Object>> set0 = (Set<Map.Entry<String, Object>>)jSONObject0.entrySet();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      BiFunction<Object, Object, JSONObject> biFunction0 = (BiFunction<Object, Object, JSONObject>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      jSONObject0.merge("@type", "@type", biFunction0);
      ParserConfig parserConfig0 = ParserConfig.global;
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        jSONObject0.toJavaObject(class0, parserConfig0, (-335));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // autoType is not support. @type
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(0);
      Class<InputStream> class0 = InputStream.class;
      ParserConfig parserConfig0 = new ParserConfig(false);
      InputStream inputStream0 = jSONObject0.toJavaObject(class0, parserConfig0, 989);
      assertNull(inputStream0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(true);
      Class<Object> class0 = Object.class;
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      JSONObject jSONObject1 = (JSONObject)jSONObject0.toJavaObject(class0, parserConfig0, 0);
      assertTrue(jSONObject1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Class<Object> class0 = Object.class;
      JSONObject jSONObject1 = (JSONObject)jSONObject0.toJavaObject(class0);
      assertEquals(3089, JSON.DEFAULT_GENERATE_FEATURE);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(1940);
      Class<JSONObject> class0 = JSONObject.class;
      JSONObject jSONObject1 = jSONObject0.toJavaObject(class0);
      assertTrue(jSONObject1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSONObject.SecureObjectInputStream.ensureFields();
      JSONObject.SecureObjectInputStream jSONObject_SecureObjectInputStream0 = null;
      try {
        jSONObject_SecureObjectInputStream0 = new JSONObject.SecureObjectInputStream((ObjectInputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JSONObject.SecureObjectInputStream.ensureFields();
      JSONObject.SecureObjectInputStream.ensureFields();
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(162, true);
      JSONObject jSONObject1 = (JSONObject)jSONObject0.clone();
      assertEquals(989, JSON.DEFAULT_PARSER_FEATURE);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Object object0 = jSONObject0.clone();
      assertTrue(object0.equals((Object)jSONObject0));
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(0);
      String string0 = jSONObject0.getString("-9EG(>4FmV{`[@H{-h");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Short short0 = new Short((short)154);
      jSONObject0.put(">FVg*7SUl{MNx'dNy8", (Object) short0);
      String string0 = jSONObject0.getString(">FVg*7SUl{MNx'dNy8");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(10);
      double double0 = jSONObject0.getDoubleValue("@type");
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Float float0 = new Float((float) (-2061584300));
      JSONObject jSONObject1 = jSONObject0.fluentPut("(Ljava/util/Collection;C)V", float0);
      double double0 = jSONObject1.getDoubleValue("(Ljava/util/Collection;C)V");
      assertEquals((-2.061584256E9), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(10);
      float float0 = jSONObject0.getFloatValue("");
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(0);
      long long0 = jSONObject0.getLongValue("yyyy-MM-dd HH:mm:ss");
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      int int0 = jSONObject0.getIntValue("curContext");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Short short0 = new Short((short)154);
      jSONObject0.put(">FVg*7SUl{MNx'dNy8", (Object) short0);
      int int0 = jSONObject0.getIntValue(">FVg*7SUl{MNx'dNy8");
      assertEquals(154, int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      short short0 = jSONObject0.getShortValue("1.2.68");
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      byte byte0 = jSONObject0.getByteValue((String) null);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(0);
      boolean boolean0 = jSONObject0.getBooleanValue("1.2.68");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      byte[] byteArray0 = jSONObject0.getBytes("@type");
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(true);
      Boolean boolean0 = jSONObject0.getBoolean((String) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Byte byte0 = jSONObject0.getObject("1.2.68", (TypeReference) null);
      assertNull(byte0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(true);
      JSONArray jSONArray0 = jSONObject0.getJSONArray("");
      assertNull(jSONArray0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(2);
      JSONObject jSONObject1 = jSONObject0.fluentPut("get", "get");
      // Undeclared exception!
      try { 
        jSONObject1.getJSONObject("get");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, pos 1, line 1, column 2get
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      HashMap<Long, GenericArrayTypeImpl> hashMap0 = new HashMap<Long, GenericArrayTypeImpl>();
      BiFunction<Object, Object, String> biFunction0 = (BiFunction<Object, Object, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      jSONObject0.merge("map is nll.", hashMap0, biFunction0);
      JSONObject jSONObject1 = jSONObject0.getJSONObject("map is nll.");
      assertNotSame(jSONObject0, jSONObject1);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.getJSONObject("B5");
      assertNull(jSONObject1);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(1165);
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 1165, (-2061584300));
      boolean boolean0 = jSONObject0.containsValue(byteArrayInputStream0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(10);
      Short short0 = new Short((short) (-380));
      JSONObject jSONObject1 = (JSONObject)jSONObject0.getOrDefault(short0, jSONObject0);
      assertEquals(0, jSONObject1.size());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.fluentPut("@type", jSONObject0);
      Class<Object> class0 = Object.class;
      Object object0 = jSONObject1.toJavaObject(class0);
      assertSame(jSONObject0, object0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(0);
      boolean boolean0 = jSONObject0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      assertTrue(jSONObject0.isEmpty());
      
      HashMap<Long, GenericArrayTypeImpl> hashMap0 = new HashMap<Long, GenericArrayTypeImpl>();
      BiFunction<Object, Object, String> biFunction0 = (BiFunction<Object, Object, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      jSONObject0.merge("map is nll.", hashMap0, biFunction0);
      boolean boolean0 = jSONObject0.isEmpty();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
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
  public void test56()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.clear();
      assertEquals(3089, JSON.DEFAULT_GENERATE_FEATURE);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Collection<Object> collection0 = jSONObject0.values();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Short short0 = new Short((short)154);
      jSONObject0.put(">FVg*7SUl{MNx'dNy8", (Object) short0);
      Boolean boolean0 = jSONObject0.getBoolean(">FVg*7SUl{MNx'dNy8");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(0);
      Timestamp timestamp0 = jSONObject0.getTimestamp("<)C;,KM.)*yuK.|");
      assertNull(timestamp0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(0, true);
      Date date0 = jSONObject0.getDate("yyyy-MM-dd HH:mm:ss");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Map<String, Object> map0 = jSONObject0.getInnerMap();
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Long long0 = jSONObject0.getLong("1.2.68");
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(10);
      Float float0 = jSONObject0.getFloat((String) null);
      assertNull(float0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Integer integer0 = jSONObject0.getInteger("yyyy-MM-dd HH:mm:ss");
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(0, true);
      Double double0 = jSONObject0.getDouble("@type");
      assertNull(double0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      BigDecimal bigDecimal0 = jSONObject0.getBigDecimal("yyyy-MM-dd HH:mm:ss");
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(0);
      JSONObject jSONObject1 = jSONObject0.fluentRemove((Object) null);
      assertTrue(jSONObject1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      java.sql.Date date0 = jSONObject0.getSqlDate((String) null);
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(0);
      JSONObject jSONObject1 = jSONObject0.fluentClear();
      assertEquals(0, jSONObject1.size());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(0, true);
      Class<JSONArray> class0 = JSONArray.class;
      JSONArray jSONArray0 = jSONObject0.getObject("w2%@", (Type) class0);
      assertNull(jSONArray0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(0);
      Byte byte0 = jSONObject0.getByte("yyyy-MM-dd HH:mm:ss");
      assertNull(byte0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(1940);
      Short short0 = jSONObject0.getShort("scanBoolean");
      assertNull(short0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(false);
      JSONObject jSONObject1 = new JSONObject(jSONObject0);
      JSONObject jSONObject2 = jSONObject1.fluentPutAll(jSONObject0);
      assertEquals(3089, JSON.DEFAULT_GENERATE_FEATURE);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(1940);
      Object object0 = jSONObject0.remove((Object) jSONObject0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(true);
      BigInteger bigInteger0 = jSONObject0.getBigInteger("?r8;rt[VxUm$|^Gwz_");
      assertNull(bigInteger0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      boolean boolean0 = jSONObject0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(0, true);
      Class<JSONArray> class0 = JSONArray.class;
      JSONArray jSONArray0 = jSONObject0.getObject("~IjcV!R;*/", class0);
      assertNull(jSONArray0);
  }
}