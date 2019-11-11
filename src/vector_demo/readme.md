**一：注意要点**
1)：表面把数据存储到Vector对象中，其实底层依然是把数据存储到object数组中。<br/>
2):数组的数据类型是object类型，意味着集合中只能存储任意类型的对象。集合中只能存储对象，但不能存储基本数据类型<br/>
java5之前，必须对基本数据类型手动装箱vector.add(Integer.valueOf(5));java5之后自动装箱<br/>
3):集合类中存储的对象，都存储的对象引用，而不是对象本身。<br/>
**二：常用操作**
|方法名|说明|
|---|---|
| add(E e)  |插入到集合后面|
| add(E e,index)  |插入到集合的指定位置|
| addAll(Collection c)  |将指定集合中的所有元素追加到该向量的末尾，按照它们由指定集合的迭代器返回的顺序。|
|  remove(int index) |删除指定位置的元素|
|removeAll(Collection e)|删除集合中的所有元素|
|remove(Object obj)|删除指定元素|
|retainAll(Collection c)|在此集合中仅保留c集合的元素，求交集|
|Object set(int index,E element)|修改index的元素|
|int size|返回当前集合存储元素的个数|
|get(index)|查询指定索引位置的元素|
|isEmpty()|判断是否为空|
|toArray()|把集合对象转化为object数组|