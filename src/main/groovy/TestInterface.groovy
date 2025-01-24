import org.springframework.messaging.Message

interface TestInterface {
    void send(Message message)
}