plugins {
    id("application")
    id("org.openjfx.javafxplugin") version "0.1.0"
}

group = "org.cupid404"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    //JSON processing
    implementation("com.fasterxml.jackson.core:jackson-databind:2.20.0-rc1")
    //Robus logging
    implementation("org.apache.logging.log4j:log4j-core:2.25.1")
}
javafx {
    version = "24.0.2"
    modules("javafx.controls", "javafx.fxml")
}

tasks.test {
    useJUnitPlatform()
}

application {
    mainClass.set("org.cupid404.Main")
}