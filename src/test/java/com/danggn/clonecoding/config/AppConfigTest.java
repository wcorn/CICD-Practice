package com.danggn.clonecoding.config;

import com.danggn.clonecoding.global.config.JasyptConfig;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AppConfigTest extends JasyptConfig {

    @Test
    public void jasypt_encrypt_decrypt_test() {
        String plainText = "jdbc:mysql://peter.chd0zpcvgayq.ap-northeast-2.rds.amazonaws.com/test?serverTimeZone=Asia/Seoul&useLegacyDatetimeCode=false";

        StandardPBEStringEncryptor jasypt = new StandardPBEStringEncryptor();
        jasypt.setPassword("4-BMYJyUU^zsx8");

        String encryptedText = jasypt.encrypt(plainText);
        String decryptedText = jasypt.decrypt(encryptedText);

        System.out.println(encryptedText);
        System.out.println(decryptedText);
        assertThat(plainText).isEqualTo(decryptedText);
    }
}