package test

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
class ModuleAApplication

fun main(args: Array<String>) {
    runApplication<ModuleAApplication>(*args)
}