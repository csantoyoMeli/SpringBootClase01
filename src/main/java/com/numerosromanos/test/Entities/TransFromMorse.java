package com.numerosromanos.test.Entities;

import lombok.Data;

@Data
public class TransFromMorse {
    private String messageText;

    public TransFromMorse(String messageText) {
        this.messageText = morseToText(messageText);
    }

    private String morseToText(String message) {
        String letters = "abcdefghijklmnopqrstuvwxyz 0123456789.,?!()[]&:;=+-_$@";
        String code[] = new String[60];
        String morse = " ";
        String normalizedMessage = message.replace("   ", " / ");

        code[0] = ".-"; //a
        code[1] = "-...";//b
        code[2] = "-.-.";//c
        code[3] = "-..";//d
        code[4] = ".";//e
        code[5] = "..-.";//f
        code[6] = "--.";//g
        code[7] = "....";//h
        code[8] = "..";//i
        code[9] = ".---";//j
        code[10] = "-.-";//k
        code[11] = ".-..";//l
        code[12] = "--";//m
        code[13] = "-.";//n
        code[14] = "---";//o
        code[15] = ".--.";//p
        code[16] = "--.-";//q
        code[17] = ".-.";//r
        code[18] = "...";//s
        code[19] = "-";//t
        code[20] = "..-";//u
        code[21] = "...-";//v
        code[22] = ".--";//w
        code[23] = "-..-";//x
        code[24] = "-.--";//y
        code[25] = "--..";//z
        code[26] = "/";//espacio
        code[27] = "-----";//0
        code[28] = ".----";//1
        code[29] = "..---";//2
        code[30] = "...--";//3
        code[31] = "....-";//4
        code[32] = ".....";//5
        code[33] = "-....";//6
        code[34] = "--...";//7
        code[35] = "---..";//8
        code[36] = "----.";//9
        code[37] = ".-.-.-";//.
        code[38] = "--..--";//,
        code[39] = "..--..";//?
        code[40] = ".-.-..";//!
        code[41] = "-.--.";//(
        code[42] = "-.--.-";//)
        code[43] = "-.--.";//[
        code[44] = "-.--.-";//]
        code[45] = ".-...";//&
        code[46] = "---...";//:
        code[47] = "-.-.-.";//;
        code[48] = "-...-";//=
        code[49] = ".-.-.";//+
        code[50] = "-....-";//-
        code[51] = "..--.-";//_
        code[52] = "...-..-";//$
        code[53] = ".--.-.";//@

        String sentence[] = normalizedMessage.split(" ");
        int max = sentence.length;

        for (int i = 0; i < max; i++) {
            for (int j = 0; j < 60; j++) {
                if (sentence[i].equals(code[j])) {
                    morse += letters.charAt(j);
                    break;
                }
            }
        }
        return morse = morse.substring(1, morse.length()); //quita el espacio que se genera de mas
    }
}
