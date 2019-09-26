import java.util.AbstractList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Class {@code TreeList} is a hybrid between a {@link Set} and a {@link List}. Like a
 * {@link TreeSet}, it maintains a natural ordering of all elements, and allows for fast
 * insertion/removal/searching by value. However, unlike a set, a {@code TreeList} allows duplicate
 * values and allows insertion/removal/retrieval by index. Iterating a {@code TreeList} will
 * produce values (including duplicates) in their natural order. Inserting/replacing at a particular
 * index may cause the list order to change, due to the list's constantly sorted nature. Adding a
 * duplicate value to a {@code TreeList} does not consume any additional memory storage, i.e. the
 * duplicate values are stored as a count rather than as individual object references.
 *
 * @param <E> the type of elements in this list
 * 
 * @author Jeffrey Bergamini for CS 12J, jbergamini@jeff.cis.cabrillo.edu
 * @author ciaran farley for CS 12J
 */
public class TreeList<E> extends AbstractList<E> {

  // Feel free to use these fields in your implementation, if you'd like:

  /**
   * A {@link TreeMap} stores almost all sufficient data for this class.
   */
  private TreeMap<E, Integer> tallies;

  /**
   * Total number of elements, including duplicates.
   */
  private int totalSize;

  /** Constructs an empty list. */
  public TreeList() {
    // Invoke the superclass constructor (unnecessary in this case, but good practice)
    super();
  }

  /**
   * Constructs a list containing the elements of the specified
   * collection, in the order they are returned by the collection's
   * iterator.
   *
   * @param existingCollection the collection whose elements are to be placed into this list
   */
  public TreeList(Collection<? extends E> existingCollection) {
    // Invoke the superclass constructor (unnecessary in this case, but good practice)
    super();
  }

  /**
   * Appends the specified element to the end of this list.
   *
   * @param element element to be appended to this list
   * @return {@code true} (as specified by {@link Collection#add})
   */
  @Override
  public boolean add(E element) {
  }

  /**
   * Inserts the specified element at the specified position in this list. Shifts the element
   * currently at that position (if any) and any subsequent elements to the right (adds one to their
   * indices). Note that due to {@code TreeList}'s natural ordering, the index at which an element
   * is inserted may not be the index at which it is subsequently found.
   *
   * @param index index at which the specified element is to be inserted
   * @param element element to be inserted
   * @throws IndexOutOfBoundsException if the index is out of range
   *           ({@code index < 0 || index >= size()})
   */
  @Override
  public void add(int index, E element) {
  }

  /**
   * Appends all of the elements in the specified collection to the end of this list, in the order
   * that they are returned by the specified collection's Iterator. The behavior of this operation
   * is undefined if the specified collection is modified while the operation is in progress. (This
   * implies that the behavior of this call is undefined if the specified collection is this list,
   * and this list is nonempty.)
   *
   * @param otherCollection collection containing elements to be added to this list
   * @return {@code true} if this list changed as a result of the call
   */
  @Override
  public boolean addAll(Collection<? extends E> otherCollection) {
  }

  /**
   * Removes all of the elements from this list. The list will be empty after this call returns.
   */
  @Override
  public void clear() {
  }

  /**
   * Returns {@code true} if this collection contains the specified element. More formally, returns
   * {@code true} if and only if this collection contains at least one element {@code e} such that
   * {@code Objects.equals(object, e)}.
   *
   * @param object element whose presence in this collection is to be tested
   * @return {@code true} if this collection contains the specified element
   */
  @Override
  public boolean contains(Object object) {
  }

  /**
   * Returns {@code true} if this collection contains all of the elements in the specified
   * collection.
   *
   * @param otherCollection collection to be checked for containment in this collection
   * @return {@code true} if this collection contains all of the elements in the specified
   *         collection
   * @see #contains(Object)
   */
  @Override
  public boolean containsAll(Collection<?> otherCollection) {
  }

  /**
   * Returns the number of occurrences of the specified element.
   * 
   * @param element value whose presence in this list is to be tested
   * @return the number of occurrences of the specified element
   */
  public int countOf(E element) {
  }

  /**
   * Returns the element at the specified position in this list.
   *
   * @param index index of the element to return
   * @return the element at the specified position in this list
   * @throws IndexOutOfBoundsException if the index is out of range
   *           ({@code index < 0 || index >= size()})
   */
  @Override
  public E get(int index) {
  }

  /**
   * Removes the element at the specified position in this list. Shifts any subsequent elements to
   * the left (subtracts one from their indices).
   *
   * @param index the index of the element to be removed
   * @return the element that was removed from the list
   * @throws IndexOutOfBoundsException if the index is out of range
   *           ({@code index < 0 || index >= size()})
   */
  @Override
  public E remove(int index) {
  }

  /**
   * Removes a single instance of the specified element from this collection, if it is present
   * (optional operation). More formally, removes an element {@code e} such that
   * {@code Objects.equals(object, e)}, if this collection contains one or more such elements.
   * Returns {@code true} if this collection contained the specified element (or equivalently, if
   * this collection changed as a result of the call).
   *
   * @param object element to be removed from this collection, if present
   * @return {@code true} if an element was removed as a result of this call
   */
  @Override
  public boolean remove(Object object) {
  }

  /**
   * Replaces the element at the specified position in this list with the specified element. Note
   * that this will likely cause the position of the new value to change, if the value is different
   * from the old.
   * 
   * @param index index of the element to replace
   * @param element element to be stored at the specified position
   * @return the element previously at the specified position
   * @throws IndexOutOfBoundsException if the index is out of range
   *           ({@code index < 0 || index >= size()})
   */
  @Override
  public E set(int index, E element) {
  }

  /**
   * Returns the number of elements in this list (including any duplicates).
   * 
   * @return the number of elements in this list
   */
  @Override
  public int size() {
  }

  /**
   * This method does nothing, since a {@code TreeList} is always sorted using natural ordering!
   */
  @Override
  public void sort(Comparator<? super E> comparator) {
    // Nothing to do!
  }

  /**
   * Returns a {@link Set} view of the keys contained in this list. The set is backed by the list,
   * so changes to the list are reflected in the set, and vice-versa. The set supports all
   * operations provided by the sets returned by {@link TreeMap#keySet TreeMap.keySet}.
   * 
   * @return a set view of all unique values in this list
   */
  public Set<E> uniqueValues() {
  }

}
