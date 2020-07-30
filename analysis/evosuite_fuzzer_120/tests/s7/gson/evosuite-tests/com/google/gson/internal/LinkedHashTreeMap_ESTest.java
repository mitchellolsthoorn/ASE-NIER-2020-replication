/*
 * This file was automatically generated by EvoSuite
 * Thu May 21 23:44:37 GMT 2020
 */

package com.google.gson.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.internal.LinkedHashTreeMap;
import java.lang.reflect.Array;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LinkedHashTreeMap_ESTest extends LinkedHashTreeMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedHashTreeMap.AvlBuilder<Object, Integer> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<Object, Integer>();
      linkedHashTreeMap_AvlBuilder0.reset(0);
      LinkedHashTreeMap.Node<Object, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, Integer>();
      linkedHashTreeMap_AvlBuilder0.add(linkedHashTreeMap_Node0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedHashTreeMap.AvlIterator<String, Integer> linkedHashTreeMap_AvlIterator0 = new LinkedHashTreeMap.AvlIterator<String, Integer>();
      LinkedHashTreeMap.Node<Object, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, Integer>();
      LinkedHashTreeMap.AvlBuilder<Object, Integer> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<Object, Integer>();
      LinkedHashTreeMap.Node<Object, Integer> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Object, Integer>();
      LinkedHashTreeMap<String, AbstractMap.SimpleImmutableEntry<Object, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<String, AbstractMap.SimpleImmutableEntry<Object, Object>>();
      LinkedHashTreeMap<Integer, String> linkedHashTreeMap1 = new LinkedHashTreeMap<Integer, String>();
      LinkedHashTreeMap<String, AbstractMap.SimpleEntry<Object, Object>> linkedHashTreeMap2 = new LinkedHashTreeMap<String, AbstractMap.SimpleEntry<Object, Object>>();
      linkedHashTreeMap2.entrySet();
      LinkedHashTreeMap<Integer, String> linkedHashTreeMap3 = new LinkedHashTreeMap<Integer, String>();
      LinkedHashTreeMap<AbstractMap.SimpleEntry<String, Object>, String> linkedHashTreeMap4 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<String, Object>, String>();
      AbstractMap.SimpleEntry<String, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, Object>("2]gki{{g", linkedHashTreeMap0);
      // Undeclared exception!
      try { 
        linkedHashTreeMap4.put(abstractMap_SimpleEntry0, "2]gki{{g");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.AbstractMap$SimpleEntry is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedHashTreeMap.AvlBuilder<Object, Integer> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<Object, Integer>();
      LinkedHashTreeMap.Node<Object, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, Integer>();
      linkedHashTreeMap_AvlBuilder0.add(linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<Object, Integer> linkedHashTreeMap_Node1 = linkedHashTreeMap_AvlBuilder0.root();
      assertNotNull(linkedHashTreeMap_Node1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Integer>, LinkedHashTreeMap<Object, String>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Integer>, LinkedHashTreeMap<Object, String>>();
      AbstractMap.SimpleEntry<Object, Integer> abstractMap_SimpleEntry0 = linkedHashTreeMap_Node0.getKey();
      assertNull(abstractMap_SimpleEntry0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<AbstractMap.SimpleEntry<String, Object>, AbstractMap.SimpleImmutableEntry<String, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<String, Object>, AbstractMap.SimpleImmutableEntry<String, Object>>(comparator0);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      linkedHashTreeMap_EntrySet0.iterator();
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, Object>, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, Object>, Object>();
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, Object>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, Object>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 6);
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, Object>();
      AbstractMap.SimpleEntry<Object, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, Object>(linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, Object> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, Object>(linkedHashTreeMap_Node0, abstractMap_SimpleEntry0, (-1040), linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, Object> linkedHashTreeMap_Node2 = linkedHashTreeMap_Node1.last();
      assertNotNull(linkedHashTreeMap_Node2);
      
      linkedHashTreeMap_NodeArray0[0] = linkedHashTreeMap_Node2;
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, Object> linkedHashTreeMap_Node3 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, Object>();
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, Object> linkedHashTreeMap_Node4 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, Object>(linkedHashTreeMap_Node1, abstractMap_SimpleEntry0, 16, linkedHashTreeMap_Node3, linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, Object> linkedHashTreeMap_Node5 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, Object>();
      assertFalse(linkedHashTreeMap_Node5.equals((Object)linkedHashTreeMap_Node4));
      
      linkedHashTreeMap0.table = linkedHashTreeMap_NodeArray0;
      linkedHashTreeMap0.get("{\"x\":\"hello\",\"y\":7,\"z\":true,\"a\":99,\"b\":{}}");
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<String, Object>, AbstractMap.SimpleEntry<Object, String>> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<String, Object>, AbstractMap.SimpleEntry<Object, String>>(comparator0);
      AbstractMap.SimpleImmutableEntry<String, String> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, String>("", (String) null);
      AbstractMap.SimpleImmutableEntry<String, Object> abstractMap_SimpleImmutableEntry1 = new AbstractMap.SimpleImmutableEntry<String, Object>(abstractMap_SimpleImmutableEntry0);
      AbstractMap.SimpleEntry<Object, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, String>(abstractMap_SimpleImmutableEntry0);
      linkedHashTreeMap0.put(abstractMap_SimpleImmutableEntry1, abstractMap_SimpleEntry0);
      int int0 = linkedHashTreeMap0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<Integer, String>, LinkedHashTreeMap<Integer, String>> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<Integer, String>, LinkedHashTreeMap<Integer, String>>();
      LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<Integer, String>, LinkedHashTreeMap<Integer, String>> linkedHashTreeMap_Node0 = linkedHashTreeMap0.removeInternalByKey((Object) null);
      assertEquals(0, linkedHashTreeMap0.size());
      assertNull(linkedHashTreeMap_Node0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>((Comparator<? super String>) null);
      linkedHashTreeMap0.put("1*qRk8", "1*qRk8");
      linkedHashTreeMap0.keySet();
      assertEquals(1, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedHashTreeMap<String, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Object>();
      linkedHashTreeMap0.findByObject((Object) null);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, Integer>();
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>();
      linkedHashTreeMap0.findByEntry(linkedHashTreeMap_Node0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Integer, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Object>(comparator0);
      LinkedHashTreeMap<LinkedHashTreeMap<Integer, Object>, Object> linkedHashTreeMap1 = new LinkedHashTreeMap<LinkedHashTreeMap<Integer, Object>, Object>();
      linkedHashTreeMap1.find(linkedHashTreeMap0, false);
      assertEquals(0, linkedHashTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Integer, LinkedHashTreeMap<String, Integer>> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, LinkedHashTreeMap<String, Integer>>(comparator0);
      LinkedHashTreeMap.Node<Integer, LinkedHashTreeMap<String, Integer>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, LinkedHashTreeMap<String, Integer>>();
      linkedHashTreeMap0.removeInternal(linkedHashTreeMap_Node0, true);
      linkedHashTreeMap0.entrySet();
      assertEquals((-1), linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedHashTreeMap<Integer, LinkedHashTreeMap<String, Integer>> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, LinkedHashTreeMap<String, Integer>>();
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.removeInternal((LinkedHashTreeMap.Node<Integer, LinkedHashTreeMap<String, Integer>>) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, Object>, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, Object>, Object>();
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, Object>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, Object>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 6);
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, Object>();
      AbstractMap.SimpleEntry<Object, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, Object>(linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, Object> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, Object>(linkedHashTreeMap_Node0, abstractMap_SimpleEntry0, (-1040), linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, Object> linkedHashTreeMap_Node2 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, Object>();
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, Object> linkedHashTreeMap_Node3 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, Object>();
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, Object> linkedHashTreeMap_Node4 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, Object>(linkedHashTreeMap_Node1, abstractMap_SimpleEntry0, 16, linkedHashTreeMap_Node3, linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, Object> linkedHashTreeMap_Node5 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, Object>();
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, Object> linkedHashTreeMap_Node6 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, Object>();
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, Object> linkedHashTreeMap_Node7 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, Object>();
      linkedHashTreeMap_NodeArray0[4] = linkedHashTreeMap_Node7;
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, Object> linkedHashTreeMap_Node8 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, Object>(linkedHashTreeMap_Node5, abstractMap_SimpleEntry0, (-1040), linkedHashTreeMap_Node1, linkedHashTreeMap_Node1);
      linkedHashTreeMap0.table = linkedHashTreeMap_NodeArray0;
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.get("{\"x\":\"\",\"\":[],\"a\":99,\"b\":{}}");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>();
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.findByEntry((Map.Entry<?, ?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<Integer, String>[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedHashTreeMap.AvlIterator<Integer, AbstractMap.SimpleImmutableEntry<String, String>> linkedHashTreeMap_AvlIterator0 = new LinkedHashTreeMap.AvlIterator<Integer, AbstractMap.SimpleImmutableEntry<String, String>>();
      LinkedHashTreeMap.Node<Integer, AbstractMap.SimpleImmutableEntry<String, String>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, AbstractMap.SimpleImmutableEntry<String, String>>();
      linkedHashTreeMap_AvlIterator0.reset(linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<Integer, AbstractMap.SimpleImmutableEntry<String, String>> linkedHashTreeMap_Node1 = linkedHashTreeMap_AvlIterator0.next();
      assertNotNull(linkedHashTreeMap_Node1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedHashTreeMap.AvlIterator<Object, Object> linkedHashTreeMap_AvlIterator0 = new LinkedHashTreeMap.AvlIterator<Object, Object>();
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node0 = linkedHashTreeMap_AvlIterator0.next();
      assertNull(linkedHashTreeMap_Node0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      boolean boolean0 = linkedHashTreeMap_KeySet0.remove("Ai");
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedHashTreeMap<Integer, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Object>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      Integer integer0 = new Integer(1241);
      boolean boolean0 = linkedHashTreeMap_EntrySet0.remove(integer0);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, Integer>();
      LinkedHashTreeMap.Node<Object, Integer> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Object, Integer>(linkedHashTreeMap_Node0, linkedHashTreeMap_Node0, (-1469), linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      LinkedHashTreeMap<Integer, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, String>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.contains(linkedHashTreeMap_Node1);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>((Comparator<? super Object>) null);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.contains(linkedHashTreeMap0);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, Integer>();
      LinkedHashTreeMap.AvlBuilder<Object, Integer> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<Object, Integer>();
      linkedHashTreeMap_AvlBuilder0.add(linkedHashTreeMap_Node0);
      linkedHashTreeMap_AvlBuilder0.add(linkedHashTreeMap_Node0);
      // Undeclared exception!
      try { 
        linkedHashTreeMap_AvlBuilder0.root();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap$AvlBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LinkedHashTreeMap.AvlBuilder<Object, Integer> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<Object, Integer>();
      LinkedHashTreeMap.Node<Object, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, Integer>();
      linkedHashTreeMap_AvlBuilder0.reset((-893));
      linkedHashTreeMap_AvlBuilder0.add(linkedHashTreeMap_Node0);
      linkedHashTreeMap_AvlBuilder0.add(linkedHashTreeMap_Node0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Integer integer0 = new Integer(0);
      LinkedHashTreeMap.Node<Integer, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, String>();
      LinkedHashTreeMap.Node<Integer, String>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<Integer, String>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 7);
      LinkedHashTreeMap.Node<Integer, String> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Integer, String>(linkedHashTreeMap_Node0, integer0, 0, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      linkedHashTreeMap_NodeArray0[3] = linkedHashTreeMap_Node1;
      LinkedHashTreeMap.Node<Integer, String>[] linkedHashTreeMap_NodeArray1 = LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<Integer, String>[]) linkedHashTreeMap_NodeArray0);
      assertEquals(14, linkedHashTreeMap_NodeArray1.length);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, Integer>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<Object, Integer>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 3);
      LinkedHashTreeMap.Node<Object, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, Integer>();
      linkedHashTreeMap_NodeArray0[0] = linkedHashTreeMap_Node0;
      LinkedHashTreeMap.Node<Object, Integer>[] linkedHashTreeMap_NodeArray1 = LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<Object, Integer>[]) linkedHashTreeMap_NodeArray0);
      assertEquals(6, linkedHashTreeMap_NodeArray1.length);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Integer>();
      linkedHashTreeMap_Node0.right = linkedHashTreeMap_Node0;
      // Undeclared exception!
      linkedHashTreeMap_Node0.last();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LinkedHashTreeMap.Node<String, AbstractMap.SimpleEntry<Object, Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, AbstractMap.SimpleEntry<Object, Object>>();
      LinkedHashTreeMap.Node<String, AbstractMap.SimpleEntry<Object, Object>> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<String, AbstractMap.SimpleEntry<Object, Object>>(linkedHashTreeMap_Node0, "", 1362, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      linkedHashTreeMap_Node0.left = linkedHashTreeMap_Node1;
      LinkedHashTreeMap.Node<String, AbstractMap.SimpleEntry<Object, Object>> linkedHashTreeMap_Node2 = linkedHashTreeMap_Node0.first();
      assertNotNull(linkedHashTreeMap_Node2);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedHashTreeMap.AvlBuilder<Object, Integer> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<Object, Integer>();
      LinkedHashTreeMap.Node<Object, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, Integer>();
      LinkedHashTreeMap.Node<Object, Integer> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Object, Integer>(linkedHashTreeMap_Node0, linkedHashTreeMap_AvlBuilder0, (-1527), linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node2 = new LinkedHashTreeMap.Node<Object, Object>();
      boolean boolean0 = linkedHashTreeMap_Node2.equals(linkedHashTreeMap_Node0.next);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LinkedHashTreeMap.Node<String, AbstractMap.SimpleEntry<Object, Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, AbstractMap.SimpleEntry<Object, Object>>();
      LinkedHashTreeMap.Node<String, AbstractMap.SimpleEntry<Object, Object>> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<String, AbstractMap.SimpleEntry<Object, Object>>(linkedHashTreeMap_Node0, "Ai", (-2), linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      boolean boolean0 = linkedHashTreeMap_Node1.equals(linkedHashTreeMap_Node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LinkedHashTreeMap.Node<String, AbstractMap.SimpleEntry<Object, Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, AbstractMap.SimpleEntry<Object, Object>>();
      boolean boolean0 = linkedHashTreeMap_Node0.equals(linkedHashTreeMap_Node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LinkedHashTreeMap.Node<String, AbstractMap.SimpleEntry<Object, Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, AbstractMap.SimpleEntry<Object, Object>>();
      boolean boolean0 = linkedHashTreeMap_Node0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>((Comparator<? super String>) null);
      linkedHashTreeMap0.keySet();
      Set<String> set0 = linkedHashTreeMap0.keySet();
      assertNotNull(set0);
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>();
      linkedHashTreeMap0.entrySet();
      BiFunction<Object, String, String> biFunction0 = (BiFunction<Object, String, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      linkedHashTreeMap0.replaceAll(biFunction0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LinkedHashTreeMap<Integer, LinkedHashTreeMap<String, Integer>> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, LinkedHashTreeMap<String, Integer>>((Comparator<? super Integer>) null);
      LinkedHashTreeMap.Node<Integer, LinkedHashTreeMap<String, Integer>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, LinkedHashTreeMap<String, Integer>>();
      Integer integer0 = new Integer(0);
      LinkedHashTreeMap.Node<Integer, LinkedHashTreeMap<String, Integer>> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Integer, LinkedHashTreeMap<String, Integer>>(linkedHashTreeMap_Node0, integer0, (-2164), linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.removeInternal(linkedHashTreeMap_Node1, false);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Integer, LinkedHashTreeMap<String, Integer>> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, LinkedHashTreeMap<String, Integer>>(comparator0);
      LinkedHashTreeMap.Node<Integer, LinkedHashTreeMap<String, Integer>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, LinkedHashTreeMap<String, Integer>>();
      linkedHashTreeMap_Node0.right = linkedHashTreeMap_Node0;
      linkedHashTreeMap0.removeInternal(linkedHashTreeMap_Node0, true);
      assertEquals((-1), linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<Object, Integer>, String> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<Object, Integer>, String>();
      Integer integer0 = new Integer(20);
      AbstractMap.SimpleImmutableEntry<Object, Integer> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Object, Integer>(integer0, integer0);
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.find(abstractMap_SimpleImmutableEntry0, true);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.AbstractMap$SimpleImmutableEntry is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, Integer>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<Object, Integer>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 0);
      LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<Object, Integer>[]) linkedHashTreeMap_NodeArray0);
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>();
      LinkedHashTreeMap.Node<String, String>[] linkedHashTreeMap_NodeArray1 = (LinkedHashTreeMap.Node<String, String>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 5);
      LinkedHashTreeMap.Node<String, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, String>();
      LinkedHashTreeMap.Node<String, String> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<String, String>(linkedHashTreeMap_Node0, "com.google.gson.internal.LinkedHashTreeMap$KeySet", (-1789), linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<String, String> linkedHashTreeMap_Node2 = linkedHashTreeMap_Node1.last();
      linkedHashTreeMap_NodeArray1[0] = linkedHashTreeMap_Node2;
      linkedHashTreeMap0.table = linkedHashTreeMap_NodeArray1;
      linkedHashTreeMap0.find("com.google.gson.internal.LinkedHashTreeMap$EntrySet$1", true);
      assertEquals(1, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, String>, LinkedHashTreeMap<Object, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, String>, LinkedHashTreeMap<Object, Object>>();
      linkedHashTreeMap0.remove((Object) null);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>(comparator0);
      BiFunction<Object, Object, String> biFunction0 = (BiFunction<Object, Object, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      linkedHashTreeMap0.merge("%", "^jL/,X*hm", biFunction0);
      linkedHashTreeMap0.clear();
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LinkedHashTreeMap<Integer, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Integer>();
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.put((Integer) null, (Integer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key == null
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>();
      boolean boolean0 = linkedHashTreeMap0.containsKey("<Cz5R7SRd0(");
      assertEquals(0, linkedHashTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      linkedHashTreeMap_KeySet0.clear();
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LinkedHashTreeMap<Integer, LinkedHashTreeMap<String, Integer>> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, LinkedHashTreeMap<String, Integer>>();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      boolean boolean0 = linkedHashTreeMap_KeySet0.contains((Object) null);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, Object>, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, Object>, Object>();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      int int0 = linkedHashTreeMap_KeySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, Object>, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, Object>, Object>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      linkedHashTreeMap_EntrySet0.clear();
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>(comparator0);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      int int0 = linkedHashTreeMap_EntrySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      linkedHashTreeMap_KeySet0.iterator();
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>();
      linkedHashTreeMap0.find("com.google.gson.internal.LinkedHashTreeMap$EntrySet$1", true);
      BiFunction<Object, String, String> biFunction0 = (BiFunction<Object, String, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn("com.google.gson.internal.LinkedHashTreeMap$KeySet").when(biFunction0).apply(any() , anyString());
      linkedHashTreeMap0.replaceAll(biFunction0);
      assertEquals(1, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, Object>();
      Object object0 = linkedHashTreeMap_Node0.setValue((Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      LinkedHashTreeMap<Object, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Integer>((Comparator<? super Object>) null);
      LinkedHashTreeMap.Node<Object, Integer> linkedHashTreeMap_Node0 = linkedHashTreeMap0.header;
      linkedHashTreeMap_Node0.getValue();
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      LinkedHashTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<Object, Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<Object, Object>>();
      String string0 = linkedHashTreeMap_Node0.toString();
      assertEquals("null=null", string0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, String>, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, String>, Object>();
      int int0 = linkedHashTreeMap0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>();
      LinkedHashTreeMap.Node<Integer, LinkedHashTreeMap<String, Integer>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, LinkedHashTreeMap<String, Integer>>();
      Integer integer0 = new Integer((-1));
      LinkedHashTreeMap.Node<Integer, LinkedHashTreeMap<String, Integer>> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Integer, LinkedHashTreeMap<String, Integer>>(linkedHashTreeMap_Node0, integer0, (-1), linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.remove(linkedHashTreeMap_Node1);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }
}
