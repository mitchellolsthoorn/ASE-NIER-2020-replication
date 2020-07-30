/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri May 22 19:53:33 GMT 2020
 */

package com.alibaba.fastjson;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class JSONObject_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.alibaba.fastjson.JSONObject"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("user.dir", "/home/apaniche/mitchell/generation-scripts/projects/fastjson"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(JSONObject_ESTest_scaffolding.class.getClassLoader() ,
      "com.alibaba.fastjson.asm.ClassWriter",
      "com.alibaba.fastjson.parser.deserializer.AbstractDateDeserializer",
      "com.alibaba.fastjson.util.ASMUtils",
      "com.alibaba.fastjson.JSONPath",
      "com.alibaba.fastjson.parser.JSONScanner",
      "com.alibaba.fastjson.parser.JSONLexerBase",
      "com.alibaba.fastjson.parser.deserializer.ParseProcess",
      "com.alibaba.fastjson.parser.deserializer.FieldTypeResolver",
      "com.alibaba.fastjson.parser.ParserConfig$AutoTypeCheckHandler",
      "com.alibaba.fastjson.serializer.JSONSerializable",
      "com.alibaba.fastjson.serializer.SerializeWriter",
      "com.alibaba.fastjson.serializer.ReferenceCodec",
      "com.alibaba.fastjson.JSONException",
      "com.alibaba.fastjson.asm.TypeCollector$1",
      "com.alibaba.fastjson.serializer.ObjectArrayCodec",
      "com.alibaba.fastjson.serializer.ToStringSerializer",
      "com.alibaba.fastjson.serializer.SerialContext",
      "com.alibaba.fastjson.serializer.AfterFilter",
      "com.alibaba.fastjson.parser.deserializer.ResolveFieldDeserializer",
      "com.alibaba.fastjson.TypeReference",
      "com.alibaba.fastjson.serializer.ObjectSerializer",
      "com.alibaba.fastjson.asm.Item",
      "com.alibaba.fastjson.serializer.MapSerializer",
      "com.alibaba.fastjson.JSONObject$SecureObjectInputStream",
      "com.alibaba.fastjson.serializer.DateCodec",
      "com.alibaba.fastjson.serializer.ByteBufferCodec",
      "com.alibaba.fastjson.parser.deserializer.StackTraceElementDeserializer",
      "com.alibaba.fastjson.parser.deserializer.EnumDeserializer",
      "com.alibaba.fastjson.parser.deserializer.ExtraTypeProvider",
      "com.alibaba.fastjson.parser.DefaultJSONParser$ResolveTask",
      "com.alibaba.fastjson.serializer.BigDecimalCodec",
      "com.alibaba.fastjson.serializer.PrimitiveArraySerializer",
      "com.alibaba.fastjson.util.FieldInfo",
      "com.alibaba.fastjson.serializer.PropertyFilter",
      "com.alibaba.fastjson.annotation.JSONField",
      "com.alibaba.fastjson.parser.SymbolTable",
      "com.alibaba.fastjson.serializer.NameFilter",
      "com.alibaba.fastjson.serializer.ListSerializer",
      "com.alibaba.fastjson.JSONArray",
      "com.alibaba.fastjson.util.GenericArrayTypeImpl",
      "com.alibaba.fastjson.JSONAware",
      "com.alibaba.fastjson.serializer.LongCodec",
      "com.alibaba.fastjson.serializer.EnumSerializer",
      "com.alibaba.fastjson.util.ASMClassLoader",
      "com.alibaba.fastjson.PropertyNamingStrategy",
      "com.alibaba.fastjson.parser.JSONToken",
      "com.alibaba.fastjson.parser.deserializer.JSONPDeserializer",
      "com.alibaba.fastjson.serializer.AppendableSerializer",
      "com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer",
      "com.alibaba.fastjson.parser.deserializer.AutowiredObjectDeserializer",
      "com.alibaba.fastjson.serializer.ContextValueFilter",
      "com.alibaba.fastjson.util.ServiceLoader",
      "com.alibaba.fastjson.serializer.ASMSerializerFactory$Context",
      "com.alibaba.fastjson.parser.deserializer.ArrayListTypeFieldDeserializer",
      "com.alibaba.fastjson.parser.DefaultJSONParser",
      "com.alibaba.fastjson.serializer.ContextObjectSerializer",
      "com.alibaba.fastjson.parser.deserializer.MapDeserializer",
      "com.alibaba.fastjson.serializer.SimplePropertyPreFilter",
      "com.alibaba.fastjson.serializer.BeanContext",
      "com.alibaba.fastjson.serializer.AutowiredObjectSerializer",
      "com.alibaba.fastjson.util.IdentityHashMap",
      "com.alibaba.fastjson.serializer.BigIntegerCodec",
      "com.alibaba.fastjson.JSON",
      "com.alibaba.fastjson.serializer.StringCodec",
      "com.alibaba.fastjson.serializer.SerializeFilterable",
      "com.alibaba.fastjson.JSONWriter",
      "com.alibaba.fastjson.asm.Opcodes",
      "com.alibaba.fastjson.JSONReader",
      "com.alibaba.fastjson.JSONStreamAware",
      "com.alibaba.fastjson.asm.MethodWriter",
      "com.alibaba.fastjson.serializer.SerializeBeanInfo",
      "com.alibaba.fastjson.serializer.SerializerFeature",
      "com.alibaba.fastjson.TypeReference$1",
      "com.alibaba.fastjson.serializer.CalendarCodec",
      "com.alibaba.fastjson.util.IOUtils",
      "com.alibaba.fastjson.util.TypeUtils",
      "com.alibaba.fastjson.parser.deserializer.JavaObjectDeserializer",
      "com.alibaba.fastjson.asm.ClassReader",
      "com.alibaba.fastjson.spi.Module",
      "com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory",
      "com.alibaba.fastjson.serializer.MiscCodec",
      "com.alibaba.fastjson.util.IOUtils$1",
      "com.alibaba.fastjson.serializer.IntegerCodec",
      "com.alibaba.fastjson.serializer.JSONAwareSerializer",
      "com.alibaba.fastjson.serializer.SerializeFilter",
      "com.alibaba.fastjson.JSONPObject",
      "com.alibaba.fastjson.util.RyuDouble",
      "com.alibaba.fastjson.serializer.PascalNameFilter",
      "com.alibaba.fastjson.parser.deserializer.ExtraProcessor",
      "com.alibaba.fastjson.serializer.BeforeFilter",
      "com.alibaba.fastjson.parser.deserializer.ExtraProcessable",
      "com.alibaba.fastjson.serializer.ArraySerializer",
      "com.alibaba.fastjson.util.ParameterizedTypeImpl",
      "com.alibaba.fastjson.parser.deserializer.TimeDeserializer",
      "com.alibaba.fastjson.JSONObject",
      "com.alibaba.fastjson.parser.deserializer.SqlDateDeserializer",
      "com.alibaba.fastjson.serializer.CharacterCodec",
      "com.alibaba.fastjson.asm.TypeCollector",
      "com.alibaba.fastjson.parser.deserializer.ObjectDeserializer",
      "com.alibaba.fastjson.asm.ByteVector",
      "com.alibaba.fastjson.parser.JSONLexer",
      "com.alibaba.fastjson.util.ASMClassLoader$1",
      "com.alibaba.fastjson.asm.Label",
      "com.alibaba.fastjson.asm.FieldWriter",
      "com.alibaba.fastjson.serializer.JSONSerializer",
      "com.alibaba.fastjson.util.JavaBeanInfo",
      "com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer",
      "com.alibaba.fastjson.serializer.SerializeConfig",
      "com.alibaba.fastjson.serializer.AtomicCodec",
      "com.alibaba.fastjson.parser.deserializer.ContextObjectDeserializer",
      "com.alibaba.fastjson.serializer.FieldSerializer$RuntimeSerializerInfo",
      "com.alibaba.fastjson.asm.Type",
      "com.alibaba.fastjson.serializer.FieldSerializer",
      "com.alibaba.fastjson.serializer.FloatCodec",
      "com.alibaba.fastjson.parser.JSONReaderScanner",
      "com.alibaba.fastjson.serializer.ValueFilter",
      "com.alibaba.fastjson.JSONPathException",
      "com.alibaba.fastjson.parser.deserializer.FieldDeserializer",
      "com.alibaba.fastjson.serializer.Labels",
      "com.alibaba.fastjson.serializer.CollectionCodec",
      "com.alibaba.fastjson.util.RyuFloat",
      "com.alibaba.fastjson.parser.deserializer.PropertyProcessable",
      "com.alibaba.fastjson.serializer.CharArrayCodec",
      "com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory$Context",
      "com.alibaba.fastjson.asm.MethodVisitor",
      "com.alibaba.fastjson.asm.MethodCollector",
      "com.alibaba.fastjson.parser.deserializer.NumberDeserializer",
      "com.alibaba.fastjson.serializer.LabelFilter",
      "com.alibaba.fastjson.annotation.JSONType",
      "com.alibaba.fastjson.util.UTF8Decoder",
      "com.alibaba.fastjson.serializer.JavaBeanSerializer",
      "com.alibaba.fastjson.util.IdentityHashMap$Entry",
      "com.alibaba.fastjson.serializer.DoubleSerializer",
      "com.alibaba.fastjson.serializer.ASMSerializerFactory",
      "com.alibaba.fastjson.serializer.BooleanCodec",
      "com.alibaba.fastjson.parser.Feature",
      "com.alibaba.fastjson.parser.ParserConfig",
      "com.alibaba.fastjson.serializer.PropertyPreFilter",
      "com.alibaba.fastjson.parser.ParseContext"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.util.function.BiFunction", false, JSONObject_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(JSONObject_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.alibaba.fastjson.parser.Feature",
      "com.alibaba.fastjson.serializer.SerializerFeature",
      "com.alibaba.fastjson.util.IOUtils$1",
      "com.alibaba.fastjson.util.IOUtils",
      "com.alibaba.fastjson.JSON",
      "com.alibaba.fastjson.JSONObject",
      "com.alibaba.fastjson.JSONObject$SecureObjectInputStream",
      "com.alibaba.fastjson.util.IdentityHashMap",
      "com.alibaba.fastjson.util.ASMUtils",
      "com.alibaba.fastjson.parser.SymbolTable",
      "com.alibaba.fastjson.util.TypeUtils",
      "com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory",
      "com.alibaba.fastjson.util.ASMClassLoader$1",
      "com.alibaba.fastjson.util.ASMClassLoader",
      "com.alibaba.fastjson.serializer.MiscCodec",
      "com.alibaba.fastjson.util.IdentityHashMap$Entry",
      "com.alibaba.fastjson.parser.deserializer.ContextObjectDeserializer",
      "com.alibaba.fastjson.parser.deserializer.AbstractDateDeserializer",
      "com.alibaba.fastjson.parser.deserializer.SqlDateDeserializer",
      "com.alibaba.fastjson.parser.deserializer.TimeDeserializer",
      "com.alibaba.fastjson.serializer.DateCodec",
      "com.alibaba.fastjson.serializer.CalendarCodec",
      "com.alibaba.fastjson.parser.deserializer.MapDeserializer",
      "com.alibaba.fastjson.serializer.CollectionCodec",
      "com.alibaba.fastjson.parser.deserializer.JavaObjectDeserializer",
      "com.alibaba.fastjson.serializer.StringCodec",
      "com.alibaba.fastjson.serializer.CharacterCodec",
      "com.alibaba.fastjson.parser.deserializer.NumberDeserializer",
      "com.alibaba.fastjson.serializer.IntegerCodec",
      "com.alibaba.fastjson.serializer.LongCodec",
      "com.alibaba.fastjson.serializer.BigIntegerCodec",
      "com.alibaba.fastjson.serializer.BigDecimalCodec",
      "com.alibaba.fastjson.serializer.FloatCodec",
      "com.alibaba.fastjson.serializer.BooleanCodec",
      "com.alibaba.fastjson.serializer.CharArrayCodec",
      "com.alibaba.fastjson.serializer.ReferenceCodec",
      "com.alibaba.fastjson.serializer.AtomicCodec",
      "com.alibaba.fastjson.parser.deserializer.StackTraceElementDeserializer",
      "com.alibaba.fastjson.parser.deserializer.JSONPDeserializer",
      "com.alibaba.fastjson.parser.ParserConfig",
      "com.alibaba.fastjson.serializer.ASMSerializerFactory",
      "com.alibaba.fastjson.serializer.DoubleSerializer",
      "com.alibaba.fastjson.serializer.PrimitiveArraySerializer",
      "com.alibaba.fastjson.serializer.ObjectArrayCodec",
      "com.alibaba.fastjson.serializer.AppendableSerializer",
      "com.alibaba.fastjson.serializer.ToStringSerializer",
      "com.alibaba.fastjson.serializer.SerializeConfig",
      "com.alibaba.fastjson.parser.DefaultJSONParser",
      "com.alibaba.fastjson.parser.JSONLexerBase",
      "com.alibaba.fastjson.parser.JSONScanner",
      "com.alibaba.fastjson.parser.ParseContext",
      "com.alibaba.fastjson.JSONArray",
      "com.alibaba.fastjson.JSONException",
      "com.alibaba.fastjson.parser.JSONToken",
      "com.alibaba.fastjson.serializer.SerializeWriter",
      "com.alibaba.fastjson.serializer.SerializeFilterable",
      "com.alibaba.fastjson.serializer.JSONSerializer",
      "com.alibaba.fastjson.util.ServiceLoader",
      "com.alibaba.fastjson.serializer.MapSerializer",
      "com.alibaba.fastjson.serializer.SerialContext",
      "com.alibaba.fastjson.TypeReference$1",
      "com.alibaba.fastjson.TypeReference",
      "com.alibaba.fastjson.serializer.SerializeBeanInfo",
      "com.alibaba.fastjson.serializer.JavaBeanSerializer",
      "com.alibaba.fastjson.serializer.ArraySerializer",
      "com.alibaba.fastjson.util.FieldInfo",
      "com.alibaba.fastjson.asm.ClassWriter",
      "com.alibaba.fastjson.asm.ByteVector",
      "com.alibaba.fastjson.asm.Item",
      "com.alibaba.fastjson.asm.FieldWriter",
      "com.alibaba.fastjson.asm.MethodWriter",
      "com.alibaba.fastjson.asm.Type",
      "com.alibaba.fastjson.serializer.ASMSerializerFactory$Context",
      "com.alibaba.fastjson.asm.Label",
      "com.alibaba.fastjson.serializer.FieldSerializer",
      "com.alibaba.fastjson.serializer.BeanContext",
      "com.alibaba.fastjson.serializer.SimplePropertyPreFilter",
      "com.alibaba.fastjson.util.UTF8Decoder",
      "com.alibaba.fastjson.util.JavaBeanInfo",
      "com.alibaba.fastjson.asm.ClassReader",
      "com.alibaba.fastjson.asm.TypeCollector$1",
      "com.alibaba.fastjson.asm.TypeCollector",
      "com.alibaba.fastjson.asm.MethodCollector",
      "com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer",
      "com.alibaba.fastjson.parser.deserializer.FieldDeserializer",
      "com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer",
      "com.alibaba.fastjson.parser.JSONReaderScanner",
      "com.alibaba.fastjson.serializer.ListSerializer",
      "com.alibaba.fastjson.serializer.EnumSerializer",
      "com.alibaba.fastjson.PropertyNamingStrategy",
      "com.alibaba.fastjson.serializer.PascalNameFilter",
      "com.alibaba.fastjson.util.RyuDouble",
      "com.alibaba.fastjson.serializer.FieldSerializer$RuntimeSerializerInfo",
      "com.alibaba.fastjson.serializer.ByteBufferCodec",
      "com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory$Context",
      "com.alibaba.fastjson.parser.deserializer.EnumDeserializer",
      "com.alibaba.fastjson.util.ParameterizedTypeImpl",
      "com.alibaba.fastjson.util.GenericArrayTypeImpl",
      "com.alibaba.fastjson.serializer.JSONAwareSerializer",
      "com.alibaba.fastjson.util.RyuFloat"
    );
  }
}
