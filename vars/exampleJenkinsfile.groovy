#!/usr/bin/env groovy

def call(){
        node{
		stage("demo stage"){
			println "Hello World!"
		}
	}
}
