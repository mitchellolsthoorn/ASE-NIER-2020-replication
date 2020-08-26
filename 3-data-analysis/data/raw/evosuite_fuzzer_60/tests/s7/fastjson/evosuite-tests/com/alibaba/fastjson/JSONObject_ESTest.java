/*
 * This file was automatically generated by EvoSuite
 * Fri May 22 09:05:30 GMT 2020
 */

package com.alibaba.fastjson;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SimplePropertyPreFilter;
import java.io.BufferedInputStream;
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
import java.util.TreeMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.function.BiFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSONObject_ESTest extends JSONObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(true);
      Set<Map.Entry<String, Object>> set0 = (Set<Map.Entry<String, Object>>)jSONObject0.entrySet();
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(59, true);
      int int0 = jSONObject0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(65535);
      Class<Double> class0 = Double.TYPE;
      JSONObject jSONObject1 = jSONObject0.fluentPut("tX!'AQN!f[w2m{OPBbT", class0);
      int int0 = jSONObject1.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(true);
      LinkedHashMap<SimplePropertyPreFilter, Object> linkedHashMap0 = new LinkedHashMap<SimplePropertyPreFilter, Object>();
      Object object0 = jSONObject0.put("z1bMs%x LWm", (Object) linkedHashMap0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(false);
      jSONObject0.fluentPut("{}", jSONObject0);
      Map<String, Object> map0 = jSONObject0.getInnerMap();
      assertEquals(1, map0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(true);
      Double double0 = new Double(989);
      JSONObject jSONObject1 = jSONObject0.fluentPut("kg\"U^ZoHz`", double0);
      BigInteger bigInteger0 = jSONObject1.getBigInteger("kg\"U^ZoHz`");
      assertEquals((byte) (-35), bigInteger0.byteValue());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      LinkedHashMap<Short, Long> linkedHashMap0 = new LinkedHashMap<Short, Long>();
      JSONObject jSONObject1 = jSONObject0.fluentPut("{\"x\":null,\"y\":7,\"z\":true,\"a\":[],\"b\":{}}", linkedHashMap0);
      JSONObject jSONObject2 = jSONObject1.fluentRemove(jSONObject0);
      assertEquals(1, jSONObject2.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(true);
      Long long0 = new Long(989);
      JSONObject jSONObject1 = jSONObject0.fluentPut("java.lang.Short@0000000119", long0);
      JSONObject jSONObject2 = jSONObject1.fluentPutAll(jSONObject0);
      assertEquals(1, jSONObject2.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(1824);
      try { 
        jSONObject0.invoke((Object) null, (Method) null, (Object[]) null);
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
      BiFunction<Object, Object, JSONObject> biFunction0 = (BiFunction<Object, Object, JSONObject>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn(jSONObject0).when(biFunction0).apply(any() , any());
      jSONObject0.compute((String) null, biFunction0);
      // Undeclared exception!
      try { 
        jSONObject0.getTimestamp((String) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to Timestamp, value : {null:{\"$ref\":\"@\"}}
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ConcurrentSkipListMap<String, Object> concurrentSkipListMap0 = new ConcurrentSkipListMap<String, Object>();
      JSONObject jSONObject0 = new JSONObject(concurrentSkipListMap0);
      // Undeclared exception!
      try { 
        jSONObject0.getLongValue((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ConcurrentSkipListMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(false);
      JSONObject jSONObject1 = jSONObject0.fluentPut("{}", jSONObject0);
      // Undeclared exception!
      try { 
        jSONObject1.getIntValue("{}");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to int, value : {\"{}\":{\"$ref\":\"@\"}}
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(true);
      jSONObject0.fluentPut("1.2.68", "1.2.68");
      // Undeclared exception!
      try { 
        jSONObject0.getIntValue("1.2.68");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"1.2.68\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(true);
      JSONObject jSONObject1 = jSONObject0.fluentPut("{}", jSONObject0);
      // Undeclared exception!
      try { 
        jSONObject1.getDouble("{}");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to double, value : {\"{}\":{\"$ref\":\"@\"}}
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ConcurrentSkipListMap<String, Object> concurrentSkipListMap0 = new ConcurrentSkipListMap<String, Object>();
      JSONObject jSONObject0 = new JSONObject(concurrentSkipListMap0);
      // Undeclared exception!
      try { 
        jSONObject0.getByteValue((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ConcurrentSkipListMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(true);
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
        jSONObject0 = new JSONObject((-3068), false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal initial capacity: -3068
         //
         verifyException("java.util.HashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSONObject jSONObject0 = null;
      try {
        jSONObject0 = new JSONObject((-2517));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal initial capacity: -2517
         //
         verifyException("java.util.HashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.clear();
      assertEquals(0, jSONObject0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(true);
      Class<String> class0 = String.class;
      String string0 = jSONObject0.toJavaObject(class0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(false);
      Class<Object> class0 = Object.class;
      JSONObject jSONObject1 = (JSONObject)jSONObject0.toJavaObject(class0);
      assertEquals(989, JSON.DEFAULT_PARSER_FEATURE);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JSONObject.SecureObjectInputStream.ensureFields();
      JSONObject.SecureObjectInputStream jSONObject_SecureObjectInputStream0 = null;
      try {
        jSONObject_SecureObjectInputStream0 = new JSONObject.SecureObjectInputStream((ObjectInputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSONObject.SecureObjectInputStream.ensureFields();
      JSONObject.SecureObjectInputStream.ensureFields();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(true);
      Object object0 = jSONObject0.clone();
      assertTrue(object0.equals((Object)jSONObject0));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(1839);
      Object object0 = jSONObject0.clone();
      assertNotSame(object0, jSONObject0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(false);
      String string0 = jSONObject0.getString("LIL!q!;Z|L~w{");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(true);
      jSONObject0.fluentPut("1.2.68", "1.2.68");
      String string0 = jSONObject0.getString("1.2.68");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(true);
      double double0 = jSONObject0.getDoubleValue("6(1&N!pX\u0001^B");
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(true);
      float float0 = jSONObject0.getFloatValue("1.2.68");
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(true);
      long long0 = jSONObject0.getLongValue("{}");
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      int int0 = jSONObject0.getIntValue("@type");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(true);
      Long long0 = new Long(502L);
      jSONObject0.fluentPut("1.2.68", long0);
      int int0 = jSONObject0.getIntValue("1.2.68");
      assertEquals(502, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      short short0 = jSONObject0.getShortValue("{}");
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(true);
      byte byte0 = jSONObject0.getByteValue("1.2.68");
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(true);
      boolean boolean0 = jSONObject0.getBooleanValue("3'3j5m=t~%8]=fu");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      byte[] byteArray0 = jSONObject0.getBytes("7HIK..?WRl1wA]");
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(false);
      JSONObject jSONObject1 = jSONObject0.fluentPut("{}", jSONObject0);
      // Undeclared exception!
      try { 
        jSONObject1.getBytes("{}");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to byte[], value : {\"{}\":{\"$ref\":\"@\"}}
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(727);
      Boolean boolean0 = jSONObject0.getBoolean("@type");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(true);
      JSONArray jSONArray0 = new JSONArray();
      BiFunction<Object, Object, JSONArray> biFunction0 = (BiFunction<Object, Object, JSONArray>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn(jSONArray0).when(biFunction0).apply(any() , any());
      jSONObject0.compute("{}", biFunction0);
      // Undeclared exception!
      try { 
        jSONObject0.getBoolean("{}");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to boolean, value : []
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(16, false);
      JSONArray jSONArray0 = jSONObject0.getJSONArray("'S");
      assertNull(jSONArray0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(false);
      JSONObject jSONObject1 = jSONObject0.getJSONObject("@type");
      assertNull(jSONObject1);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Object object0 = jSONObject0.get(jSONObject0.DEFAULT_PARSER_FEATURE);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(true);
      Long long0 = new Long(989);
      boolean boolean0 = jSONObject0.containsValue(long0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Feature[] featureArray0 = new Feature[1];
      Feature feature0 = Feature.SupportAutoType;
      featureArray0[0] = feature0;
      // Undeclared exception!
      try { 
        JSON.parseObject("{\"FSRrxeC|\":\"a string\",\"java.lang.Short@0000000118\":{\"x\":null},\"@type\":99,\"/**/\":99,\"Could not obtain an instance of DatatypeFactory.\":false,\"java.lang.Short@0000000130\":null,\"java.lang.Short@0000000131\":[],\"getEndInclusive\":\"a string\"}", featureArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // autoType is not support. 9,
         //
         verifyException("com.alibaba.fastjson.parser.ParserConfig", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(16, false);
      BiFunction<Object, Object, JSONArray> biFunction0 = (BiFunction<Object, Object, JSONArray>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(biFunction0).apply(any() , any());
      Object object0 = jSONObject0.compute("\"&*@fwM@t&ba*2=au", biFunction0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(16, false);
      boolean boolean0 = jSONObject0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(true);
      assertTrue(jSONObject0.isEmpty());
      
      JSONArray jSONArray0 = new JSONArray();
      BiFunction<Object, Object, JSONArray> biFunction0 = (BiFunction<Object, Object, JSONArray>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn(jSONArray0).when(biFunction0).apply(any() , any());
      jSONObject0.compute("{}", biFunction0);
      boolean boolean0 = jSONObject0.isEmpty();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
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
  public void test48()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(16, false);
      JSONObject jSONObject1 = new JSONObject(jSONObject0);
      JSONObject jSONObject2 = jSONObject1.fluentClear();
      assertTrue(jSONObject2.isEmpty());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(true);
      Collection<Object> collection0 = jSONObject0.values();
      assertFalse(collection0.contains(true));
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Class<JSONObject> class0 = JSONObject.class;
      String[] stringArray0 = new String[8];
      SimplePropertyPreFilter simplePropertyPreFilter0 = new SimplePropertyPreFilter(class0, stringArray0);
      BiFunction<Object, Object, SimplePropertyPreFilter> biFunction0 = (BiFunction<Object, Object, SimplePropertyPreFilter>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn(simplePropertyPreFilter0).when(biFunction0).apply(any() , any());
      jSONObject0.compute("6}?lh>60=J", biFunction0);
      // Undeclared exception!
      try { 
        jSONObject0.getBooleanValue("6}?lh>60=J");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to boolean, value : com.alibaba.fastjson.serializer.SimplePropertyPreFilter@2
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Timestamp timestamp0 = jSONObject0.getTimestamp((String) null);
      assertNull(timestamp0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(true);
      Date date0 = jSONObject0.getDate("^vRqm3h:r+*KpjVW=O");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(false);
      Map<String, Object> map0 = jSONObject0.getInnerMap();
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Set<String> set0 = jSONObject0.keySet();
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Long long0 = jSONObject0.getLong("KX8S^GcZL8_{@9");
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(false);
      Float float0 = jSONObject0.getFloat("passHandle");
      assertNull(float0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(727);
      Integer integer0 = jSONObject0.getInteger("com.alibaba.fastjson.serializer.ASMSerializerFactory");
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(727);
      Double double0 = jSONObject0.getDouble("%=)F;Pf={KIo%)1");
      assertNull(double0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(76, false);
      BigDecimal bigDecimal0 = jSONObject0.getBigDecimal("GMT");
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(16, false);
      Double double0 = new Double(989);
      JSONObject jSONObject1 = jSONObject0.fluentRemove(double0);
      assertTrue(jSONObject1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(16, false);
      JSONObject jSONObject1 = jSONObject0.fluentPut("1.2.68", "'S");
      // Undeclared exception!
      try { 
        jSONObject1.getByteValue("1.2.68");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"'S\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(false);
      java.sql.Date date0 = jSONObject0.getSqlDate("?W*`.HU<+&Lnd6[POX");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(false);
      Byte byte0 = jSONObject0.getObject("@type", (Type) null);
      assertNull(byte0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Byte byte0 = jSONObject0.getByte((String) null);
      assertNull(byte0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(false);
      Short short0 = jSONObject0.getShort("{}");
      assertNull(short0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      TreeMap<String, BufferedInputStream> treeMap0 = new TreeMap<String, BufferedInputStream>();
      JSONObject jSONObject1 = jSONObject0.fluentPutAll(treeMap0);
      assertEquals(3089, JSON.DEFAULT_GENERATE_FEATURE);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(1003);
      ConcurrentSkipListMap<String, Integer> concurrentSkipListMap0 = new ConcurrentSkipListMap<String, Integer>();
      jSONObject0.putAll(concurrentSkipListMap0);
      assertEquals(0, jSONObject0.size());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(true);
      Object object0 = jSONObject0.remove((Object) "java.lang.Short@0000000119");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      BigInteger bigInteger0 = jSONObject0.getBigInteger("0");
      assertNull(bigInteger0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(1839);
      jSONObject0.hashCode();
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Object object0 = new Object();
      boolean boolean0 = jSONObject0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(true);
      Class<Feature> class0 = Feature.class;
      jSONObject0.getObject("illegal setter", class0);
  }
}