package com.williamla;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Encrypting session
        System.out.print("Enter your text: ");
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        System.out.print("Enter a random key to begin encryption? ");
        int key = in.nextInt();
        CaesarCipher cipher = new CaesarCipher();
        cipher.changeKey(key);
        String encrypted_text = cipher.encrypt(text).toString();
        System.out.println("Encrypted result: " + encrypted_text);

        //Decrypting session
        String decrypted_text = cipher.decrypt(encrypted_text, key).toString();
        System.out.println("Decrypted result: " + decrypted_text);
    }
}
