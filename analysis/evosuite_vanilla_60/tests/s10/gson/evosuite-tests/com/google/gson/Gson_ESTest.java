/*
 * This file was automatically generated by EvoSuite
 * Wed May 20 14:15:23 GMT 2020
 */

package com.google.gson;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.Gson;
import com.google.gson.InstanceCreator;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
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
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.nio.CharBuffer;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Gson_ESTest extends Gson_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Gson.FutureTypeAdapter<BigDecimal> gson_FutureTypeAdapter0 = new Gson.FutureTypeAdapter<BigDecimal>();
      StringReader stringReader0 = new StringReader("");
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
  public void test01()  throws Throwable  {
      Gson.checkValidFloatingPoint((-1999.6763006));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<AtomicLongArray> class0 = AtomicLongArray.class;
      TypeToken<AtomicLongArray> typeToken0 = TypeToken.get(class0);
      Type type0 = typeToken0.getType();
      try { 
        gson0.fromJson("JSON document was not fully consumed.", type0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected BEGIN_ARRAY but was STRING at line 1 column 1 path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Gson gson0 = new Gson();
      StringWriter stringWriter0 = new StringWriter();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(stringWriter0);
      gson0.toJson((Object) null, (Appendable) mockPrintWriter0);
      assertEquals("null", stringWriter0.toString());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<String> class0 = String.class;
      try { 
        gson0.fromJson("g~+.DU#", class0);
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
      Double double0 = new Double(399.387);
      Class<Float> class0 = Float.class;
      TypeToken<Float> typeToken0 = TypeToken.get(class0);
      Class<? super Float> class1 = typeToken0.getRawType();
      gson0.toJsonTree((Object) double0, (Type) class1);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Gson gson0 = new Gson();
      Gson.FutureTypeAdapter<AtomicLongArray> gson_FutureTypeAdapter0 = new Gson.FutureTypeAdapter<AtomicLongArray>();
      gson0.toJsonTree((Object) gson_FutureTypeAdapter0);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<String> class0 = String.class;
      gson0.fromJson("com.google.gson.Gson$4", class0);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Object> class0 = Object.class;
      StringReader stringReader0 = new StringReader("");
      gson0.fromJson((Reader) stringReader0, (Type) class0);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Gson gson0 = new Gson();
      StringReader stringReader0 = new StringReader("b");
      stringReader0.read();
      Class<AtomicLong> class0 = AtomicLong.class;
      gson0.fromJson((Reader) stringReader0, class0);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Long> class0 = Long.class;
      gson0.fromJson((JsonElement) null, class0);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Double> class0 = Double.TYPE;
      // Undeclared exception!
      try { 
        gson0.toJsonTree((Object) class0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Attempted to serialize java.lang.Class: double. Forgot to register a type adapter?
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Long> class0 = Long.class;
      Double double0 = new Double((-1999.6763006));
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
  public void test13()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Short> class0 = Short.class;
      // Undeclared exception!
      try { 
        gson0.toJson((Object) class0, (Type) class0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Class cannot be cast to java.lang.Number
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$6", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        gson0.toJson((Object) class0, (Appendable) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Attempted to serialize java.lang.Class: java.lang.String. Forgot to register a type adapter?
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Short> class0 = Short.class;
      // Undeclared exception!
      try { 
        gson0.toJson((Object) class0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Attempted to serialize java.lang.Class: java.lang.Short. Forgot to register a type adapter?
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
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
  public void test17()  throws Throwable  {
      Gson gson0 = new Gson();
      Excluder excluder0 = Excluder.DEFAULT;
      // Undeclared exception!
      try { 
        gson0.getDelegateAdapter((TypeAdapterFactory) excluder0, (TypeToken<AtomicLongArray>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Gson gson0 = new Gson();
      // Undeclared exception!
      try { 
        gson0.fromJson("W", (Type) null);
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
      try { 
        gson0.fromJson(":*p", (Type) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected value at line 1 column 1 path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
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
  public void test21()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonArray jsonArray0 = new JsonArray();
      Class<Type> class0 = Type.class;
      // Undeclared exception!
      try { 
        gson0.fromJson((JsonElement) jsonArray0, class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to invoke no-args constructor for interface java.lang.reflect.Type. Registering an InstanceCreator with Gson for this type may fix this problem.
         //
         verifyException("com.google.gson.internal.ConstructorConstructor$14", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Gson.FutureTypeAdapter<Object> gson_FutureTypeAdapter0 = new Gson.FutureTypeAdapter<Object>();
      gson_FutureTypeAdapter0.setDelegate((TypeAdapter<Object>) null);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Class<AtomicLong> class0 = AtomicLong.class;
      JsonObject jsonObject0 = new JsonObject();
      Gson gson0 = new Gson();
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
  public void test24()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Integer> class0 = Integer.class;
      TypeToken<Integer> typeToken0 = TypeToken.get(class0);
      gson0.getAdapter(typeToken0);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Gson gson0 = new Gson();
      StringWriter stringWriter0 = new StringWriter();
      JsonObject jsonObject0 = new JsonObject();
      gson0.toJson((JsonElement) jsonObject0, (Appendable) stringWriter0);
      assertEquals("{}", stringWriter0.toString());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Gson gson0 = new Gson();
      PipedWriter pipedWriter0 = new PipedWriter();
      PipedReader pipedReader0 = new PipedReader(pipedWriter0);
      JsonReader jsonReader0 = gson0.newJsonReader(pipedReader0);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
      assertFalse(jsonReader0.isLenient());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Double> class0 = Double.TYPE;
      Float float0 = new Float((-354.356856198));
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      JsonWriter jsonWriter0 = gson0.newJsonWriter(charArrayWriter0);
      gson0.toJson((Object) float0, (Type) class0, jsonWriter0);
      assertEquals(26, charArrayWriter0.size());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Integer> class0 = Integer.class;
      gson0.getAdapter(class0);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Gson gson0 = new Gson();
      String string0 = gson0.toJson((JsonElement) null);
      assertEquals("null", string0);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Gson gson0 = new Gson();
      char[] charArray0 = new char[3];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0, 0, 0);
      Class<Float> class0 = Float.TYPE;
      // Undeclared exception!
      try { 
        gson0.toJson((Object) charBuffer0, (Type) class0, (Appendable) charBuffer0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.nio.HeapCharBuffer cannot be cast to java.lang.Number
         //
         verifyException("com.google.gson.Gson$2", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Gson gson0 = new Gson();
      StringReader stringReader0 = new StringReader("\"F]uQQ9ix");
      Class<Short> class0 = Short.class;
      TypeToken<Short> typeToken0 = TypeToken.get(class0);
      Type type0 = typeToken0.getType();
      try { 
        gson0.fromJson((Reader) stringReader0, type0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Unterminated string at line 1 column 10 path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Gson gson0 = new Gson();
      Gson.FutureTypeAdapter<Object> gson_FutureTypeAdapter0 = new Gson.FutureTypeAdapter<Object>();
      Class<Float> class0 = Float.TYPE;
      // Undeclared exception!
      try { 
        gson0.toJsonTree((Object) gson_FutureTypeAdapter0, (Type) class0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.gson.Gson$FutureTypeAdapter cannot be cast to java.lang.Number
         //
         verifyException("com.google.gson.Gson$2", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Gson.FutureTypeAdapter<InstanceCreator<Object>> gson_FutureTypeAdapter0 = new Gson.FutureTypeAdapter<InstanceCreator<Object>>();
      InstanceCreator<Object> instanceCreator0 = (InstanceCreator<Object>) mock(InstanceCreator.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        gson_FutureTypeAdapter0.write((JsonWriter) null, instanceCreator0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.Gson$FutureTypeAdapter", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Integer> class0 = Integer.class;
      gson0.fromJson((JsonElement) null, (Type) class0);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<String> class0 = String.class;
      gson0.fromJson("com.google.gson.internal.Excluder$1", (Type) class0);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Double> class0 = Double.TYPE;
      gson0.fromJson((String) null, (Type) class0);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Gson gson0 = new Gson();
      Double double0 = new Double(0.0);
      // Undeclared exception!
      try { 
        gson0.toJson((Object) double0, (Appendable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.Streams$AppendableWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
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
  public void test39()  throws Throwable  {
      Gson gson0 = new Gson();
      gson0.toJsonTree((Object) null);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Gson gson0 = new Gson();
      Excluder excluder0 = Excluder.DEFAULT;
      Class<AtomicLongArray> class0 = AtomicLongArray.class;
      TypeToken<AtomicLongArray> typeToken0 = TypeToken.get(class0);
      TypeAdapter<AtomicLongArray> typeAdapter0 = gson0.getDelegateAdapter((TypeAdapterFactory) excluder0, typeToken0);
      assertTrue(gson0.htmlSafe());
      assertNotNull(typeAdapter0);
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Short> class0 = Short.class;
      TypeToken<Short> typeToken0 = TypeToken.get(class0);
      gson0.getDelegateAdapter((TypeAdapterFactory) null, typeToken0);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Gson gson0 = new Gson();
      // Undeclared exception!
      try { 
        gson0.getAdapter((TypeToken<AtomicLongArray>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$35", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Gson gson0 = new Gson();
      AtomicLongArray atomicLongArray0 = new AtomicLongArray(0);
      String string0 = gson0.toJson((Object) atomicLongArray0);
      assertEquals("[]", string0);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Double> class0 = Double.TYPE;
      String string0 = gson0.toJson((Object) null, (Type) class0);
      assertFalse(gson0.serializeNulls());
      assertEquals("null", string0);
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Gson gson0 = new Gson();
      Excluder excluder0 = Excluder.DEFAULT;
      gson0.toJson((Object) excluder0);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Double> class0 = Double.TYPE;
      // Undeclared exception!
      try { 
        gson0.fromJson("Expected an int but was ", (Type) class0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Gson gson0 = new Gson();
      AtomicLong atomicLong0 = new AtomicLong(1L);
      gson0.toJson((Object) atomicLong0);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Gson gson0 = new Gson();
      gson0.fieldNamingStrategy();
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Gson gson0 = new Gson();
      gson0.newBuilder();
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Gson gson0 = new Gson();
      gson0.excluder();
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Gson gson0 = new Gson();
      boolean boolean0 = gson0.htmlSafe();
      assertTrue(boolean0);
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Gson gson0 = new Gson();
      Short short0 = new Short((short)0);
      gson0.toJsonTree((Object) short0);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      Gson gson0 = new Gson();
      Class<Float> class0 = Float.class;
      try { 
        gson0.fromJson((JsonElement) jsonObject0, class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected NUMBER but was BEGIN_OBJECT at path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<String> class0 = String.class;
      gson0.fromJson("", class0);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Gson gson0 = new Gson();
      gson0.toString();
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Gson gson0 = new Gson();
      StringReader stringReader0 = new StringReader("b");
      Class<AtomicLong> class0 = AtomicLong.class;
      try { 
        gson0.fromJson((Reader) stringReader0, class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NumberFormatException: For input string: \"b\"
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$11", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Gson gson0 = new Gson();
      String string0 = gson0.toJson((Object) null);
      assertFalse(gson0.serializeNulls());
      assertEquals("null", string0);
      assertTrue(gson0.htmlSafe());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Gson gson0 = new Gson();
      boolean boolean0 = gson0.serializeNulls();
      assertFalse(boolean0);
      assertTrue(gson0.htmlSafe());
  }
}
