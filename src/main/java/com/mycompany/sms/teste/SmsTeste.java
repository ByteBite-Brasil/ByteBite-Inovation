/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.sms.teste;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

/**
 *
 * @author LucasSilvaMartines
 */
public class SmsTeste {

    public static final String ACCOUNT_SID = "AC5e7b5e7f979340aae93c8ba952eccbbc";
    public static final String AUTH_TOKEN = "c171eb48dd1e4709e2c84a8399b5d75b";

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        try {
            Message message = Message
                    .creator(
                            new PhoneNumber("+5511996402257"),
                            new PhoneNumber("+16202930474"),
                            "A INOVAÇÃO TÁ PRONTA"
                    )
                    .create();
         System.out.println(message.getSid());   
        }catch(Exception e){
            System.out.println(e);
        }

        
    }

}
