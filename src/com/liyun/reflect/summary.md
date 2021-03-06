# 总结
*  Class类提供了四个public方法，用于获取某个类的构造方法。
```
Constructor getConstructor(Class[] params)     根据构造函数的参数，返回一个具体的具有public属性的构造函数
Constructor getConstructors()     返回所有具有public属性的构造函数数组
Constructor getDeclaredConstructor(Class[] params)     根据构造函数的参数，返回一个具体的构造函数（不分public和非public属性）
Constructor getDeclaredConstructors()    返回该类中所有的构造函数数组（不分public和非public属性）
```
*  四种获取成员方法的方法
```
Method getMethod(String name, Class[] params)    根据方法名和参数，返回一个具体的具有public属性的方法
Method[] getMethods()    返回所有具有public属性的方法数组
Method getDeclaredMethod(String name, Class[] params)    根据方法名和参数，返回一个具体的方法（不分public和非public属性）
Method[] getDeclaredMethods()    返回该类中的所有的方法数组（不分public和非public属性）
```
*  四种获取成员属性的方法
```
Field getField(String name)    根据变量名，返回一个具体的具有public属性的成员变量
Field[] getFields()    返回具有public属性的成员变量的数组
Field getDeclaredField(String name)    根据变量名，返回一个成员变量（不分public和非public属性）
Field[] getDelcaredField()    返回所有成员变量组成的数组（不分public和非public属性）
```

