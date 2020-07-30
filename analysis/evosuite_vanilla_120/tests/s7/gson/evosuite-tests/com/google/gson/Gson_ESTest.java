/*
 * This file was automatically generated by EvoSuite
 * Thu May 21 18:01:02 GMT 2020
 */

package com.google.gson;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.Excluder;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.File;
import java.io.OutputStreamWriter;
import java.io.PipedOutputStream;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.nio.BufferOverflowException;
import java.nio.CharBuffer;
import java.nio.ReadOnlyBufferException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileWriter;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Gson_ESTest extends Gson_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Gson gson0 = new Gson();
      Float float0 = new Float(0.0F);
      Class<Byte> class0 = Byte.TYPE;
      MockFile mockFile0 = new MockFile("");
      File file0 = MockFile.createTempFile("AssertionError (GSON 2.8.6): ", "AssertionError (GSON 2.8.6): ", (File) mockFile0);
      MockFileWriter mockFileWriter0 = new MockFileWriter(file0, true);
      gson0.toJson((Object) float0, (Type) class0, (Appendable) mockFileWriter0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Gson gson0 = new Gson();
      StringWriter stringWriter0 = new StringWriter(1);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(stringWriter0);
      gson0.toJson((JsonElement) null, (Appendable) mockPrintWriter0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Gson.checkValidFloatingPoint((-1.0));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(">c@G 6]");
      Class<AtomicLongArray> class0 = AtomicLongArray.class;
      TypeToken<AtomicLongArray> typeToken0 = TypeToken.get(class0);
      Class<? super AtomicLongArray> class1 = typeToken0.getRawType();
      try { 
        gson0.fromJson((JsonElement) jsonPrimitive0, (Type) class1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected BEGIN_ARRAY but was STRING at path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringReader stringReader0 = new StringReader(">c@G 6]");
      Gson gson0 = new Gson();
      Class<Object> class0 = Object.class;
      try { 
        gson0.fromJson((Reader) stringReader0, class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 7 path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Gson gson0 = new Gson();
      Long long0 = Long.getLong("", (-491L));
      Class<Float> class0 = Float.class;
      TypeToken<Float> typeToken0 = TypeToken.get(class0);
      Class<? super Float> class1 = typeToken0.getRawType();
      gson0.toJsonTree((Object) long0, (Type) class1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Float> class0 = Float.TYPE;
      gson0.toJsonTree((Object) null, (Type) class0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Gson gson0 = new Gson();
      Gson.FutureTypeAdapter<Byte> gson_FutureTypeAdapter0 = new Gson.FutureTypeAdapter<Byte>();
      gson0.toJsonTree((Object) gson_FutureTypeAdapter0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Gson gson0 = new Gson();
      long[] longArray0 = new long[0];
      AtomicLongArray atomicLongArray0 = new AtomicLongArray(longArray0);
      gson0.toJsonTree((Object) atomicLongArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Gson gson0 = new Gson();
      StringReader stringReader0 = new StringReader("");
      Class<Byte> class0 = Byte.TYPE;
      gson0.fromJson((Reader) stringReader0, (Type) class0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Gson gson0 = new Gson();
      StringReader stringReader0 = new StringReader("");
      Class<Object> class0 = Object.class;
      gson0.fromJson((Reader) stringReader0, class0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      Class<Integer> class0 = Integer.class;
      gson0.fromJson((JsonElement) jsonNull0, class0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Float> class0 = Float.class;
      // Undeclared exception!
      try { 
        gson0.toJsonTree((Object) class0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Attempted to serialize java.lang.Class: java.lang.Float. Forgot to register a type adapter?
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Gson gson0 = new Gson();
      Integer integer0 = new Integer(13);
      Class<Float> class0 = Float.TYPE;
      // Undeclared exception!
      try { 
        gson0.toJson((Object) integer0, (Type) class0, (Appendable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.Streams$AppendableWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Long> class0 = Long.TYPE;
      MockFile mockFile0 = new MockFile("", "com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper");
      MockFileWriter mockFileWriter0 = new MockFileWriter(mockFile0, true);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFileWriter0);
      JsonWriter jsonWriter0 = new JsonWriter(mockPrintWriter0);
      // Undeclared exception!
      try { 
        gson0.toJson((Object) class0, (Type) null, jsonWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.$Gson$Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Gson gson0 = new Gson();
      Excluder excluder0 = new Excluder();
      Class<String> class0 = String.class;
      TypeToken<String> typeToken0 = TypeToken.get(class0);
      Class<? super String> class1 = typeToken0.getRawType();
      StringWriter stringWriter0 = new StringWriter(2);
      JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
      // Undeclared exception!
      try { 
        gson0.toJson((Object) excluder0, (Type) class1, jsonWriter0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.gson.internal.Excluder cannot be cast to java.lang.String
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$16", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Gson gson0 = new Gson();
      Integer integer0 = new Integer((-405));
      // Undeclared exception!
      try { 
        gson0.toJson((Object) integer0, (Type) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.$Gson$Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Character> class0 = Character.TYPE;
      // Undeclared exception!
      try { 
        gson0.toJson((Object) ">cG 6;]", (Type) class0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.lang.Character
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$15", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Gson gson0 = new Gson();
      MockFile mockFile0 = new MockFile("%}");
      MockFileWriter mockFileWriter0 = new MockFileWriter(mockFile0, false);
      // Undeclared exception!
      gson0.toJson((Object) mockFileWriter0, (Appendable) mockFileWriter0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Class<AtomicLong> class0 = AtomicLong.class;
      TypeToken<AtomicLong> typeToken0 = TypeToken.get(class0);
      Gson gson0 = new Gson();
      CharBuffer charBuffer0 = CharBuffer.allocate(1008);
      // Undeclared exception!
      try { 
        gson0.toJson((Object) typeToken0, (Appendable) charBuffer0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Attempted to serialize java.lang.Class: java.util.concurrent.atomic.AtomicLong. Forgot to register a type adapter?
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Gson gson0 = new Gson();
      PipedWriter pipedWriter0 = new PipedWriter();
      // Undeclared exception!
      gson0.toJson((Object) pipedWriter0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
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
  public void test22()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonArray jsonArray0 = new JsonArray();
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "java.lang.Byte@0000000029");
      // Undeclared exception!
      try { 
        gson0.toJson((JsonElement) jsonArray0, (Appendable) charBuffer0);
        fail("Expecting exception: ReadOnlyBufferException");
      
      } catch(ReadOnlyBufferException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.StringCharBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonObject jsonObject0 = new JsonObject();
      // Undeclared exception!
      try { 
        gson0.toJson((JsonElement) jsonObject0, (Appendable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.Streams$AppendableWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Double> class0 = Double.TYPE;
      // Undeclared exception!
      try { 
        gson0.fromJson("Y QJGJ(e` q1;;n4qJ3", (Type) class0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Gson gson0 = new Gson();
      // Undeclared exception!
      try { 
        gson0.fromJson("l]%!Uy&mDfJHH{$~H!", (Type) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.$Gson$Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Gson gson0 = new Gson();
      StringReader stringReader0 = new StringReader("com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper");
      Class<Float> class0 = Float.TYPE;
      // Undeclared exception!
      try { 
        gson0.fromJson((Reader) stringReader0, (Type) class0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Class<AtomicLong> class0 = AtomicLong.class;
      Gson gson0 = new Gson();
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
  public void test28()  throws Throwable  {
      Gson gson0 = new Gson();
      PipedReader pipedReader0 = new PipedReader();
      Class<Date> class0 = Date.class;
      try { 
        gson0.fromJson((Reader) pipedReader0, class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.IOException: Pipe not connected
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Gson gson0 = new Gson();
      StringReader stringReader0 = new StringReader("5kL");
      JsonReader jsonReader0 = gson0.newJsonReader(stringReader0);
      Class<Double> class0 = Double.class;
      TypeToken<Double> typeToken0 = TypeToken.get(class0);
      Type type0 = typeToken0.getType();
      // Undeclared exception!
      try { 
        gson0.fromJson(jsonReader0, type0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Double> class0 = Double.TYPE;
      // Undeclared exception!
      try { 
        gson0.fromJson((JsonReader) null, (Type) class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Gson gson0 = new Gson();
      PipedReader pipedReader0 = new PipedReader(19);
      JsonReader jsonReader0 = gson0.newJsonReader(pipedReader0);
      Class<Float> class0 = Float.TYPE;
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
  public void test32()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("[&eKo{");
      Class<Float> class0 = Float.TYPE;
      // Undeclared exception!
      try { 
        gson0.fromJson((JsonElement) jsonPrimitive0, (Type) class0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonArray jsonArray0 = new JsonArray();
      // Undeclared exception!
      try { 
        gson0.fromJson((JsonElement) jsonArray0, (Type) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.$Gson$Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<AtomicLong> class0 = AtomicLong.class;
      gson0.fromJson((String) null, (Type) class0);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Character> class0 = Character.TYPE;
      try { 
        gson0.fromJson("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl", (Type) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expecting character, got: com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$15", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Gson gson0 = new Gson();
      MockFile mockFile0 = new MockFile("TC&iee", "com.google.gson.internal.Streams");
      MockFileWriter mockFileWriter0 = new MockFileWriter(mockFile0, false);
      JsonWriter jsonWriter0 = gson0.newJsonWriter(mockFileWriter0);
      assertFalse(jsonWriter0.getSerializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
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
  public void test38()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Float> class0 = Float.class;
      TypeToken<Float> typeToken0 = TypeToken.get(class0);
      gson0.getAdapter(typeToken0);
      gson0.getAdapter(typeToken0);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
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
  public void test40()  throws Throwable  {
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
  public void test41()  throws Throwable  {
      Gson gson0 = new Gson();
      Character character0 = new Character('|');
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(character0);
      String string0 = gson0.toJson((JsonElement) jsonPrimitive0);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
      assertEquals("\"|\"", string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<AtomicLong> class0 = AtomicLong.class;
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(pipedOutputStream0);
      Charset charset0 = Charset.defaultCharset();
      CharsetEncoder charsetEncoder0 = charset0.newEncoder();
      OutputStreamWriter outputStreamWriter0 = new OutputStreamWriter(mockPrintStream0, charsetEncoder0);
      // Undeclared exception!
      try { 
        gson0.toJson((Object) class0, (Type) class0, (Appendable) outputStreamWriter0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Class cannot be cast to java.util.concurrent.atomic.AtomicLong
         //
         verifyException("com.google.gson.Gson$4", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonObject jsonObject0 = new JsonObject();
      File file0 = MockFile.createTempFile("java.lang.Float@0000000064", "QP'NMo-u63K!%q-.");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(file0);
      JsonWriter jsonWriter0 = new JsonWriter(mockPrintWriter0);
      gson0.toJson((JsonElement) jsonObject0, jsonWriter0);
      assertFalse(jsonWriter0.isLenient());
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
      assertTrue(jsonWriter0.getSerializeNulls());
      assertFalse(jsonWriter0.isHtmlSafe());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Gson gson0 = new Gson();
      PipedReader pipedReader0 = new PipedReader();
      Class<Integer> class0 = Integer.TYPE;
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
      Gson.FutureTypeAdapter<Object> gson_FutureTypeAdapter0 = new Gson.FutureTypeAdapter<Object>();
      Integer integer0 = new Integer((-2129));
      // Undeclared exception!
      try { 
        gson_FutureTypeAdapter0.write((JsonWriter) null, integer0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.Gson$FutureTypeAdapter", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Gson.FutureTypeAdapter<Byte> gson_FutureTypeAdapter0 = new Gson.FutureTypeAdapter<Byte>();
      Gson gson0 = new Gson();
      Class<Byte> class0 = Byte.class;
      TypeToken<Byte> typeToken0 = TypeToken.get(class0);
      TypeAdapter<Byte> typeAdapter0 = gson0.getDelegateAdapter((TypeAdapterFactory) null, typeToken0);
      gson_FutureTypeAdapter0.setDelegate(typeAdapter0);
      Byte byte0 = new Byte((byte) (-73));
      String string0 = gson_FutureTypeAdapter0.toJson(byte0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Gson.FutureTypeAdapter<AtomicLong> gson_FutureTypeAdapter0 = new Gson.FutureTypeAdapter<AtomicLong>();
      PipedReader pipedReader0 = new PipedReader();
      JsonReader jsonReader0 = new JsonReader(pipedReader0);
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
  public void test48()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Double> class0 = Double.TYPE;
      gson0.fromJson((JsonElement) null, (Type) class0);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Gson gson0 = new Gson();
      StringReader stringReader0 = new StringReader("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl");
      Class<Object> class0 = Object.class;
      gson0.fromJson((Reader) stringReader0, class0);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<AtomicLong> class0 = AtomicLong.class;
      gson0.fromJson((String) null, class0);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Gson gson0 = new Gson();
      CharBuffer charBuffer0 = CharBuffer.allocate(22);
      // Undeclared exception!
      try { 
        gson0.toJson((Object) charBuffer0, (Appendable) charBuffer0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.CharBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Gson gson0 = new Gson();
      MockFile mockFile0 = new MockFile(">c@G 6]", ">c@G 6]");
      MockFileWriter mockFileWriter0 = new MockFileWriter(mockFile0, false);
      gson0.toJson((Object) null, (Appendable) mockFileWriter0);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Gson gson0 = new Gson();
      gson0.toJsonTree((Object) null);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Gson gson0 = new Gson();
      Excluder excluder0 = Excluder.DEFAULT;
      // Undeclared exception!
      try { 
        gson0.getDelegateAdapter((TypeAdapterFactory) excluder0, (TypeToken<AtomicLong>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Gson gson0 = new Gson();
      PipedWriter pipedWriter0 = new PipedWriter();
      // Undeclared exception!
      gson0.toJsonTree((Object) pipedWriter0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
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
  public void test57()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Float> class0 = Float.class;
      String string0 = gson0.toJson((Object) null, (Type) class0);
      assertEquals("null", string0);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Gson gson0 = new Gson();
      Float float0 = new Float((-1218.55F));
      gson0.toJson((Object) float0);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Float> class0 = Float.TYPE;
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      gson0.fromJson((JsonElement) jsonNull0, (Type) class0);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Gson gson0 = new Gson();
      gson0.toJson((Object) gson0);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<AtomicLong> class0 = AtomicLong.class;
      try { 
        gson0.fromJson("IP", class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NumberFormatException: For input string: \"IP\"
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$11", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Gson gson0 = new Gson();
      AtomicLong atomicLong0 = new AtomicLong(1L);
      JsonPrimitive jsonPrimitive0 = (JsonPrimitive)gson0.toJsonTree((Object) atomicLong0);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
      assertTrue(jsonPrimitive0.isNumber());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Gson gson0 = new Gson();
      gson0.fieldNamingStrategy();
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Gson gson0 = new Gson();
      gson0.newBuilder();
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Integer> class0 = Integer.class;
      gson0.getAdapter(class0);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Gson gson0 = new Gson();
      gson0.excluder();
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Gson gson0 = new Gson();
      boolean boolean0 = gson0.htmlSafe();
      assertTrue(boolean0);
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonArray jsonArray0 = new JsonArray();
      Class<Double> class0 = Double.class;
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
  public void test69()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<AtomicLong> class0 = AtomicLong.class;
      gson0.fromJson("", class0);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Gson gson0 = new Gson();
      String string0 = gson0.toString();
      Class<Integer> class0 = Integer.TYPE;
      // Undeclared exception!
      try { 
        gson0.toJson((Object) string0, (Type) class0, (JsonWriter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Gson gson0 = new Gson();
      AtomicLongArray atomicLongArray0 = new AtomicLongArray(2);
      gson0.toJson((Object) atomicLongArray0);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Object> class0 = Object.class;
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
  public void test73()  throws Throwable  {
      Class<AtomicLong> class0 = AtomicLong.class;
      Gson gson0 = new Gson();
      // Undeclared exception!
      try { 
        gson0.toJsonTree((Object) "AssertionError (GSON 2.8.6): ", (Type) class0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.util.concurrent.atomic.AtomicLong
         //
         verifyException("com.google.gson.Gson$4", e);
      }
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Gson gson0 = new Gson();
      String string0 = gson0.toJson((Object) null);
      assertEquals("null", string0);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      Gson gson0 = new Gson();
      boolean boolean0 = gson0.serializeNulls();
      assertFalse(boolean0);
      assertTrue(gson0.htmlSafe());
  }
}
