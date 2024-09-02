package com.example.springcloudgithubdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Configuration

@EnableConfigurationProperties(DemoProperties::class)
@SpringBootApplication
class SpringCloudGithubDemoApplication

fun main(args: Array<String>) {
	runApplication<SpringCloudGithubDemoApplication>(*args)
}

@Configuration
class PropTestConfiguration(
	private val demoProperties: DemoProperties
){
	init {
	    println(demoProperties.myMessage)
	}
}

@ConfigurationProperties("props")
data class DemoProperties(
	val myMessage: String
)
