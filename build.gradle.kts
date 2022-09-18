
plugins {
    java
    kotlin("jvm") version "1.6.21" apply false
}

group = "org.example"
version = "1.0-SNAPSHOT"

apply {
    plugin("kotlin")
}
tasks.withType(JavaCompile::class.java){
    options.encoding = "UTF-8"
}
tasks.jar{
    destinationDir = File("C:\\Users\\3doll\\OneDrive\\바탕 화면\\1.19.2-paper\\plugins")
}
repositories {
    mavenCentral()
    mavenLocal()
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    implementation("io.papermc.paper:paper-api:1.19.2-R0.1-SNAPSHOT")
    implementation("org.spigotmc:spigot:1.19.2-R0.1-SNAPSHOT")

}