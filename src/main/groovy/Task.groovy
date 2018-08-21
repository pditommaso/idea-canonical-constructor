import groovy.transform.Canonical
import groovy.transform.CompileStatic

@Canonical
@CompileStatic
class Task {

    String message

    void doSomething() {
        println "RUNNING $message"
    }

}
