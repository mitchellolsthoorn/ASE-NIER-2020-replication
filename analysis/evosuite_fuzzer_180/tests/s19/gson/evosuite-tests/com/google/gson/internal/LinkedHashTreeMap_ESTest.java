/*
 * This file was automatically generated by EvoSuite
 * Fri May 22 19:40:01 GMT 2020
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
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LinkedHashTreeMap_ESTest extends LinkedHashTreeMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedHashTreeMap.AvlBuilder<Map.Entry<Integer, LinkedHashTreeMap<String, String>>, AbstractMap.SimpleEntry<Object, Object>> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<Map.Entry<Integer, LinkedHashTreeMap<String, String>>, AbstractMap.SimpleEntry<Object, Object>>();
      LinkedHashTreeMap.Node<Map.Entry<Integer, LinkedHashTreeMap<String, String>>, AbstractMap.SimpleEntry<Object, Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Map.Entry<Integer, LinkedHashTreeMap<String, String>>, AbstractMap.SimpleEntry<Object, Object>>();
      linkedHashTreeMap_AvlBuilder0.add(linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<Map.Entry<Integer, LinkedHashTreeMap<String, String>>, AbstractMap.SimpleEntry<Object, Object>> linkedHashTreeMap_Node1 = linkedHashTreeMap_AvlBuilder0.root();
      assertNotNull(linkedHashTreeMap_Node1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedHashTreeMap.Node<LinkedHashTreeMap<String, Object>, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<LinkedHashTreeMap<String, Object>, Integer>();
      Integer integer0 = linkedHashTreeMap_Node0.getValue();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedHashTreeMap.Node<Integer, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, Object>();
      Integer integer0 = linkedHashTreeMap_Node0.getKey();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedHashTreeMap<Object, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Integer>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      int int0 = linkedHashTreeMap_EntrySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      linkedHashTreeMap_EntrySet0.iterator();
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedHashTreeMap<String, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Object>();
      int int0 = linkedHashTreeMap0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedHashTreeMap<String, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Object>();
      linkedHashTreeMap0.put("", (Object) null);
      assertEquals(1, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>();
      LinkedHashTreeMap.Node<Integer, LinkedHashTreeMap<String, String>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, LinkedHashTreeMap<String, String>>();
      Integer integer0 = linkedHashTreeMap0.get(linkedHashTreeMap_Node0);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedHashTreeMap<String, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Object>();
      Integer integer0 = new Integer(0);
      linkedHashTreeMap0.findByObject(integer0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedHashTreeMap.Node<LinkedHashTreeMap<String, Object>, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<LinkedHashTreeMap<String, Object>, Object>();
      LinkedHashTreeMap<String, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Object>();
      LinkedHashTreeMap.Node<LinkedHashTreeMap<String, Object>, Object> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<LinkedHashTreeMap<String, Object>, Object>(linkedHashTreeMap_Node0, linkedHashTreeMap0, 0, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, String> linkedHashTreeMap1 = new LinkedHashTreeMap<Object, String>(comparator0);
      LinkedHashTreeMap.Node<Object, String> linkedHashTreeMap_Node2 = linkedHashTreeMap1.findByEntry(linkedHashTreeMap_Node1);
      assertNull(linkedHashTreeMap_Node2);
      assertEquals(0, linkedHashTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Integer>(comparator0);
      linkedHashTreeMap0.find("{\"fruit\":\"Apple\",\"size\":\"Large\",\"value\":true,\"value2\":false,\"number\":\"1\"}", false);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedHashTreeMap<Integer, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Object>();
      linkedHashTreeMap0.size = 2837;
      Set<Map.Entry<Integer, Object>> set0 = (Set<Map.Entry<Integer, Object>>)linkedHashTreeMap0.entrySet();
      assertEquals(2837, set0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedHashTreeMap.Node<Integer, LinkedHashTreeMap<String, String>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, LinkedHashTreeMap<String, String>>();
      Integer integer0 = new Integer(1);
      LinkedHashTreeMap<Map.Entry<Integer, LinkedHashTreeMap<String, String>>, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<Map.Entry<Integer, LinkedHashTreeMap<String, String>>, Integer>();
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.put(linkedHashTreeMap_Node0, integer0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.gson.internal.LinkedHashTreeMap$Node is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedHashTreeMap<String, Map.Entry<Object, String>> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Map.Entry<Object, String>>();
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
  public void test14()  throws Throwable  {
      LinkedHashTreeMap<AbstractMap.SimpleEntry<Map.Entry<Integer, LinkedHashTreeMap<String, String>>, Map.Entry<Integer, LinkedHashTreeMap<String, String>>>, AbstractMap.SimpleEntry<Object, Integer>> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<Map.Entry<Integer, LinkedHashTreeMap<String, String>>, Map.Entry<Integer, LinkedHashTreeMap<String, String>>>, AbstractMap.SimpleEntry<Object, Integer>>((Comparator<? super AbstractMap.SimpleEntry<Map.Entry<Integer, LinkedHashTreeMap<String, String>>, Map.Entry<Integer, LinkedHashTreeMap<String, String>>>>) null);
      LinkedHashTreeMap.Node<Map.Entry<Integer, LinkedHashTreeMap<String, String>>, Map.Entry<Integer, LinkedHashTreeMap<String, String>>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Map.Entry<Integer, LinkedHashTreeMap<String, String>>, Map.Entry<Integer, LinkedHashTreeMap<String, String>>>();
      AbstractMap.SimpleEntry<Map.Entry<Integer, LinkedHashTreeMap<String, String>>, Map.Entry<Integer, LinkedHashTreeMap<String, String>>> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Map.Entry<Integer, LinkedHashTreeMap<String, String>>, Map.Entry<Integer, LinkedHashTreeMap<String, String>>>(linkedHashTreeMap_Node0.next);
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.find(abstractMap_SimpleEntry0, true);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.AbstractMap$SimpleEntry is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<Integer, Object>[]) null);
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
      LinkedHashTreeMap.AvlIterator<Object, Comparable<Object>> linkedHashTreeMap_AvlIterator0 = new LinkedHashTreeMap.AvlIterator<Object, Comparable<Object>>();
      LinkedHashTreeMap.Node<Object, Comparable<Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, Comparable<Object>>();
      linkedHashTreeMap_AvlIterator0.reset(linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<Object, Comparable<Object>> linkedHashTreeMap_Node1 = linkedHashTreeMap_AvlIterator0.next();
      assertNotNull(linkedHashTreeMap_Node1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedHashTreeMap.AvlIterator<String, Integer> linkedHashTreeMap_AvlIterator0 = new LinkedHashTreeMap.AvlIterator<String, Integer>();
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node0 = linkedHashTreeMap_AvlIterator0.next();
      assertNull(linkedHashTreeMap_Node0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedHashTreeMap<Integer, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Object>();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap1 = new LinkedHashTreeMap<String, Integer>();
      boolean boolean0 = linkedHashTreeMap_KeySet0.remove(linkedHashTreeMap1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedHashTreeMap<Integer, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Object>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.remove(linkedHashTreeMap0);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedHashTreeMap.Node<Map.Entry<Object, String>, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Map.Entry<Object, String>, Object>();
      LinkedHashTreeMap.Node<Map.Entry<Object, String>, Object> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Map.Entry<Object, String>, Object>(linkedHashTreeMap_Node0, (Map.Entry<Object, String>) null, 392, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      LinkedHashTreeMap<String, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Object>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.contains(linkedHashTreeMap_Node1);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedHashTreeMap<Map.Entry<Integer, LinkedHashTreeMap<String, String>>, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Map.Entry<Integer, LinkedHashTreeMap<String, String>>, String>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.contains("");
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LinkedHashTreeMap.AvlBuilder<AbstractMap.SimpleImmutableEntry<Object, Integer>, String> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<AbstractMap.SimpleImmutableEntry<Object, Integer>, String>();
      linkedHashTreeMap_AvlBuilder0.reset((-1102));
      LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, Integer>, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, Integer>, String>();
      linkedHashTreeMap_AvlBuilder0.add(linkedHashTreeMap_Node0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinkedHashTreeMap.Node<Comparable<String>, String>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<Comparable<String>, String>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 2);
      LinkedHashTreeMap.Node<Comparable<String>, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Comparable<String>, String>();
      linkedHashTreeMap_NodeArray0[0] = linkedHashTreeMap_Node0;
      linkedHashTreeMap_Node0.right = linkedHashTreeMap_Node0;
      // Undeclared exception!
      LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<Comparable<String>, String>[]) linkedHashTreeMap_NodeArray0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LinkedHashTreeMap.Node<Integer, Object>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<Integer, Object>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 8);
      LinkedHashTreeMap.Node<Integer, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, Object>();
      LinkedHashTreeMap.Node<Integer, Object> linkedHashTreeMap_Node1 = linkedHashTreeMap_Node0.last();
      linkedHashTreeMap_NodeArray0[0] = linkedHashTreeMap_Node1;
      Integer integer0 = new Integer(129);
      LinkedHashTreeMap.Node<Integer, Object> linkedHashTreeMap_Node2 = new LinkedHashTreeMap.Node<Integer, Object>(linkedHashTreeMap_NodeArray0[1], integer0, 0, linkedHashTreeMap_NodeArray0[0], linkedHashTreeMap_Node0);
      linkedHashTreeMap_NodeArray0[2] = linkedHashTreeMap_Node2;
      LinkedHashTreeMap.Node<Integer, Object>[] linkedHashTreeMap_NodeArray1 = LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<Integer, Object>[]) linkedHashTreeMap_NodeArray0);
      assertEquals(16, linkedHashTreeMap_NodeArray1.length);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LinkedHashTreeMap.Node<Map.Entry<Object, String>, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Map.Entry<Object, String>, Object>();
      LinkedHashTreeMap.Node<Map.Entry<Object, String>, Object> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Map.Entry<Object, String>, Object>(linkedHashTreeMap_Node0, (Map.Entry<Object, String>) null, 397, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<Map.Entry<Object, String>, Object> linkedHashTreeMap_Node2 = new LinkedHashTreeMap.Node<Map.Entry<Object, String>, Object>();
      linkedHashTreeMap_Node1.right = linkedHashTreeMap_Node2;
      LinkedHashTreeMap.Node<Map.Entry<Object, String>, Object> linkedHashTreeMap_Node3 = linkedHashTreeMap_Node1.first();
      assertNotNull(linkedHashTreeMap_Node3);
      
      LinkedHashTreeMap.Node<Map.Entry<Object, String>, Object> linkedHashTreeMap_Node4 = linkedHashTreeMap_Node3.last();
      assertNotSame(linkedHashTreeMap_Node4, linkedHashTreeMap_Node3);
      assertNotNull(linkedHashTreeMap_Node4);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LinkedHashTreeMap.Node<Map.Entry<Object, String>, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Map.Entry<Object, String>, Object>();
      LinkedHashTreeMap.Node<Map.Entry<Object, String>, Object> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Map.Entry<Object, String>, Object>(linkedHashTreeMap_Node0, (Map.Entry<Object, String>) null, 397, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<Map.Entry<Object, String>, Object> linkedHashTreeMap_Node2 = new LinkedHashTreeMap.Node<Map.Entry<Object, String>, Object>();
      linkedHashTreeMap_Node1.right = linkedHashTreeMap_Node2;
      Integer integer0 = new Integer(4);
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>(comparator0);
      AbstractMap.SimpleImmutableEntry<Integer, LinkedHashTreeMap<String, String>> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Integer, LinkedHashTreeMap<String, String>>(integer0, linkedHashTreeMap0);
      boolean boolean0 = linkedHashTreeMap_Node1.right.equals(abstractMap_SimpleImmutableEntry0);
      assertEquals(0, linkedHashTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LinkedHashTreeMap.Node<Map.Entry<Object, String>, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Map.Entry<Object, String>, Object>();
      LinkedHashTreeMap.Node<Map.Entry<Object, String>, Object> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Map.Entry<Object, String>, Object>();
      boolean boolean0 = linkedHashTreeMap_Node1.equals(linkedHashTreeMap_Node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Object>();
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<String, Object>(linkedHashTreeMap_Node0, "false", (-2435), linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<Integer, LinkedHashTreeMap<String, String>> linkedHashTreeMap_Node2 = new LinkedHashTreeMap.Node<Integer, LinkedHashTreeMap<String, String>>();
      Integer integer0 = new Integer(0);
      LinkedHashTreeMap.Node<Integer, LinkedHashTreeMap<String, String>> linkedHashTreeMap_Node3 = new LinkedHashTreeMap.Node<Integer, LinkedHashTreeMap<String, String>>(linkedHashTreeMap_Node2, integer0, 0, linkedHashTreeMap_Node2, linkedHashTreeMap_Node2);
      boolean boolean0 = linkedHashTreeMap_Node1.equals(linkedHashTreeMap_Node3);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Integer>();
      Integer integer0 = new Integer(404);
      boolean boolean0 = linkedHashTreeMap_Node0.equals(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<Integer, String>, AbstractMap.SimpleEntry<Integer, String>> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<Integer, String>, AbstractMap.SimpleEntry<Integer, String>>();
      Set<AbstractMap.SimpleImmutableEntry<Integer, String>> set0 = linkedHashTreeMap0.keySet();
      assertEquals(0, set0.size());
      assertNotNull(set0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LinkedHashTreeMap<String, AbstractMap.SimpleImmutableEntry<String, String>> linkedHashTreeMap0 = new LinkedHashTreeMap<String, AbstractMap.SimpleImmutableEntry<String, String>>();
      Set<Map.Entry<String, AbstractMap.SimpleImmutableEntry<String, String>>> set0 = (Set<Map.Entry<String, AbstractMap.SimpleImmutableEntry<String, String>>>)linkedHashTreeMap0.entrySet();
      assertNotNull(set0);
      
      BiConsumer<Object, Object> biConsumer0 = (BiConsumer<Object, Object>) mock(BiConsumer.class, new ViolatedAssumptionAnswer());
      linkedHashTreeMap0.forEach(biConsumer0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<String, String>, Map.Entry<Integer, LinkedHashTreeMap<String, String>>> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<String, String>, Map.Entry<Integer, LinkedHashTreeMap<String, String>>>();
      LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, String>, Map.Entry<Integer, LinkedHashTreeMap<String, String>>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, String>, Map.Entry<Integer, LinkedHashTreeMap<String, String>>>();
      AbstractMap.SimpleEntry<String, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, String>("", (String) null);
      AbstractMap.SimpleImmutableEntry<String, String> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, String>(abstractMap_SimpleEntry0);
      LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, String>, Map.Entry<Integer, LinkedHashTreeMap<String, String>>> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, String>, Map.Entry<Integer, LinkedHashTreeMap<String, String>>>(linkedHashTreeMap_Node0, abstractMap_SimpleImmutableEntry0, 1, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
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
  public void test33()  throws Throwable  {
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Integer>();
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>();
      linkedHashTreeMap0.removeInternal(linkedHashTreeMap_Node0, true);
      linkedHashTreeMap0.keySet();
      assertEquals((-1), linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LinkedHashTreeMap<String, AbstractMap.SimpleEntry<Object, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<String, AbstractMap.SimpleEntry<Object, Object>>();
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.removeInternal((LinkedHashTreeMap.Node<String, AbstractMap.SimpleEntry<Object, Object>>) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LinkedHashTreeMap<Integer, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Object>();
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Integer>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.remove(linkedHashTreeMap_Node0);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<String, String>, Map.Entry<Integer, LinkedHashTreeMap<String, String>>> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<String, String>, Map.Entry<Integer, LinkedHashTreeMap<String, String>>>();
      boolean boolean0 = linkedHashTreeMap0.containsKey((Object) null);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>();
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.find((String) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, Comparable<Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, Comparable<Object>>();
      LinkedHashTreeMap<String, AbstractMap.SimpleImmutableEntry<String, String>> linkedHashTreeMap0 = new LinkedHashTreeMap<String, AbstractMap.SimpleImmutableEntry<String, String>>();
      AbstractMap.SimpleImmutableEntry<String, String> abstractMap_SimpleImmutableEntry0 = linkedHashTreeMap0.remove((Object) linkedHashTreeMap_Node0);
      assertNull(abstractMap_SimpleImmutableEntry0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Integer>(comparator0);
      Integer integer0 = new Integer(1754);
      linkedHashTreeMap0.find(integer0, true);
      linkedHashTreeMap0.clear();
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Integer integer0 = new Integer(2);
      LinkedHashTreeMap<AbstractMap.SimpleEntry<Integer, Object>, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<Integer, Object>, Integer>();
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.put((AbstractMap.SimpleEntry<Integer, Object>) null, integer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key == null
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LinkedHashTreeMap<Integer, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, String>();
      Integer integer0 = new Integer(8);
      BiFunction<String, Object, String> biFunction0 = (BiFunction<String, Object, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      linkedHashTreeMap0.merge(integer0, ":4C]xr-9_v//A)_xo6f", biFunction0);
      Set<Integer> set0 = linkedHashTreeMap0.keySet();
      assertFalse(set0.contains(8));
      assertNotNull(set0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LinkedHashTreeMap<AbstractMap.SimpleEntry<String, Object>, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<String, Object>, Integer>();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      linkedHashTreeMap_KeySet0.clear();
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Integer>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>(comparator0);
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      boolean boolean0 = linkedHashTreeMap_KeySet0.contains(linkedHashTreeMap_Node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      linkedHashTreeMap_EntrySet0.removeAll(linkedHashTreeMap_KeySet0);
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LinkedHashTreeMap<Integer, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Object>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      linkedHashTreeMap_EntrySet0.clear();
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      LinkedList<Map.Entry<Integer, LinkedHashTreeMap<String, String>>> linkedList0 = new LinkedList<Map.Entry<Integer, LinkedHashTreeMap<String, String>>>(linkedHashTreeMap_EntrySet0);
      linkedHashTreeMap0.replace("", "UO[3`7ato8");
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      linkedHashTreeMap_EntrySet0.removeAll(linkedHashTreeMap_KeySet0);
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
      
      linkedHashTreeMap_EntrySet0.iterator();
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
      
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap1 = new LinkedHashTreeMap<Object, Object>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet1 = linkedHashTreeMap1.new EntrySet();
      LinkedHashTreeMap.AvlBuilder<Object, Integer> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<Object, Integer>();
      LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<String, String>, Map.Entry<Integer, LinkedHashTreeMap<String, String>>> linkedHashTreeMap2 = new LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<String, String>, Map.Entry<Integer, LinkedHashTreeMap<String, String>>>();
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap3 = new LinkedHashTreeMap<Object, Object>();
      AbstractMap.SimpleImmutableEntry<String, String> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, String>("", (String) null);
      linkedHashTreeMap2.find(abstractMap_SimpleImmutableEntry0, false);
      assertEquals(0, linkedHashTreeMap2.size());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      LinkedHashTreeMap<String, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Object>();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      linkedHashTreeMap_KeySet0.iterator();
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, Object>();
      Object object0 = linkedHashTreeMap_Node0.setValue((Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      LinkedHashTreeMap.Node<Integer, LinkedHashTreeMap<String, String>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, LinkedHashTreeMap<String, String>>();
      Integer integer0 = new Integer(0);
      LinkedHashTreeMap.Node<Integer, LinkedHashTreeMap<String, String>> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Integer, LinkedHashTreeMap<String, String>>(linkedHashTreeMap_Node0, integer0, 0, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      AbstractMap.SimpleEntry<Integer, LinkedHashTreeMap<String, String>> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Integer, LinkedHashTreeMap<String, String>>(linkedHashTreeMap_Node1);
      boolean boolean0 = linkedHashTreeMap_Node1.equals(abstractMap_SimpleEntry0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, Comparable<Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, Comparable<Object>>();
      String string0 = linkedHashTreeMap_Node0.toString();
      assertEquals("null=null", string0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      LinkedHashTreeMap.Node<Integer, Integer>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<Integer, Integer>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 0);
      LinkedHashTreeMap.Node<Integer, Integer>[] linkedHashTreeMap_NodeArray1 = LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<Integer, Integer>[]) linkedHashTreeMap_NodeArray0);
      assertEquals(0, linkedHashTreeMap_NodeArray1.length);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<AbstractMap.SimpleEntry<Integer, Object>, String> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<Integer, Object>, String>();
      linkedHashTreeMap0.removeInternalByKey(comparator0);
      assertEquals(0, linkedHashTreeMap0.size());
  }
}
