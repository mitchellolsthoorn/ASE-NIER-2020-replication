/*
 * This file was automatically generated by EvoSuite
 * Fri May 22 02:51:16 GMT 2020
 */

package com.google.gson.internal.bind;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.internal.bind.JsonTreeReader;
import com.google.gson.stream.JsonToken;
import java.util.ConcurrentModificationException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JsonTreeReader_ESTest extends JsonTreeReader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Short short0 = new Short((short)2);
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.addProperty("}T:CqRt,jPb/AF'[oR", (Number) short0);
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonObject0);
      jsonTreeReader0.beginObject();
      jsonTreeReader0.skipValue();
      jsonTreeReader0.skipValue();
      assertFalse(jsonTreeReader0.isLenient());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      Character character0 = Character.valueOf('P');
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(character0);
      jsonObject0.add("Dj`4OCQ", jsonPrimitive0);
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonObject0);
      jsonTreeReader0.beginObject();
      jsonTreeReader0.promoteNameToValue();
      assertFalse(jsonTreeReader0.isLenient());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("");
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonPrimitive0);
      String string0 = jsonTreeReader0.nextString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      Character character0 = new Character('>');
      jsonObject0.addProperty("]7*w)oDe& SVsH", character0);
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonObject0);
      jsonTreeReader0.beginObject();
      String string0 = jsonTreeReader0.nextName();
      assertEquals("]7*w)oDe& SVsH", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonObject0);
      Character character0 = Character.valueOf('$');
      jsonObject0.addProperty("", character0);
      jsonTreeReader0.beginObject();
      String string0 = jsonTreeReader0.nextName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Short short0 = new Short((short) (-3775));
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(short0);
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonPrimitive0);
      long long0 = jsonTreeReader0.nextLong();
      assertEquals((-3775L), long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Float float0 = new Float(0.0);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(float0);
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonPrimitive0);
      int int0 = jsonTreeReader0.nextInt();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Double double0 = new Double((-3752.42285563026));
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(double0);
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonPrimitive0);
      int int0 = jsonTreeReader0.nextInt();
      assertEquals((-3752), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Short short0 = new Short((short)0);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(short0);
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonPrimitive0);
      double double0 = jsonTreeReader0.nextDouble();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Float float0 = new Float((-1041.107));
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(float0);
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonPrimitive0);
      double double0 = jsonTreeReader0.nextDouble();
      assertEquals((-1041.1070556640625), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Boolean boolean0 = new Boolean(false);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(boolean0);
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonPrimitive0);
      boolean boolean1 = jsonTreeReader0.nextBoolean();
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.addProperty("Yeg2goC9  d}|brNgD%", "Yeg2goC9  d}|brNgD%");
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonObject0);
      jsonTreeReader0.beginObject();
      Character character0 = new Character('[');
      jsonObject0.addProperty("", character0);
      // Undeclared exception!
      try { 
        jsonTreeReader0.skipValue();
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedTreeMap$LinkedTreeMapIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader((JsonElement) null);
      // Undeclared exception!
      try { 
        jsonTreeReader0.skipValue();
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonNull0);
      jsonTreeReader0.skipValue();
      // Undeclared exception!
      try { 
        jsonTreeReader0.skipValue();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.google.gson.internal.bind.JsonTreeReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonArray0);
      jsonTreeReader0.beginArray();
      Character character0 = new Character('/');
      jsonArray0.add(character0);
      // Undeclared exception!
      try { 
        jsonTreeReader0.promoteNameToValue();
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList$Itr", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader((JsonElement) null);
      // Undeclared exception!
      try { 
        jsonTreeReader0.promoteNameToValue();
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonArray0);
      jsonTreeReader0.beginArray();
      jsonArray0.add("c?HA+gM5F?1Z $");
      // Undeclared exception!
      try { 
        jsonTreeReader0.peek();
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList$Itr", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonArray0);
      jsonTreeReader0.beginArray();
      jsonArray0.add("c?HZ+gM5FKCZ $");
      // Undeclared exception!
      try { 
        jsonTreeReader0.nextString();
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList$Itr", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader((JsonElement) null);
      // Undeclared exception!
      try { 
        jsonTreeReader0.nextString();
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonObject0);
      // Undeclared exception!
      try { 
        jsonTreeReader0.nextNull();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Expected NULL but was BEGIN_OBJECT at path $
         //
         verifyException("com.google.gson.internal.bind.JsonTreeReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader((JsonElement) null);
      // Undeclared exception!
      try { 
        jsonTreeReader0.nextNull();
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader((JsonElement) null);
      // Undeclared exception!
      try { 
        jsonTreeReader0.nextName();
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Character character0 = new Character('v');
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(character0);
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonPrimitive0);
      // Undeclared exception!
      try { 
        jsonTreeReader0.nextLong();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"v\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader((JsonElement) null);
      // Undeclared exception!
      try { 
        jsonTreeReader0.nextLong();
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("}ux#l");
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonPrimitive0);
      // Undeclared exception!
      try { 
        jsonTreeReader0.nextInt();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"}ux#l\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Character character0 = new Character('p');
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(character0);
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonPrimitive0);
      // Undeclared exception!
      try { 
        jsonTreeReader0.nextDouble();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader((JsonElement) null);
      // Undeclared exception!
      try { 
        jsonTreeReader0.nextDouble();
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonArray0);
      JsonArray jsonArray1 = jsonArray0.deepCopy();
      jsonArray0.add((JsonElement) jsonArray1);
      jsonTreeReader0.beginArray();
      jsonTreeReader0.beginArray();
      jsonArray0.add((JsonElement) jsonArray1);
      jsonTreeReader0.endArray();
      // Undeclared exception!
      try { 
        jsonTreeReader0.nextBoolean();
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList$Itr", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonArray0);
      // Undeclared exception!
      try { 
        jsonTreeReader0.nextBoolean();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Expected BOOLEAN but was BEGIN_ARRAY at path $
         //
         verifyException("com.google.gson.internal.bind.JsonTreeReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader((JsonElement) null);
      // Undeclared exception!
      try { 
        jsonTreeReader0.nextBoolean();
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonObject0);
      jsonTreeReader0.close();
      // Undeclared exception!
      try { 
        jsonTreeReader0.hasNext();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // JsonReader is closed
         //
         verifyException("com.google.gson.internal.bind.JsonTreeReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader((JsonElement) null);
      // Undeclared exception!
      try { 
        jsonTreeReader0.hasNext();
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonArray0);
      jsonTreeReader0.beginArray();
      jsonArray0.add("");
      // Undeclared exception!
      try { 
        jsonTreeReader0.endObject();
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList$Itr", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonObject0);
      // Undeclared exception!
      try { 
        jsonTreeReader0.endObject();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Expected END_OBJECT but was BEGIN_OBJECT at path $
         //
         verifyException("com.google.gson.internal.bind.JsonTreeReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader((JsonElement) null);
      // Undeclared exception!
      try { 
        jsonTreeReader0.endObject();
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonArray0);
      jsonTreeReader0.beginArray();
      Integer integer0 = new Integer((-1431));
      jsonArray0.add((Number) integer0);
      // Undeclared exception!
      try { 
        jsonTreeReader0.endArray();
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList$Itr", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader((JsonElement) null);
      // Undeclared exception!
      try { 
        jsonTreeReader0.endArray();
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader((JsonElement) null);
      // Undeclared exception!
      try { 
        jsonTreeReader0.beginObject();
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonArray0);
      jsonTreeReader0.beginArray();
      jsonArray0.add("");
      // Undeclared exception!
      try { 
        jsonTreeReader0.beginArray();
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList$Itr", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonNull0);
      // Undeclared exception!
      try { 
        jsonTreeReader0.beginArray();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Expected BEGIN_ARRAY but was NULL at path $
         //
         verifyException("com.google.gson.internal.bind.JsonTreeReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader((JsonElement) null);
      // Undeclared exception!
      try { 
        jsonTreeReader0.beginArray();
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonObject0);
      jsonTreeReader0.beginObject();
      String string0 = jsonTreeReader0.getPath();
      assertEquals("$.", string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonObject0);
      Float float0 = new Float(0.0);
      jsonObject0.addProperty("", (Number) float0);
      jsonTreeReader0.beginObject();
      jsonTreeReader0.skipValue();
      String string0 = jsonTreeReader0.getPath();
      assertEquals("$.null", string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonArray0);
      jsonTreeReader0.beginArray();
      String string0 = jsonTreeReader0.getPath();
      assertEquals("$[0]", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonObject0);
      String string0 = jsonTreeReader0.getPath();
      assertEquals("$", string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonArray0);
      String string0 = jsonTreeReader0.getPath();
      assertEquals("$", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader((JsonElement) null);
      jsonTreeReader0.close();
      // Undeclared exception!
      try { 
        jsonTreeReader0.peek();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // JsonReader is closed
         //
         verifyException("com.google.gson.internal.bind.JsonTreeReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonNull0);
      JsonToken jsonToken0 = jsonTreeReader0.peek();
      assertEquals(JsonToken.NULL, jsonToken0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Boolean boolean0 = new Boolean(false);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(boolean0);
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonPrimitive0);
      JsonToken jsonToken0 = jsonTreeReader0.peek();
      assertEquals(JsonToken.BOOLEAN, jsonToken0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Short short0 = new Short((short)2);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(short0);
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonPrimitive0);
      JsonToken jsonToken0 = jsonTreeReader0.peek();
      assertEquals(JsonToken.NUMBER, jsonToken0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("");
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonPrimitive0);
      JsonToken jsonToken0 = jsonTreeReader0.peek();
      assertEquals(JsonToken.STRING, jsonToken0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonArray0);
      JsonToken jsonToken0 = jsonTreeReader0.peek();
      assertEquals(JsonToken.BEGIN_ARRAY, jsonToken0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonObject0);
      JsonToken jsonToken0 = jsonTreeReader0.peek();
      assertEquals(JsonToken.BEGIN_OBJECT, jsonToken0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonObject0);
      jsonTreeReader0.beginObject();
      JsonToken jsonToken0 = jsonTreeReader0.peek();
      assertEquals(JsonToken.END_OBJECT, jsonToken0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonObject0);
      Float float0 = new Float(0.0);
      jsonObject0.addProperty("", (Number) float0);
      jsonTreeReader0.beginObject();
      JsonToken jsonToken0 = jsonTreeReader0.peek();
      assertEquals(JsonToken.NAME, jsonToken0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonArray0);
      jsonTreeReader0.beginArray();
      JsonToken jsonToken0 = jsonTreeReader0.peek();
      assertEquals(JsonToken.END_ARRAY, jsonToken0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader((JsonElement) null);
      // Undeclared exception!
      try { 
        jsonTreeReader0.peek();
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Short short0 = new Short((short)109);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(short0);
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonPrimitive0);
      // Undeclared exception!
      try { 
        jsonTreeReader0.nextName();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Expected NAME but was NUMBER at path $
         //
         verifyException("com.google.gson.internal.bind.JsonTreeReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonObject0);
      jsonTreeReader0.beginObject();
      // Undeclared exception!
      try { 
        jsonTreeReader0.nextString();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Expected STRING but was END_OBJECT at path $.
         //
         verifyException("com.google.gson.internal.bind.JsonTreeReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.addProperty("9", "9");
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonObject0);
      jsonTreeReader0.beginObject();
      jsonTreeReader0.skipValue();
      // Undeclared exception!
      try { 
        jsonTreeReader0.promoteNameToValue();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Expected NAME but was STRING at path $.null
         //
         verifyException("com.google.gson.internal.bind.JsonTreeReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonArray0);
      jsonArray0.add((JsonElement) jsonArray0);
      jsonTreeReader0.beginArray();
      // Undeclared exception!
      try { 
        jsonTreeReader0.endArray();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Expected END_ARRAY but was BEGIN_ARRAY at path $[0]
         //
         verifyException("com.google.gson.internal.bind.JsonTreeReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.addProperty("9", "9");
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonObject0);
      jsonTreeReader0.beginObject();
      jsonTreeReader0.skipValue();
      int int0 = jsonTreeReader0.nextInt();
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonObject0);
      // Undeclared exception!
      try { 
        jsonTreeReader0.nextInt();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Expected NUMBER but was BEGIN_OBJECT at path $
         //
         verifyException("com.google.gson.internal.bind.JsonTreeReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.addProperty("9", "9");
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonObject0);
      jsonTreeReader0.beginObject();
      jsonTreeReader0.skipValue();
      long long0 = jsonTreeReader0.nextLong();
      assertEquals(9L, long0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonObject0);
      // Undeclared exception!
      try { 
        jsonTreeReader0.nextLong();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Expected NUMBER but was BEGIN_OBJECT at path $
         //
         verifyException("com.google.gson.internal.bind.JsonTreeReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Short short0 = new Short((short)0);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(short0);
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonPrimitive0);
      long long0 = jsonTreeReader0.nextLong();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Short short0 = new Short((short)6);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(short0);
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonPrimitive0);
      jsonTreeReader0.setLenient(true);
      double double0 = jsonTreeReader0.nextDouble();
      assertEquals(6.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonNull0);
      // Undeclared exception!
      try { 
        jsonTreeReader0.nextDouble();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Expected NUMBER but was NULL at path $
         //
         verifyException("com.google.gson.internal.bind.JsonTreeReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.addProperty("]7*w)oDe& SVsH", (Character) null);
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonObject0);
      jsonTreeReader0.beginObject();
      jsonTreeReader0.skipValue();
      jsonTreeReader0.nextNull();
      assertFalse(jsonTreeReader0.isLenient());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonNull0);
      jsonTreeReader0.nextNull();
      assertFalse(jsonTreeReader0.isLenient());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.addProperty("QA", "QA");
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonObject0);
      jsonTreeReader0.beginObject();
      jsonTreeReader0.skipValue();
      String string0 = jsonTreeReader0.nextString();
      assertEquals("QA", string0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Short short0 = new Short((short)12);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(short0);
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonPrimitive0);
      String string0 = jsonTreeReader0.nextString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonNull0);
      // Undeclared exception!
      try { 
        jsonTreeReader0.beginObject();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Expected BEGIN_OBJECT but was NULL at path $
         //
         verifyException("com.google.gson.internal.bind.JsonTreeReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(boolean0);
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonPrimitive0);
      boolean boolean1 = jsonTreeReader0.nextBoolean();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader((JsonElement) null);
      // Undeclared exception!
      try { 
        jsonTreeReader0.nextInt();
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      Short short0 = new Short((short)6);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(short0);
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonPrimitive0);
      double double0 = jsonTreeReader0.nextDouble();
      assertEquals(6.0, double0, 0.01);
      
      JsonToken jsonToken0 = jsonTreeReader0.peek();
      assertEquals(JsonToken.END_DOCUMENT, jsonToken0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonArray0);
      jsonTreeReader0.beginArray();
      boolean boolean0 = jsonTreeReader0.hasNext();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonArray0);
      boolean boolean0 = jsonTreeReader0.hasNext();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonObject0);
      jsonTreeReader0.beginObject();
      boolean boolean0 = jsonTreeReader0.hasNext();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonNull0);
      String string0 = jsonTreeReader0.toString();
      assertEquals("JsonTreeReader", string0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.addProperty("9", "9");
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonObject0);
      jsonTreeReader0.beginObject();
      jsonTreeReader0.skipValue();
      double double0 = jsonTreeReader0.nextDouble();
      assertEquals(9.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      JsonObject jsonObject0 = new JsonObject();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonObject0);
      jsonTreeReader0.beginObject();
      jsonTreeReader0.endObject();
      assertFalse(jsonTreeReader0.isLenient());
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonArray0);
      jsonTreeReader0.beginArray();
      jsonTreeReader0.endArray();
      assertFalse(jsonTreeReader0.isLenient());
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      JsonArray jsonArray0 = new JsonArray();
      JsonTreeReader jsonTreeReader0 = new JsonTreeReader(jsonArray0);
      jsonTreeReader0.close();
      // Undeclared exception!
      try { 
        jsonTreeReader0.skipValue();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // JsonReader is closed
         //
         verifyException("com.google.gson.internal.bind.JsonTreeReader", e);
      }
  }
}
