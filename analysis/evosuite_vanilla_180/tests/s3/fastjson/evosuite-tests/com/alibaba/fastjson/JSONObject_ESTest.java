/*
 * This file was automatically generated by EvoSuite
 * Fri May 22 16:01:15 GMT 2020
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
import com.alibaba.fastjson.util.GenericArrayTypeImpl;
import java.io.InputStream;
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
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSONObject_ESTest extends JSONObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Set<Map.Entry<String, Object>> set0 = (Set<Map.Entry<String, Object>>)jSONObject0.entrySet();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(0);
      jSONObject0.putAll(jSONObject0);
      assertEquals(3089, JSON.DEFAULT_GENERATE_FEATURE);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Class<Integer> class0 = Integer.TYPE;
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      Integer integer0 = jSONObject0.toJavaObject(class0, parserConfig0, 10);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Byte byte0 = new Byte((byte) (-3));
      jSONObject0.put("handles", (Object) byte0);
      int int0 = jSONObject0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Byte byte0 = new Byte((byte) (-3));
      jSONObject0.put("handles", (Object) byte0);
      Short short0 = jSONObject0.getShort("handles");
      assertEquals((short) (-3), (short)short0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      SequenceInputStream sequenceInputStream0 = jSONObject0.getObject("o3", (Type) null);
      assertNull(sequenceInputStream0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Byte byte0 = new Byte((byte) (-3));
      jSONObject0.put("handles", (Object) byte0);
      long long0 = jSONObject0.getLongValue("handles");
      assertEquals((-3L), long0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Byte byte0 = new Byte((byte) (-3));
      jSONObject0.put("handles", (Object) byte0);
      Integer integer0 = jSONObject0.getInteger("handles");
      assertEquals((-3), (int)integer0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.put("yyyy-MM-dd HH:mm:ss", (Object) "yyyy-MM-dd HH:mm:ss");
      Map<String, Object> map0 = jSONObject0.getInnerMap();
      assertEquals(1, map0.size());
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Byte byte0 = new Byte((byte)38);
      jSONObject0.put("<1}b\"K^43-}J", (Object) byte0);
      Float float0 = jSONObject0.getFloat("<1}b\"K^43-}J");
      assertEquals(38.0F, (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Byte byte0 = new Byte((byte) (-3));
      jSONObject0.put("handles", (Object) byte0);
      Double double0 = jSONObject0.getDouble("handles");
      assertEquals((-3.0), (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Byte byte0 = new Byte((byte) (-3));
      jSONObject0.put("java.lang.Byte@0000000113", (Object) byte0);
      Date date0 = jSONObject0.getDate("java.lang.Byte@0000000113");
      assertEquals("Wed Dec 31 23:59:59 GMT 1969", date0.toString());
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Double double0 = new Double(989);
      jSONObject0.put("osn", (Object) double0);
      Byte byte0 = jSONObject0.getByte("osn");
      assertEquals((byte) (-35), (byte)byte0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Byte byte0 = new Byte((byte) (-3));
      jSONObject0.put("handles", (Object) byte0);
      Boolean boolean0 = jSONObject0.getBoolean("handles");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Byte byte0 = new Byte((byte) (-3));
      jSONObject0.put("handles", (Object) byte0);
      JSONObject jSONObject1 = jSONObject0.fluentRemove("3.4{I=bMe`7:PkvW");
      assertEquals(989, JSON.DEFAULT_PARSER_FEATURE);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      TreeMap<String, Byte> treeMap0 = new TreeMap<String, Byte>();
      boolean boolean0 = jSONObject0.equals(treeMap0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
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
  public void test017()  throws Throwable  {
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
  public void test018()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Byte byte0 = new Byte((byte) (-3));
      jSONObject0.put("handles", (Object) byte0);
      // Undeclared exception!
      try { 
        jSONObject0.getTimestamp("handles");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to Timestamp, value : -3
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.put("D", (Object) "D");
      // Undeclared exception!
      try { 
        jSONObject0.getSqlDate("D");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to Timestamp, value : D
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.fluentPut("1.2.68", "toString");
      // Undeclared exception!
      try { 
        jSONObject0.getShort("1.2.68");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"toString\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Byte byte0 = new Byte((byte) (-3));
      jSONObject0.put("handles", (Object) byte0);
      Class<Byte> class0 = Byte.TYPE;
      GenericArrayTypeImpl genericArrayTypeImpl0 = new GenericArrayTypeImpl(class0);
      // Undeclared exception!
      try { 
        jSONObject0.getObject("handles", (Type) genericArrayTypeImpl0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to : byte[]
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      LinkedHashMap<InputStream, Object> linkedHashMap0 = new LinkedHashMap<InputStream, Object>();
      jSONObject0.put("yyyy-MM-dd HH:mm:ss", (Object) linkedHashMap0);
      // Undeclared exception!
      try { 
        jSONObject0.getLongValue("yyyy-MM-dd HH:mm:ss");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to long, value : {}
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.put("yyyy-MM-dd HH:mm:ss", (Object) "yyyy-MM-dd HH:mm:ss");
      // Undeclared exception!
      try { 
        jSONObject0.getJSONObject("yyyy-MM-dd HH:mm:ss");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, pos 1, line 1, column 2yyyy-MM-dd HH:mm:ss
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Byte byte0 = new Byte((byte) (-3));
      jSONObject0.put("handles", (Object) byte0);
      // Undeclared exception!
      try { 
        jSONObject0.getJSONArray("handles");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Byte cannot be cast to com.alibaba.fastjson.JSONArray
         //
         verifyException("com.alibaba.fastjson.JSONObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.put("yyyy-MM-dd HH:mm:ss", (Object) "yyyy-MM-dd HH:mm:ss");
      // Undeclared exception!
      try { 
        jSONObject0.getDoubleValue("yyyy-MM-dd HH:mm:ss");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      TreeMap<String, Byte> treeMap0 = new TreeMap<String, Byte>();
      Byte byte0 = new Byte((byte) (-1));
      treeMap0.put("", byte0);
      jSONObject0.fluentPutAll(treeMap0);
      // Undeclared exception!
      try { 
        jSONObject0.getBytes("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to byte[], value : -1
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.put("yyyy-MM-dd HH:mm:ss", (Object) "yyyy-MM-dd HH:mm:ss");
      // Undeclared exception!
      try { 
        jSONObject0.getByte("yyyy-MM-dd HH:mm:ss");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"yyyy-MM-dd HH:mm:ss\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      jSONObject0.put("handles", (Object) pipedInputStream0);
      // Undeclared exception!
      try { 
        jSONObject0.getBooleanValue("handles");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to boolean, value : java.io.PipedInputStream@1e7b7461
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Byte byte0 = new Byte((byte) (-3));
      jSONObject0.put("handles", (Object) byte0);
      // Undeclared exception!
      try { 
        jSONObject0.getBigInteger("handles");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"java.la\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      LinkedHashMap<String, String> linkedHashMap0 = new LinkedHashMap<String, String>();
      ConcurrentSkipListMap<String, Object> concurrentSkipListMap0 = new ConcurrentSkipListMap<String, Object>(linkedHashMap0);
      Double double0 = new Double(1000.0);
      concurrentSkipListMap0.put("@type", double0);
      JSONObject jSONObject0 = new JSONObject(concurrentSkipListMap0);
      // Undeclared exception!
      try { 
        jSONObject0.fluentRemove(concurrentSkipListMap0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.concurrent.ConcurrentSkipListMap cannot be cast to java.lang.Comparable
         //
         verifyException("java.util.concurrent.ConcurrentSkipListMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
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
  public void test032()  throws Throwable  {
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
  public void test033()  throws Throwable  {
      JSONObject jSONObject0 = null;
      try {
        jSONObject0 = new JSONObject((-2106965086));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal initial capacity: -2106965086
         //
         verifyException("java.util.HashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.put("", (Object) "");
      Object object0 = jSONObject0.get("");
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Object object0 = jSONObject0.get(jSONObject0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      boolean boolean0 = jSONObject0.containsKey("@type");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(4, false);
      boolean boolean0 = jSONObject0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      int int0 = jSONObject0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(true);
      jSONObject0.hashCode();
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Class<Double> class0 = Double.class;
      ParserConfig parserConfig0 = new ParserConfig();
      // Undeclared exception!
      try { 
        jSONObject0.toJavaObject(class0, parserConfig0, 989);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not get javaBeanDeserializer. java.lang.Double
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Class<Object> class0 = Object.class;
      JSONObject jSONObject1 = (JSONObject)jSONObject0.toJavaObject(class0);
      assertEquals(3089, JSON.DEFAULT_GENERATE_FEATURE);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Class<InputStream> class0 = InputStream.class;
      InputStream inputStream0 = jSONObject0.toJavaObject(class0);
      assertNull(inputStream0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Class<JSONObject> class0 = JSONObject.class;
      JSONObject jSONObject1 = jSONObject0.toJavaObject(class0);
      assertTrue(jSONObject1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(427, false);
      Class<JSON> class0 = JSON.class;
      JSONObject jSONObject1 = (JSONObject)jSONObject0.toJavaObject(class0);
      assertTrue(jSONObject1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      JSONObject.SecureObjectInputStream.ensureFields();
      JSONObject.SecureObjectInputStream jSONObject_SecureObjectInputStream0 = null;
      try {
        jSONObject_SecureObjectInputStream0 = new JSONObject.SecureObjectInputStream((ObjectInputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      JSONObject.SecureObjectInputStream.fields_error = true;
      JSONObject.SecureObjectInputStream.ensureFields();
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      JSONObject.SecureObjectInputStream.ensureFields();
      JSONObject.SecureObjectInputStream.ensureFields();
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(10, true);
      JSONObject jSONObject1 = (JSONObject)jSONObject0.clone();
      assertEquals(3089, JSON.DEFAULT_GENERATE_FEATURE);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = (JSONObject)jSONObject0.clone();
      assertTrue(jSONObject1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      String string0 = jSONObject0.getString(",(2C/IX!_^>{R<)>_G]");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Byte byte0 = new Byte((byte)0);
      jSONObject0.put("G#%T:7&f5Y^m", (Object) byte0);
      String string0 = jSONObject0.getString("G#%T:7&f5Y^m");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      double double0 = jSONObject0.getDoubleValue("mS");
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      float float0 = jSONObject0.getFloatValue(",G0z");
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Byte byte0 = new Byte((byte) (-3));
      jSONObject0.put("handles", (Object) byte0);
      float float0 = jSONObject0.getFloatValue("handles");
      assertEquals((-3.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      long long0 = jSONObject0.getLongValue("@type");
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Byte byte0 = new Byte((byte)38);
      jSONObject0.put("<1}b\"K^43-}J", (Object) byte0);
      long long0 = jSONObject0.getLongValue("<1}b\"K^43-}J");
      assertEquals(38L, long0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      int int0 = jSONObject0.getIntValue("QjW");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Byte byte0 = new Byte((byte) (-3));
      jSONObject0.put("handles", (Object) byte0);
      int int0 = jSONObject0.getIntValue("handles");
      assertEquals((-3), int0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      short short0 = jSONObject0.getShortValue("curContext");
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Byte byte0 = new Byte((byte) (-3));
      jSONObject0.put("handles", (Object) byte0);
      short short0 = jSONObject0.getShortValue("handles");
      assertEquals((short) (-3), short0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      byte byte0 = jSONObject0.getByteValue("java.lang.Byte@0000000006");
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Byte byte0 = new Byte((byte) (-3));
      jSONObject0.put("handles", (Object) byte0);
      byte byte1 = jSONObject0.getByteValue("handles");
      assertEquals((byte) (-3), byte1);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      boolean boolean0 = jSONObject0.getBooleanValue("J`60x>DTw<;#FjC3.}");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Byte byte0 = new Byte((byte) (-3));
      jSONObject0.put("handles", (Object) byte0);
      boolean boolean0 = jSONObject0.getBooleanValue("handles");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      byte[] byteArray0 = jSONObject0.getBytes("yyyy-MM-dd HH:mm:ss");
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.put("", (Object) "");
      byte[] byteArray0 = jSONObject0.getBytes("");
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Boolean boolean0 = jSONObject0.getBoolean("fastjson.parser.deny");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.put("equals", (Object) "equals");
      // Undeclared exception!
      try { 
        jSONObject0.getBoolean("equals");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to boolean, value : equals
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Short short0 = jSONObject0.getObject("1.2.68", (TypeReference) null);
      assertNull(short0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.put("", (Object) "");
      JSONArray jSONArray0 = jSONObject0.getJSONArray("");
      assertNull(jSONArray0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.put("", (Object) "");
      JSONObject jSONObject1 = jSONObject0.getJSONObject("");
      assertNull(jSONObject1);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.getJSONObject("1.2.68");
      assertNull(jSONObject1);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Float float0 = new Float((float) 10);
      Object object0 = jSONObject0.get(float0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.put("", (Object) "");
      // Undeclared exception!
      try { 
        jSONObject0.getFloatValue("");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.fluentPut("}+zp", "}+zp");
      boolean boolean0 = jSONObject1.containsValue("}+zp");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Double double0 = new Double(10);
      boolean boolean0 = jSONObject0.containsKey(double0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Byte byte0 = new Byte((byte) (-3));
      jSONObject0.put("handles", (Object) byte0);
      boolean boolean0 = jSONObject0.containsKey("handles");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      ParserConfig parserConfig0 = ParserConfig.global;
      Class<Object> class0 = Object.class;
      JSONObject jSONObject1 = (JSONObject)jSONObject0.toJavaObject(class0, parserConfig0, 989);
      assertEquals(3089, JSON.DEFAULT_GENERATE_FEATURE);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      boolean boolean0 = jSONObject0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(8232, true);
      JSONObject jSONObject1 = jSONObject0.fluentPut("org.springframework.security.core.userdetails.User", "org.springframework.security.core.userdetails.User");
      // Undeclared exception!
      try { 
        jSONObject1.getFloat("org.springframework.security.core.userdetails.User");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
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
  public void test082()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject(3);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      JSONObject jSONObject1 = jSONObject0.fluentPut((String) null, pipedInputStream0);
      // Undeclared exception!
      try { 
        jSONObject1.getByteValue((String) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to byte, value : java.io.PipedInputStream@5e243b96
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.clear();
      assertEquals(0, jSONObject0.size());
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Collection<Object> collection0 = jSONObject0.values();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      assertTrue(jSONObject0.isEmpty());
      
      jSONObject0.put("", (Object) "");
      boolean boolean0 = jSONObject0.isEmpty();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Timestamp timestamp0 = jSONObject0.getTimestamp("@type");
      assertNull(timestamp0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Date date0 = jSONObject0.getDate("@type");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Map<String, Object> map0 = jSONObject0.getInnerMap();
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Set<String> set0 = jSONObject0.keySet();
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Long long0 = jSONObject0.getLong(",G0z");
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Float float0 = jSONObject0.getFloat("<1}b\"K^43-}J");
      assertNull(float0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Integer integer0 = jSONObject0.getInteger("Br'!'lr$F%kA");
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Double double0 = jSONObject0.getDouble("1.2.68");
      assertNull(double0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      BigDecimal bigDecimal0 = jSONObject0.getBigDecimal("#m)M>Ak8!ni9f'B`Xu");
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      LinkedHashMap<String, String> linkedHashMap0 = new LinkedHashMap<String, String>();
      ConcurrentSkipListMap<String, Object> concurrentSkipListMap0 = new ConcurrentSkipListMap<String, Object>(linkedHashMap0);
      JSONObject jSONObject0 = new JSONObject(concurrentSkipListMap0);
      JSONObject jSONObject1 = jSONObject0.fluentRemove(concurrentSkipListMap0);
      assertEquals(0, jSONObject1.size());
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      java.sql.Date date0 = jSONObject0.getSqlDate("D");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.fluentClear();
      assertEquals(0, jSONObject1.size());
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      ConcurrentHashMap<String, Object> concurrentHashMap0 = new ConcurrentHashMap<String, Object>();
      JSONObject jSONObject0 = new JSONObject(concurrentHashMap0);
      ParameterizedTypeImpl parameterizedTypeImpl0 = (ParameterizedTypeImpl)TypeReference.LIST_STRING;
      // Undeclared exception!
      try { 
        jSONObject0.getObject((String) null, (Type) parameterizedTypeImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Byte byte0 = jSONObject0.getByte("0000-00-00 00:00:00.000000000");
      assertNull(byte0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Short short0 = jSONObject0.getShort((String) null);
      assertNull(short0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      ConcurrentSkipListMap<String, Double> concurrentSkipListMap0 = new ConcurrentSkipListMap<String, Double>();
      JSONObject jSONObject1 = jSONObject0.fluentPutAll(concurrentSkipListMap0);
      assertEquals(989, JSON.DEFAULT_PARSER_FEATURE);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
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
  public void test103()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      BigInteger bigInteger0 = jSONObject0.getBigInteger("4");
      assertNull(bigInteger0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Object object0 = jSONObject0.remove((Object) jSONObject0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = new JSONObject(0, false);
      JSONObject jSONObject2 = jSONObject0.fluentPut("0M3`{f}6", jSONObject1);
      boolean boolean0 = jSONObject0.containsValue(jSONObject2);
      assertFalse(boolean0);
  }
}
