plugins {
	id("net.civmc.civgradle.plugin") version "1.0.0-SNAPSHOT"
}

subprojects {
	apply(plugin = "java-library")
	apply(plugin = "maven-publish")
	apply(plugin = "net.civmc.civgradle.plugin")

	repositories {
		mavenCentral()
		maven("https://repo.civmc.net/repository/maven-public")
		maven("https://repo.aikar.co/content/groups/aikar/")
		maven("https://libraries.minecraft.net")
		maven("https://repo.codemc.io/repository/maven-public/")
		maven {
			name = "GitHubPackages"
			url = uri("https://maven.pkg.github.com/CivMC/NameLayer")
			credentials {
				username = System.getenv("GITHUB_ACTOR")
				password = System.getenv("GITHUB_TOKEN")
			}
		}

		maven("https://jitpack.io")
	}
}
