/*
 * This file was automatically generated by EvoSuite
 * Fri May 22 03:54:50 GMT 2020
 */

package com.alibaba.fastjson;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.JSONReaderScanner;
import com.alibaba.fastjson.parser.JSONScanner;
import com.alibaba.fastjson.parser.ParserConfig;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSONReader_ESTest extends JSONReader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringReader stringReader0 = new StringReader("illegal state : ");
      Feature[] featureArray0 = new Feature[0];
      JSONReader jSONReader0 = new JSONReader(stringReader0, featureArray0);
      assertEquals(1, jSONReader0.peek());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("day", 0);
      ParserConfig parserConfig0 = ParserConfig.global;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0.matchStat, jSONReaderScanner0, parserConfig0);
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      jSONReader0.close();
      assertEquals(1, jSONReader0.peek());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSONScanner jSONScanner0 = new JSONScanner("", 1063);
      JSONReader jSONReader0 = new JSONReader(jSONScanner0);
      String string0 = jSONReader0.readString();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"x\":\"hello\",\"z\":true,\"a\":[],\"b\":{}}");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      JSONObject jSONObject0 = (JSONObject)jSONReader0.readObject();
      assertEquals(989, JSON.DEFAULT_PARSER_FEATURE);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[0] = ';';
      charArray0[1] = '0';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 13, (-555));
      ParserConfig parserConfig0 = ParserConfig.global;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0, parserConfig0);
      JSONReader jSONReader0 = new JSONReader(jSONReaderScanner0);
      Long long0 = jSONReader0.readLong();
      assertEquals(0L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringReader stringReader0 = new StringReader("99");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0);
      JSONReader jSONReader0 = new JSONReader(jSONReaderScanner0);
      Long long0 = jSONReader0.readLong();
      assertEquals(99L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringReader stringReader0 = new StringReader("false");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0, 1063);
      JSONReader jSONReader0 = new JSONReader(jSONReaderScanner0);
      Integer integer0 = jSONReader0.readInteger();
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSONReader jSONReader0 = new JSONReader((DefaultJSONParser) null);
      Locale locale0 = Locale.forLanguageTag("o23\"B(/O7Vzc.uF`");
      // Undeclared exception!
      try { 
        jSONReader0.setLocale(locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.JSONReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSONScanner jSONScanner0 = new JSONScanner("{\"fruit\":\"Apple\",\"size\":\"Lage,\"colo\":\"Red\",\"illegal state : \":true,\"value2\":99,\"number\":\"1\",\"x\":true}", 1316);
      JSONReader jSONReader0 = new JSONReader(jSONScanner0);
      // Undeclared exception!
      try { 
        jSONReader0.readString();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, position at 0, name size
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
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
  public void test10()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[]");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0);
      JSONReader jSONReader0 = new JSONReader(jSONReaderScanner0);
      ConcurrentHashMap<String, String> concurrentHashMap0 = new ConcurrentHashMap<String, String>();
      // Undeclared exception!
      try { 
        jSONReader0.readObject((Map) concurrentHashMap0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, expect {, actual [, 
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"fruit\":\"Apple\",\"size\":null,\"\":\"Red\",\"value\":true,\"\":false,\"number\":\"1\",\"x\":true,\"xx\":true}");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0);
      JSONReader jSONReader0 = new JSONReader(jSONReaderScanner0);
      ConcurrentHashMap<String, String> concurrentHashMap0 = new ConcurrentHashMap<String, String>();
      // Undeclared exception!
      try { 
        jSONReader0.readObject((Map) concurrentHashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ConcurrentHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"fruit\":\"Apple\",\"size\":\"Large\",\"\":\"Red\",\"value\":true,\"value2\":-99,\"number\":\"1\",\"x\":true,\"\":true}");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0);
      JSONReader jSONReader0 = new JSONReader(jSONReaderScanner0);
      ConcurrentHashMap<String, String> concurrentHashMap0 = new ConcurrentHashMap<String, String>();
      jSONReader0.readObject((Map) concurrentHashMap0);
      // Undeclared exception!
      try { 
        jSONReader0.readObject((Object) "{\"fruit\":\"Apple\",\"size\":\"Large\",\"\":\"Red\",\"value\":true,\"value2\":-99,\"number\":\"1\",\"x\":true,\"\":true}");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, expect {, actual EOF
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"fruit\":\"Apple\",\"size\":\"Large\",\"color\":\"Red\",\"value\":true,\"value2\":false,\"number\":\"1\",\"x\":true}");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0);
      JSONReader jSONReader0 = new JSONReader(jSONReaderScanner0);
      // Undeclared exception!
      try { 
        jSONReader0.readObject((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("false");
      JSONReader jSONReader0 = new JSONReader(jSONReaderScanner0);
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        jSONReader0.readObject(class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, expect {, actual false, pos 0, fastjson-version 1.2.68
         //
         verifyException("com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSONReader jSONReader0 = new JSONReader((DefaultJSONParser) null);
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        jSONReader0.readObject(class0);
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
      StringReader stringReader0 = new StringReader("{\"fruiF\":\"Apple\",\"size\":\"Large\",\"\":\"Red\",\"value\":true,\"value2\":false,\"wumber\":\"1A,\"x\":true,\"xx\":true}");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0);
      JSONReader jSONReader0 = new JSONReader(jSONReaderScanner0);
      // Undeclared exception!
      try { 
        jSONReader0.readObject();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, position at 68, name wumber
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSONScanner jSONScanner0 = new JSONScanner("false", 1063);
      JSONReader jSONReader0 = new JSONReader(jSONScanner0);
      // Undeclared exception!
      try { 
        jSONReader0.readLong();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to long, value : false
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
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
  public void test19()  throws Throwable  {
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
  public void test20()  throws Throwable  {
      JSONScanner jSONScanner0 = new JSONScanner("false", 1081);
      JSONReader jSONReader0 = new JSONReader(jSONScanner0);
      jSONReader0.readString();
      JSONReader jSONReader1 = null;
      try {
        jSONReader1 = new JSONReader(jSONScanner0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // EOF error
         //
         verifyException("com.alibaba.fastjson.parser.JSONLexerBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
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
  public void test22()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"fruit\":\"Apple\",\"size\":\"Large\",\"\":\"Red\",\"value\":true,\"value2\":-99,\"number\":\"1\",\"x\":true,\"\":true}");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0);
      JSONReader jSONReader0 = new JSONReader(jSONReaderScanner0);
      jSONReader0.readObject((Object) "{\"fruit\":\"Apple\",\"size\":\"Large\",\"\":\"Red\",\"value\":true,\"value2\":-99,\"number\":\"1\",\"x\":true,\"\":true}");
      assertEquals(20, jSONReader0.peek());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"\":\"a string\",\"context is null\":{\"\":null,\"xx\":null,\")Ljava/lang/Object;\":[],\"xxxx\":false}}");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      Class<Object> class0 = Object.class;
      Object object0 = jSONReader0.readObject(class0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PipedWriter pipedWriter0 = new PipedWriter();
      PipedReader pipedReader0 = new PipedReader(pipedWriter0);
      pipedWriter0.append((CharSequence) "EVrmiD(_d7");
      JSONReader jSONReader0 = new JSONReader(pipedReader0);
      // Undeclared exception!
      try { 
        jSONReader0.readObject((Type) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, 
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"\":-99,\"y\":7,\"context is null\":false,\"\":99}");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      jSONReader0.readString();
      // Undeclared exception!
      try { 
        jSONReader0.startObject();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, expect {, actual EOF
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSONScanner jSONScanner0 = new JSONScanner("", 1063);
      JSONReader jSONReader0 = new JSONReader(jSONScanner0);
      Long long0 = jSONReader0.readLong();
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      PipedWriter pipedWriter0 = new PipedWriter();
      PipedReader pipedReader0 = new PipedReader(pipedWriter0);
      pipedWriter0.append((CharSequence) "Sxw$I1P-iE>|");
      JSONReader jSONReader0 = new JSONReader(pipedReader0);
      // Undeclared exception!
      try { 
        jSONReader0.readInteger();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, 
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSONReader jSONReader0 = new JSONReader((DefaultJSONParser) null);
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
  public void test29()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"fruit\":\"\",\"andDecrement\":\"Large\",\"\":true,\"value\":true,\"value2\":-99,\"number\":\"1\",\"x\":true,\"xx\":false,\"xxx\":false}");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0);
      JSONReader jSONReader0 = new JSONReader(jSONReaderScanner0);
      // Undeclared exception!
      try { 
        jSONReader0.startArray();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, expect [, actual {
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"fruit\":\"Apple\",\"illegal state : \":-99,\"\":[],\"value\":true,\"illegal state : \":{},\"number\":\"1\",\"fied_ser\":true,\"xx\":true}");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0);
      JSONReader jSONReader0 = new JSONReader(jSONReaderScanner0);
      jSONReader0.startObject();
      boolean boolean0 = jSONReader0.hasNext();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"fruiF\":\"Apple\",\"size\":\"Large\",\"\":\"Red\",\"value\":true,\"value2\":false,\"wumber\":\"1A,\"x\":true,\"xx\":true}");
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
  public void test32()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"fruiF\":\"Apple\",\"size\":\"Large\",\"\":\"Red\",\"value\":true,\"value2\":false,\"wumber\":\"1A,\"x\":true,\"xx\":true}");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      Locale locale0 = jSONReader0.getLocal();
      assertEquals("", locale0.getISO3Country());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"fruiF\":\"Apple\",\"size\":\"Large\",\"\":\"Red\",\"value\":true,\"value2\":false,\"wumber\":\"1A,\"x\":true,\"xx\":true}");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      // Undeclared exception!
      try { 
        jSONReader0.readObject((TypeReference<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.JSONReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"fruit\":\"Apple\",\"size\":\"Large\",\"color\":\"Red\",\"illegal state : \":true,\"value2\":99,\"(L\":true}");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0);
      JSONReader jSONReader0 = new JSONReader(jSONReaderScanner0);
      TimeZone timeZone0 = jSONReader0.getTimzeZone();
      jSONReader0.setTimzeZone(timeZone0);
      assertEquals("GMT", timeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StringReader stringReader0 = new StringReader("}m+r-FORNzL6Hwg");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      Feature feature0 = Feature.UseObjectArray;
      jSONReader0.config(feature0, false);
      assertEquals(13, jSONReader0.peek());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JSONScanner jSONScanner0 = new JSONScanner("false", 1081);
      JSONReader jSONReader0 = new JSONReader(jSONScanner0);
      int int0 = jSONReader0.peek();
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JSONScanner jSONScanner0 = new JSONScanner("false", 1081);
      JSONReader jSONReader0 = new JSONReader(jSONScanner0);
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
  public void test38()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"fruit\":\"\",\"andDecrement\":\"Large\",\"\":true,\"value\":true,\"value2\":-99,\"number\":\"1\",\"x\":true,\"xx\":false,\"xxx\":false}");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0);
      JSONReader jSONReader0 = new JSONReader(jSONReaderScanner0);
      jSONReader0.setLocale((Locale) null);
      assertEquals(12, jSONReader0.peek());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"\":\"a string\",\"y\":\"a string\",\"context is null\":{\"\":null,\"xxx\":[[true]],\"com.alibaba.fastjson.JSONReader\":false},\"\":99}");
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

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"\":\"a string\",\"context is null\":{\"\":null,\"xx\":null,\")Ljava/lang/Object;\":[],\"xxxx\":false}}");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      // Undeclared exception!
      try { 
        jSONReader0.endArray();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, expect ], actual {
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }
}