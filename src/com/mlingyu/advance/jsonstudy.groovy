package com.mlingyu.advance

import com.mlingyu.base.objectorention.Person
import groovy.json.JsonOutput
import groovy.json.JsonSlurper


def list = [new Person(name: 'mlingu', age: 28),
            new Person(name: 'qixin', age: 31)]
def json = JsonOutput.toJson(list)
//println json
def prettyJson = JsonOutput.prettyPrint(json)
//println prettyJson


def jsonSlurper = new JsonSlurper()
jsonSlurper.parseText(json)


def reponse =
        getNetworkData(
                'http://yuexibo.top/yxbApp/course_detail.json')

println reponse.data.head.name

def getNetworkData(String url) {
    //发送http请求
    def connection = new URL(url).openConnection()
    connection.setRequestMethod('GET')
    connection.connect()
    def response = connection.content.text
    //将json转化为实体对象
    def jsonSluper = new JsonSlurper()
    return jsonSluper.parseText(response)
}


