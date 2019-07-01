import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val ktorVersion by extra("1.2.2")
val arrowVersion by extra("0.8.2")
val logbackVersion by extra("1.2.1")

plugins {
  kotlin("jvm") version "1.3.31"
}

group = "com.github.carlosmenezes"
version = "1.0-SNAPSHOT"

repositories {
  jcenter()
  mavenCentral()
}

dependencies {
  implementation(kotlin("stdlib-jdk8"))

  compile("io.ktor:ktor-server-core:$ktorVersion")
  compile("io.ktor:ktor-server-netty:$ktorVersion")
  compile("io.ktor:ktor-jackson:$ktorVersion")
  compile("com.ibasco.agql:agql-coc-webapi:0.1.7")
  compile("io.arrow-kt:arrow-core:$arrowVersion")

  compile("ch.qos.logback:logback-classic:$logbackVersion")

}

tasks.withType<KotlinCompile> {
  kotlinOptions.jvmTarget = "1.8"
}
