/*
 * This file was automatically generated by EvoSuite
 * Fri May 22 20:48:53 GMT 2020
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
import com.alibaba.fastjson.parser.ParserConfig;
import java.io.PipedReader;
import java.io.Reader;
import java.io.StringReader;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSONReader_ESTest extends JSONReader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Integer integer0 = new Integer(905);
      JSONScanner jSONScanner0 = new JSONScanner("", 1004);
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(integer0, jSONScanner0, parserConfig0);
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      Feature feature0 = Feature.UseBigDecimal;
      jSONReader0.config(feature0, true);
      assertEquals(1004, jSONScanner0.getFeatures());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringReader stringReader0 = new StringReader("+KP`Cr4-Y]");
      Feature[] featureArray0 = new Feature[1];
      Feature feature0 = Feature.SortFeidFastMatch;
      featureArray0[0] = feature0;
      JSONReader jSONReader0 = new JSONReader(stringReader0, featureArray0);
      assertEquals(2, jSONReader0.peek());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("+X30di<,");
      JSONReader jSONReader0 = new JSONReader(jSONReaderScanner0);
      String string0 = jSONReader0.readString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSONScanner jSONScanner0 = new JSONScanner("");
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONScanner0, parserConfig0);
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      Object object0 = jSONReader0.readObject();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("+L=Ov@/7QT4FqC", parserConfig0, (-633));
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      Long long0 = jSONReader0.readLong();
      assertEquals(0L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("6}Sunl(},f@[NGA(%");
      JSONReader jSONReader0 = new JSONReader(jSONReaderScanner0);
      Long long0 = jSONReader0.readLong();
      assertEquals(6L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSONScanner jSONScanner0 = new JSONScanner("");
      JSONReader jSONReader0 = new JSONReader(jSONScanner0);
      Integer integer0 = jSONReader0.readInteger();
      assertNull(integer0);
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
      StringReader stringReader0 = new StringReader("bZ-");
      char[] charArray0 = new char[2];
      stringReader0.read(charArray0);
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      // Undeclared exception!
      try { 
        jSONReader0.readString();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // -
         //
         verifyException("com.alibaba.fastjson.parser.JSONLexerBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      char[] charArray0 = new char[0];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 0);
      JSONReader jSONReader0 = new JSONReader(jSONReaderScanner0);
      jSONReader0.close();
      // Undeclared exception!
      try { 
        jSONReader0.readString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
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
  public void test12()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("&:$(Zyoe>9", 5032);
      JSONReader jSONReader0 = new JSONReader(jSONReaderScanner0);
      // Undeclared exception!
      try { 
        jSONReader0.readObject((Object) jSONReaderScanner0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, expect {, actual error
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
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
  public void test14()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("NZ_m2JBwniC}3?");
      JSONReader jSONReader0 = new JSONReader(jSONReaderScanner0);
      jSONReaderScanner0.close();
      // Undeclared exception!
      try { 
        jSONReader0.readInteger();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
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
  public void test16()  throws Throwable  {
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
  public void test17()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("kotlin.reflect.KFunction");
      JSONReader jSONReader0 = new JSONReader(jSONReaderScanner0);
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
  public void test18()  throws Throwable  {
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
  public void test19()  throws Throwable  {
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
  public void test20()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader(1795);
      Feature[] featureArray0 = new Feature[4];
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
  public void test21()  throws Throwable  {
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
  public void test22()  throws Throwable  {
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
  public void test23()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
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
  public void test24()  throws Throwable  {
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
  public void test25()  throws Throwable  {
      JSONReader jSONReader0 = new JSONReader((DefaultJSONParser) null);
      Feature feature0 = Feature.AllowISO8601DateFormat;
      // Undeclared exception!
      try { 
        jSONReader0.config(feature0, false);
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
      ConcurrentHashMap<Field, String> concurrentHashMap0 = new ConcurrentHashMap<Field, String>();
      // Undeclared exception!
      try { 
        jSONReader0.readObject((Map) concurrentHashMap0);
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
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("[ @d~");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      jSONReader0.startArray();
      ConcurrentHashMap<Field, Integer> concurrentHashMap0 = new ConcurrentHashMap<Field, Integer>();
      // Undeclared exception!
      try { 
        jSONReader0.readObject((Map) concurrentHashMap0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, expect {, actual error, pos 3, line 1, column 4[ @d~
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StringReader stringReader0 = new StringReader("org.hibernate.Hibernate");
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
  public void test29()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("[ @d~");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      jSONReader0.startArray();
      // Undeclared exception!
      try { 
        jSONReader0.readObject();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, pos 3, line 1, column 4[ @d~
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("kotlin.reflect.KFunction");
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
  public void test31()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("[ @d~");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      jSONReader0.startArray();
      // Undeclared exception!
      jSONReader0.readObject((Object) defaultJSONParser0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Class<String> class0 = String.class;
      ParserConfig parserConfig0 = new ParserConfig(false);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("", parserConfig0);
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      String string0 = jSONReader0.readObject(class0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("[ @d~");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      jSONReader0.startArray();
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        jSONReader0.readObject(class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, expect {, actual error, pos 2, fastjson-version 1.2.68
         //
         verifyException("com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("Gj>yzapUq\u0002+", 5075);
      JSONReader jSONReader0 = new JSONReader(jSONReaderScanner0);
      ParameterizedTypeImpl parameterizedTypeImpl0 = (ParameterizedTypeImpl)TypeReference.LIST_STRING;
      // Undeclared exception!
      try { 
        jSONReader0.readObject((Type) parameterizedTypeImpl0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // expect '[', but error, 
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("[ @d~");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      jSONReader0.startArray();
      ParameterizedTypeImpl parameterizedTypeImpl0 = (ParameterizedTypeImpl)TypeReference.LIST_STRING;
      // Undeclared exception!
      try { 
        jSONReader0.readObject((Type) parameterizedTypeImpl0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // expect '[', but error, pos 3, line 1, column 4[ @d~
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("[ @d~");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      jSONReader0.startArray();
      // Undeclared exception!
      try { 
        jSONReader0.readString();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, pos 3, line 1, column 4[ @d~
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("kotlin.reflect.KFunction");
      JSONReader jSONReader0 = new JSONReader(jSONReaderScanner0);
      // Undeclared exception!
      try { 
        jSONReader0.readLong();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, 
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("[ @d~");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      jSONReader0.startArray();
      // Undeclared exception!
      try { 
        jSONReader0.readLong();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, pos 3, line 1, column 4[ @d~
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("e7_ajPDG5S");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0.lexer);
      Integer integer0 = jSONReader0.readInteger();
      assertEquals(7, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("[ @d~");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      jSONReader0.startArray();
      // Undeclared exception!
      try { 
        jSONReader0.readInteger();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, pos 3, line 1, column 4[ @d~
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("kotlin.reflect.KFunction");
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
  public void test42()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("[ @d~");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      jSONReader0.startArray();
      boolean boolean0 = jSONReader0.hasNext();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("[ @d~");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      jSONReader0.startArray();
      // Undeclared exception!
      try { 
        jSONReader0.startArray();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, expect [, actual error
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("[ @d~");
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
  public void test45()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("[ @d~");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      jSONReader0.startArray();
      // Undeclared exception!
      try { 
        jSONReader0.startObject();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, expect {, actual error
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("[ @d~");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      Locale locale0 = jSONReader0.getLocal();
      assertEquals("en", locale0.toString());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("[ @d~");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      // Undeclared exception!
      try { 
        jSONReader0.readObject((TypeReference<Field>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.JSONReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      JSONScanner jSONScanner0 = new JSONScanner("com.alibaba.fastjson.parser.deserializer.ArrayListTypeFieldDeserializer");
      JSONReader jSONReader0 = new JSONReader(jSONScanner0);
      TimeZone timeZone0 = jSONReader0.getTimzeZone();
      assertEquals("GMT", timeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("Gj>yzapUq\u0002+");
      JSONReader jSONReader0 = new JSONReader(jSONReaderScanner0);
      jSONReader0.setTimzeZone((TimeZone) null);
      assertEquals(1, jSONReader0.peek());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      StringReader stringReader0 = new StringReader("com.alibaba.fastjson.JSONReader");
      Feature[] featureArray0 = new Feature[2];
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
  public void test51()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      JSONReader jSONReader0 = new JSONReader(jSONReaderScanner0);
      int int0 = jSONReader0.peek();
      assertEquals(20, int0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
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
  public void test53()  throws Throwable  {
      Locale locale0 = Locale.US;
      JSONScanner jSONScanner0 = new JSONScanner("");
      JSONReader jSONReader0 = new JSONReader(jSONScanner0);
      jSONReader0.setLocale(locale0);
      assertEquals("eng", locale0.getISO3Language());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("[ @d~");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      // Undeclared exception!
      try { 
        jSONReader0.close();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // not close json text, token : [
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("[ @d~");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0.lexer);
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
