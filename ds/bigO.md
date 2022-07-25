# Big O notation
The notation used to describe runtime.
O(n) is read as: "oh of n" "big oh of n", or "order n"
O(1) is constant time or "oh of one"
O(n) is linear
O(n^2) is quadratic
O(2^n) is exponential
O(logn) is logarithmic
As described prior:
We care about worst case, even if your algorithm can stop early like the linear search.
We don't care about constants like 5*n is just O(n)   and   N^2/2  is just O(N^2)

Logn runtime examples:
Total Time: O(logn)
//loop repeats logn times
for(int i = n; i > 0; i = i / 2){
  //inner part of loop constant time
}
Total Time: O(n*logn)
//outer loop happens n times
for(int j = 0; j < n; j++){
  //inner loop repeats logn times
  for(int i = n; i > 0; i = i / 2){
     //constant time inside here
  }
}
