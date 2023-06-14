package kotlin.dto

data class ChatGPTQuestionAnswerResponse(
    val id: String,
    val objectType: String,
    val created: Long,
    val model: String,
    val usage: Usage,
    val choices: List<Choice>
)

data class Choice(
    val messages: List<Message>,
    val finishReason: String,
    val index: Int
)

data class Usage(
    val promptToken: Int,
    val completionTokens: Int,
    val totalTokens: Int
)