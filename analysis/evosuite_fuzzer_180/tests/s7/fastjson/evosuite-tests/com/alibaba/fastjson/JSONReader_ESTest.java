/*
 * This file was automatically generated by EvoSuite
 * Fri May 22 14:59:47 GMT 2020
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
import com.alibaba.fastjson.parser.ParserConfig;
import java.io.PipedReader;
import java.io.StringReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.time.chrono.ChronoLocalDate;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentSkipListMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSONReader_ESTest extends JSONReader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"unclosed string : \":99,\"x\":99,\"(Z)Ljava/lang/Boolean;\":[],\"xx\":true}");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      jSONReader0.startObject();
      jSONReader0.readString();
      jSONReader0.readObject();
      boolean boolean0 = jSONReader0.hasNext();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\" - \":[\"a string\",false],\"\":null,\"illegal state : \":99}");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      jSONReader0.startObject();
      jSONReader0.readString();
      jSONReader0.startArray();
      jSONReader0.readString();
      boolean boolean0 = jSONReader0.hasNext();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"\":{},\"\":[],\"z\":[null,{}],\" - \":[],\"x\":{}}");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      jSONReader0.startObject();
      jSONReader0.readString();
      jSONReader0.readObject((Object) "{\"\":{},\"\":[],\"z\":[null,{}],\" - \":[],\"x\":{}}");
      assertEquals(16, jSONReader0.peek());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("{\"\":{\"\":-99,\"xx\":true},\"\":\"Large\",\"color\":\"Red\",\"value\":true,\"value2\":false,\"number\":-99}");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      jSONReader0.readObject((Object) "{\"\":{\"\":-99,\"xx\":true},\"\":\"Large\",\"color\":\"Red\",\"value\":true,\"value2\":false,\"number\":-99}");
      assertEquals(20, jSONReader0.peek());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = ']';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 7);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0);
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
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
  public void test05()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      jSONReader0.close();
      assertEquals(20, jSONReader0.peek());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      String string0 = jSONReader0.readString();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"\":{\"com.alibaba.fastjson.JSONReader\":[\"a string\"]}}");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      ConcurrentSkipListMap<Object, String> concurrentSkipListMap0 = new ConcurrentSkipListMap<Object, String>();
      Object object0 = jSONReader0.readObject((Map) concurrentSkipListMap0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\" - \":[],\"\":true,\"\":true}");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      jSONReader0.startObject();
      jSONReader0.readString();
      Class<String> class0 = String.class;
      String string0 = jSONReader0.readObject((Type) class0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"\":{},\"with\":[],\"z\":[null,{}],\" - \":[],\"x\":true}");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      jSONReader0.startObject();
      String string0 = jSONReader0.readString();
      Class<String> class0 = String.class;
      String string1 = jSONReader0.readObject(class0);
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringReader stringReader0 = new StringReader("62");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      Long long0 = jSONReader0.readLong();
      assertEquals(62L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringReader stringReader0 = new StringReader("false");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      Integer integer0 = jSONReader0.readInteger();
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringReader stringReader0 = new StringReader("99");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      Integer integer0 = jSONReader0.readInteger();
      assertEquals(99, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"\":{},\"y\":[],\"z\":[null,{}],\" - \":[]}");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      jSONReader0.startObject();
      Integer integer0 = jSONReader0.readInteger();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringReader stringReader0 = new StringReader("false");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      int int0 = jSONReader0.peek();
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
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
  public void test16()  throws Throwable  {
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
  public void test17()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("true");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0.lexer);
      // Undeclared exception!
      try { 
        jSONReader0.readString();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unterminated json string, pos 4, line 1, column 5true
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
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
  public void test19()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      ConcurrentSkipListMap<Object, String> concurrentSkipListMap0 = new ConcurrentSkipListMap<Object, String>();
      // Undeclared exception!
      try { 
        jSONReader0.readObject((Map) concurrentSkipListMap0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, expect {, actual EOF, pos 0, line 1, column 1
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JSONReader jSONReader0 = new JSONReader((DefaultJSONParser) null);
      ConcurrentSkipListMap<Integer, String> concurrentSkipListMap0 = new ConcurrentSkipListMap<Integer, String>();
      // Undeclared exception!
      try { 
        jSONReader0.readObject((Map) concurrentSkipListMap0);
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
      ParserConfig parserConfig0 = ParserConfig.global;
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("{\"\":null,\"\":-99,\"a\":true,\"b\":{}}", 2908);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("{\"\":null,\"\":-99,\"a\":true,\"b\":{}}", jSONReaderScanner0, parserConfig0);
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      ConcurrentSkipListMap<String, Method> concurrentSkipListMap0 = new ConcurrentSkipListMap<String, Method>();
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
  public void test22()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      // Undeclared exception!
      jSONReader0.readObject((Object) defaultJSONParser0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSONReader jSONReader0 = new JSONReader((DefaultJSONParser) null);
      Class<Field> class0 = Field.class;
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
  public void test24()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("true");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0.lexer);
      // Undeclared exception!
      try { 
        jSONReader0.readObject();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unterminated json string, pos 4, line 1, column 5true
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"\":{},\"java.lang.StackTraceElement\":[],\"z\":[null,{},null],\" - \":[]}");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      // Undeclared exception!
      try { 
        jSONReader0.readLong();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to long, value : {\"\":{},\" - \":[],\"java.lang.StackTraceElement\":[],\"z\":[null,{},null]}
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"\":-99,\"y\":[],\"z\":true,\"\":[],\"b\":{\"\":false,\"x\":true}}");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      // Undeclared exception!
      try { 
        jSONReader0.readInteger();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to int, value : {\"\":[],\"b\":{\"\":{},\"x\":{}},\"y\":[],\"z\":{\"$ref\":\"$.java\\\\.lang\\\\.String\\\\@0000000012.java\\\\.lang\\\\.String\\\\@0000000022\"}}
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
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
  public void test29()  throws Throwable  {
      JSONReader jSONReader0 = new JSONReader((DefaultJSONParser) null);
      Feature feature0 = Feature.AllowUnQuotedFieldNames;
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
  public void test30()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"\":-99,\"y\":null,\"\":true,\"a\":{},\"b\":{\"\":false}}");
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
  public void test31()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      Feature[] featureArray0 = new Feature[3];
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
  public void test32()  throws Throwable  {
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
  public void test33()  throws Throwable  {
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
  public void test34()  throws Throwable  {
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
  public void test35()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\" - \":[\"a string\"],\"\":null,\"illegal state : \":null}");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      jSONReader0.startObject();
      jSONReader0.readString();
      jSONReader0.startArray();
      jSONReader0.readString();
      // Undeclared exception!
      try { 
        jSONReader0.startArray();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, expect ,, actual ]
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StringReader stringReader0 = new StringReader("_3pPHcecs");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      Feature feature0 = Feature.AllowUnQuotedFieldNames;
      jSONReader0.config(feature0, true);
      assertEquals(1, jSONReader0.peek());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\" - \":[\"a string\"],\"\":null,\"illegal state : \":\"a string\",\"illegal state : \":null}");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      jSONReader0.startObject();
      jSONReader0.readString();
      jSONReader0.startArray();
      Class<String> class0 = String.class;
      jSONReader0.readString();
      // Undeclared exception!
      try { 
        jSONReader0.readObject((Type) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, expect ,, actual ]
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{Q");
      Feature[] featureArray0 = new Feature[3];
      Feature feature0 = Feature.AllowArbitraryCommas;
      featureArray0[0] = feature0;
      featureArray0[1] = feature0;
      featureArray0[2] = feature0;
      JSONReader jSONReader0 = new JSONReader(stringReader0, featureArray0);
      HashMap<String, ChronoLocalDate> hashMap0 = new HashMap<String, ChronoLocalDate>();
      // Undeclared exception!
      try { 
        jSONReader0.readObject((Map) hashMap0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"\":{},\"\":[],\"z\":[null,{}],\" - \":[],\"x\":{}}");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      jSONReader0.startObject();
      Object object0 = jSONReader0.readObject((Map) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"\":[99],\"(Z)Ljava/lang/Boolean;\":\"a string\",\"(I)Ljava/lang/Enum;\":true}");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      jSONReader0.startObject();
      String string0 = jSONReader0.readString();
      jSONReader0.readObject();
      Object object0 = jSONReader0.readObject();
      assertFalse(object0.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\" - \":[99],\"\":false}");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      jSONReader0.startObject();
      Object object0 = jSONReader0.readObject();
      assertEquals(" - ", object0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
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
  public void test43()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
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
  public void test44()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\" - \":[],\"\":true,\"\":true}");
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
  public void test45()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      Class<String> class0 = String.class;
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      String string0 = jSONReader0.readObject(class0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\" - \":[],\"\":false,\"illegal state : \":\"a string\"}");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      jSONReader0.startObject();
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        jSONReader0.readObject(class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, expect {, actual string, pos 1, fastjson-version 1.2.68
         //
         verifyException("com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Class<String> class0 = String.class;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("{\"\":{\"\":-99,\"xx\":true},\"\":\"Large\",\"color\":\"Red\",\"value\":true,\"value2\":false,\"number\":-99}");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      String string0 = jSONReader0.readObject((Type) class0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{Q");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      jSONReader0.startObject();
      String string0 = jSONReader0.readString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{Q");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      // Undeclared exception!
      try { 
        jSONReader0.readString();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
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
  public void test51()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"\":{},\"with\":[],\"\":[null,{}],\" - \":[],\"x\":true}");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      jSONReader0.startObject();
      Long long0 = jSONReader0.readLong();
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
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
  public void test53()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"BeanToArray\":99}");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      jSONReader0.startObject();
      // Undeclared exception!
      try { 
        jSONReader0.readInteger();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"BeanToArray\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\" - \":[\"a string\",false],\"\":null,\"illegal state : \":99}");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      jSONReader0.startObject();
      jSONReader0.readString();
      jSONReader0.startArray();
      boolean boolean0 = jSONReader0.hasNext();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\" - \":[[true]],\"\":false,\"illegal state : \":null}");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      jSONReader0.startObject();
      jSONReader0.readString();
      jSONReader0.startArray();
      jSONReader0.readString();
      boolean boolean0 = jSONReader0.hasNext();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"com.alibaba.fastjson.parser.deserializer.EnumDeserializer\":null}");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      jSONReader0.startObject();
      jSONReader0.readString();
      jSONReader0.readObject();
      boolean boolean0 = jSONReader0.hasNext();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"com.alibaba.fastjson.parser.deserializer.EnumDeserializer\":null}");
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
  public void test58()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
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
  public void test59()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"com.alibaba.fastjson.parser.deserializer.EnumDeserializer\":null}");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      jSONReader0.startObject();
      boolean boolean0 = jSONReader0.hasNext();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"com.alibaba.fastjson.parser.deserializer.EnumDeserializer\":null}");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      jSONReader0.startObject();
      jSONReader0.readString();
      jSONReader0.readObject();
      jSONReader0.endObject();
      assertEquals(20, jSONReader0.peek());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"unclosed string : \":99,\"x\":99,\"(Z)Ljava/lang/Boolean;\":[],\"xx\":true}");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      jSONReader0.startObject();
      jSONReader0.readString();
      jSONReader0.readObject();
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
  public void test62()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\" - \":[[true]],\"\":false,\"illegal state : \":null}");
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
  public void test63()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"\":[-99]}");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      Locale locale0 = jSONReader0.getLocal();
      assertEquals("en", locale0.toString());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Co#/f");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      // Undeclared exception!
      try { 
        jSONReader0.readObject((TypeReference<Type>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.JSONReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"\":null,\"yyyy-MM-dd HH:mm:ss.SSS\":99,\" - \":false,\"illegal state : \":false}");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      TimeZone timeZone0 = jSONReader0.getTimzeZone();
      assertEquals("GMT", timeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"fruit\":\"\",\"size\":{},\"color\":\"a string\",\"\":true,\"value2\":false,\"number\":\"a string\",\"\":{\"\":true}}");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-994), "{\"fruit\":\"\",\"size\":{},\"color\":\"a string\",\"\":true,\"value2\":false,\"number\":\"a string\",\"\":{\"\":true}}");
      jSONReader0.setTimzeZone(simpleTimeZone0);
      assertFalse(simpleTimeZone0.useDaylightTime());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{Q");
      Feature[] featureArray0 = new Feature[3];
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
  public void test68()  throws Throwable  {
      JSONReader jSONReader0 = new JSONReader((DefaultJSONParser) null);
      // Undeclared exception!
      try { 
        jSONReader0.peek();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.JSONReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"com.alibaba.fastjson.parser.deserializer.EnumDeserializer\":null}");
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
  public void test70()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"x\":\"hello\",\"y\":[true,\"a string\"],\"\":-99,\"illegal state : \":[],\"com.alibaba.fastjson.parser.deserializer.TimeDeserializer\":{\"x\":\"a string\"}}");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      Locale locale0 = new Locale("{\"x\":\"hello\",\"y\":[true,\"a string\"],\"\":-99,\"illegal state : \":[],\"com.alibaba.fastjson.parser.deserializer.TimeDeserializer\":{\"x\":\"a string\"}}");
      jSONReader0.setLocale(locale0);
      assertEquals("{\"x\":\"hello\",\"y\":[true,\"a string\"],\"\":-99,\"illegal state : \":[],\"com.alibaba.fastjson.parser.deserializer.timedeserializer\":{\"x\":\"a string\"}}", locale0.toString());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
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
  public void test72()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{\"unclosed string : \":99,\"\":99,\"(Z)Ljava/lang/Boolean;\":true,\"(I)Ljava/lang/Enum;\":true,\"illegal state : \":{}}");
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