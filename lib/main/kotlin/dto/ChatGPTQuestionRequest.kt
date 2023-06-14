package kotlin.dto

data class ChatGPTQuestionRequest(
    val model: String,
    val messages: List<Message>
)

data class Message(
    val role: String,
    val message: String
)
