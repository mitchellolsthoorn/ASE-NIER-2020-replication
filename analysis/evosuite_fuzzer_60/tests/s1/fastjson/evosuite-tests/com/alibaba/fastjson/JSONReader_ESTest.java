/*
 * This file was automatically generated by EvoSuite
 * Fri May 22 07:40:33 GMT 2020
 */

package com.alibaba.fastjson;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.JSONReaderScanner;
import com.alibaba.fastjson.parser.JSONScanner;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory;
import java.io.PipedReader;
import java.io.StringReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.HashMap;
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
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ASMDeserializerFactory aSMDeserializerFactory0 = new ASMDeserializerFactory(classLoader0);
      ParserConfig parserConfig0 = new ParserConfig(aSMDeserializerFactory0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("{\"fruit\":true,\"size\":\"Large\",\"\":\"Red\",\"value\":true,\"value2\":false,\"number\":\"1\",\"x\":true}", parserConfig0);
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      jSONReader0.startObject();
      assertEquals(4, jSONReader0.peek());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      jSONReader0.setTimzeZone((TimeZone) null);
      assertEquals(20, jSONReader0.peek());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"fruit\":\"Apple\",\"size\":\"Large\",\"color\":false,\"value\":true,\"value2\":false,\"number\":\"1\"}");
      Feature[] featureArray0 = new Feature[8];
      Feature feature0 = Feature.AllowComment;
      featureArray0[0] = feature0;
      featureArray0[1] = featureArray0[0];
      featureArray0[2] = featureArray0[0];
      featureArray0[3] = featureArray0[0];
      featureArray0[4] = featureArray0[0];
      featureArray0[5] = featureArray0[4];
      featureArray0[6] = feature0;
      featureArray0[7] = featureArray0[2];
      JSONReader jSONReader0 = new JSONReader(stringReader0, featureArray0);
      String string0 = jSONReader0.readString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      Class<Object> class0 = Object.class;
      Object object0 = jSONReader0.readObject(class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"fruit\":\"Apple\",\"\":[],\"color\":false,\"value\":true,\"value2\":\"a string\",\"number\":\"1\"}");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0, (-572));
      JSONReader jSONReader0 = new JSONReader(jSONReaderScanner0);
      Class<Object> class0 = Object.class;
      Object object0 = jSONReader0.readObject(class0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("", parserConfig0);
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      Object object0 = jSONReader0.readObject();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"a\":99,\"\":7,\"\":\"hello\",\"illegal state : \":true,\"b\":{}}");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      JSONObject jSONObject0 = (JSONObject)jSONReader0.readObject();
      assertEquals(3089, JSON.DEFAULT_GENERATE_FEATURE);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("true");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      Integer integer0 = jSONReader0.readInteger();
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("", parserConfig0);
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      Integer integer0 = jSONReader0.readInteger();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
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
  public void test10()  throws Throwable  {
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
  public void test11()  throws Throwable  {
      JSONReader jSONReader0 = new JSONReader((DefaultJSONParser) null);
      // Undeclared exception!
      try { 
        jSONReader0.setLocale((Locale) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.JSONReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSONScanner jSONScanner0 = new JSONScanner("u|Ke");
      JSONReader jSONReader0 = new JSONReader(jSONScanner0);
      // Undeclared exception!
      try { 
        jSONReader0.readString();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, pos 1, line 1, column 2u|Ke
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
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
  public void test14()  throws Throwable  {
      JSONScanner jSONScanner0 = new JSONScanner("illegal state : ");
      ConcurrentSkipListMap<Field, String> concurrentSkipListMap0 = new ConcurrentSkipListMap<Field, String>();
      JSONReader jSONReader0 = new JSONReader(jSONScanner0);
      // Undeclared exception!
      try { 
        jSONReader0.readObject((Map) concurrentSkipListMap0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, expect {, actual error, pos 1, line 1, column 2illegal state : 
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSONReader jSONReader0 = new JSONReader((DefaultJSONParser) null);
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      // Undeclared exception!
      try { 
        jSONReader0.readObject((Map) hashMap0);
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
      StringReader stringReader0 = new StringReader("=nM#^7SR$P&5F&");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
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
  public void test17()  throws Throwable  {
      JSONReader jSONReader0 = new JSONReader((DefaultJSONParser) null);
      // Undeclared exception!
      try { 
        jSONReader0.readObject((Type) null);
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
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("true");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      // Undeclared exception!
      jSONReader0.readObject((Object) defaultJSONParser0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSONReader jSONReader0 = new JSONReader((DefaultJSONParser) null);
      // Undeclared exception!
      try { 
        jSONReader0.readObject((Object) null);
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
      JSONReader jSONReader0 = new JSONReader((DefaultJSONParser) null);
      Class<Integer> class0 = Integer.class;
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
  public void test21()  throws Throwable  {
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
  public void test22()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(";Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/Object;I[I)Ljava/lang/Object;");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      // Undeclared exception!
      try { 
        jSONReader0.readLong();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, pos 1, line 1, column 2;Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/Object;I[I)Ljava/lang/Object;
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
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
  public void test24()  throws Throwable  {
      JSONScanner jSONScanner0 = new JSONScanner("-X-K(8#'GH");
      JSONReader jSONReader0 = new JSONReader(jSONScanner0);
      // Undeclared exception!
      try { 
        jSONReader0.readInteger();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // -
         //
         verifyException("com.alibaba.fastjson.parser.JSONLexerBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
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
  public void test26()  throws Throwable  {
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
  public void test27()  throws Throwable  {
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
  public void test28()  throws Throwable  {
      JSONScanner jSONScanner0 = new JSONScanner("ilgSlegal /tate : ");
      JSONReader jSONReader0 = new JSONReader(jSONScanner0);
      // Undeclared exception!
      try { 
        jSONReader0.endObject();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, expect }, actual error
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
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
  public void test30()  throws Throwable  {
      JSONReader jSONReader0 = new JSONReader((DefaultJSONParser) null);
      Feature feature0 = Feature.SupportAutoType;
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
  public void test31()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"\":\"hello\",\"y\":7,\"z\":true,\"a\":[],\"b\":{},\"xx\":{}}");
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
  public void test32()  throws Throwable  {
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
  public void test33()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
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
  public void test34()  throws Throwable  {
      StringReader stringReader0 = new StringReader("u|e");
      JSONReader jSONReader0 = null;
      try {
        jSONReader0 = new JSONReader(stringReader0, (Feature[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.JSONReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
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
  public void test36()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = 't';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 1066);
      JSONReader jSONReader0 = null;
      try {
        jSONReader0 = new JSONReader(jSONReaderScanner0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parse true
         //
         verifyException("com.alibaba.fastjson.parser.JSONLexerBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
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
  public void test38()  throws Throwable  {
      char[] charArray0 = new char[7];
      ParserConfig parserConfig0 = ParserConfig.global;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(charArray0, 0, parserConfig0, 2063);
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      Feature feature0 = Feature.ErrorOnEnumNotMatch;
      jSONReader0.config(feature0, false);
      assertEquals(20, jSONReader0.peek());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JSONScanner jSONScanner0 = new JSONScanner("}S=d^", 4);
      TreeMap<Method, String> treeMap0 = new TreeMap<Method, String>();
      ParserConfig parserConfig0 = new ParserConfig((ASMDeserializerFactory) null);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONScanner0, parserConfig0);
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      TreeMap treeMap1 = (TreeMap)jSONReader0.readObject((Map) treeMap0);
      assertEquals(0, treeMap1.size());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      StringReader stringReader0 = new StringReader("=nM#^7SR$P&5F&");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      // Undeclared exception!
      try { 
        jSONReader0.readObject();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, 
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      // Undeclared exception!
      try { 
        jSONReader0.readObject((Object) "");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, expect {, actual EOF
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        jSONReader0.readObject(class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, expect {, actual EOF, pos 0, fastjson-version 1.2.68
         //
         verifyException("com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("[]", parserConfig0);
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      JSONArray jSONArray0 = (JSONArray)jSONReader0.readObject((Type) null);
      assertEquals(0, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      String string0 = jSONReader0.readString();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      char[] charArray0 = new char[7];
      ParserConfig parserConfig0 = ParserConfig.global;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(charArray0, 0, parserConfig0, 2063);
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      Long long0 = jSONReader0.readLong();
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JSONScanner jSONScanner0 = new JSONScanner("illegal state : ");
      JSONReader jSONReader0 = new JSONReader(jSONScanner0);
      // Undeclared exception!
      try { 
        jSONReader0.readInteger();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, pos 1, line 1, column 2illegal state : 
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
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
  public void test48()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      // Undeclared exception!
      try { 
        jSONReader0.startArray();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, expect [, actual EOF
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("[]", parserConfig0);
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      // Undeclared exception!
      try { 
        jSONReader0.startObject();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, expect {, actual [
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("", parserConfig0);
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      Locale locale0 = jSONReader0.getLocal();
      assertEquals("", locale0.getISO3Country());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"a\":99,\"\":7,\"\":\"hello\",\"illegal state : \":true,\"b\":{}}");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      TimeZone timeZone0 = jSONReader0.getTimzeZone();
      assertEquals("GMT", timeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      JSONReader jSONReader0 = new JSONReader((DefaultJSONParser) null);
      TimeZone timeZone0 = TimeZone.getDefault();
      // Undeclared exception!
      try { 
        jSONReader0.setTimzeZone(timeZone0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.JSONReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      char[] charArray0 = new char[7];
      ParserConfig parserConfig0 = ParserConfig.global;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(charArray0, 0, parserConfig0, 2063);
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      int int0 = jSONReader0.peek();
      assertEquals(20, int0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      StringReader stringReader0 = new StringReader("}S=d^");
      Feature[] featureArray0 = new Feature[8];
      Feature feature0 = Feature.IgnoreAutoType;
      featureArray0[0] = feature0;
      featureArray0[1] = feature0;
      featureArray0[2] = featureArray0[1];
      featureArray0[3] = featureArray0[0];
      featureArray0[4] = featureArray0[2];
      featureArray0[5] = feature0;
      featureArray0[6] = featureArray0[4];
      featureArray0[7] = featureArray0[0];
      JSONReader jSONReader0 = new JSONReader(stringReader0, featureArray0);
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
  public void test55()  throws Throwable  {
      char[] charArray0 = new char[7];
      ParserConfig parserConfig0 = ParserConfig.global;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(charArray0, 0, parserConfig0, 2063);
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      Locale locale0 = Locale.CANADA_FRENCH;
      jSONReader0.setLocale(locale0);
      assertEquals("fra", locale0.getISO3Language());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("", parserConfig0);
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      jSONReader0.close();
      assertEquals(20, jSONReader0.peek());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("_f1e");
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
