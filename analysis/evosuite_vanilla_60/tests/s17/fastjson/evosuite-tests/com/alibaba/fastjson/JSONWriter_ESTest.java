/*
 * This file was automatically generated by EvoSuite
 * Wed May 20 16:06:01 GMT 2020
 */

package com.alibaba.fastjson;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.JSONWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import java.io.StringWriter;
import java.io.Writer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSONWriter_ESTest extends JSONWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSONWriter jSONWriter0 = new JSONWriter((Writer) null);
      // Undeclared exception!
      try { 
        jSONWriter0.writeValue("@aL}vmyf+f>p:");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // create asm serializer error, verson 1.2.68, class byte
         //
         verifyException("com.alibaba.fastjson.serializer.SerializeConfig", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSONWriter jSONWriter0 = new JSONWriter((Writer) null);
      jSONWriter0.close();
      // Undeclared exception!
      try { 
        jSONWriter0.writeValue((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.SerializeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSONWriter jSONWriter0 = new JSONWriter((Writer) null);
      jSONWriter0.close();
      // Undeclared exception!
      try { 
        jSONWriter0.writeStartObject();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.SerializeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSONWriter jSONWriter0 = new JSONWriter((Writer) null);
      Object object0 = new Object();
      jSONWriter0.writeStartObject();
      jSONWriter0.writeObject(object0);
      jSONWriter0.writeValue((Object) null);
      // Undeclared exception!
      try { 
        jSONWriter0.writeStartArray();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // illegal state : 1003
         //
         verifyException("com.alibaba.fastjson.JSONWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSONWriter jSONWriter0 = new JSONWriter((Writer) null);
      jSONWriter0.close();
      // Undeclared exception!
      try { 
        jSONWriter0.writeStartArray();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.SerializeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSONWriter jSONWriter0 = new JSONWriter((Writer) null);
      jSONWriter0.close();
      // Undeclared exception!
      try { 
        jSONWriter0.writeObject("2Y{]1\"QhCzXQ:GcN");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.SerializeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSONWriter jSONWriter0 = new JSONWriter((Writer) null);
      // Undeclared exception!
      try { 
        jSONWriter0.writeObject((Object) "e4<n");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // create asm serializer error, verson 1.2.68, class byte
         //
         verifyException("com.alibaba.fastjson.serializer.SerializeConfig", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSONWriter jSONWriter0 = new JSONWriter((Writer) null);
      jSONWriter0.close();
      // Undeclared exception!
      try { 
        jSONWriter0.writeObject((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.SerializeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSONWriter jSONWriter0 = new JSONWriter((Writer) null);
      jSONWriter0.close();
      // Undeclared exception!
      try { 
        jSONWriter0.writeKey("illegal state : ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.SerializeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSONWriter jSONWriter0 = new JSONWriter((Writer) null);
      jSONWriter0.close();
      // Undeclared exception!
      try { 
        jSONWriter0.startObject();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.SerializeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSONWriter jSONWriter0 = new JSONWriter((Writer) null);
      jSONWriter0.writeStartObject();
      jSONWriter0.writeObject("AllowArbitraryCommas");
      jSONWriter0.writeValue((Object) null);
      // Undeclared exception!
      try { 
        jSONWriter0.startArray();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // illegal state : 1003
         //
         verifyException("com.alibaba.fastjson.JSONWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSONWriter jSONWriter0 = new JSONWriter((Writer) null);
      jSONWriter0.close();
      // Undeclared exception!
      try { 
        jSONWriter0.startArray();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.SerializeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSONWriter jSONWriter0 = new JSONWriter((Writer) null);
      // Undeclared exception!
      try { 
        jSONWriter0.endObject();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.JSONWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(67);
      JSONWriter jSONWriter0 = new JSONWriter(stringWriter0);
      // Undeclared exception!
      try { 
        jSONWriter0.endArray();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.JSONWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSONWriter jSONWriter0 = new JSONWriter((Writer) null);
      // Undeclared exception!
      try { 
        jSONWriter0.config((SerializerFeature) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.SerializeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSONWriter jSONWriter0 = new JSONWriter((Writer) null);
      jSONWriter0.close();
      // Undeclared exception!
      try { 
        jSONWriter0.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.SerializeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(901);
      JSONWriter jSONWriter0 = new JSONWriter(stringWriter0);
      jSONWriter0.writeStartArray();
      jSONWriter0.writeStartObject();
      jSONWriter0.endObject();
      Object object0 = new Object();
      jSONWriter0.writeValue(object0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(901);
      JSONWriter jSONWriter0 = new JSONWriter(stringWriter0);
      jSONWriter0.startObject();
      jSONWriter0.writeKey("2kXZpmSn");
      jSONWriter0.writeObject((Object) null);
      // Undeclared exception!
      try { 
        jSONWriter0.writeStartObject();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // illegal state : 1003
         //
         verifyException("com.alibaba.fastjson.JSONWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(901);
      JSONWriter jSONWriter0 = new JSONWriter(stringWriter0);
      jSONWriter0.startObject();
      jSONWriter0.writeObject((Object) null);
      jSONWriter0.writeStartObject();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSONWriter jSONWriter0 = new JSONWriter((Writer) null);
      jSONWriter0.startObject();
      jSONWriter0.writeEndArray();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(901);
      JSONWriter jSONWriter0 = new JSONWriter(stringWriter0);
      jSONWriter0.writeStartArray();
      jSONWriter0.writeKey("");
      jSONWriter0.writeObject((Object) null);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JSONWriter jSONWriter0 = new JSONWriter((Writer) null);
      jSONWriter0.startArray();
      jSONWriter0.writeStartArray();
      jSONWriter0.writeEndObject();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSONWriter jSONWriter0 = new JSONWriter((Writer) null);
      jSONWriter0.writeStartObject();
      jSONWriter0.endArray();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(901);
      JSONWriter jSONWriter0 = new JSONWriter(stringWriter0);
      jSONWriter0.writeStartArray();
      jSONWriter0.writeKey("");
      jSONWriter0.writeStartObject();
      jSONWriter0.endObject();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JSONWriter jSONWriter0 = new JSONWriter((Writer) null);
      jSONWriter0.writeStartObject();
      jSONWriter0.startArray();
      jSONWriter0.endArray();
      jSONWriter0.writeStartArray();
      jSONWriter0.writeEndObject();
      jSONWriter0.writeObject("");
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSONWriter jSONWriter0 = new JSONWriter((Writer) null);
      jSONWriter0.writeStartObject();
      jSONWriter0.writeStartArray();
      jSONWriter0.endArray();
      jSONWriter0.writeValue((Object) null);
      // Undeclared exception!
      try { 
        jSONWriter0.startObject();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // illegal state : 1003
         //
         verifyException("com.alibaba.fastjson.JSONWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSONWriter jSONWriter0 = new JSONWriter((Writer) null);
      jSONWriter0.writeValue((Object) null);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(901);
      JSONWriter jSONWriter0 = new JSONWriter(stringWriter0);
      SerializerFeature serializerFeature0 = SerializerFeature.WriteClassName;
      jSONWriter0.config(serializerFeature0, true);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSONWriter jSONWriter0 = new JSONWriter((Writer) null);
      // Undeclared exception!
      try { 
        jSONWriter0.writeEndObject();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.JSONWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      JSONWriter jSONWriter0 = new JSONWriter(stringWriter0);
      jSONWriter0.close();
      // Undeclared exception!
      try { 
        jSONWriter0.flush();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSONWriter jSONWriter0 = new JSONWriter((Writer) null);
      // Undeclared exception!
      try { 
        jSONWriter0.writeEndArray();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.JSONWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JSONWriter jSONWriter0 = new JSONWriter((Writer) null);
      jSONWriter0.flush();
  }
}
