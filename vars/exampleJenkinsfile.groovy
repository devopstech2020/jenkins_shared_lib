#!/usr/bin/env groovy

def call(Map config=[:]){
        node{
		stage("demo stage"){
			println "Hello World!"
		}
	}
}
