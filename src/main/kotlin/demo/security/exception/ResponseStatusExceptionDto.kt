package demo.security.exception

data class ResponseStatusExceptionDto(
    val error: String,
    val path: String,
    val message: String,
    val status: Int,
    val timestamp: String
)