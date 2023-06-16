package com.cicd.tester.entity;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class UserTest {


    @Test
    @DisplayName("user entity 생성 성공")
    void createEntity() {
        //given
        String testName = "inhyeok";
        String testEmail = "email@email.com";
        String testPwd = "pwdss..";

        //when
        User user = User.builder()
            .name(testName)
            .email(testEmail)
            .password(testPwd)
            .build();

        //then
        assertThat(user.getName()).isEqualTo(testName);
        assertThat(user.getEmail()).isEqualTo(testEmail);
        assertThat(user.getPassword()).isEqualTo(testPwd);
    }


}