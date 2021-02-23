package com.mlingyu.base.objectorention.expand

import com.mlingyu.base.objectorention.Person


/**
 * Person类的管理器
 */
class PersonManager {
    static Person createPerson(String name, int age) {
        return Person.createPerson(name, age)
    }
}
