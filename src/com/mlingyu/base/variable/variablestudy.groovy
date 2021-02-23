package com.mlingyu.base.variable

int x = 10
//println x.class
//
double y = 3.14
//println y.class

/**
 * 2
 */
def x1 = 10
//println x1.class

//3.14 groovy中默认是大数据类型
def y1 = 3.14
//println y1.class

//弱类型定义的变量，可以随时改变类型
x1 = 'mlingyu'
//println x1.class


//def map = new HashMap()
def color = [red: 'ff0000', green: '00ff00', blue: '0000ff']
color.yellow = 'ffff00' //添加
println color['red']
println color.green
println color.getClass()
println color.yellow
//注意key的取值,key做为变量时特殊处理
def pink = 'pink'
color.(pink) = 'ff00ff'
println color.toMapString()
def map = [a: 1, b: 2]
color.complex = map
println color.toMapString()
//color.each { def entry ->
//    println "the key is:${entry.key} the value is: ${entry.value}"
//
//}
//color.eachWithIndex { def key, def value, def index ->
//    println "${index}:the key is ${key}, the value is ${value}"
//}




