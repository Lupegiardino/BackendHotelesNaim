package com.example.HotelesNaim.Modules.Util;

public record DashboardResponse(
        int totalUsers,
        int totalStays,
        int totalFeatures,
        int totalCategories,
        int totalReservations
) {
}
