/*
 * This file was automatically generated by EvoSuite
 * Thu May 21 23:50:00 GMT 2020
 */

package com.alibaba.fastjson;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.JSONReaderScanner;
import com.alibaba.fastjson.parser.JSONScanner;
import java.io.PipedReader;
import java.io.Reader;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.time.chrono.ChronoLocalDate;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSONReader_ESTest extends JSONReader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"\":99,\"\":[]}");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      jSONReader0.startObject();
      jSONReader0.readString();
      jSONReader0.readString();
      boolean boolean0 = jSONReader0.hasNext();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("{\"fruit\":\"Apple\",\"size\":\"Large\",\"color\":\"Red\",\"value\":[],\"value2\":false,\"number\":\"1\"}");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      Feature feature0 = Feature.DisableCircularReferenceDetect;
      jSONReader0.config(feature0, false);
      assertEquals(12, jSONReader0.peek());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"\":{},\"WRITE_MAP_NULL_FEATURES\":true,\"com.alibaba.fastjson.util.ServiceLoader\":true,\"illegal state : \":{\"illegal state : \":99},\"\":{}}");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      jSONReader0.startObject();
      jSONReader0.readString();
      jSONReader0.readObject((Object) stringReader0);
      assertEquals(16, jSONReader0.peek());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("{\"\":[{}],\"\":{\"x\":false,\"xx\":-99},\"x\":[],\"z\":true}");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      jSONReader0.readObject((Object) defaultJSONParser0.NONE);
      assertEquals(0, defaultJSONParser0.resolveStatus);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("{\"fruit\":\"Apple\",\"size\":\"Large\",\"color\":\"Red\",\"value\":[],\"value2\":false,\"number\":\"1\"}");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      ConcurrentHashMap<Object, String> concurrentHashMap0 = new ConcurrentHashMap<Object, String>();
      defaultJSONParser0.parseObject((Map) concurrentHashMap0, (Object) jSONReader0);
      jSONReader0.close();
      assertEquals(20, jSONReader0.peek());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      String string0 = jSONReader0.readString();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      char[] charArray0 = new char[0];
      JSONScanner jSONScanner0 = new JSONScanner(charArray0, 0);
      JSONReader jSONReader0 = new JSONReader(jSONScanner0);
      Object object0 = jSONReader0.readObject((Type) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("{\"x\":\"hello\",\"y\":7,\"z\":true,\"a\":[-99],\"b\":{}}");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      Class<String> class0 = String.class;
      String string0 = jSONReader0.readObject(class0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      Object object0 = jSONReader0.readObject();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"\":-99,\"can not cast oracle.sql.TIMESTAMP to Date\":{\"\":99,\"can not cast oracle.sql.TIMESTAMP to Date\":null,\"com.alibaba.fastjson.JSONPath\":\"a string\"}}");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      jSONReader0.startObject();
      jSONReader0.readObject();
      Long long0 = jSONReader0.readLong();
      assertEquals((-99L), (long)long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringReader stringReader0 = new StringReader("false");
      Feature[] featureArray0 = new Feature[0];
      JSONReader jSONReader0 = new JSONReader(stringReader0, featureArray0);
      Integer integer0 = jSONReader0.readInteger();
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("true");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      Integer integer0 = jSONReader0.readInteger();
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("-99");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      Integer integer0 = jSONReader0.readInteger();
      assertEquals((-99), (int)integer0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSONReader jSONReader0 = new JSONReader((DefaultJSONParser) null);
      // Undeclared exception!
      try { 
        jSONReader0.startObject();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.JSONReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSONReader jSONReader0 = new JSONReader((DefaultJSONParser) null);
      // Undeclared exception!
      try { 
        jSONReader0.startArray();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.JSONReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSONReader jSONReader0 = new JSONReader((DefaultJSONParser) null);
      // Undeclared exception!
      try { 
        jSONReader0.readString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.JSONReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("[{}]");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      ConcurrentHashMap<Object, Object> concurrentHashMap0 = new ConcurrentHashMap<Object, Object>();
      // Undeclared exception!
      try { 
        jSONReader0.readObject((Map) concurrentHashMap0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, expect {, actual [, pos 1, line 1, column 2[{}]
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSONReader jSONReader0 = new JSONReader((DefaultJSONParser) null);
      TreeMap<String, ChronoLocalDate> treeMap0 = new TreeMap<String, ChronoLocalDate>();
      // Undeclared exception!
      try { 
        jSONReader0.readObject((Map) treeMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.JSONReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("\"a string\"");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        jSONReader0.readObject((Type) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, expect {, actual string, pos 0, fastjson-version 1.2.68
         //
         verifyException("com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Locale locale0 = Locale.CHINA;
      JSONReader jSONReader0 = new JSONReader((DefaultJSONParser) null);
      // Undeclared exception!
      try { 
        jSONReader0.readObject((Object) locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.JSONReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("\"a string\"");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        jSONReader0.readObject(class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, expect {, actual string, pos 0, fastjson-version 1.2.68
         //
         verifyException("com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"\":0.0}");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      jSONReader0.readString();
      // Undeclared exception!
      try { 
        jSONReader0.readObject();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unterminated json string, 
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSONReader jSONReader0 = new JSONReader((DefaultJSONParser) null);
      // Undeclared exception!
      try { 
        jSONReader0.readObject();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.JSONReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("{\"\":true,\"b\":\"a string\",\"\":[\"a string\"]}");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      // Undeclared exception!
      try { 
        jSONReader0.readLong();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // create asm serializer error, verson 1.2.68, class byte
         //
         verifyException("com.alibaba.fastjson.serializer.SerializeConfig", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JSONReader jSONReader0 = new JSONReader((DefaultJSONParser) null);
      // Undeclared exception!
      try { 
        jSONReader0.readLong();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.JSONReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("{\"\":[\"a string\"],\"\":-99}");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      // Undeclared exception!
      try { 
        jSONReader0.readInteger();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to int, value : {\"\":{}}
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSONReader jSONReader0 = new JSONReader((DefaultJSONParser) null);
      // Undeclared exception!
      try { 
        jSONReader0.readInteger();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.JSONReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JSONReader jSONReader0 = new JSONReader((DefaultJSONParser) null);
      // Undeclared exception!
      try { 
        jSONReader0.getTimzeZone();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.JSONReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSONReader jSONReader0 = new JSONReader((DefaultJSONParser) null);
      // Undeclared exception!
      try { 
        jSONReader0.getLocal();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.JSONReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JSONReader jSONReader0 = new JSONReader((DefaultJSONParser) null);
      // Undeclared exception!
      try { 
        jSONReader0.endObject();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.JSONReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StringReader stringReader0 = new StringReader("7MDy;IglWP9 yeP(Do&");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      // Undeclared exception!
      try { 
        jSONReader0.endArray();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, expect ], actual int
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JSONReader jSONReader0 = new JSONReader((DefaultJSONParser) null);
      // Undeclared exception!
      try { 
        jSONReader0.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.JSONReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      Feature[] featureArray0 = new Feature[1];
      JSONReader jSONReader0 = null;
      try {
        jSONReader0 = new JSONReader(pipedReader0, featureArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Pipe not connected
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      JSONReader jSONReader0 = null;
      try {
        jSONReader0 = new JSONReader(pipedReader0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Pipe not connected
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JSONReader jSONReader0 = null;
      try {
        jSONReader0 = new JSONReader((Reader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      char[] charArray0 = new char[8];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 1);
      JSONReader jSONReader0 = new JSONReader(jSONReaderScanner0);
      JSONReader jSONReader1 = null;
      try {
        jSONReader1 = new JSONReader(jSONReaderScanner0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // EOF error
         //
         verifyException("com.alibaba.fastjson.parser.JSONLexerBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JSONReader jSONReader0 = null;
      try {
        jSONReader0 = new JSONReader((JSONLexer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JSONReader jSONReader0 = new JSONReader((DefaultJSONParser) null);
      Feature feature0 = Feature.DisableASM;
      // Undeclared exception!
      try { 
        jSONReader0.config(feature0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.JSONReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JSONReader jSONReader0 = new JSONReader((DefaultJSONParser) null);
      // Undeclared exception!
      try { 
        jSONReader0.endArray();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.JSONReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"x\":\"hello\",\"y\":true,\"z\":true,\"a\":[],\"\":{\"x\":null}}");
      Feature[] featureArray0 = new Feature[3];
      Feature feature0 = Feature.UseObjectArray;
      featureArray0[0] = feature0;
      featureArray0[1] = feature0;
      featureArray0[2] = featureArray0[0];
      JSONReader jSONReader0 = new JSONReader(stringReader0, featureArray0);
      // Undeclared exception!
      try { 
        jSONReader0.readObject((Map) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"\":[\"a string\",[]]}");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      jSONReader0.startObject();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      HashMap hashMap1 = (HashMap)jSONReader0.readObject((Map) hashMap0);
      assertTrue(hashMap1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"\":{},\"\":-99}");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      jSONReader0.startObject();
      jSONReader0.readString();
      jSONReader0.readString();
      Object object0 = jSONReader0.readObject();
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("\"a string\"");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0.lexer);
      // Undeclared exception!
      jSONReader0.readObject((Object) defaultJSONParser0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"\":{},\"WRITE_MAP_NULL_FEATURES\":true,\"com.alibaba.fastjson.util.ServiceLoader\":true,\"illegal state : \":{\"illegal state : \":99},\"\":{}}");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      jSONReader0.startObject();
      // Undeclared exception!
      try { 
        jSONReader0.readObject((Object) stringReader0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, expect {, actual string
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JSONScanner jSONScanner0 = new JSONScanner("");
      JSONReader jSONReader0 = new JSONReader(jSONScanner0);
      Class<Object> class0 = Object.class;
      Object object0 = jSONReader0.readObject(class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"\":{},\"WRITE_MAP_NULL_FEATURES\":true,\"a\":true,\"\":\"a string\"}");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      jSONReader0.startObject();
      Class<String> class0 = String.class;
      String string0 = jSONReader0.readObject(class0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JSONReader jSONReader0 = new JSONReader((DefaultJSONParser) null);
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        jSONReader0.readObject((Type) class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.JSONReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"\":true}");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      jSONReader0.startObject();
      String string0 = jSONReader0.readObject((Type) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{pD}");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      // Undeclared exception!
      try { 
        jSONReader0.readString();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // expect ':' at 0, actual }
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      Long long0 = jSONReader0.readLong();
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("\"a string\"");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      // Undeclared exception!
      try { 
        jSONReader0.readInteger();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"a string\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"\":[\"a string\",[]]}");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      jSONReader0.startObject();
      jSONReader0.readString();
      jSONReader0.readString();
      boolean boolean0 = jSONReader0.hasNext();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"\":[\"a string\",[]]}");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      jSONReader0.startObject();
      jSONReader0.readString();
      // Undeclared exception!
      try { 
        jSONReader0.hasNext();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // illegal state : 1002
         //
         verifyException("com.alibaba.fastjson.JSONReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"\":[\"a string\",[]]}");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      jSONReader0.startObject();
      boolean boolean0 = jSONReader0.hasNext();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{pD}");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      jSONReader0.startObject();
      jSONReader0.readString();
      jSONReader0.endObject();
      // Undeclared exception!
      try { 
        jSONReader0.hasNext();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // context is null
         //
         verifyException("com.alibaba.fastjson.JSONReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"illegal state : \":-99,\"\":[],\"context is null\":null}");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      jSONReader0.startObject();
      jSONReader0.readString();
      jSONReader0.readObject();
      jSONReader0.readInteger();
      jSONReader0.startArray();
      // Undeclared exception!
      try { 
        jSONReader0.startArray();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, expect [, actual ]
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"illegal state : \":-99,\"xx\":true}");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      jSONReader0.startObject();
      jSONReader0.readString();
      jSONReader0.readObject();
      // Undeclared exception!
      try { 
        jSONReader0.startArray();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, expect [, actual string
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"illegal state : \":-99,\"\":[],\"context is null\":null}");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      jSONReader0.startObject();
      // Undeclared exception!
      try { 
        jSONReader0.startArray();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, expect [, actual string
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"\":{},\"WRITE_MAP_NULL_FEATURES\":-99,\"\":true,\"xx\":true}");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      jSONReader0.startObject();
      // Undeclared exception!
      try { 
        jSONReader0.startObject();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, expect {, actual string
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"z\":true,\"b\":{\"x\":null},\"a\":[],\"y\":7,\"x\":\"\"}");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      // Undeclared exception!
      try { 
        jSONReader0.readObject((TypeReference<Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.JSONReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("\"a string\"");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      TimeZone timeZone0 = jSONReader0.getTimzeZone();
      jSONReader0.setTimzeZone(timeZone0);
      assertEquals("GMT", timeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      JSONReader jSONReader0 = new JSONReader((DefaultJSONParser) null);
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(5, "|");
      // Undeclared exception!
      try { 
        jSONReader0.setTimzeZone(simpleTimeZone0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.JSONReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"\":-99,\"size\":false,\"{\":{},\"kotlin.ranges.IntRange\":\"a string\",\"value not found in path \":[],\"write gzipBytes error\":[],\"\":-99}");
      Feature[] featureArray0 = new Feature[5];
      JSONReader jSONReader0 = null;
      try {
        jSONReader0 = new JSONReader(stringReader0, featureArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.parser.Feature", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("{\"\":-99,\"\":\"a string\",\"com.alibaba.fastjson.parser.deserializer.StackTraceElementDeserializer\":-99,\"x\":-99}");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      int int0 = jSONReader0.peek();
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{pD}");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      // Undeclared exception!
      try { 
        jSONReader0.endObject();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, expect }, actual {
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"fruit\":\"Apple\",\"\":\"Large\",\"color\":[],\"value\":\"a string\",\"value2\":false,\"number\":\"1\"}");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      Locale locale0 = jSONReader0.getLocal();
      jSONReader0.setLocale(locale0);
      assertEquals(12, jSONReader0.peek());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{pD}");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      // Undeclared exception!
      try { 
        jSONReader0.close();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // not close json text, token : {
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }
}
