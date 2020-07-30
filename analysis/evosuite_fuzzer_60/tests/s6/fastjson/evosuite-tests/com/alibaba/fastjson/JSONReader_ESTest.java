/*
 * This file was automatically generated by EvoSuite
 * Fri May 22 08:58:25 GMT 2020
 */

package com.alibaba.fastjson;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONReaderScanner;
import com.alibaba.fastjson.parser.JSONScanner;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.JavaBeanSerializer;
import java.io.StringReader;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentSkipListMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSONReader_ESTest extends JSONReader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"fruit\":\"Apple\",\"size\":\"Large\",\"color\":\"Red\",\"value\":true,\"value2\":false,\"number\":\"1\",\"x\":\"a string\"}");
      Feature[] featureArray0 = new Feature[5];
      Feature feature0 = Feature.SafeMode;
      featureArray0[0] = feature0;
      featureArray0[1] = feature0;
      featureArray0[2] = featureArray0[0];
      featureArray0[3] = feature0;
      featureArray0[4] = featureArray0[2];
      JSONReader jSONReader0 = new JSONReader(stringReader0, featureArray0);
      assertEquals(12, jSONReader0.peek());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("{\"fruit\":\"Apple\",\"size\":\"Large\",\"color\":\"Red\",\"value\":true,\"value2\":false,\"number\":\"1\",\"x\":true}", 1243);
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ParserConfig parserConfig0 = new ParserConfig(classLoader0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0, parserConfig0);
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      TreeMap<String, Integer> treeMap0 = new TreeMap<String, Integer>();
      TreeMap treeMap1 = (TreeMap)jSONReader0.readObject((Map) treeMap0);
      assertEquals(7, treeMap1.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("true");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      // Undeclared exception!
      try { 
        jSONReader0.startObject();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, expect {, actual true
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
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
  public void test04()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("com.alibaba.fastjson.JSONReader");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      // Undeclared exception!
      try { 
        jSONReader0.readObject((Map) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, expect {, actual error, pos 1, line 1, column 2com.alibaba.fastjson.JSONReader
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("true");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Class<?> class0 = classLoader0.loadClass("com.alibaba.fastjson.serializer.JSONSerializer");
      // Undeclared exception!
      try { 
        jSONReader0.readObject((Type) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error,except start with { or [,but actually start with true
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
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
  public void test07()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("{\"fruit\":\"Apple\",\"context is null\":{},\"color\":\"context is null\",\"value\":false,\"value2\":false,\"x\":null}");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      ConcurrentSkipListMap<Method, Object> concurrentSkipListMap0 = new ConcurrentSkipListMap<Method, Object>();
      // Undeclared exception!
      try { 
        jSONReader0.readObject((Map) concurrentSkipListMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ConcurrentSkipListMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("true");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      Object object0 = jSONReader0.readObject();
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("true");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0.lexer);
      Class<Annotation> class0 = Annotation.class;
      // Undeclared exception!
      try { 
        jSONReader0.readObject(class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error,except start with { or [,but actually start with EOF
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      char[] charArray0 = new char[5];
      JSONScanner jSONScanner0 = new JSONScanner(charArray0, 0);
      JSONReader jSONReader0 = new JSONReader(jSONScanner0);
      Class<Object> class0 = Object.class;
      JavaBeanSerializer javaBeanSerializer0 = new JavaBeanSerializer(class0);
      Class<?> class1 = javaBeanSerializer0.getType();
      Object object0 = jSONReader0.readObject((Type) class1);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("true");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      // Undeclared exception!
      try { 
        jSONReader0.readLong();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to long, value : true
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSONScanner jSONScanner0 = new JSONScanner("{}");
      ParserConfig parserConfig0 = new ParserConfig(false);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONScanner0, parserConfig0);
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
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
  public void test13()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("true");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      // Undeclared exception!
      try { 
        jSONReader0.startArray();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, expect [, actual true
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSONScanner jSONScanner0 = new JSONScanner("{\"\":[]}");
      ParserConfig parserConfig0 = new ParserConfig(false);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONScanner0, parserConfig0);
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      jSONReader0.startObject();
      boolean boolean0 = jSONReader0.hasNext();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"fruit\":\"Apple\",\"checkValue\":\"Large\",\"color\":\"null\",\"value\":{},\"value2\":null,\"number\":\"1\",\"x\":true}");
      Feature[] featureArray0 = new Feature[7];
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
  public void test16()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"context is null\":1004}");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      // Undeclared exception!
      try { 
        jSONReader0.readInteger();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to int, value : {\"context is null\":{}}
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 0, 0);
      JSONReader jSONReader0 = new JSONReader(jSONReaderScanner0);
      TimeZone timeZone0 = jSONReader0.getTimzeZone();
      assertEquals("GMT", timeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("false");
      JSONReader jSONReader0 = new JSONReader(jSONReaderScanner0);
      TimeZone timeZone0 = jSONReaderScanner0.getTimeZone();
      jSONReader0.setTimzeZone(timeZone0);
      assertEquals(7, jSONReader0.peek());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("{\"fruit\":\"Apple\",\"size\":\"Large\",\"color\":\"Red\",\"value\":true,\"value2\":false,\"number\":\"1\",\"x\":true}", 1243);
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ParserConfig parserConfig0 = new ParserConfig(classLoader0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0, parserConfig0);
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      Feature feature0 = Feature.UseObjectArray;
      jSONReader0.config(feature0, false);
      assertEquals(1243, jSONReaderScanner0.getFeatures());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("false");
      JSONReader jSONReader0 = new JSONReader(jSONReaderScanner0);
      int int0 = jSONReader0.peek();
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("false");
      JSONReader jSONReader0 = new JSONReader(jSONReaderScanner0);
      // Undeclared exception!
      try { 
        jSONReader0.endObject();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, expect }, actual false
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSONScanner jSONScanner0 = new JSONScanner("{\"\":[]}");
      ParserConfig parserConfig0 = new ParserConfig(false);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONScanner0, parserConfig0);
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      jSONReader0.setLocale((Locale) null);
      assertEquals(12, jSONReader0.peek());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("{\"context is null\":1004}");
      JSONReader jSONReader0 = new JSONReader(jSONReaderScanner0);
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

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("com.alibaba.fastjson.JSONReader");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      // Undeclared exception!
      try { 
        jSONReader0.endArray();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, expect ], actual error
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }
}
