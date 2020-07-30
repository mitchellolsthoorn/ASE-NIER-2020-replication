/*
 * This file was automatically generated by EvoSuite
 * Fri May 22 11:19:05 GMT 2020
 */

package com.google.gson;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonPrimitive;
import com.google.gson.LongSerializationPolicy;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.Excluder;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.BufferedOutputStream;
import java.io.CharArrayWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.time.Instant;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Gson_ESTest extends Gson_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Gson gson0 = new Gson();
      BigDecimal bigDecimal0 = new BigDecimal(1L);
      Class<Double> class0 = Double.class;
      TypeToken<Double> typeToken0 = TypeToken.get(class0);
      Class<? super Double> class1 = typeToken0.getRawType();
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null, 9);
      Charset charset0 = Charset.defaultCharset();
      CharsetEncoder charsetEncoder0 = charset0.newEncoder();
      OutputStreamWriter outputStreamWriter0 = new OutputStreamWriter(bufferedOutputStream0, charsetEncoder0);
      gson0.toJson((Object) bigDecimal0, (Type) class1, (Appendable) outputStreamWriter0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Gson.FutureTypeAdapter<Date> gson_FutureTypeAdapter0 = new Gson.FutureTypeAdapter<Date>();
      Instant instant0 = MockInstant.ofEpochSecond(0L, 0L);
      Date date0 = Date.from(instant0);
      // Undeclared exception!
      try { 
        gson_FutureTypeAdapter0.write((JsonWriter) null, date0);
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
      Gson.checkValidFloatingPoint(1.0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Gson gson0 = new Gson();
      BigInteger bigInteger0 = BigInteger.ONE;
      BigDecimal bigDecimal0 = new BigDecimal(bigInteger0);
      Class<Type> class0 = Type.class;
      TypeToken<Type> typeToken0 = TypeToken.get(class0);
      Class<? super Type> class1 = typeToken0.getRawType();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) bigDecimal0, (Type) class1);
      Class<AtomicLongArray> class2 = AtomicLongArray.class;
      try { 
        gson0.fromJson(jsonElement0, class2);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected BEGIN_ARRAY but was BEGIN_OBJECT at path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Gson gson0 = new Gson();
      CharArrayWriter charArrayWriter0 = new CharArrayWriter(2139);
      BigInteger bigInteger0 = BigInteger.TEN;
      gson0.toJson((Object) bigInteger0, (Appendable) charArrayWriter0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Gson gson0 = new Gson();
      LongSerializationPolicy longSerializationPolicy0 = LongSerializationPolicy.DEFAULT;
      Long long0 = new Long((-984L));
      JsonElement jsonElement0 = longSerializationPolicy0.serialize(long0);
      Class<Long> class0 = Long.class;
      gson0.fromJson(jsonElement0, class0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<BigInteger> class0 = BigInteger.class;
      gson0.toJsonTree((Object) null, (Type) class0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Gson gson0 = new Gson();
      Gson.FutureTypeAdapter<BigInteger> gson_FutureTypeAdapter0 = new Gson.FutureTypeAdapter<BigInteger>();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) gson_FutureTypeAdapter0);
      CharArrayWriter charArrayWriter0 = new CharArrayWriter(2139);
      gson0.toJson(jsonElement0, (Appendable) charArrayWriter0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonArray jsonArray0 = new JsonArray();
      gson0.toJsonTree((Object) jsonArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Gson gson0 = new Gson();
      BigDecimal bigDecimal0 = new BigDecimal(0.0);
      Class<Long> class0 = Long.TYPE;
      gson0.toJson((Object) bigDecimal0, (Type) class0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<BigInteger> class0 = BigInteger.class;
      StringReader stringReader0 = new StringReader("");
      gson0.fromJson((Reader) stringReader0, (Type) class0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<BigInteger> class0 = BigInteger.class;
      StringReader stringReader0 = new StringReader("null");
      gson0.fromJson((Reader) stringReader0, class0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Object> class0 = Object.class;
      StringReader stringReader0 = new StringReader("rIJPOb)FY<5m|(F");
      gson0.fromJson((Reader) stringReader0, class0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Excluder> class0 = Excluder.class;
      // Undeclared exception!
      try { 
        gson0.toJsonTree((Object) "{\"x\":\"hello\",\"y\":[],\"z\":true,\"a\":[],\"GSON cannot serialize \":{},\"xx\":true}", (Type) class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Float> class0 = Float.class;
      TypeToken<Float> typeToken0 = TypeToken.get(class0);
      // Undeclared exception!
      try { 
        gson0.toJsonTree((Object) typeToken0, (Type) class0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.gson.reflect.TypeToken cannot be cast to java.lang.Number
         //
         verifyException("com.google.gson.Gson$2", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Gson gson0 = new Gson();
      PipedReader pipedReader0 = new PipedReader();
      // Undeclared exception!
      gson0.toJsonTree((Object) pipedReader0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
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
  public void test17()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<BigInteger> class0 = BigInteger.class;
      PipedWriter pipedWriter0 = new PipedWriter();
      // Undeclared exception!
      try { 
        gson0.toJson((Object) class0, (Appendable) pipedWriter0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Attempted to serialize java.lang.Class: java.math.BigInteger. Forgot to register a type adapter?
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Gson gson0 = new Gson();
      Excluder excluder0 = Excluder.DEFAULT;
      PipedWriter pipedWriter0 = new PipedWriter();
      try { 
        gson0.toJson((Object) excluder0, (Appendable) pipedWriter0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.IOException: Pipe not connected
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Gson gson0 = new Gson();
      PipedReader pipedReader0 = new PipedReader();
      // Undeclared exception!
      gson0.toJson((Object) pipedReader0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Double> class0 = Double.class;
      // Undeclared exception!
      try { 
        gson0.toJson((Object) class0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Attempted to serialize java.lang.Class: java.lang.Double. Forgot to register a type adapter?
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
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
  public void test22()  throws Throwable  {
      Gson gson0 = new Gson();
      // Undeclared exception!
      try { 
        gson0.getDelegateAdapter((TypeAdapterFactory) null, (TypeToken<AtomicLong>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Float> class0 = Float.TYPE;
      // Undeclared exception!
      try { 
        gson0.fromJson("+", (Type) class0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Gson gson0 = new Gson();
      // Undeclared exception!
      try { 
        gson0.fromJson("{\"fruit\":\"Apple\",\"size\":\"Large\",\"color\":\"Red\",\"value\":true,\"value2\":false,\"number\":\"1\",\"x\":true}", (Type) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.$Gson$Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Excluder> class0 = Excluder.class;
      try { 
        gson0.fromJson("=0=;~kKPv", class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected value at line 1 column 1 path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<BigDecimal> class0 = BigDecimal.class;
      TypeToken<BigDecimal> typeToken0 = TypeToken.get(class0);
      Type type0 = typeToken0.getType();
      // Undeclared exception!
      try { 
        gson0.fromJson((Reader) null, type0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // in == null
         //
         verifyException("com.google.gson.stream.JsonReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<BigInteger> class0 = BigInteger.class;
      StringReader stringReader0 = new StringReader("J6|^Dhdun(VCQ@T?qa");
      try { 
        gson0.fromJson((Reader) stringReader0, (Type) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NumberFormatException: For input string: \"J6|^Dhdun\"
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$18", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
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
  public void test29()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<BigInteger> class0 = BigInteger.class;
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
  public void test30()  throws Throwable  {
      Gson gson0 = new Gson();
      PipedReader pipedReader0 = new PipedReader();
      JsonReader jsonReader0 = new JsonReader(pipedReader0);
      Class<Boolean> class0 = Boolean.TYPE;
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
  public void test31()  throws Throwable  {
      Gson gson0 = new Gson();
      StringReader stringReader0 = new StringReader("");
      JsonReader jsonReader0 = new JsonReader(stringReader0);
      Class<Boolean> class0 = Boolean.TYPE;
      gson0.fromJson(jsonReader0, (Type) class0);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
      assertFalse(jsonReader0.isLenient());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Gson gson0 = new Gson();
      MockFile mockFile0 = new MockFile(">K$%c2acDC|d!gOF&s");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFile0);
      JsonWriter jsonWriter0 = gson0.newJsonWriter(mockPrintWriter0);
      assertTrue(gson0.htmlSafe());
      assertFalse(jsonWriter0.getSerializeNulls());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Float> class0 = Float.class;
      TypeToken<Float> typeToken0 = TypeToken.get(class0);
      gson0.getAdapter(typeToken0);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Float> class0 = Float.class;
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      JsonElement jsonElement0 = gson0.toJsonTree((Object) bigDecimal0, (Type) class0);
      // Undeclared exception!
      try { 
        gson0.toJson(jsonElement0, (Appendable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.Streams$AppendableWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Gson gson0 = new Gson();
      PipedReader pipedReader0 = new PipedReader();
      PipedWriter pipedWriter0 = new PipedWriter(pipedReader0);
      Class<AtomicLong> class0 = AtomicLong.class;
      Double double0 = new Double(1217);
      // Undeclared exception!
      try { 
        gson0.toJson((Object) double0, (Type) class0, (Appendable) pipedWriter0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Double cannot be cast to java.util.concurrent.atomic.AtomicLong
         //
         verifyException("com.google.gson.Gson$4", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Gson gson0 = new Gson();
      Gson.FutureTypeAdapter<Integer> gson_FutureTypeAdapter0 = new Gson.FutureTypeAdapter<Integer>();
      PipedReader pipedReader0 = new PipedReader();
      Gson.FutureTypeAdapter<Integer> gson_FutureTypeAdapter1 = new Gson.FutureTypeAdapter<Integer>();
      gson_FutureTypeAdapter0.setDelegate(gson_FutureTypeAdapter1);
      JsonReader jsonReader0 = gson0.newJsonReader(pipedReader0);
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
  public void test37()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Excluder> class0 = Excluder.class;
      gson0.fromJson("", class0);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<AtomicLong> class0 = AtomicLong.class;
      gson0.fromJson((String) null, (Type) class0);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Gson gson0 = new Gson();
      String string0 = gson0.toJson((Object) null);
      assertEquals("null", string0);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Gson gson0 = new Gson();
      gson0.toJsonTree((Object) null);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Gson gson0 = new Gson();
      Excluder excluder0 = Excluder.DEFAULT;
      Class<Double> class0 = Double.class;
      TypeToken<Double> typeToken0 = TypeToken.get(class0);
      TypeAdapter<Double> typeAdapter0 = gson0.getDelegateAdapter((TypeAdapterFactory) excluder0, typeToken0);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
      assertNotNull(typeAdapter0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Gson gson0 = new Gson();
      Excluder excluder0 = Excluder.DEFAULT;
      Excluder excluder1 = excluder0.disableInnerClassSerialization();
      Class<Double> class0 = Double.TYPE;
      TypeToken<Double> typeToken0 = TypeToken.get(class0);
      // Undeclared exception!
      try { 
        gson0.getDelegateAdapter((TypeAdapterFactory) excluder1, typeToken0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // GSON cannot serialize double
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Gson gson0 = new Gson();
      PipedWriter pipedWriter0 = new PipedWriter();
      // Undeclared exception!
      gson0.toJson((Object) pipedWriter0, (Appendable) pipedWriter0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Gson gson0 = new Gson();
      // Undeclared exception!
      try { 
        gson0.getAdapter((TypeToken<AtomicLong>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Gson gson0 = new Gson();
      long[] longArray0 = new long[1];
      AtomicLongArray atomicLongArray0 = new AtomicLongArray(longArray0);
      gson0.toJson((Object) atomicLongArray0);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Gson gson0 = new Gson();
      Float float0 = new Float(0.0F);
      gson0.toJsonTree((Object) float0);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Gson gson0 = new Gson();
      Gson.FutureTypeAdapter<BigInteger> gson_FutureTypeAdapter0 = new Gson.FutureTypeAdapter<BigInteger>();
      Class<Object> class0 = Object.class;
      Class<Float> class1 = Float.class;
      JsonElement jsonElement0 = gson0.toJsonTree((Object) gson_FutureTypeAdapter0, (Type) class0);
      try { 
        gson0.fromJson(jsonElement0, (Type) class1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected NUMBER but was BEGIN_OBJECT at path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Gson gson0 = new Gson();
      Excluder excluder0 = Excluder.DEFAULT;
      gson0.toJson((Object) excluder0);
      Class<Excluder> class0 = Excluder.class;
      TypeToken<Excluder> typeToken0 = TypeToken.get(class0);
      gson0.getAdapter(typeToken0);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Double> class0 = Double.TYPE;
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      gson0.fromJson((JsonElement) jsonNull0, (Type) class0);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Double> class0 = Double.TYPE;
      StringReader stringReader0 = new StringReader("JsonReader is closed");
      // Undeclared exception!
      try { 
        gson0.fromJson((Reader) stringReader0, (Type) class0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<AtomicLong> class0 = AtomicLong.class;
      try { 
        gson0.fromJson("[java.lang.Long@0000000025]", (Type) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected a long but was BEGIN_ARRAY at line 1 column 2 path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Gson gson0 = new Gson();
      AtomicLong atomicLong0 = new AtomicLong(0L);
      JsonPrimitive jsonPrimitive0 = (JsonPrimitive)gson0.toJsonTree((Object) atomicLong0);
      assertFalse(gson0.serializeNulls());
      assertFalse(jsonPrimitive0.isString());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Gson gson0 = new Gson();
      gson0.fieldNamingStrategy();
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Gson gson0 = new Gson();
      gson0.newBuilder();
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Float> class0 = Float.TYPE;
      TypeAdapter<Float> typeAdapter0 = gson0.getAdapter(class0);
      assertFalse(gson0.serializeNulls());
      assertNotNull(typeAdapter0);
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Gson gson0 = new Gson();
      gson0.excluder();
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Gson gson0 = new Gson();
      boolean boolean0 = gson0.htmlSafe();
      assertTrue(boolean0);
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Excluder> class0 = Excluder.class;
      Excluder excluder0 = gson0.fromJson("{\"x\":null,\"y\":7,\"z\":{},\"\":[],\"GSON cannot serialize \":false,\"xx\":true,\"DefaultDateTypeAdapter\":{}}", class0);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
      assertNotNull(excluder0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Gson gson0 = new Gson();
      gson0.toString();
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Gson gson0 = new Gson();
      PipedReader pipedReader0 = new PipedReader();
      Class<Float> class0 = Float.class;
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
  public void test61()  throws Throwable  {
      Gson gson0 = new Gson();
      Integer integer0 = new Integer(646);
      Class<Character> class0 = Character.TYPE;
      // Undeclared exception!
      try { 
        gson0.toJson((Object) integer0, (Type) class0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to java.lang.Character
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$15", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Gson gson0 = new Gson();
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(bigDecimal0);
      gson0.toJson((JsonElement) jsonPrimitive0);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Gson gson0 = new Gson();
      boolean boolean0 = gson0.serializeNulls();
      assertTrue(gson0.htmlSafe());
      assertFalse(boolean0);
  }
}
