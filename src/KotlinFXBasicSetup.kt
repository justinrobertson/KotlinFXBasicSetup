import javafx.application.Application
import javafx.event.Event
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.layout.StackPane
import javafx.stage.Stage

/*
 * To recreate this project: New Kotlin project. Add Kotlin file/class. Copy and paste.
 */

class KotlinFX : Application() {

    override fun start(stage: Stage) {
        val root = StackPane()
        val btn = Button("Click me")
        btn.setOnAction { e -> handle(e) }
        root.children.add(btn)
        val scene = Scene(root, 400.0, 400.0, true)
        stage.scene = scene
        stage.show()
    }

    fun handle(e: Event) {
        println(e)
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            launch(KotlinFX::class.java)
        }
    }
}