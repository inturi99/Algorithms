package assignment
object SortingAlgorithm  extends App{
  // Bubble Sort
 def bubbleSort(list: Array[Int]): Array[Int] = {
 for(i <- 0 until (list.length -1)) {
   for(j <- 0 until (list.length -1 -i)) {
   if(list(j) > list(j+1)) {
     val temp = list(j)
     list(j) = list(j+1)
     list(j+1)=temp;

  }
 }
 }
 return list;
}
  //Selection Sort
  def selectionSort(list: Array[Int]): Array[Int] = {
    for (i <- 0 until (list.length -1)){
      var min = i
      for(j <- (i+1) until list.length){
        if (list(j) < list(min))
          min = j
      }
      if (i != min) {
        val swap = list(i);
        list(i) = list(min);
        list(min) = swap;
      }
    }
    return list
  }
  //Insertion Sort
  def insertionSort(list: Array[Int]): Array[Int] = {
    for(i <- 1 until list.length){
      val temp = list(i)
      var j = i-1
      while(j > -1 && list(j) > temp){
        list(j+1) = list(j)
        j -= 1
      }
      list(j+1) = temp
    }
    return list
  }

  //Merge Sort
  def merge(a: List[Int], b: List[Int]): List[Int] = (a, b) match {
    case(Nil, _) => b
    case(_, Nil) => a
    case (x :: xs, y :: ys) =>
      if(x < y ) x :: merge(xs, b)
      else y :: merge(a, ys)
  }
  def mergeSort(list: List[Int]): List[Int] = {
    val  n = list.length / 2
    if(n == 0 ) list
    else {
      val (first, second) = list.splitAt(n)
      merge(mergeSort(first), mergeSort(second))
    }
  }

// Quick Sort

def quickSort(list: List[Int]): List[Int] = list match {
case Nil => Nil
case x::Nil => list
case _=>
  val pivote = list.head
  val (before, after) = list.tail.partition(_<pivote)
  quickSort(before) ++ (pivote :: quickSort(after))
}

}