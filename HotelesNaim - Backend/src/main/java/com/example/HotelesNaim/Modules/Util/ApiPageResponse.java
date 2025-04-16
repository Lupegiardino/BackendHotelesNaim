package com.example.HotelesNaim.Modules.Util;

public record ApiPageResponse<T>(int totalPages, int totalElements, T data, String message) {
}
