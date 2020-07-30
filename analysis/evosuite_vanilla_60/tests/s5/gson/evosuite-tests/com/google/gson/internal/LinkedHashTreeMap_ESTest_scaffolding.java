/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed May 20 13:12:51 GMT 2020
 */

package com.google.gson.internal;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class LinkedHashTreeMap_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.google.gson.internal.LinkedHashTreeMap"; 
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
    java.lang.System.setProperty("user.dir", "/home/apaniche/mitchell/generation-scripts/projects/gson"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(LinkedHashTreeMap_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.gson.internal.LinkedHashTreeMap",
      "com.google.gson.internal.LinkedHashTreeMap$AvlIterator",
      "com.google.gson.internal.LinkedHashTreeMap$1",
      "com.google.gson.internal.LinkedHashTreeMap$Node",
      "com.google.gson.internal.LinkedHashTreeMap$LinkedTreeMapIterator",
      "com.google.gson.internal.LinkedHashTreeMap$EntrySet$1",
      "com.google.gson.internal.LinkedHashTreeMap$KeySet$1",
      "com.google.gson.internal.LinkedHashTreeMap$EntrySet",
      "com.google.gson.internal.LinkedHashTreeMap$KeySet",
      "com.google.gson.internal.LinkedHashTreeMap$AvlBuilder"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.util.Comparator", false, LinkedHashTreeMap_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("java.util.function.BiConsumer", false, LinkedHashTreeMap_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(LinkedHashTreeMap_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.google.gson.internal.LinkedHashTreeMap$1",
      "com.google.gson.internal.LinkedHashTreeMap",
      "com.google.gson.internal.LinkedHashTreeMap$Node",
      "com.google.gson.internal.LinkedHashTreeMap$AvlIterator",
      "com.google.gson.internal.LinkedHashTreeMap$AvlBuilder",
      "com.google.gson.internal.LinkedHashTreeMap$EntrySet",
      "com.google.gson.internal.LinkedHashTreeMap$KeySet",
      "com.google.gson.internal.LinkedHashTreeMap$LinkedTreeMapIterator",
      "com.google.gson.internal.LinkedHashTreeMap$EntrySet$1",
      "com.google.gson.internal.LinkedHashTreeMap$KeySet$1"
    );
  }
}
