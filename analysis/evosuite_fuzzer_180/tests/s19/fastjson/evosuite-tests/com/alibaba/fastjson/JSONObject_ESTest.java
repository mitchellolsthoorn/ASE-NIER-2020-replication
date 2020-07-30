/*
 * This file was automatically generated by EvoSuite
 * Fri May 22 19:53:33 GMT 2020
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
import com.alibaba.fastjson.serializer.SerializeConfig;
import java.io.ByteArrayInputStream;
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
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSONObject_ESTest extends JSONObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(false);
      Set<Map.Entry<String, Object>> set0 = (Set<Map.Entry<String, Object>>)jSONObject0.entrySet();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(false);
      Class<Float> class0 = Float.TYPE;
      ParserConfig parserConfig0 = ParserConfig.global;
      Float float0 = jSONObject0.toJavaObject(class0, parserConfig0, 36);
      assertNull(float0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      int int0 = jSONObject0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedHashMap<String, Object> linkedHashMap0 = new LinkedHashMap<String, Object>();
      JSONObject jSONObject0 = new JSONObject(linkedHashMap0);
      LinkedHashMap<Float, JSON> linkedHashMap1 = new LinkedHashMap<Float, JSON>(4, 1339.2627F, true);
      linkedHashMap0.put("org.springframework.aop.", linkedHashMap1);
      int int0 = jSONObject0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(true);
      Byte byte0 = new Byte((byte)16);
      JSONObject jSONObject1 = jSONObject0.fluentPut((String) null, byte0);
      Map<String, Object> map0 = jSONObject1.getInnerMap();
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(0, true);
      Float float0 = new Float((-1529.0485F));
      Object object0 = jSONObject0.get(float0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(true);
      Byte byte0 = new Byte((byte)16);
      JSONObject jSONObject1 = jSONObject0.fluentPut((String) null, byte0);
      JSONObject jSONObject2 = jSONObject1.fluentRemove(byte0);
      assertSame(jSONObject1, jSONObject2);
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
      Class<Float> class0 = Float.class;
      ParserConfig parserConfig0 = new ParserConfig();
      // Undeclared exception!
      try { 
        jSONObject0.toJavaObject(class0, parserConfig0, 4183);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not get javaBeanDeserializer. java.lang.Float
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
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
  public void test10()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(false);
      JSONObject jSONObject1 = jSONObject0.fluentPut("@type", "E7;[uiUG}>K");
      // Undeclared exception!
      try { 
        jSONObject1.getTimestamp("@type");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to Timestamp, value : E7;[uiUG}>K
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JSONObject jSONObject1 = jSONObject0.fluentPut("Xx9|6?528<E", byteArrayInputStream0);
      // Undeclared exception!
      try { 
        jSONObject1.getShortValue("Xx9|6?528<E");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to short, value : java.io.ByteArrayInputStream@3f2fcc24
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(false);
      JSONObject jSONObject1 = jSONObject0.fluentPut("1.2.68", "1.2.68");
      // Undeclared exception!
      try { 
        jSONObject1.getShortValue("1.2.68");
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
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.fluentPut("classLoaderName", "classLoaderName");
      // Undeclared exception!
      try { 
        jSONObject0.getJSONObject("classLoaderName");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, pos 1, line 1, column 2classLoaderName
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TreeMap<String, Object> treeMap0 = new TreeMap<String, Object>();
      JSONObject jSONObject0 = new JSONObject(treeMap0);
      // Undeclared exception!
      try { 
        jSONObject0.getJSONObject((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      ConcurrentHashMap<String, JSONObject> concurrentHashMap0 = new ConcurrentHashMap<String, JSONObject>();
      concurrentHashMap0.put("@type", jSONObject0);
      JSONObject jSONObject1 = jSONObject0.fluentPutAll(concurrentHashMap0);
      // Undeclared exception!
      try { 
        jSONObject1.getInteger("@type");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to int, value : {\"@type\":{\"$ref\":\"@\"}}
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(true);
      jSONObject0.fluentPut("@type", "E7;[uiUG}>K");
      // Undeclared exception!
      try { 
        jSONObject0.getIntValue("@type");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"E7;[uiUG}>K\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.fluentPut("@type", "@type");
      // Undeclared exception!
      try { 
        jSONObject0.getFloatValue("@type");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      SerializeConfig serializeConfig0 = SerializeConfig.getGlobalInstance();
      jSONObject0.fluentPut("_asm_deser__", serializeConfig0);
      // Undeclared exception!
      try { 
        jSONObject0.getDoubleValue("_asm_deser__");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to double, value : com.alibaba.fastjson.serializer.SerializeConfig@8
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(true);
      JSONObject jSONObject1 = jSONObject0.fluentPut("{\"\":{},\"y\":7,\"z\":[],\"\":[],\"b\":{\"\":-99}}", "{\"\":{},\"y\":7,\"z\":[],\"\":[],\"b\":{\"\":-99}}");
      // Undeclared exception!
      try { 
        jSONObject1.getDouble("{\"\":{},\"y\":7,\"z\":[],\"\":[],\"b\":{\"\":-99}}");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.fluentPut("@type", "@type");
      // Undeclared exception!
      try { 
        jSONObject1.getByteValue("@type");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"@type\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.fluentPut("uh}'", "LpGT4@-<9'o3");
      // Undeclared exception!
      try { 
        jSONObject1.getByte("uh}'");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"LpGT4@-<9'o3\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.fluentPut("+[LmH9e(r@?8^uYC", "+[LmH9e(r@?8^uYC");
      // Undeclared exception!
      try { 
        jSONObject1.getBooleanValue("+[LmH9e(r@?8^uYC");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to boolean, value : +[LmH9e(r@?8^uYC
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.fluentPut("@type", "@type");
      // Undeclared exception!
      try { 
        jSONObject0.getBigInteger("@type");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"java.lang\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.fluentPut("+[LmH9e(r@?8^uYC", "+[LmH9e(r@?8^uYC");
      // Undeclared exception!
      try { 
        jSONObject0.getBigDecimal("+[LmH9e(r@?8^uYC");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
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
  public void test26()  throws Throwable  {
      ConcurrentHashMap<String, Object> concurrentHashMap0 = new ConcurrentHashMap<String, Object>();
      JSONObject jSONObject0 = new JSONObject(concurrentHashMap0);
      // Undeclared exception!
      try { 
        jSONObject0.fluentPut((String) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ConcurrentHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JSONObject jSONObject0 = null;
      try {
        jSONObject0 = new JSONObject((-1), false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal initial capacity: -1
         //
         verifyException("java.util.HashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(false);
      jSONObject0.fluentPut("@type", "E7;[uiUG}>K");
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        JSON.toJavaObject((JSON) jSONObject0, class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // autoType is not support. E7;[uiUG}>K
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(false);
      BiFunction<Object, Object, JSON> biFunction0 = (BiFunction<Object, Object, JSON>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn(jSONObject0).when(biFunction0).apply(any() , any());
      JSONObject jSONObject1 = (JSONObject)jSONObject0.compute("scan false error", biFunction0);
      assertFalse(jSONObject1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      boolean boolean0 = jSONObject0.containsKey(jSONObject0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Object object0 = jSONObject0.put(";", (Object) ";");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(false);
      jSONObject0.hashCode();
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(2578, false);
      jSONObject0.clear();
      assertEquals(0, jSONObject0.size());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Class<JSONArray> class0 = JSONArray.class;
      // Undeclared exception!
      try { 
        jSONObject0.toJavaObject(class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not get javaBeanDeserializer. com.alibaba.fastjson.JSONArray
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Class<JSON> class0 = JSON.class;
      JSON jSON0 = jSONObject0.toJavaObject(class0);
      assertSame(jSON0, jSONObject0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Class<JSONObject> class0 = JSONObject.class;
      JSONObject jSONObject1 = jSONObject0.toJavaObject(class0);
      assertEquals(3089, JSON.DEFAULT_GENERATE_FEATURE);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JSONObject.SecureObjectInputStream.ensureFields();
      JSONObject.SecureObjectInputStream.ensureFields();
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(true);
      Object object0 = jSONObject0.clone();
      assertNotSame(jSONObject0, object0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = (JSONObject)jSONObject0.clone();
      assertTrue(jSONObject1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      String string0 = jSONObject0.getString("fz5{<5Z&ys$4c#s?lc");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(false);
      jSONObject0.fluentPut("_9_grO9W)/", "_9_grO9W)/");
      String string0 = jSONObject0.getString("_9_grO9W)/");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      double double0 = jSONObject0.getDoubleValue("1.2.68");
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(false);
      float float0 = jSONObject0.getFloatValue("yyyy-MM-dd HH:mm:ss");
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      long long0 = jSONObject0.getLongValue("yyyy-MM-dd HH:mm:ss");
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(false);
      int int0 = jSONObject0.getIntValue("1.2.68");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      short short0 = jSONObject0.getShortValue("");
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      byte byte0 = jSONObject0.getByteValue("8{Owv_B/M]3(&");
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(true);
      Byte byte0 = new Byte((byte)16);
      jSONObject0.fluentPut((String) null, byte0);
      byte byte1 = jSONObject0.getByteValue((String) null);
      assertEquals((byte)16, byte1);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(false);
      boolean boolean0 = jSONObject0.getBooleanValue(":`4DC");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(false);
      Double double0 = new Double(1000000.0);
      JSONObject jSONObject1 = jSONObject0.fluentPut("bin", double0);
      boolean boolean0 = jSONObject1.getBooleanValue("bin");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      byte[] byteArray0 = jSONObject0.getBytes("handles");
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(false);
      jSONObject0.fluentPut("1.2.68", "1.2.68");
      byte[] byteArray0 = jSONObject0.getBytes("1.2.68");
      assertArrayEquals(new byte[] {(byte) (-1), (byte) (-1), (byte) (-1), (byte) (-21)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Boolean boolean0 = jSONObject0.getBoolean("yyyy-MM-dd HH:mm:ss");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.fluentPut("+[LmH9e(r@?8^uYC", "+[LmH9e(r@?8^uYC");
      // Undeclared exception!
      try { 
        jSONObject1.getBoolean("+[LmH9e(r@?8^uYC");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to boolean, value : +[LmH9e(r@?8^uYC
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(false);
      Object object0 = jSONObject0.getObject("{\"\":[false],\"y\":7,\"z\":[],\"_9_grO9W)/\":{\"\":-99},\"x\":\"a string\"}", (TypeReference) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.fluentPut("@type", "@type");
      // Undeclared exception!
      try { 
        jSONObject0.getJSONArray("@type");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, pos 1, line 1, column 2@type
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONArray jSONArray0 = jSONObject0.getJSONArray("@type");
      assertNull(jSONArray0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(369);
      JSONObject jSONObject1 = jSONObject0.fluentPut("{\"\":[],\"y\":7,\"z\":[],\"java.nio.ByteBuffer\":{\"\":-99,\"x\":-99}}", "{\"\":[],\"y\":7,\"z\":[],\"java.nio.ByteBuffer\":{\"\":-99,\"x\":-99}}");
      JSONObject jSONObject2 = jSONObject1.getJSONObject("{\"\":[],\"y\":7,\"z\":[],\"java.nio.ByteBuffer\":{\"\":-99,\"x\":-99}}");
      assertEquals(989, JSON.DEFAULT_PARSER_FEATURE);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(369);
      JSONObject jSONObject1 = jSONObject0.getJSONObject("{\"\":[],\"y\":7,\"z\":[],\"java.nio.ByteBuffer\":{\"\":-99,\"x\":-99}}");
      assertNull(jSONObject1);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      SerializeConfig serializeConfig0 = new SerializeConfig(false);
      SerializeConfig serializeConfig1 = (SerializeConfig)jSONObject0.getOrDefault(3089, serializeConfig0);
      assertEquals("@type", serializeConfig1.getTypeKey());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      LinkedHashMap<String, Short> linkedHashMap0 = new LinkedHashMap<String, Short>();
      boolean boolean0 = jSONObject0.containsValue(linkedHashMap0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.fluentPut("@type", "@type");
      Class<Object> class0 = Object.class;
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
  public void test63()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Class<Object> class0 = Object.class;
      Object object0 = jSONObject0.toJavaObject(class0);
      assertSame(jSONObject0, object0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      boolean boolean0 = jSONObject0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      assertTrue(jSONObject0.isEmpty());
      
      jSONObject0.fluentPut("@type", "@type");
      boolean boolean0 = jSONObject0.isEmpty();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
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
  public void test67()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = new JSONObject(jSONObject0);
      JSONObject jSONObject2 = jSONObject1.fluentClear();
      assertEquals(0, jSONObject2.size());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Collection<Object> collection0 = jSONObject0.values();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Timestamp timestamp0 = jSONObject0.getTimestamp("g._k");
      assertNull(timestamp0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Date date0 = jSONObject0.getDate("79yA$29i^n_1XYu:");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(false);
      Map<String, Object> map0 = jSONObject0.getInnerMap();
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Set<String> set0 = jSONObject0.keySet();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Long long0 = jSONObject0.getLong((String) null);
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Float float0 = jSONObject0.getFloat("hashCode");
      assertNull(float0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Integer integer0 = jSONObject0.getInteger("@type");
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(true);
      Double double0 = jSONObject0.getDouble("{\"\":{},\"y\":7,\"z\":[],\"\":[],\"b\":{\"\":-99}}");
      assertNull(double0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      BigDecimal bigDecimal0 = jSONObject0.getBigDecimal("+[LmH9e(r@?8^uYC");
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.fluentRemove((Object) null);
      assertEquals(989, JSON.DEFAULT_PARSER_FEATURE);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      java.sql.Date date0 = jSONObject0.getSqlDate("1.2.68");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSON jSON0 = jSONObject0.getObject("", (Type) null);
      assertNull(jSON0);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Byte byte0 = jSONObject0.getByte("j:221ya/%");
      assertNull(byte0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Short short0 = jSONObject0.getShort("@type");
      assertNull(short0);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      ConcurrentHashMap<String, JSONObject> concurrentHashMap0 = new ConcurrentHashMap<String, JSONObject>();
      JSONObject jSONObject1 = jSONObject0.fluentPutAll(concurrentHashMap0);
      assertSame(jSONObject0, jSONObject1);
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      TreeMap<String, JSONArray> treeMap0 = new TreeMap<String, JSONArray>();
      jSONObject0.putAll(treeMap0);
      assertEquals(3089, JSON.DEFAULT_GENERATE_FEATURE);
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(false);
      BigInteger bigInteger0 = jSONObject0.getBigInteger("set");
      assertNull(bigInteger0);
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Object object0 = jSONObject0.remove((Object) jSONObject0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Class<SerializeConfig> class0 = SerializeConfig.class;
      ParserConfig parserConfig0 = ParserConfig.global;
      SerializeConfig serializeConfig0 = jSONObject0.toJavaObject(class0, parserConfig0, 2);
      assertTrue(serializeConfig0.isAsmEnable());
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      LinkedHashMap<String, Short> linkedHashMap0 = new LinkedHashMap<String, Short>();
      boolean boolean0 = jSONObject0.equals(linkedHashMap0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
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