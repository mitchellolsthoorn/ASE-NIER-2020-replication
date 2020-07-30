/*
 * This file was automatically generated by EvoSuite
 * Wed May 20 13:08:30 GMT 2020
 */

package com.google.gson;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.DefaultDateTypeAdapter;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.Excluder;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.nio.BufferOverflowException;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Gson_ESTest extends Gson_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonArray jsonArray0 = new JsonArray();
      MockFile mockFile0 = new MockFile(". Forgot to register a type adapter?", "");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFile0);
      gson0.toJson((JsonElement) jsonArray0, (Appendable) mockPrintWriter0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Gson.FutureTypeAdapter<AtomicLongArray> gson_FutureTypeAdapter0 = new Gson.FutureTypeAdapter<AtomicLongArray>();
      long[] longArray0 = new long[5];
      AtomicLongArray atomicLongArray0 = new AtomicLongArray(longArray0);
      // Undeclared exception!
      try { 
        gson_FutureTypeAdapter0.write((JsonWriter) null, atomicLongArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.Gson$FutureTypeAdapter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Gson.FutureTypeAdapter<Short> gson_FutureTypeAdapter0 = new Gson.FutureTypeAdapter<Short>();
      StringReader stringReader0 = new StringReader("b;W");
      JsonReader jsonReader0 = new JsonReader(stringReader0);
      // Undeclared exception!
      try { 
        gson_FutureTypeAdapter0.read(jsonReader0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.Gson$FutureTypeAdapter", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Gson.checkValidFloatingPoint(3638.7225392419);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<String> class0 = String.class;
      try { 
        gson0.fromJson("|TekO1Q=cq$.v>7Fj`}", class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 9 path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Gson gson0 = new Gson();
      Float float0 = new Float((-567.6F));
      Class<Double> class0 = Double.TYPE;
      gson0.toJsonTree((Object) float0, (Type) class0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<BigDecimal> class0 = BigDecimal.class;
      TypeToken<BigDecimal> typeToken0 = TypeToken.get(class0);
      Type type0 = typeToken0.getType();
      gson0.toJsonTree((Object) null, type0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      Gson gson0 = new Gson();
      Class<Type> class0 = Type.class;
      TypeToken<Type> typeToken0 = TypeToken.get(class0);
      Type type0 = typeToken0.getType();
      gson0.toJsonTree((Object) stringWriter0, type0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Gson gson0 = new Gson();
      AtomicLongArray atomicLongArray0 = new AtomicLongArray(0);
      gson0.toJsonTree((Object) atomicLongArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Character> class0 = Character.TYPE;
      gson0.toJson((Object) null, (Type) class0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<AtomicLong> class0 = AtomicLong.class;
      gson0.fromJson((String) null, class0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Gson gson0 = new Gson();
      StringReader stringReader0 = new StringReader("");
      Class<Character> class0 = Character.TYPE;
      gson0.fromJson((Reader) stringReader0, (Type) class0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Gson gson0 = new Gson();
      StringReader stringReader0 = new StringReader("#gJ+S30kZ0");
      Class<Integer> class0 = Integer.class;
      gson0.fromJson((Reader) stringReader0, class0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Gson gson0 = new Gson();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("A7jF", true);
      // Undeclared exception!
      gson0.toJsonTree((Object) mockFileOutputStream0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Gson gson0 = new Gson();
      DefaultDateTypeAdapter defaultDateTypeAdapter0 = new DefaultDateTypeAdapter(0, 0);
      // Undeclared exception!
      try { 
        gson0.toJsonTree((Object) defaultDateTypeAdapter0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Attempted to serialize java.lang.Class: java.util.Date. Forgot to register a type adapter?
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      Gson gson0 = new Gson();
      Class<Boolean> class0 = Boolean.TYPE;
      // Undeclared exception!
      try { 
        gson0.toJson((Object) stringWriter0, (Type) class0, (Appendable) stringWriter0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.io.StringWriter cannot be cast to java.lang.Boolean
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$3", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Gson gson0 = new Gson();
      Double double0 = new Double(4672.140803);
      Class<Character> class0 = Character.TYPE;
      // Undeclared exception!
      try { 
        gson0.toJson((Object) double0, (Type) class0, (JsonWriter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Gson gson0 = new Gson();
      Long long0 = new Long((-2917L));
      Class<Float> class0 = Float.TYPE;
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      Charset charset0 = Charset.defaultCharset();
      CharsetEncoder charsetEncoder0 = charset0.newEncoder();
      OutputStreamWriter outputStreamWriter0 = new OutputStreamWriter(byteArrayOutputStream0, charsetEncoder0);
      JsonWriter jsonWriter0 = new JsonWriter(outputStreamWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.name("J<\"!^");
      // Undeclared exception!
      try { 
        gson0.toJson((Object) long0, (Type) class0, jsonWriter1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Nesting problem.
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      Gson gson0 = new Gson();
      Double double0 = new Double(3763.53772858186);
      Class<String> class0 = String.class;
      TypeToken<String> typeToken0 = TypeToken.get(class0);
      Type type0 = typeToken0.getType();
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      // Undeclared exception!
      try { 
        gson0.toJson((Object) double0, type0, jsonWriter0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Double cannot be cast to java.lang.String
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$16", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Float float0 = new Float(2938.7788174);
      Gson gson0 = new Gson();
      Class<Excluder> class0 = Excluder.class;
      TypeToken<Excluder> typeToken0 = TypeToken.get(class0);
      Class<? super Excluder> class1 = typeToken0.getRawType();
      // Undeclared exception!
      try { 
        gson0.toJson((Object) float0, (Type) class1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Gson gson0 = new Gson();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("*;?\"d;?tvkhj;5", false);
      OutputStreamWriter outputStreamWriter0 = new OutputStreamWriter(mockFileOutputStream0);
      // Undeclared exception!
      gson0.toJson((Object) outputStreamWriter0, (Appendable) outputStreamWriter0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Gson gson0 = new Gson();
      BigDecimal bigDecimal0 = new BigDecimal(0.0);
      CharBuffer charBuffer0 = CharBuffer.allocate(0);
      // Undeclared exception!
      try { 
        gson0.toJson((Object) bigDecimal0, (Appendable) charBuffer0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.CharBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Double> class0 = Double.TYPE;
      // Undeclared exception!
      try { 
        gson0.toJson((Object) class0, (Appendable) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Attempted to serialize java.lang.Class: double. Forgot to register a type adapter?
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Float> class0 = Float.class;
      // Undeclared exception!
      try { 
        gson0.toJson((Object) class0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Attempted to serialize java.lang.Class: java.lang.Float. Forgot to register a type adapter?
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Gson gson0 = new Gson();
      // Undeclared exception!
      try { 
        gson0.newJsonWriter((Writer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // out == null
         //
         verifyException("com.google.gson.stream.JsonWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Gson gson0 = new Gson();
      // Undeclared exception!
      try { 
        gson0.newJsonReader((Reader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // in == null
         //
         verifyException("com.google.gson.stream.JsonReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Gson gson0 = new Gson();
      Excluder excluder0 = Excluder.DEFAULT;
      // Undeclared exception!
      try { 
        gson0.getDelegateAdapter((TypeAdapterFactory) excluder0, (TypeToken<MockDate>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Long> class0 = Long.TYPE;
      try { 
        gson0.fromJson("5vj_.wMT]^9/[{:hc{c", (Type) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NumberFormatException: For input string: \"5vj_.wMT\"
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$11", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Float> class0 = Float.class;
      // Undeclared exception!
      try { 
        gson0.fromJson("^guQ7oCyHw", class0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Float> class0 = Float.TYPE;
      // Undeclared exception!
      try { 
        gson0.fromJson((Reader) null, (Type) class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // in == null
         //
         verifyException("com.google.gson.stream.JsonReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Float> class0 = Float.class;
      StringReader stringReader0 = new StringReader(" HaE$]Jj%");
      JsonReader jsonReader0 = new JsonReader(stringReader0);
      // Undeclared exception!
      try { 
        gson0.fromJson(jsonReader0, (Type) class0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Float> class0 = Float.class;
      JsonObject jsonObject0 = new JsonObject();
      try { 
        gson0.fromJson((JsonElement) jsonObject0, (Type) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected NUMBER but was BEGIN_OBJECT at path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("");
      Class<Double> class0 = Double.class;
      // Undeclared exception!
      try { 
        gson0.fromJson((JsonElement) jsonPrimitive0, class0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonArray jsonArray0 = new JsonArray(2);
      Class<AtomicLong> class0 = AtomicLong.class;
      try { 
        gson0.fromJson((JsonElement) jsonArray0, class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected NUMBER but was BEGIN_ARRAY at path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Gson.FutureTypeAdapter<Integer> gson_FutureTypeAdapter0 = new Gson.FutureTypeAdapter<Integer>();
      gson_FutureTypeAdapter0.setDelegate(gson_FutureTypeAdapter0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Character> class0 = Character.TYPE;
      gson0.fromJson((JsonElement) null, (Type) class0);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Gson gson0 = new Gson();
      StringReader stringReader0 = new StringReader("");
      JsonReader jsonReader0 = new JsonReader(stringReader0);
      Class<Integer> class0 = Integer.class;
      TypeToken<Integer> typeToken0 = TypeToken.get(class0);
      Class<? super Integer> class1 = typeToken0.getRawType();
      gson0.fromJson(jsonReader0, (Type) class1);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
      assertFalse(jsonReader0.isLenient());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Gson gson0 = new Gson();
      PipedReader pipedReader0 = new PipedReader();
      PipedWriter pipedWriter0 = new PipedWriter(pipedReader0);
      JsonWriter jsonWriter0 = gson0.newJsonWriter(pipedWriter0);
      assertTrue(gson0.htmlSafe());
      assertFalse(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Gson gson0 = new Gson();
      Long long0 = new Long(663L);
      JsonPrimitive jsonPrimitive0 = (JsonPrimitive)gson0.toJsonTree((Object) long0);
      assertTrue(jsonPrimitive0.isNumber());
      
      Class<Long> class0 = Long.class;
      TypeToken<Long> typeToken0 = TypeToken.get(class0);
      gson0.getAdapter(typeToken0);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Float> class0 = Float.class;
      TypeToken<Float> typeToken0 = TypeToken.get(class0);
      gson0.getAdapter(typeToken0);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Gson gson0 = new Gson();
      Float float0 = Float.valueOf(1.0F);
      Class<Character> class0 = Character.TYPE;
      // Undeclared exception!
      try { 
        gson0.toJson((Object) float0, (Type) class0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Float cannot be cast to java.lang.Character
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$15", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Gson gson0 = new Gson();
      CharBuffer charBuffer0 = CharBuffer.allocate(1);
      // Undeclared exception!
      try { 
        gson0.toJson((JsonElement) null, (Appendable) charBuffer0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.CharBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Gson gson0 = new Gson();
      PipedReader pipedReader0 = new PipedReader();
      JsonReader jsonReader0 = gson0.newJsonReader(pipedReader0);
      Class<Byte> class0 = Byte.TYPE;
      try { 
        gson0.fromJson(jsonReader0, (Type) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.IOException: Pipe not connected
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonObject jsonObject0 = new JsonObject();
      StringWriter stringWriter0 = new StringWriter(1672);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(stringWriter0);
      JsonWriter jsonWriter0 = new JsonWriter(mockPrintWriter0);
      gson0.toJson((JsonElement) jsonObject0, jsonWriter0);
      assertTrue(jsonWriter0.getSerializeNulls());
      assertFalse(jsonWriter0.isLenient());
      assertFalse(jsonWriter0.isHtmlSafe());
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Character> class0 = Character.TYPE;
      PipedReader pipedReader0 = new PipedReader();
      try { 
        gson0.fromJson((Reader) pipedReader0, (Type) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.IOException: Pipe not connected
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Double> class0 = Double.TYPE;
      gson0.fromJson("", (Type) class0);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Character> class0 = Character.TYPE;
      gson0.fromJson((String) null, (Type) class0);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Gson gson0 = new Gson();
      // Undeclared exception!
      try { 
        gson0.toJson((Object) null, (Appendable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.Streams$AppendableWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Gson gson0 = new Gson();
      gson0.toJsonTree((Object) null);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Gson.FutureTypeAdapter<Object> gson_FutureTypeAdapter0 = new Gson.FutureTypeAdapter<Object>();
      Gson gson0 = new Gson();
      gson0.toJsonTree((Object) gson_FutureTypeAdapter0);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Gson gson0 = new Gson();
      Excluder excluder0 = Excluder.DEFAULT;
      Class<Double> class0 = Double.class;
      TypeToken<Double> typeToken0 = TypeToken.get(class0);
      TypeAdapter<Double> typeAdapter0 = gson0.getDelegateAdapter((TypeAdapterFactory) excluder0, typeToken0);
      assertNotNull(typeAdapter0);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Double> class0 = Double.TYPE;
      TypeToken<Double> typeToken0 = TypeToken.get(class0);
      // Undeclared exception!
      try { 
        gson0.getDelegateAdapter((TypeAdapterFactory) null, typeToken0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // GSON cannot serialize double
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Gson gson0 = new Gson();
      PipedReader pipedReader0 = new PipedReader();
      // Undeclared exception!
      gson0.toJson((Object) pipedReader0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Gson gson0 = new Gson();
      // Undeclared exception!
      try { 
        gson0.getAdapter((TypeToken<Float>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Gson gson0 = new Gson();
      StringWriter stringWriter0 = new StringWriter();
      AtomicLongArray atomicLongArray0 = new AtomicLongArray(1);
      gson0.toJson((Object) atomicLongArray0, (Appendable) stringWriter0);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      Gson gson0 = new Gson();
      Float float0 = new Float(2938.7788174);
      gson0.toJson((Object) float0, (Appendable) stringWriter0);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Float> class0 = Float.class;
      // Undeclared exception!
      try { 
        gson0.fromJson("5vj_.wMT]^9/[{:hc{c", (Type) class0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Double> class0 = Double.class;
      MockPrintStream mockPrintStream0 = new MockPrintStream("8!-v|?>;RD0T^Zd");
      gson0.toJson((Object) null, (Type) class0, (Appendable) mockPrintStream0);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<AtomicLong> class0 = AtomicLong.class;
      String string0 = gson0.toString();
      try { 
        gson0.fromJson(string0, class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected a long but was BEGIN_OBJECT at line 1 column 2 path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Gson gson0 = new Gson();
      StringWriter stringWriter0 = new StringWriter();
      AtomicLong atomicLong0 = new AtomicLong((-2010L));
      gson0.toJson((Object) atomicLong0, (Appendable) stringWriter0);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Gson gson0 = new Gson();
      gson0.fieldNamingStrategy();
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Gson gson0 = new Gson();
      gson0.newBuilder();
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Short> class0 = Short.class;
      gson0.getAdapter(class0);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Gson gson0 = new Gson();
      gson0.excluder();
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Gson gson0 = new Gson();
      boolean boolean0 = gson0.htmlSafe();
      assertTrue(boolean0);
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Gson.FutureTypeAdapter<Double> gson_FutureTypeAdapter0 = new Gson.FutureTypeAdapter<Double>();
      Gson gson0 = new Gson();
      Class<Long> class0 = Long.TYPE;
      // Undeclared exception!
      try { 
        gson0.toJsonTree((Object) gson_FutureTypeAdapter0, (Type) class0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.gson.Gson$FutureTypeAdapter cannot be cast to java.lang.Number
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$11", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<AtomicLongArray> class0 = AtomicLongArray.class;
      gson0.fromJson((JsonElement) null, class0);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<String> class0 = String.class;
      String string0 = gson0.fromJson("r-~Rg!ZAU", class0);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Gson gson0 = new Gson();
      Long long0 = new Long((-5164L));
      gson0.toJson((Object) long0);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<AtomicLongArray> class0 = AtomicLongArray.class;
      // Undeclared exception!
      try { 
        gson0.fromJson((Reader) null, class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // in == null
         //
         verifyException("com.google.gson.stream.JsonReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Long> class0 = Long.TYPE;
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("< XD/KFE");
      JsonWriter jsonWriter0 = new JsonWriter(mockPrintWriter0);
      gson0.toJson((Object) null, (Type) class0, jsonWriter0);
      assertFalse(jsonWriter0.isHtmlSafe());
      assertTrue(jsonWriter0.getSerializeNulls());
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
      assertFalse(jsonWriter0.isLenient());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Gson gson0 = new Gson();
      String string0 = gson0.toJson((JsonElement) null);
      assertFalse(gson0.serializeNulls());
      assertEquals("null", string0);
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Gson gson0 = new Gson();
      boolean boolean0 = gson0.serializeNulls();
      assertFalse(boolean0);
      assertTrue(gson0.htmlSafe());
  }
}
