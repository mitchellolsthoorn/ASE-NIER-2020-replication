/*
 * This file was automatically generated by EvoSuite
 * Thu May 21 19:01:48 GMT 2020
 */

package com.google.gson;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.DefaultDateTypeAdapter;
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
import java.io.CharArrayWriter;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigInteger;
import java.nio.BufferOverflowException;
import java.nio.CharBuffer;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileWriter;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Gson_ESTest extends Gson_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Boolean> class0 = Boolean.TYPE;
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("n2&kVA)`s>");
      gson0.toJson((Object) null, (Type) class0, (Appendable) mockPrintWriter0);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Integer> class0 = Integer.TYPE;
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      JsonWriter jsonWriter0 = new JsonWriter(charArrayWriter0);
      gson0.toJson((Object) null, (Type) class0, jsonWriter0);
      assertFalse(jsonWriter0.isHtmlSafe());
      assertTrue(jsonWriter0.getSerializeNulls());
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
      assertFalse(jsonWriter0.isLenient());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Gson gson0 = new Gson();
      BigInteger bigInteger0 = BigInteger.ONE;
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(bigInteger0);
      MockFileWriter mockFileWriter0 = new MockFileWriter("9SA", true);
      gson0.toJson((JsonElement) jsonPrimitive0, (Appendable) mockFileWriter0);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Gson.checkValidFloatingPoint((-545.56333951804));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Gson gson0 = new Gson();
      AtomicLong atomicLong0 = new AtomicLong((short)7);
      gson0.toJson((Object) atomicLong0);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Gson gson0 = new Gson();
      Byte byte0 = new Byte((byte)23);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(";Sc-B@tZ:$N[");
      gson0.toJson((Object) byte0, (Appendable) mockPrintWriter0);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Gson gson0 = new Gson();
      Double double0 = new Double(399.387);
      Class<Float> class0 = Float.class;
      TypeToken<Float> typeToken0 = TypeToken.get(class0);
      Class<? super Float> class1 = typeToken0.getRawType();
      gson0.toJsonTree((Object) double0, (Type) class1);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Object> class0 = Object.class;
      Excluder excluder0 = new Excluder();
      gson0.toJsonTree((Object) excluder0, (Type) class0);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Gson gson0 = new Gson();
      AtomicLongArray atomicLongArray0 = new AtomicLongArray(59);
      Class<Object> class0 = Object.class;
      JsonArray jsonArray0 = (JsonArray)gson0.toJsonTree((Object) atomicLongArray0, (Type) class0);
      assertTrue(gson0.htmlSafe());
      assertEquals(59, jsonArray0.size());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Gson gson0 = new Gson();
      Short short0 = new Short((short)7);
      gson0.toJsonTree((Object) short0);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Gson gson0 = new Gson();
      gson0.toJsonTree((Object) gson0);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Gson gson0 = new Gson();
      AtomicLongArray atomicLongArray0 = new AtomicLongArray(1);
      JsonArray jsonArray0 = (JsonArray)gson0.toJsonTree((Object) atomicLongArray0);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
      assertEquals(1, jsonArray0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Gson gson0 = new Gson();
      Float float0 = Float.valueOf((-1.0F));
      Class<Double> class0 = Double.TYPE;
      gson0.toJson((Object) float0, (Type) class0);
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<BigInteger> class0 = BigInteger.class;
      gson0.fromJson("+0000", class0);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringReader stringReader0 = new StringReader("2");
      Gson gson0 = new Gson();
      Class<Long> class0 = Long.class;
      gson0.fromJson((Reader) stringReader0, class0);
      gson0.fromJson((Reader) stringReader0, (Type) class0);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringReader stringReader0 = new StringReader("2");
      char[] charArray0 = new char[8];
      stringReader0.read(charArray0);
      Gson gson0 = new Gson();
      Class<Long> class0 = Long.class;
      gson0.fromJson((Reader) stringReader0, class0);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Object> class0 = Object.class;
      gson0.fromJson((JsonElement) null, class0);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonObject jsonObject0 = new JsonObject();
      Class<MockDate> class0 = MockDate.class;
      gson0.fromJson((JsonElement) jsonObject0, class0);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        gson0.toJsonTree((Object) class0, (Type) class0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Attempted to serialize java.lang.Class: java.lang.Object. Forgot to register a type adapter?
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Gson gson0 = new Gson();
      // Undeclared exception!
      try { 
        gson0.toJsonTree((Object) "", (Type) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.$Gson$Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<DefaultDateTypeAdapter> class0 = DefaultDateTypeAdapter.class;
      AtomicLong atomicLong0 = new AtomicLong((-2151L));
      // Undeclared exception!
      try { 
        gson0.toJsonTree((Object) atomicLong0, (Type) class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Float> class0 = Float.TYPE;
      // Undeclared exception!
      try { 
        gson0.toJsonTree((Object) class0, (Type) class0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Class cannot be cast to java.lang.Number
         //
         verifyException("com.google.gson.Gson$2", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Gson gson0 = new Gson();
      Double double0 = new Double(1390.1961);
      Class<Byte> class0 = Byte.TYPE;
      // Undeclared exception!
      try { 
        gson0.toJson((Object) double0, (Type) class0, (Appendable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.Streams$AppendableWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Gson gson0 = new Gson();
      Integer integer0 = new Integer((-1));
      Class<Short> class0 = Short.TYPE;
      PipedWriter pipedWriter0 = new PipedWriter();
      try { 
        gson0.toJson((Object) integer0, (Type) class0, (Appendable) pipedWriter0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.IOException: Pipe not connected
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Gson gson0 = new Gson();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(";Sc-B@tZ:$N[");
      AtomicLongArray atomicLongArray0 = new AtomicLongArray(42);
      Class<Double> class0 = Double.TYPE;
      JsonWriter jsonWriter0 = new JsonWriter(mockPrintWriter0);
      // Undeclared exception!
      try { 
        gson0.toJson((Object) atomicLongArray0, (Type) class0, jsonWriter0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.concurrent.atomic.AtomicLongArray cannot be cast to java.lang.Number
         //
         verifyException("com.google.gson.Gson$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Gson gson0 = new Gson();
      BigInteger bigInteger0 = BigInteger.ZERO;
      // Undeclared exception!
      try { 
        gson0.toJson((Object) bigInteger0, (Type) null);
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
      Class<Date> class0 = Date.class;
      TypeToken<Date> typeToken0 = TypeToken.get(class0);
      char[] charArray0 = new char[7];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      // Undeclared exception!
      try { 
        gson0.toJson((Object) typeToken0, (Appendable) charBuffer0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.CharBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Short> class0 = Short.TYPE;
      // Undeclared exception!
      try { 
        gson0.toJson((Object) class0, (Appendable) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Attempted to serialize java.lang.Class: short. Forgot to register a type adapter?
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      PipedWriter pipedWriter0 = new PipedWriter();
      Gson gson0 = new Gson();
      try { 
        gson0.toJson((Object) null, (Appendable) pipedWriter0);
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
      Class<Integer> class0 = Integer.TYPE;
      // Undeclared exception!
      try { 
        gson0.toJson((Object) class0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Attempted to serialize java.lang.Class: int. Forgot to register a type adapter?
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Double> class0 = Double.TYPE;
      // Undeclared exception!
      try { 
        gson0.fromJson("Untermi;ated string", (Type) class0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Type> class0 = Type.class;
      // Undeclared exception!
      try { 
        gson0.fromJson("^2CNR0A{AI\"\"kB{c", class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to invoke no-args constructor for interface java.lang.reflect.Type. Registering an InstanceCreator with Gson for this type may fix this problem.
         //
         verifyException("com.google.gson.internal.ConstructorConstructor$14", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<BigInteger> class0 = BigInteger.class;
      try { 
        gson0.fromJson("-t.u{)/", class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NumberFormatException: For input string: \"t.u\"
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$18", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Gson gson0 = new Gson();
      StringReader stringReader0 = new StringReader("`QV+Sud-MHoB_=1N^");
      Class<Double> class0 = Double.TYPE;
      // Undeclared exception!
      try { 
        gson0.fromJson((Reader) stringReader0, (Type) class0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Gson gson0 = new Gson();
      PipedReader pipedReader0 = new PipedReader();
      Class<Character> class0 = Character.TYPE;
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
  public void test35()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Long> class0 = Long.class;
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
  public void test36()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Long> class0 = Long.class;
      PipedReader pipedReader0 = new PipedReader();
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
  public void test37()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Object> class0 = Object.class;
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
  public void test38()  throws Throwable  {
      Gson gson0 = new Gson();
      StringReader stringReader0 = new StringReader("2Z[ruC");
      JsonReader jsonReader0 = gson0.newJsonReader(stringReader0);
      // Undeclared exception!
      try { 
        gson0.fromJson(jsonReader0, (Type) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.$Gson$Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Gson gson0 = new Gson();
      PipedReader pipedReader0 = new PipedReader();
      JsonReader jsonReader0 = gson0.newJsonReader(pipedReader0);
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
  public void test40()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Double> class0 = Double.TYPE;
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("GSON cannot serialize ");
      // Undeclared exception!
      try { 
        gson0.fromJson((JsonElement) jsonPrimitive0, (Type) class0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonArray jsonArray0 = new JsonArray(1);
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
  public void test42()  throws Throwable  {
      Gson.FutureTypeAdapter<Object> gson_FutureTypeAdapter0 = new Gson.FutureTypeAdapter<Object>();
      gson_FutureTypeAdapter0.setDelegate((TypeAdapter<Object>) null);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      StringReader stringReader0 = new StringReader("2");
      Gson gson0 = new Gson();
      Class<Long> class0 = Long.class;
      gson0.fromJson((Reader) stringReader0, class0);
      JsonReader jsonReader0 = new JsonReader(stringReader0);
      gson0.fromJson(jsonReader0, (Type) class0);
      assertFalse(jsonReader0.isLenient());
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Date> class0 = Date.class;
      gson0.fromJson((String) null, (Type) class0);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Character> class0 = Character.TYPE;
      try { 
        gson0.fromJson("R,XK4Xk'\"E`SU(m44\"}", (Type) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 3 path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Gson gson0 = new Gson();
      MockFileWriter mockFileWriter0 = new MockFileWriter("9SA", true);
      JsonWriter jsonWriter0 = gson0.newJsonWriter(mockFileWriter0);
      assertFalse(jsonWriter0.getSerializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
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
  public void test48()  throws Throwable  {
      Class<Float> class0 = Float.class;
      TypeToken<Float> typeToken0 = TypeToken.get(class0);
      Gson gson0 = new Gson();
      gson0.getAdapter(typeToken0);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Short> class0 = Short.TYPE;
      // Undeclared exception!
      try { 
        gson0.toJson((Object) "com.google.gson.internal.bind.TypeAdapters$20", (Type) class0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.lang.Number
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$6", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      // Undeclared exception!
      try { 
        gson0.toJson((JsonElement) jsonNull0, (Appendable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.Streams$AppendableWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
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
  public void test52()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      String string0 = gson0.toJson((JsonElement) jsonNull0);
      assertEquals("null", string0);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Boolean> class0 = Boolean.TYPE;
      Class<Short> class1 = Short.class;
      TypeToken<Short> typeToken0 = TypeToken.get(class1);
      Class<? super Short> class2 = typeToken0.getRawType();
      // Undeclared exception!
      try { 
        gson0.toJson((Object) class0, (Type) class2, (Appendable) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Class cannot be cast to java.lang.Number
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$6", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Gson gson0 = new Gson();
      // Undeclared exception!
      try { 
        gson0.toJson((JsonElement) null, (JsonWriter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Boolean> class0 = Boolean.TYPE;
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
  public void test56()  throws Throwable  {
      AtomicLongArray atomicLongArray0 = new AtomicLongArray(8);
      Gson.FutureTypeAdapter<AtomicLongArray> gson_FutureTypeAdapter0 = new Gson.FutureTypeAdapter<AtomicLongArray>();
      // Undeclared exception!
      try { 
        gson_FutureTypeAdapter0.toJsonTree(atomicLongArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.Gson$FutureTypeAdapter", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Gson.FutureTypeAdapter<Gson.FutureTypeAdapter<Short>> gson_FutureTypeAdapter0 = new Gson.FutureTypeAdapter<Gson.FutureTypeAdapter<Short>>();
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
  public void test58()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Integer> class0 = Integer.TYPE;
      gson0.fromJson((JsonElement) null, (Type) class0);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
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
  public void test60()  throws Throwable  {
      Gson gson0 = new Gson();
      gson0.toJsonTree((Object) null);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Gson gson0 = new Gson();
      Excluder excluder0 = Excluder.DEFAULT;
      // Undeclared exception!
      try { 
        gson0.getDelegateAdapter((TypeAdapterFactory) excluder0, (TypeToken<Date>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Gson gson0 = new Gson();
      Excluder excluder0 = Excluder.DEFAULT;
      Excluder excluder1 = excluder0.disableInnerClassSerialization();
      Class<AtomicLong> class0 = AtomicLong.class;
      TypeToken<AtomicLong> typeToken0 = TypeToken.get(class0);
      TypeAdapter<AtomicLong> typeAdapter0 = gson0.getDelegateAdapter((TypeAdapterFactory) excluder1, typeToken0);
      assertNotNull(typeAdapter0);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      PipedWriter pipedWriter0 = new PipedWriter();
      Class<Object> class0 = Object.class;
      Gson gson0 = new Gson();
      // Undeclared exception!
      gson0.toJsonTree((Object) pipedWriter0, (Type) class0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
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
  public void test65()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonArray jsonArray0 = new JsonArray();
      Class<AtomicLongArray> class0 = AtomicLongArray.class;
      TypeToken<AtomicLongArray> typeToken0 = TypeToken.get(class0);
      Class<? super AtomicLongArray> class1 = typeToken0.getRawType();
      gson0.fromJson((JsonElement) jsonArray0, (Type) class1);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Float> class0 = Float.TYPE;
      gson0.toJsonTree((Object) null, (Type) class0);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Float> class0 = Float.TYPE;
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      gson0.fromJson((JsonElement) jsonNull0, (Type) class0);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonArray jsonArray0 = new JsonArray();
      Class<Float> class0 = Float.TYPE;
      try { 
        gson0.fromJson((JsonElement) jsonArray0, (Type) class0);
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
      Class<Double> class0 = Double.TYPE;
      gson0.toJsonTree((Object) null, (Type) class0);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Class<Double> class0 = Double.TYPE;
      Gson gson0 = new Gson();
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      gson0.fromJson((JsonElement) jsonNull0, (Type) class0);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Gson gson0 = new Gson();
      gson0.fieldNamingStrategy();
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Gson gson0 = new Gson();
      gson0.newBuilder();
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<String> class0 = String.class;
      gson0.getAdapter(class0);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Gson gson0 = new Gson();
      gson0.excluder();
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      Gson gson0 = new Gson();
      boolean boolean0 = gson0.htmlSafe();
      assertFalse(gson0.serializeNulls());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Long> class0 = Long.TYPE;
      // Undeclared exception!
      try { 
        gson0.toJsonTree((Object) class0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Attempted to serialize java.lang.Class: long. Forgot to register a type adapter?
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      Gson gson0 = new Gson();
      Character character0 = new Character('3');
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(character0);
      Class<DefaultDateTypeAdapter> class0 = DefaultDateTypeAdapter.class;
      try { 
        gson0.fromJson((JsonElement) jsonPrimitive0, class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected BEGIN_OBJECT but was STRING at path $
         //
         verifyException("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$Adapter", e);
      }
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<BigInteger> class0 = BigInteger.class;
      gson0.fromJson("", class0);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      Gson gson0 = new Gson();
      String string0 = gson0.toString();
      Class<DefaultDateTypeAdapter> class0 = DefaultDateTypeAdapter.class;
      TypeToken<DefaultDateTypeAdapter> typeToken0 = TypeToken.get(class0);
      Class<? super DefaultDateTypeAdapter> class1 = typeToken0.getRawType();
      // Undeclared exception!
      try { 
        gson0.toJson((Object) string0, (Type) class1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      StringReader stringReader0 = new StringReader("2");
      Gson gson0 = new Gson();
      Class<BigInteger> class0 = BigInteger.class;
      gson0.fromJson((Reader) stringReader0, class0);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Object> class0 = Object.class;
      Float float0 = new Float(0.0F);
      // Undeclared exception!
      try { 
        gson0.toJson((Object) float0, (Type) class0, (JsonWriter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      Gson gson0 = new Gson();
      String string0 = gson0.toJson((Object) null);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
      assertEquals("null", string0);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      Gson gson0 = new Gson();
      boolean boolean0 = gson0.serializeNulls();
      assertFalse(boolean0);
      assertTrue(gson0.htmlSafe());
  }
}
