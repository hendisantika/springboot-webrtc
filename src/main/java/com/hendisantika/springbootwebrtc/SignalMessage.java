package com.hendisantika.springbootwebrtc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-webrtc
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 28/12/20
 * Time: 17.40
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignalMessage {
    private String type;
    private String sender;
    private String receiver;
    private Object data;
}
