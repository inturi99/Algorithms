import collection.mutable.Stack
import org.scalatest._
import assignment.SortingAlgorithm._

class SortingAlgorithmSpec extends FlatSpec with Matchers {
  "Bubble Sort of Empty Array ()" should "be ()" in {
    val input = Array.empty[Int]
    val actual = bubbleSort(input)
    val expected = Array.empty[Int]
    actual  should  be (expected)
  }
  "Bubble Sort of un sorted Array (10, 30, 20, 5, 70, 90)" should "be (5, 10, 20, 30, 70, 90)" in {
    val input = Array(10, 30, 20, 5, 70, 90)
    val actual = bubbleSort(input)
    val expected = Array(5, 10, 20, 30, 70, 90)
    actual  should  be (expected)
  }
  "Bubble Sort of sorted Array (5, 10, 20, 30, 70, 90)" should "be (5, 10, 20, 30, 70, 90)" in {
    val input = Array(5, 10, 20, 30, 70, 90)
    val actual = bubbleSort(input)
    val expected = Array(5, 10, 20, 30, 70, 90)
    actual  should  be (expected)
  }
  "Bubble Sort of Repeated Elements  (10, 30, 20, 10, 30, 10, 5, 70, 20, 90)" should "be (5, 10, 10, 10, 20, 20, 30, 30, 70, 90)" in {
    val input = Array(10, 30, 20, 10, 30, 10, 5, 70, 20, 90)
    val actual = bubbleSort(input)
    val expected = Array(5, 10, 10, 10, 20, 20, 30, 30, 70, 90)
    actual  should  be (expected)
  }
  "Selection Sort of Empty Array ()" should "be ()" in {
    val input = Array.empty[Int]
    val actual = selectionSort(input)
    val expected = Array.empty[Int]
    actual  should  be (expected)
  }
  "Selection Sort of un sorted Array (10, 30, 20, 5, 70, 90)" should "be (5, 10, 20, 30, 70, 90)" in {
    val input = Array(10, 30, 20, 5, 70, 90)
    val actual = selectionSort(input)
    val expected = Array(5, 10, 20, 30, 70, 90)
    actual  should  be (expected)
  }
  "Selection Sort of sorted Array (5, 10, 20, 30, 70, 90)" should "be (5, 10, 20, 30, 70, 90)" in {
    val input = Array(5, 10, 20, 30, 70, 90)
    val actual = selectionSort(input)
    val expected = Array(5, 10, 20, 30, 70, 90)
    actual  should  be (expected)
  }
  "Selection Sort of Repeated Elements  (10, 30, 20, 10, 30, 10, 5, 70, 20, 90)" should "be (5, 10, 10, 10, 20, 20, 30, 30, 70, 90)" in {
    val input = Array(10, 30, 20, 10, 30, 10, 5, 70, 20, 90)
    val actual = selectionSort(input)
    val expected = Array(5, 10, 10, 10, 20, 20, 30, 30, 70, 90)
    actual  should  be (expected)
  }
  "Insertion Sort of Empty Array ()" should "be ()" in {
    val input = Array.empty[Int]
    val actual = insertionSort(input)
    val expected = Array.empty[Int]
    actual  should  be (expected)
  }
  "Insertion Sort of an  un sorted Array (10, 30, 20, 5, 70, 90)" should "be (5, 10, 20, 30, 70, 90)" in {
    val input = Array(10, 30, 20, 5, 70, 90)
    val actual = insertionSort(input)
    val expected = Array(5, 10, 20, 30, 70, 90)
    actual  should  be (expected)
  }
  "Insertion Sort of sorted Array (5, 10, 20, 30, 70, 90)" should "be (5, 10, 20, 30, 70, 90)" in {
    val input = Array(5, 10, 20, 30, 70, 90)
    val actual = insertionSort(input)
    val expected = Array(5, 10, 20, 30, 70, 90)
    actual  should  be (expected)
  }
  "Insertion Sort of a Reverse sorted Array (90, 70, 30, 20, 10, 5)" should "be (5, 10, 20, 30, 70, 90)" in {
    val input = Array(90, 70, 30, 20, 10, 5)
    val actual = insertionSort(input)
    val expected = Array(5, 10, 20, 30, 70, 90)
    actual  should  be (expected)
  }
  "Insertion Sort of one element  Array (90)" should "be ( 90)" in {
    val input = Array(90)
    val actual = insertionSort(input)
    val expected = Array(90)
    actual  should  be (expected)
  }
  "Merge Sort of Empty List ()" should "be ()" in {
    val input = List.empty[Int]
    val actual = mergeSort(input)
    val expected = List.empty[Int]
    actual  should  be (expected)
  }
  "Merge Sort of an  un sorted List (10, 30, 20, 5, 70, 90)" should "be (5, 10, 20, 30, 70, 90)" in {
    val input = List(10, 30, 20, 5, 70, 90)
    val actual = mergeSort(input)
    val expected = List(5, 10, 20, 30, 70, 90)
    actual  should  be (expected)
  }
  "Merge Sort of sorted List (5, 10, 20, 30, 70, 90)" should "be (5, 10, 20, 30, 70, 90)" in {
    val input = List(5, 10, 20, 30, 70, 90)
    val actual = mergeSort(input)
    val expected = List(5, 10, 20, 30, 70, 90)
    actual  should  be (expected)
  }
   "Merge Sort of one element in a  List (90)" should "be ( 90)" in {
    val input = List(90)
    val actual = mergeSort(input)
    val expected = List(90)
    actual  should  be (expected)
  }
  "Quick Sort of Empty List ()" should "be ()" in {
    val input = List.empty[Int]
    val actual = quickSort(input)
    val expected = List.empty[Int]
    actual  should  be (expected)
  }
  "Quick Sort of an  un sorted List (10, 30, 20, 5, 70, 90)" should "be (5, 10, 20, 30, 70, 90)" in {
    val input = List(10, 30, 20, 5, 70, 90)
    val actual = quickSort(input)
    val expected = List(5, 10, 20, 30, 70, 90)
    actual  should  be (expected)
  }
  "Quik Sort of sorted List (5, 10, 20, 30, 70, 90)" should "be (5, 10, 20, 30, 70, 90)" in {
    val input = List(5, 10, 20, 30, 70, 90)
    val actual = quickSort(input)
    val expected = List(5, 10, 20, 30, 70, 90)
    actual  should  be (expected)
  }
   "Quick Sort of one element in a  List (90)" should "be ( 90)" in {
    val input = List(90)
    val actual = quickSort(input)
    val expected = List(90)
    actual  should  be (expected)
  }
}
