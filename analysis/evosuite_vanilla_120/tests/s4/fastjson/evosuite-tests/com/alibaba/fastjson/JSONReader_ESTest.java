/*
 * This file was automatically generated by EvoSuite
 * Thu May 21 16:56:42 GMT 2020
 */

package com.alibaba.fastjson;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.JSONReaderScanner;
import com.alibaba.fastjson.parser.JSONScanner;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory;
import com.alibaba.fastjson.util.FieldInfo;
import java.io.PipedReader;
import java.io.StringReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
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
      JSONScanner jSONScanner0 = new JSONScanner(":6/0)hDN.3t", 1807);
      JSONReader jSONReader0 = new JSONReader(jSONScanner0);
      Feature feature0 = Feature.OrderedField;
      jSONReader0.config(feature0, true);
      assertEquals(18191, jSONScanner0.getFeatures());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringReader stringReader0 = new StringReader("NoqjE");
      Feature[] featureArray0 = new Feature[4];
      Feature feature0 = Feature.CustomMapDeserializer;
      featureArray0[0] = feature0;
      featureArray0[1] = featureArray0[0];
      featureArray0[2] = feature0;
      featureArray0[3] = featureArray0[0];
      JSONReader jSONReader0 = new JSONReader(stringReader0, featureArray0);
      assertEquals(18, jSONReader0.peek());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringReader stringReader0 = new StringReader("NoqjE");
      Feature[] featureArray0 = new Feature[4];
      Feature feature0 = Feature.CustomMapDeserializer;
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
  public void test03()  throws Throwable  {
      char[] charArray0 = new char[0];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 869);
      JSONReader jSONReader0 = new JSONReader(jSONReaderScanner0);
      jSONReader0.close();
      assertEquals(20, jSONReader0.peek());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSONScanner jSONScanner0 = new JSONScanner("");
      JSONReader jSONReader0 = new JSONReader(jSONScanner0);
      Long long0 = jSONReader0.readLong();
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringReader stringReader0 = new StringReader(".");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      // Undeclared exception!
      try { 
        jSONReader0.startArray();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, expect [, actual .
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
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
  public void test07()  throws Throwable  {
      JSONReader jSONReader0 = new JSONReader((DefaultJSONParser) null);
      StringReader stringReader0 = new StringReader("");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0, 5165);
      TimeZone timeZone0 = jSONReaderScanner0.getTimeZone();
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
  public void test08()  throws Throwable  {
      JSONReader jSONReader0 = new JSONReader((DefaultJSONParser) null);
      Locale locale0 = Locale.ENGLISH;
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
  public void test09()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("context is null");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      // Undeclared exception!
      try { 
        jSONReader0.readString();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, pos 1, line 1, column 2context is null
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
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
  public void test11()  throws Throwable  {
      JSONScanner jSONScanner0 = new JSONScanner("");
      ParserConfig parserConfig0 = new ParserConfig(false);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONScanner0, parserConfig0);
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
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
  public void test12()  throws Throwable  {
      StringReader stringReader0 = new StringReader(".");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        jSONReader0.readObject(class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, expect {, actual ., pos 0, fastjson-version 1.2.68
         //
         verifyException("com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("illegal state : ", 1146);
      JSONReader jSONReader0 = new JSONReader(jSONReaderScanner0);
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
  public void test14()  throws Throwable  {
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
  public void test15()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("context is null");
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      // Undeclared exception!
      try { 
        jSONReader0.readLong();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, pos 1, line 1, column 2context is null
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringReader stringReader0 = new StringReader("~aCzqy]IeoFg");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0);
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
  public void test17()  throws Throwable  {
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
  public void test18()  throws Throwable  {
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
  public void test19()  throws Throwable  {
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
  public void test20()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("illegal state : ", 1146);
      JSONReader jSONReader0 = new JSONReader(jSONReaderScanner0);
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

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StringReader stringReader0 = new StringReader("com.alibaba.fastjson.JSONReader");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0);
      JSONReader jSONReader0 = new JSONReader(jSONReaderScanner0);
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
  public void test22()  throws Throwable  {
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
  public void test23()  throws Throwable  {
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
  public void test26()  throws Throwable  {
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
  public void test27()  throws Throwable  {
      JSONReader jSONReader0 = new JSONReader((DefaultJSONParser) null);
      Feature feature0 = Feature.AllowUnQuotedFieldNames;
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
  public void test28()  throws Throwable  {
      StringReader stringReader0 = new StringReader("~aCzqy]IeoFg");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0);
      JSONReader jSONReader0 = new JSONReader(jSONReaderScanner0);
      Locale locale0 = Locale.JAPAN;
      jSONReader0.setLocale(locale0);
      assertEquals("ja", locale0.getLanguage());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ASMDeserializerFactory aSMDeserializerFactory0 = new ASMDeserializerFactory(classLoader0);
      ParserConfig parserConfig0 = new ParserConfig(aSMDeserializerFactory0.classLoader);
      char[] charArray0 = new char[1];
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(charArray0, 0, parserConfig0, 0);
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      Object object0 = jSONReader0.readObject();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSONReader jSONReader0 = new JSONReader((DefaultJSONParser) null);
      // Undeclared exception!
      try { 
        jSONReader0.readObject((Object) "");
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
      JSONReader jSONReader0 = new JSONReader((DefaultJSONParser) null);
      Class<Object> class0 = Object.class;
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
  public void test32()  throws Throwable  {
      JSONReader jSONReader0 = new JSONReader((DefaultJSONParser) null);
      Class<Field> class0 = Field.class;
      Class<String> class1 = String.class;
      FieldInfo fieldInfo0 = new FieldInfo("fsw", class0, class1, class0, (Field) null, 6, (-2278), 1358);
      // Undeclared exception!
      try { 
        jSONReader0.readObject((Type) fieldInfo0.declaringClass);
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
      JSONScanner jSONScanner0 = new JSONScanner("");
      JSONReader jSONReader0 = new JSONReader(jSONScanner0);
      String string0 = jSONReader0.readString();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JSONScanner jSONScanner0 = new JSONScanner("");
      JSONReader jSONReader0 = new JSONReader(jSONScanner0);
      Integer integer0 = jSONReader0.readInteger();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("[iY", parserConfig0, 2662);
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      jSONReader0.startArray();
      // Undeclared exception!
      jSONReader0.readObject((Object) defaultJSONParser0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StringReader stringReader0 = new StringReader("~aCzqy]IeoFg");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0);
      JSONReader jSONReader0 = new JSONReader(jSONReaderScanner0);
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
  public void test37()  throws Throwable  {
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
  public void test38()  throws Throwable  {
      StringReader stringReader0 = new StringReader(".");
      JSONReader jSONReader0 = new JSONReader(stringReader0);
      ConcurrentSkipListMap<String, Method> concurrentSkipListMap0 = new ConcurrentSkipListMap<String, Method>();
      // Undeclared exception!
      try { 
        jSONReader0.readObject((Map) concurrentSkipListMap0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, expect {, actual ., 
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JSONScanner jSONScanner0 = new JSONScanner("");
      JSONReader jSONReader0 = new JSONReader(jSONScanner0);
      TimeZone timeZone0 = jSONReader0.getTimzeZone();
      assertEquals("GMT", timeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("illegal state : ", 1146);
      JSONReader jSONReader0 = new JSONReader(jSONReaderScanner0);
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1146, "illegal state : ");
      jSONReader0.setTimzeZone(simpleTimeZone0);
      assertFalse(simpleTimeZone0.useDaylightTime());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ParserConfig parserConfig0 = new ParserConfig(false);
      char[] charArray0 = new char[1];
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(charArray0, 0, parserConfig0, 0);
      JSONReader jSONReader0 = new JSONReader(defaultJSONParser0);
      // Undeclared exception!
      try { 
        jSONReader0.endObject();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, expect }, actual EOF
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
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
}
