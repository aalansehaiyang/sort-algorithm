

### 插入排序

----

基本思想：

每次选择一个元素K插入到之前已排好序的部分A[1…i]中，插入过程中K依次由后向前与A[1…i]中的元素进行比较，若A[x]>K，A[x]中的数字往后移，直到找不到，此时位置插入K。

位置：com.algorithm.insert.InsertSort

![image](img/Snip20160607_2.png)

