import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val ktorVersion by extra("1.2.2")
val arrowVersion by extra("0.9.0")

plugins {
  kotlin("jvm") version "1.3.31"
}

group = "com.github.carlosmenezes"
version = "1.0-SNAPSHOT"

repositories {
  mavenCentral()
}

dependencies {
  implementation(kotlin("stdlib-jdk8"))

  compile("io.ktor:ktor-server-core:$ktorVersion")
  compile("com.ibasco.agql:agql-coc-webapi:0.1.7")
  compile("io.arrow-kt:arrow-core:$arrowVersion")

}

tasks.withType<KotlinCompile> {
  kotlinOptions.jvmTarget = "1.8"
}
