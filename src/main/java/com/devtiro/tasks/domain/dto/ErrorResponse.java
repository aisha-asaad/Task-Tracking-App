package com.devtiro.tasks.domain.dto;

public record ErrorResponse(
        int status, // كود الـ HTTP
        String message, // رسالة الخطأ
        String details) {
}
