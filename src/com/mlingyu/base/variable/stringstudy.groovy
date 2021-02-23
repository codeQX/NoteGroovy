package com.mlingyu.base.variable

def singleString = 'a simple \'aaa\' string'
//println singleString
//
//三个单引号'''可以输入带格式的字符串，不用转义字符'''
def tripleString = '''line one
line two
line three'''
//println tripleString


/**
 * 4，用途最广泛
 */
def name = 'mlingyu'
//双引号，如果没有扩展表达式，则还是普通的String类型字符串
//如果有扩展表达式，那么就是GString类型的字符串
def doubleString = "hello:"
//println doubleString.class

doubleString = "hello:${name}"
//println doubleString
//println doubleString.class

//扩展表达式可以是任意表达式
def sum = "the sum of 2 and 3 is ${2 + 3}"
//println sum

//GString和String类型可以相互转化，参数上不需要强转，编译器已经帮我们做了
def result = echo(sum)
println result

String echo(String msg){
    return msg
}
/* ==================字符串的方法=================== */
def str = "groovy Hello"
//println str.center(8)
//println str.padLeft(8, 'a')
def str2 = 'Hello'
//println str > str2
//println str[0]
//println str[0..1]
//println str - str2

//println str.reverse()
//println str.capitalize()
//println str.










