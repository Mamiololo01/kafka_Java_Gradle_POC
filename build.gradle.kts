//import java.util.regex.Pattern.compile

//import com.sun.imageio.plugins.jpeg.JPEG.version

plugins {
    id("java")
    kotlin("jvm")
}

group = "kafka-demos-java"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
//    testImplementation("org:junit.Assert.assertEquals")
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation(kotlin("stdlib-jdk8"))
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:1.7.0")
    implementation("org.apache.kafka:kafka-clients:3.6.1")
    implementation("org.slf4j:slf4j-api:1.7.36")

}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}