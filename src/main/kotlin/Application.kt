import com.fasterxml.jackson.databind.SerializationFeature
import io.ktor.application.Application
import io.ktor.application.install
import io.ktor.features.CallLogging
import io.ktor.features.ContentNegotiation
import io.ktor.jackson.jackson
import io.ktor.request.path
import io.ktor.routing.routing
import io.ktor.server.netty.EngineMain
import org.slf4j.event.Level

fun main(args: Array<String>): Unit = EngineMain.main(args)

@JvmOverloads
fun Application.module(testing: Boolean = false) {

    install(ContentNegotiation) {
        jackson {
            enable(SerializationFeature.INDENT_OUTPUT)
        }
    }

    install(CallLogging) {
        level = Level.INFO
        filter { call -> call.request.path().startsWith("/") }
    }

    routing {
    }
}
