/*
 * This file was automatically generated by EvoSuite
 * Fri May 22 08:28:37 GMT 2020
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
import java.io.CharArrayWriter;
import java.io.OutputStreamWriter;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.nio.BufferOverflowException;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Gson_ESTest extends Gson_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Gson gson0 = new Gson();
      Long long0 = new Long((-2917L));
      Class<Float> class0 = Float.TYPE;
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      Charset charset0 = Charset.defaultCharset();
      CharsetEncoder charsetEncoder0 = charset0.newEncoder();
      OutputStreamWriter outputStreamWriter0 = new OutputStreamWriter(byteArrayOutputStream0, charsetEncoder0);
      gson0.toJson((Object) long0, (Type) class0, (Appendable) outputStreamWriter0);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Type> class0 = Type.class;
      long[] longArray0 = new long[6];
      AtomicLongArray atomicLongArray0 = new AtomicLongArray(longArray0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("java.lang.reflect.Type");
      JsonWriter jsonWriter0 = gson0.newJsonWriter(mockPrintWriter0);
      gson0.toJson((Object) atomicLongArray0, (Type) class0, jsonWriter0);
      assertFalse(jsonWriter0.isHtmlSafe());
      assertFalse(jsonWriter0.isLenient());
      assertTrue(gson0.htmlSafe());
      assertFalse(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonArray jsonArray0 = new JsonArray();
      MockFile mockFile0 = new MockFile(". Forgot to register a type adapter?", "");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFile0);
      gson0.toJson((JsonElement) jsonArray0, (Appendable) mockPrintWriter0);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
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
  public void test04()  throws Throwable  {
      Gson.checkValidFloatingPoint(760.246118);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Gson gson0 = new Gson();
      Float float0 = new Float((-567.6F));
      Class<Double> class0 = Double.TYPE;
      gson0.toJsonTree((Object) float0, (Type) class0);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Object> class0 = Object.class;
      gson0.fromJson("com.google.gson.Gson", class0);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Short> class0 = Short.TYPE;
      StringReader stringReader0 = new StringReader("");
      gson0.fromJson((Reader) stringReader0, (Type) class0);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Gson gson0 = new Gson();
      StringReader stringReader0 = new StringReader("  ");
      Class<Integer> class0 = Integer.class;
      gson0.fromJson((Reader) stringReader0, class0);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Byte> class0 = Byte.class;
      gson0.fromJson((JsonElement) null, class0);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Gson gson0 = new Gson();
      Float float0 = new Float(0.0);
      // Undeclared exception!
      try { 
        gson0.toJsonTree((Object) float0, (Type) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.$Gson$Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Float> class0 = Float.TYPE;
      // Undeclared exception!
      try { 
        gson0.toJsonTree((Object) "", (Type) class0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.lang.Number
         //
         verifyException("com.google.gson.Gson$2", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Gson gson0 = new Gson();
      PipedWriter pipedWriter0 = new PipedWriter();
      // Undeclared exception!
      gson0.toJsonTree((Object) pipedWriter0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Float> class0 = Float.TYPE;
      // Undeclared exception!
      try { 
        gson0.toJsonTree((Object) class0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Attempted to serialize java.lang.Class: float. Forgot to register a type adapter?
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Short> class0 = Short.class;
      // Undeclared exception!
      try { 
        gson0.toJson((Object) null, (Type) class0, (Appendable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.Streams$AppendableWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Gson gson0 = new Gson();
      Long long0 = new Long((-4722L));
      CharArrayWriter charArrayWriter0 = new CharArrayWriter(47);
      JsonWriter jsonWriter0 = new JsonWriter(charArrayWriter0);
      // Undeclared exception!
      try { 
        gson0.toJson((Object) long0, (Type) null, jsonWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.$Gson$Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Gson gson0 = new Gson();
      Long long0 = new Long((-2917L));
      Class<Float> class0 = Float.TYPE;
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      Charset charset0 = Charset.defaultCharset();
      CharsetEncoder charsetEncoder0 = charset0.newEncoder();
      OutputStreamWriter outputStreamWriter0 = new OutputStreamWriter(byteArrayOutputStream0, charsetEncoder0);
      JsonWriter jsonWriter0 = new JsonWriter(outputStreamWriter0);
      JsonWriter jsonWriter1 = jsonWriter0.name("{\"fruit\":\"Apple\",\"size\":{},\"color\":\"Red\",\"\":false,\"value2\":false,\"number\":\"1\"}");
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
  public void test17()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Short> class0 = Short.class;
      TypeToken<Short> typeToken0 = TypeToken.get(class0);
      MockFile mockFile0 = new MockFile("com.google.gson.internal.ConstructorConstructor$12");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFile0);
      JsonWriter jsonWriter0 = new JsonWriter(mockPrintWriter0);
      // Undeclared exception!
      try { 
        gson0.toJson((Object) typeToken0, (Type) class0, jsonWriter0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.gson.reflect.TypeToken cannot be cast to java.lang.Number
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$6", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Gson gson0 = new Gson();
      Gson.FutureTypeAdapter<Long> gson_FutureTypeAdapter0 = new Gson.FutureTypeAdapter<Long>();
      // Undeclared exception!
      try { 
        gson0.toJson((Object) gson_FutureTypeAdapter0, (Type) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.$Gson$Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Gson gson0 = new Gson();
      Float float0 = Float.valueOf(1.0F);
      Class<Character> class0 = Character.TYPE;
      // Undeclared exception!
      try { 
        gson0.toJson((Object) float0, (Type) class0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Gson gson0 = new Gson();
      Short short0 = new Short((short)1);
      CharBuffer charBuffer0 = CharBuffer.allocate((short)1);
      // Undeclared exception!
      try { 
        gson0.toJson((Object) short0, (Appendable) charBuffer0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.CharBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Gson gson0 = new Gson();
      Gson.FutureTypeAdapter<DefaultDateTypeAdapter> gson_FutureTypeAdapter0 = new Gson.FutureTypeAdapter<DefaultDateTypeAdapter>();
      PipedWriter pipedWriter0 = new PipedWriter();
      try { 
        gson0.toJson((Object) gson_FutureTypeAdapter0, (Appendable) pipedWriter0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.IOException: Pipe not connected
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Gson gson0 = new Gson();
      PipedWriter pipedWriter0 = new PipedWriter();
      Short short0 = new Short((short)4412);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(short0);
      try { 
        gson0.toJson((JsonElement) jsonPrimitive0, (Appendable) pipedWriter0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.IOException: Pipe not connected
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
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
  public void test24()  throws Throwable  {
      Excluder excluder0 = Excluder.DEFAULT;
      Gson gson0 = new Gson();
      // Undeclared exception!
      try { 
        gson0.getDelegateAdapter((TypeAdapterFactory) excluder0, (TypeToken<Excluder>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Type> class0 = Type.class;
      TypeToken<Type> typeToken0 = TypeToken.get(class0);
      Class<? super Type> class1 = typeToken0.getRawType();
      // Undeclared exception!
      try { 
        gson0.fromJson("%pj`[Aa}lDkNz0$k", (Type) class1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to invoke no-args constructor for interface java.lang.reflect.Type. Registering an InstanceCreator with Gson for this type may fix this problem.
         //
         verifyException("com.google.gson.internal.ConstructorConstructor$14", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Gson gson0 = new Gson();
      // Undeclared exception!
      try { 
        gson0.fromJson("kC5M", (Type) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.$Gson$Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Double> class0 = Double.class;
      // Undeclared exception!
      try { 
        gson0.fromJson("%pj`[Aa}lDkNz0$k", class0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Float> class0 = Float.TYPE;
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
  public void test29()  throws Throwable  {
      Gson gson0 = new Gson();
      StringReader stringReader0 = new StringReader("b-ucA0YuqMlLn\"");
      Class<Float> class0 = Float.class;
      // Undeclared exception!
      try { 
        gson0.fromJson((Reader) stringReader0, class0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Integer> class0 = Integer.class;
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
  public void test31()  throws Throwable  {
      Gson gson0 = new Gson();
      PipedReader pipedReader0 = new PipedReader(11);
      Class<AtomicLongArray> class0 = AtomicLongArray.class;
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
  public void test32()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Double> class0 = Double.class;
      StringReader stringReader0 = new StringReader("IQPO)>");
      JsonReader jsonReader0 = new JsonReader(stringReader0);
      // Undeclared exception!
      try { 
        gson0.fromJson(jsonReader0, (Type) class0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Gson gson0 = new Gson();
      // Undeclared exception!
      try { 
        gson0.fromJson((JsonReader) null, (Type) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Gson gson0 = new Gson();
      PipedReader pipedReader0 = new PipedReader();
      JsonReader jsonReader0 = new JsonReader(pipedReader0);
      try { 
        gson0.fromJson(jsonReader0, (Type) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.IOException: Pipe not connected
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Gson gson0 = new Gson();
      Long long0 = new Long(663L);
      JsonElement jsonElement0 = gson0.toJsonTree((Object) long0);
      Class<Type> class0 = Type.class;
      TypeToken<Type> typeToken0 = TypeToken.get(class0);
      Class<? super Type> class1 = typeToken0.getRawType();
      // Undeclared exception!
      try { 
        gson0.fromJson(jsonElement0, (Type) class1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to invoke no-args constructor for interface java.lang.reflect.Type. Registering an InstanceCreator with Gson for this type may fix this problem.
         //
         verifyException("com.google.gson.internal.ConstructorConstructor$14", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Gson gson0 = new Gson();
      StringWriter stringWriter0 = new StringWriter();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) stringWriter0);
      Class<Character> class0 = Character.TYPE;
      try { 
        gson0.fromJson(jsonElement0, (Type) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected STRING but was BEGIN_OBJECT at path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonArray jsonArray0 = new JsonArray();
      Class<String> class0 = String.class;
      try { 
        gson0.fromJson((JsonElement) jsonArray0, class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected STRING but was BEGIN_ARRAY at path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Gson.FutureTypeAdapter<Integer> gson_FutureTypeAdapter0 = new Gson.FutureTypeAdapter<Integer>();
      gson_FutureTypeAdapter0.setDelegate(gson_FutureTypeAdapter0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonArray jsonArray0 = new JsonArray(1148);
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
  public void test40()  throws Throwable  {
      Gson gson0 = new Gson();
      StringReader stringReader0 = new StringReader("");
      JsonReader jsonReader0 = gson0.newJsonReader(stringReader0);
      Class<Boolean> class0 = Boolean.TYPE;
      gson0.fromJson(jsonReader0, (Type) class0);
      assertTrue(gson0.htmlSafe());
      assertFalse(jsonReader0.isLenient());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Gson gson0 = new Gson();
      gson0.fromJson((String) null, (Type) null);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
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
  public void test43()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Short> class0 = Short.class;
      TypeToken<Short> typeToken0 = TypeToken.get(class0);
      gson0.getAdapter(typeToken0);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Gson gson0 = new Gson();
      // Undeclared exception!
      try { 
        gson0.toJson((JsonElement) null, (Appendable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.Streams$AppendableWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Gson gson0 = new Gson();
      Short short0 = new Short((short) (-804));
      Class<Short> class0 = Short.TYPE;
      // Undeclared exception!
      try { 
        gson0.toJson((Object) short0, (Type) class0, (JsonWriter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("com.google.gson.internal.ConstructorConstructor$8");
      String string0 = gson0.toJson((JsonElement) jsonPrimitive0);
      assertFalse(gson0.serializeNulls());
      assertEquals("\"com.google.gson.internal.ConstructorConstructor$8\"", string0);
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Long> class0 = Long.class;
      TypeAdapter<Long> typeAdapter0 = gson0.getAdapter(class0);
      // Undeclared exception!
      try { 
        gson0.toJson((Object) typeAdapter0, (Type) class0, (Appendable) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.gson.internal.bind.TypeAdapters$11 cannot be cast to java.lang.Number
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$11", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Gson gson0 = new Gson();
      // Undeclared exception!
      try { 
        gson0.fromJson((Reader) null, (Type) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // in == null
         //
         verifyException("com.google.gson.stream.JsonReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Gson.FutureTypeAdapter<DefaultDateTypeAdapter> gson_FutureTypeAdapter0 = new Gson.FutureTypeAdapter<DefaultDateTypeAdapter>();
      // Undeclared exception!
      try { 
        gson_FutureTypeAdapter0.read((JsonReader) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.Gson$FutureTypeAdapter", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Short> class0 = Short.class;
      gson0.fromJson((JsonElement) null, (Type) class0);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Object> class0 = Object.class;
      try { 
        gson0.fromJson("{serializeNulls:", class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.EOFException: End of input at line 1 column 17 path $.serializeNulls
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Object> class0 = Object.class;
      gson0.fromJson("", class0);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Gson gson0 = new Gson();
      StringWriter stringWriter0 = new StringWriter();
      gson0.toJson((Object) stringWriter0, (Appendable) stringWriter0);
      assertEquals("{\"buf\":\"{\",\"lock\":\"{\\\"buf\\\":\\\"{\\\"\"}", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
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
  public void test55()  throws Throwable  {
      Gson gson0 = new Gson();
      gson0.toJsonTree((Object) null);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Gson gson0 = new Gson();
      Excluder excluder0 = Excluder.DEFAULT;
      Class<Double> class0 = Double.class;
      TypeToken<Double> typeToken0 = TypeToken.get(class0);
      TypeAdapter<Double> typeAdapter0 = gson0.getDelegateAdapter((TypeAdapterFactory) excluder0, typeToken0);
      assertTrue(gson0.htmlSafe());
      assertNotNull(typeAdapter0);
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Double> class0 = Double.class;
      TypeToken<Double> typeToken0 = TypeToken.get(class0);
      Excluder excluder0 = new Excluder();
      TypeAdapter<Double> typeAdapter0 = gson0.getDelegateAdapter((TypeAdapterFactory) excluder0, typeToken0);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
      assertNotNull(typeAdapter0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Gson gson0 = new Gson();
      PipedWriter pipedWriter0 = new PipedWriter();
      PipedReader pipedReader0 = new PipedReader(pipedWriter0);
      JsonReader jsonReader0 = gson0.newJsonReader(pipedReader0);
      // Undeclared exception!
      gson0.toJson((Object) jsonReader0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Gson gson0 = new Gson();
      // Undeclared exception!
      try { 
        gson0.getAdapter((TypeToken<Short>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Float> class0 = Float.TYPE;
      gson0.toJsonTree((Object) null, (Type) class0);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Gson gson0 = new Gson();
      Float float0 = new Float(0.0F);
      gson0.toJson((Object) float0);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Float> class0 = Float.TYPE;
      try { 
        gson0.fromJson("9,/FWsCt+/d\"R>gM'", (Type) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 3 path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Class<Double> class0 = Double.class;
      Gson gson0 = new Gson();
      String string0 = gson0.toJson((Object) null, (Type) class0);
      assertEquals("null", string0);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Double> class0 = Double.TYPE;
      // Undeclared exception!
      try { 
        gson0.fromJson("b-ucA0YuqMlLn\"", (Type) class0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<AtomicLong> class0 = AtomicLong.class;
      try { 
        gson0.fromJson("9,/FWsCt+/d\"R>gM'", class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 3 path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Gson gson0 = new Gson();
      AtomicLong atomicLong0 = new AtomicLong((-783L));
      gson0.toJson((Object) atomicLong0);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Gson gson0 = new Gson();
      gson0.fieldNamingStrategy();
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Gson gson0 = new Gson();
      gson0.newBuilder();
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Gson gson0 = new Gson();
      gson0.excluder();
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Gson gson0 = new Gson();
      boolean boolean0 = gson0.htmlSafe();
      assertFalse(gson0.serializeNulls());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonObject jsonObject0 = new JsonObject();
      Class<Object> class0 = Object.class;
      Object object0 = gson0.fromJson((JsonElement) jsonObject0, class0);
      assertNotNull(object0);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Gson gson0 = new Gson();
      gson0.toString();
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        gson0.toJson((Object) class0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Attempted to serialize java.lang.Class: java.lang.Object. Forgot to register a type adapter?
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Gson gson0 = new Gson();
      StringReader stringReader0 = new StringReader(">'Ak-");
      Class<String> class0 = String.class;
      gson0.fromJson((Reader) stringReader0, class0);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      Gson gson0 = new Gson();
      AtomicLongArray atomicLongArray0 = new AtomicLongArray(4);
      JsonArray jsonArray0 = (JsonArray)gson0.toJsonTree((Object) atomicLongArray0);
      assertTrue(gson0.htmlSafe());
      assertEquals(4, jsonArray0.size());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      Gson gson0 = new Gson();
      String string0 = gson0.toJson((Object) null);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
      assertEquals("null", string0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      Gson gson0 = new Gson();
      boolean boolean0 = gson0.serializeNulls();
      assertTrue(gson0.htmlSafe());
      assertFalse(boolean0);
  }
}
