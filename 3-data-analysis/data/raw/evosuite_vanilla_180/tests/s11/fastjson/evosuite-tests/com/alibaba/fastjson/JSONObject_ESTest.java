/*
 * This file was automatically generated by EvoSuite
 * Fri May 22 19:16:48 GMT 2020
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
import com.alibaba.fastjson.serializer.SerializerFeature;
import java.io.ObjectInputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSONObject_ESTest extends JSONObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Date date0 = jSONObject0.getSqlDate("");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Double double0 = jSONObject0.getDouble("P>BP1P(x");
      assertNull(double0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      LinkedList<JSON> linkedList0 = jSONObject0.getObject(".O;K!+D0B<J", (TypeReference) null);
      assertNull(linkedList0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Set<Map.Entry<String, Object>> set0 = (Set<Map.Entry<String, Object>>)jSONObject0.entrySet();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.fluentPut("51xXBG|", "51xXBG|");
      int int0 = jSONObject0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.fluentPut("XG4;h.$oT", "XG4;h.$oT");
      jSONObject1.put("XG4;h.$oT", (Object) null);
      assertEquals(1, jSONObject0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.fluentPut("illegal getter", jSONObject0);
      Map<String, Object> map0 = jSONObject1.getInnerMap();
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Double double0 = new Double(1.0);
      Object object0 = jSONObject0.get(double0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.fluentPut("illegal getter", jSONObject0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      JSONObject jSONObject2 = jSONObject1.fluentRemove(pipedInputStream0);
      assertSame(jSONObject1, jSONObject2);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      boolean boolean0 = jSONObject0.equals(jSONObject0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      boolean boolean0 = jSONObject0.containsKey(jSONObject0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
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
  public void test12()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Object[] objectArray0 = new Object[0];
      try { 
        jSONObject0.invoke((Object) null, (Method) null, objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.JSONObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.fluentPut("illegal getter", jSONObject0);
      // Undeclared exception!
      try { 
        jSONObject0.getTimestamp("illegal getter");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to Timestamp, value : {\"illegal getter\":{\"$ref\":\"@\"}}
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.fluentPut("illegal getter", jSONObject0);
      // Undeclared exception!
      try { 
        jSONObject1.getShortValue("illegal getter");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to short, value : {\"illegal getter\":{\"$ref\":\"@\"}}
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.fluentPut("@q[do#tr^gNi", "@q[do#tr^gNi");
      // Undeclared exception!
      try { 
        jSONObject1.getShortValue("@q[do#tr^gNi");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"@q[do#tr^gNi\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.fluentPut("illegal getter", jSONObject0);
      // Undeclared exception!
      try { 
        jSONObject1.getLongValue("illegal getter");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to long, value : {\"illegal getter\":{\"$ref\":\"@\"}}
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      JSONObject jSONObject0 = new JSONObject(hashMap0);
      JSONObject jSONObject1 = jSONObject0.fluentPut("<ldeGX>~Z`;", "<ldeGX>~Z`;");
      // Undeclared exception!
      try { 
        jSONObject1.getLong("<ldeGX>~Z`;");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to long, value : <ldeGX>~Z`;
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Double double0 = new Double(0);
      jSONObject0.put((String) null, (Object) double0);
      // Undeclared exception!
      try { 
        jSONObject0.getJSONArray((String) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Double cannot be cast to com.alibaba.fastjson.JSONArray
         //
         verifyException("com.alibaba.fastjson.JSONObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.fluentPut("writeBefore", jSONObject0);
      // Undeclared exception!
      try { 
        jSONObject1.getIntValue("writeBefore");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to int, value : {\"writeBefore\":{\"$ref\":\"@\"}}
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.fluentPut("org.joda.time.DateTimeZone", "org.joda.time.DateTimeZone");
      // Undeclared exception!
      try { 
        jSONObject1.getFloatValue("org.joda.time.DateTimeZone");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.fluentPut("illegal getter", jSONObject0);
      // Undeclared exception!
      try { 
        jSONObject0.getDoubleValue("illegal getter");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to double, value : {\"illegal getter\":{\"$ref\":\"@\"}}
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Class<Object> class0 = Object.class;
      jSONObject0.fluentPut("illegal getter", class0);
      // Undeclared exception!
      try { 
        jSONObject0.getByteValue("illegal getter");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to byte, value : class java.lang.Object
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.fluentPut("writeBefore", jSONObject0);
      // Undeclared exception!
      try { 
        jSONObject1.getByte("writeBefore");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to byte, value : {\"writeBefore\":{\"$ref\":\"@\"}}
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.fluentPut("illegal getter", jSONObject0);
      // Undeclared exception!
      try { 
        jSONObject1.getBooleanValue("illegal getter");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to boolean, value : {\"illegal getter\":{\"$ref\":\"@\"}}
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.fluentPut("illegal getter", jSONObject0);
      // Undeclared exception!
      try { 
        jSONObject0.getBigDecimal("illegal getter");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
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
  public void test27()  throws Throwable  {
      JSONObject jSONObject0 = null;
      try {
        jSONObject0 = new JSONObject((-1347), false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal initial capacity: -1347
         //
         verifyException("java.util.HashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Class<Object> class0 = Object.class;
      JSONObject jSONObject1 = (JSONObject)jSONObject0.toJavaObject(class0, (ParserConfig) null, 0);
      assertEquals(3089, JSON.DEFAULT_GENERATE_FEATURE);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONArray jSONArray0 = jSONObject0.getJSONArray("1.2.68");
      assertNull(jSONArray0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      JSONObject jSONObject1 = jSONObject0.fluentPut("E#=", pipedInputStream0);
      jSONObject1.replace("E#=", (Object) "E#=");
      assertEquals(1, jSONObject0.size());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.replace("1.2.68", (Object) "1.2.68");
      assertEquals(0, jSONObject0.size());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      TreeMap<String, Object> treeMap0 = new TreeMap<String, Object>();
      JSONObject jSONObject0 = new JSONObject(treeMap0);
      // Undeclared exception!
      try { 
        jSONObject0.getByte((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Byte byte0 = jSONObject0.getByte((String) null);
      assertNull(byte0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      int int0 = jSONObject0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.hashCode();
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Class<Object> class0 = Object.class;
      JSONObject jSONObject1 = (JSONObject)jSONObject0.toJavaObject(class0);
      assertEquals(3089, JSON.DEFAULT_GENERATE_FEATURE);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Class<Short> class0 = Short.class;
      // Undeclared exception!
      try { 
        jSONObject0.toJavaObject(class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // create instance error, public java.lang.Short(java.lang.String) throws java.lang.NumberFormatException
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Class<JSONObject> class0 = JSONObject.class;
      JSONObject jSONObject1 = jSONObject0.toJavaObject(class0);
      assertEquals(989, JSON.DEFAULT_PARSER_FEATURE);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Class<JSON> class0 = JSON.class;
      JSON jSON0 = jSONObject0.toJavaObject(class0);
      assertSame(jSON0, jSONObject0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JSONObject.SecureObjectInputStream.ensureFields();
      JSONObject.SecureObjectInputStream.ensureFields();
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(0, true);
      JSONObject jSONObject1 = (JSONObject)jSONObject0.clone();
      assertTrue(jSONObject1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      String string0 = jSONObject0.getString("1.2.68");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.fluentPut("", "");
      String string0 = jSONObject1.getString("");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      double double0 = jSONObject0.getDoubleValue((String) null);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Short short0 = new Short((short)1314);
      jSONObject0.fluentPut("&n1$;C}+phk#Fwd2W", short0);
      double double0 = jSONObject0.getDoubleValue("&n1$;C}+phk#Fwd2W");
      assertEquals(1314.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(3838, false);
      float float0 = jSONObject0.getFloatValue("time");
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      long long0 = jSONObject0.getLongValue("equals");
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(false);
      int int0 = jSONObject0.getIntValue("S{");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      short short0 = jSONObject0.getShortValue("equals");
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      byte byte0 = jSONObject0.getByteValue("1.2.68");
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      boolean boolean0 = jSONObject0.getBooleanValue("lR}Ybv+&/UagT:");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      byte[] byteArray0 = jSONObject0.getBytes("java.util.Collections$EmptyMap");
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.fluentPut("1.2.68", jSONObject0);
      // Undeclared exception!
      try { 
        jSONObject1.getBytes("1.2.68");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to byte[], value : {\"1.2.68\":{\"$ref\":\"@\"}}
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Boolean boolean0 = jSONObject0.getBoolean("equals");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.fluentPut("illegal getter", jSONObject0);
      // Undeclared exception!
      try { 
        jSONObject1.getBoolean("illegal getter");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to boolean, value : {\"illegal getter\":{\"$ref\":\"@\"}}
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.fluentPut("writeBefore", jSONObject0);
      JSONObject jSONObject2 = jSONObject1.getJSONObject("writeBefore");
      assertSame(jSONObject2, jSONObject1);
      assertNotNull(jSONObject2);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.getJSONObject((String) null);
      assertNull(jSONObject1);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.fluentPut("@q[do#tr^gNi", "@q[do#tr^gNi");
      boolean boolean0 = jSONObject1.containsValue("@q[do#tr^gNi");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      boolean boolean0 = jSONObject0.containsValue("illegal getter");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      SerializerFeature serializerFeature0 = SerializerFeature.WriteNonStringValueAsString;
      JSONObject jSONObject1 = jSONObject0.fluentPut((String) null, serializerFeature0);
      Class<Object> class0 = Object.class;
      JSONObject jSONObject2 = (JSONObject)jSONObject1.toJavaObject(class0, (ParserConfig) null, 0);
      assertEquals(3089, JSON.DEFAULT_GENERATE_FEATURE);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Float float0 = new Float((float) 0);
      Object object0 = jSONObject0.getOrDefault(float0, float0);
      assertEquals(0.0F, object0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      boolean boolean0 = jSONObject0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      assertTrue(jSONObject0.isEmpty());
      
      jSONObject0.fluentPut("writeBefore", jSONObject0);
      boolean boolean0 = jSONObject0.isEmpty();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
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
  public void test65()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = (JSONObject)jSONObject0.clone();
      assertTrue(jSONObject1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(1979);
      assertTrue(jSONObject0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.clear();
      assertEquals(0, jSONObject0.size());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Collection<Object> collection0 = jSONObject0.values();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(false);
      jSONObject0.put("hashCode", (Object) null);
      TreeMap<String, PipedInputStream> treeMap0 = new TreeMap<String, PipedInputStream>();
      JSONObject jSONObject1 = jSONObject0.fluentPutAll(treeMap0);
      assertSame(jSONObject1, jSONObject0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Timestamp timestamp0 = jSONObject0.getTimestamp("com.alibaba.fastjson.JSONObject");
      assertNull(timestamp0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(false);
      java.util.Date date0 = jSONObject0.getDate("1.2.68");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Map<String, Object> map0 = jSONObject0.getInnerMap();
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Set<String> set0 = jSONObject0.keySet();
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Long long0 = jSONObject0.getLong((String) null);
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Float float0 = jSONObject0.getFloat("");
      assertNull(float0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Integer integer0 = jSONObject0.getInteger("u(}WL]CO@");
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      BigDecimal bigDecimal0 = jSONObject0.getBigDecimal("illegal getter");
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      LinkedHashMap<JSONObject, Method> linkedHashMap0 = new LinkedHashMap<JSONObject, Method>();
      JSONObject jSONObject1 = jSONObject0.fluentRemove(linkedHashMap0);
      assertTrue(jSONObject1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.fluentClear();
      assertTrue(jSONObject1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      Class<Object> class0 = Object.class;
      JSONObject jSONObject0 = new JSONObject();
      Integer integer0 = jSONObject0.getObject("pp", (Type) class0);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Short short0 = jSONObject0.getShort("");
      assertNull(short0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      TreeMap<String, Double> treeMap0 = new TreeMap<String, Double>();
      jSONObject0.putAll(treeMap0);
      assertEquals(0, jSONObject0.size());
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      BigInteger bigInteger0 = jSONObject0.getBigInteger("_q.9w2p4c3-T6?!=/");
      assertNull(bigInteger0);
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(false);
      TreeMap<String, PipedInputStream> treeMap0 = new TreeMap<String, PipedInputStream>();
      JSONObject jSONObject1 = jSONObject0.fluentPutAll(treeMap0);
      assertSame(jSONObject1, jSONObject0);
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Object object0 = jSONObject0.remove((Object) jSONObject0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      boolean boolean0 = jSONObject0.equals((Object) null);
      assertFalse(boolean0);
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