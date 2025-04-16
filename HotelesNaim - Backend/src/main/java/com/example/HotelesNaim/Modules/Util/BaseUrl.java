package com.example.HotelesNaim.Modules.Util;

import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
public interface BaseUrl {
    default String getBaseUrl() {
        return ServletUriComponentsBuilder.fromCurrentContextPath().toUriString();
    }
}
