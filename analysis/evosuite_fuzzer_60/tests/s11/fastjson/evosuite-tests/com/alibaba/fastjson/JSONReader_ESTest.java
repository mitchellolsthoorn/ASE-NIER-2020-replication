/*
 * This file was automatically generated by EvoSuite
 * Fri May 22 10:01:43 GMT 2020
 */

package com.alibaba.fastjson;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONReaderScanner;
import com.alibaba.fastjson.parser.JSONScanner;
import com.alibaba.fastjson.parser.ParserConfig;
import java.io.PipedReader;
import java.io.Reader;
import java.io.StringReader;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
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
      StringReader stringReader0 = new StringReader("kMQ");
      Feature[] featureArray0 = new Feature[3];
      Feature feature0 = Feature.NonStringKeyAsString;
      featureArray0[0] = feature0;
      featureArray0[1] = featureArray0[0];
      featureArray0[2] = featureArray0[0];
      JSONReader jSONReader0 = new JSONReader(stringReader0, featureArray0);
      assertEquals(1, jSONReader0.peek());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringReader stringReader0 = new StringReader("kMQ");
      Feature[] featureArray0 = new Feature[3];
      Feature feature0 = Feature.NonStringKeyAsString;
      featureArray0[0] = feature0;
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
  public void test02()  throws Throwable  {
      JSONScanner jSONScanner0 = new JSONScanner("{\"fruit\":\"com.alibaba.fastjson.JSONReader\",\"color\":true,\"value\":99,\"value2\":false,\"number\":false}", 5864);
      JSONReader jSONReader0 = new JSONReader(jSONScanner0);
      jSONReader0.close();
      assertEquals(12, jSONReader0.peek());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("{\"\":-99,\"color\":true,\"value2\":{},\"\":\"1\",\"x\":true}", parserConfig0);
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      jSONReader0.startObject();
      jSONReader0.readLong();
      jSONReader0.readString();
      Class<Object> class0 = Object.class;
      Object object0 = jSONReader0.readObject(class0);
      assertEquals("color", object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"\":true,\"\":99,\"size\":99}");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      JSONObject jSONObject0 = (JSONObject)jSONReader0.readObject();
      assertEquals(989, JSON.DEFAULT_PARSER_FEATURE);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ParserConfig parserConfig0 = new ParserConfig((ClassLoader) null);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("H5%:9qwVWs<", parserConfig0, (-1));
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0.lexer);
      Integer integer0 = jSONReader0.readInteger();
      assertEquals(5, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("(I)C", 1001);
      JSONReader jSONReader0 = new JSONReader(jSONReaderScanner0);
      // Undeclared exception!
      try { 
        jSONReader0.startObject();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, expect {, actual (
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
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
  public void test08()  throws Throwable  {
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
  public void test09()  throws Throwable  {
      JSONScanner jSONScanner0 = new JSONScanner(",G'M", (-598));
      JSONReader jSONReader0 = new JSONReader(jSONScanner0);
      // Undeclared exception!
      try { 
        jSONReader0.readString();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, pos 1, line 1, column 2,G'M
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSONScanner jSONScanner0 = new JSONScanner("{\"\":\"Apple\",\"size\":[],\"color\":\"Red\",\"value\":99,\"value2\":false,\"number\":\"1\",\"x\":false}", 5864);
      JSONReader jSONReader0 = new JSONReader(jSONScanner0);
      jSONReader0.readString();
      TreeMap<Object, Integer> treeMap0 = new TreeMap<Object, Integer>();
      // Undeclared exception!
      try { 
        jSONReader0.readObject((Map) treeMap0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, expect {, actual EOF, pos 85, line 1, column 86{\"\":\"Apple\",\"size\":[],\"color\":\"Red\",\"value\":99,\"value2\":false,\"number\":\"1\",\"x\":false}
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSONScanner jSONScanner0 = new JSONScanner("java.nio.ByteBuffer", 110);
      JSONReader jSONReader0 = new JSONReader(jSONScanner0);
      // Undeclared exception!
      try { 
        jSONReader0.readObject((Object) "java.nio.ByteBuffer");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, expect {, actual error
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
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
  public void test13()  throws Throwable  {
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
  public void test14()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader(121);
      JSONReader jSONReader0 = null;
      try {
        jSONReader0 = new JSONReader(pipedReader0, (Feature[]) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Pipe not connected
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
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
  public void test16()  throws Throwable  {
      JSONScanner jSONScanner0 = new JSONScanner("");
      JSONReader jSONReader0 = new JSONReader(jSONScanner0);
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
  public void test17()  throws Throwable  {
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("{\"\":\"1\",\"\":true,\"value2\":{},\"x\":\"a string\"}", parserConfig0);
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      jSONReader0.startObject();
      jSONReader0.readLong();
      jSONReader0.readLong();
      Properties properties0 = new Properties();
      jSONReader0.readObject((Map) properties0);
      assertEquals(17, jSONReader0.peek());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("{\"x\":\"\",\"\":null,\"illegal state : \":99,\"b\":false}");
      JSONReader jSONReader0 = new JSONReader(jSONReaderScanner0);
      ConcurrentHashMap<Integer, Integer> concurrentHashMap0 = new ConcurrentHashMap<Integer, Integer>();
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
  public void test19()  throws Throwable  {
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("{\"\":\"1\",\"\":true,\"value2\":{},\"x\":\"a string\"}", parserConfig0);
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      jSONReader0.startObject();
      Properties properties0 = new Properties();
      Properties properties1 = (Properties)jSONReader0.readObject((Map) properties0);
      assertTrue(properties1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ParserConfig parserConfig0 = new ParserConfig((ClassLoader) null);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("H5%:9qwVWs<", parserConfig0, (-1));
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      // Undeclared exception!
      try { 
        jSONReader0.readObject();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, pos 2, line 1, column 3H5%:9qwVWs<
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JSONScanner jSONScanner0 = new JSONScanner("{\"\":{},\"\":99,\"size\":\"Large\",\"x\":false,\"xx\":-99}");
      JSONReader jSONReader0 = new JSONReader(jSONScanner0);
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
  public void test22()  throws Throwable  {
      JSONScanner jSONScanner0 = new JSONScanner("{\"error parse false\":Infinity}");
      JSONReader jSONReader0 = new JSONReader(jSONScanner0);
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        jSONReader0.readObject(class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, pos 22, line 1, column 23{\"error parse false\":Infinity}
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("{\"z\":{},\"a\":null,\"\":7,\"b\":99,\"\":\"\"}");
      JSONReader jSONReader0 = new JSONReader(jSONReaderScanner0);
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
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(" |_T", 0);
      JSONReader jSONReader0 = new JSONReader(jSONReaderScanner0);
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
  public void test25()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("true", 0);
      JSONReader jSONReader0 = new JSONReader(jSONReaderScanner0);
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
  public void test26()  throws Throwable  {
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("{\"\":-99,\"\":true,\"value2\":{\"\":[]}}", parserConfig0);
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      jSONReader0.startObject();
      jSONReader0.readLong();
      jSONReader0.readLong();
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
  public void test27()  throws Throwable  {
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("{\"\":-99,\"\":true,\"value2\":{\"\":[]}}", parserConfig0);
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      jSONReader0.startObject();
      jSONReader0.readLong();
      // Undeclared exception!
      try { 
        jSONReader0.startArray();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, expect [, actual int
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("{\"\":-99,\"\":true,\"value2\":{\"\":[]}}", parserConfig0);
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
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
  public void test29()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"\":null,\"\":99}");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      Locale locale0 = jSONReader0.getLocal();
      assertEquals("", locale0.getVariant());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("true", 0);
      JSONReader jSONReader0 = new JSONReader(jSONReaderScanner0);
      TimeZone timeZone0 = jSONReader0.getTimzeZone();
      assertEquals("GMT", timeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JSONScanner jSONScanner0 = new JSONScanner("{\"\":\"1\",\"size\":[],\"\":\"Red\",\"value\":99,\"value2\":\"a string\",\"x\":{},\"xx\":null}", 5864);
      JSONReader jSONReader0 = new JSONReader(jSONScanner0);
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-2332), "");
      jSONReader0.setTimzeZone(simpleTimeZone0);
      assertFalse(simpleTimeZone0.useDaylightTime());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("{\"x\":\"\",\"\":7,\"z\":99,\"\":null,\"b\":99}");
      JSONReader jSONReader0 = new JSONReader(jSONReaderScanner0);
      int int0 = jSONReader0.peek();
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
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
  public void test34()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("{\"x\":\"hello\",\"y\":7,\"\":[],\"a\":[],\"b\":{\"x\":-99}}");
      JSONReader jSONReader0 = new JSONReader(jSONReaderScanner0);
      Locale locale0 = Locale.US;
      jSONReader0.setLocale(locale0);
      assertEquals("USA", locale0.getISO3Country());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JSONScanner jSONScanner0 = new JSONScanner("X\"\":true\"colr\":99,\"size\":\"Large\",\"x\":false,\"\":{}}");
      JSONReader jSONReader0 = new JSONReader(jSONScanner0);
      // Undeclared exception!
      try { 
        jSONReader0.close();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // not close json text, token : error
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JSONScanner jSONScanner0 = new JSONScanner("{\"\":true,\"color\":99,\"size\":\"Large\",\"x\":false,\"\":{}}");
      JSONReader jSONReader0 = new JSONReader(jSONScanner0);
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
