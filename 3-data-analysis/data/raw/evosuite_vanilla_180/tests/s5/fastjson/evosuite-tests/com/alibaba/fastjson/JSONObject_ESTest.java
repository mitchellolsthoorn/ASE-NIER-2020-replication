/*
 * This file was automatically generated by EvoSuite
 * Fri May 22 16:46:45 GMT 2020
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
import com.alibaba.fastjson.serializer.ObjectSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.util.FieldInfo;
import java.io.ObjectInputStream;
import java.io.PipedInputStream;
import java.io.SequenceInputStream;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSONObject_ESTest extends JSONObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      Class<Byte> class0 = Byte.TYPE;
      Byte byte0 = jSONObject0.toJavaObject(class0, parserConfig0, (-1474));
      assertNull(byte0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Long long0 = new Long(3089);
      jSONObject0.put("", (Object) long0);
      Timestamp timestamp0 = jSONObject0.getTimestamp("");
      assertEquals(89000000, timestamp0.getNanos());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Float float0 = new Float(0.0);
      JSONObject jSONObject1 = jSONObject0.fluentPut("FZ", float0);
      Short short0 = jSONObject1.getShort("FZ");
      assertEquals((short)0, (short)short0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.put("yyyy-MM-dd HH:mm:ss", (Object) "yyyy-MM-dd HH:mm:ss");
      Map<String, Object> map0 = jSONObject0.getInnerMap();
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(0);
      SerializeConfig serializeConfig0 = SerializeConfig.globalInstance;
      Class<Object> class0 = Object.class;
      ObjectSerializer objectSerializer0 = serializeConfig0.createJavaBeanSerializer(class0);
      JSONArray jSONArray0 = new JSONArray(989);
      JSONObject jSONObject1 = jSONObject0.fluentPut("@type", jSONArray0);
      JSONObject jSONObject2 = jSONObject1.fluentRemove(objectSerializer0);
      assertEquals(989, JSON.DEFAULT_PARSER_FEATURE);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.fluentPutAll(jSONObject0);
      assertEquals(3089, JSON.DEFAULT_GENERATE_FEATURE);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedHashMap<String, Object> linkedHashMap0 = new LinkedHashMap<String, Object>();
      JSONObject jSONObject0 = new JSONObject();
      Double double0 = new Double((-2170.847865140036));
      JSONObject jSONObject1 = jSONObject0.fluentPut("@type", double0);
      JSONObject jSONObject2 = jSONObject1.fluentPutAll(linkedHashMap0);
      assertFalse(jSONObject2.isEmpty());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      boolean boolean0 = jSONObject0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
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
  public void test09()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      try { 
        jSONObject0.invoke("1.2.68", (Method) null, (Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.JSONObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.put("com.alibaba.fastjson.JSONObject$SecureObjectInputStream", (Object) "com.alibaba.fastjson.JSONObject$SecureObjectInputStream");
      // Undeclared exception!
      try { 
        jSONObject0.getTimestamp("com.alibaba.fastjson.JSONObject$SecureObjectInputStream");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to Timestamp, value : com.alibaba.fastjson.JSONObject$SecureObjectInputStream
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.put("S@]/W;", (Object) jSONObject0);
      // Undeclared exception!
      try { 
        jSONObject0.getShortValue("S@]/W;");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to short, value : {\"S@]/W;\":{\"$ref\":\"@\"}}
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.put("org.joda.time.format.DateTimeFormatter", (Object) "org.joda.time.format.DateTimeFormatter");
      // Undeclared exception!
      try { 
        jSONObject0.getShortValue("org.joda.time.format.DateTimeFormatter");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"org.joda.time.format.DateTimeFormatter\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.put("@type", (Object) jSONObject0);
      // Undeclared exception!
      try { 
        jSONObject0.getLongValue("@type");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to long, value : {\"@type\":{\"$ref\":\"@\"}}
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(false);
      Short short0 = new Short((short)0);
      JSONObject jSONObject1 = jSONObject0.fluentPut((String) null, short0);
      // Undeclared exception!
      try { 
        jSONObject1.getJSONObject((String) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Short cannot be cast to com.alibaba.fastjson.JSONObject
         //
         verifyException("com.alibaba.fastjson.JSONObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.put("yyyy-MM-dd HH:mm:ss", (Object) jSONObject0);
      // Undeclared exception!
      try { 
        jSONObject0.getIntValue("yyyy-MM-dd HH:mm:ss");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to int, value : {\"yyyy-MM-dd HH:mm:ss\":{\"$ref\":\"@\"}}
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedHashMap<String, Float> linkedHashMap0 = new LinkedHashMap<String, Float>();
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.put("=LyhpO3,+73", (Object) linkedHashMap0);
      // Undeclared exception!
      try { 
        jSONObject0.getFloatValue("=LyhpO3,+73");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to float, value : {}
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.put("istoString", (Object) "istoString");
      // Undeclared exception!
      try { 
        jSONObject0.getFloatValue("istoString");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Enumeration<PipedInputStream> enumeration0 = (Enumeration<PipedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      jSONObject0.put("toString", (Object) sequenceInputStream0);
      // Undeclared exception!
      try { 
        jSONObject0.getFloat("toString");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to float, value : java.io.SequenceInputStream@b2be78e
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(true);
      jSONObject0.put("yyyy-MM-dd HH:mm:ss", (Object) jSONObject0);
      // Undeclared exception!
      try { 
        jSONObject0.getByteValue("yyyy-MM-dd HH:mm:ss");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to byte, value : {\"yyyy-MM-dd HH:mm:ss\":{\"$ref\":\"@\"}}
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.put("org.joda.time.format.DateTimeFormatter", (Object) "org.joda.time.format.DateTimeFormatter");
      // Undeclared exception!
      try { 
        jSONObject0.getBooleanValue("org.joda.time.format.DateTimeFormatter");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to boolean, value : org.joda.time.format.DateTimeFormatter
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONArray jSONArray0 = new JSONArray(0);
      JSONArray jSONArray1 = jSONArray0.fluentAdd((Object) jSONArray0);
      // Undeclared exception!
      try { 
        jSONObject0.get(jSONArray1);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LinkedHashMap<String, Float> linkedHashMap0 = new LinkedHashMap<String, Float>();
      TreeMap<String, Object> treeMap0 = new TreeMap<String, Object>();
      JSONObject jSONObject0 = new JSONObject(treeMap0);
      // Undeclared exception!
      try { 
        jSONObject0.fluentRemove(linkedHashMap0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.LinkedHashMap cannot be cast to java.lang.Comparable
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
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
  public void test24()  throws Throwable  {
      JSONObject jSONObject0 = null;
      try {
        jSONObject0 = new JSONObject((-1789569705), false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal initial capacity: -1789569705
         //
         verifyException("java.util.HashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSONObject jSONObject0 = null;
      try {
        jSONObject0 = new JSONObject((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal initial capacity: -1
         //
         verifyException("java.util.HashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.put("org.joda.time.format.DateTimeFormatter", (Object) "org.joda.time.format.DateTimeFormatter");
      Object object0 = jSONObject0.get("org.joda.time.format.DateTimeFormatter");
      assertEquals("org.joda.time.format.DateTimeFormatter", object0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      boolean boolean0 = jSONObject0.containsKey((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      int int0 = jSONObject0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(false);
      jSONObject0.hashCode();
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Set<Map.Entry<String, Object>> set0 = (Set<Map.Entry<String, Object>>)jSONObject0.entrySet();
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Class<Object> class0 = Object.class;
      JSONObject jSONObject1 = (JSONObject)jSONObject0.toJavaObject(class0);
      assertEquals(3089, JSON.DEFAULT_GENERATE_FEATURE);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Class<Method> class0 = Method.class;
      // Undeclared exception!
      try { 
        jSONObject0.toJavaObject(class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // default constructor not found. class java.lang.reflect.Method
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Class<JSON> class0 = JSON.class;
      JSONObject jSONObject1 = (JSONObject)jSONObject0.toJavaObject(class0);
      assertEquals(0, jSONObject1.size());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Class<JSONObject> class0 = JSONObject.class;
      JSONObject jSONObject1 = jSONObject0.toJavaObject(class0);
      assertTrue(jSONObject1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JSONObject.SecureObjectInputStream.ensureFields();
      JSONObject.SecureObjectInputStream.ensureFields();
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      String string0 = jSONObject0.getString("yyyy-MM-dd HH:mm:ss");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      double double0 = jSONObject0.getDoubleValue("yyyy-MM-dd HH:mm:ss");
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      float float0 = jSONObject0.getFloatValue("yyyy-MM-dd HH:mm:ss");
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      long long0 = jSONObject0.getLongValue("S@]/W;");
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      int int0 = jSONObject0.getIntValue("yyyy-MM-dd HH:mm:ss");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      short short0 = jSONObject0.getShortValue("yyyy-MM-dd HH:mm:ss");
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Byte byte0 = new Byte((byte)90);
      jSONObject0.put("}Ka;oJR*1=)", (Object) byte0);
      byte byte1 = jSONObject0.getByteValue("}Ka;oJR*1=)");
      assertEquals((byte)90, byte1);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      boolean boolean0 = jSONObject0.getBooleanValue("gettoString");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      byte[] byteArray0 = jSONObject0.getBytes("yyyy-MM-dd HH:mm:ss");
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Boolean boolean0 = jSONObject0.getBoolean("1.2.68");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Object object0 = jSONObject0.getObject("@type", (TypeReference) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONArray jSONArray0 = jSONObject0.getJSONArray("1.2.68");
      assertNull(jSONArray0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      LinkedHashMap<String, Object> linkedHashMap0 = new LinkedHashMap<String, Object>();
      JSONObject jSONObject0 = new JSONObject(linkedHashMap0);
      linkedHashMap0.put("", jSONObject0);
      JSONObject jSONObject1 = jSONObject0.getJSONObject("");
      assertSame(jSONObject1, jSONObject0);
      assertNotNull(jSONObject1);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.getJSONObject("hashCode");
      assertNull(jSONObject1);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Long long0 = new Long(0L);
      Object object0 = jSONObject0.get(long0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      byte byte0 = jSONObject0.getByteValue("@type");
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.fluentPut("[D", jSONObject0);
      boolean boolean0 = jSONObject1.containsValue(jSONObject0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      boolean boolean0 = jSONObject0.containsValue("yyyy-MM-dd HH:mm:ss");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Long long0 = new Long(989);
      boolean boolean0 = jSONObject0.containsKey(long0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Class<Object> class0 = Object.class;
      ParserConfig parserConfig0 = ParserConfig.global;
      Object object0 = jSONObject0.toJavaObject(class0, parserConfig0, 3089);
      assertSame(object0, jSONObject0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      boolean boolean0 = jSONObject0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      assertTrue(jSONObject0.isEmpty());
      
      jSONObject0.put("istoString", (Object) "istoString");
      boolean boolean0 = jSONObject0.isEmpty();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(true);
      JSONObject jSONObject1 = (JSONObject)jSONObject0.clone();
      assertEquals(0, jSONObject1.size());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
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
  public void test60()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = (JSONObject)jSONObject0.clone();
      assertEquals(989, JSON.DEFAULT_PARSER_FEATURE);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.clear();
      assertTrue(jSONObject0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(false);
      Collection<Object> collection0 = jSONObject0.values();
      assertFalse(collection0.contains(false));
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.put("yyyy-MM-dd HH:mm:ss", (Object) "yyyy-MM-dd HH:mm:ss");
      // Undeclared exception!
      try { 
        jSONObject0.getJSONArray("yyyy-MM-dd HH:mm:ss");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, pos 1, line 1, column 2yyyy-MM-dd HH:mm:ss
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Timestamp timestamp0 = jSONObject0.getTimestamp("com.alibaba.fastjson.JSONObject$SecureObjectInputStream");
      assertNull(timestamp0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Date date0 = jSONObject0.getDate("e%}3<cz=zn (,Ri1(");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Map<String, Object> map0 = jSONObject0.getInnerMap();
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Set<String> set0 = jSONObject0.keySet();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Long long0 = jSONObject0.getLong("initStringFieldAsEmpty");
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Float float0 = jSONObject0.getFloat("istoString");
      assertNull(float0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Integer integer0 = jSONObject0.getInteger((String) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Double double0 = jSONObject0.getDouble(")lRVwz$2MhSjd");
      assertNull(double0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      BigDecimal bigDecimal0 = jSONObject0.getBigDecimal("1.2.68");
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.fluentRemove("K=`+7v");
      assertSame(jSONObject1, jSONObject0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Float float0 = new Float((double) 3089);
      jSONObject0.fluentPut("39jO94EXSTd6]B", float0);
      java.sql.Date date0 = jSONObject0.getSqlDate("39jO94EXSTd6]B");
      assertNotNull(date0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      java.sql.Date date0 = jSONObject0.getSqlDate("39jO94EXSTd6]B");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.fluentClear();
      assertSame(jSONObject0, jSONObject1);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Class<PipedInputStream> class0 = PipedInputStream.class;
      Type type0 = FieldInfo.getFieldType((Class<?>) class0, (Type) class0, (Type) class0);
      JSONObject jSONObject1 = jSONObject0.getObject("writeFieldNameDirect", type0);
      assertNull(jSONObject1);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Byte byte0 = jSONObject0.getByte("com.alibaba.fastjson.JSONObject");
      assertNull(byte0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Short short0 = jSONObject0.getShort("com.alibaba.fastjson.util.JavaBeanInfo");
      assertNull(short0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      HashMap<String, JSONObject> hashMap0 = new HashMap<String, JSONObject>();
      jSONObject0.putAll(hashMap0);
      assertEquals(0, jSONObject0.size());
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Object object0 = jSONObject0.remove((Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      BigInteger bigInteger0 = jSONObject0.getBigInteger("yyyy-MM-dd HH:mm:ss");
      assertNull(bigInteger0);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Object object0 = jSONObject0.get(jSONObject0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Class<SequenceInputStream> class0 = SequenceInputStream.class;
      ParserConfig parserConfig0 = new ParserConfig();
      // Undeclared exception!
      try { 
        jSONObject0.toJavaObject(class0, parserConfig0, 2934);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // create instance error, public java.io.SequenceInputStream(java.io.InputStream,java.io.InputStream)
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(false);
      boolean boolean0 = jSONObject0.equals(jSONObject0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Class<Short> class0 = Short.class;
      Short short0 = jSONObject0.getObject(";Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/Object;I[I)Ljava/lang/Object;", class0);
      assertNull(short0);
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
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