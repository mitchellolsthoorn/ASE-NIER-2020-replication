/*
 * This file was automatically generated by EvoSuite
 * Fri May 22 18:10:39 GMT 2020
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
import java.util.function.BiConsumer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LinkedHashTreeMap_ESTest extends LinkedHashTreeMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Object>();
      LinkedHashTreeMap.AvlBuilder<String, Object> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<String, Object>();
      linkedHashTreeMap_AvlBuilder0.reset(0);
      linkedHashTreeMap_AvlBuilder0.add(linkedHashTreeMap_Node0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedHashTreeMap.AvlBuilder<String, Object> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<String, Object>();
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Object>();
      linkedHashTreeMap_AvlBuilder0.add(linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node1 = linkedHashTreeMap_AvlBuilder0.root();
      assertNotNull(linkedHashTreeMap_Node1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Integer>();
      Integer integer0 = linkedHashTreeMap_Node0.getValue();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, Object>();
      Object object0 = linkedHashTreeMap_Node0.getKey();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, Object>, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, Object>, Object>(comparator0);
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      linkedHashTreeMap_KeySet0.iterator();
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Integer, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Object>(comparator0);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      int int0 = linkedHashTreeMap_EntrySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<LinkedHashTreeMap<String, String>, AbstractMap.SimpleImmutableEntry<Object, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<LinkedHashTreeMap<String, String>, AbstractMap.SimpleImmutableEntry<Object, Object>>(comparator0);
      Comparator<String> comparator1 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, String> linkedHashTreeMap1 = new LinkedHashTreeMap<String, String>(comparator1);
      linkedHashTreeMap0.find(linkedHashTreeMap1, true);
      int int0 = linkedHashTreeMap0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Comparable<String>, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Comparable<String>, Object>(comparator0);
      linkedHashTreeMap0.size = (-1178);
      int int0 = linkedHashTreeMap0.size();
      assertEquals((-1178), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedHashTreeMap<Object, Map.Entry<AbstractMap.SimpleEntry<Object, String>, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Map.Entry<AbstractMap.SimpleEntry<Object, String>, Object>>((Comparator<? super Object>) null);
      LinkedHashTreeMap.Node<Object, Map.Entry<AbstractMap.SimpleEntry<Object, String>, Object>> linkedHashTreeMap_Node0 = linkedHashTreeMap0.removeInternalByKey("com.google.gson.internal.LinkedHashTreeMap$Node");
      assertNull(linkedHashTreeMap_Node0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedHashTreeMap<String, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Object>();
      linkedHashTreeMap0.findByObject((Object) null);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Comparable<String>, AbstractMap.SimpleEntry<String, String>> linkedHashTreeMap0 = new LinkedHashTreeMap<Comparable<String>, AbstractMap.SimpleEntry<String, String>>(comparator0);
      Integer integer0 = Integer.valueOf(16);
      AbstractMap.SimpleEntry<String, Integer> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, Integer>("Qrq,*VeS((b6", integer0);
      AbstractMap.SimpleEntry<String, Integer> abstractMap_SimpleEntry1 = new AbstractMap.SimpleEntry<String, Integer>(abstractMap_SimpleEntry0);
      AbstractMap.SimpleImmutableEntry<Object, Object> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Object, Object>(abstractMap_SimpleEntry1);
      linkedHashTreeMap0.findByEntry(abstractMap_SimpleImmutableEntry0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedHashTreeMap<Integer, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Integer>();
      Integer integer0 = new Integer(0);
      linkedHashTreeMap0.find(integer0, false);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Object>(comparator0);
      linkedHashTreeMap0.putIfAbsent("Qrq,*VeS((b6", "Qrq,*VeS((b6");
      Set<Map.Entry<String, Object>> set0 = (Set<Map.Entry<String, Object>>)linkedHashTreeMap0.entrySet();
      assertEquals(1, set0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedHashTreeMap.Node<Integer, String>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<Integer, String>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 0);
      LinkedHashTreeMap.Node<Integer, String>[] linkedHashTreeMap_NodeArray1 = LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<Integer, String>[]) linkedHashTreeMap_NodeArray0);
      assertEquals(0, linkedHashTreeMap_NodeArray1.length);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, Object>, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, Object>, Integer>();
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.removeInternal((LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, Integer>) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedHashTreeMap<Object, Comparable<String>> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Comparable<String>>();
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.put((Object) null, (Comparable<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key == null
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedHashTreeMap<LinkedHashTreeMap<String, Object>, String> linkedHashTreeMap0 = new LinkedHashTreeMap<LinkedHashTreeMap<String, Object>, String>();
      LinkedHashTreeMap<String, Object> linkedHashTreeMap1 = new LinkedHashTreeMap<String, Object>();
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.put(linkedHashTreeMap1, "P<*-#zFbkf");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.gson.internal.LinkedHashTreeMap is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedHashTreeMap<LinkedHashTreeMap<Integer, Object>, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<LinkedHashTreeMap<Integer, Object>, Object>();
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
  public void test18()  throws Throwable  {
      LinkedHashTreeMap<String, AbstractMap.SimpleImmutableEntry<Object, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<String, AbstractMap.SimpleImmutableEntry<Object, Object>>();
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
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<LinkedHashTreeMap<Integer, String>, String>, Integer>[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedHashTreeMap.AvlIterator<String, Integer> linkedHashTreeMap_AvlIterator0 = new LinkedHashTreeMap.AvlIterator<String, Integer>();
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Integer>();
      linkedHashTreeMap_AvlIterator0.reset(linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node1 = linkedHashTreeMap_AvlIterator0.next();
      assertNotNull(linkedHashTreeMap_Node1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedHashTreeMap.AvlIterator<String, Integer> linkedHashTreeMap_AvlIterator0 = new LinkedHashTreeMap.AvlIterator<String, Integer>();
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node0 = linkedHashTreeMap_AvlIterator0.next();
      assertNull(linkedHashTreeMap_Node0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LinkedHashTreeMap.Node<String, AbstractMap.SimpleEntry<String, Integer>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, AbstractMap.SimpleEntry<String, Integer>>();
      LinkedHashTreeMap<AbstractMap.SimpleEntry<String, String>, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<String, String>, Integer>();
      boolean boolean0 = linkedHashTreeMap0.containsKey(linkedHashTreeMap_Node0);
      assertEquals(0, linkedHashTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinkedHashTreeMap<Object, AbstractMap.SimpleEntry<Object, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, AbstractMap.SimpleEntry<Object, Object>>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.remove(linkedHashTreeMap0);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, String>, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, String>, String>();
      AbstractMap.SimpleEntry<Object, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, String>(linkedHashTreeMap_Node0);
      LinkedHashTreeMap<Object, AbstractMap.SimpleEntry<Object, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, AbstractMap.SimpleEntry<Object, Object>>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.remove(abstractMap_SimpleEntry0);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>(comparator0);
      Comparator<String> comparator1 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, Map.Entry<AbstractMap.SimpleEntry<Object, String>, Object>> linkedHashTreeMap1 = new LinkedHashTreeMap<String, Map.Entry<AbstractMap.SimpleEntry<Object, String>, Object>>(comparator1);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap1.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.contains(linkedHashTreeMap0);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LinkedHashTreeMap.AvlBuilder<String, Object> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<String, Object>();
      linkedHashTreeMap_AvlBuilder0.reset(2277);
      LinkedHashTreeMap<String, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Object>((Comparator<? super String>) null);
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node0 = linkedHashTreeMap0.header;
      linkedHashTreeMap_AvlBuilder0.add(linkedHashTreeMap_Node0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LinkedHashTreeMap.Node<Integer, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, String>();
      LinkedHashTreeMap.Node<Integer, String> linkedHashTreeMap_Node1 = linkedHashTreeMap_Node0.first();
      assertNotNull(linkedHashTreeMap_Node1);
      
      LinkedHashTreeMap.Node<Integer, String>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<Integer, String>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 7);
      linkedHashTreeMap_NodeArray0[0] = linkedHashTreeMap_Node1;
      LinkedHashTreeMap.Node<Integer, String>[] linkedHashTreeMap_NodeArray1 = LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<Integer, String>[]) linkedHashTreeMap_NodeArray0);
      assertEquals(14, linkedHashTreeMap_NodeArray1.length);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Integer>, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Integer>, Object>();
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Integer>, Object> linkedHashTreeMap_Node1 = linkedHashTreeMap_Node0.last();
      assertNotNull(linkedHashTreeMap_Node1);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, String>, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, String>, String>();
      AbstractMap.SimpleEntry<Object, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, String>(linkedHashTreeMap_Node0);
      abstractMap_SimpleEntry0.setValue("");
      boolean boolean0 = linkedHashTreeMap_Node0.equals(abstractMap_SimpleEntry0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, String>, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, String>, String>();
      AbstractMap.SimpleEntry<String, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, String>((String) null, (String) null);
      AbstractMap.SimpleEntry<Object, String> abstractMap_SimpleEntry1 = new AbstractMap.SimpleEntry<Object, String>(abstractMap_SimpleEntry0);
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, String>, String> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, String>, String>(linkedHashTreeMap_Node0, abstractMap_SimpleEntry1, 93, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      boolean boolean0 = linkedHashTreeMap_Node1.equals(linkedHashTreeMap_Node1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LinkedHashTreeMap.Node<String, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, String>();
      LinkedHashTreeMap.Node<String, String> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<String, String>(linkedHashTreeMap_Node0, "", 15, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, String>, String> linkedHashTreeMap_Node2 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, String>, String>();
      boolean boolean0 = linkedHashTreeMap_Node2.equals(linkedHashTreeMap_Node1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LinkedHashTreeMap.Node<String, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, String>();
      AbstractMap.SimpleEntry<Object, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, String>(linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, String>, String> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, String>, String>();
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, String>, String> linkedHashTreeMap_Node2 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, String>, String>();
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, String>, String> linkedHashTreeMap_Node3 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, String>, String>(linkedHashTreeMap_Node2, abstractMap_SimpleEntry0, 15, linkedHashTreeMap_Node2, linkedHashTreeMap_Node2);
      boolean boolean0 = linkedHashTreeMap_Node3.equals(linkedHashTreeMap_Node1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LinkedHashTreeMap.Node<String, LinkedHashTreeMap<String, String>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, LinkedHashTreeMap<String, String>>();
      boolean boolean0 = linkedHashTreeMap_Node0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<Object, String>, Comparable<Integer>> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<Object, String>, Comparable<Integer>>(comparator0);
      linkedHashTreeMap0.keySet();
      Set<AbstractMap.SimpleImmutableEntry<Object, String>> set0 = linkedHashTreeMap0.keySet();
      assertTrue(set0.isEmpty());
      assertNotNull(set0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, Object>, LinkedHashTreeMap<Object, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, Object>, LinkedHashTreeMap<Object, Object>>((Comparator<? super AbstractMap.SimpleEntry<Object, Object>>) null);
      Set<Map.Entry<AbstractMap.SimpleEntry<Object, Object>, LinkedHashTreeMap<Object, Object>>> set0 = (Set<Map.Entry<AbstractMap.SimpleEntry<Object, Object>, LinkedHashTreeMap<Object, Object>>>)linkedHashTreeMap0.entrySet();
      assertNotNull(set0);
      
      BiConsumer<Object, Object> biConsumer0 = (BiConsumer<Object, Object>) mock(BiConsumer.class, new ViolatedAssumptionAnswer());
      linkedHashTreeMap0.forEach(biConsumer0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LinkedHashTreeMap<Comparable<Object>, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<Comparable<Object>, Integer>();
      LinkedHashTreeMap.Node<Comparable<Object>, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Comparable<Object>, Integer>();
      LinkedHashTreeMap.Node<Comparable<Object>, Integer> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Comparable<Object>, Integer>(linkedHashTreeMap_Node0, (Comparable<Object>) null, (-1), linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.removeInternal(linkedHashTreeMap_Node1, true);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>();
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, Object>();
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Object, Object>();
      linkedHashTreeMap_Node1.left = linkedHashTreeMap_Node0;
      linkedHashTreeMap0.removeInternal(linkedHashTreeMap_Node1, false);
      assertEquals((-1), linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleImmutableEntry<String, String>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleImmutableEntry<String, String>>();
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.contains(linkedHashTreeMap_Node0);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<String, String>, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<String, String>, Integer>((Comparator<? super AbstractMap.SimpleImmutableEntry<String, String>>) null);
      AbstractMap.SimpleImmutableEntry<String, String> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, String>("", (String) null);
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
  public void test40()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, Object>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>(comparator0);
      linkedHashTreeMap0.remove((Object) linkedHashTreeMap_Node0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LinkedHashTreeMap<String, Comparable<Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Comparable<Object>>();
      Comparable<Object> comparable0 = linkedHashTreeMap0.get("");
      linkedHashTreeMap0.putIfAbsent("", comparable0);
      linkedHashTreeMap0.clear();
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      linkedHashTreeMap_KeySet0.clear();
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>(comparator0);
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      boolean boolean0 = linkedHashTreeMap_KeySet0.contains(linkedHashTreeMap0);
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      int int0 = linkedHashTreeMap_KeySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, AbstractMap.SimpleEntry<String, String>> linkedHashTreeMap0 = new LinkedHashTreeMap<String, AbstractMap.SimpleEntry<String, String>>(comparator0);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      linkedHashTreeMap_EntrySet0.clear();
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Object>();
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>(comparator0);
      Object object0 = linkedHashTreeMap_Node0.setValue(linkedHashTreeMap0);
      assertEquals(0, linkedHashTreeMap0.size());
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      LinkedHashTreeMap.Node<String, AbstractMap.SimpleEntry<String, Integer>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, AbstractMap.SimpleEntry<String, Integer>>();
      String string0 = linkedHashTreeMap_Node0.toString();
      assertEquals("null=null", string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, AbstractMap.SimpleEntry<String, String>> linkedHashTreeMap0 = new LinkedHashTreeMap<String, AbstractMap.SimpleEntry<String, String>>(comparator0);
      linkedHashTreeMap0.threshold = (-1173);
      AbstractMap.SimpleEntry<String, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, String>("]AI6*ws>wxhE\")(0]z", "");
      AbstractMap.SimpleEntry<String, String> abstractMap_SimpleEntry1 = new AbstractMap.SimpleEntry<String, String>(abstractMap_SimpleEntry0);
      linkedHashTreeMap0.put("+u7CxA4.6d>YuUu", abstractMap_SimpleEntry1);
      assertEquals(1, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      LinkedHashTreeMap<String, AbstractMap.SimpleEntry<String, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<String, AbstractMap.SimpleEntry<String, Object>>();
      int int0 = linkedHashTreeMap0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      linkedHashTreeMap_EntrySet0.iterator();
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }
}