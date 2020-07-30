/*
 * This file was automatically generated by EvoSuite
 * Thu May 21 20:16:59 GMT 2020
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
import com.alibaba.fastjson.util.FieldInfo;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.SequenceInputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.time.temporal.ChronoField;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSONObject_ESTest extends JSONObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.fluentPut("yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss");
      int int0 = jSONObject1.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.fluentPut("handles", "handles");
      jSONObject1.remove((Object) "handles");
      assertTrue(jSONObject1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.putIfAbsent("", ")uT4v");
      Map<String, Object> map0 = jSONObject0.getInnerMap();
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(true);
      LinkedHashMap<Object, Float> linkedHashMap0 = new LinkedHashMap<Object, Float>();
      JSONObject jSONObject1 = jSONObject0.fluentPut("{OVK5'@aq@%2c", linkedHashMap0);
      JSONObject jSONObject2 = jSONObject1.fluentRemove(linkedHashMap0);
      assertEquals(3089, JSON.DEFAULT_GENERATE_FEATURE);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(false);
      Short short0 = new Short((short)4);
      jSONObject0.putIfAbsent("map", short0);
      JSONObject jSONObject1 = jSONObject0.fluentPutAll(jSONObject0);
      assertEquals(3089, JSON.DEFAULT_GENERATE_FEATURE);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      boolean boolean0 = jSONObject0.equals("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Class<InputStream> class0 = InputStream.class;
      FieldInfo fieldInfo0 = new FieldInfo("yyyy-MM-dd HH:mm:ss", class0, class0, class0, (Field) null, 989, 989, 989);
      try { 
        jSONObject0.invoke(class0, (Method) null, fieldInfo0.alternateNames);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.JSONObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.fluentPut("yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss");
      // Undeclared exception!
      try { 
        jSONObject1.getShortValue("yyyy-MM-dd HH:mm:ss");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"yyyy-MM-dd HH:mm:ss\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.fluentPut("yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss");
      // Undeclared exception!
      try { 
        jSONObject0.getLongValue("yyyy-MM-dd HH:mm:ss");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to long, value : yyyy-MM-dd HH:mm:ss
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(1, false);
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      jSONObject0.put("1.2.68", (Object) hashMap0);
      // Undeclared exception!
      try { 
        jSONObject0.getLong("1.2.68");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to long, value : {}
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(false);
      Short short0 = new Short((short) (-2331));
      jSONObject0.put("wSoV%;9m`f|yl", (Object) short0);
      // Undeclared exception!
      try { 
        jSONObject0.getJSONObject("wSoV%;9m`f|yl");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Short cannot be cast to com.alibaba.fastjson.JSONObject
         //
         verifyException("com.alibaba.fastjson.JSONObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(2392);
      Short short0 = new Short((short)76);
      JSONObject jSONObject1 = jSONObject0.fluentPut("equals", short0);
      // Undeclared exception!
      try { 
        jSONObject1.getJSONArray("equals");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Short cannot be cast to com.alibaba.fastjson.JSONArray
         //
         verifyException("com.alibaba.fastjson.JSONObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      ChronoField chronoField0 = ChronoField.SECOND_OF_DAY;
      jSONObject0.fluentPut("@type", chronoField0);
      // Undeclared exception!
      try { 
        jSONObject0.getIntValue("@type");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to int, value : SecondOfDay
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(0);
      JSONObject jSONObject1 = jSONObject0.fluentPut("", "");
      // Undeclared exception!
      try { 
        jSONObject1.getDoubleValue("");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ConcurrentHashMap<String, Object> concurrentHashMap0 = new ConcurrentHashMap<String, Object>();
      JSONObject jSONObject0 = new JSONObject(concurrentHashMap0);
      // Undeclared exception!
      try { 
        jSONObject0.getDoubleValue((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(false);
      jSONObject0.put("", (Object) jSONObject0.DEFAULT_GENERATE_FEATURE);
      // Undeclared exception!
      try { 
        jSONObject0.getBytes("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to byte[], value : 3089
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.fluentPut("yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss");
      // Undeclared exception!
      try { 
        jSONObject1.getByteValue("yyyy-MM-dd HH:mm:ss");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"yyyy-MM-dd HH:mm:ss\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedHashMap<Method, Float> linkedHashMap0 = new LinkedHashMap<Method, Float>();
      JSONObject jSONObject0 = new JSONObject(4);
      jSONObject0.put("U5NSw=", (Object) linkedHashMap0);
      // Undeclared exception!
      try { 
        jSONObject0.getByte("U5NSw=");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to byte, value : {}
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.putIfAbsent("com.alibaba.fastjson.JSONObject", "com.alibaba.fastjson.JSONObject");
      // Undeclared exception!
      try { 
        jSONObject0.getByte("com.alibaba.fastjson.JSONObject");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"com.alibaba.fastjson.JSONObject\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      LinkedHashMap<Method, Float> linkedHashMap0 = new LinkedHashMap<Method, Float>();
      jSONObject0.putIfAbsent("U5NSw=", linkedHashMap0);
      // Undeclared exception!
      try { 
        jSONObject0.getBigInteger("U5NSw=");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"java.ut\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
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
  public void test21()  throws Throwable  {
      JSONObject jSONObject0 = null;
      try {
        jSONObject0 = new JSONObject((-1349));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal initial capacity: -1349
         //
         verifyException("java.util.HashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.fluentPut("yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss");
      jSONObject0.putIfAbsent("yyyy-MM-dd HH:mm:ss", "+w'iT$|");
      assertEquals(1, jSONObject0.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Short short0 = new Short((byte)0);
      Object object0 = jSONObject0.get(short0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Byte byte0 = jSONObject0.getByte("toS");
      assertNull(byte0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LinkedHashMap<JSONObject, String> linkedHashMap0 = new LinkedHashMap<JSONObject, String>();
      JSONObject jSONObject0 = new JSONObject();
      String string0 = linkedHashMap0.put(jSONObject0, "C#z=]]");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Set<Map.Entry<String, Object>> set0 = (Set<Map.Entry<String, Object>>)jSONObject0.entrySet();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Set<String> set0 = jSONObject0.keySet();
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Class<SequenceInputStream> class0 = SequenceInputStream.class;
      // Undeclared exception!
      try { 
        jSONObject0.toJavaObject(class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // create instance error, public java.io.SequenceInputStream(java.io.InputStream,java.io.InputStream)
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Class<JSONObject> class0 = JSONObject.class;
      JSONObject jSONObject1 = jSONObject0.toJavaObject(class0);
      assertSame(jSONObject1, jSONObject0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSONObject.SecureObjectInputStream.ensureFields();
      JSONObject.SecureObjectInputStream jSONObject_SecureObjectInputStream0 = null;
      try {
        jSONObject_SecureObjectInputStream0 = new JSONObject.SecureObjectInputStream((ObjectInputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JSONObject.SecureObjectInputStream.ensureFields();
      JSONObject.SecureObjectInputStream.ensureFields();
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(true);
      Object object0 = jSONObject0.clone();
      assertNotSame(object0, jSONObject0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = (JSONObject)jSONObject0.clone();
      assertEquals(3089, JSON.DEFAULT_GENERATE_FEATURE);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      String string0 = jSONObject0.getString("yyyy-MM-dd HH:mm:ss");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      double double0 = jSONObject0.getDoubleValue("1.2.68");
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(true);
      float float0 = jSONObject0.getFloatValue("yyyy-MM-dd HH:mm:ss");
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      long long0 = jSONObject0.getLongValue("1.2.68");
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      int int0 = jSONObject0.getIntValue("@type");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      short short0 = jSONObject0.getShortValue("@type");
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      byte byte0 = jSONObject0.getByteValue("@type");
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      boolean boolean0 = jSONObject0.getBooleanValue("@type");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.fluentPut("yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss");
      byte[] byteArray0 = jSONObject0.getBytes("yyyy-MM-dd HH:mm:ss");
      assertEquals(14, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Boolean boolean0 = jSONObject0.getBoolean("yyyy-MM-dd HH:mm:ss");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.put("\"Y\"rJoAg", (Object) "\"Y\"rJoAg");
      // Undeclared exception!
      try { 
        jSONObject0.getBoolean("\"Y\"rJoAg");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to boolean, value : \"Y\"rJoAg
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      String string0 = jSONObject0.getObject("@type", (TypeReference) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.fluentPut("yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss");
      // Undeclared exception!
      try { 
        jSONObject1.getJSONArray("yyyy-MM-dd HH:mm:ss");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, pos 1, line 1, column 2yyyy-MM-dd HH:mm:ss
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONArray jSONArray0 = jSONObject0.getJSONArray("@type");
      assertNull(jSONArray0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.fluentPut("yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss");
      // Undeclared exception!
      try { 
        jSONObject1.getJSONObject("yyyy-MM-dd HH:mm:ss");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, pos 1, line 1, column 2yyyy-MM-dd HH:mm:ss
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.getJSONObject("1.2.68");
      assertNull(jSONObject1);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(4, true);
      byte[] byteArray0 = jSONObject0.getBytes("@type");
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(false);
      LinkedHashMap<JSONObject, JSONArray> linkedHashMap0 = new LinkedHashMap<JSONObject, JSONArray>();
      LinkedHashMap<JSONObject, Object> linkedHashMap1 = new LinkedHashMap<JSONObject, Object>(linkedHashMap0);
      JSONObject jSONObject1 = jSONObject0.fluentPut("handles", linkedHashMap1);
      boolean boolean0 = jSONObject1.containsValue(linkedHashMap1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(true);
      boolean boolean0 = jSONObject0.containsValue("':@z9!Zfv");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Double double0 = new Double((-1));
      boolean boolean0 = jSONObject0.containsKey(double0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Class<Object> class0 = Object.class;
      Object object0 = jSONObject0.toJavaObject(class0);
      assertSame(object0, jSONObject0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      boolean boolean0 = jSONObject0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
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
  public void test57()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(202);
      jSONObject0.putIfAbsent((String) null, ")uT4v");
      // Undeclared exception!
      try { 
        jSONObject0.getFloatValue((String) null);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.clear();
      assertTrue(jSONObject0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(false);
      Collection<Object> collection0 = jSONObject0.values();
      assertFalse(collection0.contains(false));
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Timestamp timestamp0 = jSONObject0.getTimestamp("i");
      assertNull(timestamp0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Date date0 = jSONObject0.getDate("");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Map<String, Object> map0 = jSONObject0.getInnerMap();
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(true);
      JSONObject jSONObject1 = new JSONObject(jSONObject0);
      boolean boolean0 = jSONObject1.containsKey(jSONObject0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Long long0 = jSONObject0.getLong("|,5#<E");
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(true);
      Float float0 = jSONObject0.getFloat("W");
      assertNull(float0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      int int0 = jSONObject0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Integer integer0 = jSONObject0.getInteger("yyyy-MM-dd HH:mm:ss");
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Double double0 = jSONObject0.getDouble("@type");
      assertNull(double0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(true);
      BigDecimal bigDecimal0 = jSONObject0.getBigDecimal("gettoString");
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(true);
      JSONObject jSONObject1 = jSONObject0.fluentRemove((Object) null);
      assertEquals(0, jSONObject1.size());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      assertTrue(jSONObject0.isEmpty());
      
      JSONObject jSONObject1 = jSONObject0.fluentPut("yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss");
      boolean boolean0 = jSONObject1.isEmpty();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(0, false);
      java.sql.Date date0 = jSONObject0.getSqlDate("com.alibaba.fastjson.JSONObject$SecureObjectInputStream");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(true);
      JSONObject jSONObject1 = jSONObject0.fluentClear();
      assertTrue(jSONObject1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Integer integer0 = jSONObject0.getObject((String) null, (Type) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Short short0 = jSONObject0.getShort((String) null);
      assertNull(short0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      ConcurrentSkipListMap<String, ParserConfig> concurrentSkipListMap0 = new ConcurrentSkipListMap<String, ParserConfig>();
      JSONObject jSONObject1 = jSONObject0.fluentPutAll(concurrentSkipListMap0);
      assertSame(jSONObject1, jSONObject0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      ConcurrentSkipListMap<String, SequenceInputStream> concurrentSkipListMap0 = new ConcurrentSkipListMap<String, SequenceInputStream>();
      jSONObject0.putAll(concurrentSkipListMap0);
      assertEquals(3089, JSON.DEFAULT_GENERATE_FEATURE);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      BigInteger bigInteger0 = jSONObject0.getBigInteger("U5NSw=");
      assertNull(bigInteger0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Object object0 = jSONObject0.remove((Object) jSONObject0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(true);
      jSONObject0.putIfAbsent("k?dZ^iz", jSONObject0);
      Class<ParserConfig> class0 = ParserConfig.class;
      jSONObject0.getObject("k?dZ^iz", class0);
      assertFalse(jSONObject0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(0, false);
      ConcurrentHashMap<String, JSONArray> concurrentHashMap0 = new ConcurrentHashMap<String, JSONArray>();
      boolean boolean0 = jSONObject0.equals(concurrentHashMap0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(true);
      Class<ParserConfig> class0 = ParserConfig.class;
      ParserConfig parserConfig0 = jSONObject0.getObject("k?dZ^iz", class0);
      assertNull(parserConfig0);
  }
}
